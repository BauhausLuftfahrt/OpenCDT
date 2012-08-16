/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Process</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.qualification.Process#getInitState <em>Init State</em>}</li>
 *   <li>{@link net.bhl.cdt.model.qualification.Process#getFinState <em>Fin State</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.qualification.QualificationPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends BehaviouralQualifier {
	/**
	 * Returns the value of the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init State</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init State</em>' reference.
	 * @see #setInitState(State)
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#getProcess_InitState()
	 * @model
	 * @generated
	 */
	State getInitState();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.qualification.Process#getInitState <em>Init State</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init State</em>' reference.
	 * @see #getInitState()
	 * @generated
	 */
	void setInitState(State value);

	/**
	 * Returns the value of the '<em><b>Fin State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin State</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin State</em>' reference.
	 * @see #setFinState(State)
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#getProcess_FinState()
	 * @model
	 * @generated
	 */
	State getFinState();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.qualification.Process#getFinState <em>Fin State</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin State</em>' reference.
	 * @see #getFinState()
	 * @generated
	 */
	void setFinState(State value);

} // Process
