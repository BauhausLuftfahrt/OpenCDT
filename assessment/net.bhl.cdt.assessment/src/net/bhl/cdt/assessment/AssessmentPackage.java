/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.assessment.AssessmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssessmentPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "assessment";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/assessement";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AssessmentPackage eINSTANCE = net.bhl.cdt.assessment.impl.AssessmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.NamedElementImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.TechnologyElementImpl <em>Technology Element</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.TechnologyElementImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologyElement()
	 * @generated
	 */
	int TECHNOLOGY_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Technology Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Technology Element</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.TechnologyImpl <em>Technology</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.TechnologyImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = TECHNOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__REQUIRES = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__PROVIDES = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Readiness Assessments</b></em>' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__READINESS_ASSESSMENTS = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Critical Readiness Level Assessments</b></em>' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Critical Technology Readyness Level</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Driven By</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__DRIVEN_BY = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__EXCLUDES = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Technology</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Update Critical Technology Readyness Assessments</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY___UPDATE_CRITICAL_TECHNOLOGY_READYNESS_ASSESSMENTS = TECHNOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Required Technologies</em>' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY___UPDATE_REQUIRED_TECHNOLOGIES = TECHNOLOGY_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Technology</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = TECHNOLOGY_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.CapabilityElementImpl <em>Capability Element</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.CapabilityElementImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapabilityElement()
	 * @generated
	 */
	int CAPABILITY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Capability Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability Element</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.CapabilityImpl <em>Capability</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.CapabilityImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = CAPABILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PROVIDED_BY = CAPABILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REQUIRED_BY = CAPABILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = CAPABILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capability</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = CAPABILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.IndustryImpl <em>Industry</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.IndustryImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getIndustry()
	 * @generated
	 */
	int INDUSTRY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Drives</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__DRIVES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Industry</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Industry</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.TechnologiesImpl <em>Technologies</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.TechnologiesImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologies()
	 * @generated
	 */
	int TECHNOLOGIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES__NAME = TECHNOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES__TECHNOLOGIES = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technologies</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES_FEATURE_COUNT = TECHNOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Technologies</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES_OPERATION_COUNT = TECHNOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.CapabilitiesImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapabilities()
	 * @generated
	 */
	int CAPABILITIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__NAME = CAPABILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__CAPABILITIES = CAPABILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capabilities</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_FEATURE_COUNT = CAPABILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capabilities</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_OPERATION_COUNT = CAPABILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.ReadinessLevelAssessmentImpl
	 * <em>Readiness Level Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.ReadinessLevelAssessmentImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getReadinessLevelAssessment()
	 * @generated
	 */
	int READINESS_LEVEL_ASSESSMENT = 8;

	/**
	 * The feature id for the '<em><b>Readiness Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Readiness Level Assessment</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Readiness Level Assessment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int READINESS_LEVEL_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.DerivedReadinessAssessmentImpl
	 * <em>Derived Readiness Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.DerivedReadinessAssessmentImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getDerivedReadinessAssessment()
	 * @generated
	 */
	int DERIVED_READINESS_ASSESSMENT = 9;

	/**
	 * The feature id for the '<em><b>Readiness Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVED_READINESS_ASSESSMENT__READINESS_LEVEL = READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL;

	/**
	 * The number of structural features of the '<em>Derived Readiness Assessment</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVED_READINESS_ASSESSMENT_FEATURE_COUNT = READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Derived Readiness Assessment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVED_READINESS_ASSESSMENT_OPERATION_COUNT = READINESS_LEVEL_ASSESSMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.DefaultReadinessLevelAssessmentImpl
	 * <em>Default Readiness Level Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.DefaultReadinessLevelAssessmentImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getDefaultReadinessLevelAssessment()
	 * @generated
	 */
	int DEFAULT_READINESS_LEVEL_ASSESSMENT = 10;

	/**
	 * The feature id for the '<em><b>Readiness Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL = READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL;

	/**
	 * The number of structural features of the '<em>Default Readiness Level Assessment</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT = READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Readiness Level Assessment</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_READINESS_LEVEL_ASSESSMENT_OPERATION_COUNT = READINESS_LEVEL_ASSESSMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.impl.SubstantiatedReadinessAssessementImpl
	 * <em>Substantiated Readiness Assessement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.impl.SubstantiatedReadinessAssessementImpl
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getSubstantiatedReadinessAssessement()
	 * @generated
	 */
	int SUBSTANTIATED_READINESS_ASSESSEMENT = 11;

	/**
	 * The feature id for the '<em><b>Readiness Level</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTANTIATED_READINESS_ASSESSEMENT__READINESS_LEVEL = READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTANTIATED_READINESS_ASSESSEMENT__SOURCE = READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substantiated Readiness Assessement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTANTIATED_READINESS_ASSESSEMENT_FEATURE_COUNT = READINESS_LEVEL_ASSESSMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Substantiated Readiness Assessement</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTANTIATED_READINESS_ASSESSEMENT_OPERATION_COUNT = READINESS_LEVEL_ASSESSMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * <em>Technology Readiness Level</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologyReadinessLevel()
	 * @generated
	 */
	int TECHNOLOGY_READINESS_LEVEL = 12;

	/**
	 * The meta object id for the '<em>EUrl</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.net.URL
	 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getEUrl()
	 * @generated
	 */
	int EURL = 13;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.Technology <em>Technology</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see net.bhl.cdt.assessment.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Technology#getRequires
	 * <em>Requires</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getRequires()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Requires();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Technology#getProvides
	 * <em>Provides</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getProvides()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Provides();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.assessment.Technology#getReadinessAssessments <em>Readiness Assessments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Readiness Assessments</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getReadinessAssessments()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_ReadinessAssessments();

	/**
	 * Returns the meta object for the reference list '
	 * {@link net.bhl.cdt.assessment.Technology#getCriticalReadinessLevelAssessments
	 * <em>Critical Readiness Level Assessments</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Critical Readiness Level Assessments</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getCriticalReadinessLevelAssessments()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_CriticalReadinessLevelAssessments();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.assessment.Technology#getCriticalTechnologyReadynessLevel
	 * <em>Critical Technology Readyness Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Critical Technology Readyness Level</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getCriticalTechnologyReadynessLevel()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_CriticalTechnologyReadynessLevel();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Technology#getDrivenBy
	 * <em>Driven By</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Driven By</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getDrivenBy()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_DrivenBy();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Technology#getExcludes
	 * <em>Excludes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Excludes</em>'.
	 * @see net.bhl.cdt.assessment.Technology#getExcludes()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Excludes();

	/**
	 * Returns the meta object for the '
	 * {@link net.bhl.cdt.assessment.Technology#updateCriticalTechnologyReadynessAssessments()
	 * <em>Update Critical Technology Readyness Assessments</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Update Critical Technology Readyness Assessments</em>' operation.
	 * @see net.bhl.cdt.assessment.Technology#updateCriticalTechnologyReadynessAssessments()
	 * @generated
	 */
	EOperation getTechnology__UpdateCriticalTechnologyReadynessAssessments();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.assessment.Technology#updateRequiredTechnologies()
	 * <em>Update Required Technologies</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Update Required Technologies</em>' operation.
	 * @see net.bhl.cdt.assessment.Technology#updateRequiredTechnologies()
	 * @generated
	 */
	EOperation getTechnology__UpdateRequiredTechnologies();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.Capability <em>Capability</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see net.bhl.cdt.assessment.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Capability#getProvidedBy
	 * <em>Provided By</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Provided By</em>'.
	 * @see net.bhl.cdt.assessment.Capability#getProvidedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_ProvidedBy();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Capability#getRequiredBy
	 * <em>Required By</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see net.bhl.cdt.assessment.Capability#getRequiredBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_RequiredBy();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.Industry <em>Industry</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Industry</em>'.
	 * @see net.bhl.cdt.assessment.Industry
	 * @generated
	 */
	EClass getIndustry();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.assessment.Industry#getDrives <em>Drives</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Drives</em>'.
	 * @see net.bhl.cdt.assessment.Industry#getDrives()
	 * @see #getIndustry()
	 * @generated
	 */
	EReference getIndustry_Drives();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.Technologies <em>Technologies</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Technologies</em>'.
	 * @see net.bhl.cdt.assessment.Technologies
	 * @generated
	 */
	EClass getTechnologies();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.assessment.Technologies#getTechnologies <em>Technologies</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see net.bhl.cdt.assessment.Technologies#getTechnologies()
	 * @see #getTechnologies()
	 * @generated
	 */
	EReference getTechnologies_Technologies();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.Capabilities <em>Capabilities</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Capabilities</em>'.
	 * @see net.bhl.cdt.assessment.Capabilities
	 * @generated
	 */
	EClass getCapabilities();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.assessment.Capabilities#getCapabilities <em>Capabilities</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see net.bhl.cdt.assessment.Capabilities#getCapabilities()
	 * @see #getCapabilities()
	 * @generated
	 */
	EReference getCapabilities_Capabilities();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.NamedElement <em>Named Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see net.bhl.cdt.assessment.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.assessment.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.assessment.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.TechnologyElement <em>Technology Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Technology Element</em>'.
	 * @see net.bhl.cdt.assessment.TechnologyElement
	 * @generated
	 */
	EClass getTechnologyElement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.CapabilityElement <em>Capability Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Capability Element</em>'.
	 * @see net.bhl.cdt.assessment.CapabilityElement
	 * @generated
	 */
	EClass getCapabilityElement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.ReadinessLevelAssessment
	 * <em>Readiness Level Assessment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Readiness Level Assessment</em>'.
	 * @see net.bhl.cdt.assessment.ReadinessLevelAssessment
	 * @generated
	 */
	EClass getReadinessLevelAssessment();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.assessment.ReadinessLevelAssessment#getReadinessLevel <em>Readiness Level</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Readiness Level</em>'.
	 * @see net.bhl.cdt.assessment.ReadinessLevelAssessment#getReadinessLevel()
	 * @see #getReadinessLevelAssessment()
	 * @generated
	 */
	EAttribute getReadinessLevelAssessment_ReadinessLevel();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.DerivedReadinessAssessment
	 * <em>Derived Readiness Assessment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Derived Readiness Assessment</em>'.
	 * @see net.bhl.cdt.assessment.DerivedReadinessAssessment
	 * @generated
	 */
	EClass getDerivedReadinessAssessment();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.DefaultReadinessLevelAssessment
	 * <em>Default Readiness Level Assessment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Default Readiness Level Assessment</em>'.
	 * @see net.bhl.cdt.assessment.DefaultReadinessLevelAssessment
	 * @generated
	 */
	EClass getDefaultReadinessLevelAssessment();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.assessment.SubstantiatedReadinessAssessement
	 * <em>Substantiated Readiness Assessement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Substantiated Readiness Assessement</em>'.
	 * @see net.bhl.cdt.assessment.SubstantiatedReadinessAssessement
	 * @generated
	 */
	EClass getSubstantiatedReadinessAssessement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.assessment.SubstantiatedReadinessAssessement#getSource <em>Source</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.bhl.cdt.assessment.SubstantiatedReadinessAssessement#getSource()
	 * @see #getSubstantiatedReadinessAssessement()
	 * @generated
	 */
	EAttribute getSubstantiatedReadinessAssessement_Source();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * <em>Technology Readiness Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Technology Readiness Level</em>'.
	 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
	 * @generated
	 */
	EEnum getTechnologyReadinessLevel();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>EUrl</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>EUrl</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getEUrl();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssessmentFactory getAssessmentFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.TechnologyImpl <em>Technology</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.TechnologyImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__REQUIRES = eINSTANCE.getTechnology_Requires();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__PROVIDES = eINSTANCE.getTechnology_Provides();

		/**
		 * The meta object literal for the '<em><b>Readiness Assessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__READINESS_ASSESSMENTS = eINSTANCE.getTechnology_ReadinessAssessments();

		/**
		 * The meta object literal for the '<em><b>Critical Readiness Level Assessments</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS = eINSTANCE
			.getTechnology_CriticalReadinessLevelAssessments();

		/**
		 * The meta object literal for the '<em><b>Critical Technology Readyness Level</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL = eINSTANCE
			.getTechnology_CriticalTechnologyReadynessLevel();

		/**
		 * The meta object literal for the '<em><b>Driven By</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__DRIVEN_BY = eINSTANCE.getTechnology_DrivenBy();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGY__EXCLUDES = eINSTANCE.getTechnology_Excludes();

		/**
		 * The meta object literal for the '<em><b>Update Critical Technology Readyness Assessments</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TECHNOLOGY___UPDATE_CRITICAL_TECHNOLOGY_READYNESS_ASSESSMENTS = eINSTANCE
			.getTechnology__UpdateCriticalTechnologyReadynessAssessments();

		/**
		 * The meta object literal for the '<em><b>Update Required Technologies</b></em>' operation. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TECHNOLOGY___UPDATE_REQUIRED_TECHNOLOGIES = eINSTANCE.getTechnology__UpdateRequiredTechnologies();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.CapabilityImpl <em>Capability</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.CapabilityImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITY__PROVIDED_BY = eINSTANCE.getCapability_ProvidedBy();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITY__REQUIRED_BY = eINSTANCE.getCapability_RequiredBy();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.IndustryImpl <em>Industry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.IndustryImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getIndustry()
		 * @generated
		 */
		EClass INDUSTRY = eINSTANCE.getIndustry();

		/**
		 * The meta object literal for the '<em><b>Drives</b></em>' reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INDUSTRY__DRIVES = eINSTANCE.getIndustry_Drives();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.TechnologiesImpl <em>Technologies</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.TechnologiesImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologies()
		 * @generated
		 */
		EClass TECHNOLOGIES = eINSTANCE.getTechnologies();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TECHNOLOGIES__TECHNOLOGIES = eINSTANCE.getTechnologies_Technologies();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.CapabilitiesImpl <em>Capabilities</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.CapabilitiesImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapabilities()
		 * @generated
		 */
		EClass CAPABILITIES = eINSTANCE.getCapabilities();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITIES__CAPABILITIES = eINSTANCE.getCapabilities_Capabilities();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.NamedElementImpl <em>Named Element</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.NamedElementImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.TechnologyElementImpl
		 * <em>Technology Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.TechnologyElementImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologyElement()
		 * @generated
		 */
		EClass TECHNOLOGY_ELEMENT = eINSTANCE.getTechnologyElement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.CapabilityElementImpl
		 * <em>Capability Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.CapabilityElementImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getCapabilityElement()
		 * @generated
		 */
		EClass CAPABILITY_ELEMENT = eINSTANCE.getCapabilityElement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.ReadinessLevelAssessmentImpl
		 * <em>Readiness Level Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.ReadinessLevelAssessmentImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getReadinessLevelAssessment()
		 * @generated
		 */
		EClass READINESS_LEVEL_ASSESSMENT = eINSTANCE.getReadinessLevelAssessment();

		/**
		 * The meta object literal for the '<em><b>Readiness Level</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL = eINSTANCE.getReadinessLevelAssessment_ReadinessLevel();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.DerivedReadinessAssessmentImpl
		 * <em>Derived Readiness Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.DerivedReadinessAssessmentImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getDerivedReadinessAssessment()
		 * @generated
		 */
		EClass DERIVED_READINESS_ASSESSMENT = eINSTANCE.getDerivedReadinessAssessment();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.DefaultReadinessLevelAssessmentImpl
		 * <em>Default Readiness Level Assessment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.DefaultReadinessLevelAssessmentImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getDefaultReadinessLevelAssessment()
		 * @generated
		 */
		EClass DEFAULT_READINESS_LEVEL_ASSESSMENT = eINSTANCE.getDefaultReadinessLevelAssessment();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.impl.SubstantiatedReadinessAssessementImpl
		 * <em>Substantiated Readiness Assessement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.impl.SubstantiatedReadinessAssessementImpl
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getSubstantiatedReadinessAssessement()
		 * @generated
		 */
		EClass SUBSTANTIATED_READINESS_ASSESSEMENT = eINSTANCE.getSubstantiatedReadinessAssessement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SUBSTANTIATED_READINESS_ASSESSEMENT__SOURCE = eINSTANCE
			.getSubstantiatedReadinessAssessement_Source();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.assessment.TechnologyReadinessLevel
		 * <em>Technology Readiness Level</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.assessment.TechnologyReadinessLevel
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getTechnologyReadinessLevel()
		 * @generated
		 */
		EEnum TECHNOLOGY_READINESS_LEVEL = eINSTANCE.getTechnologyReadinessLevel();

		/**
		 * The meta object literal for the '<em>EUrl</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.net.URL
		 * @see net.bhl.cdt.assessment.impl.AssessmentPackageImpl#getEUrl()
		 * @generated
		 */
		EDataType EURL = eINSTANCE.getEUrl();

	}

} // AssessmentPackage
