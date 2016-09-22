/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import workflow.Statement;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.StatementImpl#getExec_order <em>Exec order</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
	/**
	 * The default value of the '{@link #getExec_order() <em>Exec order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExec_order()
	 * @generated
	 * @ordered
	 */
	protected static final int EXEC_ORDER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getExec_order() <em>Exec order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExec_order()
	 * @generated
	 * @ordered
	 */
	protected int exec_order = EXEC_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExec_order() {
		return exec_order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExec_order(int newExec_order) {
		int oldExec_order = exec_order;
		exec_order = newExec_order;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.STATEMENT__EXEC_ORDER, oldExec_order, exec_order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.STATEMENT__EXEC_ORDER:
				return getExec_order();
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
			case WorkflowPackage.STATEMENT__EXEC_ORDER:
				setExec_order((Integer)newValue);
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
			case WorkflowPackage.STATEMENT__EXEC_ORDER:
				setExec_order(EXEC_ORDER_EDEFAULT);
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
			case WorkflowPackage.STATEMENT__EXEC_ORDER:
				return exec_order != EXEC_ORDER_EDEFAULT;
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
		result.append(" (exec_order: ");
		result.append(exec_order);
		result.append(')');
		return result.toString();
	}

} //StatementImpl
