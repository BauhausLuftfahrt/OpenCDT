/**
 */
package tagbase;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tagbase.TagbaseFactory
 * @model kind="package"
 * @generated
 */
public interface TagbasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tagbase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/tagbase.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TagbasePackage eINSTANCE = tagbase.impl.TagbasePackageImpl.init();

	/**
	 * The meta object id for the '{@link tagbase.AbstractLoggedItem <em>Abstract Logged Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.AbstractLoggedItem
	 * @see tagbase.impl.TagbasePackageImpl#getAbstractLoggedItem()
	 * @generated
	 */
	int ABSTRACT_LOGGED_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM__LAST_CHANGER = 2;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Logged Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Logged Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOGGED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tagbase.impl.TagBaseImpl <em>Tag Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.TagBaseImpl
	 * @see tagbase.impl.TagbasePackageImpl#getTagBase()
	 * @generated
	 */
	int TAG_BASE = 0;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__CREATOR = ABSTRACT_LOGGED_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__CREATION_DATE = ABSTRACT_LOGGED_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__LAST_CHANGER = ABSTRACT_LOGGED_ITEM__LAST_CHANGER;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__LAST_CHANGE_DATE = ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__NAME = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tag Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__TAG_DEFINITIONS = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tag Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE__TAG_SETS = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE_FEATURE_COUNT = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tag Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASE_OPERATION_COUNT = ABSTRACT_LOGGED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tagbase.ITagable <em>ITagable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.ITagable
	 * @see tagbase.impl.TagbasePackageImpl#getITagable()
	 * @generated
	 */
	int ITAGABLE = 1;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE__CREATOR = ABSTRACT_LOGGED_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE__CREATION_DATE = ABSTRACT_LOGGED_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE__LAST_CHANGER = ABSTRACT_LOGGED_ITEM__LAST_CHANGER;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE__LAST_CHANGE_DATE = ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE__TAGS = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ITagable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE_FEATURE_COUNT = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ITagable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGABLE_OPERATION_COUNT = ABSTRACT_LOGGED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tagbase.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.TagImpl
	 * @see tagbase.impl.TagbasePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CREATOR = ABSTRACT_LOGGED_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CREATION_DATE = ABSTRACT_LOGGED_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__LAST_CHANGER = ABSTRACT_LOGGED_ITEM__LAST_CHANGER;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__LAST_CHANGE_DATE = ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = ABSTRACT_LOGGED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tagbase.impl.NamedTagImpl <em>Named Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.NamedTagImpl
	 * @see tagbase.impl.TagbasePackageImpl#getNamedTag()
	 * @generated
	 */
	int NAMED_TAG = 3;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__CREATOR = TAG__CREATOR;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__CREATION_DATE = TAG__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__LAST_CHANGER = TAG__LAST_CHANGER;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__LAST_CHANGE_DATE = TAG__LAST_CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__VALUE = TAG__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__NAME = TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tag Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG__TAG_DEFINITION = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tagbase.impl.NamedTagDefinitionImpl <em>Named Tag Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.NamedTagDefinitionImpl
	 * @see tagbase.impl.TagbasePackageImpl#getNamedTagDefinition()
	 * @generated
	 */
	int NAMED_TAG_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__CREATOR = ABSTRACT_LOGGED_ITEM__CREATOR;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__CREATION_DATE = ABSTRACT_LOGGED_ITEM__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__LAST_CHANGER = ABSTRACT_LOGGED_ITEM__LAST_CHANGER;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__LAST_CHANGE_DATE = ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__NAME = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION__DESCRIPTION = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Tag Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION_FEATURE_COUNT = ABSTRACT_LOGGED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Tag Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TAG_DEFINITION_OPERATION_COUNT = ABSTRACT_LOGGED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tagbase.impl.TagSetImpl <em>Tag Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.TagSetImpl
	 * @see tagbase.impl.TagbasePackageImpl#getTagSet()
	 * @generated
	 */
	int TAG_SET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__CREATOR = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__CREATION_DATE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Changer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__LAST_CHANGER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__LAST_CHANGE_DATE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET__TAGS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tag Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tag Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_SET_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link tagbase.impl.TagDefinitionSetImpl <em>Tag Definition Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tagbase.impl.TagDefinitionSetImpl
	 * @see tagbase.impl.TagbasePackageImpl#getTagDefinitionSet()
	 * @generated
	 */
	int TAG_DEFINITION_SET = 7;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_SET__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Tag Definition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag Definition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tagbase.TagBase <em>Tag Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Base</em>'.
	 * @see tagbase.TagBase
	 * @generated
	 */
	EClass getTagBase();

	/**
	 * Returns the meta object for the containment reference '{@link tagbase.TagBase#getTagDefinitions <em>Tag Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag Definitions</em>'.
	 * @see tagbase.TagBase#getTagDefinitions()
	 * @see #getTagBase()
	 * @generated
	 */
	EReference getTagBase_TagDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link tagbase.TagBase#getTagSets <em>Tag Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag Sets</em>'.
	 * @see tagbase.TagBase#getTagSets()
	 * @see #getTagBase()
	 * @generated
	 */
	EReference getTagBase_TagSets();

	/**
	 * Returns the meta object for class '{@link tagbase.ITagable <em>ITagable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITagable</em>'.
	 * @see tagbase.ITagable
	 * @generated
	 */
	EClass getITagable();

	/**
	 * Returns the meta object for the containment reference list '{@link tagbase.ITagable#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see tagbase.ITagable#getTags()
	 * @see #getITagable()
	 * @generated
	 */
	EReference getITagable_Tags();

	/**
	 * Returns the meta object for class '{@link tagbase.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see tagbase.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tagbase.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link tagbase.NamedTag <em>Named Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Tag</em>'.
	 * @see tagbase.NamedTag
	 * @generated
	 */
	EClass getNamedTag();

	/**
	 * Returns the meta object for the reference '{@link tagbase.NamedTag#getTagDefinition <em>Tag Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag Definition</em>'.
	 * @see tagbase.NamedTag#getTagDefinition()
	 * @see #getNamedTag()
	 * @generated
	 */
	EReference getNamedTag_TagDefinition();

	/**
	 * Returns the meta object for class '{@link tagbase.AbstractLoggedItem <em>Abstract Logged Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Logged Item</em>'.
	 * @see tagbase.AbstractLoggedItem
	 * @generated
	 */
	EClass getAbstractLoggedItem();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.AbstractLoggedItem#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see tagbase.AbstractLoggedItem#getCreator()
	 * @see #getAbstractLoggedItem()
	 * @generated
	 */
	EAttribute getAbstractLoggedItem_Creator();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.AbstractLoggedItem#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see tagbase.AbstractLoggedItem#getCreationDate()
	 * @see #getAbstractLoggedItem()
	 * @generated
	 */
	EAttribute getAbstractLoggedItem_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.AbstractLoggedItem#getLastChanger <em>Last Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Changer</em>'.
	 * @see tagbase.AbstractLoggedItem#getLastChanger()
	 * @see #getAbstractLoggedItem()
	 * @generated
	 */
	EAttribute getAbstractLoggedItem_LastChanger();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.AbstractLoggedItem#getLastChangeDate <em>Last Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Change Date</em>'.
	 * @see tagbase.AbstractLoggedItem#getLastChangeDate()
	 * @see #getAbstractLoggedItem()
	 * @generated
	 */
	EAttribute getAbstractLoggedItem_LastChangeDate();

	/**
	 * Returns the meta object for class '{@link tagbase.NamedTagDefinition <em>Named Tag Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Tag Definition</em>'.
	 * @see tagbase.NamedTagDefinition
	 * @generated
	 */
	EClass getNamedTagDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tagbase.NamedTagDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tagbase.NamedTagDefinition#getDescription()
	 * @see #getNamedTagDefinition()
	 * @generated
	 */
	EAttribute getNamedTagDefinition_Description();

	/**
	 * Returns the meta object for class '{@link tagbase.TagSet <em>Tag Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Set</em>'.
	 * @see tagbase.TagSet
	 * @generated
	 */
	EClass getTagSet();

	/**
	 * Returns the meta object for the containment reference list '{@link tagbase.TagSet#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see tagbase.TagSet#getTags()
	 * @see #getTagSet()
	 * @generated
	 */
	EReference getTagSet_Tags();

	/**
	 * Returns the meta object for class '{@link tagbase.TagDefinitionSet <em>Tag Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Definition Set</em>'.
	 * @see tagbase.TagDefinitionSet
	 * @generated
	 */
	EClass getTagDefinitionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link tagbase.TagDefinitionSet#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see tagbase.TagDefinitionSet#getItems()
	 * @see #getTagDefinitionSet()
	 * @generated
	 */
	EReference getTagDefinitionSet_Items();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TagbaseFactory getTagbaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tagbase.impl.TagBaseImpl <em>Tag Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.TagBaseImpl
		 * @see tagbase.impl.TagbasePackageImpl#getTagBase()
		 * @generated
		 */
		EClass TAG_BASE = eINSTANCE.getTagBase();

		/**
		 * The meta object literal for the '<em><b>Tag Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_BASE__TAG_DEFINITIONS = eINSTANCE.getTagBase_TagDefinitions();

		/**
		 * The meta object literal for the '<em><b>Tag Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_BASE__TAG_SETS = eINSTANCE.getTagBase_TagSets();

		/**
		 * The meta object literal for the '{@link tagbase.ITagable <em>ITagable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.ITagable
		 * @see tagbase.impl.TagbasePackageImpl#getITagable()
		 * @generated
		 */
		EClass ITAGABLE = eINSTANCE.getITagable();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITAGABLE__TAGS = eINSTANCE.getITagable_Tags();

		/**
		 * The meta object literal for the '{@link tagbase.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.TagImpl
		 * @see tagbase.impl.TagbasePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '{@link tagbase.impl.NamedTagImpl <em>Named Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.NamedTagImpl
		 * @see tagbase.impl.TagbasePackageImpl#getNamedTag()
		 * @generated
		 */
		EClass NAMED_TAG = eINSTANCE.getNamedTag();

		/**
		 * The meta object literal for the '<em><b>Tag Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TAG__TAG_DEFINITION = eINSTANCE.getNamedTag_TagDefinition();

		/**
		 * The meta object literal for the '{@link tagbase.AbstractLoggedItem <em>Abstract Logged Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.AbstractLoggedItem
		 * @see tagbase.impl.TagbasePackageImpl#getAbstractLoggedItem()
		 * @generated
		 */
		EClass ABSTRACT_LOGGED_ITEM = eINSTANCE.getAbstractLoggedItem();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOGGED_ITEM__CREATOR = eINSTANCE.getAbstractLoggedItem_Creator();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOGGED_ITEM__CREATION_DATE = eINSTANCE.getAbstractLoggedItem_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Changer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOGGED_ITEM__LAST_CHANGER = eINSTANCE.getAbstractLoggedItem_LastChanger();

		/**
		 * The meta object literal for the '<em><b>Last Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LOGGED_ITEM__LAST_CHANGE_DATE = eINSTANCE.getAbstractLoggedItem_LastChangeDate();

		/**
		 * The meta object literal for the '{@link tagbase.impl.NamedTagDefinitionImpl <em>Named Tag Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.NamedTagDefinitionImpl
		 * @see tagbase.impl.TagbasePackageImpl#getNamedTagDefinition()
		 * @generated
		 */
		EClass NAMED_TAG_DEFINITION = eINSTANCE.getNamedTagDefinition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TAG_DEFINITION__DESCRIPTION = eINSTANCE.getNamedTagDefinition_Description();

		/**
		 * The meta object literal for the '{@link tagbase.impl.TagSetImpl <em>Tag Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.TagSetImpl
		 * @see tagbase.impl.TagbasePackageImpl#getTagSet()
		 * @generated
		 */
		EClass TAG_SET = eINSTANCE.getTagSet();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_SET__TAGS = eINSTANCE.getTagSet_Tags();

		/**
		 * The meta object literal for the '{@link tagbase.impl.TagDefinitionSetImpl <em>Tag Definition Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tagbase.impl.TagDefinitionSetImpl
		 * @see tagbase.impl.TagbasePackageImpl#getTagDefinitionSet()
		 * @generated
		 */
		EClass TAG_DEFINITION_SET = eINSTANCE.getTagDefinitionSet();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_DEFINITION_SET__ITEMS = eINSTANCE.getTagDefinitionSet_Items();

	}

} //TagbasePackage
