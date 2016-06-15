/**
 */
package tagbase;

import net.bhl.cdt.model.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tagbase.NamedTag#getTagDefinition <em>Tag Definition</em>}</li>
 * </ul>
 *
 * @see tagbase.TagbasePackage#getNamedTag()
 * @model
 * @generated
 */
public interface NamedTag extends Tag, NamedElement {
	/**
	 * Returns the value of the '<em><b>Tag Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Definition</em>' reference.
	 * @see #setTagDefinition(NamedTagDefinition)
	 * @see tagbase.TagbasePackage#getNamedTag_TagDefinition()
	 * @model required="true"
	 * @generated
	 */
	NamedTagDefinition getTagDefinition();

	/**
	 * Sets the value of the '{@link tagbase.NamedTag#getTagDefinition <em>Tag Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Definition</em>' reference.
	 * @see #getTagDefinition()
	 * @generated
	 */
	void setTagDefinition(NamedTagDefinition value);

} // NamedTag
