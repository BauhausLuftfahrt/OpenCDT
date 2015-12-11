/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import java.math.BigDecimal;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.SystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Selected Measured Value</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedMeasuredValueImpl extends SelectedValueImpl implements SelectedMeasuredValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit<?> unit;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedMeasuredValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.SELECTED_MEASURED_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.SELECTED_MEASURED_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Unit<?> getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit<?> newUnit) {
		Unit<?> oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.SELECTED_MEASURED_VALUE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.SELECTED_MEASURED_VALUE__VALUE:
				return getValue();
			case SelectionPackage.SELECTED_MEASURED_VALUE__UNIT:
				return getUnit();
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
			case SelectionPackage.SELECTED_MEASURED_VALUE__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case SelectionPackage.SELECTED_MEASURED_VALUE__UNIT:
				setUnit((Unit<?>)newValue);
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
			case SelectionPackage.SELECTED_MEASURED_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SelectionPackage.SELECTED_MEASURED_VALUE__UNIT:
				setUnit((Unit<?>)null);
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
			case SelectionPackage.SELECTED_MEASURED_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SelectionPackage.SELECTED_MEASURED_VALUE__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DecimalNumber.class) {
			switch (derivedFeatureID) {
				case SelectionPackage.SELECTED_MEASURED_VALUE__VALUE: return SystemPackage.DECIMAL_NUMBER__VALUE;
				default: return -1;
			}
		}
		if (baseClass == MeasuredValue.class) {
			switch (derivedFeatureID) {
				case SelectionPackage.SELECTED_MEASURED_VALUE__UNIT: return SystemPackage.MEASURED_VALUE__UNIT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DecimalNumber.class) {
			switch (baseFeatureID) {
				case SystemPackage.DECIMAL_NUMBER__VALUE: return SelectionPackage.SELECTED_MEASURED_VALUE__VALUE;
				default: return -1;
			}
		}
		if (baseClass == MeasuredValue.class) {
			switch (baseFeatureID) {
				case SystemPackage.MEASURED_VALUE__UNIT: return SelectionPackage.SELECTED_MEASURED_VALUE__UNIT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} // SelectedMeasuredValueImpl
