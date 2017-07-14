/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryPackage;
import net.bhl.cdt.model.geometry.impl.GeometryPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.CalculatedValue;
import net.bhl.cdt.model.process.designoperations.Calculations;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.DisciplineTool;
import net.bhl.cdt.model.process.designoperations.DisciplineToolService;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.process.designoperations.LocalDisciplineTool;
import net.bhl.cdt.model.process.impl.ProcessPackageImpl;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.impl.SystemPackageImpl;
import net.bhl.cdt.model.system.quantities.QuantitiesPackage;
import net.bhl.cdt.model.system.quantities.impl.QuantitiesPackageImpl;
import net.bhl.cdt.model.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignoperationsPackageImpl extends EPackageImpl implements DesignoperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineToolServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDisciplineToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedDecimalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesignoperationsPackageImpl() {
		super(eNS_URI, DesignoperationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DesignoperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesignoperationsPackage init() {
		if (isInited) return (DesignoperationsPackage)EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI);

		// Obtain or create and register package
		DesignoperationsPackageImpl theDesignoperationsPackage = (DesignoperationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DesignoperationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DesignoperationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) : SelectionPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) : GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theDesignoperationsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theQuantitiesPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theDesignoperationsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theQuantitiesPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesignoperationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesignoperationsPackage.eNS_URI, theDesignoperationsPackage);
		return theDesignoperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplineTool() {
		return disciplineToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormula() {
		return formulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormula_Formula() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormula_Parameter() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplineToolService() {
		return disciplineToolServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisciplineToolService_ServiceURL() {
		return (EAttribute)disciplineToolServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDisciplineTool() {
		return localDisciplineToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValue() {
		return calculatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValue_Expression() {
		return (EAttribute)calculatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedDecimalNumber() {
		return calculatedDecimalNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculations() {
		return calculationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignoperationsFactory getDesignoperationsFactory() {
		return (DesignoperationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		disciplineToolEClass = createEClass(DISCIPLINE_TOOL);

		formulaEClass = createEClass(FORMULA);
		createEAttribute(formulaEClass, FORMULA__FORMULA);
		createEReference(formulaEClass, FORMULA__PARAMETER);

		assumptionEClass = createEClass(ASSUMPTION);

		disciplineToolServiceEClass = createEClass(DISCIPLINE_TOOL_SERVICE);
		createEAttribute(disciplineToolServiceEClass, DISCIPLINE_TOOL_SERVICE__SERVICE_URL);

		localDisciplineToolEClass = createEClass(LOCAL_DISCIPLINE_TOOL);

		calculatedValueEClass = createEClass(CALCULATED_VALUE);
		createEAttribute(calculatedValueEClass, CALCULATED_VALUE__EXPRESSION);

		calculatedDecimalNumberEClass = createEClass(CALCULATED_DECIMAL_NUMBER);

		calculationsEClass = createEClass(CALCULATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		disciplineToolEClass.getESuperTypes().add(theProcessPackage.getDesignProcess());
		formulaEClass.getESuperTypes().add(theModelPackage.getOperationWithInput());
		formulaEClass.getESuperTypes().add(theModelPackage.getOperationWithOutput());
		formulaEClass.getESuperTypes().add(theProcessPackage.getDesignOperation());
		assumptionEClass.getESuperTypes().add(theProcessPackage.getDesignOperation());
		assumptionEClass.getESuperTypes().add(theModelPackage.getOperationWithOutput());
		disciplineToolServiceEClass.getESuperTypes().add(this.getDisciplineTool());
		localDisciplineToolEClass.getESuperTypes().add(this.getDisciplineTool());
		calculatedValueEClass.getESuperTypes().add(theProcessPackage.getDesignOperation());
		calculatedValueEClass.getESuperTypes().add(theSystemPackage.getValue());
		calculatedValueEClass.getESuperTypes().add(theModelPackage.getOperationWithInput());
		calculatedDecimalNumberEClass.getESuperTypes().add(this.getCalculatedValue());
		calculatedDecimalNumberEClass.getESuperTypes().add(theSystemPackage.getDecimalNumber());
		calculationsEClass.getESuperTypes().add(theProcessPackage.getDesignProcess());

		// Initialize classes, features, and operations; add parameters
		initEClass(disciplineToolEClass, DisciplineTool.class, "DisciplineTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormula_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Parameter(), theSystemPackage.getParameter(), null, "parameter", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplineToolServiceEClass, DisciplineToolService.class, "DisciplineToolService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisciplineToolService_ServiceURL(), ecorePackage.getEString(), "serviceURL", null, 0, 1, DisciplineToolService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localDisciplineToolEClass, LocalDisciplineTool.class, "LocalDisciplineTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calculatedValueEClass, CalculatedValue.class, "CalculatedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculatedValue_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, CalculatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculatedDecimalNumberEClass, CalculatedDecimalNumber.class, "CalculatedDecimalNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calculationsEClass, Calculations.class, "Calculations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //DesignoperationsPackageImpl
