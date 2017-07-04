/**
 */
package model.quantities.impl;

import javax.measure.quantity.Length;
import javax.measure.quantity.Quantity;

import javax.measure.unit.Unit;

import model.base.BasePackage;

import model.base.impl.BasePackageImpl;

import model.data.DataPackage;

import model.data.impl.DataPackageImpl;

import model.quantities.INumberParameter;
import model.quantities.LengthParamenter;
import model.quantities.QuantitiesFactory;
import model.quantities.QuantitiesPackage;
import model.quantities.StringParameter;

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
public class QuantitiesPackageImpl extends EPackageImpl implements QuantitiesPackage {
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
	private EClass iNumberParameterEClass = null;

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	private EClass lengthParamenterEClass = null;

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
         * @see model.quantities.QuantitiesPackage#eNS_URI
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
                DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

                // Create package meta-data objects
                theQuantitiesPackage.createPackageContents();
                theBasePackage.createPackageContents();
                theDataPackage.createPackageContents();

                // Initialize created meta-data
                theQuantitiesPackage.initializePackageContents();
                theBasePackage.initializePackageContents();
                theDataPackage.initializePackageContents();

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
	public EClass getINumberParameter() {
                return iNumberParameterEClass;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EClass getLengthParamenter() {
                return lengthParamenterEClass;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EAttribute getLengthParamenter_Value() {
                return (EAttribute)lengthParamenterEClass.getEStructuralFeatures().get(0);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public EAttribute getLengthParamenter_Unit() {
                return (EAttribute)lengthParamenterEClass.getEStructuralFeatures().get(1);
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
                stringParameterEClass = createEClass(STRING_PARAMETER);
                createEAttribute(stringParameterEClass, STRING_PARAMETER__VALUE);

                iNumberParameterEClass = createEClass(INUMBER_PARAMETER);

                lengthParamenterEClass = createEClass(LENGTH_PARAMENTER);
                createEAttribute(lengthParamenterEClass, LENGTH_PARAMENTER__VALUE);
                createEAttribute(lengthParamenterEClass, LENGTH_PARAMENTER__UNIT);

                // Create data types
                lengthEDataType = createEDataType(LENGTH);
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
                ETypeParameter amountEDataType_Q = addETypeParameter(amountEDataType, "Q");
                ETypeParameter unitEDataType_Q = addETypeParameter(unitEDataType, "Q");

                // Set bounds for type parameters
                EGenericType g1 = createEGenericType(this.getQuantity());
                amountEDataType_Q.getEBounds().add(g1);
                g1 = createEGenericType(this.getQuantity());
                unitEDataType_Q.getEBounds().add(g1);

                // Add supertypes to classes
                stringParameterEClass.getESuperTypes().add(theDataPackage.getIParameter());
                iNumberParameterEClass.getESuperTypes().add(theDataPackage.getIParameter());
                lengthParamenterEClass.getESuperTypes().add(this.getINumberParameter());

                // Initialize classes, features, and operations; add parameters
                initEClass(stringParameterEClass, StringParameter.class, "StringParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStringParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(iNumberParameterEClass, INumberParameter.class, "INumberParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(lengthParamenterEClass, LengthParamenter.class, "LengthParamenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                g1 = createEGenericType(this.getAmount());
                EGenericType g2 = createEGenericType(this.getLength());
                g1.getETypeArguments().add(g2);
                initEAttribute(getLengthParamenter_Value(), g1, "value", null, 0, 1, LengthParamenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                g1 = createEGenericType(this.getUnit());
                g2 = createEGenericType(this.getLength());
                g1.getETypeArguments().add(g2);
                initEAttribute(getLengthParamenter_Unit(), g1, "unit", null, 0, 1, LengthParamenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize data types
                initEDataType(lengthEDataType, Length.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(distanceEDataType, Length.class, "Distance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(amountEDataType, Amount.class, "Amount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(quantityEDataType, Quantity.class, "Quantity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

                // Create resource
                createResource(eNS_URI);
        }

} //QuantitiesPackageImpl
