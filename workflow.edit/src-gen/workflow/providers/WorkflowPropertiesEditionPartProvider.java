/**
 * Generated with Acceleo
 */
package workflow.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import workflow.parts.WorkflowViewsRepository;

import workflow.parts.forms.ConditionPropertiesEditionPartForm;
import workflow.parts.forms.InputParameterPropertiesEditionPartForm;
import workflow.parts.forms.OutputParameterPropertiesEditionPartForm;
import workflow.parts.forms.ProgramPropertiesEditionPartForm;
import workflow.parts.forms.RecipePropertiesEditionPartForm;
import workflow.parts.forms.SimpleCommandPropertiesEditionPartForm;
import workflow.parts.forms.WorkflowPropertiesEditionPartForm;

import workflow.parts.impl.ConditionPropertiesEditionPartImpl;
import workflow.parts.impl.InputParameterPropertiesEditionPartImpl;
import workflow.parts.impl.OutputParameterPropertiesEditionPartImpl;
import workflow.parts.impl.ProgramPropertiesEditionPartImpl;
import workflow.parts.impl.RecipePropertiesEditionPartImpl;
import workflow.parts.impl.SimpleCommandPropertiesEditionPartImpl;
import workflow.parts.impl.WorkflowPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class WorkflowPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == WorkflowViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == WorkflowViewsRepository.Workflow_.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new WorkflowPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new WorkflowPropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.Recipe.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new RecipePropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new RecipePropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.Condition.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new ConditionPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new ConditionPropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.Program.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new ProgramPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new ProgramPropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.SimpleCommand.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new SimpleCommandPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new SimpleCommandPropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.InputParameter.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new InputParameterPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new InputParameterPropertiesEditionPartForm(component);
		}
		if (key == WorkflowViewsRepository.OutputParameter.class) {
			if (kind == WorkflowViewsRepository.SWT_KIND)
				return new OutputParameterPropertiesEditionPartImpl(component);
			if (kind == WorkflowViewsRepository.FORM_KIND)
				return new OutputParameterPropertiesEditionPartForm(component);
		}
		return null;
	}

}
