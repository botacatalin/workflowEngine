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
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__RECIPES = 1;

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
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ParameterImpl
	 * @see workflow.impl.WorkflowPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

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
	 * The meta object id for the '{@link workflow.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.StatementImpl
	 * @see workflow.impl.WorkflowPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ConditionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__THEN_BRANCH = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ProgramImpl
	 * @see workflow.impl.WorkflowPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name exec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME_EXEC = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.SimpleCommandImpl <em>Simple Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.SimpleCommandImpl
	 * @see workflow.impl.WorkflowPackageImpl#getSimpleCommand()
	 * @generated
	 */
	int SIMPLE_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMAND__DESCRIPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMAND__PROGRAMS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMAND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMAND_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.InputParameterImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__OPTION = PARAMETER__OPTION;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__DATA = PARAMETER__DATA;

	/**
	 * The feature id for the '<em><b>Link to outputparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.OutputParameterImpl
	 * @see workflow.impl.WorkflowPackageImpl#getOutputParameter()
	 * @generated
	 */
	int OUTPUT_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__OPTION = PARAMETER__OPTION;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__DATA = PARAMETER__DATA;

	/**
	 * The feature id for the '<em><b>Link to inputparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipes</em>'.
	 * @see workflow.Workflow#getRecipes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Recipes();

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
	 * Returns the meta object for the containment reference list '{@link workflow.Recipe#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see workflow.Recipe#getCommands()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Commands();

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
	 * Returns the meta object for class '{@link workflow.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see workflow.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workflow.Condition#getDescription()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Description();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.Condition#getThen_branch <em>Then branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then branch</em>'.
	 * @see workflow.Condition#getThen_branch()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Then_branch();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.Condition#getElse_branch <em>Else branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else branch</em>'.
	 * @see workflow.Condition#getElse_branch()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Else_branch();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see workflow.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link workflow.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see workflow.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Program#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see workflow.Program#getParameters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Program#getName_exec <em>Name exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name exec</em>'.
	 * @see workflow.Program#getName_exec()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name_exec();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Program#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workflow.Program#getDescription()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Description();

	/**
	 * Returns the meta object for class '{@link workflow.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see workflow.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link workflow.SimpleCommand <em>Simple Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Command</em>'.
	 * @see workflow.SimpleCommand
	 * @generated
	 */
	EClass getSimpleCommand();

	/**
	 * Returns the meta object for the attribute '{@link workflow.SimpleCommand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see workflow.SimpleCommand#getDescription()
	 * @see #getSimpleCommand()
	 * @generated
	 */
	EAttribute getSimpleCommand_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.SimpleCommand#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see workflow.SimpleCommand#getPrograms()
	 * @see #getSimpleCommand()
	 * @generated
	 */
	EReference getSimpleCommand_Programs();

	/**
	 * Returns the meta object for class '{@link workflow.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see workflow.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the reference '{@link workflow.InputParameter#getLink_to_outputparameter <em>Link to outputparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link to outputparameter</em>'.
	 * @see workflow.InputParameter#getLink_to_outputparameter()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_Link_to_outputparameter();

	/**
	 * Returns the meta object for class '{@link workflow.OutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameter</em>'.
	 * @see workflow.OutputParameter
	 * @generated
	 */
	EClass getOutputParameter();

	/**
	 * Returns the meta object for the reference '{@link workflow.OutputParameter#getLink_to_inputparameter <em>Link to inputparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link to inputparameter</em>'.
	 * @see workflow.OutputParameter#getLink_to_inputparameter()
	 * @see #getOutputParameter()
	 * @generated
	 */
	EReference getOutputParameter_Link_to_inputparameter();

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
		 * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__RECIPES = eINSTANCE.getWorkflow_Recipes();

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
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__COMMANDS = eINSTANCE.getRecipe_Commands();

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

		/**
		 * The meta object literal for the '{@link workflow.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ConditionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DESCRIPTION = eINSTANCE.getCondition_Description();

		/**
		 * The meta object literal for the '<em><b>Then branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__THEN_BRANCH = eINSTANCE.getCondition_Then_branch();

		/**
		 * The meta object literal for the '<em><b>Else branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE_BRANCH = eINSTANCE.getCondition_Else_branch();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link workflow.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ProgramImpl
		 * @see workflow.impl.WorkflowPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PARAMETERS = eINSTANCE.getProgram_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name exec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME_EXEC = eINSTANCE.getProgram_Name_exec();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__DESCRIPTION = eINSTANCE.getProgram_Description();

		/**
		 * The meta object literal for the '{@link workflow.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.StatementImpl
		 * @see workflow.impl.WorkflowPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link workflow.impl.SimpleCommandImpl <em>Simple Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.SimpleCommandImpl
		 * @see workflow.impl.WorkflowPackageImpl#getSimpleCommand()
		 * @generated
		 */
		EClass SIMPLE_COMMAND = eINSTANCE.getSimpleCommand();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_COMMAND__DESCRIPTION = eINSTANCE.getSimpleCommand_Description();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMMAND__PROGRAMS = eINSTANCE.getSimpleCommand_Programs();

		/**
		 * The meta object literal for the '{@link workflow.impl.InputParameterImpl <em>Input Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.InputParameterImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInputParameter()
		 * @generated
		 */
		EClass INPUT_PARAMETER = eINSTANCE.getInputParameter();

		/**
		 * The meta object literal for the '<em><b>Link to outputparameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER = eINSTANCE.getInputParameter_Link_to_outputparameter();

		/**
		 * The meta object literal for the '{@link workflow.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.OutputParameterImpl
		 * @see workflow.impl.WorkflowPackageImpl#getOutputParameter()
		 * @generated
		 */
		EClass OUTPUT_PARAMETER = eINSTANCE.getOutputParameter();

		/**
		 * The meta object literal for the '<em><b>Link to inputparameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER = eINSTANCE.getOutputParameter_Link_to_inputparameter();

	}

} //WorkflowPackage
