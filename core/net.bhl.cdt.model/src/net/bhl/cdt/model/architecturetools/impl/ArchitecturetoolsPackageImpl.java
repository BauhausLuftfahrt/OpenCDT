/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.model.architecturetools.DensityInterface;
import net.bhl.cdt.model.architecturetools.Massive;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.architecturetools.PowerDemandView;
import net.bhl.cdt.model.architecturetools.RangeInterface;
import net.bhl.cdt.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.model.architecturetools.SFCInterface;
import net.bhl.cdt.model.architecturetools.VelocityInterface;
import net.bhl.cdt.model.architecturetools.WettedAreaInterface;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.impl.CalculationPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.impl.QualificationPackageImpl;
import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturetoolsPackageImpl extends EPackageImpl implements ArchitecturetoolsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConsumerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerDemandViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coefficientInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wettedAreaInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAreaInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altitudeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfcInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass densityInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityInterfaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturetoolsPackageImpl() {
		super(eNS_URI, ArchitecturetoolsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link ArchitecturetoolsPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturetoolsPackage init() {
		if (isInited) return (ArchitecturetoolsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturetoolsPackage.eNS_URI);

		// Obtain or create and register package
		ArchitecturetoolsPackageImpl theArchitecturetoolsPackage = (ArchitecturetoolsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitecturetoolsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitecturetoolsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasecalculationmodelPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		QualificationPackageImpl theQualificationPackage = (QualificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualificationPackage.eNS_URI) instanceof QualificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualificationPackage.eNS_URI) : QualificationPackage.eINSTANCE);
		CalculationPackageImpl theCalculationPackage = (CalculationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculationPackage.eNS_URI) instanceof CalculationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculationPackage.eNS_URI) : CalculationPackage.eINSTANCE);

		// Create package meta-data objects
		theArchitecturetoolsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theQualificationPackage.createPackageContents();
		theCalculationPackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturetoolsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theQualificationPackage.initializePackageContents();
		theCalculationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturetoolsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturetoolsPackage.eNS_URI, theArchitecturetoolsPackage);
		return theArchitecturetoolsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConsumer() {
		return powerConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumer_PowerParameter() {
		return (EReference)powerConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConsumer_Type() {
		return (EAttribute)powerConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerDemandView() {
		return powerDemandViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerDemandView_ReferencedConfigurations() {
		return (EReference)powerDemandViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassive() {
		return massiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassive_MassParameter() {
		return (EReference)massiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoefficientInterface() {
		return coefficientInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoefficientInterface_Type() {
		return (EAttribute)coefficientInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoefficientInterface_CoefficientParameter() {
		return (EReference)coefficientInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWettedAreaInterface() {
		return wettedAreaInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWettedAreaInterface_WettedAreaParameter() {
		return (EReference)wettedAreaInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceAreaInterface() {
		return referenceAreaInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceAreaInterface_ReferenceAreaParameter() {
		return (EReference)referenceAreaInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltitudeInterface() {
		return altitudeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAltitudeInterface_AltitudeParameter() {
		return (EReference)altitudeInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeInterface() {
		return rangeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeInterface_RangeParameter() {
		return (EReference)rangeInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFCInterface() {
		return sfcInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFCInterface_SfcParameter() {
		return (EReference)sfcInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDensityInterface() {
		return densityInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDensityInterface_DensityParameter() {
		return (EReference)densityInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocityInterface() {
		return velocityInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVelocityInterface_VelocityParameter() {
		return (EReference)velocityInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolsFactory getArchitecturetoolsFactory() {
		return (ArchitecturetoolsFactory)getEFactoryInstance();
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
		powerConsumerEClass = createEClass(POWER_CONSUMER);
		createEReference(powerConsumerEClass, POWER_CONSUMER__POWER_PARAMETER);
		createEAttribute(powerConsumerEClass, POWER_CONSUMER__TYPE);

		powerDemandViewEClass = createEClass(POWER_DEMAND_VIEW);
		createEReference(powerDemandViewEClass, POWER_DEMAND_VIEW__REFERENCED_CONFIGURATIONS);

		massiveEClass = createEClass(MASSIVE);
		createEReference(massiveEClass, MASSIVE__MASS_PARAMETER);

		coefficientInterfaceEClass = createEClass(COEFFICIENT_INTERFACE);
		createEAttribute(coefficientInterfaceEClass, COEFFICIENT_INTERFACE__TYPE);
		createEReference(coefficientInterfaceEClass, COEFFICIENT_INTERFACE__COEFFICIENT_PARAMETER);

		wettedAreaInterfaceEClass = createEClass(WETTED_AREA_INTERFACE);
		createEReference(wettedAreaInterfaceEClass, WETTED_AREA_INTERFACE__WETTED_AREA_PARAMETER);

		referenceAreaInterfaceEClass = createEClass(REFERENCE_AREA_INTERFACE);
		createEReference(referenceAreaInterfaceEClass, REFERENCE_AREA_INTERFACE__REFERENCE_AREA_PARAMETER);

		altitudeInterfaceEClass = createEClass(ALTITUDE_INTERFACE);
		createEReference(altitudeInterfaceEClass, ALTITUDE_INTERFACE__ALTITUDE_PARAMETER);

		rangeInterfaceEClass = createEClass(RANGE_INTERFACE);
		createEReference(rangeInterfaceEClass, RANGE_INTERFACE__RANGE_PARAMETER);

		sfcInterfaceEClass = createEClass(SFC_INTERFACE);
		createEReference(sfcInterfaceEClass, SFC_INTERFACE__SFC_PARAMETER);

		densityInterfaceEClass = createEClass(DENSITY_INTERFACE);
		createEReference(densityInterfaceEClass, DENSITY_INTERFACE__DENSITY_PARAMETER);

		velocityInterfaceEClass = createEClass(VELOCITY_INTERFACE);
		createEReference(velocityInterfaceEClass, VELOCITY_INTERFACE__VELOCITY_PARAMETER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		powerConsumerEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		powerDemandViewEClass.getESuperTypes().add(theModelPackage.getView());
		massiveEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		coefficientInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		wettedAreaInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		referenceAreaInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		altitudeInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		rangeInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		sfcInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		densityInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());
		velocityInterfaceEClass.getESuperTypes().add(theModelPackage.getMappableComponentInterface());

		// Initialize classes and features; add operations and parameters
		initEClass(powerConsumerEClass, PowerConsumer.class, "PowerConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPowerConsumer_PowerParameter(), theModelPackage.getParameter(), null, "powerParameter", null, 0, 1, PowerConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPowerConsumer_Type(), ecorePackage.getEString(), "type", null, 0, 1, PowerConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(powerConsumerEClass, theModelPackage.getValue(), "getPowerConsumption", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(powerDemandViewEClass, PowerDemandView.class, "PowerDemandView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPowerDemandView_ReferencedConfigurations(), theModelPackage.getConfiguration(), null, "referencedConfigurations", null, 0, -1, PowerDemandView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(massiveEClass, Massive.class, "Massive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMassive_MassParameter(), theModelPackage.getParameter(), null, "massParameter", null, 0, 1, Massive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(massiveEClass, theModelPackage.getValue(), "getMass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(coefficientInterfaceEClass, CoefficientInterface.class, "CoefficientInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCoefficientInterface_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CoefficientInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCoefficientInterface_CoefficientParameter(), theModelPackage.getParameter(), null, "coefficientParameter", null, 0, 1, CoefficientInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(coefficientInterfaceEClass, theModelPackage.getValue(), "getCoefficient", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(wettedAreaInterfaceEClass, WettedAreaInterface.class, "WettedAreaInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWettedAreaInterface_WettedAreaParameter(), theModelPackage.getParameter(), null, "wettedAreaParameter", null, 0, 1, WettedAreaInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(wettedAreaInterfaceEClass, theModelPackage.getValue(), "getWettedArea", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(referenceAreaInterfaceEClass, ReferenceAreaInterface.class, "ReferenceAreaInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReferenceAreaInterface_ReferenceAreaParameter(), theModelPackage.getParameter(), null, "referenceAreaParameter", null, 0, 1, ReferenceAreaInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(referenceAreaInterfaceEClass, theModelPackage.getValue(), "getReferenceArea", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(altitudeInterfaceEClass, AltitudeInterface.class, "AltitudeInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAltitudeInterface_AltitudeParameter(), theModelPackage.getParameter(), null, "altitudeParameter", null, 0, 1, AltitudeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(altitudeInterfaceEClass, theModelPackage.getValue(), "getAltitude", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rangeInterfaceEClass, RangeInterface.class, "RangeInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRangeInterface_RangeParameter(), theModelPackage.getParameter(), null, "rangeParameter", null, 0, 1, RangeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(rangeInterfaceEClass, theModelPackage.getValue(), "getRange", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(sfcInterfaceEClass, SFCInterface.class, "SFCInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSFCInterface_SfcParameter(), theModelPackage.getParameter(), null, "sfcParameter", null, 0, 1, SFCInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(sfcInterfaceEClass, theModelPackage.getValue(), "getSFC", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(densityInterfaceEClass, DensityInterface.class, "DensityInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDensityInterface_DensityParameter(), theModelPackage.getParameter(), null, "densityParameter", null, 0, 1, DensityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(densityInterfaceEClass, theModelPackage.getValue(), "getDensity", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(velocityInterfaceEClass, VelocityInterface.class, "VelocityInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVelocityInterface_VelocityParameter(), theModelPackage.getParameter(), null, "velocityParameter", null, 0, 1, VelocityInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(velocityInterfaceEClass, theModelPackage.getValue(), "getVelocity", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
	}

} // ArchitecturetoolsPackageImpl
