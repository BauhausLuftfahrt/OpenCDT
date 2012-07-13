/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.architecturetools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage
 * @generated
 */
public interface ArchitecturetoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturetoolsFactory eINSTANCE = net.bhl.cdt.model.architecturetools.impl.ArchitecturetoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Power Consumer</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Consumer</em>'.
	 * @generated
	 */
	PowerConsumer createPowerConsumer();

	/**
	 * Returns a new object of class '<em>Power Demand View</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Demand View</em>'.
	 * @generated
	 */
	PowerDemandView createPowerDemandView();

	/**
	 * Returns a new object of class '<em>Massive</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Massive</em>'.
	 * @generated
	 */
	Massive createMassive();

	/**
	 * Returns a new object of class '<em>Coefficient Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Coefficient Interface</em>'.
	 * @generated
	 */
	CoefficientInterface createCoefficientInterface();

	/**
	 * Returns a new object of class '<em>Wetted Area Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Wetted Area Interface</em>'.
	 * @generated
	 */
	WettedAreaInterface createWettedAreaInterface();

	/**
	 * Returns a new object of class '<em>Reference Area Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Area Interface</em>'.
	 * @generated
	 */
	ReferenceAreaInterface createReferenceAreaInterface();

	/**
	 * Returns a new object of class '<em>Altitude Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Altitude Interface</em>'.
	 * @generated
	 */
	AltitudeInterface createAltitudeInterface();

	/**
	 * Returns a new object of class '<em>Range Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Interface</em>'.
	 * @generated
	 */
	RangeInterface createRangeInterface();

	/**
	 * Returns a new object of class '<em>SFC Interface</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SFC Interface</em>'.
	 * @generated
	 */
	SFCInterface createSFCInterface();

	/**
	 * Returns a new object of class '<em>Density Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Density Interface</em>'.
	 * @generated
	 */
	DensityInterface createDensityInterface();

	/**
	 * Returns a new object of class '<em>Velocity Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Velocity Interface</em>'.
	 * @generated
	 */
	VelocityInterface createVelocityInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitecturetoolsPackage getArchitecturetoolsPackage();

} // ArchitecturetoolsFactory
