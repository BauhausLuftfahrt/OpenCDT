/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.selection.util;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.selection.HighestValueCriterion;
import net.bhl.cdt.model.process.selection.NameCriterion;
import net.bhl.cdt.model.process.selection.PartOfCriterion;
import net.bhl.cdt.model.process.selection.PreferAuthorCriterion;
import net.bhl.cdt.model.process.selection.PreferGeneratedCriterion;
import net.bhl.cdt.model.process.selection.PreferLatestCriterion;
import net.bhl.cdt.model.process.selection.Rationale;
import net.bhl.cdt.model.process.selection.SelectedMeasuredValue;
import net.bhl.cdt.model.process.selection.SelectedValue;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import net.bhl.cdt.model.process.selection.ValueSelectionArgument;
import net.bhl.cdt.model.process.selection.ValueSelectionCriterion;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.Value;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.selection.SelectionPackage
 * @generated
 */
public class SelectionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SelectionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionSwitch<Adapter> modelSwitch = new SelectionSwitch<Adapter>() {
			@Override
			public Adapter caseValueSelectionArgument(ValueSelectionArgument object) {
				return createValueSelectionArgumentAdapter();
			}
			@Override
			public Adapter caseValueSelectionCriterion(ValueSelectionCriterion object) {
				return createValueSelectionCriterionAdapter();
			}
			@Override
			public Adapter caseValueSelection(ValueSelection object) {
				return createValueSelectionAdapter();
			}
			@Override
			public Adapter caseSelectedValue(SelectedValue object) {
				return createSelectedValueAdapter();
			}
			@Override
			public Adapter caseSelectedMeasuredValue(SelectedMeasuredValue object) {
				return createSelectedMeasuredValueAdapter();
			}
			@Override
			public Adapter caseRationale(Rationale object) {
				return createRationaleAdapter();
			}
			@Override
			public Adapter caseNameCriterion(NameCriterion object) {
				return createNameCriterionAdapter();
			}
			@Override
			public Adapter casePartOfCriterion(PartOfCriterion object) {
				return createPartOfCriterionAdapter();
			}
			@Override
			public Adapter caseHighestValueCriterion(HighestValueCriterion object) {
				return createHighestValueCriterionAdapter();
			}
			@Override
			public Adapter casePreferLatestCriterion(PreferLatestCriterion object) {
				return createPreferLatestCriterionAdapter();
			}
			@Override
			public Adapter casePreferGeneratedCriterion(PreferGeneratedCriterion object) {
				return createPreferGeneratedCriterionAdapter();
			}
			@Override
			public Adapter casePreferAuthorCriterion(PreferAuthorCriterion object) {
				return createPreferAuthorCriterionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseGeneratableElement(GeneratableElement object) {
				return createGeneratableElementAdapter();
			}
			@Override
			public Adapter caseProcessableElement(ProcessableElement object) {
				return createProcessableElementAdapter();
			}
			@Override
			public Adapter caseSystemModelElement(SystemModelElement object) {
				return createSystemModelElementAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseDecimalNumber(DecimalNumber object) {
				return createDecimalNumberAdapter();
			}
			@Override
			public Adapter caseMeasuredValue(MeasuredValue object) {
				return createMeasuredValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.ValueSelectionArgument <em>Value Selection Argument</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionArgument
	 * @generated
	 */
	public Adapter createValueSelectionArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.ValueSelectionCriterion <em>Value Selection Criterion</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.ValueSelectionCriterion
	 * @generated
	 */
	public Adapter createValueSelectionCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.ValueSelection <em>Value Selection</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.ValueSelection
	 * @generated
	 */
	public Adapter createValueSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.SelectedValue
	 * <em>Selected Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.SelectedValue
	 * @generated
	 */
	public Adapter createSelectedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.SelectedMeasuredValue <em>Selected Measured Value</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.SelectedMeasuredValue
	 * @generated
	 */
	public Adapter createSelectedMeasuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.Rationale
	 * <em>Rationale</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.Rationale
	 * @generated
	 */
	public Adapter createRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.NameCriterion
	 * <em>Name Criterion</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.NameCriterion
	 * @generated
	 */
	public Adapter createNameCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.PartOfCriterion <em>Part Of Criterion</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.PartOfCriterion
	 * @generated
	 */
	public Adapter createPartOfCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.HighestValueCriterion <em>Highest Value Criterion</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.HighestValueCriterion
	 * @generated
	 */
	public Adapter createHighestValueCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.PreferLatestCriterion <em>Prefer Latest Criterion</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.PreferLatestCriterion
	 * @generated
	 */
	public Adapter createPreferLatestCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.model.process.selection.PreferGeneratedCriterion <em>Prefer Generated Criterion</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.PreferGeneratedCriterion
	 * @generated
	 */
	public Adapter createPreferGeneratedCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.selection.PreferAuthorCriterion <em>Prefer Author Criterion</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.selection.PreferAuthorCriterion
	 * @generated
	 */
	public Adapter createPreferAuthorCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.ProcessElement <em>Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.GeneratableElement <em>Generatable Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.GeneratableElement
	 * @generated
	 */
	public Adapter createGeneratableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.ProcessableElement <em>Processable Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.ProcessableElement
	 * @generated
	 */
	public Adapter createProcessableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.system.SystemModelElement
	 * <em>Model Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.system.SystemModelElement
	 * @generated
	 */
	public Adapter createSystemModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.system.Value <em>Value</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.system.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.system.DecimalNumber
	 * <em>Decimal Number</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.system.DecimalNumber
	 * @generated
	 */
	public Adapter createDecimalNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.system.MeasuredValue
	 * <em>Measured Value</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.system.MeasuredValue
	 * @generated
	 */
	public Adapter createMeasuredValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // SelectionAdapterFactory
