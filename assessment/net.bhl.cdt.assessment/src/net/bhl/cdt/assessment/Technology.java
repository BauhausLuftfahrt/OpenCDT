/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Technology</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.Technology#getRequires <em>Requires</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getProvides <em>Provides</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getReadinessAssessments <em>Readiness Assessments</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getCriticalReadinessLevelAssessments <em>Critical Readiness Level
 * Assessments</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getCriticalTechnologyReadynessLevel <em>Critical Technology Readyness
 * Level</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getDrivenBy <em>Driven By</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Technology#getExcludes <em>Excludes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends TechnologyElement {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Capability}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Capability#getRequiredBy <em>Required By</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_Requires()
	 * @see net.bhl.cdt.assessment.Capability#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	EList<Capability> getRequires();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Capability}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Capability#getProvidedBy <em>Provided By</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_Provides()
	 * @see net.bhl.cdt.assessment.Capability#getProvidedBy
	 * @model opposite="providedBy"
	 * @generated
	 */
	EList<Capability> getProvides();

	/**
	 * Returns the value of the '<em><b>Readiness Assessments</b></em>' containment reference list. The list contents
	 * are of type {@link net.bhl.cdt.assessment.ReadinessLevelAssessment}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readiness Assessments</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Readiness Assessments</em>' containment reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_ReadinessAssessments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReadinessLevelAssessment> getReadinessAssessments();

	/**
	 * Returns the value of the '<em><b>Critical Readiness Level Assessments</b></em>' reference list. The list contents
	 * are of type {@link net.bhl.cdt.assessment.ReadinessLevelAssessment}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Readiness Level Assessments</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Critical Readiness Level Assessments</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_CriticalReadinessLevelAssessments()
	 * @model
	 * @generated
	 */
	EList<ReadinessLevelAssessment> getCriticalReadinessLevelAssessments();

	/**
	 * Returns the value of the '<em><b>Critical Technology Readyness Level</b></em>' attribute. The literals are from
	 * the enumeration {@link net.bhl.cdt.assessment.TechnologyReadinessLevel}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Technology Readyness Level</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Critical Technology Readyness Level</em>' attribute.
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @see #setCriticalTechnologyReadynessLevel(TechnologyReadinessLevel)
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_CriticalTechnologyReadynessLevel()
	 * @model
	 * @generated
	 */
	TechnologyReadinessLevel getCriticalTechnologyReadynessLevel();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.assessment.Technology#getCriticalTechnologyReadynessLevel
	 * <em>Critical Technology Readyness Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Critical Technology Readyness Level</em>' attribute.
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @see #getCriticalTechnologyReadynessLevel()
	 * @generated
	 */
	void setCriticalTechnologyReadynessLevel(TechnologyReadinessLevel value);

	/**
	 * Returns the value of the '<em><b>Driven By</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Industry}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Industry#getDrives <em>Drives</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driven By</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Driven By</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_DrivenBy()
	 * @see net.bhl.cdt.assessment.Industry#getDrives
	 * @model opposite="drives"
	 * @generated
	 */
	EList<Industry> getDrivenBy();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Technology}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnology_Excludes()
	 * @model
	 * @generated
	 */
	EList<Technology> getExcludes();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void updateCriticalTechnologyReadynessAssessments();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void updateRequiredTechnologies();

} // Technology
