/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sequence</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.qualification.Sequence#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.qualification.QualificationPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends net.bhl.cdt.model.qualification.Process {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.qualification.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#getSequence_Processes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<net.bhl.cdt.model.qualification.Process> getProcesses();

} // Sequence
