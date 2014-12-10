/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.assessment.AssessmentPackage
 * @generated
 */
public interface AssessmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AssessmentFactory eINSTANCE = net.bhl.cdt.assessment.impl.AssessmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Technology</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Technology</em>'.
	 * @generated
	 */
	Technology createTechnology();

	/**
	 * Returns a new object of class '<em>Capability</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Industry</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Industry</em>'.
	 * @generated
	 */
	Industry createIndustry();

	/**
	 * Returns a new object of class '<em>Technologies</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Technologies</em>'.
	 * @generated
	 */
	Technologies createTechnologies();

	/**
	 * Returns a new object of class '<em>Capabilities</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Capabilities</em>'.
	 * @generated
	 */
	Capabilities createCapabilities();

	/**
	 * Returns a new object of class '<em>Named Element</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Derived Readiness Assessment</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Derived Readiness Assessment</em>'.
	 * @generated
	 */
	DerivedReadinessAssessment createDerivedReadinessAssessment();

	/**
	 * Returns a new object of class '<em>Default Readiness Level Assessment</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Default Readiness Level Assessment</em>'.
	 * @generated
	 */
	DefaultReadinessLevelAssessment createDefaultReadinessLevelAssessment();

	/**
	 * Returns a new object of class '<em>Substantiated Readiness Assessement</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Substantiated Readiness Assessement</em>'.
	 * @generated
	 */
	SubstantiatedReadinessAssessement createSubstantiatedReadinessAssessement();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssessmentPackage getAssessmentPackage();

} // AssessmentFactory
