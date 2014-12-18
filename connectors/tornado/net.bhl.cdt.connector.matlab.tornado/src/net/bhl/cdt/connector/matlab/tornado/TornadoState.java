/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado;

import net.bhl.cdt.model.system.MeasuredValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getRho <em>Rho</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAirSpeed <em>Air Speed</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoState()
 * @model
 * @generated
 */
public interface TornadoState extends EObject {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' reference.
	 * @see #setAltitude(MeasuredValue)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoState_Altitude()
	 * @model
	 * @generated
	 */
	MeasuredValue getAltitude();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAltitude <em>Altitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(MeasuredValue value);

	/**
	 * Returns the value of the '<em><b>Rho</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rho</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rho</em>' reference.
	 * @see #setRho(MeasuredValue)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoState_Rho()
	 * @model
	 * @generated
	 */
	MeasuredValue getRho();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getRho <em>Rho</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rho</em>' reference.
	 * @see #getRho()
	 * @generated
	 */
	void setRho(MeasuredValue value);

	/**
	 * Returns the value of the '<em><b>Air Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Speed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Speed</em>' reference.
	 * @see #setAirSpeed(MeasuredValue)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoState_AirSpeed()
	 * @model
	 * @generated
	 */
	MeasuredValue getAirSpeed();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAirSpeed <em>Air Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Speed</em>' reference.
	 * @see #getAirSpeed()
	 * @generated
	 */
	void setAirSpeed(MeasuredValue value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' reference.
	 * @see #setAlpha(MeasuredValue)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoState_Alpha()
	 * @model
	 * @generated
	 */
	MeasuredValue getAlpha();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.TornadoState#getAlpha <em>Alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' reference.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(MeasuredValue value);

} // TornadoState
