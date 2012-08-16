/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.utilities.units.Quantity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mappable Component Interface</b></em>'. <!--
 * end-user-doc -->
 *
 *
 * @see net.bhl.cdt.model.ModelPackage#getMappableComponentInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MappableComponentInterface extends ComponentInterface {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getValue();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasValue();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value getValue(CalculationSpaceQualifier calcSpaceQualifier);

} // MappableComponentInterface
