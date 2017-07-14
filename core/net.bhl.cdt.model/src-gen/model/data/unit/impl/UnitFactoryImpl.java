/**
 */
package model.data.unit.impl;

import model.data.unit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFactoryImpl extends EFactoryImpl implements UnitFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static UnitFactory init() {
                try {
                        UnitFactory theUnitFactory = (UnitFactory)EPackage.Registry.INSTANCE.getEFactory(UnitPackage.eNS_URI);
                        if (theUnitFactory != null) {
                                return theUnitFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new UnitFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnitFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case UnitPackage.DISTANCE_UNIT: return createDistanceUnit();
                        case UnitPackage.TIME_UNIT: return createTimeUnit();
                        case UnitPackage.MASS_UNIT: return createMassUnit();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DistanceUnit createDistanceUnit() {
                DistanceUnitImpl distanceUnit = new DistanceUnitImpl();
                return distanceUnit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TimeUnit createTimeUnit() {
                TimeUnitImpl timeUnit = new TimeUnitImpl();
                return timeUnit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MassUnit createMassUnit() {
                MassUnitImpl massUnit = new MassUnitImpl();
                return massUnit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnitPackage getUnitPackage() {
                return (UnitPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static UnitPackage getPackage() {
                return UnitPackage.eINSTANCE;
        }

} //UnitFactoryImpl
