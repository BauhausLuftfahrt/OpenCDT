/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.system.SystemPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.selection.SelectionFactory
 * @model kind="package"
 * @generated
 */
public interface SelectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "selection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/process/selection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model.process.selection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectionPackage eINSTANCE = net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.RationaleImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__RATIONALE_DESCRIPTION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl <em>Value Selection Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelectionArgument()
	 * @generated
	 */
	int VALUE_SELECTION_ARGUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT__NAME = RATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT__RATIONALE_DESCRIPTION = RATIONALE__RATIONALE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supported Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA = RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposed Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA = RATIONALE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Selection Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT_FEATURE_COUNT = RATIONALE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Selection Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_ARGUMENT_OPERATION_COUNT = RATIONALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion <em>Value Selection Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionCriterion
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelectionCriterion()
	 * @generated
	 */
	int VALUE_SELECTION_CRITERION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_CRITERION__NAME = RATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION = RATIONALE__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Value Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_CRITERION_FEATURE_COUNT = RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_CRITERION_OPERATION_COUNT = RATIONALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl <em>Value Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelection()
	 * @generated
	 */
	int VALUE_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION__NAME = ProcessPackage.PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION__BUSY = ProcessPackage.PROCESS_ELEMENT__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION__TIME_STAMP = ProcessPackage.PROCESS_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION__CRITERIA = ProcessPackage.PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION__SELECTED_VALUES = ProcessPackage.PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_FEATURE_COUNT = ProcessPackage.PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION___START = ProcessPackage.PROCESS_ELEMENT___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION___IS_STARTABLE = ProcessPackage.PROCESS_ELEMENT___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION___GET_STRATEGY__ECLASS = ProcessPackage.PROCESS_ELEMENT___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Value Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SELECTION_OPERATION_COUNT = ProcessPackage.PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl <em>Selected Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.SelectedValueImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getSelectedValue()
	 * @generated
	 */
	int SELECTED_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__SOURCE_OPERATION = SystemPackage.VALUE__SOURCE_OPERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__NAME = SystemPackage.VALUE__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__STATES = SystemPackage.VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__PARAMETER = SystemPackage.VALUE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__BUSY = SystemPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__TIME_STAMP = SystemPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applied Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__APPLIED_CRITERIA = SystemPackage.VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__ARGUMENTS = SystemPackage.VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE__SELECTED_VALUES = SystemPackage.VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Selected Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE_FEATURE_COUNT = SystemPackage.VALUE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE___START = SystemPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE___IS_STARTABLE = SystemPackage.VALUE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE___GET_STRATEGY__ECLASS = SystemPackage.VALUE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selected Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_VALUE_OPERATION_COUNT = SystemPackage.VALUE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl <em>Selected Measured Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getSelectedMeasuredValue()
	 * @generated
	 */
	int SELECTED_MEASURED_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__SOURCE_OPERATION = SELECTED_VALUE__SOURCE_OPERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__NAME = SELECTED_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__STATES = SELECTED_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__PARAMETER = SELECTED_VALUE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__BUSY = SELECTED_VALUE__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__TIME_STAMP = SELECTED_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Applied Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__APPLIED_CRITERIA = SELECTED_VALUE__APPLIED_CRITERIA;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__ARGUMENTS = SELECTED_VALUE__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Selected Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__SELECTED_VALUES = SELECTED_VALUE__SELECTED_VALUES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__VALUE = SELECTED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE__UNIT = SELECTED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selected Measured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE_FEATURE_COUNT = SELECTED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE___START = SELECTED_VALUE___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE___IS_STARTABLE = SELECTED_VALUE___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE___GET_STRATEGY__ECLASS = SELECTED_VALUE___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Selected Measured Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_MEASURED_VALUE_OPERATION_COUNT = SELECTED_VALUE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.NameCriterionImpl <em>Name Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.NameCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getNameCriterion()
	 * @generated
	 */
	int NAME_CRITERION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CRITERION__VALUE_NAME = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.PartOfCriterionImpl <em>Part Of Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.PartOfCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPartOfCriterion()
	 * @generated
	 */
	int PART_OF_CRITERION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Part Of Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part Of Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.HighestValueCriterionImpl <em>Highest Value Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.HighestValueCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getHighestValueCriterion()
	 * @generated
	 */
	int HIGHEST_VALUE_CRITERION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_VALUE_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_VALUE_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Highest Value Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_VALUE_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Highest Value Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHEST_VALUE_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.PreferLatestCriterionImpl <em>Prefer Latest Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.PreferLatestCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferLatestCriterion()
	 * @generated
	 */
	int PREFER_LATEST_CRITERION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_LATEST_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_LATEST_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Prefer Latest Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_LATEST_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prefer Latest Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_LATEST_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.PreferGeneratedCriterionImpl <em>Prefer Generated Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.PreferGeneratedCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferGeneratedCriterion()
	 * @generated
	 */
	int PREFER_GENERATED_CRITERION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_GENERATED_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_GENERATED_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Prefer Generated Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_GENERATED_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prefer Generated Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_GENERATED_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.selection.impl.PreferAuthorCriterionImpl <em>Prefer Author Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.selection.impl.PreferAuthorCriterionImpl
	 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferAuthorCriterion()
	 * @generated
	 */
	int PREFER_AUTHOR_CRITERION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_AUTHOR_CRITERION__NAME = VALUE_SELECTION_CRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Rationale Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_AUTHOR_CRITERION__RATIONALE_DESCRIPTION = VALUE_SELECTION_CRITERION__RATIONALE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Prefer Author Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_AUTHOR_CRITERION_FEATURE_COUNT = VALUE_SELECTION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prefer Author Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFER_AUTHOR_CRITERION_OPERATION_COUNT = VALUE_SELECTION_CRITERION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument <em>Value Selection Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Selection Argument</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionArgument
	 * @generated
	 */
	EClass getValueSelectionArgument();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument#getSupportedCriteria <em>Supported Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Criteria</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionArgument#getSupportedCriteria()
	 * @see #getValueSelectionArgument()
	 * @generated
	 */
	EReference getValueSelectionArgument_SupportedCriteria();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument#getOpposedCriteria <em>Opposed Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opposed Criteria</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionArgument#getOpposedCriteria()
	 * @see #getValueSelectionArgument()
	 * @generated
	 */
	EReference getValueSelectionArgument_OpposedCriteria();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion <em>Value Selection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Selection Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionCriterion
	 * @generated
	 */
	EClass getValueSelectionCriterion();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.ValueSelection <em>Value Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Selection</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelection
	 * @generated
	 */
	EClass getValueSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.process.selection.ValueSelection#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelection#getCriteria()
	 * @see #getValueSelection()
	 * @generated
	 */
	EReference getValueSelection_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.process.selection.ValueSelection#getSelectedValues <em>Selected Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Values</em>'.
	 * @see net.bhl.cdt.model.process.selection.ValueSelection#getSelectedValues()
	 * @see #getValueSelection()
	 * @generated
	 */
	EReference getValueSelection_SelectedValues();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.SelectedValue <em>Selected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Value</em>'.
	 * @see net.bhl.cdt.model.process.selection.SelectedValue
	 * @generated
	 */
	EClass getSelectedValue();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.process.selection.SelectedValue#getAppliedCriteria <em>Applied Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Criteria</em>'.
	 * @see net.bhl.cdt.model.process.selection.SelectedValue#getAppliedCriteria()
	 * @see #getSelectedValue()
	 * @generated
	 */
	EReference getSelectedValue_AppliedCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.process.selection.SelectedValue#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see net.bhl.cdt.model.process.selection.SelectedValue#getArguments()
	 * @see #getSelectedValue()
	 * @generated
	 */
	EReference getSelectedValue_Arguments();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.process.selection.SelectedValue#getSelectedValues <em>Selected Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Values</em>'.
	 * @see net.bhl.cdt.model.process.selection.SelectedValue#getSelectedValues()
	 * @see #getSelectedValue()
	 * @generated
	 */
	EReference getSelectedValue_SelectedValues();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.SelectedMeasuredValue <em>Selected Measured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Measured Value</em>'.
	 * @see net.bhl.cdt.model.process.selection.SelectedMeasuredValue
	 * @generated
	 */
	EClass getSelectedMeasuredValue();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see net.bhl.cdt.model.process.selection.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.process.selection.Rationale#getRationaleDescription <em>Rationale Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale Description</em>'.
	 * @see net.bhl.cdt.model.process.selection.Rationale#getRationaleDescription()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_RationaleDescription();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.NameCriterion <em>Name Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.NameCriterion
	 * @generated
	 */
	EClass getNameCriterion();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.process.selection.NameCriterion#getValueName <em>Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Name</em>'.
	 * @see net.bhl.cdt.model.process.selection.NameCriterion#getValueName()
	 * @see #getNameCriterion()
	 * @generated
	 */
	EAttribute getNameCriterion_ValueName();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.PartOfCriterion <em>Part Of Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Of Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.PartOfCriterion
	 * @generated
	 */
	EClass getPartOfCriterion();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.HighestValueCriterion <em>Highest Value Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highest Value Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.HighestValueCriterion
	 * @generated
	 */
	EClass getHighestValueCriterion();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.PreferLatestCriterion <em>Prefer Latest Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefer Latest Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.PreferLatestCriterion
	 * @generated
	 */
	EClass getPreferLatestCriterion();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.PreferGeneratedCriterion <em>Prefer Generated Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefer Generated Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.PreferGeneratedCriterion
	 * @generated
	 */
	EClass getPreferGeneratedCriterion();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.selection.PreferAuthorCriterion <em>Prefer Author Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefer Author Criterion</em>'.
	 * @see net.bhl.cdt.model.process.selection.PreferAuthorCriterion
	 * @generated
	 */
	EClass getPreferAuthorCriterion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SelectionFactory getSelectionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl <em>Value Selection Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.ValueSelectionArgumentImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelectionArgument()
		 * @generated
		 */
		EClass VALUE_SELECTION_ARGUMENT = eINSTANCE.getValueSelectionArgument();

		/**
		 * The meta object literal for the '<em><b>Supported Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA = eINSTANCE.getValueSelectionArgument_SupportedCriteria();

		/**
		 * The meta object literal for the '<em><b>Opposed Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA = eINSTANCE.getValueSelectionArgument_OpposedCriteria();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion <em>Value Selection Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.ValueSelectionCriterion
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelectionCriterion()
		 * @generated
		 */
		EClass VALUE_SELECTION_CRITERION = eINSTANCE.getValueSelectionCriterion();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl <em>Value Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.ValueSelectionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getValueSelection()
		 * @generated
		 */
		EClass VALUE_SELECTION = eINSTANCE.getValueSelection();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SELECTION__CRITERIA = eINSTANCE.getValueSelection_Criteria();

		/**
		 * The meta object literal for the '<em><b>Selected Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SELECTION__SELECTED_VALUES = eINSTANCE.getValueSelection_SelectedValues();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.SelectedValueImpl <em>Selected Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.SelectedValueImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getSelectedValue()
		 * @generated
		 */
		EClass SELECTED_VALUE = eINSTANCE.getSelectedValue();

		/**
		 * The meta object literal for the '<em><b>Applied Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_VALUE__APPLIED_CRITERIA = eINSTANCE.getSelectedValue_AppliedCriteria();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_VALUE__ARGUMENTS = eINSTANCE.getSelectedValue_Arguments();

		/**
		 * The meta object literal for the '<em><b>Selected Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_VALUE__SELECTED_VALUES = eINSTANCE.getSelectedValue_SelectedValues();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl <em>Selected Measured Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.SelectedMeasuredValueImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getSelectedMeasuredValue()
		 * @generated
		 */
		EClass SELECTED_MEASURED_VALUE = eINSTANCE.getSelectedMeasuredValue();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.RationaleImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Rationale Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__RATIONALE_DESCRIPTION = eINSTANCE.getRationale_RationaleDescription();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.NameCriterionImpl <em>Name Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.NameCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getNameCriterion()
		 * @generated
		 */
		EClass NAME_CRITERION = eINSTANCE.getNameCriterion();

		/**
		 * The meta object literal for the '<em><b>Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_CRITERION__VALUE_NAME = eINSTANCE.getNameCriterion_ValueName();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.PartOfCriterionImpl <em>Part Of Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.PartOfCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPartOfCriterion()
		 * @generated
		 */
		EClass PART_OF_CRITERION = eINSTANCE.getPartOfCriterion();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.HighestValueCriterionImpl <em>Highest Value Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.HighestValueCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getHighestValueCriterion()
		 * @generated
		 */
		EClass HIGHEST_VALUE_CRITERION = eINSTANCE.getHighestValueCriterion();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.PreferLatestCriterionImpl <em>Prefer Latest Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.PreferLatestCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferLatestCriterion()
		 * @generated
		 */
		EClass PREFER_LATEST_CRITERION = eINSTANCE.getPreferLatestCriterion();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.PreferGeneratedCriterionImpl <em>Prefer Generated Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.PreferGeneratedCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferGeneratedCriterion()
		 * @generated
		 */
		EClass PREFER_GENERATED_CRITERION = eINSTANCE.getPreferGeneratedCriterion();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.selection.impl.PreferAuthorCriterionImpl <em>Prefer Author Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.selection.impl.PreferAuthorCriterionImpl
		 * @see net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl#getPreferAuthorCriterion()
		 * @generated
		 */
		EClass PREFER_AUTHOR_CRITERION = eINSTANCE.getPreferAuthorCriterion();

	}

} //SelectionPackage
