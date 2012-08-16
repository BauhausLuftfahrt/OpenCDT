/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Descriptor</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.resources.ResourceDescriptor#getURI <em>URI</em>}</li>
 * <li>{@link net.bhl.cdt.resources.ResourceDescriptor#getStructrualData <em>
 * Structrual Data</em>}</li>
 * <li>{@link net.bhl.cdt.resources.ResourceDescriptor#getFunctionalData <em>
 * Functional Data</em>}</li>
 * <li>{@link net.bhl.cdt.resources.ResourceDescriptor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.resources.ResourcesPackage#getResourceDescriptor()
 * @model
 * @generated
 */
public interface ResourceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see net.bhl.cdt.resources.ResourcesPackage#getResourceDescriptor_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getURI <em>URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Structrual Data</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structrual Data</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Structrual Data</em>' containment
	 *         reference.
	 * @see #setStructrualData(StructuralData)
	 * @see net.bhl.cdt.resources.ResourcesPackage#getResourceDescriptor_StructrualData()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	StructuralData getStructrualData();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getStructrualData
	 * <em>Structrual Data</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Structrual Data</em>' containment
	 *            reference.
	 * @see #getStructrualData()
	 * @generated
	 */
	void setStructrualData(StructuralData value);

	/**
	 * Returns the value of the '<em><b>Functional Data</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Data</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Functional Data</em>' containment
	 *         reference.
	 * @see #setFunctionalData(FunctionalData)
	 * @see net.bhl.cdt.resources.ResourcesPackage#getResourceDescriptor_FunctionalData()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	FunctionalData getFunctionalData();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getFunctionalData
	 * <em>Functional Data</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Functional Data</em>' containment
	 *            reference.
	 * @see #getFunctionalData()
	 * @generated
	 */
	void setFunctionalData(FunctionalData value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.resources.ResourcesPackage#getResourceDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceDescriptor
