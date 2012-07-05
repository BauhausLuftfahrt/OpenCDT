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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Power Consumer</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.architecturetools.PowerConsumer#getPowerParameter <em>Power Parameter</em>}</li>
 *   <li>{@link net.bhl.cdt.model.architecturetools.PowerConsumer#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getPowerConsumer()
 * @model
 * @generated
 */
public interface PowerConsumer extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Power Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Parameter</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Parameter</em>' reference.
	 * @see #setPowerParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getPowerConsumer_PowerParameter()
	 * @model
	 * @generated
	 */
	Parameter getPowerParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.PowerConsumer#getPowerParameter <em>Power Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Parameter</em>' reference.
	 * @see #getPowerParameter()
	 * @generated
	 */
	void setPowerParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getPowerConsumer_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.PowerConsumer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Value getPowerConsumption();

} // PowerConsumer
