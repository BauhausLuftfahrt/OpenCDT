/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	FunctionsFactory eINSTANCE = net.bhl.cdt.calculationrepository.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scilab Function</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Scilab Function</em>'.
	 * @generated
	 */
	ScilabFunction createScilabFunction();

	/**
	 * Returns a new object of class '<em>Calculation Repository</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Calculation Repository</em>'.
	 * @generated
	 */
	CalculationRepository createCalculationRepository();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} // FunctionsFactory
