/**
 */
package model.science.parameter.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.science.IParameter;
import model.science.IQuantifiedParameter;
import model.science.QuantityKind;

import model.science.parameter.*;

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
 * @see model.science.parameter.ParameterPackage
 * @generated
 */
public class ParameterSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static ParameterPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterSwitch() {
                if (modelPackage == null) {
                        modelPackage = ParameterPackage.eINSTANCE;
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
                        case ParameterPackage.STRING_PARAMETER: {
                                StringParameter stringParameter = (StringParameter)theEObject;
                                T result = caseStringParameter(stringParameter);
                                if (result == null) result = caseIParameter(stringParameter);
                                if (result == null) result = caseANamedItem(stringParameter);
                                if (result == null) result = caseAIdentifiableItem(stringParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case ParameterPackage.DATE_PARAMETER: {
                                DateParameter dateParameter = (DateParameter)theEObject;
                                T result = caseDateParameter(dateParameter);
                                if (result == null) result = caseIParameter(dateParameter);
                                if (result == null) result = caseANamedItem(dateParameter);
                                if (result == null) result = caseAIdentifiableItem(dateParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case ParameterPackage.DISTANCE_PARAMETER: {
                                DistanceParameter distanceParameter = (DistanceParameter)theEObject;
                                T result = caseDistanceParameter(distanceParameter);
                                if (result == null) result = caseIQuantifiedParameter(distanceParameter);
                                if (result == null) result = caseIParameter(distanceParameter);
                                if (result == null) result = caseANamedItem(distanceParameter);
                                if (result == null) result = caseAIdentifiableItem(distanceParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case ParameterPackage.TIME_PARAMETER: {
                                TimeParameter timeParameter = (TimeParameter)theEObject;
                                T result = caseTimeParameter(timeParameter);
                                if (result == null) result = caseIQuantifiedParameter(timeParameter);
                                if (result == null) result = caseIParameter(timeParameter);
                                if (result == null) result = caseANamedItem(timeParameter);
                                if (result == null) result = caseAIdentifiableItem(timeParameter);
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
         * Returns the result of interpreting the object as an instance of '<em>Date Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Date Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDateParameter(DateParameter object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Distance Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Distance Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDistanceParameter(DistanceParameter object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Time Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Time Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTimeParameter(TimeParameter object) {
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
        public <Q extends QuantityKind> T caseIQuantifiedParameter(IQuantifiedParameter<Q> object) {
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

} //ParameterSwitch
