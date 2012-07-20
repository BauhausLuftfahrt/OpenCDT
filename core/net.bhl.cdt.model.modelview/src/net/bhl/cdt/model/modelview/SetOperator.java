/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.modelview.SetOperator#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.bhl.cdt.model.modelview.SetOperator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getSetOperator()
 * @model
 * @generated
 */
public interface SetOperator extends SetExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.modelview.SetOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see net.bhl.cdt.model.modelview.SetOperators
	 * @see #setOperator(SetOperators)
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getSetOperator_Operator()
	 * @model
	 * @generated
	 */
	SetOperators getOperator();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.modelview.SetOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see net.bhl.cdt.model.modelview.SetOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SetOperators value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.modelview.SetExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see net.bhl.cdt.model.modelview.ModelviewPackage#getSetOperator_Operands()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<SetExpression> getOperands();

} // SetOperator
