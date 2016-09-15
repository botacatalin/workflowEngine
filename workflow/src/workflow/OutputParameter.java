/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.OutputParameter#getLink_to_inputparameter <em>Link to inputparameter</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getOutputParameter()
 * @model
 * @generated
 */
public interface OutputParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Link to inputparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link to inputparameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link to inputparameter</em>' reference.
	 * @see #setLink_to_inputparameter(InputParameter)
	 * @see workflow.WorkflowPackage#getOutputParameter_Link_to_inputparameter()
	 * @model
	 * @generated
	 */
	InputParameter getLink_to_inputparameter();

	/**
	 * Sets the value of the '{@link workflow.OutputParameter#getLink_to_inputparameter <em>Link to inputparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link to inputparameter</em>' reference.
	 * @see #getLink_to_inputparameter()
	 * @generated
	 */
	void setLink_to_inputparameter(InputParameter value);

} // OutputParameter
