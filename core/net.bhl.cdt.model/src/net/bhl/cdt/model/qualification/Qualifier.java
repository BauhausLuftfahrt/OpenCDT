/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification;

import net.bhl.cdt.model.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Qualifier</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.qualification.Qualifier#getQualifies <em>Qualifies</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.qualification.QualificationPackage#getQualifier()
 * @model abstract="true"
 * @generated
 */
public interface Qualifier extends Element {
	/**
	 * Returns the value of the '<em><b>Qualifies</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.qualification.Qualifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifies</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies</em>' reference list.
	 * @see net.bhl.cdt.model.qualification.QualificationPackage#getQualifier_Qualifies()
	 * @model
	 * @generated
	 */
	EList<Qualifiable> getQualifies();

} // Qualifier
