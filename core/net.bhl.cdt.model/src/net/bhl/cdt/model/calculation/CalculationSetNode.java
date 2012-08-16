/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Set Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSetNode#getNextNode <em>Next Node</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSetNode#getCalculationSet <em>Calculation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSetNode()
 * @model
 * @generated
 */
public interface CalculationSetNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Next Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Node</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Node</em>' reference.
	 * @see #setNextNode(AbstractNode)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSetNode_NextNode()
	 * @model
	 * @generated
	 */
	AbstractNode getNextNode();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.CalculationSetNode#getNextNode <em>Next Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Node</em>' reference.
	 * @see #getNextNode()
	 * @generated
	 */
	void setNextNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Calculation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Set</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Set</em>' reference.
	 * @see #setCalculationSet(CalculationSet)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSetNode_CalculationSet()
	 * @model
	 * @generated
	 */
	CalculationSet getCalculationSet();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.CalculationSetNode#getCalculationSet <em>Calculation Set</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Set</em>' reference.
	 * @see #getCalculationSet()
	 * @generated
	 */
	void setCalculationSet(CalculationSet value);

} // CalculationSetNode
