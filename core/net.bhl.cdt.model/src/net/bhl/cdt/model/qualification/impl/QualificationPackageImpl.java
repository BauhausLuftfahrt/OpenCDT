/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.impl.CalculationPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.qualification.BehaviouralQualifier;
import net.bhl.cdt.model.qualification.BehaviouralSpace;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.Qualifiable;
import net.bhl.cdt.model.qualification.QualificationFactory;
import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.Qualifier;
import net.bhl.cdt.model.qualification.QualifyingSpace;
import net.bhl.cdt.model.qualification.Sequence;
import net.bhl.cdt.model.qualification.State;
import net.bhl.cdt.model.qualification.Transition;
import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class QualificationPackageImpl extends EPackageImpl implements QualificationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifyingSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationSpaceQualifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviouralSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviouralQualifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualificationPackageImpl() {
		super(eNS_URI, QualificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link QualificationPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualificationPackage init() {
		if (isInited) return (QualificationPackage)EPackage.Registry.INSTANCE.getEPackage(QualificationPackage.eNS_URI);

		// Obtain or create and register package
		QualificationPackageImpl theQualificationPackage = (QualificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualificationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasecalculationmodelPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		CalculationPackageImpl theCalculationPackage = (CalculationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculationPackage.eNS_URI) instanceof CalculationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculationPackage.eNS_URI) : CalculationPackage.eINSTANCE);

		// Create package meta-data objects
		theQualificationPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCalculationPackage.createPackageContents();

		// Initialize created meta-data
		theQualificationPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCalculationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualificationPackage.eNS_URI, theQualificationPackage);
		return theQualificationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifier() {
		return qualifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifier_Qualifies() {
		return (EReference)qualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifyingSpace() {
		return qualifyingSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiable() {
		return qualifiableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculationSpace() {
		return calculationSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculationSpace_SpaceQualifier() {
		return (EReference)calculationSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculationSpaceQualifier() {
		return calculationSpaceQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviouralSpace() {
		return behaviouralSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviouralSpace_BehaviouralQualifier() {
		return (EReference)behaviouralSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviouralQualifier() {
		return behaviouralQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_InitState() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_FinState() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Processes() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationFactory getQualificationFactory() {
		return (QualificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		qualifierEClass = createEClass(QUALIFIER);
		createEReference(qualifierEClass, QUALIFIER__QUALIFIES);

		qualifyingSpaceEClass = createEClass(QUALIFYING_SPACE);

		qualifiableEClass = createEClass(QUALIFIABLE);

		calculationSpaceEClass = createEClass(CALCULATION_SPACE);
		createEReference(calculationSpaceEClass, CALCULATION_SPACE__SPACE_QUALIFIER);

		calculationSpaceQualifierEClass = createEClass(CALCULATION_SPACE_QUALIFIER);

		behaviouralSpaceEClass = createEClass(BEHAVIOURAL_SPACE);
		createEReference(behaviouralSpaceEClass, BEHAVIOURAL_SPACE__BEHAVIOURAL_QUALIFIER);

		behaviouralQualifierEClass = createEClass(BEHAVIOURAL_QUALIFIER);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__INIT_STATE);
		createEReference(processEClass, PROCESS__FIN_STATE);

		stateEClass = createEClass(STATE);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__PROCESSES);

		transitionEClass = createEClass(TRANSITION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qualifierEClass.getESuperTypes().add(theModelPackage.getElement());
		qualifyingSpaceEClass.getESuperTypes().add(theModelPackage.getElement());
		qualifiableEClass.getESuperTypes().add(theModelPackage.getElement());
		calculationSpaceEClass.getESuperTypes().add(this.getQualifyingSpace());
		calculationSpaceQualifierEClass.getESuperTypes().add(this.getQualifier());
		behaviouralSpaceEClass.getESuperTypes().add(this.getQualifyingSpace());
		behaviouralQualifierEClass.getESuperTypes().add(this.getQualifier());
		processEClass.getESuperTypes().add(this.getBehaviouralQualifier());
		stateEClass.getESuperTypes().add(this.getBehaviouralQualifier());
		sequenceEClass.getESuperTypes().add(this.getProcess());
		transitionEClass.getESuperTypes().add(this.getProcess());

		// Initialize classes and features; add operations and parameters
		initEClass(qualifierEClass, Qualifier.class, "Qualifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getQualifier_Qualifies(), this.getQualifiable(), null, "qualifies", null, 0, -1, Qualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(qualifyingSpaceEClass, QualifyingSpace.class, "QualifyingSpace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(qualifiableEClass, Qualifiable.class, "Qualifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(calculationSpaceEClass, CalculationSpace.class, "CalculationSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCalculationSpace_SpaceQualifier(), this.getCalculationSpaceQualifier(), null, "spaceQualifier", null, 0, -1, CalculationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(calculationSpaceQualifierEClass, CalculationSpaceQualifier.class, "CalculationSpaceQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(behaviouralSpaceEClass, BehaviouralSpace.class, "BehaviouralSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehaviouralSpace_BehaviouralQualifier(), this.getBehaviouralQualifier(), null, "behaviouralQualifier", null, 0, -1, BehaviouralSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviouralQualifierEClass, BehaviouralQualifier.class, "BehaviouralQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(processEClass, net.bhl.cdt.model.qualification.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProcess_InitState(), this.getState(), null, "initState", null, 0, 1, net.bhl.cdt.model.qualification.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProcess_FinState(), this.getState(), null, "finState", null, 0, 1, net.bhl.cdt.model.qualification.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSequence_Processes(), this.getProcess(), null, "processes", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
	}

} // QualificationPackageImpl
