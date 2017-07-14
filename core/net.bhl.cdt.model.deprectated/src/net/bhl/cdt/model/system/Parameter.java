/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.system.Parameter#getQuantityKind <em>Quantity Kind</em>}</li>
 *   <li>{@link net.bhl.cdt.model.system.Parameter#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.system.SystemPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends SystemModelElement {

	/**
	 * Returns the value of the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Kind</em>' reference.
	 * @see #setQuantityKind(QuantityKind)
	 * @see net.bhl.cdt.model.system.SystemPackage#getParameter_QuantityKind()
	 * @model
	 * @generated
	 */
	QuantityKind getQuantityKind();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.system.Parameter#getQuantityKind <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Kind</em>' reference.
	 * @see #getQuantityKind()
	 * @generated
	 */
	void setQuantityKind(QuantityKind value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.system.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see net.bhl.cdt.model.system.SystemPackage#getParameter_Values()
	 * @model
	 * @generated
	 */
	EList<Value> getValues();
} // Parameter
