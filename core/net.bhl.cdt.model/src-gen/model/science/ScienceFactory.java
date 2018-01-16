/**
 */
package model.science;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.science.SciencePackage
 * @generated
 */
public interface ScienceFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        ScienceFactory eINSTANCE = model.science.impl.ScienceFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Quantity Set</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Quantity Set</em>'.
         * @generated
         */
        QuantitySet createQuantitySet();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        SciencePackage getSciencePackage();

} //ScienceFactory
