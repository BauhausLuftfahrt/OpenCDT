/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.system.util;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.Counter;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredParameter;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.QuantityKind;
import net.bhl.cdt.model.system.State;
import net.bhl.cdt.model.system.StringValue;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.system.SystemPackage
 * @generated
 */
public class SystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SystemPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseSystemModelElement(state);
				if (result == null) result = caseGeneratableElement(state);
				if (result == null) result = caseProcessableElement(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseSystemModelElement(value);
				if (result == null) result = caseGeneratableElement(value);
				if (result == null) result = caseProcessableElement(value);
				if (result == null) result = caseNamedElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.SYSTEM_MODEL_ELEMENT: {
				SystemModelElement systemModelElement = (SystemModelElement)theEObject;
				T result = caseSystemModelElement(systemModelElement);
				if (result == null) result = caseGeneratableElement(systemModelElement);
				if (result == null) result = caseProcessableElement(systemModelElement);
				if (result == null) result = caseNamedElement(systemModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.QUANTITY_KIND: {
				QuantityKind quantityKind = (QuantityKind)theEObject;
				T result = caseQuantityKind(quantityKind);
				if (result == null) result = caseSystemModelElement(quantityKind);
				if (result == null) result = caseGeneratableElement(quantityKind);
				if (result == null) result = caseProcessableElement(quantityKind);
				if (result == null) result = caseNamedElement(quantityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.DECIMAL_NUMBER: {
				DecimalNumber decimalNumber = (DecimalNumber)theEObject;
				T result = caseDecimalNumber(decimalNumber);
				if (result == null) result = caseValue(decimalNumber);
				if (result == null) result = caseSystemModelElement(decimalNumber);
				if (result == null) result = caseGeneratableElement(decimalNumber);
				if (result == null) result = caseProcessableElement(decimalNumber);
				if (result == null) result = caseNamedElement(decimalNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseSystemModelElement(parameter);
				if (result == null) result = caseGeneratableElement(parameter);
				if (result == null) result = caseProcessableElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = caseValue(counter);
				if (result == null) result = caseSystemModelElement(counter);
				if (result == null) result = caseGeneratableElement(counter);
				if (result == null) result = caseProcessableElement(counter);
				if (result == null) result = caseNamedElement(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = caseSystemModelElement(stringValue);
				if (result == null) result = caseGeneratableElement(stringValue);
				if (result == null) result = caseProcessableElement(stringValue);
				if (result == null) result = caseNamedElement(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.MEASURED_VALUE: {
				MeasuredValue measuredValue = (MeasuredValue)theEObject;
				T result = caseMeasuredValue(measuredValue);
				if (result == null) result = caseDecimalNumber(measuredValue);
				if (result == null) result = caseValue(measuredValue);
				if (result == null) result = caseSystemModelElement(measuredValue);
				if (result == null) result = caseGeneratableElement(measuredValue);
				if (result == null) result = caseProcessableElement(measuredValue);
				if (result == null) result = caseNamedElement(measuredValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.MEASURED_PARAMETER: {
				MeasuredParameter measuredParameter = (MeasuredParameter)theEObject;
				T result = caseMeasuredParameter(measuredParameter);
				if (result == null) result = caseParameter(measuredParameter);
				if (result == null) result = caseSystemModelElement(measuredParameter);
				if (result == null) result = caseGeneratableElement(measuredParameter);
				if (result == null) result = caseProcessableElement(measuredParameter);
				if (result == null) result = caseNamedElement(measuredParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseSystemModelElement(component);
				if (result == null) result = caseGeneratableElement(component);
				if (result == null) result = caseProcessableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemModelElement(SystemModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityKind(QuantityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Number</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalNumber(DecimalNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measured Parameter</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredParameter(MeasuredParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generatable Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratableElement(GeneratableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processable Element</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessableElement(ProcessableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // SystemSwitch
