/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.datatypes.impl;

import net.bhl.cdt.utilities.datatypes.Array;
import net.bhl.cdt.utilities.datatypes.Cells;
import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;
import net.bhl.cdt.utilities.datatypes.FloatPointValue;
import net.bhl.cdt.utilities.datatypes.Formula;
import net.bhl.cdt.utilities.datatypes.IntegerValue;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.datatypes.StringValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesPackage.eNS_URI);
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.FLOAT_POINT_VALUE: return createFloatPointValue();
			case DatatypesPackage.MEASURED_VALUE: return createMeasuredValue();
			case DatatypesPackage.INTEGER_VALUE: return createIntegerValue();
			case DatatypesPackage.STRING_VALUE: return createStringValue();
			case DatatypesPackage.FORMULA: return createFormula();
			case DatatypesPackage.COMPOSITE_VALUES: return createCompositeValues();
			case DatatypesPackage.ARRAY: return createArray();
			case DatatypesPackage.CELLS: return createCells();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FloatPointValue createFloatPointValue() {
		FloatPointValueImpl floatPointValue = new FloatPointValueImpl();
		return floatPointValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredValue createMeasuredValue() {
		MeasuredValueImpl measuredValue = new MeasuredValueImpl();
		return measuredValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Formula createFormula() {
		FormulaImpl formula = new FormulaImpl();
		return formula;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValues createCompositeValues() {
		CompositeValuesImpl compositeValues = new CompositeValuesImpl();
		return compositeValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cells createCells() {
		CellsImpl cells = new CellsImpl();
		return cells;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} // DatatypesFactoryImpl
