/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Component Interface</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.ComponentInterface#getParentComponent <em>Parent Component</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.ModelPackage#getComponentInterface()
 * @model abstract="true"
 * @generated
 */
public interface ComponentInterface extends Element {
	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.bhl.cdt.model.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Component</em>' container reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(Component)
	 * @see net.bhl.cdt.model.ModelPackage#getComponentInterface_ParentComponent()
	 * @see net.bhl.cdt.model.Component#getInterfaces
	 * @model opposite="interfaces" transient="false"
	 * @generated
	 */
	Component getParentComponent();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.ComponentInterface#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(Component value);

} // ComponentInterface
