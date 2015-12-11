/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations;

import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.system.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.CalculatedValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage#getCalculatedValue()
 * @model abstract="true"
 * @generated
 */
public interface CalculatedValue extends DesignOperation, Value, OperationWithInput {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage#getCalculatedValue_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.designoperations.CalculatedValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // CalculatedValue
