/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.impl;

import net.bhl.cdt.connector.matlab.tornado.TornadoGeometry;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.model.system.MeasuredValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoGeometryImpl#getSweepAngle <em>Sweep Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TornadoGeometryImpl extends MinimalEObjectImpl.Container implements TornadoGeometry {
	/**
	 * The cached value of the '{@link #getSweepAngle() <em>Sweep Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepAngle()
	 * @generated
	 * @ordered
	 */
	protected MeasuredValue sweepAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TornadoGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TornadoPackage.Literals.TORNADO_GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue getSweepAngle() {
		if (sweepAngle != null && sweepAngle.eIsProxy()) {
			InternalEObject oldSweepAngle = (InternalEObject)sweepAngle;
			sweepAngle = (MeasuredValue)eResolveProxy(oldSweepAngle);
			if (sweepAngle != oldSweepAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE, oldSweepAngle, sweepAngle));
			}
		}
		return sweepAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue basicGetSweepAngle() {
		return sweepAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweepAngle(MeasuredValue newSweepAngle) {
		MeasuredValue oldSweepAngle = sweepAngle;
		sweepAngle = newSweepAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE, oldSweepAngle, sweepAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE:
				if (resolve) return getSweepAngle();
				return basicGetSweepAngle();
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
			case TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE:
				setSweepAngle((MeasuredValue)newValue);
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
			case TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE:
				setSweepAngle((MeasuredValue)null);
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
			case TornadoPackage.TORNADO_GEOMETRY__SWEEP_ANGLE:
				return sweepAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //TornadoGeometryImpl
