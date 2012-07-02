/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.basecalculationmodel.impl;

import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelFactory;
import net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class BasecalculationmodelPackageImpl extends EPackageImpl implements BasecalculationmodelPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType eClassEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.utilities.basecalculationmodel.BasecalculationmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasecalculationmodelPackageImpl() {
		super(eNS_URI, BasecalculationmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link BasecalculationmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasecalculationmodelPackage init() {
		if (isInited)
			return (BasecalculationmodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasecalculationmodelPackage.eNS_URI);

		// Obtain or create and register package
		BasecalculationmodelPackageImpl theBasecalculationmodelPackage = (BasecalculationmodelPackageImpl) (EPackage.Registry.INSTANCE
			.get(eNS_URI) instanceof BasecalculationmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new BasecalculationmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasecalculationmodelPackage.createPackageContents();

		// Initialize created meta-data
		theBasecalculationmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasecalculationmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasecalculationmodelPackage.eNS_URI, theBasecalculationmodelPackage);
		return theBasecalculationmodelPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getParameterDescriptor() {
		return parameterDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterDescriptor_Label() {
		return (EAttribute) parameterDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterDescriptor_Quantity() {
		return (EAttribute) parameterDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterDescriptor_Unit() {
		return (EAttribute) parameterDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameterDescriptor_DataType() {
		return (EAttribute) parameterDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEClass() {
		return eClassEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BasecalculationmodelFactory getBasecalculationmodelFactory() {
		return (BasecalculationmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		parameterDescriptorEClass = createEClass(PARAMETER_DESCRIPTOR);
		createEAttribute(parameterDescriptorEClass, PARAMETER_DESCRIPTOR__LABEL);
		createEAttribute(parameterDescriptorEClass, PARAMETER_DESCRIPTOR__QUANTITY);
		createEAttribute(parameterDescriptorEClass, PARAMETER_DESCRIPTOR__UNIT);
		createEAttribute(parameterDescriptorEClass, PARAMETER_DESCRIPTOR__DATA_TYPE);

		// Create data types
		eClassEDataType = createEDataType(ECLASS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UnitsPackage theUnitsPackage = (UnitsPackage) EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(parameterDescriptorEClass, ParameterDescriptor.class, "ParameterDescriptor", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDescriptor_Label(), ecorePackage.getEString(), "label", null, 0, 1,
			ParameterDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescriptor_Quantity(), theUnitsPackage.getQuantity(), "quantity", null, 0, 1,
			ParameterDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescriptor_Unit(), theUnitsPackage.getUnit(), "unit", null, 0, 1,
			ParameterDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescriptor_DataType(), this.getEClass(), "dataType", null, 0, 1,
			ParameterDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eClassEDataType, EClass.class, "EClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // BasecalculationmodelPackageImpl
