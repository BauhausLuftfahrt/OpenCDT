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
 * A representation of the model object '<em><b>Operation With Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.OperationWithInput#getProcessedElements <em>Processed Elements</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.ModelPackage#getOperationWithInput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationWithInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Processed Elements</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.ProcessableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Elements</em>' reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getOperationWithInput_ProcessedElements()
	 * @model
	 * @generated
	 */
	EList<ProcessableElement> getProcessedElements();

} // OperationWithInput
