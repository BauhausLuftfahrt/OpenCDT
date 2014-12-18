/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system.impl;

import java.util.Collection;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.system.MeasuredParameter;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.QuantityKind;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measured Parameter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.system.impl.MeasuredParameterImpl#getQuantityKind <em>Quantity Kind</em>}</li>
 * <li>{@link net.bhl.cdt.model.system.impl.MeasuredParameterImpl#getValues <em>Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.system.impl.MeasuredParameterImpl#getDefaultUnit <em>Default Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasuredParameterImpl extends SystemModelElementImpl implements MeasuredParameter {
	/**
	 * The cached value of the '{@link #getQuantityKind() <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityKind()
	 * @generated
	 * @ordered
	 */
	protected QuantityKind quantityKind;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * The cached value of the '{@link #getDefaultUnit() <em>Default Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit<?> defaultUnit;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.MEASURED_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind getQuantityKind() {
		if (quantityKind != null && quantityKind.eIsProxy()) {
			InternalEObject oldQuantityKind = (InternalEObject)quantityKind;
			quantityKind = (QuantityKind)eResolveProxy(oldQuantityKind);
			if (quantityKind != oldQuantityKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND, oldQuantityKind, quantityKind));
			}
		}
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind basicGetQuantityKind() {
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityKind(QuantityKind newQuantityKind) {
		QuantityKind oldQuantityKind = quantityKind;
		quantityKind = newQuantityKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND, oldQuantityKind, quantityKind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<Value>(Value.class, this, SystemPackage.MEASURED_PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Unit<?> getDefaultUnit() {
		return defaultUnit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultUnit(Unit<?> newDefaultUnit) {
		Unit<?> oldDefaultUnit = defaultUnit;
		defaultUnit = newDefaultUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.MEASURED_PARAMETER__DEFAULT_UNIT, oldDefaultUnit, defaultUnit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND:
				if (resolve) return getQuantityKind();
				return basicGetQuantityKind();
			case SystemPackage.MEASURED_PARAMETER__VALUES:
				return getValues();
			case SystemPackage.MEASURED_PARAMETER__DEFAULT_UNIT:
				return getDefaultUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND:
				setQuantityKind((QuantityKind)newValue);
				return;
			case SystemPackage.MEASURED_PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
				return;
			case SystemPackage.MEASURED_PARAMETER__DEFAULT_UNIT:
				setDefaultUnit((Unit<?>)newValue);
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
			case SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND:
				setQuantityKind((QuantityKind)null);
				return;
			case SystemPackage.MEASURED_PARAMETER__VALUES:
				getValues().clear();
				return;
			case SystemPackage.MEASURED_PARAMETER__DEFAULT_UNIT:
				setDefaultUnit((Unit<?>)null);
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
			case SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND:
				return quantityKind != null;
			case SystemPackage.MEASURED_PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case SystemPackage.MEASURED_PARAMETER__DEFAULT_UNIT:
				return defaultUnit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND: return SystemPackage.PARAMETER__QUANTITY_KIND;
				case SystemPackage.MEASURED_PARAMETER__VALUES: return SystemPackage.PARAMETER__VALUES;
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
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case SystemPackage.PARAMETER__QUANTITY_KIND: return SystemPackage.MEASURED_PARAMETER__QUANTITY_KIND;
				case SystemPackage.PARAMETER__VALUES: return SystemPackage.MEASURED_PARAMETER__VALUES;
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
		result.append(" (defaultUnit: ");
		result.append(defaultUnit);
		result.append(')');
		return result.toString();
	}

} // MeasuredParameterImpl
