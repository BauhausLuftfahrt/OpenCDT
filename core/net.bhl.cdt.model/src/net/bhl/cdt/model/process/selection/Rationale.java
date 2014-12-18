/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import net.bhl.cdt.model.NamedElement;


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rationale</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.selection.Rationale#getRationaleDescription <em>Rationale Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getRationale()
 * @model abstract="true"
 * @generated
 */
public interface Rationale extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Description</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Description</em>' attribute.
	 * @see #setRationaleDescription(String)
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#getRationale_RationaleDescription()
	 * @model
	 * @generated
	 */
	String getRationaleDescription();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.selection.Rationale#getRationaleDescription <em>Rationale Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Description</em>' attribute.
	 * @see #getRationaleDescription()
	 * @generated
	 */
	void setRationaleDescription(String value);

} // Rationale
