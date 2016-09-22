/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Parameter;
import workflow.Program;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.ProgramImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link workflow.impl.ProgramImpl#getName_exec <em>Name exec</em>}</li>
 *   <li>{@link workflow.impl.ProgramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.impl.ProgramImpl#getExec_order <em>Exec order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getName_exec() <em>Name exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_exec()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EXEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_exec() <em>Name exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_exec()
	 * @generated
	 * @ordered
	 */
	protected String name_exec = NAME_EXEC_EDEFAULT;

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
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, WorkflowPackage.PROGRAM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_exec() {
		return name_exec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_exec(String newName_exec) {
		String oldName_exec = name_exec;
		name_exec = newName_exec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PROGRAM__NAME_EXEC, oldName_exec, name_exec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PROGRAM__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PROGRAM__EXEC_ORDER, oldExec_order, exec_order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.PROGRAM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.PROGRAM__PARAMETERS:
				return getParameters();
			case WorkflowPackage.PROGRAM__NAME_EXEC:
				return getName_exec();
			case WorkflowPackage.PROGRAM__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.PROGRAM__EXEC_ORDER:
				return getExec_order();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.PROGRAM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case WorkflowPackage.PROGRAM__NAME_EXEC:
				setName_exec((String)newValue);
				return;
			case WorkflowPackage.PROGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.PROGRAM__EXEC_ORDER:
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
			case WorkflowPackage.PROGRAM__PARAMETERS:
				getParameters().clear();
				return;
			case WorkflowPackage.PROGRAM__NAME_EXEC:
				setName_exec(NAME_EXEC_EDEFAULT);
				return;
			case WorkflowPackage.PROGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.PROGRAM__EXEC_ORDER:
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
			case WorkflowPackage.PROGRAM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WorkflowPackage.PROGRAM__NAME_EXEC:
				return NAME_EXEC_EDEFAULT == null ? name_exec != null : !NAME_EXEC_EDEFAULT.equals(name_exec);
			case WorkflowPackage.PROGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.PROGRAM__EXEC_ORDER:
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
		result.append(" (name_exec: ");
		result.append(name_exec);
		result.append(", description: ");
		result.append(description);
		result.append(", exec_order: ");
		result.append(exec_order);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
