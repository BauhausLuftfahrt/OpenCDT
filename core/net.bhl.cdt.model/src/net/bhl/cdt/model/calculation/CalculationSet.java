/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSet#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSet#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSet#getSpaceQualifiers <em>Space Qualifiers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.calculation.CalculationSet#getSubCalculationSet <em>Sub Calculation Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSet()
 * @model
 * @generated
 */
public interface CalculationSet extends Element {
	/**
	 * Returns the value of the '<em><b>Calculations</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.calculation.Calculation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculations</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculations</em>' containment reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSet_Calculations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Calculation> getCalculations();

	/**
	 * Returns the value of the '<em><b>Graphs</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.calculation.CalculationGraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphs</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphs</em>' containment reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSet_Graphs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CalculationGraph> getGraphs();

	/**
	 * Returns the value of the '<em><b>Space Qualifiers</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.qualification.CalculationSpaceQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Qualifiers</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Qualifiers</em>' reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSet_SpaceQualifiers()
	 * @model
	 * @generated
	 */
	EList<CalculationSpaceQualifier> getSpaceQualifiers();

	/**
	 * Returns the value of the '<em><b>Sub Calculation Set</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.calculation.CalculationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Calculation Set</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Calculation Set</em>' containment reference list.
	 * @see net.bhl.cdt.model.calculation.CalculationPackage#getCalculationSet_SubCalculationSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CalculationSet> getSubCalculationSet();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCalculable(CalculationSpaceQualifier calcSpaceQualifier);

} // CalculationSet
