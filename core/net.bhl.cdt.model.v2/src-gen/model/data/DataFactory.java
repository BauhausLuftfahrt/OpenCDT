/**
 */
package model.data;

import javax.measure.quantity.Quantity;

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
         * Returns a new object of class '<em>AUnit</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>AUnit</em>'.
         * @generated
         */
        AUnit createAUnit();

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
         * Returns a new object of class '<em>IQuantified Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>IQuantified Parameter</em>'.
         * @generated
         */
        <Q extends Quantity> IQuantifiedParameter<Q> createIQuantifiedParameter();

        /**
         * Returns a new object of class '<em>Length Paramenter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Length Paramenter</em>'.
         * @generated
         */
        LengthParamenter createLengthParamenter();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        DataPackage getDataPackage();

} //DataFactory
