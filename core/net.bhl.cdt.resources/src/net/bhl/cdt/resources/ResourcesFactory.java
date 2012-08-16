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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ResourcesFactory eINSTANCE = net.bhl.cdt.resources.impl.ResourcesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Resource Descriptor</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Resource Descriptor</em>'.
	 * @generated
	 */
	ResourceDescriptor createResourceDescriptor();

	/**
	 * Returns a new object of class '<em>Structural Data</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Structural Data</em>'.
	 * @generated
	 */
	StructuralData createStructuralData();

	/**
	 * Returns a new object of class '<em>Functional Data</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Functional Data</em>'.
	 * @generated
	 */
	FunctionalData createFunctionalData();

	/**
	 * Returns a new object of class '<em>Resources</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Resources</em>'.
	 * @generated
	 */
	Resources createResources();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} // ResourcesFactory
