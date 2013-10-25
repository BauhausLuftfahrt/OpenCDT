/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.datatypes;

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
 * 
 * @see net.bhl.cdt.utilities.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/utilities/datatypes/";

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
	DatatypesPackage eINSTANCE = net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.DataTypeImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = ExchangemodelPackage.EXCHANGE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ExchangemodelPackage.EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.LeafValueImpl <em>Leaf Value</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.LeafValueImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getLeafValue()
	 * @generated
	 */
	int LEAF_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_VALUE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Leaf Value</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LEAF_VALUE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.ScalarImpl <em>Scalar</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.ScalarImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getScalar()
	 * @generated
	 */
	int SCALAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALAR__NAME = LEAF_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Scalar</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALAR_FEATURE_COUNT = LEAF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.FloatPointValueImpl
	 * <em>Float Point Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.FloatPointValueImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getFloatPointValue()
	 * @generated
	 */
	int FLOAT_POINT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLOAT_POINT_VALUE__NAME = SCALAR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLOAT_POINT_VALUE__VALUE = SCALAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Point Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLOAT_POINT_VALUE_FEATURE_COUNT = SCALAR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.MeasuredValueImpl
	 * <em>Measured Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.MeasuredValueImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getMeasuredValue()
	 * @generated
	 */
	int MEASURED_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEASURED_VALUE__NAME = FLOAT_POINT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEASURED_VALUE__VALUE = FLOAT_POINT_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEASURED_VALUE__UNIT = FLOAT_POINT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measured Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEASURED_VALUE_FEATURE_COUNT = FLOAT_POINT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.IntegerValueImpl <em>Integer Value</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.IntegerValueImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__NAME = SCALAR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = SCALAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = SCALAR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.StringValueImpl <em>String Value</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.StringValueImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__NAME = LEAF_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = LEAF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = LEAF_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.FormulaImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULA__NAME = STRING_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULA__VALUE = STRING_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Formula</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = STRING_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.CompositeValuesImpl
	 * <em>Composite Values</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.CompositeValuesImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getCompositeValues()
	 * @generated
	 */
	int COMPOSITE_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUES__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUES__DATATYPES = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Values</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUES_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.ArrayImpl <em>Array</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.ArrayImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = COMPOSITE_VALUES__NAME;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY__DATATYPES = COMPOSITE_VALUES__DATATYPES;

	/**
	 * The number of structural features of the '<em>Array</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = COMPOSITE_VALUES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.datatypes.impl.CellsImpl <em>Cells</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.datatypes.impl.CellsImpl
	 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getCells()
	 * @generated
	 */
	int CELLS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CELLS__NAME = COMPOSITE_VALUES__NAME;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CELLS__DATATYPES = COMPOSITE_VALUES__DATATYPES;

	/**
	 * The number of structural features of the '<em>Cells</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CELLS_FEATURE_COUNT = COMPOSITE_VALUES_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.DataType <em>Data Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.LeafValue <em>Leaf Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Leaf Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.LeafValue
	 * @generated
	 */
	EClass getLeafValue();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.Scalar <em>Scalar</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scalar</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.Scalar
	 * @generated
	 */
	EClass getScalar();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.FloatPointValue
	 * <em>Float Point Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Float Point Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.FloatPointValue
	 * @generated
	 */
	EClass getFloatPointValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.utilities.datatypes.FloatPointValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.FloatPointValue#getValue()
	 * @see #getFloatPointValue()
	 * @generated
	 */
	EAttribute getFloatPointValue_Value();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.MeasuredValue <em>Measured Value</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Measured Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.MeasuredValue
	 * @generated
	 */
	EClass getMeasuredValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.utilities.datatypes.MeasuredValue#getUnit
	 * <em>Unit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.MeasuredValue#getUnit()
	 * @see #getMeasuredValue()
	 * @generated
	 */
	EAttribute getMeasuredValue_Unit();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.utilities.datatypes.IntegerValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.utilities.datatypes.StringValue#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.Formula <em>Formula</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.CompositeValues
	 * <em>Composite Values</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Composite Values</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.CompositeValues
	 * @generated
	 */
	EClass getCompositeValues();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.utilities.datatypes.CompositeValues#getDatatypes <em>Datatypes</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.CompositeValues#getDatatypes()
	 * @see #getCompositeValues()
	 * @generated
	 */
	EReference getCompositeValues_Datatypes();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.Array <em>Array</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Array</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.datatypes.Cells <em>Cells</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Cells</em>'.
	 * @see net.bhl.cdt.utilities.datatypes.Cells
	 * @generated
	 */
	EClass getCells();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.DataTypeImpl <em>Data Type</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.DataTypeImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.LeafValueImpl
		 * <em>Leaf Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.LeafValueImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getLeafValue()
		 * @generated
		 */
		EClass LEAF_VALUE = eINSTANCE.getLeafValue();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.ScalarImpl <em>Scalar</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.ScalarImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getScalar()
		 * @generated
		 */
		EClass SCALAR = eINSTANCE.getScalar();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.FloatPointValueImpl
		 * <em>Float Point Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.FloatPointValueImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getFloatPointValue()
		 * @generated
		 */
		EClass FLOAT_POINT_VALUE = eINSTANCE.getFloatPointValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FLOAT_POINT_VALUE__VALUE = eINSTANCE.getFloatPointValue_Value();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.MeasuredValueImpl
		 * <em>Measured Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.MeasuredValueImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getMeasuredValue()
		 * @generated
		 */
		EClass MEASURED_VALUE = eINSTANCE.getMeasuredValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEASURED_VALUE__UNIT = eINSTANCE.getMeasuredValue_Unit();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.IntegerValueImpl
		 * <em>Integer Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.IntegerValueImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.StringValueImpl
		 * <em>String Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.StringValueImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.FormulaImpl <em>Formula</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.FormulaImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.CompositeValuesImpl
		 * <em>Composite Values</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.CompositeValuesImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getCompositeValues()
		 * @generated
		 */
		EClass COMPOSITE_VALUES = eINSTANCE.getCompositeValues();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOSITE_VALUES__DATATYPES = eINSTANCE.getCompositeValues_Datatypes();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.ArrayImpl <em>Array</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.ArrayImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.datatypes.impl.CellsImpl <em>Cells</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.datatypes.impl.CellsImpl
		 * @see net.bhl.cdt.utilities.datatypes.impl.DatatypesPackageImpl#getCells()
		 * @generated
		 */
		EClass CELLS = eINSTANCE.getCells();

	}

} // DatatypesPackage
