/**
 */
package model.base.impl;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;
import model.base.BaseFactory;
import model.base.BasePackage;

import model.data.DataPackage;

import model.data.impl.DataPackageImpl;

import model.quantities.QuantitiesPackage;

import model.quantities.impl.QuantitiesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
		QuantitiesPackageImpl theQuantitiesPackage = (QuantitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) instanceof QuantitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantitiesPackage.eNS_URI) : QuantitiesPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theQuantitiesPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theQuantitiesPackage.initializePackageContents();

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aNamedItemEClass, ANamedItem.class, "ANamedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANamedItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ANamedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aIdentifiableItemEClass, AIdentifiableItem.class, "AIdentifiableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIdentifiableItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, AIdentifiableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
