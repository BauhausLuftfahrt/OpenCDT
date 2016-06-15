/**
 */
package tagbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Definition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.TagDefinitionSet#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getTagDefinitionSet()
 * @model
 * @generated
 */
public interface TagDefinitionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link tagbase.NamedTagDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see tagbase.TagbasePackage#getTagDefinitionSet_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedTagDefinition> getItems();

} // TagDefinitionSet
