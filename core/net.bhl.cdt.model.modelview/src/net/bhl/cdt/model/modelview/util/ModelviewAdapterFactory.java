/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.util;

import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.View;
import net.bhl.cdt.model.modelview.*;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ModelviewPackage;
import net.bhl.cdt.model.modelview.ViewLink;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.modelview.ModelviewPackage
 * @generated
 */
public class ModelviewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelviewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelviewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelviewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelviewSwitch<Adapter> modelSwitch =
		new ModelviewSwitch<Adapter>() {
			@Override
			public Adapter caseDisciplineView(DisciplineView object) {
				return createDisciplineViewAdapter();
			}
			@Override
			public Adapter caseViewLink(ViewLink object) {
				return createViewLinkAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseSetExpression(SetExpression object) {
				return createSetExpressionAdapter();
			}
			@Override
			public Adapter caseSetOperator(SetOperator object) {
				return createSetOperatorAdapter();
			}
			@Override
			public Adapter caseExchangeElement(ExchangeElement object) {
				return createExchangeElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.modelview.DisciplineView <em>Discipline View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.modelview.DisciplineView
	 * @generated
	 */
	public Adapter createDisciplineViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.modelview.ViewLink <em>View Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.modelview.ViewLink
	 * @generated
	 */
	public Adapter createViewLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.modelview.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.modelview.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.modelview.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.modelview.SetExpression
	 * @generated
	 */
	public Adapter createSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.modelview.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.modelview.SetOperator
	 * @generated
	 */
	public Adapter createSetOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.utilities.exchangemodel.ExchangeElement <em>Exchange Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.utilities.exchangemodel.ExchangeElement
	 * @generated
	 */
	public Adapter createExchangeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelviewAdapterFactory
