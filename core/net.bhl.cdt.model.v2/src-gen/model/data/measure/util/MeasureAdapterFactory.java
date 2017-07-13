/**
 */
package model.data.measure.util;

import model.base.ANamedItem;

import model.data.measure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.data.measure.MeasurePackage
 * @generated
 */
public class MeasureAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static MeasurePackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = MeasurePackage.eINSTANCE;
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
        protected MeasureSwitch<Adapter> modelSwitch =
                new MeasureSwitch<Adapter>() {
                        @Override
                        public Adapter caseADimension(ADimension object) {
                                return createADimensionAdapter();
                        }
                        @Override
                        public Adapter caseLength(Length object) {
                                return createLengthAdapter();
                        }
                        @Override
                        public <D extends ADimension> Adapter caseAUnit(AUnit<D> object) {
                                return createAUnitAdapter();
                        }
                        @Override
                        public Adapter caseMeter(Meter object) {
                                return createMeterAdapter();
                        }
                        @Override
                        public Adapter caseANamedItem(ANamedItem object) {
                                return createANamedItemAdapter();
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
         * Creates a new adapter for an object of class '{@link model.data.measure.ADimension <em>ADimension</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.measure.ADimension
         * @generated
         */
        public Adapter createADimensionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.measure.Length <em>Length</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.measure.Length
         * @generated
         */
        public Adapter createLengthAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.measure.AUnit <em>AUnit</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.measure.AUnit
         * @generated
         */
        public Adapter createAUnitAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.measure.Meter <em>Meter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.measure.Meter
         * @generated
         */
        public Adapter createMeterAdapter() {
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

} //MeasureAdapterFactory
