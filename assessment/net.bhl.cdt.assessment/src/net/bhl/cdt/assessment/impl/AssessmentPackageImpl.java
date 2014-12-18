/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.impl;

import java.net.URL;

import net.bhl.cdt.assessment.AssessmentFactory;
import net.bhl.cdt.assessment.AssessmentPackage;
import net.bhl.cdt.assessment.Capabilities;
import net.bhl.cdt.assessment.Capability;
import net.bhl.cdt.assessment.CapabilityElement;
import net.bhl.cdt.assessment.DefaultReadinessLevelAssessment;
import net.bhl.cdt.assessment.DerivedReadinessAssessment;
import net.bhl.cdt.assessment.Industry;
import net.bhl.cdt.assessment.NamedElement;
import net.bhl.cdt.assessment.ReadinessLevelAssessment;
import net.bhl.cdt.assessment.SubstantiatedReadinessAssessement;
import net.bhl.cdt.assessment.Technologies;
import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyElement;
import net.bhl.cdt.assessment.TechnologyReadinessLevel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssessmentPackageImpl extends EPackageImpl implements AssessmentPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass technologyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass industryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass technologiesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass capabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass technologyElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass capabilityElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass readinessLevelAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass derivedReadinessAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass defaultReadinessLevelAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass substantiatedReadinessAssessementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum technologyReadinessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType eUrlEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.assessment.AssessmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssessmentPackageImpl() {
		super(eNS_URI, AssessmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link AssessmentPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssessmentPackage init() {
		if (isInited)
			return (AssessmentPackage) EPackage.Registry.INSTANCE.getEPackage(AssessmentPackage.eNS_URI);

		// Obtain or create and register package
		AssessmentPackageImpl theAssessmentPackage = (AssessmentPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssessmentPackageImpl ? EPackage.Registry.INSTANCE
			.get(eNS_URI) : new AssessmentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAssessmentPackage.createPackageContents();

		// Initialize created meta-data
		theAssessmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssessmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssessmentPackage.eNS_URI, theAssessmentPackage);
		return theAssessmentPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_Requires() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_Provides() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_ReadinessAssessments() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_CriticalReadinessLevelAssessments() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTechnology_CriticalTechnologyReadynessLevel() {
		return (EAttribute) technologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_DrivenBy() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnology_Excludes() {
		return (EReference) technologyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTechnology__UpdateCriticalTechnologyReadynessAssessments() {
		return technologyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTechnology__UpdateRequiredTechnologies() {
		return technologyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapability_ProvidedBy() {
		return (EReference) capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapability_RequiredBy() {
		return (EReference) capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIndustry() {
		return industryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIndustry_Drives() {
		return (EReference) industryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTechnologies() {
		return technologiesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTechnologies_Technologies() {
		return (EReference) technologiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCapabilities() {
		return capabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapabilities_Capabilities() {
		return (EReference) capabilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTechnologyElement() {
		return technologyElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCapabilityElement() {
		return capabilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReadinessLevelAssessment() {
		return readinessLevelAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReadinessLevelAssessment_ReadinessLevel() {
		return (EAttribute) readinessLevelAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDerivedReadinessAssessment() {
		return derivedReadinessAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDefaultReadinessLevelAssessment() {
		return defaultReadinessLevelAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSubstantiatedReadinessAssessement() {
		return substantiatedReadinessAssessementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSubstantiatedReadinessAssessement_Source() {
		return (EAttribute) substantiatedReadinessAssessementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTechnologyReadinessLevel() {
		return technologyReadinessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEUrl() {
		return eUrlEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentFactory getAssessmentFactory() {
		return (AssessmentFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		technologyEClass = createEClass(TECHNOLOGY);
		createEReference(technologyEClass, TECHNOLOGY__REQUIRES);
		createEReference(technologyEClass, TECHNOLOGY__PROVIDES);
		createEReference(technologyEClass, TECHNOLOGY__READINESS_ASSESSMENTS);
		createEReference(technologyEClass, TECHNOLOGY__CRITICAL_READINESS_LEVEL_ASSESSMENTS);
		createEAttribute(technologyEClass, TECHNOLOGY__CRITICAL_TECHNOLOGY_READYNESS_LEVEL);
		createEReference(technologyEClass, TECHNOLOGY__DRIVEN_BY);
		createEReference(technologyEClass, TECHNOLOGY__EXCLUDES);
		createEOperation(technologyEClass, TECHNOLOGY___UPDATE_CRITICAL_TECHNOLOGY_READYNESS_ASSESSMENTS);
		createEOperation(technologyEClass, TECHNOLOGY___UPDATE_REQUIRED_TECHNOLOGIES);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__PROVIDED_BY);
		createEReference(capabilityEClass, CAPABILITY__REQUIRED_BY);

		industryEClass = createEClass(INDUSTRY);
		createEReference(industryEClass, INDUSTRY__DRIVES);

		technologiesEClass = createEClass(TECHNOLOGIES);
		createEReference(technologiesEClass, TECHNOLOGIES__TECHNOLOGIES);

		capabilitiesEClass = createEClass(CAPABILITIES);
		createEReference(capabilitiesEClass, CAPABILITIES__CAPABILITIES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		technologyElementEClass = createEClass(TECHNOLOGY_ELEMENT);

		capabilityElementEClass = createEClass(CAPABILITY_ELEMENT);

		readinessLevelAssessmentEClass = createEClass(READINESS_LEVEL_ASSESSMENT);
		createEAttribute(readinessLevelAssessmentEClass, READINESS_LEVEL_ASSESSMENT__READINESS_LEVEL);

		derivedReadinessAssessmentEClass = createEClass(DERIVED_READINESS_ASSESSMENT);

		defaultReadinessLevelAssessmentEClass = createEClass(DEFAULT_READINESS_LEVEL_ASSESSMENT);

		substantiatedReadinessAssessementEClass = createEClass(SUBSTANTIATED_READINESS_ASSESSEMENT);
		createEAttribute(substantiatedReadinessAssessementEClass, SUBSTANTIATED_READINESS_ASSESSEMENT__SOURCE);

		// Create enums
		technologyReadinessLevelEEnum = createEEnum(TECHNOLOGY_READINESS_LEVEL);

		// Create data types
		eUrlEDataType = createEDataType(EURL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		technologyEClass.getESuperTypes().add(this.getTechnologyElement());
		capabilityEClass.getESuperTypes().add(this.getCapabilityElement());
		industryEClass.getESuperTypes().add(this.getNamedElement());
		technologiesEClass.getESuperTypes().add(this.getTechnologyElement());
		capabilitiesEClass.getESuperTypes().add(this.getCapabilityElement());
		technologyElementEClass.getESuperTypes().add(this.getNamedElement());
		capabilityElementEClass.getESuperTypes().add(this.getNamedElement());
		derivedReadinessAssessmentEClass.getESuperTypes().add(this.getReadinessLevelAssessment());
		defaultReadinessLevelAssessmentEClass.getESuperTypes().add(this.getReadinessLevelAssessment());
		substantiatedReadinessAssessementEClass.getESuperTypes().add(this.getReadinessLevelAssessment());

		// Initialize classes, features, and operations; add parameters
		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnology_Requires(), this.getCapability(), this.getCapability_RequiredBy(), "requires",
			null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Provides(), this.getCapability(), this.getCapability_ProvidedBy(), "provides",
			null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_ReadinessAssessments(), this.getReadinessLevelAssessment(), null,
			"readinessAssessments", null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_CriticalReadinessLevelAssessments(), this.getReadinessLevelAssessment(), null,
			"criticalReadinessLevelAssessments", null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnology_CriticalTechnologyReadynessLevel(), this.getTechnologyReadinessLevel(),
			"criticalTechnologyReadynessLevel", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_DrivenBy(), this.getIndustry(), this.getIndustry_Drives(), "drivenBy", null, 0,
			-1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Excludes(), this.getTechnology(), null, "excludes", null, 0, -1, Technology.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEOperation(getTechnology__UpdateCriticalTechnologyReadynessAssessments(), null,
			"updateCriticalTechnologyReadynessAssessments", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTechnology__UpdateRequiredTechnologies(), null, "updateRequiredTechnologies", 0, 1,
			IS_UNIQUE, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_ProvidedBy(), this.getTechnology(), this.getTechnology_Provides(), "providedBy",
			null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_RequiredBy(), this.getTechnology(), this.getTechnology_Requires(), "requiredBy",
			null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(industryEClass, Industry.class, "Industry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndustry_Drives(), this.getTechnology(), this.getTechnology_DrivenBy(), "drives", null, 0,
			-1, Industry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologiesEClass, Technologies.class, "Technologies", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologies_Technologies(), this.getTechnologyElement(), null, "technologies", null, 0, -1,
			Technologies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesEClass, Capabilities.class, "Capabilities", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilities_Capabilities(), this.getCapabilityElement(), null, "capabilities", null, 0, -1,
			Capabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyElementEClass, TechnologyElement.class, "TechnologyElement", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityElementEClass, CapabilityElement.class, "CapabilityElement", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(readinessLevelAssessmentEClass, ReadinessLevelAssessment.class, "ReadinessLevelAssessment",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadinessLevelAssessment_ReadinessLevel(), this.getTechnologyReadinessLevel(),
			"readinessLevel", null, 0, 1, ReadinessLevelAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedReadinessAssessmentEClass, DerivedReadinessAssessment.class, "DerivedReadinessAssessment",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultReadinessLevelAssessmentEClass, DefaultReadinessLevelAssessment.class,
			"DefaultReadinessLevelAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(substantiatedReadinessAssessementEClass, SubstantiatedReadinessAssessement.class,
			"SubstantiatedReadinessAssessement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstantiatedReadinessAssessement_Source(), ecorePackage.getEString(), "source", null, 0, 1,
			SubstantiatedReadinessAssessement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(technologyReadinessLevelEEnum, TechnologyReadinessLevel.class, "TechnologyReadinessLevel");
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL1);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL2);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL3);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL4);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL5);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL6);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL7);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TLR8);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL9);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL0);

		// Initialize data types
		initEDataType(eUrlEDataType, URL.class, "EUrl", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // AssessmentPackageImpl
