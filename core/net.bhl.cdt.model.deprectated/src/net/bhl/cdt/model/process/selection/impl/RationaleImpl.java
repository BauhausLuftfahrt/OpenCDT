/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import net.bhl.cdt.model.impl.NamedElementImpl;
import net.bhl.cdt.model.process.selection.Rationale;
import net.bhl.cdt.model.process.selection.SelectionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rationale</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.impl.RationaleImpl#getRationaleDescription <em>Rationale Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RationaleImpl extends NamedElementImpl implements Rationale {
	/**
	 * The default value of the '{@link #getRationaleDescription() <em>Rationale Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRationaleDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationaleDescription() <em>Rationale Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRationaleDescription()
	 * @generated
	 * @ordered
	 */
	protected String rationaleDescription = RATIONALE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.RATIONALE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationaleDescription() {
		return rationaleDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationaleDescription(String newRationaleDescription) {
		String oldRationaleDescription = rationaleDescription;
		rationaleDescription = newRationaleDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.RATIONALE__RATIONALE_DESCRIPTION, oldRationaleDescription, rationaleDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.RATIONALE__RATIONALE_DESCRIPTION:
				return getRationaleDescription();
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
			case SelectionPackage.RATIONALE__RATIONALE_DESCRIPTION:
				setRationaleDescription((String)newValue);
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
			case SelectionPackage.RATIONALE__RATIONALE_DESCRIPTION:
				setRationaleDescription(RATIONALE_DESCRIPTION_EDEFAULT);
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
			case SelectionPackage.RATIONALE__RATIONALE_DESCRIPTION:
				return RATIONALE_DESCRIPTION_EDEFAULT == null ? rationaleDescription != null : !RATIONALE_DESCRIPTION_EDEFAULT.equals(rationaleDescription);
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
		result.append(" (rationaleDescription: ");
		result.append(rationaleDescription);
		result.append(')');
		return result.toString();
	}

} // RationaleImpl
