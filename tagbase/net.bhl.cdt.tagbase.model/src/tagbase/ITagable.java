/**
 */
package tagbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITagable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.ITagable#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getITagable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITagable extends AbstractLoggedItem {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link tagbase.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see tagbase.TagbasePackage#getITagable_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // ITagable
