/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.BaseCommand#getProgram <em>Program</em>}</li>
 *   <li>{@link workflow.BaseCommand#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getBaseCommand()
 * @model
 * @generated
 */
public interface BaseCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' attribute.
	 * @see #setProgram(String)
	 * @see workflow.WorkflowPackage#getBaseCommand_Program()
	 * @model
	 * @generated
	 */
	String getProgram();

	/**
	 * Sets the value of the '{@link workflow.BaseCommand#getProgram <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' attribute.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getBaseCommand_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // BaseCommand
