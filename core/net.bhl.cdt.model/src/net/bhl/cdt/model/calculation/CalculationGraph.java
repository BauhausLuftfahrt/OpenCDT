/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import java.util.List;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.qualification.CalculationSpace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.calculation.CalculationGraph#getNodes <em>Nodes</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.CalculationGraph#getFirstNode <em>First Node</em>}</li>
 * <li>{@link net.bhl.cdt.model.calculation.CalculationGraph#getStartSet <em>Start Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationGraph()
 * @model
 * @generated
 */
public interface CalculationGraph extends Element {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.calculation.AbstractNode}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationGraph_Nodes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

	/**
	 * Returns the value of the '<em><b>First Node</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Node</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>First Node</em>' reference.
	 * @see #setFirstNode(AbstractNode)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationGraph_FirstNode()
	 * @model
	 * @generated
	 */
	AbstractNode getFirstNode();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.CalculationGraph#getFirstNode <em>First Node</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>First Node</em>' reference.
	 * @see #getFirstNode()
	 * @generated
	 */
	void setFirstNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Start Set</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Set</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Set</em>' containment reference.
	 * @see #setStartSet(StartSet)
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationGraph_StartSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	StartSet getStartSet();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.calculation.CalculationGraph#getStartSet <em>Start Set</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Start Set</em>' containment reference.
	 * @see #getStartSet()
	 * @generated
	 */
	void setStartSet(StartSet value);

	/**
	 * Returns the CalculationSpace of the Model that contains the component that the current calculationGraph does
	 * operate on.
	 * 
	 * @return CalculationSpace
	 * @generated not
	 */
	CalculationSpace getCalculationSpace();

	/**
	 * Returns a list with values containing all start values for determined parameters
	 * 
	 * @return List<Value>
	 * @generated not
	 */
	List<Value> getStartValues();

} // CalculationGraph
