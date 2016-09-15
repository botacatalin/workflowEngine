/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Condition#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.Condition#getThen_branch <em>Then branch</em>}</li>
 *   <li>{@link workflow.Condition#getElse_branch <em>Else branch</em>}</li>
 *   <li>{@link workflow.Condition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getCondition()
 * @model extendedMetaData="name='IfThenElseCommand'"
 * @generated
 */
public interface Condition extends Statement {
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
	 * @see workflow.WorkflowPackage#getCondition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link workflow.Condition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Then branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then branch</em>' containment reference.
	 * @see #setThen_branch(Statement)
	 * @see workflow.WorkflowPackage#getCondition_Then_branch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getThen_branch();

	/**
	 * Sets the value of the '{@link workflow.Condition#getThen_branch <em>Then branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then branch</em>' containment reference.
	 * @see #getThen_branch()
	 * @generated
	 */
	void setThen_branch(Statement value);

	/**
	 * Returns the value of the '<em><b>Else branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else branch</em>' containment reference.
	 * @see #setElse_branch(Statement)
	 * @see workflow.WorkflowPackage#getCondition_Else_branch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getElse_branch();

	/**
	 * Sets the value of the '{@link workflow.Condition#getElse_branch <em>Else branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else branch</em>' containment reference.
	 * @see #getElse_branch()
	 * @generated
	 */
	void setElse_branch(Statement value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see workflow.WorkflowPackage#getCondition_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link workflow.Condition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Condition
