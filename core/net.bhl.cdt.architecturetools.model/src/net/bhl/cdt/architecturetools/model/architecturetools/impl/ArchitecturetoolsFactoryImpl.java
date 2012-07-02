/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.model.architecturetools.impl;

import net.bhl.cdt.architecturetools.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.architecturetools.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.architecturetools.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.architecturetools.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.architecturetools.model.architecturetools.Massive;
import net.bhl.cdt.architecturetools.model.architecturetools.PowerConsumer;
import net.bhl.cdt.architecturetools.model.architecturetools.PowerDemandView;
import net.bhl.cdt.architecturetools.model.architecturetools.RangeInterface;
import net.bhl.cdt.architecturetools.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.architecturetools.model.architecturetools.SFCInterface;
import net.bhl.cdt.architecturetools.model.architecturetools.WettedAreaInterface;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ArchitecturetoolsFactoryImpl extends EFactoryImpl implements
		ArchitecturetoolsFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ArchitecturetoolsFactory init() {
		try {
			ArchitecturetoolsFactory theArchitecturetoolsFactory = (ArchitecturetoolsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://bhl.net/cdt/model/architecturetools");
			if (theArchitecturetoolsFactory != null) {
				return theArchitecturetoolsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitecturetoolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ArchitecturetoolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArchitecturetoolsPackage.POWER_CONSUMER:
			return createPowerConsumer();
		case ArchitecturetoolsPackage.POWER_DEMAND_VIEW:
			return createPowerDemandView();
		case ArchitecturetoolsPackage.MASSIVE:
			return createMassive();
		case ArchitecturetoolsPackage.COEFFICIENT_INTERFACE:
			return createCoefficientInterface();
		case ArchitecturetoolsPackage.WETTED_AREA_INTERFACE:
			return createWettedAreaInterface();
		case ArchitecturetoolsPackage.REFERENCE_AREA_INTERFACE:
			return createReferenceAreaInterface();
		case ArchitecturetoolsPackage.ALTITUDE_INTERFACE:
			return createAltitudeInterface();
		case ArchitecturetoolsPackage.RANGE_INTERFACE:
			return createRangeInterface();
		case ArchitecturetoolsPackage.SFC_INTERFACE:
			return createSFCInterface();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PowerConsumer createPowerConsumer() {
		PowerConsumerImpl powerConsumer = new PowerConsumerImpl();
		return powerConsumer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PowerDemandView createPowerDemandView() {
		PowerDemandViewImpl powerDemandView = new PowerDemandViewImpl();
		return powerDemandView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Massive createMassive() {
		MassiveImpl massive = new MassiveImpl();
		return massive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoefficientInterface createCoefficientInterface() {
		CoefficientInterfaceImpl coefficientInterface = new CoefficientInterfaceImpl();
		return coefficientInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WettedAreaInterface createWettedAreaInterface() {
		WettedAreaInterfaceImpl wettedAreaInterface = new WettedAreaInterfaceImpl();
		return wettedAreaInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReferenceAreaInterface createReferenceAreaInterface() {
		ReferenceAreaInterfaceImpl referenceAreaInterface = new ReferenceAreaInterfaceImpl();
		return referenceAreaInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AltitudeInterface createAltitudeInterface() {
		AltitudeInterfaceImpl altitudeInterface = new AltitudeInterfaceImpl();
		return altitudeInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RangeInterface createRangeInterface() {
		RangeInterfaceImpl rangeInterface = new RangeInterfaceImpl();
		return rangeInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SFCInterface createSFCInterface() {
		SFCInterfaceImpl sfcInterface = new SFCInterfaceImpl();
		return sfcInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArchitecturetoolsPackage getArchitecturetoolsPackage() {
		return (ArchitecturetoolsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturetoolsPackage getPackage() {
		return ArchitecturetoolsPackage.eINSTANCE;
	}

} // ArchitecturetoolsFactoryImpl
