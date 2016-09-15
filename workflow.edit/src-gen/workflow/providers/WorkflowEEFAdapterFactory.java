/**
 * Generated with Acceleo
 */
package workflow.providers;

import org.eclipse.emf.common.notify.Adapter;

import workflow.util.WorkflowAdapterFactory;

/**
 * 
 * 
 */
public class WorkflowEEFAdapterFactory extends WorkflowAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createWorkflowAdapter()
	 * 
	 */
	public Adapter createWorkflowAdapter() {
		return new WorkflowPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createRecipeAdapter()
	 * 
	 */
	public Adapter createRecipeAdapter() {
		return new RecipePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createConditionAdapter()
	 * 
	 */
	public Adapter createConditionAdapter() {
		return new ConditionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createProgramAdapter()
	 * 
	 */
	public Adapter createProgramAdapter() {
		return new ProgramPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createSimpleCommandAdapter()
	 * 
	 */
	public Adapter createSimpleCommandAdapter() {
		return new SimpleCommandPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createInputParameterAdapter()
	 * 
	 */
	public Adapter createInputParameterAdapter() {
		return new InputParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .workflow.util.WorkflowAdapterFactory#createOutputParameterAdapter()
	 * 
	 */
	public Adapter createOutputParameterAdapter() {
		return new OutputParameterPropertiesEditionProvider();
	}

}
