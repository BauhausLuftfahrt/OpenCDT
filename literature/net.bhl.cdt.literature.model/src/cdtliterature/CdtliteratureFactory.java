/**
 */
package cdtliterature;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cdtliterature.CdtliteraturePackage
 * @generated
 */
public interface CdtliteratureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdtliteratureFactory eINSTANCE = cdtliterature.impl.CdtliteratureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Article</em>'.
	 * @generated
	 */
	Article createArticle();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns a new object of class '<em>Inbook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inbook</em>'.
	 * @generated
	 */
	Inbook createInbook();

	/**
	 * Returns a new object of class '<em>Conference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conference</em>'.
	 * @generated
	 */
	Conference createConference();

	/**
	 * Returns a new object of class '<em>Incollection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incollection</em>'.
	 * @generated
	 */
	Incollection createIncollection();

	/**
	 * Returns a new object of class '<em>Inproceedings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inproceedings</em>'.
	 * @generated
	 */
	Inproceedings createInproceedings();

	/**
	 * Returns a new object of class '<em>Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceedings</em>'.
	 * @generated
	 */
	Proceedings createProceedings();

	/**
	 * Returns a new object of class '<em>Techreport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Techreport</em>'.
	 * @generated
	 */
	Techreport createTechreport();

	/**
	 * Returns a new object of class '<em>Phdthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phdthesis</em>'.
	 * @generated
	 */
	Phdthesis createPhdthesis();

	/**
	 * Returns a new object of class '<em>Masterthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masterthesis</em>'.
	 * @generated
	 */
	Masterthesis createMasterthesis();

	/**
	 * Returns a new object of class '<em>Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unpublished</em>'.
	 * @generated
	 */
	Unpublished createUnpublished();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CdtliteraturePackage getCdtliteraturePackage();

} //CdtliteratureFactory
