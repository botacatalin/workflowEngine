/**
 * Generated with Acceleo
 */
package workflow.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

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

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import workflow.parts.WorkflowPropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;

import workflow.providers.WorkflowMessages;

// End of user code

/**
 * 
 * 
 */
public class WorkflowPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, WorkflowPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable recipes;
	protected List<ViewerFilter> recipesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> recipesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public WorkflowPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WorkflowPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence workflow_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = workflow_Step.addStep(WorkflowViewsRepository.Workflow_.Properties.class);
		propertiesStep.addStep(WorkflowViewsRepository.Workflow_.Properties.name);
		propertiesStep.addStep(WorkflowViewsRepository.Workflow_.Properties.recipes);
		
		
		composer = new PartComposer(workflow_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == WorkflowViewsRepository.Workflow_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.Workflow_.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.Workflow_.Properties.recipes) {
					return createRecipesTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(WorkflowMessages.WorkflowPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, WorkflowViewsRepository.Workflow_.Properties.name, WorkflowMessages.WorkflowPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							WorkflowPropertiesEditionPartForm.this,
							WorkflowViewsRepository.Workflow_.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									WorkflowPropertiesEditionPartForm.this,
									WorkflowViewsRepository.Workflow_.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									WorkflowPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, WorkflowViewsRepository.Workflow_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.Workflow_.Properties.name, WorkflowViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRecipesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.recipes = new ReferencesTable(getDescription(WorkflowViewsRepository.Workflow_.Properties.recipes, WorkflowMessages.WorkflowPropertiesEditionPart_RecipesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.recipes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				recipes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.recipes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				recipes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.recipes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				recipes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.recipes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				recipes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.recipesFilters) {
			this.recipes.addFilter(filter);
		}
		this.recipes.setHelpText(propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.Workflow_.Properties.recipes, WorkflowViewsRepository.FORM_KIND));
		this.recipes.createControls(parent, widgetFactory);
		this.recipes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WorkflowPropertiesEditionPartForm.this, WorkflowViewsRepository.Workflow_.Properties.recipes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData recipesData = new GridData(GridData.FILL_HORIZONTAL);
		recipesData.horizontalSpan = 3;
		this.recipes.setLayoutData(recipesData);
		this.recipes.setLowerBound(invalid);
		this.recipes.setUpperBound(invalid);
		recipes.setID(WorkflowViewsRepository.Workflow_.Properties.recipes);
		recipes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRecipesTableComposition

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
	 * @see EReferencesViewer#getWorkflow()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getWorkflow() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setWorkflow(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setWorkflow(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EReferencesViewer#getWorkflow()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getWorkflow() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setWorkflow(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setWorkflow(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return WorkflowMessages.Workflow_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
