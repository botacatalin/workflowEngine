/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.InputParameter#getLink_to_outputparameter <em>Link to outputparameter</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getInputParameter()
 * @model
 * @generated
 */
public interface InputParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Link to outputparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link to outputparameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link to outputparameter</em>' reference.
	 * @see #setLink_to_outputparameter(OutputParameter)
	 * @see workflow.WorkflowPackage#getInputParameter_Link_to_outputparameter()
	 * @model
	 * @generated
	 */
	OutputParameter getLink_to_outputparameter();

	/**
	 * Sets the value of the '{@link workflow.InputParameter#getLink_to_outputparameter <em>Link to outputparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link to outputparameter</em>' reference.
	 * @see #getLink_to_outputparameter()
	 * @generated
	 */
	void setLink_to_outputparameter(OutputParameter value);

} // InputParameter
