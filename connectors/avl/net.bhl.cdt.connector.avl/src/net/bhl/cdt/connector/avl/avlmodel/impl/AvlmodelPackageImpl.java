/**
 */
package net.bhl.cdt.connector.avl.avlmodel.impl;

import net.bhl.cdt.connector.avl.AvlPackage;

import net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.SignOfDeflection;
import net.bhl.cdt.connector.avl.avlmodel.SufaceAngle;
import net.bhl.cdt.connector.avl.avlmodel.SymmetryType;
import net.bhl.cdt.connector.avl.avlmodel.YDuplicate;

import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;

import net.bhl.cdt.connector.avl.avlprocess.impl.AvlprocessPackageImpl;

import net.bhl.cdt.connector.avl.impl.AvlPackageImpl;

import net.bhl.cdt.connector.files.FilesPackage;

import net.bhl.cdt.model.geometry.GeometryPackage;

import net.bhl.cdt.model.system.SystemPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvlmodelPackageImpl extends EPackageImpl implements AvlmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlModelGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDuplicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avlControlSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sufaceAngleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symmetryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signOfDeflectionEEnum = null;

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
	 * @see net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvlmodelPackageImpl() {
		super(eNS_URI, AvlmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AvlmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvlmodelPackage init() {
		if (isInited) return (AvlmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AvlmodelPackage.eNS_URI);

		// Obtain or create and register package
		AvlmodelPackageImpl theAvlmodelPackage = (AvlmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AvlmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AvlmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AvlPackageImpl theAvlPackage = (AvlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlPackage.eNS_URI) instanceof AvlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlPackage.eNS_URI) : AvlPackage.eINSTANCE);
		AvlprocessPackageImpl theAvlprocessPackage = (AvlprocessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI) instanceof AvlprocessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvlprocessPackage.eNS_URI) : AvlprocessPackage.eINSTANCE);

		// Create package meta-data objects
		theAvlmodelPackage.createPackageContents();
		theAvlPackage.createPackageContents();
		theAvlprocessPackage.createPackageContents();

		// Initialize created meta-data
		theAvlmodelPackage.initializePackageContents();
		theAvlPackage.initializePackageContents();
		theAvlprocessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAvlmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvlmodelPackage.eNS_URI, theAvlmodelPackage);
		return theAvlmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLModelGenerator() {
		return avlModelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Surfaces() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Mach() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Zsym() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Sref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Cref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Bref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Xref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Yref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLModelGenerator_Zref() {
		return (EReference)avlModelGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLModelGenerator_IYsym() {
		return (EAttribute)avlModelGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLModelGenerator_IZSym() {
		return (EAttribute)avlModelGeneratorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDuplicate() {
		return yDuplicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDuplicate_YDupl() {
		return (EReference)yDuplicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLSurface() {
		return avlSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSurface_Name() {
		return (EAttribute)avlSurfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSurface_YDuplicate() {
		return (EReference)avlSurfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSurface_Sections() {
		return (EReference)avlSurfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSurface_Angle() {
		return (EReference)avlSurfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSurface_Nchordwise() {
		return (EAttribute)avlSurfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSurface_Nspanwise() {
		return (EAttribute)avlSurfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSurface_Sspace() {
		return (EAttribute)avlSurfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSurface_Cspace() {
		return (EAttribute)avlSurfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLSection() {
		return avlSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_ControlSurfaces() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_Xle() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_Yle() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_Zle() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_Chord() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLSection_Ainc() {
		return (EReference)avlSectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSection_Nspanwise() {
		return (EAttribute)avlSectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLSection_Sspace() {
		return (EAttribute)avlSectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVLControlSurface() {
		return avlControlSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLControlSurface_Name() {
		return (EAttribute)avlControlSurfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLControlSurface_Cgain() {
		return (EReference)avlControlSurfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLControlSurface_Xhinge() {
		return (EReference)avlControlSurfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVLControlSurface_HingeVector() {
		return (EReference)avlControlSurfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVLControlSurface_SgnDup() {
		return (EAttribute)avlControlSurfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSufaceAngle() {
		return sufaceAngleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSufaceAngle_Angle() {
		return (EReference)sufaceAngleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymmetryType() {
		return symmetryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignOfDeflection() {
		return signOfDeflectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvlmodelFactory getAvlmodelFactory() {
		return (AvlmodelFactory)getEFactoryInstance();
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
		avlModelGeneratorEClass = createEClass(AVL_MODEL_GENERATOR);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__SURFACES);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__MACH);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__ZSYM);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__SREF);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__CREF);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__BREF);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__XREF);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__YREF);
		createEReference(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__ZREF);
		createEAttribute(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__IYSYM);
		createEAttribute(avlModelGeneratorEClass, AVL_MODEL_GENERATOR__IZ_SYM);

		yDuplicateEClass = createEClass(YDUPLICATE);
		createEReference(yDuplicateEClass, YDUPLICATE__YDUPL);

		avlSurfaceEClass = createEClass(AVL_SURFACE);
		createEAttribute(avlSurfaceEClass, AVL_SURFACE__NAME);
		createEReference(avlSurfaceEClass, AVL_SURFACE__YDUPLICATE);
		createEReference(avlSurfaceEClass, AVL_SURFACE__SECTIONS);
		createEReference(avlSurfaceEClass, AVL_SURFACE__ANGLE);
		createEAttribute(avlSurfaceEClass, AVL_SURFACE__NCHORDWISE);
		createEAttribute(avlSurfaceEClass, AVL_SURFACE__NSPANWISE);
		createEAttribute(avlSurfaceEClass, AVL_SURFACE__SSPACE);
		createEAttribute(avlSurfaceEClass, AVL_SURFACE__CSPACE);

		avlSectionEClass = createEClass(AVL_SECTION);
		createEReference(avlSectionEClass, AVL_SECTION__CONTROL_SURFACES);
		createEReference(avlSectionEClass, AVL_SECTION__XLE);
		createEReference(avlSectionEClass, AVL_SECTION__YLE);
		createEReference(avlSectionEClass, AVL_SECTION__ZLE);
		createEReference(avlSectionEClass, AVL_SECTION__CHORD);
		createEReference(avlSectionEClass, AVL_SECTION__AINC);
		createEAttribute(avlSectionEClass, AVL_SECTION__NSPANWISE);
		createEAttribute(avlSectionEClass, AVL_SECTION__SSPACE);

		avlControlSurfaceEClass = createEClass(AVL_CONTROL_SURFACE);
		createEAttribute(avlControlSurfaceEClass, AVL_CONTROL_SURFACE__NAME);
		createEReference(avlControlSurfaceEClass, AVL_CONTROL_SURFACE__CGAIN);
		createEReference(avlControlSurfaceEClass, AVL_CONTROL_SURFACE__XHINGE);
		createEReference(avlControlSurfaceEClass, AVL_CONTROL_SURFACE__HINGE_VECTOR);
		createEAttribute(avlControlSurfaceEClass, AVL_CONTROL_SURFACE__SGN_DUP);

		sufaceAngleEClass = createEClass(SUFACE_ANGLE);
		createEReference(sufaceAngleEClass, SUFACE_ANGLE__ANGLE);

		// Create enums
		symmetryTypeEEnum = createEEnum(SYMMETRY_TYPE);
		signOfDeflectionEEnum = createEEnum(SIGN_OF_DEFLECTION);
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		GeometryPackage theGeometryPackage = (GeometryPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		avlModelGeneratorEClass.getESuperTypes().add(theFilesPackage.getFileGenerator());

		// Initialize classes, features, and operations; add parameters
		initEClass(avlModelGeneratorEClass, AVLModelGenerator.class, "AVLModelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAVLModelGenerator_Surfaces(), this.getAVLSurface(), null, "surfaces", null, 0, -1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Mach(), theSystemPackage.getDecimalNumber(), null, "mach", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Zsym(), theSystemPackage.getDecimalNumber(), null, "zsym", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Sref(), theSystemPackage.getDecimalNumber(), null, "sref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Cref(), theSystemPackage.getDecimalNumber(), null, "cref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Bref(), theSystemPackage.getDecimalNumber(), null, "bref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Xref(), theSystemPackage.getDecimalNumber(), null, "xref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Yref(), theSystemPackage.getDecimalNumber(), null, "yref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLModelGenerator_Zref(), theSystemPackage.getDecimalNumber(), null, "zref", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLModelGenerator_IYsym(), this.getSymmetryType(), "iYsym", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLModelGenerator_IZSym(), this.getSymmetryType(), "iZSym", null, 0, 1, AVLModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDuplicateEClass, YDuplicate.class, "YDuplicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDuplicate_YDupl(), theSystemPackage.getDecimalNumber(), null, "yDupl", null, 0, 1, YDuplicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avlSurfaceEClass, AVLSurface.class, "AVLSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAVLSurface_Name(), ecorePackage.getEString(), "name", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSurface_YDuplicate(), this.getYDuplicate(), null, "yDuplicate", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSurface_Sections(), this.getAVLSection(), null, "sections", null, 0, -1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSurface_Angle(), this.getSufaceAngle(), null, "angle", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSurface_Nchordwise(), ecorePackage.getEInt(), "nchordwise", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSurface_Nspanwise(), ecorePackage.getEInt(), "nspanwise", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSurface_Sspace(), ecorePackage.getEDouble(), "sspace", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSurface_Cspace(), ecorePackage.getEDouble(), "cspace", null, 0, 1, AVLSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avlSectionEClass, AVLSection.class, "AVLSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAVLSection_ControlSurfaces(), this.getAVLControlSurface(), null, "controlSurfaces", null, 0, -1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSection_Xle(), theSystemPackage.getDecimalNumber(), null, "xle", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSection_Yle(), theSystemPackage.getDecimalNumber(), null, "yle", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSection_Zle(), theSystemPackage.getDecimalNumber(), null, "zle", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSection_Chord(), theSystemPackage.getDecimalNumber(), null, "chord", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLSection_Ainc(), theSystemPackage.getDecimalNumber(), null, "ainc", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSection_Nspanwise(), ecorePackage.getEInt(), "nspanwise", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLSection_Sspace(), ecorePackage.getEDouble(), "sspace", null, 0, 1, AVLSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avlControlSurfaceEClass, AVLControlSurface.class, "AVLControlSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAVLControlSurface_Name(), ecorePackage.getEString(), "name", null, 0, 1, AVLControlSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLControlSurface_Cgain(), theSystemPackage.getDecimalNumber(), null, "cgain", null, 0, 1, AVLControlSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLControlSurface_Xhinge(), theSystemPackage.getDecimalNumber(), null, "xhinge", null, 0, 1, AVLControlSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAVLControlSurface_HingeVector(), theGeometryPackage.getSpaceVector(), null, "hingeVector", null, 0, 1, AVLControlSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVLControlSurface_SgnDup(), this.getSignOfDeflection(), "sgnDup", null, 0, 1, AVLControlSurface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sufaceAngleEClass, SufaceAngle.class, "SufaceAngle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSufaceAngle_Angle(), theSystemPackage.getDecimalNumber(), null, "angle", null, 0, 1, SufaceAngle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(symmetryTypeEEnum, SymmetryType.class, "SymmetryType");
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.SYMMETRIC);
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.ANTISYMMETRIC);
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.NO_SYMMETRY);

		initEEnum(signOfDeflectionEEnum, SignOfDeflection.class, "SignOfDeflection");
		addEEnumLiteral(signOfDeflectionEEnum, SignOfDeflection.ELEVATOR);
		addEEnumLiteral(signOfDeflectionEEnum, SignOfDeflection.AILERON);
	}

} //AvlmodelPackageImpl
