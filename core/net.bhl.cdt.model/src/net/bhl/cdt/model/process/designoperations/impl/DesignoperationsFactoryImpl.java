/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.impl;

import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.Calculations;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.Formula;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class DesignoperationsFactoryImpl extends EFactoryImpl implements DesignoperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignoperationsFactory init() {
		try {
			DesignoperationsFactory theDesignoperationsFactory = (DesignoperationsFactory)EPackage.Registry.INSTANCE.getEFactory(DesignoperationsPackage.eNS_URI);
			if (theDesignoperationsFactory != null) {
				return theDesignoperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DesignoperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignoperationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DesignoperationsPackage.FORMULA: return createFormula();
			case DesignoperationsPackage.ASSUMPTION: return createAssumption();
			case DesignoperationsPackage.CALCULATED_DECIMAL_NUMBER: return createCalculatedDecimalNumber();
			case DesignoperationsPackage.CALCULATIONS: return createCalculations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedDecimalNumber createCalculatedDecimalNumber() {
		CalculatedDecimalNumberImpl calculatedDecimalNumber = new CalculatedDecimalNumberImpl();
		return calculatedDecimalNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Calculations createCalculations() {
		CalculationsImpl calculations = new CalculationsImpl();
		return calculations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignoperationsPackage getDesignoperationsPackage() {
		return (DesignoperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DesignoperationsPackage getPackage() {
		return DesignoperationsPackage.eINSTANCE;
	}

} // DesignoperationsFactoryImpl
