/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.Condition;
import workflow.Statement;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.ConditionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link workflow.impl.ConditionImpl#getThen_branch <em>Then branch</em>}</li>
 *   <li>{@link workflow.impl.ConditionImpl#getElse_branch <em>Else branch</em>}</li>
 *   <li>{@link workflow.impl.ConditionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends StatementImpl implements Condition {
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
	 * The cached value of the '{@link #getThen_branch() <em>Then branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen_branch()
	 * @generated
	 * @ordered
	 */
	protected Statement then_branch;

	/**
	 * The cached value of the '{@link #getElse_branch() <em>Else branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse_branch()
	 * @generated
	 * @ordered
	 */
	protected Statement else_branch;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getThen_branch() {
		return then_branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen_branch(Statement newThen_branch, NotificationChain msgs) {
		Statement oldThen_branch = then_branch;
		then_branch = newThen_branch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__THEN_BRANCH, oldThen_branch, newThen_branch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen_branch(Statement newThen_branch) {
		if (newThen_branch != then_branch) {
			NotificationChain msgs = null;
			if (then_branch != null)
				msgs = ((InternalEObject)then_branch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.CONDITION__THEN_BRANCH, null, msgs);
			if (newThen_branch != null)
				msgs = ((InternalEObject)newThen_branch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.CONDITION__THEN_BRANCH, null, msgs);
			msgs = basicSetThen_branch(newThen_branch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__THEN_BRANCH, newThen_branch, newThen_branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElse_branch() {
		return else_branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse_branch(Statement newElse_branch, NotificationChain msgs) {
		Statement oldElse_branch = else_branch;
		else_branch = newElse_branch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__ELSE_BRANCH, oldElse_branch, newElse_branch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse_branch(Statement newElse_branch) {
		if (newElse_branch != else_branch) {
			NotificationChain msgs = null;
			if (else_branch != null)
				msgs = ((InternalEObject)else_branch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.CONDITION__ELSE_BRANCH, null, msgs);
			if (newElse_branch != null)
				msgs = ((InternalEObject)newElse_branch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.CONDITION__ELSE_BRANCH, null, msgs);
			msgs = basicSetElse_branch(newElse_branch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__ELSE_BRANCH, newElse_branch, newElse_branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.CONDITION__THEN_BRANCH:
				return basicSetThen_branch(null, msgs);
			case WorkflowPackage.CONDITION__ELSE_BRANCH:
				return basicSetElse_branch(null, msgs);
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
			case WorkflowPackage.CONDITION__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.CONDITION__THEN_BRANCH:
				return getThen_branch();
			case WorkflowPackage.CONDITION__ELSE_BRANCH:
				return getElse_branch();
			case WorkflowPackage.CONDITION__EXPRESSION:
				return getExpression();
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
			case WorkflowPackage.CONDITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.CONDITION__THEN_BRANCH:
				setThen_branch((Statement)newValue);
				return;
			case WorkflowPackage.CONDITION__ELSE_BRANCH:
				setElse_branch((Statement)newValue);
				return;
			case WorkflowPackage.CONDITION__EXPRESSION:
				setExpression((String)newValue);
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
			case WorkflowPackage.CONDITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.CONDITION__THEN_BRANCH:
				setThen_branch((Statement)null);
				return;
			case WorkflowPackage.CONDITION__ELSE_BRANCH:
				setElse_branch((Statement)null);
				return;
			case WorkflowPackage.CONDITION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case WorkflowPackage.CONDITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.CONDITION__THEN_BRANCH:
				return then_branch != null;
			case WorkflowPackage.CONDITION__ELSE_BRANCH:
				return else_branch != null;
			case WorkflowPackage.CONDITION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
