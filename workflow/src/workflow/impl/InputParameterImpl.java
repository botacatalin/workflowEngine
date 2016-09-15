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
 * An implementation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.InputParameterImpl#getLink_to_outputparameter <em>Link to outputparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputParameterImpl extends ParameterImpl implements InputParameter {
	/**
	 * The cached value of the '{@link #getLink_to_outputparameter() <em>Link to outputparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_to_outputparameter()
	 * @generated
	 * @ordered
	 */
	protected OutputParameter link_to_outputparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.INPUT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameter getLink_to_outputparameter() {
		if (link_to_outputparameter != null && link_to_outputparameter.eIsProxy()) {
			InternalEObject oldLink_to_outputparameter = (InternalEObject)link_to_outputparameter;
			link_to_outputparameter = (OutputParameter)eResolveProxy(oldLink_to_outputparameter);
			if (link_to_outputparameter != oldLink_to_outputparameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER, oldLink_to_outputparameter, link_to_outputparameter));
			}
		}
		return link_to_outputparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameter basicGetLink_to_outputparameter() {
		return link_to_outputparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_to_outputparameter(OutputParameter newLink_to_outputparameter) {
		OutputParameter oldLink_to_outputparameter = link_to_outputparameter;
		link_to_outputparameter = newLink_to_outputparameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER, oldLink_to_outputparameter, link_to_outputparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER:
				if (resolve) return getLink_to_outputparameter();
				return basicGetLink_to_outputparameter();
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
			case WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER:
				setLink_to_outputparameter((OutputParameter)newValue);
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
			case WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER:
				setLink_to_outputparameter((OutputParameter)null);
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
			case WorkflowPackage.INPUT_PARAMETER__LINK_TO_OUTPUTPARAMETER:
				return link_to_outputparameter != null;
		}
		return super.eIsSet(featureID);
	}

} //InputParameterImpl
