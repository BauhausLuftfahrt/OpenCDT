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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssessmentSwitch<Adapter> modelSwitch = new AssessmentSwitch<Adapter>() {
		@Override
		public Adapter caseTechnology(Technology object) {
			return createTechnologyAdapter();
		}

		@Override
		public Adapter caseCapability(Capability object) {
			return createCapabilityAdapter();
		}

		@Override
		public Adapter caseIndustry(Industry object) {
			return createIndustryAdapter();
		}

		@Override
		public Adapter caseTechnologies(Technologies object) {
			return createTechnologiesAdapter();
		}

		@Override
		public Adapter caseCapabilities(Capabilities object) {
			return createCapabilitiesAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTechnologyElement(TechnologyElement object) {
			return createTechnologyElementAdapter();
		}

		@Override
		public Adapter caseCapabilityElement(CapabilityElement object) {
			return createCapabilityElementAdapter();
		}

		@Override
		public Adapter caseReadinessLevelAssessment(ReadinessLevelAssessment object) {
			return createReadinessLevelAssessmentAdapter();
		}

		@Override
		public Adapter caseDerivedReadinessAssessment(DerivedReadinessAssessment object) {
			return createDerivedReadinessAssessmentAdapter();
		}

		@Override
		public Adapter caseDefaultReadinessLevelAssessment(DefaultReadinessLevelAssessment object) {
			return createDefaultReadinessLevelAssessmentAdapter();
		}

		@Override
		public Adapter caseSubstantiatedReadinessAssessement(SubstantiatedReadinessAssessement object) {
			return createSubstantiatedReadinessAssessementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.Industry <em>Industry</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.Industry
	 * @generated
	 */
	public Adapter createIndustryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.Technologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.Technologies
	 * @generated
	 */
	public Adapter createTechnologiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.Capabilities
	 * @generated
	 */
	public Adapter createCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.NamedElement <em>Named Element</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.TechnologyElement
	 * <em>Technology Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.TechnologyElement
	 * @generated
	 */
	public Adapter createTechnologyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.CapabilityElement
	 * <em>Capability Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.CapabilityElement
	 * @generated
	 */
	public Adapter createCapabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.ReadinessLevelAssessment
	 * <em>Readiness Level Assessment</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.ReadinessLevelAssessment
	 * @generated
	 */
	public Adapter createReadinessLevelAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.DerivedReadinessAssessment
	 * <em>Derived Readiness Assessment</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.DerivedReadinessAssessment
	 * @generated
	 */
	public Adapter createDerivedReadinessAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.DefaultReadinessLevelAssessment
	 * <em>Default Readiness Level Assessment</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.DefaultReadinessLevelAssessment
	 * @generated
	 */
	public Adapter createDefaultReadinessLevelAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.assessment.SubstantiatedReadinessAssessement
	 * <em>Substantiated Readiness Assessement</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.assessment.SubstantiatedReadinessAssessement
	 * @generated
	 */
	public Adapter createSubstantiatedReadinessAssessementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // AssessmentAdapterFactory
