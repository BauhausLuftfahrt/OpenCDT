/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation.impl;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Parameter Descriptor To Mappable Component Interface Map</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl#getTypedKey <em>
 * Key</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl#getTypedValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterDescriptorToMappableComponentInterfaceMapImpl extends EObjectImpl implements
	BasicEMap.Entry<ParameterDescriptor, MappableComponentInterface> {
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected ParameterDescriptor key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected MappableComponentInterface value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterDescriptorToMappableComponentInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculationPackage.Literals.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterDescriptor getTypedKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject) key;
			key = (ParameterDescriptor) eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterDescriptor basicGetTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedKey(ParameterDescriptor newKey) {
		ParameterDescriptor oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface getTypedValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (MappableComponentInterface) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE, oldValue,
						value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface basicGetTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypedValue(MappableComponentInterface newValue) {
		MappableComponentInterface oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY:
			if (resolve)
				return getTypedKey();
			return basicGetTypedKey();
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE:
			if (resolve)
				return getTypedValue();
			return basicGetTypedValue();
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
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY:
			setTypedKey((ParameterDescriptor) newValue);
			return;
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE:
			setTypedValue((MappableComponentInterface) newValue);
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
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY:
			setTypedKey((ParameterDescriptor) null);
			return;
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE:
			setTypedValue((MappableComponentInterface) null);
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
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY:
			return key != null;
		case CalculationPackage.PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterDescriptor getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKey(ParameterDescriptor key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MappableComponentInterface setValue(MappableComponentInterface value) {
		MappableComponentInterface oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<ParameterDescriptor, MappableComponentInterface> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<ParameterDescriptor, MappableComponentInterface>) container
			.eGet(eContainmentFeature());
	}

} // ParameterDescriptorToMappableComponentInterfaceMapImpl
