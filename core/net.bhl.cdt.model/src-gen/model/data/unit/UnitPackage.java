/**
 */
package model.data.unit;

import model.data.DataPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.data.unit.UnitFactory
 * @model kind="package"
 * @generated
 */
public interface UnitPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "unit";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/data/unit";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model.data";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        UnitPackage eINSTANCE = model.data.unit.impl.UnitPackageImpl.init();

        /**
         * The meta object id for the '{@link model.data.unit.impl.DistanceUnitImpl <em>Distance Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.unit.impl.DistanceUnitImpl
         * @see model.data.unit.impl.UnitPackageImpl#getDistanceUnit()
         * @generated
         */
        int DISTANCE_UNIT = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_UNIT__NAME = DataPackage.UNIT__NAME;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_UNIT__SYMBOL = DataPackage.UNIT__SYMBOL;

        /**
         * The number of structural features of the '<em>Distance Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_UNIT_FEATURE_COUNT = DataPackage.UNIT_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Distance Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_UNIT_OPERATION_COUNT = DataPackage.UNIT_OPERATION_COUNT + 0;


        /**
         * The meta object id for the '{@link model.data.unit.impl.TimeUnitImpl <em>Time Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.unit.impl.TimeUnitImpl
         * @see model.data.unit.impl.UnitPackageImpl#getTimeUnit()
         * @generated
         */
        int TIME_UNIT = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_UNIT__NAME = DataPackage.UNIT__NAME;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_UNIT__SYMBOL = DataPackage.UNIT__SYMBOL;

        /**
         * The number of structural features of the '<em>Time Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_UNIT_FEATURE_COUNT = DataPackage.UNIT_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Time Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_UNIT_OPERATION_COUNT = DataPackage.UNIT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.unit.impl.MassUnitImpl <em>Mass Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.unit.impl.MassUnitImpl
         * @see model.data.unit.impl.UnitPackageImpl#getMassUnit()
         * @generated
         */
        int MASS_UNIT = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_UNIT__NAME = DataPackage.UNIT__NAME;

        /**
         * The feature id for the '<em><b>Symbol</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_UNIT__SYMBOL = DataPackage.UNIT__SYMBOL;

        /**
         * The number of structural features of the '<em>Mass Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_UNIT_FEATURE_COUNT = DataPackage.UNIT_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Mass Unit</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_UNIT_OPERATION_COUNT = DataPackage.UNIT_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.data.unit.DistanceUnit <em>Distance Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Distance Unit</em>'.
         * @see model.data.unit.DistanceUnit
         * @generated
         */
        EClass getDistanceUnit();

        /**
         * Returns the meta object for class '{@link model.data.unit.TimeUnit <em>Time Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Time Unit</em>'.
         * @see model.data.unit.TimeUnit
         * @generated
         */
        EClass getTimeUnit();

        /**
         * Returns the meta object for class '{@link model.data.unit.MassUnit <em>Mass Unit</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Mass Unit</em>'.
         * @see model.data.unit.MassUnit
         * @generated
         */
        EClass getMassUnit();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        UnitFactory getUnitFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each operation of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link model.data.unit.impl.DistanceUnitImpl <em>Distance Unit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.unit.impl.DistanceUnitImpl
                 * @see model.data.unit.impl.UnitPackageImpl#getDistanceUnit()
                 * @generated
                 */
                EClass DISTANCE_UNIT = eINSTANCE.getDistanceUnit();
                /**
                 * The meta object literal for the '{@link model.data.unit.impl.TimeUnitImpl <em>Time Unit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.unit.impl.TimeUnitImpl
                 * @see model.data.unit.impl.UnitPackageImpl#getTimeUnit()
                 * @generated
                 */
                EClass TIME_UNIT = eINSTANCE.getTimeUnit();
                /**
                 * The meta object literal for the '{@link model.data.unit.impl.MassUnitImpl <em>Mass Unit</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.unit.impl.MassUnitImpl
                 * @see model.data.unit.impl.UnitPackageImpl#getMassUnit()
                 * @generated
                 */
                EClass MASS_UNIT = eINSTANCE.getMassUnit();

        }

} //UnitPackage
