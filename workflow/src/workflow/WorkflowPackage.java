/**
 */
package workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.WorkflowImpl
	 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__RECIPE = 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RecipeImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__LANG = 2;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.BaseCommandImpl <em>Base Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.BaseCommandImpl
	 * @see workflow.impl.WorkflowPackageImpl#getBaseCommand()
	 * @generated
	 */
	int BASE_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Base Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CommandImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROGRAM = BASE_COMMAND__PROGRAM;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETER = BASE_COMMAND__PARAMETER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = BASE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No of exec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NO_OF_EXEC = BASE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__RETURN_STATUS = BASE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = BASE_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = BASE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ParameterImpl
	 * @see workflow.impl.WorkflowPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipe</em>'.
	 * @see workflow.Workflow#getRecipe()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Recipe();

	/**
	 * Returns the meta object for class '{@link workflow.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see workflow.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Recipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Recipe#getName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Recipe#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see workflow.Recipe#getCommand()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Command();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Recipe#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see workflow.Recipe#getLang()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Lang();

	/**
	 * Returns the meta object for class '{@link workflow.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see workflow.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Command#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workflow.Command#getDescription()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Description();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Command#getNo_of_exec <em>No of exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No of exec</em>'.
	 * @see workflow.Command#getNo_of_exec()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_No_of_exec();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Command#isReturn_status <em>Return status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return status</em>'.
	 * @see workflow.Command#isReturn_status()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Return_status();

	/**
	 * Returns the meta object for class '{@link workflow.BaseCommand <em>Base Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Command</em>'.
	 * @see workflow.BaseCommand
	 * @generated
	 */
	EClass getBaseCommand();

	/**
	 * Returns the meta object for the attribute '{@link workflow.BaseCommand#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see workflow.BaseCommand#getProgram()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EAttribute getBaseCommand_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.BaseCommand#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see workflow.BaseCommand#getParameter()
	 * @see #getBaseCommand()
	 * @generated
	 */
	EReference getBaseCommand_Parameter();

	/**
	 * Returns the meta object for class '{@link workflow.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see workflow.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Parameter#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see workflow.Parameter#getOption()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Option();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Parameter#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see workflow.Parameter#getData()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.WorkflowImpl
		 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__RECIPE = eINSTANCE.getWorkflow_Recipe();

		/**
		 * The meta object literal for the '{@link workflow.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RecipeImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__COMMAND = eINSTANCE.getRecipe_Command();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__LANG = eINSTANCE.getRecipe_Lang();

		/**
		 * The meta object literal for the '{@link workflow.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CommandImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
		 * The meta object literal for the '<em><b>No of exec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NO_OF_EXEC = eINSTANCE.getCommand_No_of_exec();

		/**
		 * The meta object literal for the '<em><b>Return status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__RETURN_STATUS = eINSTANCE.getCommand_Return_status();

		/**
		 * The meta object literal for the '{@link workflow.impl.BaseCommandImpl <em>Base Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.BaseCommandImpl
		 * @see workflow.impl.WorkflowPackageImpl#getBaseCommand()
		 * @generated
		 */
		EClass BASE_COMMAND = eINSTANCE.getBaseCommand();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COMMAND__PROGRAM = eINSTANCE.getBaseCommand_Program();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_COMMAND__PARAMETER = eINSTANCE.getBaseCommand_Parameter();

		/**
		 * The meta object literal for the '{@link workflow.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ParameterImpl
		 * @see workflow.impl.WorkflowPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTION = eINSTANCE.getParameter_Option();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DATA = eINSTANCE.getParameter_Data();

	}

} //WorkflowPackage
