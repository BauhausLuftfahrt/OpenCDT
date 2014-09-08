/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.model.process.designoperations.util;

import net.bhl.cdt.model.GeneratableElement;
import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.model.OperationWithInput;
import net.bhl.cdt.model.OperationWithOutput;
import net.bhl.cdt.model.ProcessableElement;
import net.bhl.cdt.model.process.DesignOperation;
import net.bhl.cdt.model.process.DesignProcess;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber;
import net.bhl.cdt.model.process.designoperations.CalculatedValue;
import net.bhl.cdt.model.process.designoperations.Calculations;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.DisciplineTool;
import net.bhl.cdt.model.process.designoperations.DisciplineToolService;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.process.designoperations.LocalDisciplineTool;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.SystemModelElement;
import net.bhl.cdt.model.system.Value;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see net.bhl.cdt.model.process.designoperations.DesignoperationsPackage
 * @generated
 */
public class DesignoperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static DesignoperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DesignoperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DesignoperationsPackage.eINSTANCE;
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
	protected DesignoperationsSwitch<Adapter> modelSwitch = new DesignoperationsSwitch<Adapter>() {
			@Override
			public Adapter caseDisciplineTool(DisciplineTool object) {
				return createDisciplineToolAdapter();
			}
			@Override
			public Adapter caseFormula(Formula object) {
				return createFormulaAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseDisciplineToolService(DisciplineToolService object) {
				return createDisciplineToolServiceAdapter();
			}
			@Override
			public Adapter caseLocalDisciplineTool(LocalDisciplineTool object) {
				return createLocalDisciplineToolAdapter();
			}
			@Override
			public Adapter caseCalculatedValue(CalculatedValue object) {
				return createCalculatedValueAdapter();
			}
			@Override
			public Adapter caseCalculatedDecimalNumber(CalculatedDecimalNumber object) {
				return createCalculatedDecimalNumberAdapter();
			}
			@Override
			public Adapter caseCalculations(Calculations object) {
				return createCalculationsAdapter();
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
			public Adapter caseDesignProcess(DesignProcess object) {
				return createDesignProcessAdapter();
			}
			@Override
			public Adapter caseOperationWithInput(OperationWithInput object) {
				return createOperationWithInputAdapter();
			}
			@Override
			public Adapter caseOperationWithOutput(OperationWithOutput object) {
				return createOperationWithOutputAdapter();
			}
			@Override
			public Adapter caseDesignOperation(DesignOperation object) {
				return createDesignOperationAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.DisciplineTool <em>Discipline Tool</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.DisciplineTool
	 * @generated
	 */
	public Adapter createDisciplineToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.Formula
	 * @generated
	 */
	public Adapter createFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.Assumption
	 * <em>Assumption</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.model.process.designoperations.DisciplineToolService <em>Discipline Tool Service</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.DisciplineToolService
	 * @generated
	 */
	public Adapter createDisciplineToolServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.bhl.cdt.model.process.designoperations.LocalDisciplineTool <em>Local Discipline Tool</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.LocalDisciplineTool
	 * @generated
	 */
	public Adapter createLocalDisciplineToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.CalculatedValue <em>Calculated Value</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.CalculatedValue
	 * @generated
	 */
	public Adapter createCalculatedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber <em>Calculated Decimal Number</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.CalculatedDecimalNumber
	 * @generated
	 */
	public Adapter createCalculatedDecimalNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.designoperations.Calculations
	 * <em>Calculations</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.designoperations.Calculations
	 * @generated
	 */
	public Adapter createCalculationsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.DesignProcess
	 * <em>Design Process</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.DesignProcess
	 * @generated
	 */
	public Adapter createDesignProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.process.DesignOperation <em>Design Operation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.process.DesignOperation
	 * @generated
	 */
	public Adapter createDesignOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.OperationWithInput <em>Operation With Input</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.OperationWithInput
	 * @generated
	 */
	public Adapter createOperationWithInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.OperationWithOutput <em>Operation With Output</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.OperationWithOutput
	 * @generated
	 */
	public Adapter createOperationWithOutputAdapter() {
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
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DesignoperationsAdapterFactory
