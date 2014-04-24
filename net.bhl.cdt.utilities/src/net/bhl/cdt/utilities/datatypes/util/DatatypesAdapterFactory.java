/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.datatypes.util;

import net.bhl.cdt.utilities.datatypes.Array;
import net.bhl.cdt.utilities.datatypes.Cells;
import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.DataType;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;
import net.bhl.cdt.utilities.datatypes.FloatPointValue;
import net.bhl.cdt.utilities.datatypes.Formula;
import net.bhl.cdt.utilities.datatypes.IntegerValue;
import net.bhl.cdt.utilities.datatypes.LeafValue;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.datatypes.Scalar;
import net.bhl.cdt.utilities.datatypes.StringValue;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.utilities.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatatypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
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
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DatatypesSwitch<Adapter> modelSwitch = new DatatypesSwitch<Adapter>() {
		@Override
		public Adapter caseDataType(DataType object) {
			return createDataTypeAdapter();
		}

		@Override
		public Adapter caseLeafValue(LeafValue object) {
			return createLeafValueAdapter();
		}

		@Override
		public Adapter caseScalar(Scalar object) {
			return createScalarAdapter();
		}

		@Override
		public Adapter caseFloatPointValue(FloatPointValue object) {
			return createFloatPointValueAdapter();
		}

		@Override
		public Adapter caseMeasuredValue(MeasuredValue object) {
			return createMeasuredValueAdapter();
		}

		@Override
		public Adapter caseIntegerValue(IntegerValue object) {
			return createIntegerValueAdapter();
		}

		@Override
		public Adapter caseStringValue(StringValue object) {
			return createStringValueAdapter();
		}

		@Override
		public Adapter caseFormula(Formula object) {
			return createFormulaAdapter();
		}

		@Override
		public Adapter caseCompositeValues(CompositeValues object) {
			return createCompositeValuesAdapter();
		}

		@Override
		public Adapter caseArray(Array object) {
			return createArrayAdapter();
		}

		@Override
		public Adapter caseCells(Cells object) {
			return createCellsAdapter();
		}

		@Override
		public Adapter caseExchangeElement(ExchangeElement object) {
			return createExchangeElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.DataType <em>Data Type</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.LeafValue
	 * <em>Leaf Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.LeafValue
	 * @generated
	 */
	public Adapter createLeafValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.Scalar
	 * @generated
	 */
	public Adapter createScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.FloatPointValue
	 * <em>Float Point Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.FloatPointValue
	 * @generated
	 */
	public Adapter createFloatPointValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.MeasuredValue
	 * <em>Measured Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.MeasuredValue
	 * @generated
	 */
	public Adapter createMeasuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.IntegerValue
	 * <em>Integer Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.StringValue
	 * <em>String Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.Formula
	 * @generated
	 */
	public Adapter createFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.CompositeValues
	 * <em>Composite Values</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.CompositeValues
	 * @generated
	 */
	public Adapter createCompositeValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.Array <em>Array</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.datatypes.Cells <em>Cells</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.datatypes.Cells
	 * @generated
	 */
	public Adapter createCellsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement
	 * <em>Exchange Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.exchangemodel.ExchangeElement
	 * @generated
	 */
	public Adapter createExchangeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DatatypesAdapterFactory
