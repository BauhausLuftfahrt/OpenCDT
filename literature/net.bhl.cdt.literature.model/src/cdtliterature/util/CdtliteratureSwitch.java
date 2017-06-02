/**
 */
package cdtliterature.util;

import cdtliterature.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cdtliterature.CdtliteraturePackage
 * @generated
 */
public class CdtliteratureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdtliteraturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdtliteratureSwitch() {
		if (modelPackage == null) {
			modelPackage = CdtliteraturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CdtliteraturePackage.ALITERATURE_BASE: {
				ALiteratureBase aLiteratureBase = (ALiteratureBase)theEObject;
				T result = caseALiteratureBase(aLiteratureBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseALiteratureBase(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.BOOK: {
				Book book = (Book)theEObject;
				T result = caseBook(book);
				if (result == null) result = caseALiteratureBase(book);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.INBOOK: {
				Inbook inbook = (Inbook)theEObject;
				T result = caseInbook(inbook);
				if (result == null) result = caseALiteratureBase(inbook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.CONFERENCE: {
				Conference conference = (Conference)theEObject;
				T result = caseConference(conference);
				if (result == null) result = caseALiteratureBase(conference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.INCOLLECTION: {
				Incollection incollection = (Incollection)theEObject;
				T result = caseIncollection(incollection);
				if (result == null) result = caseALiteratureBase(incollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.INPROCEEDINGS: {
				Inproceedings inproceedings = (Inproceedings)theEObject;
				T result = caseInproceedings(inproceedings);
				if (result == null) result = caseALiteratureBase(inproceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.PROCEEDINGS: {
				Proceedings proceedings = (Proceedings)theEObject;
				T result = caseProceedings(proceedings);
				if (result == null) result = caseALiteratureBase(proceedings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.TECHREPORT: {
				Techreport techreport = (Techreport)theEObject;
				T result = caseTechreport(techreport);
				if (result == null) result = caseALiteratureBase(techreport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.PHDTHESIS: {
				Phdthesis phdthesis = (Phdthesis)theEObject;
				T result = casePhdthesis(phdthesis);
				if (result == null) result = caseALiteratureBase(phdthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.MASTERTHESIS: {
				Masterthesis masterthesis = (Masterthesis)theEObject;
				T result = caseMasterthesis(masterthesis);
				if (result == null) result = caseALiteratureBase(masterthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdtliteraturePackage.UNPUBLISHED: {
				Unpublished unpublished = (Unpublished)theEObject;
				T result = caseUnpublished(unpublished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALiterature Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALiterature Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALiteratureBase(ALiteratureBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInbook(Inbook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConference(Conference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incollection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incollection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncollection(Incollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inproceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inproceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInproceedings(Inproceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceedings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceedings(Proceedings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Techreport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Techreport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechreport(Techreport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phdthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phdthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhdthesis(Phdthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masterthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masterthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterthesis(Masterthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpublished(Unpublished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CdtliteratureSwitch
