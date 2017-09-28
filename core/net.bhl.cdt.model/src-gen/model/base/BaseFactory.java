/**
 */
package model.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BaseFactory eINSTANCE = model.base.impl.BaseFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Model Container</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Model Container</em>'.
         * @generated
         */
        ModelContainer createModelContainer();

        /**
         * Returns a new object of class '<em>System</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>System</em>'.
         * @generated
         */
        System createSystem();

        /**
         * Returns a new object of class '<em>Component</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Component</em>'.
         * @generated
         */
        Component createComponent();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        BasePackage getBasePackage();

} //BaseFactory