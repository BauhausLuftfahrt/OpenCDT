/**
 */
package model.data.quantities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.data.quantities.QuantitiesPackage
 * @generated
 */
public interface QuantitiesFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        QuantitiesFactory eINSTANCE = model.data.quantities.impl.QuantitiesFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Distance</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Distance</em>'.
         * @generated
         */
        Distance createDistance();

        /**
         * Returns a new object of class '<em>Time</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Time</em>'.
         * @generated
         */
        Time createTime();

        /**
         * Returns a new object of class '<em>Velocity</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Velocity</em>'.
         * @generated
         */
        Velocity createVelocity();

        /**
         * Returns a new object of class '<em>Mass</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Mass</em>'.
         * @generated
         */
        Mass createMass();

        /**
         * Returns a new object of class '<em>Force</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Force</em>'.
         * @generated
         */
        Force createForce();

        /**
         * Returns a new object of class '<em>Efficiency</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Efficiency</em>'.
         * @generated
         */
        Efficiency createEfficiency();

        /**
         * Returns a new object of class '<em>Energy</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Energy</em>'.
         * @generated
         */
        Energy createEnergy();

        /**
         * Returns a new object of class '<em>Power</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Power</em>'.
         * @generated
         */
        Power createPower();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        QuantitiesPackage getQuantitiesPackage();

} //QuantitiesFactory
