/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.basecalculationmodel.impl;

import javax.units.Unit;

import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Descriptor</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl#getLabel <em>Label</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl#getQuantity <em>Quantity</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterDescriptorImpl extends EObjectImpl implements ParameterDescriptor {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Quantity QUANTITY_EDEFAULT = Quantity.LENGTH;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Unit UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EClass DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EClass dataType = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasecalculationmodelPackage.Literals.PARAMETER_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity == null ? QUANTITY_EDEFAULT : newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDataType(EClass newDataType) {
		EClass oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__LABEL:
			return getLabel();
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__QUANTITY:
			return getQuantity();
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__UNIT:
			return getUnit();
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__DATA_TYPE:
			return getDataType();
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
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__LABEL:
			setLabel((String) newValue);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__QUANTITY:
			setQuantity((Quantity) newValue);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__UNIT:
			setUnit((Unit) newValue);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__DATA_TYPE:
			setDataType((EClass) newValue);
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
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
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
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case BasecalculationmodelPackage.PARAMETER_DESCRIPTOR__DATA_TYPE:
			return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", unit: ");
		result.append(unit);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} // ParameterDescriptorImpl
