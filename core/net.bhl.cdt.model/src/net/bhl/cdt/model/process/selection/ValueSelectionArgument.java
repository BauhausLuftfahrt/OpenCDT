/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Selection Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument#getSupportedCriteria <em>Supported Criteria</em>}</li>
 *   <li>{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument#getOpposedCriteria <em>Opposed Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelectionArgument()
 * @model
 * @generated
 */
public interface ValueSelectionArgument extends Rationale {
	/**
	 * Returns the value of the '<em><b>Supported Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Criteria</em>' reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelectionArgument_SupportedCriteria()
	 * @model
	 * @generated
	 */
	EList<ValueSelectionCriterion> getSupportedCriteria();

	/**
	 * Returns the value of the '<em><b>Opposed Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposed Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposed Criteria</em>' reference list.
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getValueSelectionArgument_OpposedCriteria()
	 * @model
	 * @generated
	 */
	EList<ValueSelectionCriterion> getOpposedCriteria();

} // ValueSelectionArgument
