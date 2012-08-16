/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.resources;

import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Structural Data</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.resources.StructuralData#getModelElements <em>Model
 * Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.resources.ResourcesPackage#getStructuralData()
 * @model
 * @generated
 */
public interface StructuralData extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model Elements</em>' containment reference
	 *         list.
	 * @see net.bhl.cdt.resources.ResourcesPackage#getStructuralData_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getModelElements();

} // StructuralData
