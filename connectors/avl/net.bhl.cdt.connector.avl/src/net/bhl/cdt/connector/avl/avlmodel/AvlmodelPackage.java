/**
 */
package net.bhl.cdt.connector.avl.avlmodel;

import net.bhl.cdt.connector.files.FilesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory
 * @model kind="package"
 * @generated
 */
public interface AvlmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avlmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/connector/avl/avlmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.connector.avl.avlmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	AvlmodelPackage eINSTANCE = net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl <em>AVL Model Generator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLModelGenerator()
	 * @generated
	 */
	int AVL_MODEL_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__NAME = FilesPackage.FILE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__BUSY = FilesPackage.FILE_GENERATOR__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__TIME_STAMP = FilesPackage.FILE_GENERATOR__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__SUPERPROCESS = FilesPackage.FILE_GENERATOR__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__FILE_NAME = FilesPackage.FILE_GENERATOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__PROCESSED_ELEMENTS = FilesPackage.FILE_GENERATOR__PROCESSED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Surfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__SURFACES = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mach</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__MACH = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zsym</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__ZSYM = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__SREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__CREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__BREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__XREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Yref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__YREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Zref</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__ZREF = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>IYsym</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__IYSYM = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>IZ Sym</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR__IZ_SYM = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>AVL Model Generator</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR_FEATURE_COUNT = FilesPackage.FILE_GENERATOR_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR___START = FilesPackage.FILE_GENERATOR___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR___IS_STARTABLE = FilesPackage.FILE_GENERATOR___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR___GET_STRATEGY__ECLASS = FilesPackage.FILE_GENERATOR___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>AVL Model Generator</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_MODEL_GENERATOR_OPERATION_COUNT = FilesPackage.FILE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.YDuplicateImpl <em>YDuplicate</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.YDuplicateImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getYDuplicate()
	 * @generated
	 */
	int YDUPLICATE = 1;

	/**
	 * The feature id for the '<em><b>YDupl</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDUPLICATE__YDUPL = 0;

	/**
	 * The number of structural features of the '<em>YDuplicate</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YDUPLICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>YDuplicate</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDUPLICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl <em>AVL Surface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLSurface()
	 * @generated
	 */
	int AVL_SURFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>YDuplicate</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__YDUPLICATE = 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__SECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__ANGLE = 3;

	/**
	 * The feature id for the '<em><b>Nchordwise</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__NCHORDWISE = 4;

	/**
	 * The feature id for the '<em><b>Nspanwise</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__NSPANWISE = 5;

	/**
	 * The feature id for the '<em><b>Sspace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__SSPACE = 6;

	/**
	 * The feature id for the '<em><b>Cspace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE__CSPACE = 7;

	/**
	 * The number of structural features of the '<em>AVL Surface</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>AVL Surface</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SURFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl <em>AVL Section</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLSection()
	 * @generated
	 */
	int AVL_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Control Surfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__CONTROL_SURFACES = 0;

	/**
	 * The feature id for the '<em><b>Xle</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__XLE = 1;

	/**
	 * The feature id for the '<em><b>Yle</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__YLE = 2;

	/**
	 * The feature id for the '<em><b>Zle</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__ZLE = 3;

	/**
	 * The feature id for the '<em><b>Chord</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__CHORD = 4;

	/**
	 * The feature id for the '<em><b>Ainc</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__AINC = 5;

	/**
	 * The feature id for the '<em><b>Nspanwise</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__NSPANWISE = 6;

	/**
	 * The feature id for the '<em><b>Sspace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION__SSPACE = 7;

	/**
	 * The number of structural features of the '<em>AVL Section</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>AVL Section</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl <em>AVL Control Surface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLControlSurface()
	 * @generated
	 */
	int AVL_CONTROL_SURFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cgain</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE__CGAIN = 1;

	/**
	 * The feature id for the '<em><b>Xhinge</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE__XHINGE = 2;

	/**
	 * The feature id for the '<em><b>Hinge Vector</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE__HINGE_VECTOR = 3;

	/**
	 * The feature id for the '<em><b>Sgn Dup</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE__SGN_DUP = 4;

	/**
	 * The number of structural features of the '<em>AVL Control Surface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>AVL Control Surface</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AVL_CONTROL_SURFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.SufaceAngleImpl <em>Suface Angle</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.SufaceAngleImpl
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSufaceAngle()
	 * @generated
	 */
	int SUFACE_ANGLE = 5;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFACE_ANGLE__ANGLE = 0;

	/**
	 * The number of structural features of the '<em>Suface Angle</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUFACE_ANGLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Suface Angle</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFACE_ANGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.SymmetryType <em>Symmetry Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSymmetryType()
	 * @generated
	 */
	int SYMMETRY_TYPE = 6;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection <em>Sign Of Deflection</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection
	 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSignOfDeflection()
	 * @generated
	 */
	int SIGN_OF_DEFLECTION = 7;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator <em>AVL Model Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Model Generator</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator
	 * @generated
	 */
	EClass getAVLModelGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSurfaces <em>Surfaces</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surfaces</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSurfaces()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Surfaces();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getMach <em>Mach</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mach</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getMach()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Mach();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZsym <em>Zsym</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zsym</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZsym()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Zsym();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSref <em>Sref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getSref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Sref();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getCref <em>Cref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getCref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Cref();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getBref <em>Bref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getBref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Bref();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getXref <em>Xref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getXref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Xref();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getYref <em>Yref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Yref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getYref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Yref();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZref <em>Zref</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zref</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getZref()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EReference getAVLModelGenerator_Zref();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIYsym <em>IYsym</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IYsym</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIYsym()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EAttribute getAVLModelGenerator_IYsym();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIZSym <em>IZ Sym</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IZ Sym</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator#getIZSym()
	 * @see #getAVLModelGenerator()
	 * @generated
	 */
	EAttribute getAVLModelGenerator_IZSym();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate <em>YDuplicate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDuplicate</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.YDuplicate
	 * @generated
	 */
	EClass getYDuplicate();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate#getYDupl <em>YDupl</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>YDupl</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.YDuplicate#getYDupl()
	 * @see #getYDuplicate()
	 * @generated
	 */
	EReference getYDuplicate_YDupl();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface <em>AVL Surface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Surface</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface
	 * @generated
	 */
	EClass getAVLSurface();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getName()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EAttribute getAVLSurface_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getYDuplicate <em>YDuplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YDuplicate</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getYDuplicate()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EReference getAVLSurface_YDuplicate();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSections()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EReference getAVLSurface_Sections();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getAngle()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EReference getAVLSurface_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNchordwise <em>Nchordwise</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nchordwise</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNchordwise()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EAttribute getAVLSurface_Nchordwise();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNspanwise <em>Nspanwise</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nspanwise</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getNspanwise()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EAttribute getAVLSurface_Nspanwise();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSspace <em>Sspace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sspace</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getSspace()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EAttribute getAVLSurface_Sspace();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getCspace <em>Cspace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cspace</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSurface#getCspace()
	 * @see #getAVLSurface()
	 * @generated
	 */
	EAttribute getAVLSurface_Cspace();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection <em>AVL Section</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Section</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection
	 * @generated
	 */
	EClass getAVLSection();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getControlSurfaces <em>Control Surfaces</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Control Surfaces</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getControlSurfaces()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_ControlSurfaces();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getXle <em>Xle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getXle()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_Xle();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getYle <em>Yle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Yle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getYle()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_Yle();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getZle <em>Zle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getZle()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_Zle();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getChord <em>Chord</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chord</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getChord()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_Chord();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getAinc <em>Ainc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ainc</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getAinc()
	 * @see #getAVLSection()
	 * @generated
	 */
	EReference getAVLSection_Ainc();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getNspanwise <em>Nspanwise</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nspanwise</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getNspanwise()
	 * @see #getAVLSection()
	 * @generated
	 */
	EAttribute getAVLSection_Nspanwise();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLSection#getSspace <em>Sspace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sspace</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLSection#getSspace()
	 * @see #getAVLSection()
	 * @generated
	 */
	EAttribute getAVLSection_Sspace();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface <em>AVL Control Surface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVL Control Surface</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface
	 * @generated
	 */
	EClass getAVLControlSurface();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getName()
	 * @see #getAVLControlSurface()
	 * @generated
	 */
	EAttribute getAVLControlSurface_Name();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getCgain <em>Cgain</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cgain</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getCgain()
	 * @see #getAVLControlSurface()
	 * @generated
	 */
	EReference getAVLControlSurface_Cgain();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getXhinge <em>Xhinge</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xhinge</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getXhinge()
	 * @see #getAVLControlSurface()
	 * @generated
	 */
	EReference getAVLControlSurface_Xhinge();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getHingeVector <em>Hinge Vector</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Hinge Vector</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getHingeVector()
	 * @see #getAVLControlSurface()
	 * @generated
	 */
	EReference getAVLControlSurface_HingeVector();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getSgnDup <em>Sgn Dup</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sgn Dup</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface#getSgnDup()
	 * @see #getAVLControlSurface()
	 * @generated
	 */
	EAttribute getAVLControlSurface_SgnDup();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.connector.avl.avlmodel.SufaceAngle <em>Suface Angle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suface Angle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SufaceAngle
	 * @generated
	 */
	EClass getSufaceAngle();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.connector.avl.avlmodel.SufaceAngle#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SufaceAngle#getAngle()
	 * @see #getSufaceAngle()
	 * @generated
	 */
	EReference getSufaceAngle_Angle();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.connector.avl.avlmodel.SymmetryType <em>Symmetry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry Type</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
	 * @generated
	 */
	EEnum getSymmetryType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection <em>Sign Of Deflection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign Of Deflection</em>'.
	 * @see net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection
	 * @generated
	 */
	EEnum getSignOfDeflection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvlmodelFactory getAvlmodelFactory();

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
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl <em>AVL Model Generator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLModelGeneratorImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLModelGenerator()
		 * @generated
		 */
		EClass AVL_MODEL_GENERATOR = eINSTANCE.getAVLModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Surfaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__SURFACES = eINSTANCE.getAVLModelGenerator_Surfaces();

		/**
		 * The meta object literal for the '<em><b>Mach</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__MACH = eINSTANCE.getAVLModelGenerator_Mach();

		/**
		 * The meta object literal for the '<em><b>Zsym</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__ZSYM = eINSTANCE.getAVLModelGenerator_Zsym();

		/**
		 * The meta object literal for the '<em><b>Sref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__SREF = eINSTANCE.getAVLModelGenerator_Sref();

		/**
		 * The meta object literal for the '<em><b>Cref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__CREF = eINSTANCE.getAVLModelGenerator_Cref();

		/**
		 * The meta object literal for the '<em><b>Bref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__BREF = eINSTANCE.getAVLModelGenerator_Bref();

		/**
		 * The meta object literal for the '<em><b>Xref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__XREF = eINSTANCE.getAVLModelGenerator_Xref();

		/**
		 * The meta object literal for the '<em><b>Yref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__YREF = eINSTANCE.getAVLModelGenerator_Yref();

		/**
		 * The meta object literal for the '<em><b>Zref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_MODEL_GENERATOR__ZREF = eINSTANCE.getAVLModelGenerator_Zref();

		/**
		 * The meta object literal for the '<em><b>IYsym</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_MODEL_GENERATOR__IYSYM = eINSTANCE.getAVLModelGenerator_IYsym();

		/**
		 * The meta object literal for the '<em><b>IZ Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_MODEL_GENERATOR__IZ_SYM = eINSTANCE.getAVLModelGenerator_IZSym();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.YDuplicateImpl <em>YDuplicate</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.YDuplicateImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getYDuplicate()
		 * @generated
		 */
		EClass YDUPLICATE = eINSTANCE.getYDuplicate();

		/**
		 * The meta object literal for the '<em><b>YDupl</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference YDUPLICATE__YDUPL = eINSTANCE.getYDuplicate_YDupl();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl <em>AVL Surface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLSurfaceImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLSurface()
		 * @generated
		 */
		EClass AVL_SURFACE = eINSTANCE.getAVLSurface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SURFACE__NAME = eINSTANCE.getAVLSurface_Name();

		/**
		 * The meta object literal for the '<em><b>YDuplicate</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AVL_SURFACE__YDUPLICATE = eINSTANCE.getAVLSurface_YDuplicate();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AVL_SURFACE__SECTIONS = eINSTANCE.getAVLSurface_Sections();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVL_SURFACE__ANGLE = eINSTANCE.getAVLSurface_Angle();

		/**
		 * The meta object literal for the '<em><b>Nchordwise</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SURFACE__NCHORDWISE = eINSTANCE.getAVLSurface_Nchordwise();

		/**
		 * The meta object literal for the '<em><b>Nspanwise</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SURFACE__NSPANWISE = eINSTANCE.getAVLSurface_Nspanwise();

		/**
		 * The meta object literal for the '<em><b>Sspace</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SURFACE__SSPACE = eINSTANCE.getAVLSurface_Sspace();

		/**
		 * The meta object literal for the '<em><b>Cspace</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SURFACE__CSPACE = eINSTANCE.getAVLSurface_Cspace();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl <em>AVL Section</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLSectionImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLSection()
		 * @generated
		 */
		EClass AVL_SECTION = eINSTANCE.getAVLSection();

		/**
		 * The meta object literal for the '<em><b>Control Surfaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AVL_SECTION__CONTROL_SURFACES = eINSTANCE.getAVLSection_ControlSurfaces();

		/**
		 * The meta object literal for the '<em><b>Xle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_SECTION__XLE = eINSTANCE.getAVLSection_Xle();

		/**
		 * The meta object literal for the '<em><b>Yle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_SECTION__YLE = eINSTANCE.getAVLSection_Yle();

		/**
		 * The meta object literal for the '<em><b>Zle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_SECTION__ZLE = eINSTANCE.getAVLSection_Zle();

		/**
		 * The meta object literal for the '<em><b>Chord</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_SECTION__CHORD = eINSTANCE.getAVLSection_Chord();

		/**
		 * The meta object literal for the '<em><b>Ainc</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_SECTION__AINC = eINSTANCE.getAVLSection_Ainc();

		/**
		 * The meta object literal for the '<em><b>Nspanwise</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SECTION__NSPANWISE = eINSTANCE.getAVLSection_Nspanwise();

		/**
		 * The meta object literal for the '<em><b>Sspace</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_SECTION__SSPACE = eINSTANCE.getAVLSection_Sspace();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl <em>AVL Control Surface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AVLControlSurfaceImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getAVLControlSurface()
		 * @generated
		 */
		EClass AVL_CONTROL_SURFACE = eINSTANCE.getAVLControlSurface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_CONTROL_SURFACE__NAME = eINSTANCE.getAVLControlSurface_Name();

		/**
		 * The meta object literal for the '<em><b>Cgain</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_CONTROL_SURFACE__CGAIN = eINSTANCE.getAVLControlSurface_Cgain();

		/**
		 * The meta object literal for the '<em><b>Xhinge</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AVL_CONTROL_SURFACE__XHINGE = eINSTANCE.getAVLControlSurface_Xhinge();

		/**
		 * The meta object literal for the '<em><b>Hinge Vector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVL_CONTROL_SURFACE__HINGE_VECTOR = eINSTANCE.getAVLControlSurface_HingeVector();

		/**
		 * The meta object literal for the '<em><b>Sgn Dup</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AVL_CONTROL_SURFACE__SGN_DUP = eINSTANCE.getAVLControlSurface_SgnDup();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.impl.SufaceAngleImpl <em>Suface Angle</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.SufaceAngleImpl
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSufaceAngle()
		 * @generated
		 */
		EClass SUFACE_ANGLE = eINSTANCE.getSufaceAngle();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SUFACE_ANGLE__ANGLE = eINSTANCE.getSufaceAngle_Angle();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.SymmetryType <em>Symmetry Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.SymmetryType
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSymmetryType()
		 * @generated
		 */
		EEnum SYMMETRY_TYPE = eINSTANCE.getSymmetryType();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection <em>Sign Of Deflection</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection
		 * @see net.bhl.cdt.connector.avl.avlmodel.impl.AvlmodelPackageImpl#getSignOfDeflection()
		 * @generated
		 */
		EEnum SIGN_OF_DEFLECTION = eINSTANCE.getSignOfDeflection();

	}

} // AvlmodelPackage
