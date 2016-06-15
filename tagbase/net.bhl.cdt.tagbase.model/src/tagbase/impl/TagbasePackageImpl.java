/**
 */
package tagbase.impl;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tagbase.AbstractLoggedItem;
import tagbase.ITagable;
import tagbase.NamedTag;
import tagbase.NamedTagDefinition;
import tagbase.Tag;
import tagbase.TagBase;
import tagbase.TagDefinitionSet;
import tagbase.TagSet;
import tagbase.TagbaseFactory;
import tagbase.TagbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagbasePackageImpl extends EPackageImpl implements TagbasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTagableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLoggedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTagDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagDefinitionSetEClass = null;

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
	 * @see tagbase.TagbasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TagbasePackageImpl() {
		super(eNS_URI, TagbaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TagbasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TagbasePackage init() {
		if (isInited) return (TagbasePackage)EPackage.Registry.INSTANCE.getEPackage(TagbasePackage.eNS_URI);

		// Obtain or create and register package
		TagbasePackageImpl theTagbasePackage = (TagbasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TagbasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TagbasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTagbasePackage.createPackageContents();

		// Initialize created meta-data
		theTagbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTagbasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TagbasePackage.eNS_URI, theTagbasePackage);
		return theTagbasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagBase() {
		return tagBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagBase_TagDefinitions() {
		return (EReference)tagBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagBase_TagSets() {
		return (EReference)tagBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITagable() {
		return iTagableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITagable_Tags() {
		return (EReference)iTagableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTag() {
		return namedTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTag_TagDefinition() {
		return (EReference)namedTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLoggedItem() {
		return abstractLoggedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLoggedItem_Creator() {
		return (EAttribute)abstractLoggedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLoggedItem_CreationDate() {
		return (EAttribute)abstractLoggedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLoggedItem_LastChanger() {
		return (EAttribute)abstractLoggedItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLoggedItem_LastChangeDate() {
		return (EAttribute)abstractLoggedItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTagDefinition() {
		return namedTagDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedTagDefinition_Description() {
		return (EAttribute)namedTagDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagSet() {
		return tagSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagSet_Tags() {
		return (EReference)tagSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagDefinitionSet() {
		return tagDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagDefinitionSet_Items() {
		return (EReference)tagDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagbaseFactory getTagbaseFactory() {
		return (TagbaseFactory)getEFactoryInstance();
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
		tagBaseEClass = createEClass(TAG_BASE);
		createEReference(tagBaseEClass, TAG_BASE__TAG_DEFINITIONS);
		createEReference(tagBaseEClass, TAG_BASE__TAG_SETS);

		iTagableEClass = createEClass(ITAGABLE);
		createEReference(iTagableEClass, ITAGABLE__TAGS);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__VALUE);

		namedTagEClass = createEClass(NAMED_TAG);
		createEReference(namedTagEClass, NAMED_TAG__TAG_DEFINITION);

		abstractLoggedItemEClass = createEClass(ABSTRACT_LOGGED_ITEM);
		createEAttribute(abstractLoggedItemEClass, ABSTRACT_LOGGED_ITEM__CREATOR);
		createEAttribute(abstractLoggedItemEClass, ABSTRACT_LOGGED_ITEM__CREATION_DATE);
		createEAttribute(abstractLoggedItemEClass, ABSTRACT_LOGGED_ITEM__LAST_CHANGER);
		createEAttribute(abstractLoggedItemEClass, ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE);

		namedTagDefinitionEClass = createEClass(NAMED_TAG_DEFINITION);
		createEAttribute(namedTagDefinitionEClass, NAMED_TAG_DEFINITION__DESCRIPTION);

		tagSetEClass = createEClass(TAG_SET);
		createEReference(tagSetEClass, TAG_SET__TAGS);

		tagDefinitionSetEClass = createEClass(TAG_DEFINITION_SET);
		createEReference(tagDefinitionSetEClass, TAG_DEFINITION_SET__ITEMS);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tagBaseEClass.getESuperTypes().add(this.getAbstractLoggedItem());
		tagBaseEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		iTagableEClass.getESuperTypes().add(this.getAbstractLoggedItem());
		tagEClass.getESuperTypes().add(this.getAbstractLoggedItem());
		namedTagEClass.getESuperTypes().add(this.getTag());
		namedTagEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		namedTagDefinitionEClass.getESuperTypes().add(this.getAbstractLoggedItem());
		namedTagDefinitionEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		tagSetEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		tagSetEClass.getESuperTypes().add(this.getAbstractLoggedItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(tagBaseEClass, TagBase.class, "TagBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagBase_TagDefinitions(), this.getTagDefinitionSet(), null, "TagDefinitions", null, 1, 1, TagBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagBase_TagSets(), this.getTagSet(), null, "TagSets", null, 0, -1, TagBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTagableEClass, ITagable.class, "ITagable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getITagable_Tags(), this.getTag(), null, "Tags", null, 0, -1, ITagable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedTagEClass, NamedTag.class, "NamedTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedTag_TagDefinition(), this.getNamedTagDefinition(), null, "TagDefinition", null, 1, 1, NamedTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLoggedItemEClass, AbstractLoggedItem.class, "AbstractLoggedItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractLoggedItem_Creator(), ecorePackage.getEString(), "Creator", null, 0, 1, AbstractLoggedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractLoggedItem_CreationDate(), ecorePackage.getEDate(), "CreationDate", null, 0, 1, AbstractLoggedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractLoggedItem_LastChanger(), ecorePackage.getEString(), "LastChanger", null, 0, 1, AbstractLoggedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractLoggedItem_LastChangeDate(), ecorePackage.getEDate(), "LastChangeDate", null, 0, 1, AbstractLoggedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedTagDefinitionEClass, NamedTagDefinition.class, "NamedTagDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedTagDefinition_Description(), ecorePackage.getEString(), "Description", null, 0, 1, NamedTagDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagSetEClass, TagSet.class, "TagSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagSet_Tags(), this.getNamedTag(), null, "Tags", null, 0, -1, TagSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagDefinitionSetEClass, TagDefinitionSet.class, "TagDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagDefinitionSet_Items(), this.getNamedTagDefinition(), null, "Items", null, 0, -1, TagDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TagbasePackageImpl
