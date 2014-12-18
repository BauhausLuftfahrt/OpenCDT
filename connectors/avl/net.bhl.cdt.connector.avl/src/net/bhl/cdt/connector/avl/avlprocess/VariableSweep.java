/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlprocess;

import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.system.DecimalNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Sweep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableStart <em>Variable Start</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableEnd <em>Variable End</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableDelta <em>Variable Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getVariableSweep()
 * @model
 * @generated
 */
public interface VariableSweep extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Variable Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Start</em>' reference.
	 * @see #setVariableStart(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getVariableSweep_VariableStart()
	 * @model
	 * @generated
	 */
	DecimalNumber getVariableStart();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableStart <em>Variable Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Start</em>' reference.
	 * @see #getVariableStart()
	 * @generated
	 */
	void setVariableStart(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Variable End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable End</em>' reference.
	 * @see #setVariableEnd(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getVariableSweep_VariableEnd()
	 * @model
	 * @generated
	 */
	DecimalNumber getVariableEnd();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableEnd <em>Variable End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable End</em>' reference.
	 * @see #getVariableEnd()
	 * @generated
	 */
	void setVariableEnd(DecimalNumber value);

	/**
	 * Returns the value of the '<em><b>Variable Delta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Delta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Delta</em>' reference.
	 * @see #setVariableDelta(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getVariableSweep_VariableDelta()
	 * @model
	 * @generated
	 */
	DecimalNumber getVariableDelta();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableDelta <em>Variable Delta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Delta</em>' reference.
	 * @see #getVariableDelta()
	 * @generated
	 */
	void setVariableDelta(DecimalNumber value);

} // VariableSweep
