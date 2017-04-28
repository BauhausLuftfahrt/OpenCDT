/**
 */
package cdtliterature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incollection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.Incollection#getAuthor <em>Author</em>}</li>
 *   <li>{@link cdtliterature.Incollection#getTitle <em>Title</em>}</li>
 *   <li>{@link cdtliterature.Incollection#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link cdtliterature.Incollection#getYear <em>Year</em>}</li>
 *   <li>{@link cdtliterature.Incollection#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link cdtliterature.Incollection#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @see cdtliterature.CdtliteraturePackage#getIncollection()
 * @model
 * @generated
 */
public interface Incollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Booktitle()
	 * @model
	 * @generated
	 */
	String getBooktitle();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getBooktitle <em>Booktitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booktitle</em>' attribute.
	 * @see #getBooktitle()
	 * @generated
	 */
	void setBooktitle(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Publisher()
	 * @model
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference.
	 * @see #setBooks(Book)
	 * @see cdtliterature.CdtliteraturePackage#getIncollection_Books()
	 * @model
	 * @generated
	 */
	Book getBooks();

	/**
	 * Sets the value of the '{@link cdtliterature.Incollection#getBooks <em>Books</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Books</em>' reference.
	 * @see #getBooks()
	 * @generated
	 */
	void setBooks(Book value);

} // Incollection
