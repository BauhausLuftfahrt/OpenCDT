/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.basecalculationmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BasecalculationmodelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "basecalculationmodel";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/utilities/basecalculationmodel/";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.utilities";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BasecalculationmodelPackage eINSTANCE = net.bhl.cdt.utilities.basecalculationmodel.impl.BasecalculationmodelPackageImpl
		.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl
	 * <em>Parameter Descriptor</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl
	 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.BasecalculationmodelPackageImpl#getParameterDescriptor()
	 * @generated
	 */
	int PARAMETER_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR__DATA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Parameter Descriptor</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>EClass</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EClass
	 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.BasecalculationmodelPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 1;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor
	 * <em>Parameter Descriptor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Descriptor</em>'.
	 * @see net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor
	 * @generated
	 */
	EClass getParameterDescriptor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getLabel <em>Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getLabel()
	 * @see #getParameterDescriptor()
	 * @generated
	 */
	EAttribute getParameterDescriptor_Label();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getQuantity <em>Quantity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getQuantity()
	 * @see #getParameterDescriptor()
	 * @generated
	 */
	EAttribute getParameterDescriptor_Quantity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getUnit <em>Unit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getUnit()
	 * @see #getParameterDescriptor()
	 * @generated
	 */
	EAttribute getParameterDescriptor_Unit();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getDataType <em>Data Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor#getDataType()
	 * @see #getParameterDescriptor()
	 * @generated
	 */
	EAttribute getParameterDescriptor_DataType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>EClass</em>'.
	 * @see org.eclipse.emf.ecore.EClass
	 * @model instanceClass="org.eclipse.emf.ecore.EClass"
	 * @generated
	 */
	EDataType getEClass();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasecalculationmodelFactory getBasecalculationmodelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
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
		 * {@link net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl <em>Parameter Descriptor</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.ParameterDescriptorImpl
		 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.BasecalculationmodelPackageImpl#getParameterDescriptor()
		 * @generated
		 */
		EClass PARAMETER_DESCRIPTOR = eINSTANCE.getParameterDescriptor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTOR__LABEL = eINSTANCE.getParameterDescriptor_Label();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTOR__QUANTITY = eINSTANCE.getParameterDescriptor_Quantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTOR__UNIT = eINSTANCE.getParameterDescriptor_Unit();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTOR__DATA_TYPE = eINSTANCE.getParameterDescriptor_DataType();

		/**
		 * The meta object literal for the '<em>EClass</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.ecore.EClass
		 * @see net.bhl.cdt.utilities.basecalculationmodel.impl.BasecalculationmodelPackageImpl#getEClass()
		 * @generated
		 */
		EDataType ECLASS = eINSTANCE.getEClass();

	}

} // BasecalculationmodelPackage
