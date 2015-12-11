/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.util;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.CalculatedValue;
import net.bhl.cdt.model.process.designoperations.Calculations;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.DisciplineTool;
import net.bhl.cdt.model.process.designoperations.DisciplineToolService;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.process.designoperations.LocalDisciplineTool;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage
 * @generated
 */
public class DesignoperationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static DesignoperationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignoperationsSwitch() {
		if (modelPackage == null) {
			modelPackage = DesignoperationsPackage.eINSTANCE;
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
			case DesignoperationsPackage.DISCIPLINE_TOOL: {
				DisciplineTool disciplineTool = (DisciplineTool)theEObject;
				T result = caseDisciplineTool(disciplineTool);
				if (result == null) result = caseDesignProcess(disciplineTool);
				if (result == null) result = caseProcessElement(disciplineTool);
				if (result == null) result = caseNamedElement(disciplineTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.FORMULA: {
				Formula formula = (Formula)theEObject;
				T result = caseFormula(formula);
				if (result == null) result = caseOperationWithInput(formula);
				if (result == null) result = caseOperationWithOutput(formula);
				if (result == null) result = caseDesignOperation(formula);
				if (result == null) result = caseProcessElement(formula);
				if (result == null) result = caseNamedElement(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseDesignOperation(assumption);
				if (result == null) result = caseOperationWithOutput(assumption);
				if (result == null) result = caseProcessElement(assumption);
				if (result == null) result = caseNamedElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.DISCIPLINE_TOOL_SERVICE: {
				DisciplineToolService disciplineToolService = (DisciplineToolService)theEObject;
				T result = caseDisciplineToolService(disciplineToolService);
				if (result == null) result = caseDisciplineTool(disciplineToolService);
				if (result == null) result = caseDesignProcess(disciplineToolService);
				if (result == null) result = caseProcessElement(disciplineToolService);
				if (result == null) result = caseNamedElement(disciplineToolService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.LOCAL_DISCIPLINE_TOOL: {
				LocalDisciplineTool localDisciplineTool = (LocalDisciplineTool)theEObject;
				T result = caseLocalDisciplineTool(localDisciplineTool);
				if (result == null) result = caseDisciplineTool(localDisciplineTool);
				if (result == null) result = caseDesignProcess(localDisciplineTool);
				if (result == null) result = caseProcessElement(localDisciplineTool);
				if (result == null) result = caseNamedElement(localDisciplineTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.CALCULATED_VALUE: {
				CalculatedValue calculatedValue = (CalculatedValue)theEObject;
				T result = caseCalculatedValue(calculatedValue);
				if (result == null) result = caseDesignOperation(calculatedValue);
				if (result == null) result = caseValue(calculatedValue);
				if (result == null) result = caseOperationWithInput(calculatedValue);
				if (result == null) result = caseProcessElement(calculatedValue);
				if (result == null) result = caseSystemModelElement(calculatedValue);
				if (result == null) result = caseNamedElement(calculatedValue);
				if (result == null) result = caseGeneratableElement(calculatedValue);
				if (result == null) result = caseProcessableElement(calculatedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.CALCULATED_DECIMAL_NUMBER: {
				CalculatedDecimalNumber calculatedDecimalNumber = (CalculatedDecimalNumber)theEObject;
				T result = caseCalculatedDecimalNumber(calculatedDecimalNumber);
				if (result == null) result = caseCalculatedValue(calculatedDecimalNumber);
				if (result == null) result = caseDecimalNumber(calculatedDecimalNumber);
				if (result == null) result = caseDesignOperation(calculatedDecimalNumber);
				if (result == null) result = caseValue(calculatedDecimalNumber);
				if (result == null) result = caseOperationWithInput(calculatedDecimalNumber);
				if (result == null) result = caseProcessElement(calculatedDecimalNumber);
				if (result == null) result = caseSystemModelElement(calculatedDecimalNumber);
				if (result == null) result = caseNamedElement(calculatedDecimalNumber);
				if (result == null) result = caseGeneratableElement(calculatedDecimalNumber);
				if (result == null) result = caseProcessableElement(calculatedDecimalNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignoperationsPackage.CALCULATIONS: {
				Calculations calculations = (Calculations)theEObject;
				T result = caseCalculations(calculations);
				if (result == null) result = caseDesignProcess(calculations);
				if (result == null) result = caseProcessElement(calculations);
				if (result == null) result = caseNamedElement(calculations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Tool</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplineTool(DisciplineTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Tool Service</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Tool Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplineToolService(DisciplineToolService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Discipline Tool</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Discipline Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalDisciplineTool(LocalDisciplineTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Value</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValue(CalculatedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Decimal Number</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Decimal Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedDecimalNumber(CalculatedDecimalNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculations(Calculations object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Process</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignProcess(DesignProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Operation</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignOperation(DesignOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation With Input</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation With Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationWithInput(OperationWithInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation With Output</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation With Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationWithOutput(OperationWithOutput object) {
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

} // DesignoperationsSwitch
