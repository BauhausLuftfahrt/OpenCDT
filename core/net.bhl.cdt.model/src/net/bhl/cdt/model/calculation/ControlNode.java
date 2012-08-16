/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Control Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.ControlNode#getNextTrue <em>Next True</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.ControlNode#getNextFalse <em>Next False</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.ControlNode#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Next True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next True</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next True</em>' reference.
	 * @see #setNextTrue(AbstractNode)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getControlNode_NextTrue()
	 * @model
	 * @generated
	 */
	AbstractNode getNextTrue();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.ControlNode#getNextTrue <em>Next True</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next True</em>' reference.
	 * @see #getNextTrue()
	 * @generated
	 */
	void setNextTrue(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Next False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next False</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next False</em>' reference.
	 * @see #setNextFalse(AbstractNode)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getControlNode_NextFalse()
	 * @model
	 * @generated
	 */
	AbstractNode getNextFalse();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.ControlNode#getNextFalse <em>Next False</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next False</em>' reference.
	 * @see #getNextFalse()
	 * @generated
	 */
	void setNextFalse(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.calculation.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getControlNode_Condition()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // ControlNode
