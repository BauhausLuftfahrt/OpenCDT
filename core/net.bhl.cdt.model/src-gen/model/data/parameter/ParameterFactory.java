/**
 */
package model.data.parameter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.data.parameter.ParameterPackage
 * @generated
 */
public interface ParameterFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        ParameterFactory eINSTANCE = model.data.parameter.impl.ParameterFactoryImpl.init();

        /**
         * Returns a new object of class '<em>String Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>String Parameter</em>'.
         * @generated
         */
        StringParameter createStringParameter();

        /**
         * Returns a new object of class '<em>Date Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Date Parameter</em>'.
         * @generated
         */
        DateParameter createDateParameter();

        /**
         * Returns a new object of class '<em>Distance Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Distance Parameter</em>'.
         * @generated
         */
        DistanceParameter createDistanceParameter();

        /**
         * Returns a new object of class '<em>Time Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Time Parameter</em>'.
         * @generated
         */
        TimeParameter createTimeParameter();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        ParameterPackage getParameterPackage();

} //ParameterFactory
