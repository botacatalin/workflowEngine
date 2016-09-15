/**
 * Generated with Acceleo
 */
package workflow.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import workflow.Program;
import workflow.WorkflowPackage;

import workflow.parts.ProgramPropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ProgramPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for invalid ReferencesTable
	 */
	protected ReferencesTableSettings Settings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProgramPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject program, String editing_mode) {
		super(editingContext, program, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = WorkflowViewsRepository.class;
		partKey = WorkflowViewsRepository.Program.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Program program = (Program)elt;
			final ProgramPropertiesEditionPart basePart = (ProgramPropertiesEditionPart)editingPart;
			// init values
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// init filters
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == WorkflowViewsRepository.Program.Properties.parameters) {
			return WorkflowPackage.eINSTANCE.getProgram_Parameters();
		}
		if (editorKey == WorkflowViewsRepository.Program.Properties.name_exec) {
			return WorkflowPackage.eINSTANCE.getProgram_Name_exec();
		}
		if (editorKey == WorkflowViewsRepository.Program.Properties.description) {
			return WorkflowPackage.eINSTANCE.getProgram_Description();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Program program = (Program)semanticObject;
		if (WorkflowViewsRepository.Program.Properties.parameters == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, Program, Program.
		}
		if (WorkflowViewsRepository.Program.Properties.name_exec == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, invalid, Program.
		}
		if (WorkflowViewsRepository.Program.Properties.description == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, invalid, Program.
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ProgramPropertiesEditionPart basePart = (ProgramPropertiesEditionPart)editingPart;
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, Program, Program.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, Program.
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			WorkflowPackage.eINSTANCE.getProgram_Parameters(),
			WorkflowPackage.eINSTANCE.getProgram_Name_exec(),
			WorkflowPackage.eINSTANCE.getProgram_Description()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (WorkflowViewsRepository.Program.Properties.name_exec == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorkflowPackage.eINSTANCE.getProgram_Name_exec().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorkflowPackage.eINSTANCE.getProgram_Name_exec().getEAttributeType(), newValue);
				}
				if (WorkflowViewsRepository.Program.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorkflowPackage.eINSTANCE.getProgram_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorkflowPackage.eINSTANCE.getProgram_Description().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
