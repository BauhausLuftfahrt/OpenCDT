/**
 */
package model.data.quantities.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.QuantityKind;

import model.data.quantities.*;

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
 * @see model.data.quantities.QuantitiesPackage
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
                        case QuantitiesPackage.DISTANCE: {
                                Distance distance = (Distance)theEObject;
                                T result = caseDistance(distance);
                                if (result == null) result = caseQuantityKind(distance);
                                if (result == null) result = caseAIdentifiableItem(distance);
                                if (result == null) result = caseANamedItem(distance);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.TIME: {
                                Time time = (Time)theEObject;
                                T result = caseTime(time);
                                if (result == null) result = caseQuantityKind(time);
                                if (result == null) result = caseAIdentifiableItem(time);
                                if (result == null) result = caseANamedItem(time);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.VELOCITY: {
                                Velocity velocity = (Velocity)theEObject;
                                T result = caseVelocity(velocity);
                                if (result == null) result = caseQuantityKind(velocity);
                                if (result == null) result = caseAIdentifiableItem(velocity);
                                if (result == null) result = caseANamedItem(velocity);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.MASS: {
                                Mass mass = (Mass)theEObject;
                                T result = caseMass(mass);
                                if (result == null) result = caseQuantityKind(mass);
                                if (result == null) result = caseAIdentifiableItem(mass);
                                if (result == null) result = caseANamedItem(mass);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.FORCE: {
                                Force force = (Force)theEObject;
                                T result = caseForce(force);
                                if (result == null) result = caseQuantityKind(force);
                                if (result == null) result = caseAIdentifiableItem(force);
                                if (result == null) result = caseANamedItem(force);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.EFFICIENCY: {
                                Efficiency efficiency = (Efficiency)theEObject;
                                T result = caseEfficiency(efficiency);
                                if (result == null) result = caseQuantityKind(efficiency);
                                if (result == null) result = caseAIdentifiableItem(efficiency);
                                if (result == null) result = caseANamedItem(efficiency);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.ENERGY: {
                                Energy energy = (Energy)theEObject;
                                T result = caseEnergy(energy);
                                if (result == null) result = caseQuantityKind(energy);
                                if (result == null) result = caseAIdentifiableItem(energy);
                                if (result == null) result = caseANamedItem(energy);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case QuantitiesPackage.POWER: {
                                Power power = (Power)theEObject;
                                T result = casePower(power);
                                if (result == null) result = caseQuantityKind(power);
                                if (result == null) result = caseAIdentifiableItem(power);
                                if (result == null) result = caseANamedItem(power);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDistance(Distance object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Time</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTime(Time object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Velocity</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Velocity</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseVelocity(Velocity object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Mass</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Mass</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMass(Mass object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Force</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Force</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseForce(Force object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Efficiency</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Efficiency</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseEfficiency(Efficiency object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Energy</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Energy</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseEnergy(Energy object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Power</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T casePower(Power object) {
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
         * Returns the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseQuantityKind(QuantityKind object) {
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
