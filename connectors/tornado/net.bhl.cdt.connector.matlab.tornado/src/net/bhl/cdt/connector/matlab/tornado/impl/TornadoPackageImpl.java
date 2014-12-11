/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.impl;

import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoFactory;
import net.bhl.cdt.connector.matlab.tornado.TornadoGeometry;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.connector.matlab.tornado.TornadoState;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.system.SystemPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TornadoPackageImpl extends EPackageImpl implements TornadoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tornadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tornadoGeometryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tornadoStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.connector.matlab.tornado.TornadoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TornadoPackageImpl() {
		super(eNS_URI, TornadoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TornadoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TornadoPackage init() {
		if (isInited) return (TornadoPackage)EPackage.Registry.INSTANCE.getEPackage(TornadoPackage.eNS_URI);

		// Obtain or create and register package
		TornadoPackageImpl theTornadoPackage = (TornadoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TornadoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TornadoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTornadoPackage.createPackageContents();

		// Initialize created meta-data
		theTornadoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTornadoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TornadoPackage.eNS_URI, theTornadoPackage);
		return theTornadoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTornado() {
		return tornadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornado_TornadoGeometry() {
		return (EReference)tornadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornado_TornadoState() {
		return (EReference)tornadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTornadoGeometry() {
		return tornadoGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornadoGeometry_SweepAngle() {
		return (EReference)tornadoGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTornadoState() {
		return tornadoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornadoState_Altitude() {
		return (EReference)tornadoStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornadoState_Rho() {
		return (EReference)tornadoStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornadoState_AirSpeed() {
		return (EReference)tornadoStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTornadoState_Alpha() {
		return (EReference)tornadoStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoFactory getTornadoFactory() {
		return (TornadoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tornadoGeometryEClass = createEClass(TORNADO_GEOMETRY);
		createEReference(tornadoGeometryEClass, TORNADO_GEOMETRY__SWEEP_ANGLE);

		tornadoStateEClass = createEClass(TORNADO_STATE);
		createEReference(tornadoStateEClass, TORNADO_STATE__ALTITUDE);
		createEReference(tornadoStateEClass, TORNADO_STATE__RHO);
		createEReference(tornadoStateEClass, TORNADO_STATE__AIR_SPEED);
		createEReference(tornadoStateEClass, TORNADO_STATE__ALPHA);

		tornadoEClass = createEClass(TORNADO);
		createEReference(tornadoEClass, TORNADO__TORNADO_GEOMETRY);
		createEReference(tornadoEClass, TORNADO__TORNADO_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		DesignoperationsPackage theDesignoperationsPackage = (DesignoperationsPackage)EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tornadoEClass.getESuperTypes().add(theDesignoperationsPackage.getDisciplineToolService());
		tornadoEClass.getESuperTypes().add(theModelPackage.getOperationWithOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(tornadoGeometryEClass, TornadoGeometry.class, "TornadoGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTornadoGeometry_SweepAngle(), theSystemPackage.getMeasuredValue(), null, "sweepAngle", null, 0, 1, TornadoGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tornadoStateEClass, TornadoState.class, "TornadoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTornadoState_Altitude(), theSystemPackage.getMeasuredValue(), null, "altitude", null, 0, 1, TornadoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTornadoState_Rho(), theSystemPackage.getMeasuredValue(), null, "rho", null, 0, 1, TornadoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTornadoState_AirSpeed(), theSystemPackage.getMeasuredValue(), null, "airSpeed", null, 0, 1, TornadoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTornadoState_Alpha(), theSystemPackage.getMeasuredValue(), null, "alpha", null, 0, 1, TornadoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tornadoEClass, Tornado.class, "Tornado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTornado_TornadoGeometry(), this.getTornadoGeometry(), null, "tornadoGeometry", null, 0, 1, Tornado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTornado_TornadoState(), this.getTornadoState(), null, "tornadoState", null, 0, 1, Tornado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TornadoPackageImpl
