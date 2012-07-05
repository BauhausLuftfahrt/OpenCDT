/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Coefficient Interface</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getType <em>Type</em>}</li>
 *   <li>{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getCoefficientParameter <em>Coefficient Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getCoefficientInterface()
 * @model
 * @generated
 */
public interface CoefficientInterface extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getCoefficientInterface_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Coefficient Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient Parameter</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient Parameter</em>' reference.
	 * @see #setCoefficientParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getCoefficientInterface_CoefficientParameter()
	 * @model
	 * @generated
	 */
	Parameter getCoefficientParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.CoefficientInterface#getCoefficientParameter <em>Coefficient Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient Parameter</em>' reference.
	 * @see #getCoefficientParameter()
	 * @generated
	 */
	void setCoefficientParameter(Parameter value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getCoefficient();

} // CoefficientInterface
