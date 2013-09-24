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
package net.bhl.cdt.resources.util;

import net.bhl.cdt.resources.FunctionalData;
import net.bhl.cdt.resources.ResourceDescriptor;
import net.bhl.cdt.resources.Resources;
import net.bhl.cdt.resources.ResourcesPackage;
import net.bhl.cdt.resources.StructuralData;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see net.bhl.cdt.resources.ResourcesPackage
 * @generated
 */
public class ResourcesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourcesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourcesSwitch<Adapter> modelSwitch = new ResourcesSwitch<Adapter>() {
		@Override
		public Adapter caseResourceDescriptor(ResourceDescriptor object) {
			return createResourceDescriptorAdapter();
		}

		@Override
		public Adapter caseStructuralData(StructuralData object) {
			return createStructuralDataAdapter();
		}

		@Override
		public Adapter caseFunctionalData(FunctionalData object) {
			return createFunctionalDataAdapter();
		}

		@Override
		public Adapter caseResources(Resources object) {
			return createResourcesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor
	 * <em>Resource Descriptor</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.resources.ResourceDescriptor
	 * @generated
	 */
	public Adapter createResourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.resources.StructuralData <em>Structural Data</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.resources.StructuralData
	 * @generated
	 */
	public Adapter createStructuralDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.resources.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.resources.FunctionalData
	 * @generated
	 */
	public Adapter createFunctionalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.resources.Resources <em>Resources</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.resources.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ResourcesAdapterFactory
