/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Calculation Repository</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.calculationrepository.functions.CalculationRepository#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getCalculationRepository()
 * @model
 * @generated
 */
public interface CalculationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.calculationrepository.functions.Function}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see net.bhl.cdt.calculationrepository.functions.FunctionsPackage#getCalculationRepository_Functions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // CalculationRepository
