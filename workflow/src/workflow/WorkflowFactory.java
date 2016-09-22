/**
 */
package workflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public interface WorkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowFactory eINSTANCE = workflow.impl.WorkflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe</em>'.
	 * @generated
	 */
	Recipe createRecipe();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Simple Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Command</em>'.
	 * @generated
	 */
	SimpleCommand createSimpleCommand();

	/**
	 * Returns a new object of class '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter</em>'.
	 * @generated
	 */
	InputParameter createInputParameter();

	/**
	 * Returns a new object of class '<em>Output Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Parameter</em>'.
	 * @generated
	 */
	OutputParameter createOutputParameter();

	/**
	 * Returns a new object of class '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each</em>'.
	 * @generated
	 */
	ForEach createForEach();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowPackage getWorkflowPackage();

} //WorkflowFactory
