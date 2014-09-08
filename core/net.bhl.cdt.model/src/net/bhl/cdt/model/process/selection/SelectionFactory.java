/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.selection.SelectionPackage
 * @generated
 */
public interface SelectionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectionFactory eINSTANCE = net.bhl.cdt.model.process.selection.impl.SelectionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Value Selection Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Selection Argument</em>'.
	 * @generated
	 */
	ValueSelectionArgument createValueSelectionArgument();

	/**
	 * Returns a new object of class '<em>Value Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Selection</em>'.
	 * @generated
	 */
	ValueSelection createValueSelection();

	/**
	 * Returns a new object of class '<em>Selected Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Value</em>'.
	 * @generated
	 */
	SelectedValue createSelectedValue();

	/**
	 * Returns a new object of class '<em>Selected Measured Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Measured Value</em>'.
	 * @generated
	 */
	SelectedMeasuredValue createSelectedMeasuredValue();

	/**
	 * Returns a new object of class '<em>Name Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Criterion</em>'.
	 * @generated
	 */
	NameCriterion createNameCriterion();

	/**
	 * Returns a new object of class '<em>Part Of Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Of Criterion</em>'.
	 * @generated
	 */
	PartOfCriterion createPartOfCriterion();

	/**
	 * Returns a new object of class '<em>Highest Value Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Highest Value Criterion</em>'.
	 * @generated
	 */
	HighestValueCriterion createHighestValueCriterion();

	/**
	 * Returns a new object of class '<em>Prefer Latest Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefer Latest Criterion</em>'.
	 * @generated
	 */
	PreferLatestCriterion createPreferLatestCriterion();

	/**
	 * Returns a new object of class '<em>Prefer Generated Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefer Generated Criterion</em>'.
	 * @generated
	 */
	PreferGeneratedCriterion createPreferGeneratedCriterion();

	/**
	 * Returns a new object of class '<em>Prefer Author Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefer Author Criterion</em>'.
	 * @generated
	 */
	PreferAuthorCriterion createPreferAuthorCriterion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SelectionPackage getSelectionPackage();

} //SelectionFactory
