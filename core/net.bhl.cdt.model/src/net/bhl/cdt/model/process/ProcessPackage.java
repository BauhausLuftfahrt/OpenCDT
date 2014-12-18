/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/process";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = net.bhl.cdt.model.process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.impl.ProcessElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.impl.ProcessElementImpl
	 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getProcessElement()
	 * @generated
	 */
	int PROCESS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__BUSY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__TIME_STAMP = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT___START = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT___IS_STARTABLE = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT___GET_STRATEGY__ECLASS = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.impl.DesignOperationImpl <em>Design Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.impl.DesignOperationImpl
	 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getDesignOperation()
	 * @generated
	 */
	int DESIGN_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION__BUSY = PROCESS_ELEMENT__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION__TIME_STAMP = PROCESS_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Superprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION__SUPERPROCESS = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Design Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION___START = PROCESS_ELEMENT___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION___IS_STARTABLE = PROCESS_ELEMENT___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION___GET_STRATEGY__ECLASS = PROCESS_ELEMENT___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Design Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.process.impl.DesignProcessImpl <em>Design Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.impl.DesignProcessImpl
	 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getDesignProcess()
	 * @generated
	 */
	int DESIGN_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS__BUSY = PROCESS_ELEMENT__BUSY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS__TIME_STAMP = PROCESS_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Design Process Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Design Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS___START = PROCESS_ELEMENT___START;

	/**
	 * The operation id for the '<em>Is Startable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS___IS_STARTABLE = PROCESS_ELEMENT___IS_STARTABLE;

	/**
	 * The operation id for the '<em>Get Strategy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS___GET_STRATEGY__ECLASS = PROCESS_ELEMENT___GET_STRATEGY__ECLASS;

	/**
	 * The number of operations of the '<em>Design Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PROCESS_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.DesignOperation <em>Design Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Operation</em>'.
	 * @see net.bhl.cdt.model.process.DesignOperation
	 * @generated
	 */
	EClass getDesignOperation();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.process.DesignOperation#getSuperprocess <em>Superprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superprocess</em>'.
	 * @see net.bhl.cdt.model.process.DesignOperation#getSuperprocess()
	 * @see #getDesignOperation()
	 * @generated
	 */
	EReference getDesignOperation_Superprocess();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.ProcessElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.bhl.cdt.model.process.ProcessElement
	 * @generated
	 */
	EClass getProcessElement();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.process.ProcessElement#isBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy</em>'.
	 * @see net.bhl.cdt.model.process.ProcessElement#isBusy()
	 * @see #getProcessElement()
	 * @generated
	 */
	EAttribute getProcessElement_Busy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.process.ProcessElement#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see net.bhl.cdt.model.process.ProcessElement#getTimeStamp()
	 * @see #getProcessElement()
	 * @generated
	 */
	EAttribute getProcessElement_TimeStamp();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.model.process.ProcessElement#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see net.bhl.cdt.model.process.ProcessElement#start()
	 * @generated
	 */
	EOperation getProcessElement__Start();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.model.process.ProcessElement#isStartable() <em>Is Startable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Startable</em>' operation.
	 * @see net.bhl.cdt.model.process.ProcessElement#isStartable()
	 * @generated
	 */
	EOperation getProcessElement__IsStartable();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.model.process.ProcessElement#getStrategy(org.eclipse.emf.ecore.EClass) <em>Get Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Strategy</em>' operation.
	 * @see net.bhl.cdt.model.process.ProcessElement#getStrategy(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getProcessElement__GetStrategy__EClass();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.process.DesignProcess <em>Design Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Process</em>'.
	 * @see net.bhl.cdt.model.process.DesignProcess
	 * @generated
	 */
	EClass getDesignProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.process.DesignProcess#getDesignProcessElements <em>Design Process Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Process Elements</em>'.
	 * @see net.bhl.cdt.model.process.DesignProcess#getDesignProcessElements()
	 * @see #getDesignProcess()
	 * @generated
	 */
	EReference getDesignProcess_DesignProcessElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.impl.DesignOperationImpl <em>Design Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.impl.DesignOperationImpl
		 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getDesignOperation()
		 * @generated
		 */
		EClass DESIGN_OPERATION = eINSTANCE.getDesignOperation();

		/**
		 * The meta object literal for the '<em><b>Superprocess</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_OPERATION__SUPERPROCESS = eINSTANCE.getDesignOperation_Superprocess();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.impl.ProcessElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.impl.ProcessElementImpl
		 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getProcessElement()
		 * @generated
		 */
		EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

		/**
		 * The meta object literal for the '<em><b>Busy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT__BUSY = eINSTANCE.getProcessElement_Busy();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT__TIME_STAMP = eINSTANCE.getProcessElement_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_ELEMENT___START = eINSTANCE.getProcessElement__Start();

		/**
		 * The meta object literal for the '<em><b>Is Startable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_ELEMENT___IS_STARTABLE = eINSTANCE.getProcessElement__IsStartable();

		/**
		 * The meta object literal for the '<em><b>Get Strategy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_ELEMENT___GET_STRATEGY__ECLASS = eINSTANCE.getProcessElement__GetStrategy__EClass();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.process.impl.DesignProcessImpl <em>Design Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.impl.DesignProcessImpl
		 * @see net.bhl.cdt.model.process.impl.ProcessPackageImpl#getDesignProcess()
		 * @generated
		 */
		EClass DESIGN_PROCESS = eINSTANCE.getDesignProcess();

		/**
		 * The meta object literal for the '<em><b>Design Process Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS = eINSTANCE.getDesignProcess_DesignProcessElements();

	}

} //ProcessPackage
