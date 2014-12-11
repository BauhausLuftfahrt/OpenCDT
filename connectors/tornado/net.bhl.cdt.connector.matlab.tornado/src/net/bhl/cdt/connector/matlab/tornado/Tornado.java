/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado;

import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.process.designoperations.DisciplineToolService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tornado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoGeometry <em>Tornado Geometry</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoState <em>Tornado State</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornado()
 * @model
 * @generated
 */
public interface Tornado extends DisciplineToolService, OperationWithOutput {

	String AVLPathPreference = null;

	/**
	 * Returns the value of the '<em><b>Tornado Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tornado Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tornado Geometry</em>' containment reference.
	 * @see #setTornadoGeometry(TornadoGeometry)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornado_TornadoGeometry()
	 * @model containment="true"
	 * @generated
	 */
	TornadoGeometry getTornadoGeometry();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoGeometry <em>Tornado Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tornado Geometry</em>' containment reference.
	 * @see #getTornadoGeometry()
	 * @generated
	 */
	void setTornadoGeometry(TornadoGeometry value);

	/**
	 * Returns the value of the '<em><b>Tornado State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tornado State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tornado State</em>' containment reference.
	 * @see #setTornadoState(TornadoState)
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#getTornado_TornadoState()
	 * @model containment="true"
	 * @generated
	 */
	TornadoState getTornadoState();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.matlab.tornado.Tornado#getTornadoState <em>Tornado State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tornado State</em>' containment reference.
	 * @see #getTornadoState()
	 * @generated
	 */
	void setTornadoState(TornadoState value);

	

	
} // Tornado
