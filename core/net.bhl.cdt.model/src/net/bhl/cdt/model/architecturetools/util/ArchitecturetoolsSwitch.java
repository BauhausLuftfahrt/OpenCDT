/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools.util;

import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.View;
import net.bhl.cdt.model.architecturetools.*;
import net.bhl.cdt.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.model.architecturetools.Massive;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.architecturetools.PowerDemandView;
import net.bhl.cdt.model.architecturetools.RangeInterface;
import net.bhl.cdt.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.model.architecturetools.SFCInterface;
import net.bhl.cdt.model.architecturetools.WettedAreaInterface;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage
 * @generated
 */
public class ArchitecturetoolsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturetoolsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchitecturetoolsPackage.eINSTANCE;
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
			case ArchitecturetoolsPackage.POWER_CONSUMER: {
				PowerConsumer powerConsumer = (PowerConsumer)theEObject;
				T result = casePowerConsumer(powerConsumer);
				if (result == null) result = caseMappableComponentInterface(powerConsumer);
				if (result == null) result = caseComponentInterface(powerConsumer);
				if (result == null) result = caseElement(powerConsumer);
				if (result == null) result = caseExchangeElement(powerConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.POWER_DEMAND_VIEW: {
				PowerDemandView powerDemandView = (PowerDemandView)theEObject;
				T result = casePowerDemandView(powerDemandView);
				if (result == null) result = caseView(powerDemandView);
				if (result == null) result = caseElement(powerDemandView);
				if (result == null) result = caseExchangeElement(powerDemandView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.MASSIVE: {
				Massive massive = (Massive)theEObject;
				T result = caseMassive(massive);
				if (result == null) result = caseMappableComponentInterface(massive);
				if (result == null) result = caseComponentInterface(massive);
				if (result == null) result = caseElement(massive);
				if (result == null) result = caseExchangeElement(massive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE: {
				CoefficientInterface coefficientInterface = (CoefficientInterface)theEObject;
				T result = caseCoefficientInterface(coefficientInterface);
				if (result == null) result = caseMappableComponentInterface(coefficientInterface);
				if (result == null) result = caseComponentInterface(coefficientInterface);
				if (result == null) result = caseElement(coefficientInterface);
				if (result == null) result = caseExchangeElement(coefficientInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE: {
				WettedAreaInterface wettedAreaInterface = (WettedAreaInterface)theEObject;
				T result = caseWettedAreaInterface(wettedAreaInterface);
				if (result == null) result = caseMappableComponentInterface(wettedAreaInterface);
				if (result == null) result = caseComponentInterface(wettedAreaInterface);
				if (result == null) result = caseElement(wettedAreaInterface);
				if (result == null) result = caseExchangeElement(wettedAreaInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE: {
				ReferenceAreaInterface referenceAreaInterface = (ReferenceAreaInterface)theEObject;
				T result = caseReferenceAreaInterface(referenceAreaInterface);
				if (result == null) result = caseMappableComponentInterface(referenceAreaInterface);
				if (result == null) result = caseComponentInterface(referenceAreaInterface);
				if (result == null) result = caseElement(referenceAreaInterface);
				if (result == null) result = caseExchangeElement(referenceAreaInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.ALTITUDE_INTERFACE: {
				AltitudeInterface altitudeInterface = (AltitudeInterface)theEObject;
				T result = caseAltitudeInterface(altitudeInterface);
				if (result == null) result = caseMappableComponentInterface(altitudeInterface);
				if (result == null) result = caseComponentInterface(altitudeInterface);
				if (result == null) result = caseElement(altitudeInterface);
				if (result == null) result = caseExchangeElement(altitudeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.RANGE_INTERFACE: {
				RangeInterface rangeInterface = (RangeInterface)theEObject;
				T result = caseRangeInterface(rangeInterface);
				if (result == null) result = caseMappableComponentInterface(rangeInterface);
				if (result == null) result = caseComponentInterface(rangeInterface);
				if (result == null) result = caseElement(rangeInterface);
				if (result == null) result = caseExchangeElement(rangeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.SFC_INTERFACE: {
				SFCInterface sfcInterface = (SFCInterface)theEObject;
				T result = caseSFCInterface(sfcInterface);
				if (result == null) result = caseMappableComponentInterface(sfcInterface);
				if (result == null) result = caseComponentInterface(sfcInterface);
				if (result == null) result = caseElement(sfcInterface);
				if (result == null) result = caseExchangeElement(sfcInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.DENSITY_INTERFACE: {
				DensityInterface densityInterface = (DensityInterface)theEObject;
				T result = caseDensityInterface(densityInterface);
				if (result == null) result = caseMappableComponentInterface(densityInterface);
				if (result == null) result = caseComponentInterface(densityInterface);
				if (result == null) result = caseElement(densityInterface);
				if (result == null) result = caseExchangeElement(densityInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturetoolsPackage.VELOCITY_INTERFACE: {
				VelocityInterface velocityInterface = (VelocityInterface)theEObject;
				T result = caseVelocityInterface(velocityInterface);
				if (result == null) result = caseMappableComponentInterface(velocityInterface);
				if (result == null) result = caseComponentInterface(velocityInterface);
				if (result == null) result = caseElement(velocityInterface);
				if (result == null) result = caseExchangeElement(velocityInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Consumer</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConsumer(PowerConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Demand View</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Demand View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerDemandView(PowerDemandView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Massive</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Massive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassive(Massive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coefficient Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coefficient Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoefficientInterface(CoefficientInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wetted Area Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wetted Area Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWettedAreaInterface(WettedAreaInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Area Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Area Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceAreaInterface(ReferenceAreaInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Altitude Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Altitude Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltitudeInterface(AltitudeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Interface</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeInterface(RangeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFC Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFC Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFCInterface(SFCInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Density Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Density Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDensityInterface(DensityInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Velocity Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Velocity Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVelocityInterface(VelocityInterface object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInterface(ComponentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mappable Component Interface</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mappable Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappableComponentInterface(MappableComponentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
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

} // ArchitecturetoolsSwitch
