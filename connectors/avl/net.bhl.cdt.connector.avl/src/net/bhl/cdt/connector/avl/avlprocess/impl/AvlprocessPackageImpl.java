/**
 */
package net.bhl.cdt.connector.avl.avlprocess.impl;

import net.bhl.cdt.connector.avl.AvlPackage;

import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;

import net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl;

import net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator;
import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.avl.avlprocess.VariableSweep;

import net.bhl.cdt.connector.avl.impl.AvlPackageImpl;

import net.bhl.cdt.connector.files.FilesPackage;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.system.SystemPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class AvlprocessPackageImpl extends EPackageImpl implements AvlprocessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlProcessGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableSweepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlResultImporterEClass = null;

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
	 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvlprocessPackageImpl() {
		super(eNS_URI, AvlprocessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AvlprocessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvlprocessPackage init() {
		if (isInited) return (AvlprocessPackage)EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI);

		// Obtain or create and register package
		AvlprocessPackageImpl theAvlprocessPackage = (AvlprocessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AvlprocessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AvlprocessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AvlPackageImpl theAvlPackage = (AvlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlPackage.eNS_URI) instanceof AvlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlPackage.eNS_URI) : AvlPackage.eINSTANCE);
		AvlmodelPackageImpl theAvlmodelPackage = (AvlmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI) instanceof AvlmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI) : AvlmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theAvlprocessPackage.createPackageContents();
		theAvlPackage.createPackageContents();
		theAvlmodelPackage.createPackageContents();

		// Initialize created meta-data
		theAvlprocessPackage.initializePackageContents();
		theAvlPackage.initializePackageContents();
		theAvlmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAvlprocessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvlprocessPackage.eNS_URI, theAvlprocessPackage);
		return theAvlprocessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLProcessGenerator() {
		return avlProcessGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLProcessGenerator_VariableSweeps() {
		return (EReference)avlProcessGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLProcessGenerator_CommandFileName() {
		return (EAttribute)avlProcessGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLProcessGenerator_RuncaseCounter() {
		return (EAttribute)avlProcessGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLProcessGenerator_AvlResultImporters() {
		return (EReference)avlProcessGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableSweep() {
		return variableSweepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableSweep_VariableStart() {
		return (EReference)variableSweepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableSweep_VariableEnd() {
		return (EReference)variableSweepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableSweep_VariableDelta() {
		return (EReference)variableSweepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLResultImporter() {
		return avlResultImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlprocessFactory getAvlprocessFactory() {
		return (AvlprocessFactory)getEFactoryInstance();
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
		avlProcessGeneratorEClass = createEClass(AVL_PROCESS_GENERATOR);
		createEReference(avlProcessGeneratorEClass, AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS);
		createEAttribute(avlProcessGeneratorEClass, AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME);
		createEAttribute(avlProcessGeneratorEClass, AVL_PROCESS_GENERATOR__RUNCASE_COUNTER);
		createEReference(avlProcessGeneratorEClass, AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS);

		variableSweepEClass = createEClass(VARIABLE_SWEEP);
		createEReference(variableSweepEClass, VARIABLE_SWEEP__VARIABLE_START);
		createEReference(variableSweepEClass, VARIABLE_SWEEP__VARIABLE_END);
		createEReference(variableSweepEClass, VARIABLE_SWEEP__VARIABLE_DELTA);

		avlResultImporterEClass = createEClass(AVL_RESULT_IMPORTER);
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
		FilesPackage theFilesPackage = (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		avlProcessGeneratorEClass.getESuperTypes().add(theFilesPackage.getFileGenerator());
		variableSweepEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		avlResultImporterEClass.getESuperTypes().add(theFilesPackage.getFileParser());

		// Initialize classes, features, and operations; add parameters
		initEClass(avlProcessGeneratorEClass, AVLProcessGenerator.class, "AVLProcessGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAVLProcessGenerator_VariableSweeps(), this.getVariableSweep(), null, "variableSweeps", null, 0, -1, AVLProcessGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLProcessGenerator_CommandFileName(), ecorePackage.getEString(), "commandFileName", null, 0, 1, AVLProcessGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLProcessGenerator_RuncaseCounter(), ecorePackage.getEInt(), "runcaseCounter", null, 0, 1, AVLProcessGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLProcessGenerator_AvlResultImporters(), this.getAVLResultImporter(), null, "avlResultImporters", null, 0, -1, AVLProcessGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableSweepEClass, VariableSweep.class, "VariableSweep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableSweep_VariableStart(), theSystemPackage.getDecimalNumber(), null, "variableStart", null, 0, 1, VariableSweep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableSweep_VariableEnd(), theSystemPackage.getDecimalNumber(), null, "variableEnd", null, 0, 1, VariableSweep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableSweep_VariableDelta(), theSystemPackage.getDecimalNumber(), null, "variableDelta", null, 0, 1, VariableSweep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avlResultImporterEClass, AVLResultImporter.class, "AVLResultImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AvlprocessPackageImpl
