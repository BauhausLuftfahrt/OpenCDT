/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.exchangemodel.impl;

import java.util.Collection;

import net.bhl.cdt.utilities.exchangemodel.Composite;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;
import net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Composite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link net.bhl.cdt.utilities.exchangemodel.impl.CompositeImpl#getContainments <em>Containments</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompositeImpl extends ExchangeElementImpl implements Composite {
	/**
	 * The cached value of the '{@link #getContainments() <em>Containments</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeElement> containments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangemodelPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExchangeElement> getContainments() {
		if (containments == null) {
			containments = new EObjectContainmentEList.Resolving<ExchangeElement>(ExchangeElement.class, this,
				ExchangemodelPackage.COMPOSITE__CONTAINMENTS);
		}
		return containments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExchangemodelPackage.COMPOSITE__CONTAINMENTS:
			return ((InternalEList<?>) getContainments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExchangemodelPackage.COMPOSITE__CONTAINMENTS:
			return getContainments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExchangemodelPackage.COMPOSITE__CONTAINMENTS:
			getContainments().clear();
			getContainments().addAll((Collection<? extends ExchangeElement>) newValue);
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
		case ExchangemodelPackage.COMPOSITE__CONTAINMENTS:
			getContainments().clear();
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
		case ExchangemodelPackage.COMPOSITE__CONTAINMENTS:
			return containments != null && !containments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CompositeImpl
