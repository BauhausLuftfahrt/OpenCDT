/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discipline Tool Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.designoperations.DisciplineToolService#getServiceURL <em>Service URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage#getDisciplineToolService()
 * @model abstract="true"
 * @generated
 */
public interface DisciplineToolService extends DisciplineTool {

	/**
	 * Returns the value of the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URL</em>' attribute.
	 * @see #setServiceURL(String)
	 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage#getDisciplineToolService_ServiceURL()
	 * @model
	 * @generated
	 */
	String getServiceURL();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.designoperations.DisciplineToolService#getServiceURL <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URL</em>' attribute.
	 * @see #getServiceURL()
	 * @generated
	 */
	void setServiceURL(String value);
} // DisciplineToolService
