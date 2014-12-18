/**
 */
package net.bhl.cdt.connector.files;

import net.bhl.cdt.model.process.ProcessPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.files.FilesFactory
 * @model kind="package"
 * @generated
 */
public interface FilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "files";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/connector/files";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.connector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesPackage eINSTANCE = net.bhl.cdt.connector.files.impl.FilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.files.impl.RequirementsImporterImpl <em>Requirements Importer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.files.impl.RequirementsImporterImpl
	 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getRequirementsImporter()
	 * @generated
	 */
	int REQUIREMENTS_IMPORTER = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.files.impl.GeometryImporterImpl <em>Geometry Importer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.files.impl.GeometryImporterImpl
	 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getGeometryImporter()
	 * @generated
	 */
	int GEOMETRY_IMPORTER = 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.files.impl.FileOperationImpl <em>File Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.files.impl.FileOperationImpl
	 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileOperation()
	 * @generated
	 */
	int FILE_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION__NAME = ProcessPackage.DESIGN_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION__BUSY = ProcessPackage.DESIGN_OPERATION__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION__TIME_STAMP = ProcessPackage.DESIGN_OPERATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION__SUPERPROCESS = ProcessPackage.DESIGN_OPERATION__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION__FILE_NAME = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_FEATURE_COUNT = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION___START = ProcessPackage.DESIGN_OPERATION___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION___IS_STARTABLE = ProcessPackage.DESIGN_OPERATION___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION___GET_STRATEGY__ECLASS = ProcessPackage.DESIGN_OPERATION___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>File Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_OPERATION_COUNT = ProcessPackage.DESIGN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.files.impl.FileGeneratorImpl <em>File Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.files.impl.FileGeneratorImpl
	 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileGenerator()
	 * @generated
	 */
	int FILE_GENERATOR = 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.files.impl.FileParserImpl <em>File Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.files.impl.FileParserImpl
	 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileParser()
	 * @generated
	 */
	int FILE_PARSER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__NAME = FILE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__BUSY = FILE_OPERATION__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__TIME_STAMP = FILE_OPERATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__SUPERPROCESS = FILE_OPERATION__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__FILE_NAME = FILE_OPERATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER__GENERATED_ELEMENTS = FILE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER_FEATURE_COUNT = FILE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER___START = FILE_OPERATION___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER___IS_STARTABLE = FILE_OPERATION___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER___GET_STRATEGY__ECLASS = FILE_OPERATION___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>File Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARSER_OPERATION_COUNT = FILE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__NAME = FILE_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__BUSY = FILE_PARSER__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__TIME_STAMP = FILE_PARSER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__SUPERPROCESS = FILE_PARSER__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__FILE_NAME = FILE_PARSER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER__GENERATED_ELEMENTS = FILE_PARSER__GENERATED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Requirements Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER_FEATURE_COUNT = FILE_PARSER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER___START = FILE_PARSER___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER___IS_STARTABLE = FILE_PARSER___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER___GET_STRATEGY__ECLASS = FILE_PARSER___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Requirements Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_IMPORTER_OPERATION_COUNT = FILE_PARSER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__NAME = FILE_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__BUSY = FILE_PARSER__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__TIME_STAMP = FILE_PARSER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__SUPERPROCESS = FILE_PARSER__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__FILE_NAME = FILE_PARSER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER__GENERATED_ELEMENTS = FILE_PARSER__GENERATED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Geometry Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER_FEATURE_COUNT = FILE_PARSER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER___START = FILE_PARSER___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER___IS_STARTABLE = FILE_PARSER___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER___GET_STRATEGY__ECLASS = FILE_PARSER___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Geometry Importer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_IMPORTER_OPERATION_COUNT = FILE_PARSER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__NAME = FILE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__BUSY = FILE_OPERATION__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__TIME_STAMP = FILE_OPERATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__SUPERPROCESS = FILE_OPERATION__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__FILE_NAME = FILE_OPERATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR__PROCESSED_ELEMENTS = FILE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR_FEATURE_COUNT = FILE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR___START = FILE_OPERATION___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR___IS_STARTABLE = FILE_OPERATION___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR___GET_STRATEGY__ECLASS = FILE_OPERATION___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>File Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_GENERATOR_OPERATION_COUNT = FILE_OPERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.files.RequirementsImporter <em>Requirements Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Importer</em>'.
	 * @see net.bhl.cdt.connector.files.RequirementsImporter
	 * @generated
	 */
	EClass getRequirementsImporter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.files.GeometryImporter <em>Geometry Importer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Importer</em>'.
	 * @see net.bhl.cdt.connector.files.GeometryImporter
	 * @generated
	 */
	EClass getGeometryImporter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.files.FileOperation <em>File Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Operation</em>'.
	 * @see net.bhl.cdt.connector.files.FileOperation
	 * @generated
	 */
	EClass getFileOperation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.files.FileOperation#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see net.bhl.cdt.connector.files.FileOperation#getFileName()
	 * @see #getFileOperation()
	 * @generated
	 */
	EAttribute getFileOperation_FileName();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.files.FileGenerator <em>File Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Generator</em>'.
	 * @see net.bhl.cdt.connector.files.FileGenerator
	 * @generated
	 */
	EClass getFileGenerator();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.files.FileParser <em>File Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Parser</em>'.
	 * @see net.bhl.cdt.connector.files.FileParser
	 * @generated
	 */
	EClass getFileParser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilesFactory getFilesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.files.impl.RequirementsImporterImpl <em>Requirements Importer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.files.impl.RequirementsImporterImpl
		 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getRequirementsImporter()
		 * @generated
		 */
		EClass REQUIREMENTS_IMPORTER = eINSTANCE.getRequirementsImporter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.files.impl.GeometryImporterImpl <em>Geometry Importer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.files.impl.GeometryImporterImpl
		 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getGeometryImporter()
		 * @generated
		 */
		EClass GEOMETRY_IMPORTER = eINSTANCE.getGeometryImporter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.files.impl.FileOperationImpl <em>File Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.files.impl.FileOperationImpl
		 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileOperation()
		 * @generated
		 */
		EClass FILE_OPERATION = eINSTANCE.getFileOperation();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_OPERATION__FILE_NAME = eINSTANCE.getFileOperation_FileName();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.files.impl.FileGeneratorImpl <em>File Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.files.impl.FileGeneratorImpl
		 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileGenerator()
		 * @generated
		 */
		EClass FILE_GENERATOR = eINSTANCE.getFileGenerator();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.files.impl.FileParserImpl <em>File Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.files.impl.FileParserImpl
		 * @see net.bhl.cdt.connector.files.impl.FilesPackageImpl#getFileParser()
		 * @generated
		 */
		EClass FILE_PARSER = eINSTANCE.getFileParser();

	}

} //FilesPackage
