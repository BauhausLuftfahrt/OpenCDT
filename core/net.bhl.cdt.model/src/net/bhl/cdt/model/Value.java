/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model;

import javax.units.Unit;

import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.Value#getUnit <em>Unit</em>}</li>
 * <li>{@link net.bhl.cdt.model.Value#getDescription <em>Description</em>}</li>
 * <li>{@link net.bhl.cdt.model.Value#getSource <em>Source</em>}</li>
 * <li>{@link net.bhl.cdt.model.Value#getValue <em>Value</em>}</li>
 * <li>{@link net.bhl.cdt.model.Value#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.ModelPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Element {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(Unit)
	 * @see net.bhl.cdt.model.ModelPackage#getValue_Unit()
	 * @model dataType="net.bhl.cdt.utilities.units.Unit"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Value#getUnit <em>Unit</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.bhl.cdt.model.ModelPackage#getValue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Value#getDescription <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see net.bhl.cdt.model.ModelPackage#getValue_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Value#getSource <em>Source</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see net.bhl.cdt.model.ModelPackage#getValue_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Value#getValue <em>Value</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.utilities.datatypes.DataType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getValue_Datatypes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

} // Value
