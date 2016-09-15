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

import workflow.parts.RecipePropertiesEditionPart;
import workflow.parts.WorkflowViewsRepository;

import workflow.providers.WorkflowMessages;

// End of user code

/**
 * 
 * 
 */
public class RecipePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RecipePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable commands;
	protected List<ViewerFilter> commandsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commandsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public RecipePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RecipePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence recipeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = recipeStep.addStep(WorkflowViewsRepository.Recipe.Properties.class);
		propertiesStep.addStep(WorkflowViewsRepository.Recipe.Properties.name);
		propertiesStep.addStep(WorkflowViewsRepository.Recipe.Properties.commands);
		
		
		composer = new PartComposer(recipeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == WorkflowViewsRepository.Recipe.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.Recipe.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == WorkflowViewsRepository.Recipe.Properties.commands) {
					return createCommandsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(WorkflowMessages.RecipePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, WorkflowViewsRepository.Recipe.Properties.name, WorkflowMessages.RecipePropertiesEditionPart_NameLabel);
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
							RecipePropertiesEditionPartForm.this,
							WorkflowViewsRepository.Recipe.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RecipePropertiesEditionPartForm.this,
									WorkflowViewsRepository.Recipe.Properties.name,
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
									RecipePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, WorkflowViewsRepository.Recipe.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.Recipe.Properties.name, WorkflowViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCommandsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.commands = new ReferencesTable(getDescription(WorkflowViewsRepository.Recipe.Properties.commands, WorkflowMessages.RecipePropertiesEditionPart_CommandsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				commands.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				commands.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				commands.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				commands.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.commandsFilters) {
			this.commands.addFilter(filter);
		}
		this.commands.setHelpText(propertiesEditionComponent.getHelpContent(WorkflowViewsRepository.Recipe.Properties.commands, WorkflowViewsRepository.FORM_KIND));
		this.commands.createControls(parent, widgetFactory);
		this.commands.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RecipePropertiesEditionPartForm.this, WorkflowViewsRepository.Recipe.Properties.commands, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commandsData = new GridData(GridData.FILL_HORIZONTAL);
		commandsData.horizontalSpan = 3;
		this.commands.setLayoutData(commandsData);
		this.commands.setLowerBound(invalid);
		this.commands.setUpperBound(invalid);
		commands.setID(WorkflowViewsRepository.Recipe.Properties.commands);
		commands.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCommandsTableComposition

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
	 * @see EReferencesViewer#getRecipe()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getRecipe() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setRecipe(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setRecipe(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EReferencesViewer#getRecipe()
	 * 
	 */
	public //FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid getRecipe() {
		//FIXME ERROR NO VALID CASE INTO template public getterSignatureImplementation(elementEditor : ElementEditor) in viewgetterSetters.mtl module
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see EMFComboViewer#setRecipe(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue)
	 * 
	 */
	public void setRecipe(//FIXME ERROR INVALID CASE INTO template public toJavaType(view : ViewElement) in common.mtl module for representation invalid newValue) {
		// FIXME ERROR NO VALID CASE INTO template public setterSignatureImplementation(elementEditor : ElementEditor) in widgetGettersSetters.mtl module
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return WorkflowMessages.Recipe_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
