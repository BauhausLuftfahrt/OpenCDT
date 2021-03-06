/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.GeneratableElement#getSourceOperation <em>Source Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getGeneratableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeneratableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Operation</em>' reference.
	 * @see #setSourceOperation(OperationWithOutput)
	 * @see net.bhl.cdt.model.ModelPackage#getGeneratableElement_SourceOperation()
	 * @model
	 * @generated
	 */
	OperationWithOutput getSourceOperation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.GeneratableElement#getSourceOperation <em>Source Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Operation</em>' reference.
	 * @see #getSourceOperation()
	 * @generated
	 */
	void setSourceOperation(OperationWithOutput value);

} // GeneratableElement
