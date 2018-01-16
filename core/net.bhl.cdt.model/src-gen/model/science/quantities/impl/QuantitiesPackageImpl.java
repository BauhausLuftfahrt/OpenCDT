/**
 */
package model.science.quantities.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.engineering.EngineeringPackage;

import model.engineering.impl.EngineeringPackageImpl;

import model.science.SciencePackage;

import model.science.impl.SciencePackageImpl;

import model.science.parameter.ParameterPackage;

import model.science.parameter.impl.ParameterPackageImpl;

import model.science.quantities.Distance;
import model.science.quantities.Efficiency;
import model.science.quantities.Energy;
import model.science.quantities.Force;
import model.science.quantities.Mass;
import model.science.quantities.Power;
import model.science.quantities.QuantitiesFactory;
import model.science.quantities.QuantitiesPackage;
import model.science.quantities.Time;
import model.science.quantities.Velocity;

import model.science.unit.UnitPackage;

import model.science.unit.impl.UnitPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantitiesPackageImpl extends EPackageImpl implements QuantitiesPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass distanceEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass timeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass velocityEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass massEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass forceEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass efficiencyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass energyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass powerEClass = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see model.science.quantities.QuantitiesPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private QuantitiesPackageImpl() {
                super(eNS_URI, QuantitiesFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link QuantitiesPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static QuantitiesPackage init() {
                if (isInited) return (QuantitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI);

                // Obtain or create and register package
                QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuantitiesPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                SciencePackageImpl theSciencePackage = (SciencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) instanceof SciencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) : SciencePackage.eINSTANCE);
                ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) : ParameterPackage.eINSTANCE);
                UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);
                EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) instanceof EngineeringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) : EngineeringPackage.eINSTANCE);

                // Create package meta-data objects
                theQuantitiesPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theSciencePackage.createPackageContents();
                theParameterPackage.createPackageContents();
                theUnitPackage.createPackageContents();
                theEngineeringPackage.createPackageContents();

                // Initialize created meta-data
                theQuantitiesPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theSciencePackage.initializePackageContents();
                theParameterPackage.initializePackageContents();
                theUnitPackage.initializePackageContents();
                theEngineeringPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theQuantitiesPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(QuantitiesPackage.eNS_URI, theQuantitiesPackage);
                return theQuantitiesPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDistance() {
                return distanceEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTime() {
                return timeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getVelocity() {
                return velocityEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMass() {
                return massEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getForce() {
                return forceEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getEfficiency() {
                return efficiencyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getEnergy() {
                return energyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getPower() {
                return powerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitiesFactory getQuantitiesFactory() {
                return (QuantitiesFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                distanceEClass = createEClass(DISTANCE);

                timeEClass = createEClass(TIME);

                velocityEClass = createEClass(VELOCITY);

                massEClass = createEClass(MASS);

                forceEClass = createEClass(FORCE);

                efficiencyEClass = createEClass(EFFICIENCY);

                energyEClass = createEClass(ENERGY);

                powerEClass = createEClass(POWER);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Obtain other dependent packages
                SciencePackage theSciencePackage = (SciencePackage)EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                distanceEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                timeEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                velocityEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                massEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                forceEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                efficiencyEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                energyEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());
                powerEClass.getESuperTypes().add(theSciencePackage.getQuantityKind());

                // Initialize classes, features, and operations; add parameters
                initEClass(distanceEClass, Distance.class, "Distance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(velocityEClass, Velocity.class, "Velocity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(massEClass, Mass.class, "Mass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(forceEClass, Force.class, "Force", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(efficiencyEClass, Efficiency.class, "Efficiency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(energyEClass, Energy.class, "Energy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        }

} //QuantitiesPackageImpl
