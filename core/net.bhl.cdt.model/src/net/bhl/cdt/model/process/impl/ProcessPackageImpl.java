/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryPackage;
import net.bhl.cdt.model.geometry.impl.GeometryPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.ProcessFactory;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.impl.SystemPackageImpl;
import net.bhl.cdt.model.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageImpl extends EPackageImpl implements ProcessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designProcessEClass = null;

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
	 * @see net.bhl.cdt.model.process.ProcessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessPackageImpl() {
		super(eNS_URI, ProcessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessPackage init() {
		if (isInited) return (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Obtain or create and register package
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		DesignoperationsPackageImpl theDesignoperationsPackage = (DesignoperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) instanceof DesignoperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) : DesignoperationsPackage.eINSTANCE);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) : SelectionPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) : GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theProcessPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theDesignoperationsPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theProcessPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theDesignoperationsPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessPackage.eNS_URI, theProcessPackage);
		return theProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignOperation() {
		return designOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignOperation_Superprocess() {
		return (EReference)designOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessElement_Busy() {
		return (EAttribute)processElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessElement_TimeStamp() {
		return (EAttribute)processElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessElement__Start() {
		return processElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessElement__IsStartable() {
		return processElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessElement__GetStrategy__EClass() {
		return processElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignProcess() {
		return designProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignProcess_DesignProcessElements() {
		return (EReference)designProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactory getProcessFactory() {
		return (ProcessFactory)getEFactoryInstance();
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
		designOperationEClass = createEClass(DESIGN_OPERATION);
		createEReference(designOperationEClass, DESIGN_OPERATION__SUPERPROCESS);

		processElementEClass = createEClass(PROCESS_ELEMENT);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__BUSY);
		createEAttribute(processElementEClass, PROCESS_ELEMENT__TIME_STAMP);
		createEOperation(processElementEClass, PROCESS_ELEMENT___START);
		createEOperation(processElementEClass, PROCESS_ELEMENT___IS_STARTABLE);
		createEOperation(processElementEClass, PROCESS_ELEMENT___GET_STRATEGY__ECLASS);

		designProcessEClass = createEClass(DESIGN_PROCESS);
		createEReference(designProcessEClass, DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS);
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
		DesignoperationsPackage theDesignoperationsPackage = (DesignoperationsPackage)EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI);
		SelectionPackage theSelectionPackage = (SelectionPackage)EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDesignoperationsPackage);
		getESubpackages().add(theSelectionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		designOperationEClass.getESuperTypes().add(this.getProcessElement());
		processElementEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		designProcessEClass.getESuperTypes().add(this.getProcessElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(designOperationEClass, DesignOperation.class, "DesignOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignOperation_Superprocess(), this.getDesignProcess(), null, "superprocess", null, 0, 1, DesignOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessElement_Busy(), ecorePackage.getEBoolean(), "busy", null, 0, 1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessElement_TimeStamp(), ecorePackage.getEString(), "timeStamp", null, 0, 1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessElement__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessElement__IsStartable(), ecorePackage.getEBoolean(), "isStartable", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getProcessElement__GetStrategy__EClass(), theModelPackage.getOperationStrategy(), "getStrategy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(designProcessEClass, DesignProcess.class, "DesignProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignProcess_DesignProcessElements(), this.getProcessElement(), null, "designProcessElements", null, 0, -1, DesignProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ProcessPackageImpl
