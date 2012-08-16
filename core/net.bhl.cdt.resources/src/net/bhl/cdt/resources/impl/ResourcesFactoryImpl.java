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
package net.bhl.cdt.resources.impl;

import net.bhl.cdt.resources.FunctionalData;
import net.bhl.cdt.resources.ResourceDescriptor;
import net.bhl.cdt.resources.Resources;
import net.bhl.cdt.resources.ResourcesFactory;
import net.bhl.cdt.resources.ResourcesPackage;
import net.bhl.cdt.resources.StructuralData;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements
		ResourcesFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ResourcesFactory init() {
		try {
			ResourcesFactory theResourcesFactory = (ResourcesFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://bhl.net/cdt/resources");
			if (theResourcesFactory != null) {
				return theResourcesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourcesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ResourcesPackage.RESOURCE_DESCRIPTOR:
			return createResourceDescriptor();
		case ResourcesPackage.STRUCTURAL_DATA:
			return createStructuralData();
		case ResourcesPackage.FUNCTIONAL_DATA:
			return createFunctionalData();
		case ResourcesPackage.RESOURCES:
			return createResources();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceDescriptor createResourceDescriptor() {
		ResourceDescriptorImpl resourceDescriptor = new ResourceDescriptorImpl();
		return resourceDescriptor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StructuralData createStructuralData() {
		StructuralDataImpl structuralData = new StructuralDataImpl();
		return structuralData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalData createFunctionalData() {
		FunctionalDataImpl functionalData = new FunctionalDataImpl();
		return functionalData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourcesPackage getResourcesPackage() {
		return (ResourcesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesPackage getPackage() {
		return ResourcesPackage.eINSTANCE;
	}

} // ResourcesFactoryImpl
