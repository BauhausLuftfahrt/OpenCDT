/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system.impl;

import java.util.Collection;

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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.system.impl.ParameterImpl#getQuantityKind <em>Quantity Kind</em>}</li>
 *   <li>{@link net.bhl.cdt.model.system.impl.ParameterImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends SystemModelElementImpl implements Parameter {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.PARAMETER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.PARAMETER__QUANTITY_KIND, oldQuantityKind, quantityKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.PARAMETER__QUANTITY_KIND, oldQuantityKind, quantityKind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<Value>(Value.class, this, SystemPackage.PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.PARAMETER__QUANTITY_KIND:
				if (resolve) return getQuantityKind();
				return basicGetQuantityKind();
			case SystemPackage.PARAMETER__VALUES:
				return getValues();
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
			case SystemPackage.PARAMETER__QUANTITY_KIND:
				setQuantityKind((QuantityKind)newValue);
				return;
			case SystemPackage.PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case SystemPackage.PARAMETER__QUANTITY_KIND:
				setQuantityKind((QuantityKind)null);
				return;
			case SystemPackage.PARAMETER__VALUES:
				getValues().clear();
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
			case SystemPackage.PARAMETER__QUANTITY_KIND:
				return quantityKind != null;
			case SystemPackage.PARAMETER__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ParameterImpl
