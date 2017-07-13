/**
 */
package model.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        DataFactory eINSTANCE = model.data.impl.DataFactoryImpl.init();

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
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        DataPackage getDataPackage();

} //DataFactory
