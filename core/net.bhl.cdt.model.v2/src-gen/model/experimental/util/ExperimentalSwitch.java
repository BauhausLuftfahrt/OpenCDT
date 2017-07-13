/**
 */
package model.experimental.util;

import javax.measure.quantity.Quantity;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.IParameter;

import model.experimental.*;

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
 * @see model.experimental.ExperimentalPackage
 * @generated
 */
public class ExperimentalSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static ExperimentalPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ExperimentalSwitch() {
                if (modelPackage == null) {
                        modelPackage = ExperimentalPackage.eINSTANCE;
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
                        case ExperimentalPackage.IQUANTIFIED_PARAMETER: {
                                IQuantifiedParameter<?> iQuantifiedParameter = (IQuantifiedParameter<?>)theEObject;
                                T result = caseIQuantifiedParameter(iQuantifiedParameter);
                                if (result == null) result = caseIParameter(iQuantifiedParameter);
                                if (result == null) result = caseANamedItem(iQuantifiedParameter);
                                if (result == null) result = caseAIdentifiableItem(iQuantifiedParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case ExperimentalPackage.LENGTH_PARAMETER: {
                                LengthParameter lengthParameter = (LengthParameter)theEObject;
                                T result = caseLengthParameter(lengthParameter);
                                if (result == null) result = caseIQuantifiedParameter(lengthParameter);
                                if (result == null) result = caseIParameter(lengthParameter);
                                if (result == null) result = caseANamedItem(lengthParameter);
                                if (result == null) result = caseAIdentifiableItem(lengthParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case ExperimentalPackage.MASS_PARAMETER: {
                                MassParameter massParameter = (MassParameter)theEObject;
                                T result = caseMassParameter(massParameter);
                                if (result == null) result = caseIQuantifiedParameter(massParameter);
                                if (result == null) result = caseIParameter(massParameter);
                                if (result == null) result = caseANamedItem(massParameter);
                                if (result == null) result = caseAIdentifiableItem(massParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>IQuantified Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>IQuantified Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public <Q extends Quantity> T caseIQuantifiedParameter(IQuantifiedParameter<Q> object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Length Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Length Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseLengthParameter(LengthParameter object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Mass Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Mass Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMassParameter(MassParameter object) {
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

} //ExperimentalSwitch
