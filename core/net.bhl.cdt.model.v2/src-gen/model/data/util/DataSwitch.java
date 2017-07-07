/**
 */
package model.data.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.*;

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
 * @see model.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
         * The cached model package
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	protected static DataPackage modelPackage;

	/**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public DataSwitch() {
                if (modelPackage == null) {
                        modelPackage = DataPackage.eINSTANCE;
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
                        case DataPackage.AUNIT: {
                                AUnit aUnit = (AUnit)theEObject;
                                T result = caseAUnit(aUnit);
                                if (result == null) result = caseANamedItem(aUnit);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DataPackage.AVALUE: {
                                AValue aValue = (AValue)theEObject;
                                T result = caseAValue(aValue);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DataPackage.IDIMENSION: {
                                IDimension iDimension = (IDimension)theEObject;
                                T result = caseIDimension(iDimension);
                                if (result == null) result = caseAIdentifiableItem(iDimension);
                                if (result == null) result = caseANamedItem(iDimension);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DataPackage.IPARAMETER: {
                                IParameter iParameter = (IParameter)theEObject;
                                T result = caseIParameter(iParameter);
                                if (result == null) result = caseANamedItem(iParameter);
                                if (result == null) result = caseAIdentifiableItem(iParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DataPackage.IDIMENSION_PARAMETER: {
                                IDimensionParameter iDimensionParameter = (IDimensionParameter)theEObject;
                                T result = caseIDimensionParameter(iDimensionParameter);
                                if (result == null) result = caseIParameter(iDimensionParameter);
                                if (result == null) result = caseANamedItem(iDimensionParameter);
                                if (result == null) result = caseAIdentifiableItem(iDimensionParameter);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DataPackage.IDATA_ENTITY: {
                                IDataEntity iDataEntity = (IDataEntity)theEObject;
                                T result = caseIDataEntity(iDataEntity);
                                if (result == null) result = caseAIdentifiableItem(iDataEntity);
                                if (result == null) result = caseANamedItem(iDataEntity);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

	/**
         * Returns the result of interpreting the object as an instance of '<em>AUnit</em>'.
         * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>AUnit</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
	public T caseAUnit(AUnit object) {
                return null;
        }

	/**
         * Returns the result of interpreting the object as an instance of '<em>AValue</em>'.
         * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>AValue</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
	public T caseAValue(AValue object) {
                return null;
        }

	/**
         * Returns the result of interpreting the object as an instance of '<em>IDimension</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>IDimension</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseIDimension(IDimension object) {
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
         * Returns the result of interpreting the object as an instance of '<em>IDimension Parameter</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>IDimension Parameter</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseIDimensionParameter(IDimensionParameter object) {
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

} //DataSwitch
