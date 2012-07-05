/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.calculation;

import net.bhl.cdt.model.ModelPackage;

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
 * @see net.bhl.cdt.model.calculation.CalculationFactory
 * @model kind="package"
 * @generated
 */
public interface CalculationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calculation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/calculation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	CalculationPackage eINSTANCE = net.bhl.cdt.model.calculation.impl.CalculationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.CalculationSetImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationSet()
	 * @generated
	 */
	int CALCULATION_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET__CALCULATIONS = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graphs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET__GRAPHS = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Space Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET__SPACE_QUALIFIERS = ModelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Calculation Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET__SUB_CALCULATION_SET = ModelPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.CalculationImpl <em>Calculation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.CalculationImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculation()
	 * @generated
	 */
	int CALCULATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION__PARAMETER_MAPPING = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION__FUNCTION_ID = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calculation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.ParameterMappingImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Input Mappables</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__INPUT_MAPPABLES = 0;

	/**
	 * The feature id for the '<em><b>Output Mappables</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__OUTPUT_MAPPABLES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.CalculationGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.CalculationGraphImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationGraph()
	 * @generated
	 */
	int CALCULATION_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_GRAPH__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_GRAPH__NODES = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Node</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_GRAPH__FIRST_NODE = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Set</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_GRAPH__START_SET = ModelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_GRAPH_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.AbstractNodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.NodeImpl <em>Node</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.model.calculation.impl.NodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next Node</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NEXT_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CALCULATION = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.ControlNodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next True</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NEXT_TRUE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next False</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NEXT_FALSE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__CONDITION = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.ConditionImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mappable Component Of Interest</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MAPPABLE_COMPONENT_OF_INTEREST = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.IterationNodeImpl <em>Iteration Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.IterationNodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getIterationNode()
	 * @generated
	 */
	int ITERATION_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next True</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE__NEXT_TRUE = CONTROL_NODE__NEXT_TRUE;

	/**
	 * The feature id for the '<em><b>Next False</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE__NEXT_FALSE = CONTROL_NODE__NEXT_FALSE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE__CONDITION = CONTROL_NODE__CONDITION;

	/**
	 * The feature id for the '<em><b>Max Iteration</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE__MAX_ITERATION = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iteration Node</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.ConditionalNodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next True</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NEXT_TRUE = CONTROL_NODE__NEXT_TRUE;

	/**
	 * The feature id for the '<em><b>Next False</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NEXT_FALSE = CONTROL_NODE__NEXT_FALSE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONDITION = CONTROL_NODE__CONDITION;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.StartSetImpl <em>Start Set</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.StartSetImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getStartSet()
	 * @generated
	 */
	int START_SET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SET__NAME = ModelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SET__VALUES = ModelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Set</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int START_SET_FEATURE_COUNT = ModelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl <em>Parameter Descriptor To Mappable Component Interface Map</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getParameterDescriptorToMappableComponentInterfaceMap()
	 * @generated
	 */
	int PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Descriptor To Mappable Component Interface Map</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl <em>Set Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl
	 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationSetNode()
	 * @generated
	 */
	int CALCULATION_SET_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next Node</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET_NODE__NEXT_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculation Set</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET_NODE__CALCULATION_SET = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Node</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SET_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.CalculationSet <em>Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Set</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSet
	 * @generated
	 */
	EClass getCalculationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.calculation.CalculationSet#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculations</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSet#getCalculations()
	 * @see #getCalculationSet()
	 * @generated
	 */
	EReference getCalculationSet_Calculations();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.calculation.CalculationSet#getGraphs <em>Graphs</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphs</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSet#getGraphs()
	 * @see #getCalculationSet()
	 * @generated
	 */
	EReference getCalculationSet_Graphs();

	/**
	 * Returns the meta object for the reference list '
	 * {@link net.bhl.cdt.model.calculation.CalculationSet#getSpaceQualifiers <em>Space Qualifiers</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Space Qualifiers</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSet#getSpaceQualifiers()
	 * @see #getCalculationSet()
	 * @generated
	 */
	EReference getCalculationSet_SpaceQualifiers();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.model.calculation.CalculationSet#getSubCalculationSet <em>Sub Calculation Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Sub Calculation Set</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSet#getSubCalculationSet()
	 * @see #getCalculationSet()
	 * @generated
	 */
	EReference getCalculationSet_SubCalculationSet();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.Calculation <em>Calculation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Calculation</em>'.
	 * @see net.bhl.cdt.model.calculation.Calculation
	 * @generated
	 */
	EClass getCalculation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link net.bhl.cdt.model.calculation.Calculation#getParameterMapping <em>Parameter Mapping</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Parameter Mapping</em>'.
	 * @see net.bhl.cdt.model.calculation.Calculation#getParameterMapping()
	 * @see #getCalculation()
	 * @generated
	 */
	EReference getCalculation_ParameterMapping();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.calculation.Calculation#getFunctionID <em>Function ID</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function ID</em>'.
	 * @see net.bhl.cdt.model.calculation.Calculation#getFunctionID()
	 * @see #getCalculation()
	 * @generated
	 */
	EAttribute getCalculation_FunctionID();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see net.bhl.cdt.model.calculation.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the map '{@link net.bhl.cdt.model.calculation.ParameterMapping#getInputMappables <em>Input Mappables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Input Mappables</em>'.
	 * @see net.bhl.cdt.model.calculation.ParameterMapping#getInputMappables()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_InputMappables();

	/**
	 * Returns the meta object for the map '{@link net.bhl.cdt.model.calculation.ParameterMapping#getOutputMappables <em>Output Mappables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Output Mappables</em>'.
	 * @see net.bhl.cdt.model.calculation.ParameterMapping#getOutputMappables()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EReference getParameterMapping_OutputMappables();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.CalculationGraph <em>Graph</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationGraph
	 * @generated
	 */
	EClass getCalculationGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.calculation.CalculationGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationGraph#getNodes()
	 * @see #getCalculationGraph()
	 * @generated
	 */
	EReference getCalculationGraph_Nodes();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.CalculationGraph#getFirstNode <em>First Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Node</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationGraph#getFirstNode()
	 * @see #getCalculationGraph()
	 * @generated
	 */
	EReference getCalculationGraph_FirstNode();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.model.calculation.CalculationGraph#getStartSet <em>Start Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Set</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationGraph#getStartSet()
	 * @see #getCalculationGraph()
	 * @generated
	 */
	EReference getCalculationGraph_StartSet();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see net.bhl.cdt.model.calculation.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see net.bhl.cdt.model.calculation.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.Node#getNextNode <em>Next Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Node</em>'.
	 * @see net.bhl.cdt.model.calculation.Node#getNextNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NextNode();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.Node#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculation</em>'.
	 * @see net.bhl.cdt.model.calculation.Node#getCalculation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Calculation();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.ControlNode <em>Control Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see net.bhl.cdt.model.calculation.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.ControlNode#getNextTrue <em>Next True</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next True</em>'.
	 * @see net.bhl.cdt.model.calculation.ControlNode#getNextTrue()
	 * @see #getControlNode()
	 * @generated
	 */
	EReference getControlNode_NextTrue();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.ControlNode#getNextFalse <em>Next False</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next False</em>'.
	 * @see net.bhl.cdt.model.calculation.ControlNode#getNextFalse()
	 * @see #getControlNode()
	 * @generated
	 */
	EReference getControlNode_NextFalse();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.calculation.ControlNode#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see net.bhl.cdt.model.calculation.ControlNode#getCondition()
	 * @see #getControlNode()
	 * @generated
	 */
	EReference getControlNode_Condition();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.Condition <em>Condition</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see net.bhl.cdt.model.calculation.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.Condition#getMappableComponentOfInterest <em>Mappable Component Of Interest</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mappable Component Of Interest</em>'.
	 * @see net.bhl.cdt.model.calculation.Condition#getMappableComponentOfInterest()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_MappableComponentOfInterest();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.calculation.Condition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.model.calculation.Condition#getValue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Value();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.IterationNode <em>Iteration Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Node</em>'.
	 * @see net.bhl.cdt.model.calculation.IterationNode
	 * @generated
	 */
	EClass getIterationNode();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.calculation.IterationNode#getMaxIteration <em>Max Iteration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Iteration</em>'.
	 * @see net.bhl.cdt.model.calculation.IterationNode#getMaxIteration()
	 * @see #getIterationNode()
	 * @generated
	 */
	EAttribute getIterationNode_MaxIteration();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see net.bhl.cdt.model.calculation.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.StartSet <em>Start Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Start Set</em>'.
	 * @see net.bhl.cdt.model.calculation.StartSet
	 * @generated
	 */
	EClass getStartSet();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.calculation.StartSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see net.bhl.cdt.model.calculation.StartSet#getValues()
	 * @see #getStartSet()
	 * @generated
	 */
	EReference getStartSet_Values();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry
	 * <em>Parameter Descriptor To Mappable Component Interface Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Parameter Descriptor To Mappable Component Interface Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor"
	 *        valueType="net.bhl.cdt.model.MappableComponentInterface"
	 * @generated
	 */
	EClass getParameterDescriptorToMappableComponentInterfaceMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterDescriptorToMappableComponentInterfaceMap()
	 * @generated
	 */
	EReference getParameterDescriptorToMappableComponentInterfaceMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterDescriptorToMappableComponentInterfaceMap()
	 * @generated
	 */
	EReference getParameterDescriptorToMappableComponentInterfaceMap_Value();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.calculation.CalculationSetNode <em>Set Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Node</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSetNode
	 * @generated
	 */
	EClass getCalculationSetNode();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.calculation.CalculationSetNode#getNextNode <em>Next Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Node</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSetNode#getNextNode()
	 * @see #getCalculationSetNode()
	 * @generated
	 */
	EReference getCalculationSetNode_NextNode();

	/**
	 * Returns the meta object for the reference '
	 * {@link net.bhl.cdt.model.calculation.CalculationSetNode#getCalculationSet <em>Calculation Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Calculation Set</em>'.
	 * @see net.bhl.cdt.model.calculation.CalculationSetNode#getCalculationSet()
	 * @see #getCalculationSetNode()
	 * @generated
	 */
	EReference getCalculationSetNode_CalculationSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalculationFactory getCalculationFactory();

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
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.CalculationSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.CalculationSetImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationSet()
		 * @generated
		 */
		EClass CALCULATION_SET = eINSTANCE.getCalculationSet();

		/**
		 * The meta object literal for the '<em><b>Calculations</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_SET__CALCULATIONS = eINSTANCE.getCalculationSet_Calculations();

		/**
		 * The meta object literal for the '<em><b>Graphs</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_SET__GRAPHS = eINSTANCE.getCalculationSet_Graphs();

		/**
		 * The meta object literal for the '<em><b>Space Qualifiers</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_SET__SPACE_QUALIFIERS = eINSTANCE.getCalculationSet_SpaceQualifiers();

		/**
		 * The meta object literal for the '<em><b>Sub Calculation Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_SET__SUB_CALCULATION_SET = eINSTANCE.getCalculationSet_SubCalculationSet();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.CalculationImpl <em>Calculation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.CalculationImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculation()
		 * @generated
		 */
		EClass CALCULATION = eINSTANCE.getCalculation();

		/**
		 * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION__PARAMETER_MAPPING = eINSTANCE.getCalculation_ParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Function ID</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION__FUNCTION_ID = eINSTANCE.getCalculation_FunctionID();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.ParameterMappingImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getParameterMapping()
		 * @generated
		 */
		EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Input Mappables</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__INPUT_MAPPABLES = eINSTANCE.getParameterMapping_InputMappables();

		/**
		 * The meta object literal for the '<em><b>Output Mappables</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAPPING__OUTPUT_MAPPABLES = eINSTANCE.getParameterMapping_OutputMappables();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.CalculationGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.CalculationGraphImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationGraph()
		 * @generated
		 */
		EClass CALCULATION_GRAPH = eINSTANCE.getCalculationGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_GRAPH__NODES = eINSTANCE.getCalculationGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>First Node</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_GRAPH__FIRST_NODE = eINSTANCE.getCalculationGraph_FirstNode();

		/**
		 * The meta object literal for the '<em><b>Start Set</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_GRAPH__START_SET = eINSTANCE.getCalculationGraph_StartSet();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.AbstractNodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.NodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Next Node</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference NODE__NEXT_NODE = eINSTANCE.getNode_NextNode();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference NODE__CALCULATION = eINSTANCE.getNode_Calculation();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.ControlNodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '<em><b>Next True</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_NODE__NEXT_TRUE = eINSTANCE.getControlNode_NextTrue();

		/**
		 * The meta object literal for the '<em><b>Next False</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_NODE__NEXT_FALSE = eINSTANCE.getControlNode_NextFalse();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTROL_NODE__CONDITION = eINSTANCE.getControlNode_Condition();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.ConditionImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Mappable Component Of Interest</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONDITION__MAPPABLE_COMPONENT_OF_INTEREST = eINSTANCE.getCondition_MappableComponentOfInterest();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.IterationNodeImpl <em>Iteration Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.IterationNodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getIterationNode()
		 * @generated
		 */
		EClass ITERATION_NODE = eINSTANCE.getIterationNode();

		/**
		 * The meta object literal for the '<em><b>Max Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_NODE__MAX_ITERATION = eINSTANCE.getIterationNode_MaxIteration();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.ConditionalNodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.StartSetImpl <em>Start Set</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.StartSetImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getStartSet()
		 * @generated
		 */
		EClass START_SET = eINSTANCE.getStartSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference START_SET__VALUES = eINSTANCE.getStartSet_Values();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl <em>Parameter Descriptor To Mappable Component Interface Map</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.ParameterDescriptorToMappableComponentInterfaceMapImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getParameterDescriptorToMappableComponentInterfaceMap()
		 * @generated
		 */
		EClass PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP = eINSTANCE.getParameterDescriptorToMappableComponentInterfaceMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__KEY = eINSTANCE.getParameterDescriptorToMappableComponentInterfaceMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DESCRIPTOR_TO_MAPPABLE_COMPONENT_INTERFACE_MAP__VALUE = eINSTANCE.getParameterDescriptorToMappableComponentInterfaceMap_Value();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl <em>Set Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.calculation.impl.CalculationSetNodeImpl
		 * @see net.bhl.cdt.model.calculation.impl.CalculationPackageImpl#getCalculationSetNode()
		 * @generated
		 */
		EClass CALCULATION_SET_NODE = eINSTANCE.getCalculationSetNode();

		/**
		 * The meta object literal for the '<em><b>Next Node</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_SET_NODE__NEXT_NODE = eINSTANCE.getCalculationSetNode_NextNode();

		/**
		 * The meta object literal for the '<em><b>Calculation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATION_SET_NODE__CALCULATION_SET = eINSTANCE.getCalculationSetNode_CalculationSet();

	}

} // CalculationPackage
