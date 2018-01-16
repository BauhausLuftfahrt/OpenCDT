/**
 */
package model.science.parameter.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.science.IParameter;
import model.science.IQuantifiedParameter;
import model.science.QuantityKind;

import model.science.parameter.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.science.parameter.ParameterPackage
 * @generated
 */
public class ParameterAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static ParameterPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = ParameterPackage.eINSTANCE;
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
        protected ParameterSwitch<Adapter> modelSwitch =
                new ParameterSwitch<Adapter>() {
                        @Override
                        public Adapter caseStringParameter(StringParameter object) {
                                return createStringParameterAdapter();
                        }
                        @Override
                        public Adapter caseDateParameter(DateParameter object) {
                                return createDateParameterAdapter();
                        }
                        @Override
                        public Adapter caseDistanceParameter(DistanceParameter object) {
                                return createDistanceParameterAdapter();
                        }
                        @Override
                        public Adapter caseTimeParameter(TimeParameter object) {
                                return createTimeParameterAdapter();
                        }
                        @Override
                        public Adapter caseANamedItem(ANamedItem object) {
                                return createANamedItemAdapter();
                        }
                        @Override
                        public Adapter caseAIdentifiableItem(AIdentifiableItem object) {
                                return createAIdentifiableItemAdapter();
                        }
                        @Override
                        public Adapter caseIParameter(IParameter object) {
                                return createIParameterAdapter();
                        }
                        @Override
                        public <Q extends QuantityKind> Adapter caseIQuantifiedParameter(IQuantifiedParameter<Q> object) {
                                return createIQuantifiedParameterAdapter();
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
         * Creates a new adapter for an object of class '{@link model.science.parameter.StringParameter <em>String Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.parameter.StringParameter
         * @generated
         */
        public Adapter createStringParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.parameter.DateParameter <em>Date Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.parameter.DateParameter
         * @generated
         */
        public Adapter createDateParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.parameter.DistanceParameter <em>Distance Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.parameter.DistanceParameter
         * @generated
         */
        public Adapter createDistanceParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.parameter.TimeParameter <em>Time Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.parameter.TimeParameter
         * @generated
         */
        public Adapter createTimeParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.base.ANamedItem <em>ANamed Item</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.base.ANamedItem
         * @generated
         */
        public Adapter createANamedItemAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.base.AIdentifiableItem <em>AIdentifiable Item</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.base.AIdentifiableItem
         * @generated
         */
        public Adapter createAIdentifiableItemAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.IParameter <em>IParameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.IParameter
         * @generated
         */
        public Adapter createIParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.IQuantifiedParameter <em>IQuantified Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.IQuantifiedParameter
         * @generated
         */
        public Adapter createIQuantifiedParameterAdapter() {
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

} //ParameterAdapterFactory
