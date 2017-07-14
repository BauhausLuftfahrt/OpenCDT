/**
 */
package model.data.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.DataFactory;
import model.data.DataPackage;
import model.data.IDataEntity;
import model.data.IParameter;
import model.data.IQuantifiedParameter;
import model.data.QuantityKind;
import model.data.QuantitySet;
import model.data.Unit;

import model.data.parameter.ParameterPackage;

import model.data.parameter.impl.ParameterPackageImpl;

import model.data.quantities.QuantitiesPackage;

import model.data.quantities.impl.QuantitiesPackageImpl;

import model.data.unit.UnitPackage;

import model.data.unit.impl.UnitPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass quantitySetEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass quantityKindEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass unitEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass iDataEntityEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass iParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass iQuantifiedParameterEClass = null;

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
         * @see model.data.DataPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private DataPackageImpl() {
                super(eNS_URI, DataFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static DataPackage init() {
                if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

                // Obtain or create and register package
                DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);
                ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) instanceof ParameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI) : ParameterPackage.eINSTANCE);
                UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

                // Create package meta-data objects
                theDataPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theQuantitiesPackage.createPackageContents();
                theParameterPackage.createPackageContents();
                theUnitPackage.createPackageContents();

                // Initialize created meta-data
                theDataPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theQuantitiesPackage.initializePackageContents();
                theParameterPackage.initializePackageContents();
                theUnitPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theDataPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
                return theDataPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getQuantitySet() {
                return quantitySetEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getQuantitySet_QuantityKinds() {
                return (EReference)quantitySetEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getQuantityKind() {
                return quantityKindEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getQuantityKind_Units() {
                return (EReference)quantityKindEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getUnit() {
                return unitEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getUnit_Symbol() {
                return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getIDataEntity() {
                return iDataEntityEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getIDataEntity_Parameters() {
                return (EReference)iDataEntityEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getIParameter() {
                return iParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getIQuantifiedParameter() {
                return iQuantifiedParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getIQuantifiedParameter_Value() {
                return (EAttribute)iQuantifiedParameterEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getIQuantifiedParameter_Unit() {
                return (EReference)iQuantifiedParameterEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getIQuantifiedParameter_Quantity() {
                return (EReference)iQuantifiedParameterEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DataFactory getDataFactory() {
                return (DataFactory)getEFactoryInstance();
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
                quantitySetEClass = createEClass(QUANTITY_SET);
                createEReference(quantitySetEClass, QUANTITY_SET__QUANTITY_KINDS);

                quantityKindEClass = createEClass(QUANTITY_KIND);
                createEReference(quantityKindEClass, QUANTITY_KIND__UNITS);

                unitEClass = createEClass(UNIT);
                createEAttribute(unitEClass, UNIT__SYMBOL);

                iDataEntityEClass = createEClass(IDATA_ENTITY);
                createEReference(iDataEntityEClass, IDATA_ENTITY__PARAMETERS);

                iParameterEClass = createEClass(IPARAMETER);

                iQuantifiedParameterEClass = createEClass(IQUANTIFIED_PARAMETER);
                createEAttribute(iQuantifiedParameterEClass, IQUANTIFIED_PARAMETER__VALUE);
                createEReference(iQuantifiedParameterEClass, IQUANTIFIED_PARAMETER__UNIT);
                createEReference(iQuantifiedParameterEClass, IQUANTIFIED_PARAMETER__QUANTITY);
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
                QuantitiesPackage theQuantitiesPackage = (QuantitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI);
                ParameterPackage theParameterPackage = (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);
                UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);
                BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

                // Add subpackages
                getESubpackages().add(theQuantitiesPackage);
                getESubpackages().add(theParameterPackage);
                getESubpackages().add(theUnitPackage);

                // Create type parameters
                ETypeParameter unitEClass_Q = addETypeParameter(unitEClass, "Q");
                ETypeParameter iQuantifiedParameterEClass_Q = addETypeParameter(iQuantifiedParameterEClass, "Q");

                // Set bounds for type parameters
                EGenericType g1 = createEGenericType(this.getQuantityKind());
                unitEClass_Q.getEBounds().add(g1);
                g1 = createEGenericType(this.getQuantityKind());
                iQuantifiedParameterEClass_Q.getEBounds().add(g1);

                // Add supertypes to classes
                quantitySetEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                quantitySetEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                quantityKindEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                quantityKindEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                unitEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iQuantifiedParameterEClass.getESuperTypes().add(this.getIParameter());

                // Initialize classes, features, and operations; add parameters
                initEClass(quantitySetEClass, QuantitySet.class, "QuantitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getQuantitySet_QuantityKinds(), this.getQuantityKind(), null, "quantityKinds", null, 0, -1, QuantitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(quantityKindEClass, QuantityKind.class, "QuantityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                g1 = createEGenericType(this.getUnit());
                EGenericType g2 = createEGenericType();
                g1.getETypeArguments().add(g2);
                initEReference(getQuantityKind_Units(), g1, null, "units", null, 0, -1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getUnit_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iDataEntityEClass, IDataEntity.class, "IDataEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDataEntity_Parameters(), this.getIParameter(), null, "parameters", null, 0, -1, IDataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iParameterEClass, IParameter.class, "IParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(iQuantifiedParameterEClass, IQuantifiedParameter.class, "IQuantifiedParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getIQuantifiedParameter_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, IQuantifiedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                g1 = createEGenericType(this.getUnit());
                g2 = createEGenericType(iQuantifiedParameterEClass_Q);
                g1.getETypeArguments().add(g2);
                initEReference(getIQuantifiedParameter_Unit(), g1, null, "unit", null, 1, 1, IQuantifiedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                g1 = createEGenericType(iQuantifiedParameterEClass_Q);
                initEReference(getIQuantifiedParameter_Quantity(), g1, null, "quantity", null, 1, 1, IQuantifiedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //DataPackageImpl
