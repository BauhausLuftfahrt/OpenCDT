/**
 */
package net.bhl.cdt.connector.avl.avlprocess;

import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.model.ModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory
 * @model kind="package"
 * @generated
 */
public interface AvlprocessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avlprocess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/connector/avl/avlprocess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.connector.avl.avlprocess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	AvlprocessPackage eINSTANCE = net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl <em>AVL Process Generator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getAVLProcessGenerator()
	 * @generated
	 */
	int AVL_PROCESS_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__NAME = FilesPackage.FILE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__BUSY = FilesPackage.FILE_GENERATOR__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__TIME_STAMP = FilesPackage.FILE_GENERATOR__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__SUPERPROCESS = FilesPackage.FILE_GENERATOR__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__FILE_NAME = FilesPackage.FILE_GENERATOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__PROCESSED_ELEMENTS = FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Variable Sweeps</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command File Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runcase Counter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__RUNCASE_COUNTER = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avl Result Importers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AVL Process Generator</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR_FEATURE_COUNT = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR___START = FilesPackage.FILE_GENERATOR___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR___IS_STARTABLE = FilesPackage.FILE_GENERATOR___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR___GET_STRATEGY__ECLASS = FilesPackage.FILE_GENERATOR___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>AVL Process Generator</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_PROCESS_GENERATOR_OPERATION_COUNT = FilesPackage.FILE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl <em>Variable Sweep</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getVariableSweep()
	 * @generated
	 */
	int VARIABLE_SWEEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variable Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP__VARIABLE_START = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP__VARIABLE_END = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Delta</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP__VARIABLE_DELTA = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Sweep</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Sweep</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SWEEP_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLResultImporterImpl <em>AVL Result Importer</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AVLResultImporterImpl
	 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getAVLResultImporter()
	 * @generated
	 */
	int AVL_RESULT_IMPORTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__NAME = FilesPackage.FILE_PARSER__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__BUSY = FilesPackage.FILE_PARSER__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__TIME_STAMP = FilesPackage.FILE_PARSER__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__SUPERPROCESS = FilesPackage.FILE_PARSER__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__FILE_NAME = FilesPackage.FILE_PARSER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER__GENERATED_ELEMENTS = FilesPackage.FILE_PARSER__GENERATED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>AVL Result Importer</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER_FEATURE_COUNT = FilesPackage.FILE_PARSER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER___START = FilesPackage.FILE_PARSER___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER___IS_STARTABLE = FilesPackage.FILE_PARSER___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER___GET_STRATEGY__ECLASS = FilesPackage.FILE_PARSER___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>AVL Result Importer</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_RESULT_IMPORTER_OPERATION_COUNT = FilesPackage.FILE_PARSER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator <em>AVL Process Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Process Generator</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator
	 * @generated
	 */
	EClass getAVLProcessGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getVariableSweeps <em>Variable Sweeps</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Sweeps</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getVariableSweeps()
	 * @see #getAVLProcessGenerator()
	 * @generated
	 */
	EReference getAVLProcessGenerator_VariableSweeps();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getCommandFileName <em>Command File Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command File Name</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getCommandFileName()
	 * @see #getAVLProcessGenerator()
	 * @generated
	 */
	EAttribute getAVLProcessGenerator_CommandFileName();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getRuncaseCounter <em>Runcase Counter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runcase Counter</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getRuncaseCounter()
	 * @see #getAVLProcessGenerator()
	 * @generated
	 */
	EAttribute getAVLProcessGenerator_RuncaseCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getAvlResultImporters <em>Avl Result Importers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Avl Result Importers</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLProcessGenerator#getAvlResultImporters()
	 * @see #getAVLProcessGenerator()
	 * @generated
	 */
	EReference getAVLProcessGenerator_AvlResultImporters();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep <em>Variable Sweep</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Sweep</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.VariableSweep
	 * @generated
	 */
	EClass getVariableSweep();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableStart <em>Variable Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Variable Start</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableStart()
	 * @see #getVariableSweep()
	 * @generated
	 */
	EReference getVariableSweep_VariableStart();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableEnd <em>Variable End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Variable End</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableEnd()
	 * @see #getVariableSweep()
	 * @generated
	 */
	EReference getVariableSweep_VariableEnd();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableDelta <em>Variable Delta</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Variable Delta</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.VariableSweep#getVariableDelta()
	 * @see #getVariableSweep()
	 * @generated
	 */
	EReference getVariableSweep_VariableDelta();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter <em>AVL Result Importer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Result Importer</em>'.
	 * @see net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter
	 * @generated
	 */
	EClass getAVLResultImporter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvlprocessFactory getAvlprocessFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl <em>AVL Process Generator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AVLProcessGeneratorImpl
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getAVLProcessGenerator()
		 * @generated
		 */
		EClass AVL_PROCESS_GENERATOR = eINSTANCE.getAVLProcessGenerator();

		/**
		 * The meta object literal for the '<em><b>Variable Sweeps</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AVL_PROCESS_GENERATOR__VARIABLE_SWEEPS = eINSTANCE.getAVLProcessGenerator_VariableSweeps();

		/**
		 * The meta object literal for the '<em><b>Command File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_PROCESS_GENERATOR__COMMAND_FILE_NAME = eINSTANCE.getAVLProcessGenerator_CommandFileName();

		/**
		 * The meta object literal for the '<em><b>Runcase Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_PROCESS_GENERATOR__RUNCASE_COUNTER = eINSTANCE.getAVLProcessGenerator_RuncaseCounter();

		/**
		 * The meta object literal for the '<em><b>Avl Result Importers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVL_PROCESS_GENERATOR__AVL_RESULT_IMPORTERS = eINSTANCE.getAVLProcessGenerator_AvlResultImporters();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl <em>Variable Sweep</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.VariableSweepImpl
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getVariableSweep()
		 * @generated
		 */
		EClass VARIABLE_SWEEP = eINSTANCE.getVariableSweep();

		/**
		 * The meta object literal for the '<em><b>Variable Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_SWEEP__VARIABLE_START = eINSTANCE.getVariableSweep_VariableStart();

		/**
		 * The meta object literal for the '<em><b>Variable End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_SWEEP__VARIABLE_END = eINSTANCE.getVariableSweep_VariableEnd();

		/**
		 * The meta object literal for the '<em><b>Variable Delta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_SWEEP__VARIABLE_DELTA = eINSTANCE.getVariableSweep_VariableDelta();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlprocess.impl.AVLResultImporterImpl <em>AVL Result Importer</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AVLResultImporterImpl
		 * @see net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl#getAVLResultImporter()
		 * @generated
		 */
		EClass AVL_RESULT_IMPORTER = eINSTANCE.getAVLResultImporter();

	}

} // AvlprocessPackage
