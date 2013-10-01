/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions.impl;

import net.bhl.cdt.calculationrepository.functions.CalculationRepository;
import net.bhl.cdt.calculationrepository.functions.FunctionsFactory;
import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class FunctionsFactoryImpl extends EFactoryImpl implements FunctionsFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FunctionsFactory init() {
		try {
			FunctionsFactory theFunctionsFactory = (FunctionsFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://bhl.net/cdt/calculationrepository/functions");
			if (theFunctionsFactory != null) {
				return theFunctionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionsFactoryImpl() {
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
		case FunctionsPackage.SCILAB_FUNCTION:
			return createScilabFunction();
		case FunctionsPackage.CALCULATION_REPOSITORY:
			return createCalculationRepository();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScilabFunction createScilabFunction() {
		ScilabFunctionImpl scilabFunction = new ScilabFunctionImpl();
		return scilabFunction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalculationRepository createCalculationRepository() {
		CalculationRepositoryImpl calculationRepository = new CalculationRepositoryImpl();
		return calculationRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionsPackage getFunctionsPackage() {
		return (FunctionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionsPackage getPackage() {
		return FunctionsPackage.eINSTANCE;
	}

} // FunctionsFactoryImpl
