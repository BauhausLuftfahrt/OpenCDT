/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.model.qualification.QualificationPackage
 * @generated
 */
public interface QualificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	QualificationFactory eINSTANCE = net.bhl.cdt.model.qualification.impl.QualificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calculation Space</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Calculation Space</em>'.
	 * @generated
	 */
	CalculationSpace createCalculationSpace();

	/**
	 * Returns a new object of class '<em>Calculation Space Qualifier</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Calculation Space Qualifier</em>'.
	 * @generated
	 */
	CalculationSpaceQualifier createCalculationSpaceQualifier();

	/**
	 * Returns a new object of class '<em>Behavioural Space</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavioural Space</em>'.
	 * @generated
	 */
	BehaviouralSpace createBehaviouralSpace();

	/**
	 * Returns a new object of class '<em>Behavioural Qualifier</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Behavioural Qualifier</em>'.
	 * @generated
	 */
	BehaviouralQualifier createBehaviouralQualifier();

	/**
	 * Returns a new object of class '<em>State</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Sequence</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Transition</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualificationPackage getQualificationPackage();

} // QualificationFactory
