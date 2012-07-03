/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.qualification.QualificationFactory
 * @model kind="package"
 * @generated
 */
public interface QualificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualification"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/qualification"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	QualificationPackage eINSTANCE = net.bhl.cdt.model.qualification.impl.QualificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.QualifierImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__QUALIFIES = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.QualifyingSpaceImpl <em>Qualifying Space</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.QualifyingSpaceImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifyingSpace()
	 * @generated
	 */
	int QUALIFYING_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFYING_SPACE__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Qualifying Space</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFYING_SPACE_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.Qualifiable <em>Qualifiable</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.qualification.Qualifiable
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifiable()
	 * @generated
	 */
	int QUALIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Qualifiable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.CalculationSpaceImpl <em>Calculation Space</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.CalculationSpaceImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getCalculationSpace()
	 * @generated
	 */
	int CALCULATION_SPACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE__NAME = QUALIFYING_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Space Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE__SPACE_QUALIFIER = QUALIFYING_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculation Space</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE_FEATURE_COUNT = QUALIFYING_SPACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.CalculationSpaceQualifierImpl <em>Calculation Space Qualifier</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.CalculationSpaceQualifierImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getCalculationSpaceQualifier()
	 * @generated
	 */
	int CALCULATION_SPACE_QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE_QUALIFIER__NAME = QUALIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE_QUALIFIER__QUALIFIES = QUALIFIER__QUALIFIES;

	/**
	 * The number of structural features of the '<em>Calculation Space Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SPACE_QUALIFIER_FEATURE_COUNT = QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.BehaviouralSpaceImpl <em>Behavioural Space</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.BehaviouralSpaceImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getBehaviouralSpace()
	 * @generated
	 */
	int BEHAVIOURAL_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_SPACE__NAME = QUALIFYING_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Behavioural Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER = QUALIFYING_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioural Space</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_SPACE_FEATURE_COUNT = QUALIFYING_SPACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.BehaviouralQualifierImpl <em>Behavioural Qualifier</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.BehaviouralQualifierImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getBehaviouralQualifier()
	 * @generated
	 */
	int BEHAVIOURAL_QUALIFIER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_QUALIFIER__NAME = QUALIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_QUALIFIER__QUALIFIES = QUALIFIER__QUALIFIES;

	/**
	 * The number of structural features of the '<em>Behavioural Qualifier</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_QUALIFIER_FEATURE_COUNT = QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.ProcessImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = BEHAVIOURAL_QUALIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUALIFIES = BEHAVIOURAL_QUALIFIER__QUALIFIES;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INIT_STATE = BEHAVIOURAL_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fin State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FIN_STATE = BEHAVIOURAL_QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = BEHAVIOURAL_QUALIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.StateImpl <em>State</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.qualification.impl.StateImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = BEHAVIOURAL_QUALIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__QUALIFIES = BEHAVIOURAL_QUALIFIER__QUALIFIES;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = BEHAVIOURAL_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.SequenceImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__QUALIFIES = PROCESS__QUALIFIES;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INIT_STATE = PROCESS__INIT_STATE;

	/**
	 * The feature id for the '<em><b>Fin State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FIN_STATE = PROCESS__FIN_STATE;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PROCESSES = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.qualification.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.qualification.impl.TransitionImpl
	 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__QUALIFIES = PROCESS__QUALIFIES;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INIT_STATE = PROCESS__INIT_STATE;

	/**
	 * The feature id for the '<em><b>Fin State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FIN_STATE = PROCESS__FIN_STATE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.Qualifier <em>Qualifier</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see net.bhl.cdt.model.qualification.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.qualification.Qualifier#getQualifies <em>Qualifies</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifies</em>'.
	 * @see net.bhl.cdt.model.qualification.Qualifier#getQualifies()
	 * @see #getQualifier()
	 * @generated
	 */
	EReference getQualifier_Qualifies();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.QualifyingSpace <em>Qualifying Space</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifying Space</em>'.
	 * @see net.bhl.cdt.model.qualification.QualifyingSpace
	 * @generated
	 */
	EClass getQualifyingSpace();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.Qualifiable <em>Qualifiable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifiable</em>'.
	 * @see net.bhl.cdt.model.qualification.Qualifiable
	 * @generated
	 */
	EClass getQualifiable();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.CalculationSpace <em>Calculation Space</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Space</em>'.
	 * @see net.bhl.cdt.model.qualification.CalculationSpace
	 * @generated
	 */
	EClass getCalculationSpace();

	/**
	 * Returns the meta object for the reference list '
	 * {@link net.bhl.cdt.model.qualification.CalculationSpace#getSpaceQualifier <em>Space Qualifier</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Space Qualifier</em>'.
	 * @see net.bhl.cdt.model.qualification.CalculationSpace#getSpaceQualifier()
	 * @see #getCalculationSpace()
	 * @generated
	 */
	EReference getCalculationSpace_SpaceQualifier();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.CalculationSpaceQualifier <em>Calculation Space Qualifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Space Qualifier</em>'.
	 * @see net.bhl.cdt.model.qualification.CalculationSpaceQualifier
	 * @generated
	 */
	EClass getCalculationSpaceQualifier();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.BehaviouralSpace <em>Behavioural Space</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Space</em>'.
	 * @see net.bhl.cdt.model.qualification.BehaviouralSpace
	 * @generated
	 */
	EClass getBehaviouralSpace();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.qualification.BehaviouralSpace#getBehaviouralQualifier <em>Behavioural Qualifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavioural Qualifier</em>'.
	 * @see net.bhl.cdt.model.qualification.BehaviouralSpace#getBehaviouralQualifier()
	 * @see #getBehaviouralSpace()
	 * @generated
	 */
	EReference getBehaviouralSpace_BehaviouralQualifier();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.BehaviouralQualifier <em>Behavioural Qualifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Qualifier</em>'.
	 * @see net.bhl.cdt.model.qualification.BehaviouralQualifier
	 * @generated
	 */
	EClass getBehaviouralQualifier();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.Process <em>Process</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Process</em>'.
	 * @see net.bhl.cdt.model.qualification.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.qualification.Process#getInitState <em>Init State</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init State</em>'.
	 * @see net.bhl.cdt.model.qualification.Process#getInitState()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_InitState();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.qualification.Process#getFinState <em>Fin State</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin State</em>'.
	 * @see net.bhl.cdt.model.qualification.Process#getFinState()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FinState();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.State <em>State</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>State</em>'.
	 * @see net.bhl.cdt.model.qualification.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.Sequence <em>Sequence</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see net.bhl.cdt.model.qualification.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.qualification.Sequence#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see net.bhl.cdt.model.qualification.Sequence#getProcesses()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Processes();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.qualification.Transition <em>Transition</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see net.bhl.cdt.model.qualification.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualificationFactory getQualificationFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.QualifierImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '<em><b>Qualifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER__QUALIFIES = eINSTANCE.getQualifier_Qualifies();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.QualifyingSpaceImpl <em>Qualifying Space</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.QualifyingSpaceImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifyingSpace()
		 * @generated
		 */
		EClass QUALIFYING_SPACE = eINSTANCE.getQualifyingSpace();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.Qualifiable <em>Qualifiable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.Qualifiable
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getQualifiable()
		 * @generated
		 */
		EClass QUALIFIABLE = eINSTANCE.getQualifiable();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.CalculationSpaceImpl <em>Calculation Space</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.CalculationSpaceImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getCalculationSpace()
		 * @generated
		 */
		EClass CALCULATION_SPACE = eINSTANCE.getCalculationSpace();

		/**
		 * The meta object literal for the '<em><b>Space Qualifier</b></em>' reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_SPACE__SPACE_QUALIFIER = eINSTANCE.getCalculationSpace_SpaceQualifier();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.CalculationSpaceQualifierImpl <em>Calculation Space Qualifier</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.CalculationSpaceQualifierImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getCalculationSpaceQualifier()
		 * @generated
		 */
		EClass CALCULATION_SPACE_QUALIFIER = eINSTANCE.getCalculationSpaceQualifier();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.BehaviouralSpaceImpl <em>Behavioural Space</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.BehaviouralSpaceImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getBehaviouralSpace()
		 * @generated
		 */
		EClass BEHAVIOURAL_SPACE = eINSTANCE.getBehaviouralSpace();

		/**
		 * The meta object literal for the '<em><b>Behavioural Qualifier</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER = eINSTANCE.getBehaviouralSpace_BehaviouralQualifier();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.BehaviouralQualifierImpl <em>Behavioural Qualifier</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.BehaviouralQualifierImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getBehaviouralQualifier()
		 * @generated
		 */
		EClass BEHAVIOURAL_QUALIFIER = eINSTANCE.getBehaviouralQualifier();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.ProcessImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Init State</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INIT_STATE = eINSTANCE.getProcess_InitState();

		/**
		 * The meta object literal for the '<em><b>Fin State</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FIN_STATE = eINSTANCE.getProcess_FinState();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.StateImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.SequenceImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SEQUENCE__PROCESSES = eINSTANCE.getSequence_Processes();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.qualification.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.qualification.impl.TransitionImpl
		 * @see net.bhl.cdt.model.qualification.impl.QualificationPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

	}

} // QualificationPackage
