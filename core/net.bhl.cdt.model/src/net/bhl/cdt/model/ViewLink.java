/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/** * <copyright> </copyright> $Id$ */
package net.bhl.cdt.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>View Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.ViewLink#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.ViewLink#getVirtualChild <em>Virtual Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getViewLink()
 * @model
 * @generated
 */
public interface ViewLink extends Element {
	/**
	 * Returns the value of the '<em><b>Virtual Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Parent</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Parent</em>' reference.
	 * @see #setVirtualParent(EObject)
	 * @see net.bhl.cdt.model.ModelPackage#getViewLink_VirtualParent()
	 * @model
	 * @generated
	 */
	EObject getVirtualParent();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.ViewLink#getVirtualParent <em>Virtual Parent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Parent</em>' reference.
	 * @see #getVirtualParent()
	 * @generated
	 */
	void setVirtualParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Virtual Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Child</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Child</em>' reference.
	 * @see #setVirtualChild(EObject)
	 * @see net.bhl.cdt.model.ModelPackage#getViewLink_VirtualChild()
	 * @model
	 * @generated
	 */
	EObject getVirtualChild();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.ViewLink#getVirtualChild <em>Virtual Child</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Virtual Child</em>' reference.
	 * @see #getVirtualChild()
	 * @generated
	 */
	void setVirtualChild(EObject value);

} // ViewLink
