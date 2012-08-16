/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.exchangemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.bhl.cdt.utilities.exchangemodel.ExchangemodelFactory
 * @model kind="package"
 * @generated
 */
public interface ExchangemodelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "exchangemodel";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/utilities/exchangemodel/";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.utilities";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ExchangemodelPackage eINSTANCE = net.bhl.cdt.utilities.exchangemodel.impl.ExchangemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.exchangemodel.impl.ExchangeElementImpl
	 * <em>Exchange Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangeElementImpl
	 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangemodelPackageImpl#getExchangeElement()
	 * @generated
	 */
	int EXCHANGE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Exchange Element</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.utilities.exchangemodel.impl.CompositeImpl <em>Composite</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.utilities.exchangemodel.impl.CompositeImpl
	 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangemodelPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = EXCHANGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containments</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONTAINMENTS = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement
	 * <em>Exchange Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Exchange Element</em>'.
	 * @see net.bhl.cdt.utilities.exchangemodel.ExchangeElement
	 * @generated
	 */
	EClass getExchangeElement();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.utilities.exchangemodel.ExchangeElement#getName()
	 * @see #getExchangeElement()
	 * @generated
	 */
	EAttribute getExchangeElement_Name();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.utilities.exchangemodel.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see net.bhl.cdt.utilities.exchangemodel.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.utilities.exchangemodel.Composite#getContainments <em>Containments</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Containments</em>'.
	 * @see net.bhl.cdt.utilities.exchangemodel.Composite#getContainments()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Containments();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExchangemodelFactory getExchangemodelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.exchangemodel.impl.ExchangeElementImpl
		 * <em>Exchange Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangeElementImpl
		 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangemodelPackageImpl#getExchangeElement()
		 * @generated
		 */
		EClass EXCHANGE_ELEMENT = eINSTANCE.getExchangeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXCHANGE_ELEMENT__NAME = eINSTANCE.getExchangeElement_Name();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.utilities.exchangemodel.impl.CompositeImpl
		 * <em>Composite</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.utilities.exchangemodel.impl.CompositeImpl
		 * @see net.bhl.cdt.utilities.exchangemodel.impl.ExchangemodelPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Containments</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOSITE__CONTAINMENTS = eINSTANCE.getComposite_Containments();

	}

} // ExchangemodelPackage
