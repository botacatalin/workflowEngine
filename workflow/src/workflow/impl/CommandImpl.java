/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.Command;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.CommandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.impl.CommandImpl#getNo_of_exec <em>No of exec</em>}</li>
 *   <li>{@link workflow.impl.CommandImpl#isReturn_status <em>Return status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends BaseCommandImpl implements Command {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNo_of_exec() <em>No of exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_of_exec()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OF_EXEC_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNo_of_exec() <em>No of exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_of_exec()
	 * @generated
	 * @ordered
	 */
	protected int no_of_exec = NO_OF_EXEC_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturn_status() <em>Return status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn_status()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturn_status() <em>Return status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn_status()
	 * @generated
	 * @ordered
	 */
	protected boolean return_status = RETURN_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMMAND__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNo_of_exec() {
		return no_of_exec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_of_exec(int newNo_of_exec) {
		int oldNo_of_exec = no_of_exec;
		no_of_exec = newNo_of_exec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMMAND__NO_OF_EXEC, oldNo_of_exec, no_of_exec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturn_status() {
		return return_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn_status(boolean newReturn_status) {
		boolean oldReturn_status = return_status;
		return_status = newReturn_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMMAND__RETURN_STATUS, oldReturn_status, return_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMMAND__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.COMMAND__NO_OF_EXEC:
				return getNo_of_exec();
			case WorkflowPackage.COMMAND__RETURN_STATUS:
				return isReturn_status();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.COMMAND__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.COMMAND__NO_OF_EXEC:
				setNo_of_exec((Integer)newValue);
				return;
			case WorkflowPackage.COMMAND__RETURN_STATUS:
				setReturn_status((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.COMMAND__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.COMMAND__NO_OF_EXEC:
				setNo_of_exec(NO_OF_EXEC_EDEFAULT);
				return;
			case WorkflowPackage.COMMAND__RETURN_STATUS:
				setReturn_status(RETURN_STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.COMMAND__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.COMMAND__NO_OF_EXEC:
				return no_of_exec != NO_OF_EXEC_EDEFAULT;
			case WorkflowPackage.COMMAND__RETURN_STATUS:
				return return_status != RETURN_STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", no_of_exec: ");
		result.append(no_of_exec);
		result.append(", return_status: ");
		result.append(return_status);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
