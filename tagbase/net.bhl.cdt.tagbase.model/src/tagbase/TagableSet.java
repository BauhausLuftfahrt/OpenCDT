/**
 */
package tagbase;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagable Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.TagableSet#getDataItems <em>Data Items</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getTagableSet()
 * @model
 * @generated
 */
public interface TagableSet extends AbstractLoggedItem, NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Items</b></em>' reference list.
	 * The list contents are of type {@link tagbase.ITagable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Items</em>' reference list.
	 * @see tagbase.TagbasePackage#getTagableSet_DataItems()
	 * @model
	 * @generated
	 */
	EList<ITagable> getDataItems();

} // TagableSet
