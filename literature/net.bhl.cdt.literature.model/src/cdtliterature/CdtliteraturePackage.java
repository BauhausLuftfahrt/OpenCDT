/**
 */
package cdtliterature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cdtliterature.CdtliteratureFactory
 * @model kind="package"
 * @generated
 */
public interface CdtliteraturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdtliterature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/literature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdtliterature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdtliteraturePackage eINSTANCE = cdtliterature.impl.CdtliteraturePackageImpl.init();

	/**
	 * The meta object id for the '{@link cdtliterature.impl.ALiteratureBaseImpl <em>ALiterature Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.ALiteratureBaseImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getALiteratureBase()
	 * @generated
	 */
	int ALITERATURE_BASE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE__YEAR = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE__REFERENCES = 3;

	/**
	 * The number of structural features of the '<em>ALiterature Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ALiterature Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERATURE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.ArticleImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__JOURNAL = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.BookImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLISHER = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ISBN = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.InbookImpl <em>Inbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.InbookImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getInbook()
	 * @generated
	 */
	int INBOOK = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__PAGES = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__PUBLISHER = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK__BOOK = ALITERATURE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Inbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOOK_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.ConferenceImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__BOOKTITLE = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.IncollectionImpl <em>Incollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.IncollectionImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getIncollection()
	 * @generated
	 */
	int INCOLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__BOOKTITLE = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__PUBLISHER = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION__BOOKS = ALITERATURE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Incollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOLLECTION_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.InproceedingsImpl <em>Inproceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.InproceedingsImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getInproceedings()
	 * @generated
	 */
	int INPROCEEDINGS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Booktitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__BOOKTITLE = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS__ARTICLES = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inproceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inproceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPROCEEDINGS_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.ProceedingsImpl <em>Proceedings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.ProceedingsImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getProceedings()
	 * @generated
	 */
	int PROCEEDINGS = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The number of structural features of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proceedings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.TechreportImpl <em>Techreport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.TechreportImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getTechreport()
	 * @generated
	 */
	int TECHREPORT = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT__INSTITUTION = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Techreport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Techreport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHREPORT_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.PhdthesisImpl <em>Phdthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.PhdthesisImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getPhdthesis()
	 * @generated
	 */
	int PHDTHESIS = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS__SCHOOL = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phdthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phdthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHDTHESIS_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.MasterthesisImpl <em>Masterthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.MasterthesisImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getMasterthesis()
	 * @generated
	 */
	int MASTERTHESIS = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS__TITLE = ALITERATURE_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS__AUTHOR = ALITERATURE_BASE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS__YEAR = ALITERATURE_BASE__YEAR;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS__REFERENCES = ALITERATURE_BASE__REFERENCES;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS__SCHOOL = ALITERATURE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Masterthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS_FEATURE_COUNT = ALITERATURE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Masterthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTERTHESIS_OPERATION_COUNT = ALITERATURE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdtliterature.impl.UnpublishedImpl <em>Unpublished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdtliterature.impl.UnpublishedImpl
	 * @see cdtliterature.impl.CdtliteraturePackageImpl#getUnpublished()
	 * @generated
	 */
	int UNPUBLISHED = 11;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__NOTE = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED__REFERENCES = 3;

	/**
	 * The number of structural features of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Unpublished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPUBLISHED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cdtliterature.ALiteratureBase <em>ALiterature Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALiterature Base</em>'.
	 * @see cdtliterature.ALiteratureBase
	 * @generated
	 */
	EClass getALiteratureBase();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.ALiteratureBase#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cdtliterature.ALiteratureBase#getTitle()
	 * @see #getALiteratureBase()
	 * @generated
	 */
	EAttribute getALiteratureBase_Title();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.ALiteratureBase#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see cdtliterature.ALiteratureBase#getAuthor()
	 * @see #getALiteratureBase()
	 * @generated
	 */
	EAttribute getALiteratureBase_Author();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.ALiteratureBase#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see cdtliterature.ALiteratureBase#getYear()
	 * @see #getALiteratureBase()
	 * @generated
	 */
	EAttribute getALiteratureBase_Year();

	/**
	 * Returns the meta object for the reference list '{@link cdtliterature.ALiteratureBase#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see cdtliterature.ALiteratureBase#getReferences()
	 * @see #getALiteratureBase()
	 * @generated
	 */
	EReference getALiteratureBase_References();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see cdtliterature.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Article#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal</em>'.
	 * @see cdtliterature.Article#getJournal()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Journal();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see cdtliterature.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Book#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see cdtliterature.Book#getPublisher()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Book#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see cdtliterature.Book#getIsbn()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Isbn();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Inbook <em>Inbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbook</em>'.
	 * @see cdtliterature.Inbook
	 * @generated
	 */
	EClass getInbook();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Inbook#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see cdtliterature.Inbook#getPages()
	 * @see #getInbook()
	 * @generated
	 */
	EAttribute getInbook_Pages();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Inbook#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see cdtliterature.Inbook#getPublisher()
	 * @see #getInbook()
	 * @generated
	 */
	EAttribute getInbook_Publisher();

	/**
	 * Returns the meta object for the reference '{@link cdtliterature.Inbook#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see cdtliterature.Inbook#getBook()
	 * @see #getInbook()
	 * @generated
	 */
	EReference getInbook_Book();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see cdtliterature.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Conference#getBooktitle <em>Booktitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booktitle</em>'.
	 * @see cdtliterature.Conference#getBooktitle()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Booktitle();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Incollection <em>Incollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incollection</em>'.
	 * @see cdtliterature.Incollection
	 * @generated
	 */
	EClass getIncollection();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Incollection#getBooktitle <em>Booktitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booktitle</em>'.
	 * @see cdtliterature.Incollection#getBooktitle()
	 * @see #getIncollection()
	 * @generated
	 */
	EAttribute getIncollection_Booktitle();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Incollection#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see cdtliterature.Incollection#getPublisher()
	 * @see #getIncollection()
	 * @generated
	 */
	EAttribute getIncollection_Publisher();

	/**
	 * Returns the meta object for the reference '{@link cdtliterature.Incollection#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Books</em>'.
	 * @see cdtliterature.Incollection#getBooks()
	 * @see #getIncollection()
	 * @generated
	 */
	EReference getIncollection_Books();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Inproceedings <em>Inproceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inproceedings</em>'.
	 * @see cdtliterature.Inproceedings
	 * @generated
	 */
	EClass getInproceedings();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Inproceedings#getBooktitle <em>Booktitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booktitle</em>'.
	 * @see cdtliterature.Inproceedings#getBooktitle()
	 * @see #getInproceedings()
	 * @generated
	 */
	EAttribute getInproceedings_Booktitle();

	/**
	 * Returns the meta object for the reference '{@link cdtliterature.Inproceedings#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Articles</em>'.
	 * @see cdtliterature.Inproceedings#getArticles()
	 * @see #getInproceedings()
	 * @generated
	 */
	EReference getInproceedings_Articles();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Proceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceedings</em>'.
	 * @see cdtliterature.Proceedings
	 * @generated
	 */
	EClass getProceedings();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Techreport <em>Techreport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Techreport</em>'.
	 * @see cdtliterature.Techreport
	 * @generated
	 */
	EClass getTechreport();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Techreport#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see cdtliterature.Techreport#getInstitution()
	 * @see #getTechreport()
	 * @generated
	 */
	EAttribute getTechreport_Institution();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Phdthesis <em>Phdthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phdthesis</em>'.
	 * @see cdtliterature.Phdthesis
	 * @generated
	 */
	EClass getPhdthesis();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Phdthesis#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see cdtliterature.Phdthesis#getSchool()
	 * @see #getPhdthesis()
	 * @generated
	 */
	EAttribute getPhdthesis_School();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Masterthesis <em>Masterthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masterthesis</em>'.
	 * @see cdtliterature.Masterthesis
	 * @generated
	 */
	EClass getMasterthesis();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Masterthesis#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see cdtliterature.Masterthesis#getSchool()
	 * @see #getMasterthesis()
	 * @generated
	 */
	EAttribute getMasterthesis_School();

	/**
	 * Returns the meta object for class '{@link cdtliterature.Unpublished <em>Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpublished</em>'.
	 * @see cdtliterature.Unpublished
	 * @generated
	 */
	EClass getUnpublished();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Unpublished#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see cdtliterature.Unpublished#getAuthor()
	 * @see #getUnpublished()
	 * @generated
	 */
	EAttribute getUnpublished_Author();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Unpublished#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see cdtliterature.Unpublished#getTitle()
	 * @see #getUnpublished()
	 * @generated
	 */
	EAttribute getUnpublished_Title();

	/**
	 * Returns the meta object for the attribute '{@link cdtliterature.Unpublished#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see cdtliterature.Unpublished#getNote()
	 * @see #getUnpublished()
	 * @generated
	 */
	EAttribute getUnpublished_Note();

	/**
	 * Returns the meta object for the reference list '{@link cdtliterature.Unpublished#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see cdtliterature.Unpublished#getReferences()
	 * @see #getUnpublished()
	 * @generated
	 */
	EReference getUnpublished_References();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdtliteratureFactory getCdtliteratureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cdtliterature.impl.ALiteratureBaseImpl <em>ALiterature Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.ALiteratureBaseImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getALiteratureBase()
		 * @generated
		 */
		EClass ALITERATURE_BASE = eINSTANCE.getALiteratureBase();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALITERATURE_BASE__TITLE = eINSTANCE.getALiteratureBase_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALITERATURE_BASE__AUTHOR = eINSTANCE.getALiteratureBase_Author();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALITERATURE_BASE__YEAR = eINSTANCE.getALiteratureBase_Year();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALITERATURE_BASE__REFERENCES = eINSTANCE.getALiteratureBase_References();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.ArticleImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__JOURNAL = eINSTANCE.getArticle_Journal();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.BookImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PUBLISHER = eINSTANCE.getBook_Publisher();

		/**
		 * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__ISBN = eINSTANCE.getBook_Isbn();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.InbookImpl <em>Inbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.InbookImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getInbook()
		 * @generated
		 */
		EClass INBOOK = eINSTANCE.getInbook();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOOK__PAGES = eINSTANCE.getInbook_Pages();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOOK__PUBLISHER = eINSTANCE.getInbook_Publisher();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOOK__BOOK = eINSTANCE.getInbook_Book();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.ConferenceImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__BOOKTITLE = eINSTANCE.getConference_Booktitle();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.IncollectionImpl <em>Incollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.IncollectionImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getIncollection()
		 * @generated
		 */
		EClass INCOLLECTION = eINSTANCE.getIncollection();

		/**
		 * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOLLECTION__BOOKTITLE = eINSTANCE.getIncollection_Booktitle();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOLLECTION__PUBLISHER = eINSTANCE.getIncollection_Publisher();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOLLECTION__BOOKS = eINSTANCE.getIncollection_Books();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.InproceedingsImpl <em>Inproceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.InproceedingsImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getInproceedings()
		 * @generated
		 */
		EClass INPROCEEDINGS = eINSTANCE.getInproceedings();

		/**
		 * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPROCEEDINGS__BOOKTITLE = eINSTANCE.getInproceedings_Booktitle();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPROCEEDINGS__ARTICLES = eINSTANCE.getInproceedings_Articles();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.ProceedingsImpl <em>Proceedings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.ProceedingsImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getProceedings()
		 * @generated
		 */
		EClass PROCEEDINGS = eINSTANCE.getProceedings();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.TechreportImpl <em>Techreport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.TechreportImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getTechreport()
		 * @generated
		 */
		EClass TECHREPORT = eINSTANCE.getTechreport();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHREPORT__INSTITUTION = eINSTANCE.getTechreport_Institution();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.PhdthesisImpl <em>Phdthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.PhdthesisImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getPhdthesis()
		 * @generated
		 */
		EClass PHDTHESIS = eINSTANCE.getPhdthesis();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHDTHESIS__SCHOOL = eINSTANCE.getPhdthesis_School();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.MasterthesisImpl <em>Masterthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.MasterthesisImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getMasterthesis()
		 * @generated
		 */
		EClass MASTERTHESIS = eINSTANCE.getMasterthesis();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTERTHESIS__SCHOOL = eINSTANCE.getMasterthesis_School();

		/**
		 * The meta object literal for the '{@link cdtliterature.impl.UnpublishedImpl <em>Unpublished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdtliterature.impl.UnpublishedImpl
		 * @see cdtliterature.impl.CdtliteraturePackageImpl#getUnpublished()
		 * @generated
		 */
		EClass UNPUBLISHED = eINSTANCE.getUnpublished();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPUBLISHED__AUTHOR = eINSTANCE.getUnpublished_Author();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPUBLISHED__TITLE = eINSTANCE.getUnpublished_Title();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPUBLISHED__NOTE = eINSTANCE.getUnpublished_Note();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPUBLISHED__REFERENCES = eINSTANCE.getUnpublished_References();

	}

} //CdtliteraturePackage
