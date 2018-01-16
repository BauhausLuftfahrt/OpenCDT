/**
 */
package model.science.quantities.impl;

import model.science.quantities.*;

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
public class QuantitiesFactoryImpl extends EFactoryImpl implements QuantitiesFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static QuantitiesFactory init() {
                try {
                        QuantitiesFactory theQuantitiesFactory = (QuantitiesFactory)EPackage.Registry.INSTANCE.getEFactory(QuantitiesPackage.eNS_URI);
                        if (theQuantitiesFactory != null) {
                                return theQuantitiesFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new QuantitiesFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitiesFactoryImpl() {
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
                        case QuantitiesPackage.DISTANCE: return createDistance();
                        case QuantitiesPackage.TIME: return createTime();
                        case QuantitiesPackage.VELOCITY: return createVelocity();
                        case QuantitiesPackage.MASS: return createMass();
                        case QuantitiesPackage.FORCE: return createForce();
                        case QuantitiesPackage.EFFICIENCY: return createEfficiency();
                        case QuantitiesPackage.ENERGY: return createEnergy();
                        case QuantitiesPackage.POWER: return createPower();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Distance createDistance() {
                DistanceImpl distance = new DistanceImpl();
                return distance;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Time createTime() {
                TimeImpl time = new TimeImpl();
                return time;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Velocity createVelocity() {
                VelocityImpl velocity = new VelocityImpl();
                return velocity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mass createMass() {
                MassImpl mass = new MassImpl();
                return mass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Force createForce() {
                ForceImpl force = new ForceImpl();
                return force;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Efficiency createEfficiency() {
                EfficiencyImpl efficiency = new EfficiencyImpl();
                return efficiency;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Energy createEnergy() {
                EnergyImpl energy = new EnergyImpl();
                return energy;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Power createPower() {
                PowerImpl power = new PowerImpl();
                return power;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitiesPackage getQuantitiesPackage() {
                return (QuantitiesPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static QuantitiesPackage getPackage() {
                return QuantitiesPackage.eINSTANCE;
        }

} //QuantitiesFactoryImpl
