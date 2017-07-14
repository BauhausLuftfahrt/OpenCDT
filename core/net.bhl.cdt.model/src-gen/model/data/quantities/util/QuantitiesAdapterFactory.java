/**
 */
package model.data.quantities.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.QuantityKind;

import model.data.quantities.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.data.quantities.QuantitiesPackage
 * @generated
 */
public class QuantitiesAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static QuantitiesPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitiesAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = QuantitiesPackage.eINSTANCE;
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
        protected QuantitiesSwitch<Adapter> modelSwitch =
                new QuantitiesSwitch<Adapter>() {
                        @Override
                        public Adapter caseDistance(Distance object) {
                                return createDistanceAdapter();
                        }
                        @Override
                        public Adapter caseTime(Time object) {
                                return createTimeAdapter();
                        }
                        @Override
                        public Adapter caseVelocity(Velocity object) {
                                return createVelocityAdapter();
                        }
                        @Override
                        public Adapter caseMass(Mass object) {
                                return createMassAdapter();
                        }
                        @Override
                        public Adapter caseForce(Force object) {
                                return createForceAdapter();
                        }
                        @Override
                        public Adapter caseEfficiency(Efficiency object) {
                                return createEfficiencyAdapter();
                        }
                        @Override
                        public Adapter caseEnergy(Energy object) {
                                return createEnergyAdapter();
                        }
                        @Override
                        public Adapter casePower(Power object) {
                                return createPowerAdapter();
                        }
                        @Override
                        public Adapter caseAIdentifiableItem(AIdentifiableItem object) {
                                return createAIdentifiableItemAdapter();
                        }
                        @Override
                        public Adapter caseANamedItem(ANamedItem object) {
                                return createANamedItemAdapter();
                        }
                        @Override
                        public Adapter caseQuantityKind(QuantityKind object) {
                                return createQuantityKindAdapter();
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
         * Creates a new adapter for an object of class '{@link model.data.quantities.Distance <em>Distance</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Distance
         * @generated
         */
        public Adapter createDistanceAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Time <em>Time</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Time
         * @generated
         */
        public Adapter createTimeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Velocity <em>Velocity</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Velocity
         * @generated
         */
        public Adapter createVelocityAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Mass <em>Mass</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Mass
         * @generated
         */
        public Adapter createMassAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Force <em>Force</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Force
         * @generated
         */
        public Adapter createForceAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Efficiency <em>Efficiency</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Efficiency
         * @generated
         */
        public Adapter createEfficiencyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Energy <em>Energy</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Energy
         * @generated
         */
        public Adapter createEnergyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.quantities.Power <em>Power</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.quantities.Power
         * @generated
         */
        public Adapter createPowerAdapter() {
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
         * Creates a new adapter for an object of class '{@link model.data.QuantityKind <em>Quantity Kind</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.QuantityKind
         * @generated
         */
        public Adapter createQuantityKindAdapter() {
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

} //QuantitiesAdapterFactory
