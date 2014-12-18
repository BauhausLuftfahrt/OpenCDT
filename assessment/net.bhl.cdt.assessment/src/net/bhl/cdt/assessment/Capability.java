/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Capability</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.Capability#getProvidedBy <em>Provided By</em>}</li>
 * <li>{@link net.bhl.cdt.assessment.Capability#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends CapabilityElement {
	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Technology}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Technology#getProvides <em>Provides</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provided By</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getCapability_ProvidedBy()
	 * @see net.bhl.cdt.assessment.Technology#getProvides
	 * @model opposite="provides"
	 * @generated
	 */
	EList<Technology> getProvidedBy();

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.Technology}. It is bidirectional and its opposite is '
	 * {@link net.bhl.cdt.assessment.Technology#getRequires <em>Requires</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getCapability_RequiredBy()
	 * @see net.bhl.cdt.assessment.Technology#getRequires
	 * @model opposite="requires"
	 * @generated
	 */
	EList<Technology> getRequiredBy();

} // Capability
