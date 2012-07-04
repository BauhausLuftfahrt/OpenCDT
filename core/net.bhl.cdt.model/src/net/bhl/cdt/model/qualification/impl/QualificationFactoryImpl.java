/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import net.bhl.cdt.model.qualification.BehaviouralQualifier;
import net.bhl.cdt.model.qualification.BehaviouralSpace;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.QualificationFactory;
import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.Sequence;
import net.bhl.cdt.model.qualification.State;
import net.bhl.cdt.model.qualification.Transition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class QualificationFactoryImpl extends EFactoryImpl implements QualificationFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static QualificationFactory init() {
		try {
			QualificationFactory theQualificationFactory = (QualificationFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://bhl.net/cdt/model/qualification"); //$NON-NLS-1$ 
			if (theQualificationFactory != null) {
				return theQualificationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QualificationFactoryImpl() {
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
		case QualificationPackage.CALCULATION_SPACE:
			return createCalculationSpace();
		case QualificationPackage.CALCULATION_SPACE_QUALIFIER:
			return createCalculationSpaceQualifier();
		case QualificationPackage.BEHAVIOURAL_SPACE:
			return createBehaviouralSpace();
		case QualificationPackage.BEHAVIOURAL_QUALIFIER:
			return createBehaviouralQualifier();
		case QualificationPackage.STATE:
			return createState();
		case QualificationPackage.SEQUENCE:
			return createSequence();
		case QualificationPackage.TRANSITION:
			return createTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSpace createCalculationSpace() {
		CalculationSpaceImpl calculationSpace = new CalculationSpaceImpl();
		return calculationSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationSpaceQualifier createCalculationSpaceQualifier() {
		CalculationSpaceQualifierImpl calculationSpaceQualifier = new CalculationSpaceQualifierImpl();
		return calculationSpaceQualifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BehaviouralSpace createBehaviouralSpace() {
		BehaviouralSpaceImpl behaviouralSpace = new BehaviouralSpaceImpl();
		return behaviouralSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BehaviouralQualifier createBehaviouralQualifier() {
		BehaviouralQualifierImpl behaviouralQualifier = new BehaviouralQualifierImpl();
		return behaviouralQualifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QualificationPackage getQualificationPackage() {
		return (QualificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualificationPackage getPackage() {
		return QualificationPackage.eINSTANCE;
	}

} // QualificationFactoryImpl
