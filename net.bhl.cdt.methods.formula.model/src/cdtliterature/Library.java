/**
 */
package cdtliterature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdtliterature.Library#getName <em>Name</em>}</li>
 *   <li>{@link cdtliterature.Library#getArticle <em>Article</em>}</li>
 *   <li>{@link cdtliterature.Library#getBook <em>Book</em>}</li>
 *   <li>{@link cdtliterature.Library#getInbook <em>Inbook</em>}</li>
 *   <li>{@link cdtliterature.Library#getConference <em>Conference</em>}</li>
 *   <li>{@link cdtliterature.Library#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link cdtliterature.Library#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link cdtliterature.Library#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link cdtliterature.Library#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link cdtliterature.Library#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link cdtliterature.Library#getMasterthesis <em>Masterthesis</em>}</li>
 *   <li>{@link cdtliterature.Library#getUnpublished <em>Unpublished</em>}</li>
 * </ul>
 *
 * @see cdtliterature.CdtliteraturePackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cdtliterature.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Article</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Article}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Article</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Article()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticle();

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Book()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBook();

	/**
	 * Returns the value of the '<em><b>Inbook</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Inbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbook</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbook</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Inbook()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inbook> getInbook();

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Conference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conference</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Conference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conference> getConference();

	/**
	 * Returns the value of the '<em><b>Incollection</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Incollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incollection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incollection</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Incollection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Incollection> getIncollection();

	/**
	 * Returns the value of the '<em><b>Inproceedings</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Inproceedings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inproceedings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inproceedings</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Inproceedings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inproceedings> getInproceedings();

	/**
	 * Returns the value of the '<em><b>Proceedings</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Proceedings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proceedings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proceedings</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Proceedings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proceedings> getProceedings();

	/**
	 * Returns the value of the '<em><b>Techreport</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Techreport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Techreport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techreport</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Techreport()
	 * @model containment="true"
	 * @generated
	 */
	EList<Techreport> getTechreport();

	/**
	 * Returns the value of the '<em><b>Phdthesis</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Phdthesis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phdthesis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phdthesis</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Phdthesis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phdthesis> getPhdthesis();

	/**
	 * Returns the value of the '<em><b>Masterthesis</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Masterthesis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masterthesis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masterthesis</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Masterthesis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Masterthesis> getMasterthesis();

	/**
	 * Returns the value of the '<em><b>Unpublished</b></em>' containment reference list.
	 * The list contents are of type {@link cdtliterature.Unpublished}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unpublished</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unpublished</em>' containment reference list.
	 * @see cdtliterature.CdtliteraturePackage#getLibrary_Unpublished()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unpublished> getUnpublished();

} // Library
