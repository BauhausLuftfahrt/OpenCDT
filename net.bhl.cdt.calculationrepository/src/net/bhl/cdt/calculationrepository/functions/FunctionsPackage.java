/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.calculationrepository.functions;

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
 * @see net.bhl.cdt.calculationrepository.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/calculationrepository/functions";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.calculationrepository";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	FunctionsPackage eINSTANCE = net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl
	 * <em>Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl
	 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Function ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Input Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUT_DESCRIPTORS = 1;

	/**
	 * The feature id for the '<em><b>Output Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT_DESCRIPTORS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Synopsis</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SYNOPSIS = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.calculationrepository.functions.impl.CalculationScriptImpl
	 * <em>Calculation Script</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.calculationrepository.functions.impl.CalculationScriptImpl
	 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getCalculationScript()
	 * @generated
	 */
	int CALCULATION_SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Function ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__FUNCTION_ID = FUNCTION__FUNCTION_ID;

	/**
	 * The feature id for the '<em><b>Input Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__INPUT_DESCRIPTORS = FUNCTION__INPUT_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Output Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__OUTPUT_DESCRIPTORS = FUNCTION__OUTPUT_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Synopsis</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__SYNOPSIS = FUNCTION__SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Script Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT__SCRIPT_TEXT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculation Script</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_SCRIPT_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl
	 * <em>Scilab Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl
	 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getScilabFunction()
	 * @generated
	 */
	int SCILAB_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Function ID</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__FUNCTION_ID = CALCULATION_SCRIPT__FUNCTION_ID;

	/**
	 * The feature id for the '<em><b>Input Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__INPUT_DESCRIPTORS = CALCULATION_SCRIPT__INPUT_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Output Descriptors</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__OUTPUT_DESCRIPTORS = CALCULATION_SCRIPT__OUTPUT_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__NAME = CALCULATION_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Synopsis</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__SYNOPSIS = CALCULATION_SCRIPT__SYNOPSIS;

	/**
	 * The feature id for the '<em><b>Script Text</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__SCRIPT_TEXT = CALCULATION_SCRIPT__SCRIPT_TEXT;

	/**
	 * The feature id for the '<em><b>Function Definition</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__FUNCTION_DEFINITION = CALCULATION_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Body</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__FUNCTION_BODY = CALCULATION_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Call</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__FUNCTION_CALL = CALCULATION_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Return</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION__FUNCTION_RETURN = CALCULATION_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scilab Function</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCILAB_FUNCTION_FEATURE_COUNT = CALCULATION_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.calculationrepository.functions.impl.CalculationRepositoryImpl
	 * <em>Calculation Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.bhl.cdt.calculationrepository.functions.impl.CalculationRepositoryImpl
	 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getCalculationRepository()
	 * @generated
	 */
	int CALCULATION_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_REPOSITORY__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Calculation Repository</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALCULATION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.calculationrepository.functions.Function <em>Function</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.Function#getFunctionID <em>Function ID</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Function ID</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function#getFunctionID()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_FunctionID();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.calculationrepository.functions.Function#getInputDescriptors <em>Input Descriptors</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Input Descriptors</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function#getInputDescriptors()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_InputDescriptors();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.calculationrepository.functions.Function#getOutputDescriptors <em>Output Descriptors</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Output Descriptors</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function#getOutputDescriptors()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_OutputDescriptors();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.calculationrepository.functions.Function#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.Function#getSynopsis <em>Synopsis</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Synopsis</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.Function#getSynopsis()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Synopsis();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.calculationrepository.functions.CalculationScript
	 * <em>Calculation Script</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Calculation Script</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.CalculationScript
	 * @generated
	 */
	EClass getCalculationScript();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.CalculationScript#getScriptText <em>Script Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Script Text</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.CalculationScript#getScriptText()
	 * @see #getCalculationScript()
	 * @generated
	 */
	EAttribute getCalculationScript_ScriptText();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.calculationrepository.functions.ScilabFunction
	 * <em>Scilab Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scilab Function</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.ScilabFunction
	 * @generated
	 */
	EClass getScilabFunction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionDefinition
	 * <em>Function Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Function Definition</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionDefinition()
	 * @see #getScilabFunction()
	 * @generated
	 */
	EAttribute getScilabFunction_FunctionDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionBody <em>Function Body</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Function Body</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionBody()
	 * @see #getScilabFunction()
	 * @generated
	 */
	EAttribute getScilabFunction_FunctionBody();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionCall <em>Function Call</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Function Call</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionCall()
	 * @see #getScilabFunction()
	 * @generated
	 */
	EAttribute getScilabFunction_FunctionCall();

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionReturn <em>Function Return</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Function Return</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.ScilabFunction#getFunctionReturn()
	 * @see #getScilabFunction()
	 * @generated
	 */
	EAttribute getScilabFunction_FunctionReturn();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.calculationrepository.functions.CalculationRepository
	 * <em>Calculation Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Calculation Repository</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.CalculationRepository
	 * @generated
	 */
	EClass getCalculationRepository();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.bhl.cdt.calculationrepository.functions.CalculationRepository#getFunctions <em>Functions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see net.bhl.cdt.calculationrepository.functions.CalculationRepository#getFunctions()
	 * @see #getCalculationRepository()
	 * @generated
	 */
	EReference getCalculationRepository_Functions();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl
		 * <em>Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionImpl
		 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Function ID</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__FUNCTION_ID = eINSTANCE.getFunction_FunctionID();

		/**
		 * The meta object literal for the '<em><b>Input Descriptors</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__INPUT_DESCRIPTORS = eINSTANCE.getFunction_InputDescriptors();

		/**
		 * The meta object literal for the '<em><b>Output Descriptors</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__OUTPUT_DESCRIPTORS = eINSTANCE.getFunction_OutputDescriptors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Synopsis</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__SYNOPSIS = eINSTANCE.getFunction_Synopsis();

		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.calculationrepository.functions.impl.CalculationScriptImpl <em>Calculation Script</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.calculationrepository.functions.impl.CalculationScriptImpl
		 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getCalculationScript()
		 * @generated
		 */
		EClass CALCULATION_SCRIPT = eINSTANCE.getCalculationScript();

		/**
		 * The meta object literal for the '<em><b>Script Text</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CALCULATION_SCRIPT__SCRIPT_TEXT = eINSTANCE.getCalculationScript_ScriptText();

		/**
		 * The meta object literal for the '{@link net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl
		 * <em>Scilab Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.calculationrepository.functions.impl.ScilabFunctionImpl
		 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getScilabFunction()
		 * @generated
		 */
		EClass SCILAB_FUNCTION = eINSTANCE.getScilabFunction();

		/**
		 * The meta object literal for the '<em><b>Function Definition</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCILAB_FUNCTION__FUNCTION_DEFINITION = eINSTANCE.getScilabFunction_FunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Function Body</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCILAB_FUNCTION__FUNCTION_BODY = eINSTANCE.getScilabFunction_FunctionBody();

		/**
		 * The meta object literal for the '<em><b>Function Call</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCILAB_FUNCTION__FUNCTION_CALL = eINSTANCE.getScilabFunction_FunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function Return</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCILAB_FUNCTION__FUNCTION_RETURN = eINSTANCE.getScilabFunction_FunctionReturn();

		/**
		 * The meta object literal for the '
		 * {@link net.bhl.cdt.calculationrepository.functions.impl.CalculationRepositoryImpl
		 * <em>Calculation Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.bhl.cdt.calculationrepository.functions.impl.CalculationRepositoryImpl
		 * @see net.bhl.cdt.calculationrepository.functions.impl.FunctionsPackageImpl#getCalculationRepository()
		 * @generated
		 */
		EClass CALCULATION_REPOSITORY = eINSTANCE.getCalculationRepository();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALCULATION_REPOSITORY__FUNCTIONS = eINSTANCE.getCalculationRepository_Functions();

	}

} // FunctionsPackage
