/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.impl;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.geometry.GeometryPackage;
import net.bhl.cdt.model.geometry.impl.GeometryPackageImpl;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl;
import net.bhl.cdt.model.process.impl.ProcessPackageImpl;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.impl.SystemPackageImpl;
import net.bhl.cdt.model.system.quantities.QuantitiesPackage;
import net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl;
import net.bhl.cdt.model.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationWithInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationWithOutputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatableElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationStrategyEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		DesignoperationsPackageImpl theDesignoperationsPackage = (DesignoperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) instanceof DesignoperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) : DesignoperationsPackage.eINSTANCE);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) : SelectionPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) : GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theDesignoperationsPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theQuantitiesPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theDesignoperationsPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theQuantitiesPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationWithInput() {
		return operationWithInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationWithInput_ProcessedElements() {
		return (EReference)operationWithInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationWithOutput() {
		return operationWithOutputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationWithOutput_GeneratedElements() {
		return (EReference)operationWithOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratableElement() {
		return generatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratableElement_SourceOperation() {
		return (EReference)generatableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessableElement() {
		return processableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationStrategy() {
		return operationStrategyEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		operationWithInputEClass = createEClass(OPERATION_WITH_INPUT);
		createEReference(operationWithInputEClass, OPERATION_WITH_INPUT__PROCESSED_ELEMENTS);

		operationWithOutputEClass = createEClass(OPERATION_WITH_OUTPUT);
		createEReference(operationWithOutputEClass, OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS);

		generatableElementEClass = createEClass(GENERATABLE_ELEMENT);
		createEReference(generatableElementEClass, GENERATABLE_ELEMENT__SOURCE_OPERATION);

		processableElementEClass = createEClass(PROCESSABLE_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create data types
		urlEDataType = createEDataType(URL);
		operationStrategyEDataType = createEDataType(OPERATION_STRATEGY);
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
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		GeometryPackage theGeometryPackage = (GeometryPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theProcessPackage);
		getESubpackages().add(theSystemPackage);
		getESubpackages().add(theGeometryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(operationWithInputEClass, OperationWithInput.class, "OperationWithInput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationWithInput_ProcessedElements(), this.getProcessableElement(), null, "processedElements", null, 0, -1, OperationWithInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationWithOutputEClass, OperationWithOutput.class, "OperationWithOutput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationWithOutput_GeneratedElements(), this.getGeneratableElement(), null, "generatedElements", null, 0, -1, OperationWithOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatableElementEClass, GeneratableElement.class, "GeneratableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratableElement_SourceOperation(), this.getOperationWithOutput(), null, "sourceOperation", null, 0, 1, GeneratableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processableElementEClass, ProcessableElement.class, "ProcessableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationStrategyEDataType, OperationStrategy.class, "OperationStrategy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ModelPackageImpl
