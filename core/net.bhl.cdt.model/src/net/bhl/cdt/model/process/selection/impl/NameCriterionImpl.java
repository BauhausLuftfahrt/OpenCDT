/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.SelectionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Name Criterion</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.NameCriterionImpl#getValueName <em>Value Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameCriterionImpl extends RationaleImpl implements NameCriterion {
	/**
	 * The default value of the '{@link #getValueName() <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueName() <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueName()
	 * @generated
	 * @ordered
	 */
	protected String valueName = VALUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NameCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.NAME_CRITERION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueName() {
		return valueName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueName(String newValueName) {
		String oldValueName = valueName;
		valueName = newValueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.NAME_CRITERION__VALUE_NAME, oldValueName, valueName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.NAME_CRITERION__VALUE_NAME:
				return getValueName();
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
			case SelectionPackage.NAME_CRITERION__VALUE_NAME:
				setValueName((String)newValue);
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
			case SelectionPackage.NAME_CRITERION__VALUE_NAME:
				setValueName(VALUE_NAME_EDEFAULT);
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
			case SelectionPackage.NAME_CRITERION__VALUE_NAME:
				return VALUE_NAME_EDEFAULT == null ? valueName != null : !VALUE_NAME_EDEFAULT.equals(valueName);
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
		result.append(" (valueName: ");
		result.append(valueName);
		result.append(')');
		return result.toString();
	}

} // NameCriterionImpl
