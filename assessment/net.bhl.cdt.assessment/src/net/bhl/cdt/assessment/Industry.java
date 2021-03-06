/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Industry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.Industry#getDrives <em>Drives</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getIndustry()
 * @model
 * @generated
 */
public interface Industry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Technology}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Technology#getDrivenBy <em>Driven By</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Drives</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getIndustry_Drives()
	 * @see net.bhl.cdt.assessment.Technology#getDrivenBy
	 * @model opposite="drivenBy"
	 * @generated
	 */
	EList<Technology> getDrives();

} // Industry
