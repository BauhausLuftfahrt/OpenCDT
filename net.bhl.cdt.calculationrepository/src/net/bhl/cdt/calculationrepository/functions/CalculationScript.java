/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Calculation Script</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.CalculationScript#getScriptText <em>Script Text</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getCalculationScript()
 * @model abstract="true"
 * @generated
 */
public interface CalculationScript extends Function {
	/**
	 * Returns the value of the '<em><b>Script Text</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Text</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Script Text</em>' attribute.
	 * @see #setScriptText(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getCalculationScript_ScriptText()
	 * @model
	 * @generated
	 */
	String getScriptText();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.CalculationScript#getScriptText
	 * <em>Script Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Script Text</em>' attribute.
	 * @see #getScriptText()
	 * @generated
	 */
	void setScriptText(String value);

} // CalculationScript
