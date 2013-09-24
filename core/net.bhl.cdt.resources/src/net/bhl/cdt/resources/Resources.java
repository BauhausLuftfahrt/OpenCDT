/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resources</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.resources.Resources#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.resources.ResourcesPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.bhl.cdt.resources.ResourceDescriptor}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see net.bhl.cdt.resources.ResourcesPackage#getResources_Resources()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ResourceDescriptor> getResources();

} // Resources
