/**
 */
package cdtliterature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inproceedings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.Inproceedings#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link cdtliterature.Inproceedings#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see cdtliterature.CdtliteraturePackage#getInproceedings()
 * @model
 * @generated
 */
public interface Inproceedings extends ALiteratureBase {
	/**
	 * Returns the value of the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booktitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booktitle</em>' attribute.
	 * @see #setBooktitle(String)
	 * @see cdtliterature.CdtliteraturePackage#getInproceedings_Booktitle()
	 * @model
	 * @generated
	 */
	String getBooktitle();

	/**
	 * Sets the value of the '{@link cdtliterature.Inproceedings#getBooktitle <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booktitle</em>' attribute.
	 * @see #getBooktitle()
	 * @generated
	 */
	void setBooktitle(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' reference.
	 * @see #setArticles(Article)
	 * @see cdtliterature.CdtliteraturePackage#getInproceedings_Articles()
	 * @model
	 * @generated
	 */
	Article getArticles();

	/**
	 * Sets the value of the '{@link cdtliterature.Inproceedings#getArticles <em>Articles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articles</em>' reference.
	 * @see #getArticles()
	 * @generated
	 */
	void setArticles(Article value);

} // Inproceedings
