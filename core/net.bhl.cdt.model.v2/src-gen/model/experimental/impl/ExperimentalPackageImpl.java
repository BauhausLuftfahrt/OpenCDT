/**
 */
package model.experimental.impl;

import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Quantity;

import javax.measure.unit.Unit;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.DataPackage;

import model.data.impl.DataPackageImpl;

import model.data.measure.MeasurePackage;

import model.data.measure.impl.MeasurePackageImpl;

import model.experimental.ExperimentalFactory;
import model.experimental.ExperimentalPackage;
import model.experimental.IQuantifiedParameter;
import model.experimental.LengthParameter;
import model.experimental.MassParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentalPackageImpl extends EPackageImpl implements ExperimentalPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass iQuantifiedParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass lengthParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass massParameterEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType lengthEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType massEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType distanceEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType amountEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType unitEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType quantityEDataType = null;

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
         * @see model.experimental.ExperimentalPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private ExperimentalPackageImpl() {
                super(eNS_URI, ExperimentalFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link ExperimentalPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static ExperimentalPackage init() {
                if (isInited) return (ExperimentalPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentalPackage.eNS_URI);

                // Obtain or create and register package
                ExperimentalPackageImpl theExperimentalPackage = (ExperimentalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExperimentalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExperimentalPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
                DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
                MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) instanceof MeasurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) : MeasurePackage.eINSTANCE);

                // Create package meta-data objects
                theExperimentalPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theDataPackage.createPackageContents();
                theMeasurePackage.createPackageContents();

                // Initialize created meta-data
                theExperimentalPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theDataPackage.initializePackageContents();
                theMeasurePackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theExperimentalPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(ExperimentalPackage.eNS_URI, theExperimentalPackage);
                return theExperimentalPackage;
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
        public EClass getLengthParameter() {
                return lengthParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMassParameter() {
                return massParameterEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getLength() {
                return lengthEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getMass() {
                return massEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getDistance() {
                return distanceEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getAmount() {
                return amountEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getUnit() {
                return unitEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getQuantity() {
                return quantityEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ExperimentalFactory getExperimentalFactory() {
                return (ExperimentalFactory)getEFactoryInstance();
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
                iQuantifiedParameterEClass = createEClass(IQUANTIFIED_PARAMETER);
                createEAttribute(iQuantifiedParameterEClass, IQUANTIFIED_PARAMETER__VALUE);

                lengthParameterEClass = createEClass(LENGTH_PARAMETER);

                massParameterEClass = createEClass(MASS_PARAMETER);

                // Create data types
                lengthEDataType = createEDataType(LENGTH);
                massEDataType = createEDataType(MASS);
                distanceEDataType = createEDataType(DISTANCE);
                amountEDataType = createEDataType(AMOUNT);
                unitEDataType = createEDataType(UNIT);
                quantityEDataType = createEDataType(QUANTITY);
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
                ETypeParameter iQuantifiedParameterEClass_Q = addETypeParameter(iQuantifiedParameterEClass, "Q");
                ETypeParameter amountEDataType_Q = addETypeParameter(amountEDataType, "Q");
                ETypeParameter unitEDataType_Q = addETypeParameter(unitEDataType, "Q");

                // Set bounds for type parameters
                EGenericType g1 = createEGenericType(this.getQuantity());
                iQuantifiedParameterEClass_Q.getEBounds().add(g1);
                g1 = createEGenericType(this.getQuantity());
                amountEDataType_Q.getEBounds().add(g1);
                g1 = createEGenericType(this.getQuantity());
                unitEDataType_Q.getEBounds().add(g1);

                // Add supertypes to classes
                iQuantifiedParameterEClass.getESuperTypes().add(theDataPackage.getIParameter());
                g1 = createEGenericType(this.getIQuantifiedParameter());
                EGenericType g2 = createEGenericType(this.getLength());
                g1.getETypeArguments().add(g2);
                lengthParameterEClass.getEGenericSuperTypes().add(g1);
                g1 = createEGenericType(this.getIQuantifiedParameter());
                g2 = createEGenericType(this.getMass());
                g1.getETypeArguments().add(g2);
                massParameterEClass.getEGenericSuperTypes().add(g1);

                // Initialize classes, features, and operations; add parameters
                initEClass(iQuantifiedParameterEClass, IQuantifiedParameter.class, "IQuantifiedParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                g1 = createEGenericType(this.getAmount());
                g2 = createEGenericType(iQuantifiedParameterEClass_Q);
                g1.getETypeArguments().add(g2);
                initEAttribute(getIQuantifiedParameter_Value(), g1, "value", null, 0, 1, IQuantifiedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(lengthParameterEClass, LengthParameter.class, "LengthParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(massParameterEClass, MassParameter.class, "MassParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                // Initialize data types
                initEDataType(lengthEDataType, Length.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(massEDataType, Mass.class, "Mass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(distanceEDataType, Length.class, "Distance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(amountEDataType, Amount.class, "Amount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(quantityEDataType, Quantity.class, "Quantity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

                // Create resource
                createResource(eNS_URI);
        }

} //ExperimentalPackageImpl
