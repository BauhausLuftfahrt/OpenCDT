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
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.TornadoGeometry#getSweepAngle <em>Sweep Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoGeometry()
 * @model
 * @generated
 */
public interface TornadoGeometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Sweep Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sweep Angle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sweep Angle</em>' reference.
	 * @see #setSweepAngle(MeasuredValue)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornadoGeometry_SweepAngle()
	 * @model
	 * @generated
	 */
	MeasuredValue getSweepAngle();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.TornadoGeometry#getSweepAngle <em>Sweep Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sweep Angle</em>' reference.
	 * @see #getSweepAngle()
	 * @generated
	 */
	void setSweepAngle(MeasuredValue value);

} // TornadoGeometry
