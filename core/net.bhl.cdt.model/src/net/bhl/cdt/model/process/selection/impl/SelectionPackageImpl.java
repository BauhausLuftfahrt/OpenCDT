/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryPackage;
import net.bhl.cdt.model.geometry.impl.GeometryPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl;
import net.bhl.cdt.model.process.impl.ProcessPackageImpl;
import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.PartOfCriterion;
import net.bhl.cdt.model.process.selection.PreferAuthorCriterion;
import net.bhl.cdt.model.process.selection.PreferGeneratedCriterion;
import net.bhl.cdt.model.process.selection.PreferLatestCriterion;
import net.bhl.cdt.model.process.selection.Rationale;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.impl.SystemPackageImpl;
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
public class SelectionPackageImpl extends EPackageImpl implements SelectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSelectionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSelectionCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedMeasuredValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partOfCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highestValueCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferLatestCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferGeneratedCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferAuthorCriterionEClass = null;

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
	 * @see net.bhl.cdt.model.process.selection.SelectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SelectionPackageImpl() {
		super(eNS_URI, SelectionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SelectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SelectionPackage init() {
		if (isInited) return (SelectionPackage)EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);

		// Obtain or create and register package
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SelectionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		DesignoperationsPackageImpl theDesignoperationsPackage = (DesignoperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) instanceof DesignoperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) : DesignoperationsPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) : GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theSelectionPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theDesignoperationsPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theSelectionPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theDesignoperationsPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSelectionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SelectionPackage.eNS_URI, theSelectionPackage);
		return theSelectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSelectionArgument() {
		return valueSelectionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSelectionArgument_SupportedCriteria() {
		return (EReference)valueSelectionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSelectionArgument_OpposedCriteria() {
		return (EReference)valueSelectionArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSelectionCriterion() {
		return valueSelectionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSelection() {
		return valueSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSelection_Criteria() {
		return (EReference)valueSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSelection_SelectedValues() {
		return (EReference)valueSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedValue() {
		return selectedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedValue_AppliedCriteria() {
		return (EReference)selectedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedValue_Arguments() {
		return (EReference)selectedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedValue_SelectedValues() {
		return (EReference)selectedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedMeasuredValue() {
		return selectedMeasuredValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationale_RationaleDescription() {
		return (EAttribute)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameCriterion() {
		return nameCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameCriterion_ValueName() {
		return (EAttribute)nameCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartOfCriterion() {
		return partOfCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighestValueCriterion() {
		return highestValueCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferLatestCriterion() {
		return preferLatestCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferGeneratedCriterion() {
		return preferGeneratedCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferAuthorCriterion() {
		return preferAuthorCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionFactory getSelectionFactory() {
		return (SelectionFactory)getEFactoryInstance();
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
		valueSelectionArgumentEClass = createEClass(VALUE_SELECTION_ARGUMENT);
		createEReference(valueSelectionArgumentEClass, VALUE_SELECTION_ARGUMENT__SUPPORTED_CRITERIA);
		createEReference(valueSelectionArgumentEClass, VALUE_SELECTION_ARGUMENT__OPPOSED_CRITERIA);

		valueSelectionCriterionEClass = createEClass(VALUE_SELECTION_CRITERION);

		valueSelectionEClass = createEClass(VALUE_SELECTION);
		createEReference(valueSelectionEClass, VALUE_SELECTION__CRITERIA);
		createEReference(valueSelectionEClass, VALUE_SELECTION__SELECTED_VALUES);

		selectedValueEClass = createEClass(SELECTED_VALUE);
		createEReference(selectedValueEClass, SELECTED_VALUE__APPLIED_CRITERIA);
		createEReference(selectedValueEClass, SELECTED_VALUE__ARGUMENTS);
		createEReference(selectedValueEClass, SELECTED_VALUE__SELECTED_VALUES);

		selectedMeasuredValueEClass = createEClass(SELECTED_MEASURED_VALUE);

		rationaleEClass = createEClass(RATIONALE);
		createEAttribute(rationaleEClass, RATIONALE__RATIONALE_DESCRIPTION);

		nameCriterionEClass = createEClass(NAME_CRITERION);
		createEAttribute(nameCriterionEClass, NAME_CRITERION__VALUE_NAME);

		partOfCriterionEClass = createEClass(PART_OF_CRITERION);

		highestValueCriterionEClass = createEClass(HIGHEST_VALUE_CRITERION);

		preferLatestCriterionEClass = createEClass(PREFER_LATEST_CRITERION);

		preferGeneratedCriterionEClass = createEClass(PREFER_GENERATED_CRITERION);

		preferAuthorCriterionEClass = createEClass(PREFER_AUTHOR_CRITERION);
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueSelectionArgumentEClass.getESuperTypes().add(this.getRationale());
		valueSelectionCriterionEClass.getESuperTypes().add(this.getRationale());
		valueSelectionEClass.getESuperTypes().add(theProcessPackage.getProcessElement());
		selectedValueEClass.getESuperTypes().add(theSystemPackage.getValue());
		selectedValueEClass.getESuperTypes().add(theProcessPackage.getProcessElement());
		selectedMeasuredValueEClass.getESuperTypes().add(this.getSelectedValue());
		selectedMeasuredValueEClass.getESuperTypes().add(theSystemPackage.getMeasuredValue());
		rationaleEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		nameCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());
		partOfCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());
		highestValueCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());
		preferLatestCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());
		preferGeneratedCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());
		preferAuthorCriterionEClass.getESuperTypes().add(this.getValueSelectionCriterion());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueSelectionArgumentEClass, ValueSelectionArgument.class, "ValueSelectionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSelectionArgument_SupportedCriteria(), this.getValueSelectionCriterion(), null, "supportedCriteria", null, 0, -1, ValueSelectionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSelectionArgument_OpposedCriteria(), this.getValueSelectionCriterion(), null, "opposedCriteria", null, 0, -1, ValueSelectionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSelectionCriterionEClass, ValueSelectionCriterion.class, "ValueSelectionCriterion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSelectionEClass, ValueSelection.class, "ValueSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSelection_Criteria(), this.getValueSelectionCriterion(), null, "criteria", null, 0, -1, ValueSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSelection_SelectedValues(), this.getSelectedValue(), null, "selectedValues", null, 0, -1, ValueSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedValueEClass, SelectedValue.class, "SelectedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectedValue_AppliedCriteria(), this.getValueSelectionCriterion(), null, "appliedCriteria", null, 0, -1, SelectedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectedValue_Arguments(), this.getValueSelectionArgument(), null, "arguments", null, 0, -1, SelectedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectedValue_SelectedValues(), theSystemPackage.getValue(), null, "selectedValues", null, 0, -1, SelectedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedMeasuredValueEClass, SelectedMeasuredValue.class, "SelectedMeasuredValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rationaleEClass, Rationale.class, "Rationale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationale_RationaleDescription(), ecorePackage.getEString(), "rationaleDescription", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameCriterionEClass, NameCriterion.class, "NameCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameCriterion_ValueName(), ecorePackage.getEString(), "valueName", null, 0, 1, NameCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partOfCriterionEClass, PartOfCriterion.class, "PartOfCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(highestValueCriterionEClass, HighestValueCriterion.class, "HighestValueCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preferLatestCriterionEClass, PreferLatestCriterion.class, "PreferLatestCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preferGeneratedCriterionEClass, PreferGeneratedCriterion.class, "PreferGeneratedCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preferAuthorCriterionEClass, PreferAuthorCriterion.class, "PreferAuthorCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SelectionPackageImpl
