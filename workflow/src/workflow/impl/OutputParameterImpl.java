/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.InputParameter;
import workflow.OutputParameter;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.OutputParameterImpl#getLink_to_inputparameter <em>Link to inputparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputParameterImpl extends ParameterImpl implements OutputParameter {
	/**
	 * The cached value of the '{@link #getLink_to_inputparameter() <em>Link to inputparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_to_inputparameter()
	 * @generated
	 * @ordered
	 */
	protected InputParameter link_to_inputparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.OUTPUT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter getLink_to_inputparameter() {
		if (link_to_inputparameter != null && link_to_inputparameter.eIsProxy()) {
			InternalEObject oldLink_to_inputparameter = (InternalEObject)link_to_inputparameter;
			link_to_inputparameter = (InputParameter)eResolveProxy(oldLink_to_inputparameter);
			if (link_to_inputparameter != oldLink_to_inputparameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER, oldLink_to_inputparameter, link_to_inputparameter));
			}
		}
		return link_to_inputparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter basicGetLink_to_inputparameter() {
		return link_to_inputparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_to_inputparameter(InputParameter newLink_to_inputparameter) {
		InputParameter oldLink_to_inputparameter = link_to_inputparameter;
		link_to_inputparameter = newLink_to_inputparameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER, oldLink_to_inputparameter, link_to_inputparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER:
				if (resolve) return getLink_to_inputparameter();
				return basicGetLink_to_inputparameter();
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
			case WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER:
				setLink_to_inputparameter((InputParameter)newValue);
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
			case WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER:
				setLink_to_inputparameter((InputParameter)null);
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
			case WorkflowPackage.OUTPUT_PARAMETER__LINK_TO_INPUTPARAMETER:
				return link_to_inputparameter != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputParameterImpl
