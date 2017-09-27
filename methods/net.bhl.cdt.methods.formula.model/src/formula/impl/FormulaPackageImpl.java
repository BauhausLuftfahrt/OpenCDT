/**
 */
package formula.impl;

import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.Quantity;

import formula.util.FormulaValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaPackageImpl extends EPackageImpl implements FormulaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

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
	 * @see formula.FormulaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormulaPackageImpl() {
		super(eNS_URI, FormulaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FormulaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormulaPackage init() {
		if (isInited) return (FormulaPackage)EPackage.Registry.INSTANCE.getEPackage(FormulaPackage.eNS_URI);

		// Obtain or create and register package
		FormulaPackageImpl theFormulaPackage = (FormulaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormulaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormulaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFormulaPackage.createPackageContents();

		// Initialize created meta-data
		theFormulaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFormulaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FormulaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFormulaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormulaPackage.eNS_URI, theFormulaPackage);
		return theFormulaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaRepository() {
		return formulaRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaRepository_Name() {
		return (EAttribute)formulaRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaRepository_Formulas() {
		return (EReference)formulaRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaRepository_Quantities() {
		return (EReference)formulaRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormula() {
		return formulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormula_Name() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormula_LatexString() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormula_InputParameter() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormula_OutputParameter() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormula_Repository() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormula_Reference() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormula__HasName__DiagnosticChain_Map() {
		return formulaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Name() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Description() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Unit() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Repository() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaFactory getFormulaFactory() {
		return (FormulaFactory)getEFactoryInstance();
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
		formulaRepositoryEClass = createEClass(FORMULA_REPOSITORY);
		createEAttribute(formulaRepositoryEClass, FORMULA_REPOSITORY__NAME);
		createEReference(formulaRepositoryEClass, FORMULA_REPOSITORY__FORMULAS);
		createEReference(formulaRepositoryEClass, FORMULA_REPOSITORY__QUANTITIES);

		formulaEClass = createEClass(FORMULA);
		createEAttribute(formulaEClass, FORMULA__NAME);
		createEAttribute(formulaEClass, FORMULA__LATEX_STRING);
		createEReference(formulaEClass, FORMULA__INPUT_PARAMETER);
		createEReference(formulaEClass, FORMULA__OUTPUT_PARAMETER);
		createEReference(formulaEClass, FORMULA__REPOSITORY);
		createEAttribute(formulaEClass, FORMULA__REFERENCE);
		createEOperation(formulaEClass, FORMULA___HAS_NAME__DIAGNOSTICCHAIN_MAP);

		quantityEClass = createEClass(QUANTITY);
		createEAttribute(quantityEClass, QUANTITY__NAME);
		createEAttribute(quantityEClass, QUANTITY__DESCRIPTION);
		createEAttribute(quantityEClass, QUANTITY__UNIT);
		createEReference(quantityEClass, QUANTITY__REPOSITORY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(formulaRepositoryEClass, FormulaRepository.class, "FormulaRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormulaRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormulaRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaRepository_Formulas(), this.getFormula(), this.getFormula_Repository(), "formulas", null, 0, -1, FormulaRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaRepository_Quantities(), this.getQuantity(), this.getQuantity_Repository(), "quantities", null, 0, -1, FormulaRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormula_Name(), ecorePackage.getEString(), "name", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormula_LatexString(), ecorePackage.getEString(), "latexString", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_InputParameter(), this.getQuantity(), null, "inputParameter", null, 0, -1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_OutputParameter(), this.getQuantity(), null, "outputParameter", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Repository(), this.getFormulaRepository(), this.getFormulaRepository_Formulas(), "repository", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormula_Reference(), ecorePackage.getEString(), "reference", "", 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFormula__HasName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Repository(), this.getFormulaRepository(), this.getFormulaRepository_Quantities(), "repository", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FormulaPackageImpl
