/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.YDuplicate;
import net.bhl.cdt.model.system.DecimalNumber;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YDuplicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.impl.YDuplicateImpl#getYDupl <em>YDupl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YDuplicateImpl extends MinimalEObjectImpl.Container implements YDuplicate {
	/**
	 * The cached value of the '{@link #getYDupl() <em>YDupl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDupl()
	 * @generated
	 * @ordered
	 */
	protected DecimalNumber yDupl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDuplicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvlmodelPackage.Literals.YDUPLICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber getYDupl() {
		if (yDupl != null && yDupl.eIsProxy()) {
			InternalEObject oldYDupl = (InternalEObject)yDupl;
			yDupl = (DecimalNumber)eResolveProxy(oldYDupl);
			if (yDupl != oldYDupl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvlmodelPackage.YDUPLICATE__YDUPL, oldYDupl, yDupl));
			}
		}
		return yDupl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumber basicGetYDupl() {
		return yDupl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDupl(DecimalNumber newYDupl) {
		DecimalNumber oldYDupl = yDupl;
		yDupl = newYDupl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvlmodelPackage.YDUPLICATE__YDUPL, oldYDupl, yDupl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvlmodelPackage.YDUPLICATE__YDUPL:
				if (resolve) return getYDupl();
				return basicGetYDupl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AvlmodelPackage.YDUPLICATE__YDUPL:
				setYDupl((DecimalNumber)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AvlmodelPackage.YDUPLICATE__YDUPL:
				setYDupl((DecimalNumber)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AvlmodelPackage.YDUPLICATE__YDUPL:
				return yDupl != null;
		}
		return super.eIsSet(featureID);
	}

} //YDuplicateImpl
