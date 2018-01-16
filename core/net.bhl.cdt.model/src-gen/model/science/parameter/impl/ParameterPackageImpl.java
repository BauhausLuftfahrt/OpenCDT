/**
 */
package model.science.parameter.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.engineering.EngineeringPackage;

import model.engineering.impl.EngineeringPackageImpl;

import model.science.SciencePackage;

import model.science.impl.SciencePackageImpl;

import model.science.parameter.DateParameter;
import model.science.parameter.DistanceParameter;
import model.science.parameter.ParameterFactory;
import model.science.parameter.ParameterPackage;
import model.science.parameter.StringParameter;
import model.science.parameter.TimeParameter;

import model.science.quantities.QuantitiesPackage;

import model.science.quantities.impl.QuantitiesPackageImpl;

import model.science.unit.UnitPackage;

import model.science.unit.impl.UnitPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class ParameterPackageImpl extends EPackageImpl implements ParameterPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass stringParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dateParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass distanceParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass timeParameterEClass = null;

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
         * @see model.science.parameter.ParameterPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private ParameterPackageImpl() {
                super(eNS_URI, ParameterFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link ParameterPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static ParameterPackage init() {
                if (isInited) return (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);

                // Obtain or create and register package
                ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ParameterPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                SciencePackageImpl theSciencePackage = (SciencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) instanceof SciencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) : SciencePackage.eINSTANCE);
                QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
                UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);
                EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) instanceof EngineeringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI) : EngineeringPackage.eINSTANCE);

                // Create package meta-data objects
                theParameterPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theSciencePackage.createPackageContents();
                theQuantitiesPackage.createPackageContents();
                theUnitPackage.createPackageContents();
                theEngineeringPackage.createPackageContents();

                // Initialize created meta-data
                theParameterPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theSciencePackage.initializePackageContents();
                theQuantitiesPackage.initializePackageContents();
                theUnitPackage.initializePackageContents();
                theEngineeringPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theParameterPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(ParameterPackage.eNS_URI, theParameterPackage);
                return theParameterPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStringParameter() {
                return stringParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStringParameter_Value() {
                return (EAttribute)stringParameterEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDateParameter() {
                return dateParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDateParameter_Value() {
                return (EAttribute)dateParameterEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDistanceParameter() {
                return distanceParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTimeParameter() {
                return timeParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterFactory getParameterFactory() {
                return (ParameterFactory)getEFactoryInstance();
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
                stringParameterEClass = createEClass(STRING_PARAMETER);
                createEAttribute(stringParameterEClass, STRING_PARAMETER__VALUE);

                dateParameterEClass = createEClass(DATE_PARAMETER);
                createEAttribute(dateParameterEClass, DATE_PARAMETER__VALUE);

                distanceParameterEClass = createEClass(DISTANCE_PARAMETER);

                timeParameterEClass = createEClass(TIME_PARAMETER);
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
                stringParameterEClass.getESuperTypes().add(theSciencePackage.getIParameter());
                dateParameterEClass.getESuperTypes().add(theSciencePackage.getIParameter());
                EGenericType g1 = createEGenericType(theSciencePackage.getIQuantifiedParameter());
                EGenericType g2 = createEGenericType(theQuantitiesPackage.getDistance());
                g1.getETypeArguments().add(g2);
                distanceParameterEClass.getEGenericSuperTypes().add(g1);
                g1 = createEGenericType(theSciencePackage.getIQuantifiedParameter());
                g2 = createEGenericType(theQuantitiesPackage.getTime());
                g1.getETypeArguments().add(g2);
                timeParameterEClass.getEGenericSuperTypes().add(g1);

                // Initialize classes, features, and operations; add parameters
                initEClass(stringParameterEClass, StringParameter.class, "StringParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStringParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(dateParameterEClass, DateParameter.class, "DateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDateParameter_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(distanceParameterEClass, DistanceParameter.class, "DistanceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(timeParameterEClass, TimeParameter.class, "TimeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        }

} //ParameterPackageImpl
