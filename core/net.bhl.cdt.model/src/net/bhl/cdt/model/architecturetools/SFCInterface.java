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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SFC Interface</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.SFCInterface#getSFCParameter <em>SFC Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getSFCInterface()
 * @model
 * @generated
 */
public interface SFCInterface extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>SFC Parameter</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFC Parameter</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>SFC Parameter</em>' reference.
	 * @see #setSFCParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getSFCInterface_SFCParameter()
	 * @model
	 * @generated
	 */
	Parameter getSFCParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.SFCInterface#getSFCParameter
	 * <em>SFC Parameter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>SFC Parameter</em>' reference.
	 * @see #getSFCParameter()
	 * @generated
	 */
	void setSFCParameter(Parameter value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	Value getSFC();

} // SFCInterface
