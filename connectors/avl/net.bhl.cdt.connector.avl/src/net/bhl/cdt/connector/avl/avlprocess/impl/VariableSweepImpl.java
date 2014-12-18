/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlprocess.impl;

import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;
import net.bhl.cdt.model.impl.NamedElementImpl;
import net.bhl.cdt.model.system.DecimalNumber;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variable Sweep</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl#getVariableStart <em>Variable Start</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl#getVariableEnd <em>Variable End</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl#getVariableDelta <em>Variable Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableSweepImpl extends NamedElementImpl implements VariableSweep {
	/**
	 * The cached value of the '{@link #getVariableStart() <em>Variable Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableStart()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber variableStart;

	/**
	 * The cached value of the '{@link #getVariableEnd() <em>Variable End</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVariableEnd()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber variableEnd;

	/**
	 * The cached value of the '{@link #getVariableDelta() <em>Variable Delta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDelta()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber variableDelta;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableSweepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlprocessPackage.Literals.VARIABLE_SWEEP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getVariableStart() {
		if (variableStart != null && variableStart.eIsProxy()) {
			InternalEObject oldVariableStart = (InternalEObject)variableStart;
			variableStart = (DecimalNumber)eResolveProxy(oldVariableStart);
			if (variableStart != oldVariableStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START, oldVariableStart, variableStart));
			}
		}
		return variableStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetVariableStart() {
		return variableStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableStart(DecimalNumber newVariableStart) {
		DecimalNumber oldVariableStart = variableStart;
		variableStart = newVariableStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START, oldVariableStart, variableStart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getVariableEnd() {
		if (variableEnd != null && variableEnd.eIsProxy()) {
			InternalEObject oldVariableEnd = (InternalEObject)variableEnd;
			variableEnd = (DecimalNumber)eResolveProxy(oldVariableEnd);
			if (variableEnd != oldVariableEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END, oldVariableEnd, variableEnd));
			}
		}
		return variableEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetVariableEnd() {
		return variableEnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableEnd(DecimalNumber newVariableEnd) {
		DecimalNumber oldVariableEnd = variableEnd;
		variableEnd = newVariableEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END, oldVariableEnd, variableEnd));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getVariableDelta() {
		if (variableDelta != null && variableDelta.eIsProxy()) {
			InternalEObject oldVariableDelta = (InternalEObject)variableDelta;
			variableDelta = (DecimalNumber)eResolveProxy(oldVariableDelta);
			if (variableDelta != oldVariableDelta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA, oldVariableDelta, variableDelta));
			}
		}
		return variableDelta;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetVariableDelta() {
		return variableDelta;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDelta(DecimalNumber newVariableDelta) {
		DecimalNumber oldVariableDelta = variableDelta;
		variableDelta = newVariableDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA, oldVariableDelta, variableDelta));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START:
				if (resolve) return getVariableStart();
				return basicGetVariableStart();
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END:
				if (resolve) return getVariableEnd();
				return basicGetVariableEnd();
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA:
				if (resolve) return getVariableDelta();
				return basicGetVariableDelta();
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
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START:
				setVariableStart((DecimalNumber)newValue);
				return;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END:
				setVariableEnd((DecimalNumber)newValue);
				return;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA:
				setVariableDelta((DecimalNumber)newValue);
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
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START:
				setVariableStart((DecimalNumber)null);
				return;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END:
				setVariableEnd((DecimalNumber)null);
				return;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA:
				setVariableDelta((DecimalNumber)null);
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
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_START:
				return variableStart != null;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_END:
				return variableEnd != null;
			case AvlprocessPackage.VARIABLE_SWEEP__VARIABLE_DELTA:
				return variableDelta != null;
		}
		return super.eIsSet(featureID);
	}

} // VariableSweepImpl
