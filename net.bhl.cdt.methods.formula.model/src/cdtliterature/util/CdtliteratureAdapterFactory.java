/**
 */
package cdtliterature.util;

import cdtliterature.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cdtliterature.CdtliteraturePackage
 * @generated
 */
public class CdtliteratureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdtliteraturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdtliteratureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CdtliteraturePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdtliteratureSwitch<Adapter> modelSwitch =
		new CdtliteratureSwitch<Adapter>() {
			@Override
			public Adapter caseALiteratureBase(ALiteratureBase object) {
				return createALiteratureBaseAdapter();
			}
			@Override
			public Adapter caseArticle(Article object) {
				return createArticleAdapter();
			}
			@Override
			public Adapter caseBook(Book object) {
				return createBookAdapter();
			}
			@Override
			public Adapter caseInbook(Inbook object) {
				return createInbookAdapter();
			}
			@Override
			public Adapter caseConference(Conference object) {
				return createConferenceAdapter();
			}
			@Override
			public Adapter caseIncollection(Incollection object) {
				return createIncollectionAdapter();
			}
			@Override
			public Adapter caseInproceedings(Inproceedings object) {
				return createInproceedingsAdapter();
			}
			@Override
			public Adapter caseProceedings(Proceedings object) {
				return createProceedingsAdapter();
			}
			@Override
			public Adapter caseTechreport(Techreport object) {
				return createTechreportAdapter();
			}
			@Override
			public Adapter casePhdthesis(Phdthesis object) {
				return createPhdthesisAdapter();
			}
			@Override
			public Adapter caseMasterthesis(Masterthesis object) {
				return createMasterthesisAdapter();
			}
			@Override
			public Adapter caseUnpublished(Unpublished object) {
				return createUnpublishedAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.ALiteratureBase <em>ALiterature Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.ALiteratureBase
	 * @generated
	 */
	public Adapter createALiteratureBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Article
	 * @generated
	 */
	public Adapter createArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Book
	 * @generated
	 */
	public Adapter createBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Inbook <em>Inbook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Inbook
	 * @generated
	 */
	public Adapter createInbookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Conference
	 * @generated
	 */
	public Adapter createConferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Incollection <em>Incollection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Incollection
	 * @generated
	 */
	public Adapter createIncollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Inproceedings <em>Inproceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Inproceedings
	 * @generated
	 */
	public Adapter createInproceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Proceedings <em>Proceedings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Proceedings
	 * @generated
	 */
	public Adapter createProceedingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Techreport <em>Techreport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Techreport
	 * @generated
	 */
	public Adapter createTechreportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Phdthesis <em>Phdthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Phdthesis
	 * @generated
	 */
	public Adapter createPhdthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Masterthesis <em>Masterthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Masterthesis
	 * @generated
	 */
	public Adapter createMasterthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Unpublished <em>Unpublished</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Unpublished
	 * @generated
	 */
	public Adapter createUnpublishedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdtliterature.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdtliterature.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CdtliteratureAdapterFactory
