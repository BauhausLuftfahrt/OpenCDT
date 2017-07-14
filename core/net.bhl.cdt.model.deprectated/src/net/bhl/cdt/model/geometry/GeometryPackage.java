/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.geometry;

import net.bhl.cdt.model.system.SystemPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/geometry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = net.bhl.cdt.model.geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.geometry.impl.SpaceVectorImpl <em>Space Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.geometry.impl.SpaceVectorImpl
	 * @see net.bhl.cdt.model.geometry.impl.GeometryPackageImpl#getSpaceVector()
	 * @generated
	 */
	int SPACE_VECTOR = 0;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__SOURCE_OPERATION = SystemPackage.VALUE__SOURCE_OPERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__NAME = SystemPackage.VALUE__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__STATES = SystemPackage.VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__PARAMETER = SystemPackage.VALUE__PARAMETER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__X = SystemPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__Y = SystemPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR__Z = SystemPackage.VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Space Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR_FEATURE_COUNT = SystemPackage.VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Space Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_VECTOR_OPERATION_COUNT = SystemPackage.VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.geometry.SpaceVector <em>Space Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Vector</em>'.
	 * @see net.bhl.cdt.model.geometry.SpaceVector
	 * @generated
	 */
	EClass getSpaceVector();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.geometry.SpaceVector#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.bhl.cdt.model.geometry.SpaceVector#getX()
	 * @see #getSpaceVector()
	 * @generated
	 */
	EAttribute getSpaceVector_X();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.geometry.SpaceVector#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.bhl.cdt.model.geometry.SpaceVector#getY()
	 * @see #getSpaceVector()
	 * @generated
	 */
	EAttribute getSpaceVector_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.geometry.SpaceVector#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.bhl.cdt.model.geometry.SpaceVector#getZ()
	 * @see #getSpaceVector()
	 * @generated
	 */
	EAttribute getSpaceVector_Z();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.geometry.impl.SpaceVectorImpl <em>Space Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.geometry.impl.SpaceVectorImpl
		 * @see net.bhl.cdt.model.geometry.impl.GeometryPackageImpl#getSpaceVector()
		 * @generated
		 */
		EClass SPACE_VECTOR = eINSTANCE.getSpaceVector();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_VECTOR__X = eINSTANCE.getSpaceVector_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_VECTOR__Y = eINSTANCE.getSpaceVector_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_VECTOR__Z = eINSTANCE.getSpaceVector_Z();

	}

} //GeometryPackage
