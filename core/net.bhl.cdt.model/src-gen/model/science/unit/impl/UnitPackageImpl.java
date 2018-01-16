/**
 */
package model.science.unit.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.engineering.EngineeringPackage;

import model.engineering.impl.EngineeringPackageImpl;

import model.science.SciencePackage;

import model.science.impl.SciencePackageImpl;

import model.science.parameter.ParameterPackage;

import model.science.parameter.impl.ParameterPackageImpl;

import model.science.quantities.QuantitiesPackage;

import model.science.quantities.impl.QuantitiesPackageImpl;

import model.science.unit.DistanceUnit;
import model.science.unit.MassUnit;
import model.science.unit.TimeUnit;
import model.science.unit.UnitFactory;
import model.science.unit.UnitPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitPackageImpl extends EPackageImpl implements UnitPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass distanceUnitEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass timeUnitEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass massUnitEClass = null;

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
         * @see model.science.unit.UnitPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private UnitPackageImpl() {
                super(eNS_URI, UnitFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link UnitPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static UnitPackage init() {
                if (isInited) return (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

                // Obtain or create and register package
                UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnitPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                SciencePackageImpl theSciencePackage = (SciencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) instanceof SciencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) : SciencePackage.eINSTANCE);
                QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
                ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) : ParameterPackage.eINSTANCE);
                EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) instanceof EngineeringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) : EngineeringPackage.eINSTANCE);

                // Create package meta-data objects
                theUnitPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theSciencePackage.createPackageContents();
                theQuantitiesPackage.createPackageContents();
                theParameterPackage.createPackageContents();
                theEngineeringPackage.createPackageContents();

                // Initialize created meta-data
                theUnitPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theSciencePackage.initializePackageContents();
                theQuantitiesPackage.initializePackageContents();
                theParameterPackage.initializePackageContents();
                theEngineeringPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theUnitPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(UnitPackage.eNS_URI, theUnitPackage);
                return theUnitPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDistanceUnit() {
                return distanceUnitEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTimeUnit() {
                return timeUnitEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMassUnit() {
                return massUnitEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnitFactory getUnitFactory() {
                return (UnitFactory)getEFactoryInstance();
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
                distanceUnitEClass = createEClass(DISTANCE_UNIT);

                timeUnitEClass = createEClass(TIME_UNIT);

                massUnitEClass = createEClass(MASS_UNIT);
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
                QuantitiesPackage theQuantitiesPackage = (QuantitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                EGenericType g1 = createEGenericType(theSciencePackage.getUnit());
                EGenericType g2 = createEGenericType(theQuantitiesPackage.getDistance());
                g1.getETypeArguments().add(g2);
                distanceUnitEClass.getEGenericSuperTypes().add(g1);
                g1 = createEGenericType(theSciencePackage.getUnit());
                g2 = createEGenericType(theQuantitiesPackage.getTime());
                g1.getETypeArguments().add(g2);
                timeUnitEClass.getEGenericSuperTypes().add(g1);
                g1 = createEGenericType(theSciencePackage.getUnit());
                g2 = createEGenericType(theQuantitiesPackage.getMass());
                g1.getETypeArguments().add(g2);
                massUnitEClass.getEGenericSuperTypes().add(g1);

                // Initialize classes, features, and operations; add parameters
                initEClass(distanceUnitEClass, DistanceUnit.class, "DistanceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(timeUnitEClass, TimeUnit.class, "TimeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(massUnitEClass, MassUnit.class, "MassUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        }

} //UnitPackageImpl
