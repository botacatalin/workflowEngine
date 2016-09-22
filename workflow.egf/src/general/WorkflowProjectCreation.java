package general;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import workflow.WorkflowFactory;

public class WorkflowProjectCreation implements ITaskProduction {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String FILE_EXTENSION = "workflow";

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		log.info("[ " + LocalDateTime.now() + " ] Worflow project creation started.");

		// get contract parameter value
		String projectName = productionContext.getInputValue("projectName", String.class).toString();
		createProject(projectName);

	}

	private void createProject(String projectName) {

		try {
			IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(projectName, true,
					new NullProgressMonitor());

			createResourceFile(projectName, project);

		} catch (CoreException e) {
			log.info("[ " + LocalDateTime.now() + " ] Cannot create modeling project.");
			e.printStackTrace();
		}

	}

	private void createResourceFile(String projectName, IProject project) {

		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createPlatformResourceURI("/" + projectName + "/" + projectName + "." + FILE_EXTENSION, true);
		Resource resource = resourceSet.createResource(fileURI);
		EObject rootObject = WorkflowFactory.eINSTANCE.createWorkflow();
		resource.getContents().add(rootObject);
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		try {
			resource.save(options);
		} catch (IOException e) {
			log.info("[ " + LocalDateTime.now() + " ] Cannot create resource.");
			e.printStackTrace();
		}

		Session session = addResourceToSiriusSession(project, fileURI);
		addViewpoointToProject(session);
		createWorkflowRepresentation(session, projectName, true);

		//save session and refresh workspace
		session.save(new NullProgressMonitor());
		// refresh workspace
		refreshWorkspace(project);
	}

	private void refreshWorkspace(IProject project) {
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			log.info("[ " + LocalDateTime.now() + " ] Done refreshing workspace.");
		} catch (CoreException e) {
			log.info("[ " + LocalDateTime.now() + " ] Cannot refresh workspace.");
			e.printStackTrace();
		}
	}

	private void addViewpoointToProject(Session session) {
		// find available viewpoints and add viewpoint

		Set<Viewpoint> availableViewpoints = ViewpointSelection.getViewpoints(FILE_EXTENSION);
		if (availableViewpoints.isEmpty())
			try {
				log.info("[ " + LocalDateTime.now() + " ] Could not found viewport for file extension "
						+ FILE_EXTENSION);
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		log.info("[ " + LocalDateTime.now() + " ] Add workflow viewpoint to project.");
		Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
		for (Viewpoint p : availableViewpoints)
			viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, p));

		// ** execute a command using the transactional editing domain
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					protected void doExecute() {
						ViewpointSelectionCallback callback = new ViewpointSelectionCallback();

						for (Viewpoint vpToActivate : viewpoints) {
							Viewpoint vp = SiriusResourceHelper.getCorrespondingViewpoint(session, vpToActivate);
							callback.selectViewpoint(vp, session, new NullProgressMonitor());
						}

					}
				});

		// ViewpointSelection.Callback callback = new
		// ViewpointSelectionCallbackWithConfimation();
		//
		// @SuppressWarnings("restriction")
		// RecordingCommand command = new ChangeViewpointSelectionCommand(
		// session,
		// callback,
		// viewpoints, new HashSet<Viewpoint>(), true, new
		// NullProgressMonitor());
		// TransactionalEditingDomain domain =
		// session.getTransactionalEditingDomain();
		// domain.getCommandStack().execute(command);

		// rootObject =
		// session.getSemanticResources().iterator().next().getContents().get(0);
	}

	private Session addResourceToSiriusSession(IProject project, URI fileURI) {
		// check aird viewpoint file and return session
		IFile airdFile = project.getFile("representations.aird");
		try {
			if (!airdFile.exists()) {
				log.info("[ " + LocalDateTime.now() + " ] Could not found file:" + airdFile.getLocationURI());
				throw new Exception();
			}
		} catch (Exception e) {
		}
		URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
		Session session = SessionManager.INSTANCE.getSession(airdFileURI, new NullProgressMonitor());
		log.info("[ " + LocalDateTime.now() + " ] Adding resource to Sirius session.");
		// adding the resource also to Sirius session
		AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(session, fileURI,
				new NullProgressMonitor());
		session.getTransactionalEditingDomain().getCommandStack().execute(addCommandToSession);
		session.save(new NullProgressMonitor());
		return session;
	}

	private void createWorkflowRepresentation(Session session, String projectName, boolean openDiagram) {

		EObject rootObject = session.getSemanticResources().iterator().next().getContents().get(0);
		// create representation
		Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), rootObject);
		if (descriptions.isEmpty())
			try {
				throw new Exception("Could not found representation description for object: " + rootObject);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		log.info("[ " + LocalDateTime.now() + " ] Create diagram representation.");
		RepresentationDescription description = descriptions.iterator().next();

		Command createViewCommand = new CreateRepresentationCommand(session, description, rootObject, projectName,
				new NullProgressMonitor());

		session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);

		SessionManager.INSTANCE.notifyRepresentationCreated(session);

		if (openDiagram) {
			// open editor
			DialectManager viewpointDialectManager = DialectManager.INSTANCE;
			Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(description,
					session);
			DRepresentation myDiagramRepresentation = representations.iterator().next();

			DialectUIManager dialectUIManager = DialectUIManager.INSTANCE;

			dialectUIManager.openEditor(session, myDiagramRepresentation, new NullProgressMonitor());
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

}
