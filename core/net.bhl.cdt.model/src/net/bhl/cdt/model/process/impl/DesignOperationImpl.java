/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.impl;

import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.impl.DesignOperationImpl#getSuperprocess <em>Superprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DesignOperationImpl extends ProcessElementImpl implements DesignOperation {
	/**
	 * The cached value of the '{@link #getSuperprocess() <em>Superprocess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperprocess()
	 * @generated
	 * @ordered
	 */
	protected DesignProcess superprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.DESIGN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignProcess getSuperprocess() {
		if (superprocess != null && superprocess.eIsProxy()) {
			InternalEObject oldSuperprocess = (InternalEObject)superprocess;
			superprocess = (DesignProcess)eResolveProxy(oldSuperprocess);
			if (superprocess != oldSuperprocess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.DESIGN_OPERATION__SUPERPROCESS, oldSuperprocess, superprocess));
			}
		}
		return superprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignProcess basicGetSuperprocess() {
		return superprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperprocess(DesignProcess newSuperprocess) {
		DesignProcess oldSuperprocess = superprocess;
		superprocess = newSuperprocess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DESIGN_OPERATION__SUPERPROCESS, oldSuperprocess, superprocess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.DESIGN_OPERATION__SUPERPROCESS:
				if (resolve) return getSuperprocess();
				return basicGetSuperprocess();
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
			case ProcessPackage.DESIGN_OPERATION__SUPERPROCESS:
				setSuperprocess((DesignProcess)newValue);
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
			case ProcessPackage.DESIGN_OPERATION__SUPERPROCESS:
				setSuperprocess((DesignProcess)null);
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
			case ProcessPackage.DESIGN_OPERATION__SUPERPROCESS:
				return superprocess != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignOperationImpl
