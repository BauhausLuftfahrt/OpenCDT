/**
 */
package cdtliterature.impl;

import cdtliterature.ALiteratureBase;
import cdtliterature.Article;
import cdtliterature.Book;
import cdtliterature.CdtliteratureFactory;
import cdtliterature.CdtliteraturePackage;
import cdtliterature.Conference;
import cdtliterature.Inbook;
import cdtliterature.Incollection;
import cdtliterature.Inproceedings;
import cdtliterature.Masterthesis;
import cdtliterature.Phdthesis;
import cdtliterature.Proceedings;
import cdtliterature.Techreport;
import cdtliterature.Unpublished;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdtliteraturePackageImpl extends EPackageImpl implements CdtliteraturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLiteratureBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inbookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inproceedingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceedingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techreportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phdthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unpublishedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cdtliterature.CdtliteraturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdtliteraturePackageImpl() {
		super(eNS_URI, CdtliteratureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CdtliteraturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdtliteraturePackage init() {
		if (isInited) return (CdtliteraturePackage)EPackage.Registry.INSTANCE.getEPackage(CdtliteraturePackage.eNS_URI);

		// Obtain or create and register package
		CdtliteraturePackageImpl theCdtliteraturePackage = (CdtliteraturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdtliteraturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdtliteraturePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCdtliteraturePackage.createPackageContents();

		// Initialize created meta-data
		theCdtliteraturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdtliteraturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdtliteraturePackage.eNS_URI, theCdtliteraturePackage);
		return theCdtliteraturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALiteratureBase() {
		return aLiteratureBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALiteratureBase_Title() {
		return (EAttribute)aLiteratureBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALiteratureBase_Author() {
		return (EAttribute)aLiteratureBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALiteratureBase_References() {
		return (EReference)aLiteratureBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Year() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Journal() {
		return (EAttribute)articleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBook() {
		return bookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Author() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Title() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Year() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Publisher() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Isbn() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInbook() {
		return inbookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInbook_Author() {
		return (EAttribute)inbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInbook_Title() {
		return (EAttribute)inbookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInbook_Pages() {
		return (EAttribute)inbookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInbook_Year() {
		return (EAttribute)inbookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInbook_Publisher() {
		return (EAttribute)inbookEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInbook_Books() {
		return (EReference)inbookEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConference() {
		return conferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConference_Author() {
		return (EAttribute)conferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConference_Title() {
		return (EAttribute)conferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConference_Booktitle() {
		return (EAttribute)conferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConference_Year() {
		return (EAttribute)conferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncollection() {
		return incollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncollection_Author() {
		return (EAttribute)incollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncollection_Title() {
		return (EAttribute)incollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncollection_Booktitle() {
		return (EAttribute)incollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncollection_Year() {
		return (EAttribute)incollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncollection_Publisher() {
		return (EAttribute)incollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncollection_Books() {
		return (EReference)incollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInproceedings() {
		return inproceedingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInproceedings_Author() {
		return (EAttribute)inproceedingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInproceedings_Title() {
		return (EAttribute)inproceedingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInproceedings_Booktitle() {
		return (EAttribute)inproceedingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInproceedings_Year() {
		return (EAttribute)inproceedingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInproceedings_Articles() {
		return (EReference)inproceedingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceedings() {
		return proceedingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceedings_Title() {
		return (EAttribute)proceedingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceedings_Year() {
		return (EAttribute)proceedingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechreport() {
		return techreportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechreport_Author() {
		return (EAttribute)techreportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechreport_Title() {
		return (EAttribute)techreportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechreport_Institution() {
		return (EAttribute)techreportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechreport_Year() {
		return (EAttribute)techreportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhdthesis() {
		return phdthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhdthesis_Author() {
		return (EAttribute)phdthesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhdthesis_Title() {
		return (EAttribute)phdthesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhdthesis_School() {
		return (EAttribute)phdthesisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhdthesis_Year() {
		return (EAttribute)phdthesisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterthesis() {
		return masterthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterthesis_Author() {
		return (EAttribute)masterthesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterthesis_Title() {
		return (EAttribute)masterthesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterthesis_School() {
		return (EAttribute)masterthesisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterthesis_Year() {
		return (EAttribute)masterthesisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnpublished() {
		return unpublishedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublished_Author() {
		return (EAttribute)unpublishedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublished_Title() {
		return (EAttribute)unpublishedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublished_Note() {
		return (EAttribute)unpublishedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdtliteratureFactory getCdtliteratureFactory() {
		return (CdtliteratureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aLiteratureBaseEClass = createEClass(ALITERATURE_BASE);
		createEAttribute(aLiteratureBaseEClass, ALITERATURE_BASE__TITLE);
		createEAttribute(aLiteratureBaseEClass, ALITERATURE_BASE__AUTHOR);
		createEReference(aLiteratureBaseEClass, ALITERATURE_BASE__REFERENCES);

		articleEClass = createEClass(ARTICLE);
		createEAttribute(articleEClass, ARTICLE__YEAR);
		createEAttribute(articleEClass, ARTICLE__JOURNAL);

		bookEClass = createEClass(BOOK);
		createEAttribute(bookEClass, BOOK__AUTHOR);
		createEAttribute(bookEClass, BOOK__TITLE);
		createEAttribute(bookEClass, BOOK__YEAR);
		createEAttribute(bookEClass, BOOK__PUBLISHER);
		createEAttribute(bookEClass, BOOK__ISBN);

		inbookEClass = createEClass(INBOOK);
		createEAttribute(inbookEClass, INBOOK__AUTHOR);
		createEAttribute(inbookEClass, INBOOK__TITLE);
		createEAttribute(inbookEClass, INBOOK__PAGES);
		createEAttribute(inbookEClass, INBOOK__YEAR);
		createEAttribute(inbookEClass, INBOOK__PUBLISHER);
		createEReference(inbookEClass, INBOOK__BOOKS);

		conferenceEClass = createEClass(CONFERENCE);
		createEAttribute(conferenceEClass, CONFERENCE__AUTHOR);
		createEAttribute(conferenceEClass, CONFERENCE__TITLE);
		createEAttribute(conferenceEClass, CONFERENCE__BOOKTITLE);
		createEAttribute(conferenceEClass, CONFERENCE__YEAR);

		incollectionEClass = createEClass(INCOLLECTION);
		createEAttribute(incollectionEClass, INCOLLECTION__AUTHOR);
		createEAttribute(incollectionEClass, INCOLLECTION__TITLE);
		createEAttribute(incollectionEClass, INCOLLECTION__BOOKTITLE);
		createEAttribute(incollectionEClass, INCOLLECTION__YEAR);
		createEAttribute(incollectionEClass, INCOLLECTION__PUBLISHER);
		createEReference(incollectionEClass, INCOLLECTION__BOOKS);

		inproceedingsEClass = createEClass(INPROCEEDINGS);
		createEAttribute(inproceedingsEClass, INPROCEEDINGS__AUTHOR);
		createEAttribute(inproceedingsEClass, INPROCEEDINGS__TITLE);
		createEAttribute(inproceedingsEClass, INPROCEEDINGS__BOOKTITLE);
		createEAttribute(inproceedingsEClass, INPROCEEDINGS__YEAR);
		createEReference(inproceedingsEClass, INPROCEEDINGS__ARTICLES);

		proceedingsEClass = createEClass(PROCEEDINGS);
		createEAttribute(proceedingsEClass, PROCEEDINGS__TITLE);
		createEAttribute(proceedingsEClass, PROCEEDINGS__YEAR);

		techreportEClass = createEClass(TECHREPORT);
		createEAttribute(techreportEClass, TECHREPORT__AUTHOR);
		createEAttribute(techreportEClass, TECHREPORT__TITLE);
		createEAttribute(techreportEClass, TECHREPORT__INSTITUTION);
		createEAttribute(techreportEClass, TECHREPORT__YEAR);

		phdthesisEClass = createEClass(PHDTHESIS);
		createEAttribute(phdthesisEClass, PHDTHESIS__AUTHOR);
		createEAttribute(phdthesisEClass, PHDTHESIS__TITLE);
		createEAttribute(phdthesisEClass, PHDTHESIS__SCHOOL);
		createEAttribute(phdthesisEClass, PHDTHESIS__YEAR);

		masterthesisEClass = createEClass(MASTERTHESIS);
		createEAttribute(masterthesisEClass, MASTERTHESIS__AUTHOR);
		createEAttribute(masterthesisEClass, MASTERTHESIS__TITLE);
		createEAttribute(masterthesisEClass, MASTERTHESIS__SCHOOL);
		createEAttribute(masterthesisEClass, MASTERTHESIS__YEAR);

		unpublishedEClass = createEClass(UNPUBLISHED);
		createEAttribute(unpublishedEClass, UNPUBLISHED__AUTHOR);
		createEAttribute(unpublishedEClass, UNPUBLISHED__TITLE);
		createEAttribute(unpublishedEClass, UNPUBLISHED__NOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		articleEClass.getESuperTypes().add(this.getALiteratureBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(aLiteratureBaseEClass, ALiteratureBase.class, "ALiteratureBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getALiteratureBase_Title(), ecorePackage.getEString(), "title", null, 0, 1, ALiteratureBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getALiteratureBase_Author(), ecorePackage.getEString(), "author", null, 0, 1, ALiteratureBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getALiteratureBase_References(), this.getALiteratureBase(), null, "references", null, 0, -1, ALiteratureBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticle_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_Journal(), ecorePackage.getEString(), "journal", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBook_Author(), ecorePackage.getEString(), "author", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Title(), ecorePackage.getEString(), "title", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Isbn(), ecorePackage.getEString(), "isbn", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inbookEClass, Inbook.class, "Inbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInbook_Author(), ecorePackage.getEString(), "author", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInbook_Title(), ecorePackage.getEString(), "title", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInbook_Pages(), ecorePackage.getEInt(), "pages", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInbook_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInbook_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInbook_Books(), this.getBook(), null, "books", null, 0, 1, Inbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conferenceEClass, Conference.class, "Conference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConference_Author(), ecorePackage.getEString(), "author", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConference_Title(), ecorePackage.getEString(), "title", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConference_Booktitle(), ecorePackage.getEString(), "booktitle", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConference_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Conference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incollectionEClass, Incollection.class, "Incollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncollection_Author(), ecorePackage.getEString(), "author", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncollection_Title(), ecorePackage.getEString(), "title", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncollection_Booktitle(), ecorePackage.getEString(), "booktitle", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncollection_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncollection_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncollection_Books(), this.getBook(), null, "books", null, 0, 1, Incollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inproceedingsEClass, Inproceedings.class, "Inproceedings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInproceedings_Author(), ecorePackage.getEString(), "author", null, 0, 1, Inproceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInproceedings_Title(), ecorePackage.getEString(), "title", null, 0, 1, Inproceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInproceedings_Booktitle(), ecorePackage.getEString(), "booktitle", null, 0, 1, Inproceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInproceedings_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Inproceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInproceedings_Articles(), this.getArticle(), null, "articles", null, 0, 1, Inproceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proceedingsEClass, Proceedings.class, "Proceedings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProceedings_Title(), ecorePackage.getEString(), "title", null, 0, 1, Proceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProceedings_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Proceedings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(techreportEClass, Techreport.class, "Techreport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechreport_Author(), ecorePackage.getEString(), "author", null, 0, 1, Techreport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechreport_Title(), ecorePackage.getEString(), "title", null, 0, 1, Techreport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechreport_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, Techreport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechreport_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Techreport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phdthesisEClass, Phdthesis.class, "Phdthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhdthesis_Author(), ecorePackage.getEString(), "author", null, 0, 1, Phdthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhdthesis_Title(), ecorePackage.getEString(), "title", null, 0, 1, Phdthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhdthesis_School(), ecorePackage.getEString(), "school", null, 0, 1, Phdthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhdthesis_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Phdthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterthesisEClass, Masterthesis.class, "Masterthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMasterthesis_Author(), ecorePackage.getEString(), "author", null, 0, 1, Masterthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterthesis_Title(), ecorePackage.getEString(), "title", null, 0, 1, Masterthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterthesis_School(), ecorePackage.getEInt(), "school", null, 0, 1, Masterthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterthesis_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Masterthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unpublishedEClass, Unpublished.class, "Unpublished", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnpublished_Author(), ecorePackage.getEString(), "author", null, 0, 1, Unpublished.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnpublished_Title(), ecorePackage.getEString(), "title", null, 0, 1, Unpublished.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnpublished_Note(), ecorePackage.getEString(), "note", null, 0, 1, Unpublished.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CdtliteraturePackageImpl
