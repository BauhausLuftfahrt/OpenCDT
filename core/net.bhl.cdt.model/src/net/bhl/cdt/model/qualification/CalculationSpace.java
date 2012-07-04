/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Calculation Space</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.qualification.CalculationSpace#getSpaceQualifier <em>Space Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.qualification.QualificationPackage#getCalculationSpace()
 * @model
 * @generated
 */
public interface CalculationSpace extends QualifyingSpace {
	/**
	 * Returns the value of the '<em><b>Space Qualifier</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.model.qualification.CalculationSpaceQualifier}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Qualifier</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Space Qualifier</em>' reference list.
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#getCalculationSpace_SpaceQualifier()
	 * @model
	 * @generated
	 */
	EList<CalculationSpaceQualifier> getSpaceQualifier();

} // CalculationSpace
