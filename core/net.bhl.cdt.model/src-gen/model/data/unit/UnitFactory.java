/**
 */
package model.data.unit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.data.unit.UnitPackage
 * @generated
 */
public interface UnitFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        UnitFactory eINSTANCE = model.data.unit.impl.UnitFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Distance Unit</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Distance Unit</em>'.
         * @generated
         */
        DistanceUnit createDistanceUnit();

        /**
         * Returns a new object of class '<em>Time Unit</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Time Unit</em>'.
         * @generated
         */
        TimeUnit createTimeUnit();

        /**
         * Returns a new object of class '<em>Mass Unit</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Mass Unit</em>'.
         * @generated
         */
        MassUnit createMassUnit();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        UnitPackage getUnitPackage();

} //UnitFactory
