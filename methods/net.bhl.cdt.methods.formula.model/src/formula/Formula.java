/**
 */
package formula;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link formula.Formula#getName <em>Name</em>}</li>
 *   <li>{@link formula.Formula#getRepository <em>Repository</em>}</li>
 *   <li>{@link formula.Formula#getLatexString <em>Latex String</em>}</li>
 *   <li>{@link formula.Formula#getInputParameter <em>Input Parameter</em>}</li>
 *   <li>{@link formula.Formula#getOutputParameter <em>Output Parameter</em>}</li>
 * </ul>
 *
 * @see formula.FormulaPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see formula.FormulaPackage#getFormula_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link formula.Formula#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link formula.FormulaRepository#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(FormulaRepository)
	 * @see formula.FormulaPackage#getFormula_Repository()
	 * @see formula.FormulaRepository#getFormulas
	 * @model opposite="formulas" required="true" transient="false"
	 * @generated
	 */
	FormulaRepository getRepository();

	/**
	 * Sets the value of the '{@link formula.Formula#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(FormulaRepository value);

	/**
	 * Returns the value of the '<em><b>Latex String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latex String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latex String</em>' attribute.
	 * @see #setLatexString(String)
	 * @see formula.FormulaPackage#getFormula_LatexString()
	 * @model
	 * @generated
	 */
	String getLatexString();

	/**
	 * Sets the value of the '{@link formula.Formula#getLatexString <em>Latex String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latex String</em>' attribute.
	 * @see #getLatexString()
	 * @generated
	 */
	void setLatexString(String value);

	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link formula.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' containment reference list.
	 * @see formula.FormulaPackage#getFormula_InputParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInputParameter();

	/**
	 * Returns the value of the '<em><b>Output Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter</em>' containment reference.
	 * @see #setOutputParameter(Parameter)
	 * @see formula.FormulaPackage#getFormula_OutputParameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getOutputParameter();

	/**
	 * Sets the value of the '{@link formula.Formula#getOutputParameter <em>Output Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameter</em>' containment reference.
	 * @see #getOutputParameter()
	 * @generated
	 */
	void setOutputParameter(Parameter value);

} // Formula
