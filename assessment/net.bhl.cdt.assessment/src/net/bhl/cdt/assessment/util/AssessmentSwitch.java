/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentSwitch() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AssessmentPackage.TECHNOLOGY: {
			Technology technology = (Technology) theEObject;
			T result = caseTechnology(technology);
			if (result == null)
				result = caseTechnologyElement(technology);
			if (result == null)
				result = caseNamedElement(technology);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.CAPABILITY: {
			Capability capability = (Capability) theEObject;
			T result = caseCapability(capability);
			if (result == null)
				result = caseCapabilityElement(capability);
			if (result == null)
				result = caseNamedElement(capability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.INDUSTRY: {
			Industry industry = (Industry) theEObject;
			T result = caseIndustry(industry);
			if (result == null)
				result = caseNamedElement(industry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.TECHNOLOGIES: {
			Technologies technologies = (Technologies) theEObject;
			T result = caseTechnologies(technologies);
			if (result == null)
				result = caseTechnologyElement(technologies);
			if (result == null)
				result = caseNamedElement(technologies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.CAPABILITIES: {
			Capabilities capabilities = (Capabilities) theEObject;
			T result = caseCapabilities(capabilities);
			if (result == null)
				result = caseCapabilityElement(capabilities);
			if (result == null)
				result = caseNamedElement(capabilities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.TECHNOLOGY_ELEMENT: {
			TechnologyElement technologyElement = (TechnologyElement) theEObject;
			T result = caseTechnologyElement(technologyElement);
			if (result == null)
				result = caseNamedElement(technologyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.CAPABILITY_ELEMENT: {
			CapabilityElement capabilityElement = (CapabilityElement) theEObject;
			T result = caseCapabilityElement(capabilityElement);
			if (result == null)
				result = caseNamedElement(capabilityElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.READINESS_LEVEL_ASSESSMENT: {
			ReadinessLevelAssessment readinessLevelAssessment = (ReadinessLevelAssessment) theEObject;
			T result = caseReadinessLevelAssessment(readinessLevelAssessment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.DERIVED_READINESS_ASSESSMENT: {
			DerivedReadinessAssessment derivedReadinessAssessment = (DerivedReadinessAssessment) theEObject;
			T result = caseDerivedReadinessAssessment(derivedReadinessAssessment);
			if (result == null)
				result = caseReadinessLevelAssessment(derivedReadinessAssessment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.DEFAULT_READINESS_LEVEL_ASSESSMENT: {
			DefaultReadinessLevelAssessment defaultReadinessLevelAssessment = (DefaultReadinessLevelAssessment) theEObject;
			T result = caseDefaultReadinessLevelAssessment(defaultReadinessLevelAssessment);
			if (result == null)
				result = caseReadinessLevelAssessment(defaultReadinessLevelAssessment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssessmentPackage.SUBSTANTIATED_READINESS_ASSESSEMENT: {
			SubstantiatedReadinessAssessement substantiatedReadinessAssessement = (SubstantiatedReadinessAssessement) theEObject;
			T result = caseSubstantiatedReadinessAssessement(substantiatedReadinessAssessement);
			if (result == null)
				result = caseReadinessLevelAssessment(substantiatedReadinessAssessement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnology(Technology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Industry</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Industry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndustry(Industry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technologies</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technologies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologies(Technologies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilities(Capabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyElement(TechnologyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityElement(CapabilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readiness Level Assessment</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readiness Level Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadinessLevelAssessment(ReadinessLevelAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Readiness Assessment</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Readiness Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedReadinessAssessment(DerivedReadinessAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Readiness Level Assessment</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Readiness Level Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultReadinessLevelAssessment(DefaultReadinessLevelAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substantiated Readiness Assessement</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substantiated Readiness Assessement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstantiatedReadinessAssessement(SubstantiatedReadinessAssessement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // AssessmentSwitch
