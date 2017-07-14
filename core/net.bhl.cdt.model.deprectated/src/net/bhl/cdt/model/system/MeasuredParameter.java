/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system;

import javax.measure.unit.Unit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.system.MeasuredParameter#getDefaultUnit <em>Default Unit</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.system.SystemPackage#getMeasuredParameter()
 * @model
 * @generated
 */
public interface MeasuredParameter extends SystemModelElement, Parameter {
	/**
	 * Returns the value of the '<em><b>Default Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Unit</em>' attribute.
	 * @see #setDefaultUnit(Unit)
	 * @see net.bhl.cdt.model.system.SystemPackage#getMeasuredParameter_DefaultUnit()
	 * @model dataType="net.bhl.cdt.model.units.Unit<?>"
	 * @generated
	 */
	Unit<?> getDefaultUnit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.system.MeasuredParameter#getDefaultUnit <em>Default Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Unit</em>' attribute.
	 * @see #getDefaultUnit()
	 * @generated
	 */
	void setDefaultUnit(Unit<?> value);

} // MeasuredParameter
