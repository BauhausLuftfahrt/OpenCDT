/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model;

import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Component</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.Component#getSubComponents <em>Sub Components</em>}</li>
 *   <li>{@link net.bhl.cdt.model.Component#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.bhl.cdt.model.Component#getConnectedComponents <em>Connected Components</em>}</li>
 *   <li>{@link net.bhl.cdt.model.Component#getCalculationSets <em>Calculation Sets</em>}</li>
 *   <li>{@link net.bhl.cdt.model.Component#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends StructuralElement {
	/**
	 * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Components</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getComponent_SubComponents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Component> getSubComponents();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getComponent_Parameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Connected Components</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Components</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Components</em>' reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getComponent_ConnectedComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getConnectedComponents();

	/**
	 * Returns the value of the '<em><b>Calculation Sets</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.calculation.CalculationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Sets</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Sets</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getComponent_CalculationSets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CalculationSet> getCalculationSets();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.ComponentInterface}.
	 * It is bidirectional and its opposite is '{@link net.bhl.cdt.model.ComponentInterface#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getComponent_Interfaces()
	 * @see net.bhl.cdt.model.ComponentInterface#getParentComponent
	 * @model opposite="parentComponent" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentInterface> getInterfaces();

	/**
	 * Returns the component interface.
	 * 
	 * @param clazz componentInterface class
	 * @return interface to null
	 * @generated NOT
	 */
	<T extends ComponentInterface> T getInterfaceByClass(Class<T> clazz);

} // Component
