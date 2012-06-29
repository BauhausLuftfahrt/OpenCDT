/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ConditionImpl#getMappableComponentOfInterest <em>Mappable Component Of
 * Interest</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConditionImpl extends ElementImpl implements Condition {
	/**
	 * The cached value of the '{@link #getMappableComponentOfInterest() <em>Mappable Component Of Interest</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMappableComponentOfInterest()
	 * @generated
	 * @ordered
	 */
	protected MappableComponentInterface mappableComponentOfInterest;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface getMappableComponentOfInterest() {
		if (mappableComponentOfInterest != null && mappableComponentOfInterest.eIsProxy()) {
			InternalEObject oldMappableComponentOfInterest = (InternalEObject) mappableComponentOfInterest;
			mappableComponentOfInterest = (MappableComponentInterface) eResolveProxy(oldMappableComponentOfInterest);
			if (mappableComponentOfInterest != oldMappableComponentOfInterest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST, oldMappableComponentOfInterest,
						mappableComponentOfInterest));
			}
		}
		return mappableComponentOfInterest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface basicGetMappableComponentOfInterest() {
		return mappableComponentOfInterest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMappableComponentOfInterest(MappableComponentInterface newMappableComponentOfInterest) {
		MappableComponentInterface oldMappableComponentOfInterest = mappableComponentOfInterest;
		mappableComponentOfInterest = newMappableComponentOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST, oldMappableComponentOfInterest,
				mappableComponentOfInterest));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculationPackage.CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST:
			if (resolve)
				return getMappableComponentOfInterest();
			return basicGetMappableComponentOfInterest();
		case CalculationPackage.CONDITION__VALUE:
			return getValue();
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
		case CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST:
			setMappableComponentOfInterest((MappableComponentInterface) newValue);
			return;
		case CalculationPackage.CONDITION__VALUE:
			setValue((Double) newValue);
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
		case CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST:
			setMappableComponentOfInterest((MappableComponentInterface) null);
			return;
		case CalculationPackage.CONDITION__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case CalculationPackage.CONDITION__MAPPABLE_COMPONENT_OF_INTEREST:
			return mappableComponentOfInterest != null;
		case CalculationPackage.CONDITION__VALUE:
			return value != VALUE_EDEFAULT;
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
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // ConditionImpl
