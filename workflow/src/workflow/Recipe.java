/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Recipe#getCommand <em>Command</em>}</li>
 *   <li>{@link workflow.Recipe#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getRecipe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Recipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getRecipe_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The default value is <code>"bash"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see workflow.WorkflowPackage#getRecipe_Lang()
	 * @model default="bash"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link workflow.Recipe#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

} // Recipe
