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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/resources";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ResourcesPackage eINSTANCE = net.bhl.cdt.resources.impl.ResourcesPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl
	 * <em>Resource Descriptor</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.bhl.cdt.resources.impl.ResourceDescriptorImpl
	 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getResourceDescriptor()
	 * @generated
	 */
	int RESOURCE_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__URI = 0;

	/**
	 * The feature id for the '<em><b>Structrual Data</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR__NAME = 3;

	/**
	 * The number of structural features of the '<em>Resource Descriptor</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link net.bhl.cdt.resources.impl.StructuralDataImpl
	 * <em>Structural Data</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.bhl.cdt.resources.impl.StructuralDataImpl
	 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getStructuralData()
	 * @generated
	 */
	int STRUCTURAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATA__MODEL_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Structural Data</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link net.bhl.cdt.resources.impl.FunctionalDataImpl
	 * <em>Functional Data</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.bhl.cdt.resources.impl.FunctionalDataImpl
	 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getFunctionalData()
	 * @generated
	 */
	int FUNCTIONAL_DATA = 2;

	/**
	 * The number of structural features of the '<em>Functional Data</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link net.bhl.cdt.resources.impl.ResourcesImpl <em>Resources</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.resources.impl.ResourcesImpl
	 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCES__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor
	 * <em>Resource Descriptor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Resource Descriptor</em>'.
	 * @see net.bhl.cdt.resources.ResourceDescriptor
	 * @generated
	 */
	EClass getResourceDescriptor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see net.bhl.cdt.resources.ResourceDescriptor#getURI()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_URI();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getStructrualData
	 * <em>Structrual Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Structrual Data</em>'.
	 * @see net.bhl.cdt.resources.ResourceDescriptor#getStructrualData()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EReference getResourceDescriptor_StructrualData();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getFunctionalData
	 * <em>Functional Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Functional Data</em>'.
	 * @see net.bhl.cdt.resources.ResourceDescriptor#getFunctionalData()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EReference getResourceDescriptor_FunctionalData();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.resources.ResourceDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.resources.ResourceDescriptor#getName()
	 * @see #getResourceDescriptor()
	 * @generated
	 */
	EAttribute getResourceDescriptor_Name();

	/**
	 * Returns the meta object for class '
	 * {@link net.bhl.cdt.resources.StructuralData <em>Structural Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Structural Data</em>'.
	 * @see net.bhl.cdt.resources.StructuralData
	 * @generated
	 */
	EClass getStructuralData();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.resources.StructuralData#getModelElements
	 * <em>Model Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Model Elements</em>'.
	 * @see net.bhl.cdt.resources.StructuralData#getModelElements()
	 * @see #getStructuralData()
	 * @generated
	 */
	EReference getStructuralData_ModelElements();

	/**
	 * Returns the meta object for class '
	 * {@link net.bhl.cdt.resources.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Functional Data</em>'.
	 * @see net.bhl.cdt.resources.FunctionalData
	 * @generated
	 */
	EClass getFunctionalData();

	/**
	 * Returns the meta object for class '
	 * {@link net.bhl.cdt.resources.Resources <em>Resources</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see net.bhl.cdt.resources.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.resources.Resources#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Resources</em>'.
	 * @see net.bhl.cdt.resources.Resources#getResources()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Resources();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.resources.impl.ResourceDescriptorImpl
		 * <em>Resource Descriptor</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.bhl.cdt.resources.impl.ResourceDescriptorImpl
		 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getResourceDescriptor()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTOR = eINSTANCE.getResourceDescriptor();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__URI = eINSTANCE
				.getResourceDescriptor_URI();

		/**
		 * The meta object literal for the '<em><b>Structrual Data</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTOR__STRUCTRUAL_DATA = eINSTANCE
				.getResourceDescriptor_StructrualData();

		/**
		 * The meta object literal for the '<em><b>Functional Data</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE_DESCRIPTOR__FUNCTIONAL_DATA = eINSTANCE
				.getResourceDescriptor_FunctionalData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_DESCRIPTOR__NAME = eINSTANCE
				.getResourceDescriptor_Name();

		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.resources.impl.StructuralDataImpl
		 * <em>Structural Data</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.bhl.cdt.resources.impl.StructuralDataImpl
		 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getStructuralData()
		 * @generated
		 */
		EClass STRUCTURAL_DATA = eINSTANCE.getStructuralData();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STRUCTURAL_DATA__MODEL_ELEMENTS = eINSTANCE
				.getStructuralData_ModelElements();

		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.resources.impl.FunctionalDataImpl
		 * <em>Functional Data</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.bhl.cdt.resources.impl.FunctionalDataImpl
		 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getFunctionalData()
		 * @generated
		 */
		EClass FUNCTIONAL_DATA = eINSTANCE.getFunctionalData();

		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.resources.impl.ResourcesImpl <em>Resources</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.resources.impl.ResourcesImpl
		 * @see net.bhl.cdt.resources.impl.ResourcesPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCES__RESOURCES = eINSTANCE.getResources_Resources();

	}

} // ResourcesPackage
