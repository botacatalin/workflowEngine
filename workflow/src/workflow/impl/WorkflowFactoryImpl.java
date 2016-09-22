/**
 */
package workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory(WorkflowPackage.eNS_URI);
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkflowPackage.WORKFLOW: return createWorkflow();
			case WorkflowPackage.RECIPE: return createRecipe();
			case WorkflowPackage.CONDITION: return createCondition();
			case WorkflowPackage.PROGRAM: return createProgram();
			case WorkflowPackage.SIMPLE_COMMAND: return createSimpleCommand();
			case WorkflowPackage.INPUT_PARAMETER: return createInputParameter();
			case WorkflowPackage.OUTPUT_PARAMETER: return createOutputParameter();
			case WorkflowPackage.FOR_EACH: return createForEach();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCommand createSimpleCommand() {
		SimpleCommandImpl simpleCommand = new SimpleCommandImpl();
		return simpleCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter createInputParameter() {
		InputParameterImpl inputParameter = new InputParameterImpl();
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameter createOutputParameter() {
		OutputParameterImpl outputParameter = new OutputParameterImpl();
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
