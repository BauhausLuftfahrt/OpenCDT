/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.geometry;

import java.math.BigDecimal;

import net.bhl.cdt.model.system.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.geometry.SpaceVector#getX <em>X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.geometry.SpaceVector#getY <em>Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.geometry.SpaceVector#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.geometry.GeometryPackage#getSpaceVector()
 * @model
 * @generated
 */
public interface SpaceVector extends Value {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigDecimal)
	 * @see net.bhl.cdt.model.geometry.GeometryPackage#getSpaceVector_X()
	 * @model
	 * @generated
	 */
	BigDecimal getX();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.geometry.SpaceVector#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigDecimal)
	 * @see net.bhl.cdt.model.geometry.GeometryPackage#getSpaceVector_Y()
	 * @model
	 * @generated
	 */
	BigDecimal getY();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.geometry.SpaceVector#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(BigDecimal)
	 * @see net.bhl.cdt.model.geometry.GeometryPackage#getSpaceVector_Z()
	 * @model
	 * @generated
	 */
	BigDecimal getZ();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.geometry.SpaceVector#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(BigDecimal value);

} // SpaceVector
