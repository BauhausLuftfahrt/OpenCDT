/**
 */
package tagbase.util;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tagbase.*;

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
 * @see tagbase.TagbasePackage
 * @generated
 */
public class TagbaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TagbasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagbaseSwitch() {
		if (modelPackage == null) {
			modelPackage = TagbasePackage.eINSTANCE;
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
			case TagbasePackage.TAG_BASE: {
				TagBase tagBase = (TagBase)theEObject;
				T result = caseTagBase(tagBase);
				if (result == null) result = caseAbstractLoggedItem(tagBase);
				if (result == null) result = caseNamedElement(tagBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.TAGABLE_SET: {
				TagableSet tagableSet = (TagableSet)theEObject;
				T result = caseTagableSet(tagableSet);
				if (result == null) result = caseAbstractLoggedItem(tagableSet);
				if (result == null) result = caseNamedElement(tagableSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.ITAGABLE: {
				ITagable iTagable = (ITagable)theEObject;
				T result = caseITagable(iTagable);
				if (result == null) result = caseAbstractLoggedItem(iTagable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseAbstractLoggedItem(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.NAMED_TAG: {
				NamedTag namedTag = (NamedTag)theEObject;
				T result = caseNamedTag(namedTag);
				if (result == null) result = caseTag(namedTag);
				if (result == null) result = caseNamedElement(namedTag);
				if (result == null) result = caseAbstractLoggedItem(namedTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.ABSTRACT_LOGGED_ITEM: {
				AbstractLoggedItem abstractLoggedItem = (AbstractLoggedItem)theEObject;
				T result = caseAbstractLoggedItem(abstractLoggedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.NAMED_TAG_DEFINITION: {
				NamedTagDefinition namedTagDefinition = (NamedTagDefinition)theEObject;
				T result = caseNamedTagDefinition(namedTagDefinition);
				if (result == null) result = caseAbstractLoggedItem(namedTagDefinition);
				if (result == null) result = caseNamedElement(namedTagDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TagbasePackage.TAG_SET: {
				TagSet tagSet = (TagSet)theEObject;
				T result = caseTagSet(tagSet);
				if (result == null) result = caseNamedElement(tagSet);
				if (result == null) result = caseAbstractLoggedItem(tagSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagBase(TagBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagable Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagableSet(TagableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITagable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITagable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITagable(ITagable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTag(NamedTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Logged Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Logged Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLoggedItem(AbstractLoggedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Tag Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Tag Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTagDefinition(NamedTagDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagSet(TagSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //TagbaseSwitch
