/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composite Values</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.utilities.datatypes.CompositeValues#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.utilities.datatypes.DatatypesPackage#getCompositeValues()
 * @model
 * @generated
 */
public interface CompositeValues extends DataType {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.utilities.datatypes.DataType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see net.bhl.cdt.utilities.datatypes.DatatypesPackage#getCompositeValues_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getDimensions();

} // CompositeValues
