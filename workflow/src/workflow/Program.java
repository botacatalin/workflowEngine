/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Program#getParameters <em>Parameters</em>}</li>
 *   <li>{@link workflow.Program#getName_exec <em>Name exec</em>}</li>
 *   <li>{@link workflow.Program#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.Program#getExec_order <em>Exec order</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getProgram_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Name exec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name exec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name exec</em>' attribute.
	 * @see #setName_exec(String)
	 * @see workflow.WorkflowPackage#getProgram_Name_exec()
	 * @model
	 * @generated
	 */
	String getName_exec();

	/**
	 * Sets the value of the '{@link workflow.Program#getName_exec <em>Name exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name exec</em>' attribute.
	 * @see #getName_exec()
	 * @generated
	 */
	void setName_exec(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see workflow.WorkflowPackage#getProgram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link workflow.Program#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Exec order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec order</em>' attribute.
	 * @see #setExec_order(int)
	 * @see workflow.WorkflowPackage#getProgram_Exec_order()
	 * @model
	 * @generated
	 */
	int getExec_order();

	/**
	 * Sets the value of the '{@link workflow.Program#getExec_order <em>Exec order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec order</em>' attribute.
	 * @see #getExec_order()
	 * @generated
	 */
	void setExec_order(int value);

} // Program
