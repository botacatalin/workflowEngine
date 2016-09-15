/**
 * Generated with Acceleo
 */
package workflow.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import workflow.parts.InputParameterPropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;

import workflow.providers.WorkflowMessages;

// End of user code

/**
 * 
 * 
 */
public class InputParameterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InputParameterPropertiesEditionPart {

	protected Text option;
	protected Text data;
	protected EObjectFlatComboViewer link_to_outputparameter;



	/**
	 * For {@link ISection} use only.
	 */
	public InputParameterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputParameterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence inputParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputParameterStep.addStep(WorkflowViewsRepository.InputParameter.Properties.class);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.option);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.data);
		propertiesStep.addStep(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter);
		
		
		composer = new PartComposer(inputParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == WorkflowViewsRepository.InputParameter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.option) {
					return createOptionText(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.data) {
					return createDataText(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter) {
					return createLink_to_outputparameterFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(WorkflowMessages.InputParameterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createOptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.option, WorkflowMessages.InputParameterPropertiesEditionPart_OptionLabel);
		option = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		option.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData optionData = new GridData(GridData.FILL_HORIZONTAL);
		option.setLayoutData(optionData);
		option.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InputParameterPropertiesEditionPartForm.this,
							WorkflowViewsRepository.InputParameter.Properties.option,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, option.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InputParameterPropertiesEditionPartForm.this,
									WorkflowViewsRepository.InputParameter.Properties.option,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, option.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InputParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		option.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartForm.this, WorkflowViewsRepository.InputParameter.Properties.option, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, option.getText()));
				}
			}
		});
		EditingUtils.setID(option, WorkflowViewsRepository.InputParameter.Properties.option);
		EditingUtils.setEEFtype(option, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.option, WorkflowViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOptionText

		// End of user code
		return parent;
	}

	
	protected Composite createDataText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.data, WorkflowMessages.InputParameterPropertiesEditionPart_DataLabel);
		data = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		data.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dataData = new GridData(GridData.FILL_HORIZONTAL);
		data.setLayoutData(dataData);
		data.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InputParameterPropertiesEditionPartForm.this,
							WorkflowViewsRepository.InputParameter.Properties.data,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, data.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InputParameterPropertiesEditionPartForm.this,
									WorkflowViewsRepository.InputParameter.Properties.data,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, data.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InputParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		data.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartForm.this, WorkflowViewsRepository.InputParameter.Properties.data, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, data.getText()));
				}
			}
		});
		EditingUtils.setID(data, WorkflowViewsRepository.InputParameter.Properties.data);
		EditingUtils.setEEFtype(data, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.data, WorkflowViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDataText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLink_to_outputparameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowMessages.InputParameterPropertiesEditionPart_Link_to_outputparameterLabel);
		link_to_outputparameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowViewsRepository.FORM_KIND));
		widgetFactory.adapt(link_to_outputparameter);
		link_to_outputparameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData link_to_outputparameterData = new GridData(GridData.FILL_HORIZONTAL);
		link_to_outputparameter.setLayoutData(link_to_outputparameterData);
		link_to_outputparameter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputParameterPropertiesEditionPartForm.this, WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLink_to_outputparameter()));
			}

		});
		link_to_outputparameter.setID(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.InputParameter.Properties.link_to_outputparameter, WorkflowViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
