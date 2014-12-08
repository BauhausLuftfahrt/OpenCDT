/**
 */
package net.bhl.cdt.model.system.quantities.impl;

import javax.measure.quantity.Length;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryPackage;
import net.bhl.cdt.model.geometry.impl.GeometryPackageImpl;
import net.bhl.cdt.model.impl.ModelPackageImpl;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.impl.DesignoperationsPackageImpl;
import net.bhl.cdt.model.process.impl.ProcessPackageImpl;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.impl.SelectionPackageImpl;
import net.bhl.cdt.model.system.SystemPackage;
import net.bhl.cdt.model.system.impl.SystemPackageImpl;
import net.bhl.cdt.model.system.quantities.LengthValue;
import net.bhl.cdt.model.system.quantities.QuantitiesFactory;
import net.bhl.cdt.model.system.quantities.QuantitiesPackage;
import net.bhl.cdt.model.units.UnitsPackage;
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
	private EClass lengthValueEClass = null;

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
	private EDataType amountEDataType = null;

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
	 * @see net.bhl.cdt.model.system.quantities.QuantitiesPackage#eNS_URI
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
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		DesignoperationsPackageImpl theDesignoperationsPackage = (DesignoperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) instanceof DesignoperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignoperationsPackage.eNS_URI) : DesignoperationsPackage.eINSTANCE);
		SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI) : SelectionPackage.eINSTANCE);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI) : GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theQuantitiesPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theDesignoperationsPackage.createPackageContents();
		theSelectionPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theQuantitiesPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theDesignoperationsPackage.initializePackageContents();
		theSelectionPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

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
	public EClass getLengthValue() {
		return lengthValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthValue_Value() {
		return (EAttribute)lengthValueEClass.getEStructuralFeatures().get(0);
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
	public EDataType getAmount() {
		return amountEDataType;
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
		lengthValueEClass = createEClass(LENGTH_VALUE);
		createEAttribute(lengthValueEClass, LENGTH_VALUE__VALUE);

		// Create data types
		lengthEDataType = createEDataType(LENGTH);
		amountEDataType = createEDataType(AMOUNT);
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		UnitsPackage theUnitsPackage = (UnitsPackage)EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter amountEDataType_Q = addETypeParameter(amountEDataType, "Q");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUnitsPackage.getQuantity());
		amountEDataType_Q.getEBounds().add(g1);

		// Add supertypes to classes
		lengthValueEClass.getESuperTypes().add(theSystemPackage.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(lengthValueEClass, LengthValue.class, "LengthValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getAmount());
		EGenericType g2 = createEGenericType(this.getLength());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLengthValue_Value(), g1, "value", null, 0, 1, LengthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(lengthEDataType, Length.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(amountEDataType, Amount.class, "Amount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //QuantitiesPackageImpl
