/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Iteration Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.IterationNode#getMaxIteration <em>Max Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getIterationNode()
 * @model
 * @generated
 */
public interface IterationNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Max Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Iteration</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Iteration</em>' attribute.
	 * @see #setMaxIteration(int)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getIterationNode_MaxIteration()
	 * @model
	 * @generated
	 */
	int getMaxIteration();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.IterationNode#getMaxIteration <em>Max Iteration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Iteration</em>' attribute.
	 * @see #getMaxIteration()
	 * @generated
	 */
	void setMaxIteration(int value);

} // IterationNode
