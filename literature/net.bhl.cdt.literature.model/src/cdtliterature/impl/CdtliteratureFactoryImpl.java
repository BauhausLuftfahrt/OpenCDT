/**
 */
package cdtliterature.impl;

import cdtliterature.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdtliteratureFactoryImpl extends EFactoryImpl implements CdtliteratureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdtliteratureFactory init() {
		try {
			CdtliteratureFactory theCdtliteratureFactory = (CdtliteratureFactory)EPackage.Registry.INSTANCE.getEFactory(CdtliteraturePackage.eNS_URI);
			if (theCdtliteratureFactory != null) {
				return theCdtliteratureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdtliteratureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdtliteratureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CdtliteraturePackage.ARTICLE: return createArticle();
			case CdtliteraturePackage.BOOK: return createBook();
			case CdtliteraturePackage.INBOOK: return createInbook();
			case CdtliteraturePackage.CONFERENCE: return createConference();
			case CdtliteraturePackage.INCOLLECTION: return createIncollection();
			case CdtliteraturePackage.INPROCEEDINGS: return createInproceedings();
			case CdtliteraturePackage.PROCEEDINGS: return createProceedings();
			case CdtliteraturePackage.TECHREPORT: return createTechreport();
			case CdtliteraturePackage.PHDTHESIS: return createPhdthesis();
			case CdtliteraturePackage.MASTERTHESIS: return createMasterthesis();
			case CdtliteraturePackage.UNPUBLISHED: return createUnpublished();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inbook createInbook() {
		InbookImpl inbook = new InbookImpl();
		return inbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conference createConference() {
		ConferenceImpl conference = new ConferenceImpl();
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Incollection createIncollection() {
		IncollectionImpl incollection = new IncollectionImpl();
		return incollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inproceedings createInproceedings() {
		InproceedingsImpl inproceedings = new InproceedingsImpl();
		return inproceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proceedings createProceedings() {
		ProceedingsImpl proceedings = new ProceedingsImpl();
		return proceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Techreport createTechreport() {
		TechreportImpl techreport = new TechreportImpl();
		return techreport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phdthesis createPhdthesis() {
		PhdthesisImpl phdthesis = new PhdthesisImpl();
		return phdthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Masterthesis createMasterthesis() {
		MasterthesisImpl masterthesis = new MasterthesisImpl();
		return masterthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unpublished createUnpublished() {
		UnpublishedImpl unpublished = new UnpublishedImpl();
		return unpublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdtliteraturePackage getCdtliteraturePackage() {
		return (CdtliteraturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdtliteraturePackage getPackage() {
		return CdtliteraturePackage.eINSTANCE;
	}

} //CdtliteratureFactoryImpl
