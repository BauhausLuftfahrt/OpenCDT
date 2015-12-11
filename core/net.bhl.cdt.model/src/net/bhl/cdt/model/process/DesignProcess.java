/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.DesignProcess#getDesignProcessElements <em>Design Process Elements</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.process.ProcessPackage#getDesignProcess()
 * @model
 * @generated
 */
public interface DesignProcess extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Process Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Process Elements</em>' containment reference list.
	 * @see net.bhl.cdt.model.process.ProcessPackage#getDesignProcess_DesignProcessElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessElement> getDesignProcessElements();

} // DesignProcess
