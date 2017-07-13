/**
 */
package model.data.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.DataFactory;
import model.data.DataPackage;
import model.data.DateParameter;
import model.data.IDataEntity;
import model.data.IDimension;
import model.data.IParameter;
import model.data.StringParameter;

import model.data.measure.MeasurePackage;

import model.data.measure.impl.MeasurePackageImpl;

import model.experimental.ExperimentalPackage;

import model.experimental.impl.ExperimentalPackageImpl;

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
        private EClass iDataEntityEClass = null;

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
                MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) instanceof MeasurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) : MeasurePackage.eINSTANCE);
                ExperimentalPackageImpl theExperimentalPackage = (ExperimentalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI) instanceof ExperimentalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI) : ExperimentalPackage.eINSTANCE);

                // Create package meta-data objects
                theDataPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theMeasurePackage.createPackageContents();
                theExperimentalPackage.createPackageContents();

                // Initialize created meta-data
                theDataPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theMeasurePackage.initializePackageContents();
                theExperimentalPackage.initializePackageContents();

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
                iDimensionEClass = createEClass(IDIMENSION);
                createEReference(iDimensionEClass, IDIMENSION__UNITS);

                iParameterEClass = createEClass(IPARAMETER);

                iDataEntityEClass = createEClass(IDATA_ENTITY);
                createEReference(iDataEntityEClass, IDATA_ENTITY__PARAMETERS);

                stringParameterEClass = createEClass(STRING_PARAMETER);
                createEAttribute(stringParameterEClass, STRING_PARAMETER__VALUE);

                dateParameterEClass = createEClass(DATE_PARAMETER);
                createEAttribute(dateParameterEClass, DATE_PARAMETER__VALUE);
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
                MeasurePackage theMeasurePackage = (MeasurePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);
                BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

                // Add subpackages
                getESubpackages().add(theMeasurePackage);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                iDimensionEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDimensionEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                iParameterEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getAIdentifiableItem());
                iDataEntityEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                stringParameterEClass.getESuperTypes().add(this.getIParameter());
                dateParameterEClass.getESuperTypes().add(this.getIParameter());

                // Initialize classes, features, and operations; add parameters
                initEClass(iDimensionEClass, IDimension.class, "IDimension", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDimension_Units(), theMeasurePackage.getAUnit(), null, "units", null, 0, -1, IDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iParameterEClass, IParameter.class, "IParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(iDataEntityEClass, IDataEntity.class, "IDataEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getIDataEntity_Parameters(), this.getIParameter(), null, "parameters", null, 0, -1, IDataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(stringParameterEClass, StringParameter.class, "StringParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStringParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(dateParameterEClass, DateParameter.class, "DateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDateParameter_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //DataPackageImpl
