/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlprocess;

import net.bhl.cdt.connector.files.FileGenerator;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVL Process Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getVariableSweeps <em>Variable Sweeps</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getCommandFileName <em>Command File Name</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getRuncaseCounter <em>Runcase Counter</em>}</li>
 *   <li>{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getAvlResultImporters <em>Avl Result Importers</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getAVLProcessGenerator()
 * @model
 * @generated
 */
public interface AVLProcessGenerator extends FileGenerator {
	/**
	 * Returns the value of the '<em><b>Variable Sweeps</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Sweeps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Sweeps</em>' containment reference list.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getAVLProcessGenerator_VariableSweeps()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableSweep> getVariableSweeps();

	/**
	 * Returns the value of the '<em><b>Command File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command File Name</em>' attribute.
	 * @see #setCommandFileName(String)
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getAVLProcessGenerator_CommandFileName()
	 * @model
	 * @generated
	 */
	String getCommandFileName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getCommandFileName <em>Command File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command File Name</em>' attribute.
	 * @see #getCommandFileName()
	 * @generated
	 */
	void setCommandFileName(String value);

	/**
	 * Returns the value of the '<em><b>Runcase Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runcase Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runcase Counter</em>' attribute.
	 * @see #setRuncaseCounter(int)
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getAVLProcessGenerator_RuncaseCounter()
	 * @model
	 * @generated
	 */
	int getRuncaseCounter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getRuncaseCounter <em>Runcase Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runcase Counter</em>' attribute.
	 * @see #getRuncaseCounter()
	 * @generated
	 */
	void setRuncaseCounter(int value);

	/**
	 * Returns the value of the '<em><b>Avl Result Importers</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avl Result Importers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avl Result Importers</em>' containment reference list.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#getAVLProcessGenerator_AvlResultImporters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AVLResultImporter> getAvlResultImporters();

} // AVLProcessGenerator
