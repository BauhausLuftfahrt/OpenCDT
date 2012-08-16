/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import net.bhl.cdt.model.Element;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Calculation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.Calculation#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.Calculation#getFunctionID <em>Function ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculation()
 * @model
 * @generated
 */
public interface Calculation extends Element {
	/**
	 * Returns the value of the '<em><b>Parameter Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Mapping</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mapping</em>' containment reference.
	 * @see #setParameterMapping(ParameterMapping)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculation_ParameterMapping()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ParameterMapping getParameterMapping();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.Calculation#getParameterMapping <em>Parameter Mapping</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Mapping</em>' containment reference.
	 * @see #getParameterMapping()
	 * @generated
	 */
	void setParameterMapping(ParameterMapping value);

	/**
	 * Returns the value of the '<em><b>Function ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function ID</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function ID</em>' attribute.
	 * @see #setFunctionID(String)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculation_FunctionID()
	 * @model
	 * @generated
	 */
	String getFunctionID();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.Calculation#getFunctionID <em>Function ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function ID</em>' attribute.
	 * @see #getFunctionID()
	 * @generated
	 */
	void setFunctionID(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMapped();

} // Calculation
