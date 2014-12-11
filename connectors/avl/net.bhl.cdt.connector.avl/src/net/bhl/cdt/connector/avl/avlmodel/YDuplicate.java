/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import net.bhl.cdt.model.system.DecimalNumber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDuplicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate#getYDupl <em>YDupl</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getYDuplicate()
 * @model
 * @generated
 */
public interface YDuplicate extends EObject {
	/**
	 * Returns the value of the '<em><b>YDupl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDupl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDupl</em>' reference.
	 * @see #setYDupl(DecimalNumber)
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#getYDuplicate_YDupl()
	 * @model
	 * @generated
	 */
	DecimalNumber getYDupl();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate#getYDupl <em>YDupl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDupl</em>' reference.
	 * @see #getYDupl()
	 * @generated
	 */
	void setYDupl(DecimalNumber value);

} // YDuplicate
