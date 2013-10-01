/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions.impl;

import net.bhl.cdt.calculationrepository.functions.CalculationScript;
import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Calculation Script</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.impl.CalculationScriptImpl#getScriptText <em>Script Text</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class CalculationScriptImpl extends FunctionImpl implements CalculationScript {
	/**
	 * The default value of the '{@link #getScriptText() <em>Script Text</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getScriptText()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptText() <em>Script Text</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getScriptText()
	 * @generated
	 * @ordered
	 */
	protected String scriptText = SCRIPT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CalculationScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.CALCULATION_SCRIPT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getScriptText() {
		return scriptText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setScriptText(String newScriptText) {
		String oldScriptText = scriptText;
		scriptText = newScriptText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.CALCULATION_SCRIPT__SCRIPT_TEXT,
				oldScriptText, scriptText));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FunctionsPackage.CALCULATION_SCRIPT__SCRIPT_TEXT:
			return getScriptText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FunctionsPackage.CALCULATION_SCRIPT__SCRIPT_TEXT:
			setScriptText((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FunctionsPackage.CALCULATION_SCRIPT__SCRIPT_TEXT:
			setScriptText(SCRIPT_TEXT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FunctionsPackage.CALCULATION_SCRIPT__SCRIPT_TEXT:
			return SCRIPT_TEXT_EDEFAULT == null ? scriptText != null : !SCRIPT_TEXT_EDEFAULT.equals(scriptText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scriptText: ");
		result.append(scriptText);
		result.append(')');
		return result.toString();
	}

} // CalculationScriptImpl
