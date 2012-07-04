/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import net.bhl.cdt.model.calculation.CalculationSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.Configuration#getViews <em>Views</em>}</li>
 * <li>{@link net.bhl.cdt.model.Configuration#getComponents <em>Components</em>}</li>
 * <li>{@link net.bhl.cdt.model.Configuration#getCalculationSets <em>Calculation Sets</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.ModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends StructuralElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.Component}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getConfiguration_Components()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Calculation Sets</b></em>' containment reference list. The list contents are of
	 * type {@link net.bhl.cdt.model.calculation.CalculationSet}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Sets</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Calculation Sets</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getConfiguration_CalculationSets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CalculationSet> getCalculationSets();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.View}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getConfiguration_Views()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<View> getViews();

} // Configuration
