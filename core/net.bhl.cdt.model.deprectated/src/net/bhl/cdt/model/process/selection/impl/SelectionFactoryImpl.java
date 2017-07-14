/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.impl;

import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.PartOfCriterion;
import net.bhl.cdt.model.process.selection.PreferAuthorCriterion;
import net.bhl.cdt.model.process.selection.PreferGeneratedCriterion;
import net.bhl.cdt.model.process.selection.PreferLatestCriterion;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionFactoryImpl extends EFactoryImpl implements SelectionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectionFactory init() {
		try {
			SelectionFactory theSelectionFactory = (SelectionFactory)EPackage.Registry.INSTANCE.getEFactory(SelectionPackage.eNS_URI);
			if (theSelectionFactory != null) {
				return theSelectionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SelectionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SelectionPackage.VALUE_SELECTION_ARGUMENT: return createValueSelectionArgument();
			case SelectionPackage.VALUE_SELECTION: return createValueSelection();
			case SelectionPackage.SELECTED_VALUE: return createSelectedValue();
			case SelectionPackage.SELECTED_MEASURED_VALUE: return createSelectedMeasuredValue();
			case SelectionPackage.NAME_CRITERION: return createNameCriterion();
			case SelectionPackage.PART_OF_CRITERION: return createPartOfCriterion();
			case SelectionPackage.HIGHEST_VALUE_CRITERION: return createHighestValueCriterion();
			case SelectionPackage.PREFER_LATEST_CRITERION: return createPreferLatestCriterion();
			case SelectionPackage.PREFER_GENERATED_CRITERION: return createPreferGeneratedCriterion();
			case SelectionPackage.PREFER_AUTHOR_CRITERION: return createPreferAuthorCriterion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSelectionArgument createValueSelectionArgument() {
		ValueSelectionArgumentImpl valueSelectionArgument = new ValueSelectionArgumentImpl();
		return valueSelectionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSelection createValueSelection() {
		ValueSelectionImpl valueSelection = new ValueSelectionImpl();
		return valueSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedValue createSelectedValue() {
		SelectedValueImpl selectedValue = new SelectedValueImpl();
		return selectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedMeasuredValue createSelectedMeasuredValue() {
		SelectedMeasuredValueImpl selectedMeasuredValue = new SelectedMeasuredValueImpl();
		return selectedMeasuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameCriterion createNameCriterion() {
		NameCriterionImpl nameCriterion = new NameCriterionImpl();
		return nameCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfCriterion createPartOfCriterion() {
		PartOfCriterionImpl partOfCriterion = new PartOfCriterionImpl();
		return partOfCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestValueCriterion createHighestValueCriterion() {
		HighestValueCriterionImpl highestValueCriterion = new HighestValueCriterionImpl();
		return highestValueCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferLatestCriterion createPreferLatestCriterion() {
		PreferLatestCriterionImpl preferLatestCriterion = new PreferLatestCriterionImpl();
		return preferLatestCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferGeneratedCriterion createPreferGeneratedCriterion() {
		PreferGeneratedCriterionImpl preferGeneratedCriterion = new PreferGeneratedCriterionImpl();
		return preferGeneratedCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferAuthorCriterion createPreferAuthorCriterion() {
		PreferAuthorCriterionImpl preferAuthorCriterion = new PreferAuthorCriterionImpl();
		return preferAuthorCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionPackage getSelectionPackage() {
		return (SelectionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SelectionPackage getPackage() {
		return SelectionPackage.eINSTANCE;
	}

} //SelectionFactoryImpl
