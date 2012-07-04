/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import net.bhl.cdt.utilities.units.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.Parameter#getValues <em>Values</em>}</li>
 * <li>{@link net.bhl.cdt.model.Parameter#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.ModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends StructuralElement, MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.Value}. <!-- begin-user-doc -->
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
	EList<Value> getValues();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute. The literals are from the enumeration
	 * {@link net.bhl.cdt.utilities.units.Quantity}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @see #setQuantity(Quantity)
	 * @see net.bhl.cdt.model.ModelPackage#getParameter_Quantity()
	 * @model
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.Parameter#getQuantity <em>Quantity</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

} // Parameter
