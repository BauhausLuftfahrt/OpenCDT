/**
 */
package model.engineering.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.engineering.Component;
import model.engineering.EngineeringFactory;
import model.engineering.EngineeringPackage;

import model.science.SciencePackage;

import model.science.impl.SciencePackageImpl;

import model.science.parameter.ParameterPackage;

import model.science.parameter.impl.ParameterPackageImpl;

import model.science.quantities.QuantitiesPackage;

import model.science.quantities.impl.QuantitiesPackageImpl;

import model.science.unit.UnitPackage;

import model.science.unit.impl.UnitPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringPackageImpl extends EPackageImpl implements EngineeringPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass systemEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass componentEClass = null;

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
         * @see model.engineering.EngineeringPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private EngineeringPackageImpl() {
                super(eNS_URI, EngineeringFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link EngineeringPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static EngineeringPackage init() {
                if (isInited) return (EngineeringPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);

                // Obtain or create and register package
                EngineeringPackageImpl theEngineeringPackage = (EngineeringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EngineeringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EngineeringPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                SciencePackageImpl theSciencePackage = (SciencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) instanceof SciencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI) : SciencePackage.eINSTANCE);
                QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
                ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) : ParameterPackage.eINSTANCE);
                UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

                // Create package meta-data objects
                theEngineeringPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theSciencePackage.createPackageContents();
                theQuantitiesPackage.createPackageContents();
                theParameterPackage.createPackageContents();
                theUnitPackage.createPackageContents();

                // Initialize created meta-data
                theEngineeringPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theSciencePackage.initializePackageContents();
                theQuantitiesPackage.initializePackageContents();
                theParameterPackage.initializePackageContents();
                theUnitPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theEngineeringPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(EngineeringPackage.eNS_URI, theEngineeringPackage);
                return theEngineeringPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSystem() {
                return systemEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSystem_Components() {
                return (EReference)systemEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getComponent() {
                return componentEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getComponent_ContainingComponent() {
                return (EReference)componentEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getComponent_SubComponents() {
                return (EReference)componentEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EngineeringFactory getEngineeringFactory() {
                return (EngineeringFactory)getEFactoryInstance();
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
                systemEClass = createEClass(SYSTEM);
                createEReference(systemEClass, SYSTEM__COMPONENTS);

                componentEClass = createEClass(COMPONENT);
                createEReference(componentEClass, COMPONENT__CONTAINING_COMPONENT);
                createEReference(componentEClass, COMPONENT__SUB_COMPONENTS);
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
                BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
                SciencePackage theSciencePackage = (SciencePackage)EPackage.Registry.INSTANCE.getEPackage(SciencePackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                systemEClass.getESuperTypes().add(theBasePackage.getAModelContainerItem());
                systemEClass.getESuperTypes().add(theSciencePackage.getIDataEntity());
                componentEClass.getESuperTypes().add(theSciencePackage.getIDataEntity());

                // Initialize classes, features, and operations; add parameters
                initEClass(systemEClass, model.engineering.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getSystem_Components(), this.getComponent(), null, "components", null, 0, -1, model.engineering.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getComponent_ContainingComponent(), this.getComponent(), this.getComponent_SubComponents(), "containingComponent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getComponent_SubComponents(), this.getComponent(), this.getComponent_ContainingComponent(), "subComponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //EngineeringPackageImpl
