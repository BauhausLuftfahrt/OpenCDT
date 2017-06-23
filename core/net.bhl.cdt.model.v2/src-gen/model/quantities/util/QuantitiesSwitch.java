/**
 */
package model.quantities.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.IParameter;

import model.quantities.*;

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
 * @see model.quantities.QuantitiesPackage
 * @generated
 */
public class QuantitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = QuantitiesPackage.eINSTANCE;
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
			case QuantitiesPackage.STRING_PARAMETER: {
				StringParameter stringParameter = (StringParameter)theEObject;
				T result = caseStringParameter(stringParameter);
				if (result == null) result = caseIParameter(stringParameter);
				if (result == null) result = caseANamedItem(stringParameter);
				if (result == null) result = caseAIdentifiableItem(stringParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantitiesPackage.INUMBER_PARAMETER: {
				INumberParameter iNumberParameter = (INumberParameter)theEObject;
				T result = caseINumberParameter(iNumberParameter);
				if (result == null) result = caseIParameter(iNumberParameter);
				if (result == null) result = caseANamedItem(iNumberParameter);
				if (result == null) result = caseAIdentifiableItem(iNumberParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantitiesPackage.LENGTH_PARAMENTER: {
				LengthParamenter lengthParamenter = (LengthParamenter)theEObject;
				T result = caseLengthParamenter(lengthParamenter);
				if (result == null) result = caseINumberParameter(lengthParamenter);
				if (result == null) result = caseIParameter(lengthParamenter);
				if (result == null) result = caseANamedItem(lengthParamenter);
				if (result == null) result = caseAIdentifiableItem(lengthParamenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParameter(StringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INumber Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INumber Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINumberParameter(INumberParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Paramenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Paramenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthParamenter(LengthParamenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANamed Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANamed Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANamedItem(ANamedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AIdentifiable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AIdentifiable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIdentifiableItem(AIdentifiableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIParameter(IParameter object) {
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

} //QuantitiesSwitch
