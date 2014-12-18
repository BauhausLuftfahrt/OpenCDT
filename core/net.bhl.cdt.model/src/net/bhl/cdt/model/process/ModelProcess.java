/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process;

import net.bhl.cdt.model.ProcessableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.ModelProcess#getSubprocesses <em>Subprocesses</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.ProcessPackage#getModelProcess()
 * @model
 * @generated
 */
public interface ModelProcess extends ProcessableElement {
	/**
	 * Returns the value of the '<em><b>Subprocesses</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.process.DesignOperation}.
	 * It is bidirectional and its opposite is '{@link net.bhl.cdt.model.process.DesignOperation#getSuperprocess <em>Superprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocesses</em>' reference list.
	 * @see net.bhl.cdt.model.process.ProcessPackage#getModelProcess_Subprocesses()
	 * @see net.bhl.cdt.model.process.DesignOperation#getSuperprocess
	 * @model opposite="superprocess"
	 * @generated
	 */
	EList<DesignOperation> getSubprocesses();

} // ModelProcess
