/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.exchangemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.utilities.exchangemodel.Composite#getContainments <em>Containments</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Containments</b></em>' containment reference list. The list contents are of type
	 * {@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containments</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containments</em>' containment reference list.
	 * @see net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage#getComposite_Containments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ExchangeElement> getContainments();

} // Composite
