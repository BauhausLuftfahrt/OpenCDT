/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.qualification.util;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.qualification.BehaviouralQualifier;
import net.bhl.cdt.model.qualification.BehaviouralSpace;
import net.bhl.cdt.model.qualification.CalculationSpace;
import net.bhl.cdt.model.qualification.CalculationSpaceQualifier;
import net.bhl.cdt.model.qualification.Qualifiable;
import net.bhl.cdt.model.qualification.QualificationPackage;
import net.bhl.cdt.model.qualification.Qualifier;
import net.bhl.cdt.model.qualification.QualifyingSpace;
import net.bhl.cdt.model.qualification.Sequence;
import net.bhl.cdt.model.qualification.State;
import net.bhl.cdt.model.qualification.Transition;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.model.qualification.QualificationPackage
 * @generated
 */
public class QualificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static QualificationPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QualificationSwitch() {
		if (modelPackage == null) {
			modelPackage = QualificationPackage.eINSTANCE;
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
		case QualificationPackage.QUALIFIER: {
			Qualifier qualifier = (Qualifier) theEObject;
			T result = caseQualifier(qualifier);
			if (result == null)
				result = caseElement(qualifier);
			if (result == null)
				result = caseExchangeElement(qualifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.QUALIFYING_SPACE: {
			QualifyingSpace qualifyingSpace = (QualifyingSpace) theEObject;
			T result = caseQualifyingSpace(qualifyingSpace);
			if (result == null)
				result = caseElement(qualifyingSpace);
			if (result == null)
				result = caseExchangeElement(qualifyingSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.QUALIFIABLE: {
			Qualifiable qualifiable = (Qualifiable) theEObject;
			T result = caseQualifiable(qualifiable);
			if (result == null)
				result = caseElement(qualifiable);
			if (result == null)
				result = caseExchangeElement(qualifiable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.CALCULATION_SPACE: {
			CalculationSpace calculationSpace = (CalculationSpace) theEObject;
			T result = caseCalculationSpace(calculationSpace);
			if (result == null)
				result = caseQualifyingSpace(calculationSpace);
			if (result == null)
				result = caseElement(calculationSpace);
			if (result == null)
				result = caseExchangeElement(calculationSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.CALCULATION_SPACE_QUALIFIER: {
			CalculationSpaceQualifier calculationSpaceQualifier = (CalculationSpaceQualifier) theEObject;
			T result = caseCalculationSpaceQualifier(calculationSpaceQualifier);
			if (result == null)
				result = caseQualifier(calculationSpaceQualifier);
			if (result == null)
				result = caseElement(calculationSpaceQualifier);
			if (result == null)
				result = caseExchangeElement(calculationSpaceQualifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.BEHAVIOURAL_SPACE: {
			BehaviouralSpace behaviouralSpace = (BehaviouralSpace) theEObject;
			T result = caseBehaviouralSpace(behaviouralSpace);
			if (result == null)
				result = caseQualifyingSpace(behaviouralSpace);
			if (result == null)
				result = caseElement(behaviouralSpace);
			if (result == null)
				result = caseExchangeElement(behaviouralSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.BEHAVIOURAL_QUALIFIER: {
			BehaviouralQualifier behaviouralQualifier = (BehaviouralQualifier) theEObject;
			T result = caseBehaviouralQualifier(behaviouralQualifier);
			if (result == null)
				result = caseQualifier(behaviouralQualifier);
			if (result == null)
				result = caseElement(behaviouralQualifier);
			if (result == null)
				result = caseExchangeElement(behaviouralQualifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.PROCESS: {
			net.bhl.cdt.model.qualification.Process process = (net.bhl.cdt.model.qualification.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseBehaviouralQualifier(process);
			if (result == null)
				result = caseQualifier(process);
			if (result == null)
				result = caseElement(process);
			if (result == null)
				result = caseExchangeElement(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseBehaviouralQualifier(state);
			if (result == null)
				result = caseQualifier(state);
			if (result == null)
				result = caseElement(state);
			if (result == null)
				result = caseExchangeElement(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.SEQUENCE: {
			Sequence sequence = (Sequence) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = caseProcess(sequence);
			if (result == null)
				result = caseBehaviouralQualifier(sequence);
			if (result == null)
				result = caseQualifier(sequence);
			if (result == null)
				result = caseElement(sequence);
			if (result == null)
				result = caseExchangeElement(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QualificationPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseProcess(transition);
			if (result == null)
				result = caseBehaviouralQualifier(transition);
			if (result == null)
				result = caseQualifier(transition);
			if (result == null)
				result = caseElement(transition);
			if (result == null)
				result = caseExchangeElement(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifier(Qualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifying Space</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifying Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifyingSpace(QualifyingSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifiable</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiable(Qualifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation Space</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationSpace(CalculationSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation Space Qualifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation Space Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationSpaceQualifier(CalculationSpaceQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Space</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralSpace(BehaviouralSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Qualifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralQualifier(BehaviouralQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(net.bhl.cdt.model.qualification.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Element</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeElement(ExchangeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
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

} // QualificationSwitch
