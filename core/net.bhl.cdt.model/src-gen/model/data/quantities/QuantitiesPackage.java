/**
 */
package model.data.quantities;

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
 * @see model.data.quantities.QuantitiesFactory
 * @model kind="package"
 * @generated
 */
public interface QuantitiesPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "quantities";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/data/quantities";

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
        QuantitiesPackage eINSTANCE = model.data.quantities.impl.QuantitiesPackageImpl.init();

        /**
         * The meta object id for the '{@link model.data.quantities.impl.DistanceImpl <em>Distance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.DistanceImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getDistance()
         * @generated
         */
        int DISTANCE = 0;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Distance</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Distance</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DISTANCE_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.TimeImpl <em>Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.TimeImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getTime()
         * @generated
         */
        int TIME = 1;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Time</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Time</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TIME_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.VelocityImpl <em>Velocity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.VelocityImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getVelocity()
         * @generated
         */
        int VELOCITY = 2;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VELOCITY__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VELOCITY__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VELOCITY__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Velocity</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VELOCITY_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Velocity</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VELOCITY_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.MassImpl <em>Mass</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.MassImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getMass()
         * @generated
         */
        int MASS = 3;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Mass</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Mass</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MASS_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.ForceImpl <em>Force</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.ForceImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getForce()
         * @generated
         */
        int FORCE = 4;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORCE__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORCE__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORCE__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Force</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORCE_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Force</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORCE_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.EfficiencyImpl <em>Efficiency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.EfficiencyImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getEfficiency()
         * @generated
         */
        int EFFICIENCY = 5;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EFFICIENCY__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EFFICIENCY__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EFFICIENCY__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Efficiency</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EFFICIENCY_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Efficiency</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EFFICIENCY_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.EnergyImpl <em>Energy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.EnergyImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getEnergy()
         * @generated
         */
        int ENERGY = 6;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ENERGY__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ENERGY__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ENERGY__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Energy</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ENERGY_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Energy</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ENERGY_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.data.quantities.impl.PowerImpl <em>Power</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.data.quantities.impl.PowerImpl
         * @see model.data.quantities.impl.QuantitiesPackageImpl#getPower()
         * @generated
         */
        int POWER = 7;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POWER__ID = DataPackage.QUANTITY_KIND__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POWER__NAME = DataPackage.QUANTITY_KIND__NAME;

        /**
         * The feature id for the '<em><b>Units</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POWER__UNITS = DataPackage.QUANTITY_KIND__UNITS;

        /**
         * The number of structural features of the '<em>Power</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POWER_FEATURE_COUNT = DataPackage.QUANTITY_KIND_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Power</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POWER_OPERATION_COUNT = DataPackage.QUANTITY_KIND_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.data.quantities.Distance <em>Distance</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Distance</em>'.
         * @see model.data.quantities.Distance
         * @generated
         */
        EClass getDistance();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Time <em>Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Time</em>'.
         * @see model.data.quantities.Time
         * @generated
         */
        EClass getTime();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Velocity <em>Velocity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Velocity</em>'.
         * @see model.data.quantities.Velocity
         * @generated
         */
        EClass getVelocity();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Mass <em>Mass</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Mass</em>'.
         * @see model.data.quantities.Mass
         * @generated
         */
        EClass getMass();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Force <em>Force</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Force</em>'.
         * @see model.data.quantities.Force
         * @generated
         */
        EClass getForce();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Efficiency <em>Efficiency</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Efficiency</em>'.
         * @see model.data.quantities.Efficiency
         * @generated
         */
        EClass getEfficiency();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Energy <em>Energy</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Energy</em>'.
         * @see model.data.quantities.Energy
         * @generated
         */
        EClass getEnergy();

        /**
         * Returns the meta object for class '{@link model.data.quantities.Power <em>Power</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Power</em>'.
         * @see model.data.quantities.Power
         * @generated
         */
        EClass getPower();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        QuantitiesFactory getQuantitiesFactory();

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
                 * The meta object literal for the '{@link model.data.quantities.impl.DistanceImpl <em>Distance</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.DistanceImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getDistance()
                 * @generated
                 */
                EClass DISTANCE = eINSTANCE.getDistance();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.TimeImpl <em>Time</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.TimeImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getTime()
                 * @generated
                 */
                EClass TIME = eINSTANCE.getTime();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.VelocityImpl <em>Velocity</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.VelocityImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getVelocity()
                 * @generated
                 */
                EClass VELOCITY = eINSTANCE.getVelocity();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.MassImpl <em>Mass</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.MassImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getMass()
                 * @generated
                 */
                EClass MASS = eINSTANCE.getMass();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.ForceImpl <em>Force</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.ForceImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getForce()
                 * @generated
                 */
                EClass FORCE = eINSTANCE.getForce();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.EfficiencyImpl <em>Efficiency</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.EfficiencyImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getEfficiency()
                 * @generated
                 */
                EClass EFFICIENCY = eINSTANCE.getEfficiency();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.EnergyImpl <em>Energy</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.EnergyImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getEnergy()
                 * @generated
                 */
                EClass ENERGY = eINSTANCE.getEnergy();

                /**
                 * The meta object literal for the '{@link model.data.quantities.impl.PowerImpl <em>Power</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.data.quantities.impl.PowerImpl
                 * @see model.data.quantities.impl.QuantitiesPackageImpl#getPower()
                 * @generated
                 */
                EClass POWER = eINSTANCE.getPower();

        }

} //QuantitiesPackage
