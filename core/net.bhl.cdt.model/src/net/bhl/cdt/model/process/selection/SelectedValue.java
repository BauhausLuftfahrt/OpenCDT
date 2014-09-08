/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.system.Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.SelectedValue#getAppliedCriteria <em>Applied Criteria</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.SelectedValue#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.SelectedValue#getSelectedValues <em>Selected Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getSelectedValue()
 * @model
 * @generated
 */
public interface SelectedValue extends Value, ProcessElement {
	/**
	 * Returns the value of the '<em><b>Applied Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Criteria</em>' reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getSelectedValue_AppliedCriteria()
	 * @model
	 * @generated
	 */
	EList<ValueSelectionCriterion> getAppliedCriteria();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.ValueSelectionArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getSelectedValue_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSelectionArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Selected Values</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.system.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Values</em>' reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getSelectedValue_SelectedValues()
	 * @model
	 * @generated
	 */
	EList<Value> getSelectedValues();

} // SelectedValue
