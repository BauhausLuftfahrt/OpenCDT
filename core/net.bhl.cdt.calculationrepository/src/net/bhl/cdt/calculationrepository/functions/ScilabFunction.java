/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Scilab Function</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionDefinition <em>Function Definition
 * </em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionBody <em>Function Body</em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionCall <em>Function Call</em>}</li>
 * <li>
 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionReturn <em>Function Return</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getScilabFunction()
 * @model abstract="true"
 * @generated
 */
public interface ScilabFunction extends CalculationScript {

	/**
	 * Returns the value of the '<em><b>Function Definition</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Definition</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Definition</em>' attribute.
	 * @see #setFunctionDefinition(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getScilabFunction_FunctionDefinition()
	 * @model transient="true"
	 * @generated
	 */
	String getFunctionDefinition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionDefinition
	 * <em>Function Definition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Function Definition</em>' attribute.
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	void setFunctionDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Function Body</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Body</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Body</em>' attribute.
	 * @see #setFunctionBody(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getScilabFunction_FunctionBody()
	 * @model transient="true"
	 * @generated
	 */
	String getFunctionBody();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionBody
	 * <em>Function Body</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Function Body</em>' attribute.
	 * @see #getFunctionBody()
	 * @generated
	 */
	void setFunctionBody(String value);

	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Call</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Call</em>' attribute.
	 * @see #setFunctionCall(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getScilabFunction_FunctionCall()
	 * @model transient="true"
	 * @generated
	 */
	String getFunctionCall();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionCall
	 * <em>Function Call</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Function Call</em>' attribute.
	 * @see #getFunctionCall()
	 * @generated
	 */
	void setFunctionCall(String value);

	/**
	 * Returns the value of the '<em><b>Function Return</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Return</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Return</em>' attribute.
	 * @see #setFunctionReturn(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getScilabFunction_FunctionReturn()
	 * @model transient="true"
	 * @generated
	 */
	String getFunctionReturn();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionReturn
	 * <em>Function Return</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Function Return</em>' attribute.
	 * @see #getFunctionReturn()
	 * @generated
	 */
	void setFunctionReturn(String value);
} // ScilabFunction
