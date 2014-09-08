/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.util;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.PartOfCriterion;
import net.bhl.cdt.model.process.selection.PreferAuthorCriterion;
import net.bhl.cdt.model.process.selection.PreferGeneratedCriterion;
import net.bhl.cdt.model.process.selection.PreferLatestCriterion;
import net.bhl.cdt.model.process.selection.Rationale;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredValue;
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
 * @see net.bhl.cdt.model.process.selection.SelectionPackage
 * @generated
 */
public class SelectionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionSwitch() {
		if (modelPackage == null) {
			modelPackage = SelectionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case SelectionPackage.VALUE_SELECTION_ARGUMENT: {
				ValueSelectionArgument valueSelectionArgument = (ValueSelectionArgument)theEObject;
				T result = caseValueSelectionArgument(valueSelectionArgument);
				if (result == null) result = caseRationale(valueSelectionArgument);
				if (result == null) result = caseNamedElement(valueSelectionArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.VALUE_SELECTION_CRITERION: {
				ValueSelectionCriterion valueSelectionCriterion = (ValueSelectionCriterion)theEObject;
				T result = caseValueSelectionCriterion(valueSelectionCriterion);
				if (result == null) result = caseRationale(valueSelectionCriterion);
				if (result == null) result = caseNamedElement(valueSelectionCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.VALUE_SELECTION: {
				ValueSelection valueSelection = (ValueSelection)theEObject;
				T result = caseValueSelection(valueSelection);
				if (result == null) result = caseProcessElement(valueSelection);
				if (result == null) result = caseNamedElement(valueSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.SELECTED_VALUE: {
				SelectedValue selectedValue = (SelectedValue)theEObject;
				T result = caseSelectedValue(selectedValue);
				if (result == null) result = caseValue(selectedValue);
				if (result == null) result = caseProcessElement(selectedValue);
				if (result == null) result = caseSystemModelElement(selectedValue);
				if (result == null) result = caseGeneratableElement(selectedValue);
				if (result == null) result = caseProcessableElement(selectedValue);
				if (result == null) result = caseNamedElement(selectedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.SELECTED_MEASURED_VALUE: {
				SelectedMeasuredValue selectedMeasuredValue = (SelectedMeasuredValue)theEObject;
				T result = caseSelectedMeasuredValue(selectedMeasuredValue);
				if (result == null) result = caseSelectedValue(selectedMeasuredValue);
				if (result == null) result = caseMeasuredValue(selectedMeasuredValue);
				if (result == null) result = caseProcessElement(selectedMeasuredValue);
				if (result == null) result = caseDecimalNumber(selectedMeasuredValue);
				if (result == null) result = caseValue(selectedMeasuredValue);
				if (result == null) result = caseSystemModelElement(selectedMeasuredValue);
				if (result == null) result = caseGeneratableElement(selectedMeasuredValue);
				if (result == null) result = caseProcessableElement(selectedMeasuredValue);
				if (result == null) result = caseNamedElement(selectedMeasuredValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.RATIONALE: {
				Rationale rationale = (Rationale)theEObject;
				T result = caseRationale(rationale);
				if (result == null) result = caseNamedElement(rationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.NAME_CRITERION: {
				NameCriterion nameCriterion = (NameCriterion)theEObject;
				T result = caseNameCriterion(nameCriterion);
				if (result == null) result = caseValueSelectionCriterion(nameCriterion);
				if (result == null) result = caseRationale(nameCriterion);
				if (result == null) result = caseNamedElement(nameCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.PART_OF_CRITERION: {
				PartOfCriterion partOfCriterion = (PartOfCriterion)theEObject;
				T result = casePartOfCriterion(partOfCriterion);
				if (result == null) result = caseValueSelectionCriterion(partOfCriterion);
				if (result == null) result = caseRationale(partOfCriterion);
				if (result == null) result = caseNamedElement(partOfCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.HIGHEST_VALUE_CRITERION: {
				HighestValueCriterion highestValueCriterion = (HighestValueCriterion)theEObject;
				T result = caseHighestValueCriterion(highestValueCriterion);
				if (result == null) result = caseValueSelectionCriterion(highestValueCriterion);
				if (result == null) result = caseRationale(highestValueCriterion);
				if (result == null) result = caseNamedElement(highestValueCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.PREFER_LATEST_CRITERION: {
				PreferLatestCriterion preferLatestCriterion = (PreferLatestCriterion)theEObject;
				T result = casePreferLatestCriterion(preferLatestCriterion);
				if (result == null) result = caseValueSelectionCriterion(preferLatestCriterion);
				if (result == null) result = caseRationale(preferLatestCriterion);
				if (result == null) result = caseNamedElement(preferLatestCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.PREFER_GENERATED_CRITERION: {
				PreferGeneratedCriterion preferGeneratedCriterion = (PreferGeneratedCriterion)theEObject;
				T result = casePreferGeneratedCriterion(preferGeneratedCriterion);
				if (result == null) result = caseValueSelectionCriterion(preferGeneratedCriterion);
				if (result == null) result = caseRationale(preferGeneratedCriterion);
				if (result == null) result = caseNamedElement(preferGeneratedCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectionPackage.PREFER_AUTHOR_CRITERION: {
				PreferAuthorCriterion preferAuthorCriterion = (PreferAuthorCriterion)theEObject;
				T result = casePreferAuthorCriterion(preferAuthorCriterion);
				if (result == null) result = caseValueSelectionCriterion(preferAuthorCriterion);
				if (result == null) result = caseRationale(preferAuthorCriterion);
				if (result == null) result = caseNamedElement(preferAuthorCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Selection Argument</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Selection Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSelectionArgument(ValueSelectionArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Selection Criterion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Selection Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSelectionCriterion(ValueSelectionCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Selection</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSelection(ValueSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Value</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectedValue(SelectedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selected Measured Value</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selected Measured Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectedMeasuredValue(SelectedMeasuredValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Criterion</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameCriterion(NameCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Of Criterion</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Of Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartOfCriterion(PartOfCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highest Value Criterion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highest Value Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighestValueCriterion(HighestValueCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefer Latest Criterion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefer Latest Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferLatestCriterion(PreferLatestCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefer Generated Criterion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefer Generated Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferGeneratedCriterion(PreferGeneratedCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefer Author Criterion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefer Author Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferAuthorCriterion(PreferAuthorCriterion object) {
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

} // SelectionSwitch
