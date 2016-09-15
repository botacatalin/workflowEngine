/**
 * Generated with Acceleo
 */
package workflow.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import workflow.parts.InputParameterPropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;

import workflow.providers.WorkflowMessages;

// End of user code

/**
 * 
 * 
 */
public class InputParameterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InputParameterPropertiesEditionPart {

	protected Text option;
	protected Text data;
	protected EObjectFlatComboViewer link_to_outputparameter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputParameterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence inputParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputParameterStep.addStep(WorkflowViewsRepository.InputParameter.Properties.class);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.option);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.data);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter);
		
		
		composer = new PartComposer(inputParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == WorkflowViewsRepository.InputParameter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.option) {
					return createOptionText(parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.data) {
					return createDataText(parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter) {
					return createLink_to_outputparameterFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(WorkflowMessages.InputParameterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createOptionText(Composite parent) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.option, WorkflowMessages.InputParameterPropertiesEditionPart_OptionLabel);
		option = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData optionData = new GridData(GridData.FILL_HORIZONTAL);
		option.setLayoutData(optionData);
		option.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartImpl.this, WorkflowViewsRepository.InputParameter.Properties.option, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, option.getText()));
			}

		});
		option.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartImpl.this, WorkflowViewsRepository.InputParameter.Properties.option, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, option.getText()));
				}
			}

		});
		EditingUtils.setID(option, WorkflowViewsRepository.InputParameter.Properties.option);
		EditingUtils.setEEFtype(option, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.option, WorkflowViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOptionText

		// End of user code
		return parent;
	}

	
	protected Composite createDataText(Composite parent) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.data, WorkflowMessages.InputParameterPropertiesEditionPart_DataLabel);
		data = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData dataData = new GridData(GridData.FILL_HORIZONTAL);
		data.setLayoutData(dataData);
		data.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartImpl.this, WorkflowViewsRepository.InputParameter.Properties.data, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, data.getText()));
			}

		});
		data.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartImpl.this, WorkflowViewsRepository.InputParameter.Properties.data, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, data.getText()));
				}
			}

		});
		EditingUtils.setID(data, WorkflowViewsRepository.InputParameter.Properties.data);
		EditingUtils.setEEFtype(data, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.data, WorkflowViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDataText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLink_to_outputparameterFlatComboViewer(Composite parent) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowMessages.InputParameterPropertiesEditionPart_Link_to_outputparameterLabel);
		link_to_outputparameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowViewsRepository.SWT_KIND));
		link_to_outputparameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		link_to_outputparameter.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartImpl.this, WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLink_to_outputparameter()));
			}

		});
		GridData link_to_outputparameterData = new GridData(GridData.FILL_HORIZONTAL);
		link_to_outputparameter.setLayoutData(link_to_outputparameterData);
		link_to_outputparameter.setID(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLink_to_outputparameterFlatComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EReferencesViewer#getInputParameter()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getInputParameter() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EReferencesViewer#getInputParameter()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getInputParameter() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EReferencesViewer#getInputParameter()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getInputParameter() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setInputParameter(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return WorkflowMessages.InputParameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
