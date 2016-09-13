/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Command#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.Command#getNo_of_exec <em>No of exec</em>}</li>
 *   <li>{@link workflow.Command#isReturn_status <em>Return status</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends BaseCommand {
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
	 * @see workflow.WorkflowPackage#getCommand_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link workflow.Command#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>No of exec</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No of exec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No of exec</em>' attribute.
	 * @see #setNo_of_exec(int)
	 * @see workflow.WorkflowPackage#getCommand_No_of_exec()
	 * @model default="1"
	 * @generated
	 */
	int getNo_of_exec();

	/**
	 * Sets the value of the '{@link workflow.Command#getNo_of_exec <em>No of exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No of exec</em>' attribute.
	 * @see #getNo_of_exec()
	 * @generated
	 */
	void setNo_of_exec(int value);

	/**
	 * Returns the value of the '<em><b>Return status</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return status</em>' attribute.
	 * @see #setReturn_status(boolean)
	 * @see workflow.WorkflowPackage#getCommand_Return_status()
	 * @model default="false"
	 * @generated
	 */
	boolean isReturn_status();

	/**
	 * Sets the value of the '{@link workflow.Command#isReturn_status <em>Return status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return status</em>' attribute.
	 * @see #isReturn_status()
	 * @generated
	 */
	void setReturn_status(boolean value);

} // Command
