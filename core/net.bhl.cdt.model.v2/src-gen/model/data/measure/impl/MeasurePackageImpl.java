/**
 */
package model.data.measure.impl;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.DataPackage;

import model.data.impl.DataPackageImpl;

import model.data.measure.ADimension;
import model.data.measure.AUnit;
import model.data.measure.Length;
import model.data.measure.MeasureFactory;
import model.data.measure.MeasurePackage;
import model.data.measure.Meter;

import model.experimental.ExperimentalPackage;

import model.experimental.impl.ExperimentalPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurePackageImpl extends EPackageImpl implements MeasurePackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass aDimensionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass lengthEClass = null;

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
        private EClass meterEClass = null;

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
         * @see model.data.measure.MeasurePackage#eNS_URI
         * @see #init()
         * @generated
         */
        private MeasurePackageImpl() {
                super(eNS_URI, MeasureFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link MeasurePackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static MeasurePackage init() {
                if (isInited) return (MeasurePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);

                // Obtain or create and register package
                MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasurePackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
                ExperimentalPackageImpl theExperimentalPackage = (ExperimentalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI) instanceof ExperimentalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI) : ExperimentalPackage.eINSTANCE);

                // Create package meta-data objects
                theMeasurePackage.createPackageContents();
                theBasePackage.createPackageContents();
                theDataPackage.createPackageContents();
                theExperimentalPackage.createPackageContents();

                // Initialize created meta-data
                theMeasurePackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theDataPackage.initializePackageContents();
                theExperimentalPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theMeasurePackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(MeasurePackage.eNS_URI, theMeasurePackage);
                return theMeasurePackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getADimension() {
                return aDimensionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getLength() {
                return lengthEClass;
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
        public EClass getMeter() {
                return meterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMeter_Symbol() {
                return (EAttribute)meterEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureFactory getMeasureFactory() {
                return (MeasureFactory)getEFactoryInstance();
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
                aDimensionEClass = createEClass(ADIMENSION);

                lengthEClass = createEClass(LENGTH);

                aUnitEClass = createEClass(AUNIT);

                meterEClass = createEClass(METER);
                createEAttribute(meterEClass, METER__SYMBOL);
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
                ETypeParameter aUnitEClass_D = addETypeParameter(aUnitEClass, "D");

                // Set bounds for type parameters
                EGenericType g1 = createEGenericType(this.getADimension());
                aUnitEClass_D.getEBounds().add(g1);

                // Add supertypes to classes
                aDimensionEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                lengthEClass.getESuperTypes().add(this.getADimension());
                aUnitEClass.getESuperTypes().add(theBasePackage.getANamedItem());
                g1 = createEGenericType(this.getAUnit());
                EGenericType g2 = createEGenericType(this.getLength());
                g1.getETypeArguments().add(g2);
                meterEClass.getEGenericSuperTypes().add(g1);

                // Initialize classes, features, and operations; add parameters
                initEClass(aDimensionEClass, ADimension.class, "ADimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(aUnitEClass, AUnit.class, "AUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(meterEClass, Meter.class, "Meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMeter_Symbol(), ecorePackage.getEString(), "symbol", "m", 0, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        }

} //MeasurePackageImpl
