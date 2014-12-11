/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl;

import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
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
 * @see net.bhl.cdt.connector.avl.AvlFactory
 * @model kind="package"
 * @generated
 */
public interface AvlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/connector/avl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.connector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvlPackage eINSTANCE = net.bhl.cdt.connector.avl.impl.AvlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.impl.AVLImpl <em>AVL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.impl.AVLImpl
	 * @see net.bhl.cdt.connector.avl.impl.AvlPackageImpl#getAVL()
	 * @generated
	 */
	int AVL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL__NAME = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL__BUSY = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL__TIME_STAMP = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL__DESIGN_PROCESS_ELEMENTS = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The number of structural features of the '<em>AVL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_FEATURE_COUNT = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL___START = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL___IS_STARTABLE = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL___GET_STRATEGY__ECLASS = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>AVL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_OPERATION_COUNT = DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.AVL <em>AVL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL</em>'.
	 * @see net.bhl.cdt.connector.avl.AVL
	 * @generated
	 */
	EClass getAVL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvlFactory getAvlFactory();

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
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.impl.AVLImpl <em>AVL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.impl.AVLImpl
		 * @see net.bhl.cdt.connector.avl.impl.AvlPackageImpl#getAVL()
		 * @generated
		 */
		EClass AVL = eINSTANCE.getAVL();

	}

} //AvlPackage
