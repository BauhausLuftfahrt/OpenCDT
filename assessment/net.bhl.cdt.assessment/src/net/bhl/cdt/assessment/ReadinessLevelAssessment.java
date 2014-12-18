/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Readiness Level Assessment</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.ReadinessLevelAssessment#getReadinessLevel <em>Readiness Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getReadinessLevelAssessment()
 * @model abstract="true"
 * @generated
 */
public interface ReadinessLevelAssessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Readiness Level</b></em>' attribute. The literals are from the enumeration
	 * {@link net.bhl.cdt.assessment.TechnologyReadinessLevel}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readiness Level</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Readiness Level</em>' attribute.
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @see #setReadinessLevel(TechnologyReadinessLevel)
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getReadinessLevelAssessment_ReadinessLevel()
	 * @model
	 * @generated
	 */
	TechnologyReadinessLevel getReadinessLevel();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.assessment.ReadinessLevelAssessment#getReadinessLevel
	 * <em>Readiness Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Readiness Level</em>' attribute.
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @see #getReadinessLevel()
	 * @generated
	 */
	void setReadinessLevel(TechnologyReadinessLevel value);

} // ReadinessLevelAssessment
