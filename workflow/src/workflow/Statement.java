/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Statement#getExec_order <em>Exec order</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {

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
	 * @see workflow.WorkflowPackage#getStatement_Exec_order()
	 * @model
	 * @generated
	 */
	int getExec_order();

	/**
	 * Sets the value of the '{@link workflow.Statement#getExec_order <em>Exec order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec order</em>' attribute.
	 * @see #getExec_order()
	 * @generated
	 */
	void setExec_order(int value);
} // Statement
