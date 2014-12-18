/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.NameCriterion#getValueName <em>Value Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getNameCriterion()
 * @model
 * @generated
 */
public interface NameCriterion extends ValueSelectionCriterion {
	/**
	 * Returns the value of the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Name</em>' attribute.
	 * @see #setValueName(String)
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getNameCriterion_ValueName()
	 * @model
	 * @generated
	 */
	String getValueName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.selection.NameCriterion#getValueName <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Name</em>' attribute.
	 * @see #getValueName()
	 * @generated
	 */
	void setValueName(String value);

} // NameCriterion
