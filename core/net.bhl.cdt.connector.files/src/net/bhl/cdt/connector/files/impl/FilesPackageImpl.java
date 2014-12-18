/**
 */
package net.bhl.cdt.connector.files.impl;

import net.bhl.cdt.connector.files.FileGenerator;
import net.bhl.cdt.connector.files.FileOperation;
import net.bhl.cdt.connector.files.FileParser;
import net.bhl.cdt.connector.files.FilesFactory;
import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.connector.files.GeometryImporter;
import net.bhl.cdt.connector.files.RequirementsImporter;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.process.ProcessPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesPackageImpl extends EPackageImpl implements FilesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsImporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryImporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileParserEClass = null;

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
	 * @see net.bhl.cdt.connector.files.FilesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilesPackageImpl() {
		super(eNS_URI, FilesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FilesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilesPackage init() {
		if (isInited) return (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);

		// Obtain or create and register package
		FilesPackageImpl theFilesPackage = (FilesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FilesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FilesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFilesPackage.createPackageContents();

		// Initialize created meta-data
		theFilesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilesPackage.eNS_URI, theFilesPackage);
		return theFilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsImporter() {
		return requirementsImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryImporter() {
		return geometryImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileOperation() {
		return fileOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileOperation_FileName() {
		return (EAttribute)fileOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileGenerator() {
		return fileGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileParser() {
		return fileParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesFactory getFilesFactory() {
		return (FilesFactory)getEFactoryInstance();
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
		requirementsImporterEClass = createEClass(REQUIREMENTS_IMPORTER);

		geometryImporterEClass = createEClass(GEOMETRY_IMPORTER);

		fileOperationEClass = createEClass(FILE_OPERATION);
		createEAttribute(fileOperationEClass, FILE_OPERATION__FILE_NAME);

		fileGeneratorEClass = createEClass(FILE_GENERATOR);

		fileParserEClass = createEClass(FILE_PARSER);
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
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementsImporterEClass.getESuperTypes().add(this.getFileParser());
		geometryImporterEClass.getESuperTypes().add(this.getFileParser());
		fileOperationEClass.getESuperTypes().add(theProcessPackage.getDesignOperation());
		fileGeneratorEClass.getESuperTypes().add(this.getFileOperation());
		fileGeneratorEClass.getESuperTypes().add(theModelPackage.getOperationWithInput());
		fileParserEClass.getESuperTypes().add(this.getFileOperation());
		fileParserEClass.getESuperTypes().add(theModelPackage.getOperationWithOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementsImporterEClass, RequirementsImporter.class, "RequirementsImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geometryImporterEClass, GeometryImporter.class, "GeometryImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileOperationEClass, FileOperation.class, "FileOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileOperation_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, FileOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileGeneratorEClass, FileGenerator.class, "FileGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileParserEClass, FileParser.class, "FileParser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FilesPackageImpl
