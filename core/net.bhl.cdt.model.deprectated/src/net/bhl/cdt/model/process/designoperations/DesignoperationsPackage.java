/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.process.ProcessPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsFactory
 * @model kind="package"
 * @generated
 */
public interface DesignoperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "designoperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/process/designoperations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model.process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	DesignoperationsPackage eINSTANCE = net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.DisciplineToolImpl <em>Discipline Tool</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.DisciplineToolImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getDisciplineTool()
	 * @generated
	 */
	int DISCIPLINE_TOOL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL__NAME = ProcessPackage.DESIGN_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL__BUSY = ProcessPackage.DESIGN_PROCESS__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL__TIME_STAMP = ProcessPackage.DESIGN_PROCESS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL__DESIGN_PROCESS_ELEMENTS = ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Discipline Tool</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_FEATURE_COUNT = ProcessPackage.DESIGN_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL___START = ProcessPackage.DESIGN_PROCESS___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL___IS_STARTABLE = ProcessPackage.DESIGN_PROCESS___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL___GET_STRATEGY__ECLASS = ProcessPackage.DESIGN_PROCESS___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Discipline Tool</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_OPERATION_COUNT = ProcessPackage.DESIGN_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.FormulaImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__PROCESSED_ELEMENTS = ModelPackage.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__GENERATED_ELEMENTS = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__NAME = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__BUSY = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__TIME_STAMP = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__SUPERPROCESS = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__PARAMETER = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = ModelPackage.OPERATION_WITH_INPUT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___START = ModelPackage.OPERATION_WITH_INPUT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___IS_STARTABLE = ModelPackage.OPERATION_WITH_INPUT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA___GET_STRATEGY__ECLASS = ModelPackage.OPERATION_WITH_INPUT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = ModelPackage.OPERATION_WITH_INPUT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.AssumptionImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = ProcessPackage.DESIGN_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__BUSY = ProcessPackage.DESIGN_OPERATION__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TIME_STAMP = ProcessPackage.DESIGN_OPERATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SUPERPROCESS = ProcessPackage.DESIGN_OPERATION__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__GENERATED_ELEMENTS = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION___START = ProcessPackage.DESIGN_OPERATION___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION___IS_STARTABLE = ProcessPackage.DESIGN_OPERATION___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION___GET_STRATEGY__ECLASS = ProcessPackage.DESIGN_OPERATION___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = ProcessPackage.DESIGN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl <em>Discipline Tool Service</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getDisciplineToolService()
	 * @generated
	 */
	int DISCIPLINE_TOOL_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE__NAME = DISCIPLINE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE__BUSY = DISCIPLINE_TOOL__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE__TIME_STAMP = DISCIPLINE_TOOL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE__DESIGN_PROCESS_ELEMENTS = DISCIPLINE_TOOL__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE__SERVICE_URL = DISCIPLINE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discipline Tool Service</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE_FEATURE_COUNT = DISCIPLINE_TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE___START = DISCIPLINE_TOOL___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE___IS_STARTABLE = DISCIPLINE_TOOL___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE___GET_STRATEGY__ECLASS = DISCIPLINE_TOOL___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Discipline Tool Service</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_TOOL_SERVICE_OPERATION_COUNT = DISCIPLINE_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.LocalDisciplineToolImpl <em>Local Discipline Tool</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.LocalDisciplineToolImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getLocalDisciplineTool()
	 * @generated
	 */
	int LOCAL_DISCIPLINE_TOOL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL__NAME = DISCIPLINE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL__BUSY = DISCIPLINE_TOOL__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL__TIME_STAMP = DISCIPLINE_TOOL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL__DESIGN_PROCESS_ELEMENTS = DISCIPLINE_TOOL__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Local Discipline Tool</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL_FEATURE_COUNT = DISCIPLINE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL___START = DISCIPLINE_TOOL___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL___IS_STARTABLE = DISCIPLINE_TOOL___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL___GET_STRATEGY__ECLASS = DISCIPLINE_TOOL___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Local Discipline Tool</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_DISCIPLINE_TOOL_OPERATION_COUNT = DISCIPLINE_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl <em>Calculated Value</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculatedValue()
	 * @generated
	 */
	int CALCULATED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__NAME = ProcessPackage.DESIGN_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__BUSY = ProcessPackage.DESIGN_OPERATION__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__TIME_STAMP = ProcessPackage.DESIGN_OPERATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__SUPERPROCESS = ProcessPackage.DESIGN_OPERATION__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__SOURCE_OPERATION = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__STATES = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__PARAMETER = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__PROCESSED_ELEMENTS = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE__EXPRESSION = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Calculated Value</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE_FEATURE_COUNT = ProcessPackage.DESIGN_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE___START = ProcessPackage.DESIGN_OPERATION___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE___IS_STARTABLE = ProcessPackage.DESIGN_OPERATION___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE___GET_STRATEGY__ECLASS = ProcessPackage.DESIGN_OPERATION___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Calculated Value</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_VALUE_OPERATION_COUNT = ProcessPackage.DESIGN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedDecimalNumberImpl <em>Calculated Decimal Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.CalculatedDecimalNumberImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculatedDecimalNumber()
	 * @generated
	 */
	int CALCULATED_DECIMAL_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__NAME = CALCULATED_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__BUSY = CALCULATED_VALUE__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__TIME_STAMP = CALCULATED_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__SUPERPROCESS = CALCULATED_VALUE__SUPERPROCESS;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__SOURCE_OPERATION = CALCULATED_VALUE__SOURCE_OPERATION;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__STATES = CALCULATED_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__PARAMETER = CALCULATED_VALUE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__PROCESSED_ELEMENTS = CALCULATED_VALUE__PROCESSED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__EXPRESSION = CALCULATED_VALUE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER__VALUE = CALCULATED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculated Decimal Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER_FEATURE_COUNT = CALCULATED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER___START = CALCULATED_VALUE___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER___IS_STARTABLE = CALCULATED_VALUE___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER___GET_STRATEGY__ECLASS = CALCULATED_VALUE___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Calculated Decimal Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_DECIMAL_NUMBER_OPERATION_COUNT = CALCULATED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculationsImpl <em>Calculations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.designoperations.impl.CalculationsImpl
	 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculations()
	 * @generated
	 */
	int CALCULATIONS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS__NAME = ProcessPackage.DESIGN_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS__BUSY = ProcessPackage.DESIGN_PROCESS__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS__TIME_STAMP = ProcessPackage.DESIGN_PROCESS__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS__DESIGN_PROCESS_ELEMENTS = ProcessPackage.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Calculations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_FEATURE_COUNT = ProcessPackage.DESIGN_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS___START = ProcessPackage.DESIGN_PROCESS___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS___IS_STARTABLE = ProcessPackage.DESIGN_PROCESS___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS___GET_STRATEGY__ECLASS = ProcessPackage.DESIGN_PROCESS___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Calculations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATIONS_OPERATION_COUNT = ProcessPackage.DESIGN_PROCESS_OPERATION_COUNT + 0;

	int DISCIPLINE_TOOL_SERVICE__SUPERPROCESS = 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.DisciplineTool <em>Discipline Tool</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline Tool</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.DisciplineTool
	 * @generated
	 */
	EClass getDisciplineTool();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.process.designoperations.Formula#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.Formula#getFormula()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Formula();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.process.designoperations.Formula#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.Formula#getParameter()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Parameter();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.DisciplineToolService <em>Discipline Tool Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline Tool Service</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.DisciplineToolService
	 * @generated
	 */
	EClass getDisciplineToolService();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.model.process.designoperations.DisciplineToolService#getServiceURL <em>Service URL</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Service URL</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.DisciplineToolService#getServiceURL()
	 * @see #getDisciplineToolService()
	 * @generated
	 */
	EAttribute getDisciplineToolService_ServiceURL();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.LocalDisciplineTool <em>Local Discipline Tool</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Discipline Tool</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.LocalDisciplineTool
	 * @generated
	 */
	EClass getLocalDisciplineTool();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.CalculatedValue <em>Calculated Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Value</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.CalculatedValue
	 * @generated
	 */
	EClass getCalculatedValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.model.process.designoperations.CalculatedValue#getExpression <em>Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.CalculatedValue#getExpression()
	 * @see #getCalculatedValue()
	 * @generated
	 */
	EAttribute getCalculatedValue_Expression();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber <em>Calculated Decimal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Decimal Number</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber
	 * @generated
	 */
	EClass getCalculatedDecimalNumber();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.designoperations.Calculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculations</em>'.
	 * @see net.bhl.cdt.model.process.designoperations.Calculations
	 * @generated
	 */
	EClass getCalculations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DesignoperationsFactory getDesignoperationsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.DisciplineToolImpl <em>Discipline Tool</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.DisciplineToolImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getDisciplineTool()
		 * @generated
		 */
		EClass DISCIPLINE_TOOL = eINSTANCE.getDisciplineTool();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.FormulaImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__FORMULA = eINSTANCE.getFormula_Formula();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__PARAMETER = eINSTANCE.getFormula_Parameter();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.AssumptionImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl <em>Discipline Tool Service</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.DisciplineToolServiceImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getDisciplineToolService()
		 * @generated
		 */
		EClass DISCIPLINE_TOOL_SERVICE = eINSTANCE.getDisciplineToolService();

		/**
		 * The meta object literal for the '<em><b>Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute DISCIPLINE_TOOL_SERVICE__SERVICE_URL = eINSTANCE.getDisciplineToolService_ServiceURL();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.LocalDisciplineToolImpl <em>Local Discipline Tool</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.LocalDisciplineToolImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getLocalDisciplineTool()
		 * @generated
		 */
		EClass LOCAL_DISCIPLINE_TOOL = eINSTANCE.getLocalDisciplineTool();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl <em>Calculated Value</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.CalculatedValueImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculatedValue()
		 * @generated
		 */
		EClass CALCULATED_VALUE = eINSTANCE.getCalculatedValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATED_VALUE__EXPRESSION = eINSTANCE.getCalculatedValue_Expression();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculatedDecimalNumberImpl <em>Calculated Decimal Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.CalculatedDecimalNumberImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculatedDecimalNumber()
		 * @generated
		 */
		EClass CALCULATED_DECIMAL_NUMBER = eINSTANCE.getCalculatedDecimalNumber();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.designoperations.impl.CalculationsImpl <em>Calculations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.designoperations.impl.CalculationsImpl
		 * @see net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl#getCalculations()
		 * @generated
		 */
		EClass CALCULATIONS = eINSTANCE.getCalculations();

	}

} // DesignoperationsPackage
