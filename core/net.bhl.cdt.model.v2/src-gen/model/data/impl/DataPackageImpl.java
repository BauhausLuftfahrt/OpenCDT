/**
 */
package model.data.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.AUnit;
import model.data.AValue;
import model.data.DataFactory;
import model.data.DataPackage;
import model.data.IDataEntity;
import model.data.IDimension;
import model.data.IDimensionParameter;
import model.data.IParameter;

import model.quantities.QuantitiesPackage;

import model.quantities.impl.QuantitiesPackageImpl;

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
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	private EClass aUnitEClass = null;

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	private EClass aValueEClass = null;

	/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass iDimensionEClass = null;

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
        private EClass iDimensionParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	private EClass iDataEntityEClass = null;

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

                // Create package meta-data objects
                theDataPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theQuantitiesPackage.createPackageContents();

                // Initialize created meta-data
                theDataPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theQuantitiesPackage.initializePackageContents();

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
	public EClass getAUnit() {
                return aUnitEClass;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EReference getAUnit_Parameter() {
                return (EReference)aUnitEClass.getEStructuralFeatures().get(0);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EAttribute getAUnit_Symbol() {
                return (EAttribute)aUnitEClass.getEStructuralFeatures().get(1);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EClass getAValue() {
                return aValueEClass;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EReference getAValue_Parameter() {
                return (EReference)aValueEClass.getEStructuralFeatures().get(0);
        }

	/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getIDimension() {
                return iDimensionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getIDimension_Units() {
                return (EReference)iDimensionEClass.getEStructuralFeatures().get(0);
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
        public EClass getIDimensionParameter() {
                return iDimensionParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getIDimensionParameter_Dimension() {
                return (EReference)iDimensionParameterEClass.getEStructuralFeatures().get(0);
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
                aUnitEClass = createEClass(AUNIT);
                createEReference(aUnitEClass, AUNIT__PARAMETER);
                createEAttribute(aUnitEClass, AUNIT__SYMBOL);

                aValueEClass = createEClass(AVALUE);
                createEReference(aValueEClass, AVALUE__PARAMETER);

                iDimensionEClass = createEClass(IDIMENSION);
                createEReference(iDimensionEClass, IDIMENSION__UNITS);

                iParameterEClass = createEClass(IPARAMETER);

                iDimensionParameterEClass = createEClass(IDIMENSION_PARAMETER);
                createEReference(iDimensionParameterEClass, IDIMENSION_PARAMETER__DIMENSION);

                iDataEntityEClass = createEClass(IDATA_ENTITY);
                createEReference(iDataEntityEClass, IDATA_ENTITY__PARAMETERS);
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

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                aUnitEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iDimensionEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDimensionEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDimensionParameterEClass.getESuperTypes().add(this.getIParameter());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getANamedItem());

                // Initialize classes, features, and operations; add parameters
                initEClass(aUnitEClass, AUnit.class, "AUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAUnit_Parameter(), this.getIParameter(), null, "parameter", null, 1, 1, AUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAUnit_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, AUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(aValueEClass, AValue.class, "AValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAValue_Parameter(), this.getIParameter(), null, "parameter", null, 1, 1, AValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iDimensionEClass, IDimension.class, "IDimension", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDimension_Units(), this.getAUnit(), null, "units", null, 0, -1, IDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iParameterEClass, IParameter.class, "IParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(iDimensionParameterEClass, IDimensionParameter.class, "IDimensionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDimensionParameter_Dimension(), this.getIDimension(), null, "dimension", null, 1, 1, IDimensionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iDataEntityEClass, IDataEntity.class, "IDataEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDataEntity_Parameters(), this.getIParameter(), null, "parameters", null, 0, -1, IDataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //DataPackageImpl
