/**
 */
package model.data.measure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.data.measure.MeasurePackage
 * @generated
 */
public interface MeasureFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        MeasureFactory eINSTANCE = model.data.measure.impl.MeasureFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Length</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Length</em>'.
         * @generated
         */
        Length createLength();

        /**
         * Returns a new object of class '<em>Meter</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Meter</em>'.
         * @generated
         */
        Meter createMeter();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        MeasurePackage getMeasurePackage();

} //MeasureFactory
