/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.Parameter#getValues <em>Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.Parameter#getDefaultUnit <em>Default Unit</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.ModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends StructuralElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.datatypes.DataType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getParameter_Values()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataType> getValues();

	/**
	 * Returns the value of the '<em><b>Default Unit</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Unit</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Unit</em>' attribute.
	 * @see #setDefaultUnit(Unit)
	 * @see net.bhl.cdt.model.ModelPackage#getParameter_DefaultUnit()
	 * @model dataType="net.bhl.cdt.model.units.Unit"
	 * @generated
	 */
	Unit<?> getDefaultUnit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Parameter#getDefaultUnit <em>Default Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Default Unit</em>' attribute.
	 * @see #getDefaultUnit()
	 * @generated
	 */
	void setDefaultUnit(Unit value);

} // Parameter
