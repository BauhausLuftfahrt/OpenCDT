/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Substantiated Readiness Assessement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.SubstantiatedReadinessAssessement#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getSubstantiatedReadinessAssessement()
 * @model
 * @generated
 */
public interface SubstantiatedReadinessAssessement extends ReadinessLevelAssessment {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getSubstantiatedReadinessAssessement_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.assessment.SubstantiatedReadinessAssessement#getSource <em>Source</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // SubstantiatedReadinessAssessement
