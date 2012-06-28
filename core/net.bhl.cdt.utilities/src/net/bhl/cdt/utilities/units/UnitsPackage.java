/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.units;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.utilities.units.UnitsFactory
 * @model kind="package"
 * @generated
 */
public interface UnitsPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/utilities/units";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	UnitsPackage eINSTANCE = net.bhl.cdt.utilities.units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.units.Quantity <em>Quantity</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @see net.bhl.cdt.utilities.units.impl.UnitsPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 0;

	/**
	 * The meta object id for the '<em>Unit</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see javax.units.Unit
	 * @see net.bhl.cdt.utilities.units.impl.UnitsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.utilities.units.Quantity <em>Quantity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Quantity</em>'.
	 * @see net.bhl.cdt.utilities.units.Quantity
	 * @generated
	 */
	EEnum getQuantity();

	/**
	 * Returns the meta object for data type '{@link javax.units.Unit <em>Unit</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.units.Unit
	 * @model instanceClass="javax.units.Unit"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.units.Quantity <em>Quantity</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.units.Quantity
		 * @see net.bhl.cdt.utilities.units.impl.UnitsPackageImpl#getQuantity()
		 * @generated
		 */
		EEnum QUANTITY = eINSTANCE.getQuantity();
		/**
		 * The meta object literal for the '<em>Unit</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see javax.units.Unit
		 * @see net.bhl.cdt.utilities.units.impl.UnitsPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

	}

} // UnitsPackage
