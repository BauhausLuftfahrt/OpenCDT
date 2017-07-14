/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import net.bhl.cdt.model.process.ProcessElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.ValueSelection#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.ValueSelection#getSelectedValues <em>Selected Values</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelection()
 * @model
 * @generated
 */
public interface ValueSelection extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelection_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSelectionCriterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Selected Values</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.SelectedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Values</em>' containment reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelection_SelectedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectedValue> getSelectedValues();

} // ValueSelection
