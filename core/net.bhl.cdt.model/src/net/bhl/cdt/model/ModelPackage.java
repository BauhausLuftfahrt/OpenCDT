/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = net.bhl.cdt.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ElementImpl <em>Element</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.impl.ElementImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ExchangemodelPackage.EXCHANGE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ExchangemodelPackage.EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.StructuralElementImpl <em>Structural Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.StructuralElementImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getStructuralElement()
	 * @generated
	 */
	int STRUCTURAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Structural Element</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ComponentImpl <em>Component</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.impl.ComponentImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB_COMPONENTS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETERS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Components</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTED_COMPONENTS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calculation Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CALCULATION_SETS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACES = STRUCTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.ValueImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = QualificationPackage.QUALIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__UNIT = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DESCRIPTION = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SOURCE = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DATATYPES = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = QualificationPackage.QUALIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ConfigurationImpl <em>Configuration</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.impl.ConfigurationImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VIEWS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENTS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calculation Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CALCULATION_SETS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.ModelImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONFIGURATIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifying Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__QUALIFYING_SPACES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ParameterImpl <em>Parameter</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.impl.ParameterImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARENT_COMPONENT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SOURCE = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DISCIPLINE = STRUCTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATION = STRUCTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUES = STRUCTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__QUANTITY = STRUCTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.ComponentInterfaceImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__PARENT_COMPONENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__SOURCE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__DISCIPLINE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ANNOTATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.ViewImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 9;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.MappableComponentInterface <em>Mappable Component Interface</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.MappableComponentInterface
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getMappableComponentInterface()
	 * @generated
	 */
	int MAPPABLE_COMPONENT_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE__NAME = COMPONENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE__PARENT_COMPONENT = COMPONENT_INTERFACE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE__SOURCE = COMPONENT_INTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE__DISCIPLINE = COMPONENT_INTERFACE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE__ANNOTATION = COMPONENT_INTERFACE__ANNOTATION;

	/**
	 * The number of structural features of the '<em>Mappable Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_COMPONENT_INTERFACE_FEATURE_COUNT = COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see net.bhl.cdt.model.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Component#getSubComponents <em>Sub Components</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Components</em>'.
	 * @see net.bhl.cdt.model.Component#getSubComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SubComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Component#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see net.bhl.cdt.model.Component#getParameters()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.Component#getConnectedComponents <em>Connected Components</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Components</em>'.
	 * @see net.bhl.cdt.model.Component#getConnectedComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConnectedComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Component#getCalculationSets <em>Calculation Sets</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculation Sets</em>'.
	 * @see net.bhl.cdt.model.Component#getCalculationSets()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_CalculationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see net.bhl.cdt.model.Component#getInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfaces();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see net.bhl.cdt.model.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.Value#getUnit <em>Unit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.bhl.cdt.model.Value#getUnit()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.Value#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.bhl.cdt.model.Value#getDescription()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.Value#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.bhl.cdt.model.Value#getSource()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Source();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.Value#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.model.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Value#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see net.bhl.cdt.model.Value#getDatatypes()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Datatypes();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Configuration <em>Configuration</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see net.bhl.cdt.model.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Configuration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see net.bhl.cdt.model.Configuration#getComponents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Configuration#getCalculationSets <em>Calculation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculation Sets</em>'.
	 * @see net.bhl.cdt.model.Configuration#getCalculationSets()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_CalculationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Configuration#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see net.bhl.cdt.model.Configuration#getViews()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Views();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.bhl.cdt.model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Model#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see net.bhl.cdt.model.Model#getConfigurations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Model#getQualifyingSpaces <em>Qualifying Spaces</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifying Spaces</em>'.
	 * @see net.bhl.cdt.model.Model#getQualifyingSpaces()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_QualifyingSpaces();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.bhl.cdt.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.bhl.cdt.model.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.Parameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see net.bhl.cdt.model.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.Parameter#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see net.bhl.cdt.model.Parameter#getQuantity()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Quantity();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.StructuralElement <em>Structural Element</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Structural Element</em>'.
	 * @see net.bhl.cdt.model.StructuralElement
	 * @generated
	 */
	EClass getStructuralElement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see net.bhl.cdt.model.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the container reference '{@link net.bhl.cdt.model.ComponentInterface#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see net.bhl.cdt.model.ComponentInterface#getParentComponent()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_ParentComponent();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.ComponentInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.bhl.cdt.model.ComponentInterface#getSource()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EAttribute getComponentInterface_Source();

	/**
	 * Returns the meta object for the attribute list '{@link net.bhl.cdt.model.ComponentInterface#getDiscipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Discipline</em>'.
	 * @see net.bhl.cdt.model.ComponentInterface#getDiscipline()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EAttribute getComponentInterface_Discipline();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.ComponentInterface#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see net.bhl.cdt.model.ComponentInterface#getAnnotation()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EAttribute getComponentInterface_Annotation();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.View <em>View</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see net.bhl.cdt.model.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.MappableComponentInterface <em>Mappable Component Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappable Component Interface</em>'.
	 * @see net.bhl.cdt.model.MappableComponentInterface
	 * @generated
	 */
	EClass getMappableComponentInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ComponentImpl <em>Component</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ComponentImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT__SUB_COMPONENTS = eINSTANCE.getComponent_SubComponents();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT__PARAMETERS = eINSTANCE.getComponent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Connected Components</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT__CONNECTED_COMPONENTS = eINSTANCE.getComponent_ConnectedComponents();

		/**
		 * The meta object literal for the '<em><b>Calculation Sets</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT__CALCULATION_SETS = eINSTANCE.getComponent_CalculationSets();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ValueImpl <em>Value</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ValueImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__UNIT = eINSTANCE.getValue_Unit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__DESCRIPTION = eINSTANCE.getValue_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__SOURCE = eINSTANCE.getValue_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALUE__DATATYPES = eINSTANCE.getValue_Datatypes();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.impl.ConfigurationImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENTS = eINSTANCE.getConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Calculation Sets</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONFIGURATION__CALCULATION_SETS = eINSTANCE.getConfiguration_CalculationSets();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONFIGURATION__VIEWS = eINSTANCE.getConfiguration_Views();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ModelImpl <em>Model</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ModelImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL__CONFIGURATIONS = eINSTANCE.getModel_Configurations();

		/**
		 * The meta object literal for the '<em><b>Qualifying Spaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL__QUALIFYING_SPACES = eINSTANCE.getModel_QualifyingSpaces();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ElementImpl <em>Element</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ElementImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ParameterImpl <em>Parameter</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ParameterImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER__VALUES = eINSTANCE.getParameter_Values();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__QUANTITY = eINSTANCE.getParameter_Quantity();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.StructuralElementImpl <em>Structural Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.impl.StructuralElementImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getStructuralElement()
		 * @generated
		 */
		EClass STRUCTURAL_ELEMENT = eINSTANCE.getStructuralElement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.impl.ComponentInterfaceImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__PARENT_COMPONENT = eINSTANCE.getComponentInterface_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INTERFACE__SOURCE = eINSTANCE.getComponentInterface_Source();

		/**
		 * The meta object literal for the '<em><b>Discipline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INTERFACE__DISCIPLINE = eINSTANCE.getComponentInterface_Discipline();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INTERFACE__ANNOTATION = eINSTANCE.getComponentInterface_Annotation();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.ViewImpl <em>View</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.model.impl.ViewImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.MappableComponentInterface <em>Mappable Component Interface</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.MappableComponentInterface
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getMappableComponentInterface()
		 * @generated
		 */
		EClass MAPPABLE_COMPONENT_INTERFACE = eINSTANCE.getMappableComponentInterface();

	}

} // ModelPackage
