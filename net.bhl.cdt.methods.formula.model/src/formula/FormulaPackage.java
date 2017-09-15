/**
 */
package formula;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see formula.FormulaFactory
 * @model kind="package"
 * @generated
 */
public interface FormulaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "formula";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bauhaus-luftfahrt.net/cdt/methods/formula";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "formula";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormulaPackage eINSTANCE = formula.impl.FormulaPackageImpl.init();

	/**
	 * The meta object id for the '{@link formula.impl.FormulaRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formula.impl.FormulaRepositoryImpl
	 * @see formula.impl.FormulaPackageImpl#getFormulaRepository()
	 * @generated
	 */
	int FORMULA_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_REPOSITORY__FORMULAS = 1;

	/**
	 * The feature id for the '<em><b>Quantities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_REPOSITORY__QUANTITIES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link formula.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formula.impl.FormulaImpl
	 * @see formula.impl.FormulaPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Latex String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__LATEX_STRING = 1;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__INPUT_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OUTPUT_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__REF = 6;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Has Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___HAS_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link formula.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see formula.impl.QuantityImpl
	 * @see formula.impl.FormulaPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link formula.FormulaRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see formula.FormulaRepository
	 * @generated
	 */
	EClass getFormulaRepository();

	/**
	 * Returns the meta object for the attribute '{@link formula.FormulaRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formula.FormulaRepository#getName()
	 * @see #getFormulaRepository()
	 * @generated
	 */
	EAttribute getFormulaRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link formula.FormulaRepository#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see formula.FormulaRepository#getFormulas()
	 * @see #getFormulaRepository()
	 * @generated
	 */
	EReference getFormulaRepository_Formulas();

	/**
	 * Returns the meta object for the containment reference list '{@link formula.FormulaRepository#getQuantities <em>Quantities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantities</em>'.
	 * @see formula.FormulaRepository#getQuantities()
	 * @see #getFormulaRepository()
	 * @generated
	 */
	EReference getFormulaRepository_Quantities();

	/**
	 * Returns the meta object for class '{@link formula.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see formula.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link formula.Formula#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formula.Formula#getName()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Name();

	/**
	 * Returns the meta object for the attribute '{@link formula.Formula#getLatexString <em>Latex String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latex String</em>'.
	 * @see formula.Formula#getLatexString()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_LatexString();

	/**
	 * Returns the meta object for the reference list '{@link formula.Formula#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameter</em>'.
	 * @see formula.Formula#getInputParameter()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_InputParameter();

	/**
	 * Returns the meta object for the reference '{@link formula.Formula#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Parameter</em>'.
	 * @see formula.Formula#getOutputParameter()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_OutputParameter();

	/**
	 * Returns the meta object for the container reference '{@link formula.Formula#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see formula.Formula#getRepository()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Repository();

	/**
	 * Returns the meta object for the reference list '{@link formula.Formula#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see formula.Formula#getReference()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Reference();

	/**
	 * Returns the meta object for the attribute '{@link formula.Formula#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see formula.Formula#getRef()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Ref();

	/**
	 * Returns the meta object for the '{@link formula.Formula#hasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Name</em>' operation.
	 * @see formula.Formula#hasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormula__HasName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link formula.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see formula.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link formula.Quantity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see formula.Quantity#getName()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Name();

	/**
	 * Returns the meta object for the attribute '{@link formula.Quantity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see formula.Quantity#getDescription()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Description();

	/**
	 * Returns the meta object for the attribute '{@link formula.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see formula.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Unit();

	/**
	 * Returns the meta object for the container reference '{@link formula.Quantity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see formula.Quantity#getRepository()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Repository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormulaFactory getFormulaFactory();

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
		 * The meta object literal for the '{@link formula.impl.FormulaRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formula.impl.FormulaRepositoryImpl
		 * @see formula.impl.FormulaPackageImpl#getFormulaRepository()
		 * @generated
		 */
		EClass FORMULA_REPOSITORY = eINSTANCE.getFormulaRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA_REPOSITORY__NAME = eINSTANCE.getFormulaRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_REPOSITORY__FORMULAS = eINSTANCE.getFormulaRepository_Formulas();

		/**
		 * The meta object literal for the '<em><b>Quantities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_REPOSITORY__QUANTITIES = eINSTANCE.getFormulaRepository_Quantities();

		/**
		 * The meta object literal for the '{@link formula.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formula.impl.FormulaImpl
		 * @see formula.impl.FormulaPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__NAME = eINSTANCE.getFormula_Name();

		/**
		 * The meta object literal for the '<em><b>Latex String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__LATEX_STRING = eINSTANCE.getFormula_LatexString();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__INPUT_PARAMETER = eINSTANCE.getFormula_InputParameter();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__OUTPUT_PARAMETER = eINSTANCE.getFormula_OutputParameter();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__REPOSITORY = eINSTANCE.getFormula_Repository();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__REFERENCE = eINSTANCE.getFormula_Reference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__REF = eINSTANCE.getFormula_Ref();

		/**
		 * The meta object literal for the '<em><b>Has Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULA___HAS_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormula__HasName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link formula.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see formula.impl.QuantityImpl
		 * @see formula.impl.FormulaPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__NAME = eINSTANCE.getQuantity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__DESCRIPTION = eINSTANCE.getQuantity_Description();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__REPOSITORY = eINSTANCE.getQuantity_Repository();

	}

} //FormulaPackage
