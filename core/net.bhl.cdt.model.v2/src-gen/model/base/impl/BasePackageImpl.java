/**
 */
package model.base.impl;

import model.base.AIdentifiableItem;
import model.base.AModelContainerItem;
import model.base.ANamedItem;
import model.base.BaseFactory;
import model.base.BasePackage;
import model.base.Component;
import model.base.ModelContainer;

import model.data.DataPackage;

import model.data.impl.DataPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class BasePackageImpl extends EPackageImpl implements BasePackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass aNamedItemEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass aIdentifiableItemEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass modelContainerEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass aModelContainerItemEClass = null;

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
         * @see model.base.BasePackage#eNS_URI
         * @see #init()
         * @generated
         */
        private BasePackageImpl() {
                super(eNS_URI, BaseFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static BasePackage init() {
                if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

                // Obtain or create and register package
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

                // Create package meta-data objects
                theBasePackage.createPackageContents();
                theDataPackage.createPackageContents();

                // Initialize created meta-data
                theBasePackage.initializePackageContents();
                theDataPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theBasePackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
                return theBasePackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getANamedItem() {
                return aNamedItemEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getANamedItem_Name() {
                return (EAttribute)aNamedItemEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAIdentifiableItem() {
                return aIdentifiableItemEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAIdentifiableItem_Id() {
                return (EAttribute)aIdentifiableItemEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getModelContainer() {
                return modelContainerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getModelContainer_ContainedItems() {
                return (EReference)modelContainerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAModelContainerItem() {
                return aModelContainerItemEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAModelContainerItem_Container() {
                return (EReference)aModelContainerItemEClass.getEStructuralFeatures().get(0);
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
        public BaseFactory getBaseFactory() {
                return (BaseFactory)getEFactoryInstance();
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
                aNamedItemEClass = createEClass(ANAMED_ITEM);
                createEAttribute(aNamedItemEClass, ANAMED_ITEM__NAME);

                aIdentifiableItemEClass = createEClass(AIDENTIFIABLE_ITEM);
                createEAttribute(aIdentifiableItemEClass, AIDENTIFIABLE_ITEM__ID);

                modelContainerEClass = createEClass(MODEL_CONTAINER);
                createEReference(modelContainerEClass, MODEL_CONTAINER__CONTAINED_ITEMS);

                aModelContainerItemEClass = createEClass(AMODEL_CONTAINER_ITEM);
                createEReference(aModelContainerItemEClass, AMODEL_CONTAINER_ITEM__CONTAINER);

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
                DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                modelContainerEClass.getESuperTypes().add(this.getANamedItem());
                modelContainerEClass.getESuperTypes().add(this.getAIdentifiableItem());
                aModelContainerItemEClass.getESuperTypes().add(this.getAIdentifiableItem());
                aModelContainerItemEClass.getESuperTypes().add(this.getANamedItem());
                systemEClass.getESuperTypes().add(this.getAModelContainerItem());
                systemEClass.getESuperTypes().add(theDataPackage.getIDataEntity());
                componentEClass.getESuperTypes().add(theDataPackage.getIDataEntity());

                // Initialize classes, features, and operations; add parameters
                initEClass(aNamedItemEClass, ANamedItem.class, "ANamedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getANamedItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ANamedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(aIdentifiableItemEClass, AIdentifiableItem.class, "AIdentifiableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getAIdentifiableItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, AIdentifiableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(modelContainerEClass, ModelContainer.class, "ModelContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getModelContainer_ContainedItems(), this.getAModelContainerItem(), this.getAModelContainerItem_Container(), "containedItems", null, 0, -1, ModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(aModelContainerItemEClass, AModelContainerItem.class, "AModelContainerItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAModelContainerItem_Container(), this.getModelContainer(), this.getModelContainer_ContainedItems(), "container", null, 1, 1, AModelContainerItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(systemEClass, model.base.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getSystem_Components(), this.getComponent(), null, "components", null, 0, -1, model.base.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getComponent_ContainingComponent(), this.getComponent(), this.getComponent_SubComponents(), "containingComponent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getComponent_SubComponents(), this.getComponent(), this.getComponent_ContainingComponent(), "subComponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //BasePackageImpl
