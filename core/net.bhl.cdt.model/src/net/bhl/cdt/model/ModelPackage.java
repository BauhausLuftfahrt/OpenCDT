/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.bhl.cdt.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = net.bhl.cdt.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.OperationWithInput <em>Operation With Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.OperationWithInput
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationWithInput()
	 * @generated
	 */
	int OPERATION_WITH_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Processed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_INPUT__PROCESSED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Operation With Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation With Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.OperationWithOutput <em>Operation With Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.OperationWithOutput
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationWithOutput()
	 * @generated
	 */
	int OPERATION_WITH_OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Generated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Operation With Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation With Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITH_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.GeneratableElement <em>Generatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.GeneratableElement
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getGeneratableElement()
	 * @generated
	 */
	int GENERATABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Source Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATABLE_ELEMENT__SOURCE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Generatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.ProcessableElement <em>Processable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.ProcessableElement
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getProcessableElement()
	 * @generated
	 */
	int PROCESSABLE_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Processable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Processable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.impl.NamedElementImpl
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getURL()
	 * @generated
	 */
	int URL = 5;

	/**
	 * The meta object id for the '<em>Operation Strategy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.process.OperationStrategy
	 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationStrategy()
	 * @generated
	 */
	int OPERATION_STRATEGY = 6;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.OperationWithInput <em>Operation With Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation With Input</em>'.
	 * @see net.bhl.cdt.model.OperationWithInput
	 * @generated
	 */
	EClass getOperationWithInput();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.OperationWithInput#getProcessedElements <em>Processed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processed Elements</em>'.
	 * @see net.bhl.cdt.model.OperationWithInput#getProcessedElements()
	 * @see #getOperationWithInput()
	 * @generated
	 */
	EReference getOperationWithInput_ProcessedElements();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.OperationWithOutput <em>Operation With Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation With Output</em>'.
	 * @see net.bhl.cdt.model.OperationWithOutput
	 * @generated
	 */
	EClass getOperationWithOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.OperationWithOutput#getGeneratedElements <em>Generated Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Elements</em>'.
	 * @see net.bhl.cdt.model.OperationWithOutput#getGeneratedElements()
	 * @see #getOperationWithOutput()
	 * @generated
	 */
	EReference getOperationWithOutput_GeneratedElements();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.GeneratableElement <em>Generatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generatable Element</em>'.
	 * @see net.bhl.cdt.model.GeneratableElement
	 * @generated
	 */
	EClass getGeneratableElement();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.GeneratableElement#getSourceOperation <em>Source Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Operation</em>'.
	 * @see net.bhl.cdt.model.GeneratableElement#getSourceOperation()
	 * @see #getGeneratableElement()
	 * @generated
	 */
	EReference getGeneratableElement_SourceOperation();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.ProcessableElement <em>Processable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processable Element</em>'.
	 * @see net.bhl.cdt.model.ProcessableElement
	 * @generated
	 */
	EClass getProcessableElement();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see net.bhl.cdt.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link net.bhl.cdt.model.process.OperationStrategy <em>Operation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Strategy</em>'.
	 * @see net.bhl.cdt.model.process.OperationStrategy
	 * @model instanceClass="net.bhl.cdt.model.process.OperationStrategy"
	 * @generated
	 */
	EDataType getOperationStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.OperationWithInput <em>Operation With Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.OperationWithInput
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationWithInput()
		 * @generated
		 */
		EClass OPERATION_WITH_INPUT = eINSTANCE.getOperationWithInput();

		/**
		 * The meta object literal for the '<em><b>Processed Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_WITH_INPUT__PROCESSED_ELEMENTS = eINSTANCE.getOperationWithInput_ProcessedElements();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.OperationWithOutput <em>Operation With Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.OperationWithOutput
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationWithOutput()
		 * @generated
		 */
		EClass OPERATION_WITH_OUTPUT = eINSTANCE.getOperationWithOutput();

		/**
		 * The meta object literal for the '<em><b>Generated Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS = eINSTANCE.getOperationWithOutput_GeneratedElements();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.GeneratableElement <em>Generatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.GeneratableElement
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getGeneratableElement()
		 * @generated
		 */
		EClass GENERATABLE_ELEMENT = eINSTANCE.getGeneratableElement();

		/**
		 * The meta object literal for the '<em><b>Source Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATABLE_ELEMENT__SOURCE_OPERATION = eINSTANCE.getGeneratableElement_SourceOperation();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.ProcessableElement <em>Processable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.ProcessableElement
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getProcessableElement()
		 * @generated
		 */
		EClass PROCESSABLE_ELEMENT = eINSTANCE.getProcessableElement();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.impl.NamedElementImpl
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>Operation Strategy</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.process.OperationStrategy
		 * @see net.bhl.cdt.model.impl.ModelPackageImpl#getOperationStrategy()
		 * @generated
		 */
		EDataType OPERATION_STRATEGY = eINSTANCE.getOperationStrategy();

	}

} // ModelPackage
