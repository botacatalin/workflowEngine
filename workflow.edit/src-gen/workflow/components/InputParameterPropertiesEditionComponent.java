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

import workflow.InputParameter;
import workflow.WorkflowPackage;

import workflow.parts.InputParameterPropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class InputParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public InputParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject inputParameter, String editing_mode) {
		super(editingContext, inputParameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = WorkflowViewsRepository.class;
		partKey = WorkflowViewsRepository.InputParameter.class;
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
			
			final InputParameter inputParameter = (InputParameter)elt;
			final InputParameterPropertiesEditionPart basePart = (InputParameterPropertiesEditionPart)editingPart;
			// init values
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// init filters
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
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
		if (editorKey == WorkflowViewsRepository.InputParameter.Properties.option) {
			return WorkflowPackage.eINSTANCE.getParameter_Option();
		}
		if (editorKey == WorkflowViewsRepository.InputParameter.Properties.data) {
			return WorkflowPackage.eINSTANCE.getParameter_Data();
		}
		if (editorKey == WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter) {
			return WorkflowPackage.eINSTANCE.getInputParameter_Link_to_outputparameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InputParameter inputParameter = (InputParameter)semanticObject;
		if (WorkflowViewsRepository.InputParameter.Properties.option == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, invalid, InputParameter.
		}
		if (WorkflowViewsRepository.InputParameter.Properties.data == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, invalid, InputParameter.
		}
		if (WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : invalid, InputParameter, InputParameter.
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			InputParameterPropertiesEditionPart basePart = (InputParameterPropertiesEditionPart)editingPart;
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, invalid, InputParameter.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : invalid, InputParameter, InputParameter.
			
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
			WorkflowPackage.eINSTANCE.getParameter_Option(),
			WorkflowPackage.eINSTANCE.getParameter_Data(),
			WorkflowPackage.eINSTANCE.getInputParameter_Link_to_outputparameter()		);
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
				if (WorkflowViewsRepository.InputParameter.Properties.option == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorkflowPackage.eINSTANCE.getParameter_Option().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorkflowPackage.eINSTANCE.getParameter_Option().getEAttributeType(), newValue);
				}
				if (WorkflowViewsRepository.InputParameter.Properties.data == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorkflowPackage.eINSTANCE.getParameter_Data().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorkflowPackage.eINSTANCE.getParameter_Data().getEAttributeType(), newValue);
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
