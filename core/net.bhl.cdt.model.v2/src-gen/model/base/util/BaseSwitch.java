/**
 */
package model.base.util;

import model.base.AIdentifiableItem;
import model.base.AModelContainerItem;
import model.base.ANamedItem;
import model.base.BasePackage;
import model.base.Component;
import model.base.ModelContainer;
import model.data.IDataEntity;
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
 * @see model.base.BasePackage
 * @generated
 */
public class BaseSwitch<T> extends Switch<T> {
	/**
         * The cached model package
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	protected static BasePackage modelPackage;

	/**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public BaseSwitch() {
                if (modelPackage == null) {
                        modelPackage = BasePackage.eINSTANCE;
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
                        case BasePackage.ANAMED_ITEM: {
                                ANamedItem aNamedItem = (ANamedItem)theEObject;
                                T result = caseANamedItem(aNamedItem);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BasePackage.AIDENTIFIABLE_ITEM: {
                                AIdentifiableItem aIdentifiableItem = (AIdentifiableItem)theEObject;
                                T result = caseAIdentifiableItem(aIdentifiableItem);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BasePackage.MODEL_CONTAINER: {
                                ModelContainer modelContainer = (ModelContainer)theEObject;
                                T result = caseModelContainer(modelContainer);
                                if (result == null) result = caseANamedItem(modelContainer);
                                if (result == null) result = caseAIdentifiableItem(modelContainer);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BasePackage.AMODEL_CONTAINER_ITEM: {
                                AModelContainerItem aModelContainerItem = (AModelContainerItem)theEObject;
                                T result = caseAModelContainerItem(aModelContainerItem);
                                if (result == null) result = caseAIdentifiableItem(aModelContainerItem);
                                if (result == null) result = caseANamedItem(aModelContainerItem);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BasePackage.SYSTEM: {
                                model.base.System system = (model.base.System)theEObject;
                                T result = caseSystem(system);
                                if (result == null) result = caseAModelContainerItem(system);
                                if (result == null) result = caseIDataEntity(system);
                                if (result == null) result = caseAIdentifiableItem(system);
                                if (result == null) result = caseANamedItem(system);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BasePackage.COMPONENT: {
                                Component component = (Component)theEObject;
                                T result = caseComponent(component);
                                if (result == null) result = caseIDataEntity(component);
                                if (result == null) result = caseAIdentifiableItem(component);
                                if (result == null) result = caseANamedItem(component);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
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
         * Returns the result of interpreting the object as an instance of '<em>Model Container</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Model Container</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseModelContainer(ModelContainer object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>AModel Container Item</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>AModel Container Item</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAModelContainerItem(AModelContainerItem object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>System</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>System</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSystem(model.base.System object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Component</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseComponent(Component object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>IData Entity</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>IData Entity</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseIDataEntity(IDataEntity object) {
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

} //BaseSwitch
