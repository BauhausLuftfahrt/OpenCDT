/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.datatypes.util;

import net.bhl.cdt.model.datatypes.Array;
import net.bhl.cdt.model.datatypes.Cells;
import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.DatatypesPackage;
import net.bhl.cdt.model.datatypes.FloatPointValue;
import net.bhl.cdt.model.datatypes.Formula;
import net.bhl.cdt.model.datatypes.IntegerValue;
import net.bhl.cdt.model.datatypes.LeafValue;
import net.bhl.cdt.model.datatypes.MeasuredValue;
import net.bhl.cdt.model.datatypes.Scalar;
import net.bhl.cdt.model.datatypes.StringValue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.model.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DatatypesPackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = caseNamedElement(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.LEAF_VALUE: {
			LeafValue leafValue = (LeafValue) theEObject;
			T result = caseLeafValue(leafValue);
			if (result == null)
				result = caseDataType(leafValue);
			if (result == null)
				result = caseNamedElement(leafValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.SCALAR: {
			Scalar scalar = (Scalar) theEObject;
			T result = caseScalar(scalar);
			if (result == null)
				result = caseLeafValue(scalar);
			if (result == null)
				result = caseDataType(scalar);
			if (result == null)
				result = caseNamedElement(scalar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.FLOAT_POINT_VALUE: {
			FloatPointValue floatPointValue = (FloatPointValue) theEObject;
			T result = caseFloatPointValue(floatPointValue);
			if (result == null)
				result = caseScalar(floatPointValue);
			if (result == null)
				result = caseLeafValue(floatPointValue);
			if (result == null)
				result = caseDataType(floatPointValue);
			if (result == null)
				result = caseNamedElement(floatPointValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseScalar(integerValue);
			if (result == null)
				result = caseLeafValue(integerValue);
			if (result == null)
				result = caseDataType(integerValue);
			if (result == null)
				result = caseNamedElement(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.STRING_VALUE: {
			StringValue stringValue = (StringValue) theEObject;
			T result = caseStringValue(stringValue);
			if (result == null)
				result = caseLeafValue(stringValue);
			if (result == null)
				result = caseDataType(stringValue);
			if (result == null)
				result = caseNamedElement(stringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.FORMULA: {
			Formula formula = (Formula) theEObject;
			T result = caseFormula(formula);
			if (result == null)
				result = caseStringValue(formula);
			if (result == null)
				result = caseLeafValue(formula);
			if (result == null)
				result = caseDataType(formula);
			if (result == null)
				result = caseNamedElement(formula);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.COMPOSITE_VALUES: {
			CompositeValues compositeValues = (CompositeValues) theEObject;
			T result = caseCompositeValues(compositeValues);
			if (result == null)
				result = caseDataType(compositeValues);
			if (result == null)
				result = caseNamedElement(compositeValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.ARRAY: {
			Array array = (Array) theEObject;
			T result = caseArray(array);
			if (result == null)
				result = caseCompositeValues(array);
			if (result == null)
				result = caseDataType(array);
			if (result == null)
				result = caseNamedElement(array);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.CELLS: {
			Cells cells = (Cells) theEObject;
			T result = caseCells(cells);
			if (result == null)
				result = caseCompositeValues(cells);
			if (result == null)
				result = caseDataType(cells);
			if (result == null)
				result = caseNamedElement(cells);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.MEASURED_VALUE: {
			MeasuredValue measuredValue = (MeasuredValue) theEObject;
			T result = caseMeasuredValue(measuredValue);
			if (result == null)
				result = caseFloatPointValue(measuredValue);
			if (result == null)
				result = caseScalar(measuredValue);
			if (result == null)
				result = caseLeafValue(measuredValue);
			if (result == null)
				result = caseDataType(measuredValue);
			if (result == null)
				result = caseNamedElement(measuredValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Value</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafValue(LeafValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalar(Scalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Point Value</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Point Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatPointValue(FloatPointValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Values</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeValues(CompositeValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cells</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cells</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCells(Cells object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Value</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredValue(MeasuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(net.bhl.cdt.model.NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // DatatypesSwitch
