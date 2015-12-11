/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.model.process.DesignOperation#getSuperprocess <em>Superprocess</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.model.process.ProcessPackage#getDesignOperation()
 * @model abstract="true"
 * @generated
 */
public interface DesignOperation extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superprocess</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superprocess</em>' reference.
	 * @see #setSuperprocess(DesignProcess)
	 * @see net.bhl.cdt.model.process.ProcessPackage#getDesignOperation_Superprocess()
	 * @model
	 * @generated
	 */
	DesignProcess getSuperprocess();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.process.DesignOperation#getSuperprocess <em>Superprocess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superprocess</em>' reference.
	 * @see #getSuperprocess()
	 * @generated
	 */
	void setSuperprocess(DesignProcess value);

} // DesignOperation
