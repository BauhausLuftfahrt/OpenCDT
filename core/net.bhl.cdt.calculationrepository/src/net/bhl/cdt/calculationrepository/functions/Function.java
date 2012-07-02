/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

import java.util.List;

import net.bhl.cdt.calculationrepository.exceptions.CalculationException;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.Function#getFunctionID <em>Function ID</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.Function#getInputDescriptors <em>Input Descriptors</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.Function#getOutputDescriptors <em>Output Descriptors</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.Function#getName <em>Name</em>}</li>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.Function#getSynopsis <em>Synopsis</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction()
 * @model abstract="true"
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Function ID</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function ID</em>' attribute.
	 * @see #setFunctionID(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction_FunctionID()
	 * @model
	 * @generated
	 */
	String getFunctionID();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.Function#getFunctionID
	 * <em>Function ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Function ID</em>' attribute.
	 * @see #getFunctionID()
	 * @generated
	 */
	void setFunctionID(String value);

	/**
	 * Returns the value of the '<em><b>Input Descriptors</b></em>' containment reference list. The list contents are of
	 * type {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Descriptors</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Descriptors</em>' containment reference list.
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction_InputDescriptors()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ParameterDescriptor> getInputDescriptors();

	/**
	 * Returns the value of the '<em><b>Output Descriptors</b></em>' containment reference list. The list contents are
	 * of type {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Descriptors</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Descriptors</em>' containment reference list.
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction_OutputDescriptors()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ParameterDescriptor> getOutputDescriptors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.Function#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synopsis</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Synopsis</em>' attribute.
	 * @see #setSynopsis(String)
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getFunction_Synopsis()
	 * @model
	 * @generated
	 */
	String getSynopsis();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.calculationrepository.functions.Function#getSynopsis <em>Synopsis</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Synopsis</em>' attribute.
	 * @see #getSynopsis()
	 * @generated
	 */
	void setSynopsis(String value);

	/**
	 * Evaluates a function without checking the input values. If input values should be checked, use
	 * {@link #execute(List)}
	 * 
	 * @param inputValues list of values
	 * @return list of values
	 * @throws CalculationException in case of a failure
	 */
	List<MeasuredValue> eval(List<MeasuredValue> inputValues) throws CalculationException;

	/**
	 * Evaluates the function while checking the input parameters first. This method validates the paramenters and then
	 * calls {@link #eval(List)}.
	 * 
	 * @param inputValues list of values
	 * @return list of values
	 * @throws CalculationException in case of a failure
	 */
	List<MeasuredValue> execute(List<MeasuredValue> inputValues) throws CalculationException;

} // Function
