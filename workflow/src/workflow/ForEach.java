/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.ForEach#getElement <em>Element</em>}</li>
 *   <li>{@link workflow.ForEach#getStatements <em>Statements</em>}</li>
 *   <li>{@link workflow.ForEach#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends Statement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see workflow.WorkflowPackage#getForEach_Element()
	 * @model
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link workflow.ForEach#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getForEach_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see workflow.WorkflowPackage#getForEach_Sequence()
	 * @model
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link workflow.ForEach#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

} // ForEach
