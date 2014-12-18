/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.system.Component#getStates <em>States</em>}</li>
 *   <li>{@link net.bhl.cdt.model.system.Component#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link net.bhl.cdt.model.system.Component#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.system.SystemPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends SystemModelElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.system.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see net.bhl.cdt.model.system.SystemPackage#getComponent_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.system.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' containment reference list.
	 * @see net.bhl.cdt.model.system.SystemPackage#getComponent_Subcomponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.system.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see net.bhl.cdt.model.system.SystemPackage#getComponent_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Component
