/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.model.calculation.CalculationPackage
 * @generated
 */
public interface CalculationFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CalculationFactory eINSTANCE = net.bhl.cdt.model.calculation.impl.CalculationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Set</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	CalculationSet createCalculationSet();

	/**
	 * Returns a new object of class '<em>Calculation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Calculation</em>'.
	 * @generated
	 */
	Calculation createCalculation();

	/**
	 * Returns a new object of class '<em>Parameter Mapping</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter Mapping</em>'.
	 * @generated
	 */
	ParameterMapping createParameterMapping();

	/**
	 * Returns a new object of class '<em>Graph</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	CalculationGraph createCalculationGraph();

	/**
	 * Returns a new object of class '<em>Node</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Iteration Node</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Iteration Node</em>'.
	 * @generated
	 */
	IterationNode createIterationNode();

	/**
	 * Returns a new object of class '<em>Conditional Node</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Conditional Node</em>'.
	 * @generated
	 */
	ConditionalNode createConditionalNode();

	/**
	 * Returns a new object of class '<em>Start Set</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Start Set</em>'.
	 * @generated
	 */
	StartSet createStartSet();

	/**
	 * Returns a new object of class '<em>Set Node</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Set Node</em>'.
	 * @generated
	 */
	CalculationSetNode createCalculationSetNode();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalculationPackage getCalculationPackage();

} // CalculationFactory
