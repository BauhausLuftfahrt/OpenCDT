/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.impl;

import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.connector.matlab.tornado.TornadoState;
import net.bhl.cdt.model.system.MeasuredValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl#getRho <em>Rho</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl#getAirSpeed <em>Air Speed</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.impl.TornadoStateImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TornadoStateImpl extends MinimalEObjectImpl.Container implements TornadoState {
	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected MeasuredValue altitude;

	/**
	 * The cached value of the '{@link #getRho() <em>Rho</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho()
	 * @generated
	 * @ordered
	 */
	protected MeasuredValue rho;

	/**
	 * The cached value of the '{@link #getAirSpeed() <em>Air Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected MeasuredValue airSpeed;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected MeasuredValue alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TornadoStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TornadoPackage.Literals.TORNADO_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue getAltitude() {
		if (altitude != null && altitude.eIsProxy()) {
			InternalEObject oldAltitude = (InternalEObject)altitude;
			altitude = (MeasuredValue)eResolveProxy(oldAltitude);
			if (altitude != oldAltitude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TornadoPackage.TORNADO_STATE__ALTITUDE, oldAltitude, altitude));
			}
		}
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue basicGetAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(MeasuredValue newAltitude) {
		MeasuredValue oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO_STATE__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue getRho() {
		if (rho != null && rho.eIsProxy()) {
			InternalEObject oldRho = (InternalEObject)rho;
			rho = (MeasuredValue)eResolveProxy(oldRho);
			if (rho != oldRho) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TornadoPackage.TORNADO_STATE__RHO, oldRho, rho));
			}
		}
		return rho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue basicGetRho() {
		return rho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRho(MeasuredValue newRho) {
		MeasuredValue oldRho = rho;
		rho = newRho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO_STATE__RHO, oldRho, rho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue getAirSpeed() {
		if (airSpeed != null && airSpeed.eIsProxy()) {
			InternalEObject oldAirSpeed = (InternalEObject)airSpeed;
			airSpeed = (MeasuredValue)eResolveProxy(oldAirSpeed);
			if (airSpeed != oldAirSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TornadoPackage.TORNADO_STATE__AIR_SPEED, oldAirSpeed, airSpeed));
			}
		}
		return airSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue basicGetAirSpeed() {
		return airSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirSpeed(MeasuredValue newAirSpeed) {
		MeasuredValue oldAirSpeed = airSpeed;
		airSpeed = newAirSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO_STATE__AIR_SPEED, oldAirSpeed, airSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue getAlpha() {
		if (alpha != null && alpha.eIsProxy()) {
			InternalEObject oldAlpha = (InternalEObject)alpha;
			alpha = (MeasuredValue)eResolveProxy(oldAlpha);
			if (alpha != oldAlpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TornadoPackage.TORNADO_STATE__ALPHA, oldAlpha, alpha));
			}
		}
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue basicGetAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(MeasuredValue newAlpha) {
		MeasuredValue oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TornadoPackage.TORNADO_STATE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TornadoPackage.TORNADO_STATE__ALTITUDE:
				if (resolve) return getAltitude();
				return basicGetAltitude();
			case TornadoPackage.TORNADO_STATE__RHO:
				if (resolve) return getRho();
				return basicGetRho();
			case TornadoPackage.TORNADO_STATE__AIR_SPEED:
				if (resolve) return getAirSpeed();
				return basicGetAirSpeed();
			case TornadoPackage.TORNADO_STATE__ALPHA:
				if (resolve) return getAlpha();
				return basicGetAlpha();
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
			case TornadoPackage.TORNADO_STATE__ALTITUDE:
				setAltitude((MeasuredValue)newValue);
				return;
			case TornadoPackage.TORNADO_STATE__RHO:
				setRho((MeasuredValue)newValue);
				return;
			case TornadoPackage.TORNADO_STATE__AIR_SPEED:
				setAirSpeed((MeasuredValue)newValue);
				return;
			case TornadoPackage.TORNADO_STATE__ALPHA:
				setAlpha((MeasuredValue)newValue);
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
			case TornadoPackage.TORNADO_STATE__ALTITUDE:
				setAltitude((MeasuredValue)null);
				return;
			case TornadoPackage.TORNADO_STATE__RHO:
				setRho((MeasuredValue)null);
				return;
			case TornadoPackage.TORNADO_STATE__AIR_SPEED:
				setAirSpeed((MeasuredValue)null);
				return;
			case TornadoPackage.TORNADO_STATE__ALPHA:
				setAlpha((MeasuredValue)null);
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
			case TornadoPackage.TORNADO_STATE__ALTITUDE:
				return altitude != null;
			case TornadoPackage.TORNADO_STATE__RHO:
				return rho != null;
			case TornadoPackage.TORNADO_STATE__AIR_SPEED:
				return airSpeed != null;
			case TornadoPackage.TORNADO_STATE__ALPHA:
				return alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //TornadoStateImpl
