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
import net.bhl.cdt.assessment.DefaultReadinessLevelAssessment;
import net.bhl.cdt.assessment.DerivedReadinessAssessment;
import net.bhl.cdt.assessment.Industry;
import net.bhl.cdt.assessment.NamedElement;
import net.bhl.cdt.assessment.SubstantiatedReadinessAssessement;
import net.bhl.cdt.assessment.Technologies;
import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyReadinessLevel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssessmentFactoryImpl extends EFactoryImpl implements AssessmentFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssessmentFactory init() {
		try {
			AssessmentFactory theAssessmentFactory = (AssessmentFactory) EPackage.Registry.INSTANCE
				.getEFactory(AssessmentPackage.eNS_URI);
			if (theAssessmentFactory != null) {
				return theAssessmentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssessmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AssessmentPackage.TECHNOLOGY:
			return createTechnology();
		case AssessmentPackage.CAPABILITY:
			return createCapability();
		case AssessmentPackage.INDUSTRY:
			return createIndustry();
		case AssessmentPackage.TECHNOLOGIES:
			return createTechnologies();
		case AssessmentPackage.CAPABILITIES:
			return createCapabilities();
		case AssessmentPackage.NAMED_ELEMENT:
			return createNamedElement();
		case AssessmentPackage.DERIVED_READINESS_ASSESSMENT:
			return createDerivedReadinessAssessment();
		case AssessmentPackage.DEFAULT_READINESS_LEVEL_ASSESSMENT:
			return createDefaultReadinessLevelAssessment();
		case AssessmentPackage.SUBSTANTIATED_READINESS_ASSESSEMENT:
			return createSubstantiatedReadinessAssessement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AssessmentPackage.TECHNOLOGY_READINESS_LEVEL:
			return createTechnologyReadinessLevelFromString(eDataType, initialValue);
		case AssessmentPackage.EURL:
			return createEUrlFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AssessmentPackage.TECHNOLOGY_READINESS_LEVEL:
			return convertTechnologyReadinessLevelToString(eDataType, instanceValue);
		case AssessmentPackage.EURL:
			return convertEUrlToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Industry createIndustry() {
		IndustryImpl industry = new IndustryImpl();
		return industry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Technologies createTechnologies() {
		TechnologiesImpl technologies = new TechnologiesImpl();
		return technologies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Capabilities createCapabilities() {
		CapabilitiesImpl capabilities = new CapabilitiesImpl();
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DerivedReadinessAssessment createDerivedReadinessAssessment() {
		DerivedReadinessAssessmentImpl derivedReadinessAssessment = new DerivedReadinessAssessmentImpl();
		return derivedReadinessAssessment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefaultReadinessLevelAssessment createDefaultReadinessLevelAssessment() {
		DefaultReadinessLevelAssessmentImpl defaultReadinessLevelAssessment = new DefaultReadinessLevelAssessmentImpl();
		return defaultReadinessLevelAssessment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubstantiatedReadinessAssessement createSubstantiatedReadinessAssessement() {
		SubstantiatedReadinessAssessementImpl substantiatedReadinessAssessement = new SubstantiatedReadinessAssessementImpl();
		return substantiatedReadinessAssessement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TechnologyReadinessLevel createTechnologyReadinessLevelFromString(EDataType eDataType, String initialValue) {
		TechnologyReadinessLevel result = TechnologyReadinessLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTechnologyReadinessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URL createEUrlFromString(EDataType eDataType, String initialValue) {
		return (URL) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEUrlToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentPackage getAssessmentPackage() {
		return (AssessmentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssessmentPackage getPackage() {
		return AssessmentPackage.eINSTANCE;
	}

} // AssessmentFactoryImpl
