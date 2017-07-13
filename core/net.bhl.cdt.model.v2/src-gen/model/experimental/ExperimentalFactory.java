/**
 */
package model.experimental;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.experimental.ExperimentalPackage
 * @generated
 */
public interface ExperimentalFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        ExperimentalFactory eINSTANCE = model.experimental.impl.ExperimentalFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Length Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Length Parameter</em>'.
         * @generated
         */
        LengthParameter createLengthParameter();

        /**
         * Returns a new object of class '<em>Mass Parameter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Mass Parameter</em>'.
         * @generated
         */
        MassParameter createMassParameter();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        ExperimentalPackage getExperimentalPackage();

} //ExperimentalFactory
