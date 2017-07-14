/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation With Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.OperationWithOutput#getGeneratedElements <em>Generated Elements</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.ModelPackage#getOperationWithOutput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationWithOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Generated Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.GeneratableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Elements</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getOperationWithOutput_GeneratedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratableElement> getGeneratedElements();

} // OperationWithOutput
