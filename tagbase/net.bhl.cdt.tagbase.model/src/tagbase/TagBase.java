/**
 */
package tagbase;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.TagBase#getTables <em>Tables</em>}</li>
 *   <li>{@link tagbase.TagBase#getTagDefinitions <em>Tag Definitions</em>}</li>
 *   <li>{@link tagbase.TagBase#getTagSets <em>Tag Sets</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getTagBase()
 * @model
 * @generated
 */
public interface TagBase extends AbstractLoggedItem, NamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link tagbase.TagableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see tagbase.TagbasePackage#getTagBase_Tables()
	 * @model
	 * @generated
	 */
	EList<TagableSet> getTables();

	/**
	 * Returns the value of the '<em><b>Tag Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link tagbase.NamedTagDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Definitions</em>' containment reference list.
	 * @see tagbase.TagbasePackage#getTagBase_TagDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTagDefinition> getTagDefinitions();

	/**
	 * Returns the value of the '<em><b>Tag Sets</b></em>' containment reference list.
	 * The list contents are of type {@link tagbase.TagSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Sets</em>' containment reference list.
	 * @see tagbase.TagbasePackage#getTagBase_TagSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TagSet> getTagSets();

} // TagBase
