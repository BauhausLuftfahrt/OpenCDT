/**
 */
package model.engineering.util;

import model.base.AIdentifiableItem;
import model.base.AModelContainerItem;
import model.base.ANamedItem;

import model.engineering.Component;
import model.engineering.EngineeringPackage;

import model.science.IDataEntity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.engineering.EngineeringPackage
 * @generated
 */
public class EngineeringAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static EngineeringPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EngineeringAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = EngineeringPackage.eINSTANCE;
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
        protected EngineeringSwitch<Adapter> modelSwitch =
                new EngineeringSwitch<Adapter>() {
                        @Override
                        public Adapter caseSystem(model.engineering.System object) {
                                return createSystemAdapter();
                        }
                        @Override
                        public Adapter caseComponent(Component object) {
                                return createComponentAdapter();
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
                        public Adapter caseAModelContainerItem(AModelContainerItem object) {
                                return createAModelContainerItemAdapter();
                        }
                        @Override
                        public Adapter caseIDataEntity(IDataEntity object) {
                                return createIDataEntityAdapter();
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
         * Creates a new adapter for an object of class '{@link model.engineering.System <em>System</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.engineering.System
         * @generated
         */
        public Adapter createSystemAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.engineering.Component <em>Component</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.engineering.Component
         * @generated
         */
        public Adapter createComponentAdapter() {
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
         * Creates a new adapter for an object of class '{@link model.base.AModelContainerItem <em>AModel Container Item</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.base.AModelContainerItem
         * @generated
         */
        public Adapter createAModelContainerItemAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.science.IDataEntity <em>IData Entity</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.science.IDataEntity
         * @generated
         */
        public Adapter createIDataEntityAdapter() {
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

} //EngineeringAdapterFactory
