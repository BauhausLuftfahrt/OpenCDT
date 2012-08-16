/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.impl.ElementImpl;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Calculation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.CalculationImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.impl.CalculationImpl#getFunctionID <em>Function ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculationImpl extends ElementImpl implements Calculation {
	/**
	 * The cached value of the '{@link #getParameterMapping() <em>Parameter Mapping</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameterMapping()
	 * @generated
	 * @ordered
	 */
	protected ParameterMapping parameterMapping;

	/**
	 * The default value of the '{@link #getFunctionID() <em>Function ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFunctionID()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionID() <em>Function ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFunctionID()
	 * @generated
	 * @ordered
	 */
	protected String functionID = FUNCTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CALCULATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapping getParameterMapping() {
		if (parameterMapping != null && parameterMapping.eIsProxy()) {
			InternalEObject oldParameterMapping = (InternalEObject)parameterMapping;
			parameterMapping = (ParameterMapping)eResolveProxy(oldParameterMapping);
			if (parameterMapping != oldParameterMapping) {
				InternalEObject newParameterMapping = (InternalEObject)parameterMapping;
				NotificationChain msgs = oldParameterMapping.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION__PARAMETER_MAPPING, null, null);
				if (newParameterMapping.eInternalContainer() == null) {
					msgs = newParameterMapping.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION__PARAMETER_MAPPING, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculationPackage.CALCULATION__PARAMETER_MAPPING, oldParameterMapping, parameterMapping));
			}
		}
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapping basicGetParameterMapping() {
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterMapping(ParameterMapping newParameterMapping, NotificationChain msgs) {
		ParameterMapping oldParameterMapping = parameterMapping;
		parameterMapping = newParameterMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION__PARAMETER_MAPPING, oldParameterMapping, newParameterMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterMapping(ParameterMapping newParameterMapping) {
		if (newParameterMapping != parameterMapping) {
			NotificationChain msgs = null;
			if (parameterMapping != null)
				msgs = ((InternalEObject)parameterMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION__PARAMETER_MAPPING, null, msgs);
			if (newParameterMapping != null)
				msgs = ((InternalEObject)newParameterMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculationPackage.CALCULATION__PARAMETER_MAPPING, null, msgs);
			msgs = basicSetParameterMapping(newParameterMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION__PARAMETER_MAPPING, newParameterMapping, newParameterMapping));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionID() {
		return functionID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionID(String newFunctionID) {
		String oldFunctionID = functionID;
		functionID = newFunctionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CALCULATION__FUNCTION_ID, oldFunctionID, functionID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return If the calculation has a valid parameter mapping, this method returns true
	 * @generated NOT
	 */
	public boolean isMapped() {
		if (getParameterMapping() == null) {
			return false;
		}
		Function function = CalculationRepositoryManager.getInstance().getFunction(UtilitiesHelper.getProjectId(this),
			getFunctionID());
		EList<ParameterDescriptor> inputDescriptors = function.getInputDescriptors();
		EList<ParameterDescriptor> outputDescriptors = function.getOutputDescriptors();
		if (inputDescriptors.size() != getParameterMapping().getInputMappables().size()) {
			return false;
		}

		if (outputDescriptors.size() != getParameterMapping().getOutputMappables().size()) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculationPackage.CALCULATION__PARAMETER_MAPPING:
				return basicSetParameterMapping(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculationPackage.CALCULATION__PARAMETER_MAPPING:
				if (resolve) return getParameterMapping();
				return basicGetParameterMapping();
			case CalculationPackage.CALCULATION__FUNCTION_ID:
				return getFunctionID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculationPackage.CALCULATION__PARAMETER_MAPPING:
				setParameterMapping((ParameterMapping)newValue);
				return;
			case CalculationPackage.CALCULATION__FUNCTION_ID:
				setFunctionID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CalculationPackage.CALCULATION__PARAMETER_MAPPING:
				setParameterMapping((ParameterMapping)null);
				return;
			case CalculationPackage.CALCULATION__FUNCTION_ID:
				setFunctionID(FUNCTION_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CalculationPackage.CALCULATION__PARAMETER_MAPPING:
				return parameterMapping != null;
			case CalculationPackage.CALCULATION__FUNCTION_ID:
				return FUNCTION_ID_EDEFAULT == null ? functionID != null : !FUNCTION_ID_EDEFAULT.equals(functionID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (functionID: "); //$NON-NLS-1$
		result.append(functionID);
		result.append(')');
		return result.toString();
	}

} // CalculationImpl
