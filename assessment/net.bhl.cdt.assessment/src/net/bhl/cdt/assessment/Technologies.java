/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Technologies</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.assessment.Technologies#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnologies()
 * @model
 * @generated
 */
public interface Technologies extends TechnologyElement {
	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.assessment.TechnologyElement}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technologies</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Technologies</em>' containment reference list.
	 * @see net.bhl.cdt.assessment.AssessmentPackage#getTechnologies_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechnologyElement> getTechnologies();

} // Technologies
