/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Process</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.qualification.impl.ProcessImpl#getInitState <em>Init State</em>}</li>
 *   <li>{@link net.bhl.cdt.model.qualification.impl.ProcessImpl#getFinState <em>Fin State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessImpl extends BehaviouralQualifierImpl implements net.bhl.cdt.model.qualification.Process {
	/**
	 * The cached value of the '{@link #getInitState() <em>Init State</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected State initState;

	/**
	 * The cached value of the '{@link #getFinState() <em>Fin State</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFinState()
	 * @generated
	 * @ordered
	 */
	protected State finState;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitState() {
		if (initState != null && initState.eIsProxy()) {
			InternalEObject oldInitState = (InternalEObject)initState;
			initState = (State)eResolveProxy(oldInitState);
			if (initState != oldInitState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualificationPackage.PROCESS__INIT_STATE, oldInitState, initState));
			}
		}
		return initState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitState() {
		return initState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitState(State newInitState) {
		State oldInitState = initState;
		initState = newInitState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualificationPackage.PROCESS__INIT_STATE, oldInitState, initState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public State getFinState() {
		if (finState != null && finState.eIsProxy()) {
			InternalEObject oldFinState = (InternalEObject)finState;
			finState = (State)eResolveProxy(oldFinState);
			if (finState != oldFinState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualificationPackage.PROCESS__FIN_STATE, oldFinState, finState));
			}
		}
		return finState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFinState() {
		return finState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinState(State newFinState) {
		State oldFinState = finState;
		finState = newFinState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualificationPackage.PROCESS__FIN_STATE, oldFinState, finState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualificationPackage.PROCESS__INIT_STATE:
				if (resolve) return getInitState();
				return basicGetInitState();
			case QualificationPackage.PROCESS__FIN_STATE:
				if (resolve) return getFinState();
				return basicGetFinState();
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
			case QualificationPackage.PROCESS__INIT_STATE:
				setInitState((State)newValue);
				return;
			case QualificationPackage.PROCESS__FIN_STATE:
				setFinState((State)newValue);
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
			case QualificationPackage.PROCESS__INIT_STATE:
				setInitState((State)null);
				return;
			case QualificationPackage.PROCESS__FIN_STATE:
				setFinState((State)null);
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
			case QualificationPackage.PROCESS__INIT_STATE:
				return initState != null;
			case QualificationPackage.PROCESS__FIN_STATE:
				return finState != null;
		}
		return super.eIsSet(featureID);
	}

} // ProcessImpl
