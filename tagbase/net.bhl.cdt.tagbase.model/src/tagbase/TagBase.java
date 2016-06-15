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
	 * Returns the value of the '<em><b>Tag Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Definitions</em>' containment reference.
	 * @see #setTagDefinitions(TagDefinitionSet)
	 * @see tagbase.TagbasePackage#getTagBase_TagDefinitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TagDefinitionSet getTagDefinitions();

	/**
	 * Sets the value of the '{@link tagbase.TagBase#getTagDefinitions <em>Tag Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Definitions</em>' containment reference.
	 * @see #getTagDefinitions()
	 * @generated
	 */
	void setTagDefinitions(TagDefinitionSet value);

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
