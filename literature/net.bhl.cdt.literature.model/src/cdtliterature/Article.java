/**
 */
package cdtliterature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.Article#getJournal <em>Journal</em>}</li>
 * </ul>
 *
 * @see cdtliterature.CdtliteraturePackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends ALiteratureBase {
	/**
	 * Returns the value of the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal</em>' attribute.
	 * @see #setJournal(String)
	 * @see cdtliterature.CdtliteraturePackage#getArticle_Journal()
	 * @model
	 * @generated
	 */
	String getJournal();

	/**
	 * Sets the value of the '{@link cdtliterature.Article#getJournal <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal</em>' attribute.
	 * @see #getJournal()
	 * @generated
	 */
	void setJournal(String value);

} // Article
