/**
 */
package model.data.impl;

import model.base.impl.ANamedItemImpl;

import model.data.AUnit;
import model.data.DataPackage;
import model.data.IParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AUnit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.data.impl.AUnitImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link model.data.impl.AUnitImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AUnitImpl extends ANamedItemImpl implements AUnit {
	/**
         * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @see #getParameter()
         * @generated
         * @ordered
         */
	protected IParameter parameter;

	/**
         * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @see #getSymbol()
         * @generated
         * @ordered
         */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
         * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @see #getSymbol()
         * @generated
         * @ordered
         */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	protected AUnitImpl() {
                super();
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	protected EClass eStaticClass() {
                return DataPackage.Literals.AUNIT;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public IParameter getParameter() {
                if (parameter != null && parameter.eIsProxy()) {
                        InternalEObject oldParameter = (InternalEObject)parameter;
                        parameter = (IParameter)eResolveProxy(oldParameter);
                        if (parameter != oldParameter) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.AUNIT__PARAMETER, oldParameter, parameter));
                        }
                }
                return parameter;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public IParameter basicGetParameter() {
                return parameter;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public void setParameter(IParameter newParameter) {
                IParameter oldParameter = parameter;
                parameter = newParameter;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.AUNIT__PARAMETER, oldParameter, parameter));
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public String getSymbol() {
                return symbol;
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public void setSymbol(String newSymbol) {
                String oldSymbol = symbol;
                symbol = newSymbol;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.AUNIT__SYMBOL, oldSymbol, symbol));
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DataPackage.AUNIT__PARAMETER:
                                if (resolve) return getParameter();
                                return basicGetParameter();
                        case DataPackage.AUNIT__SYMBOL:
                                return getSymbol();
                }
                return super.eGet(featureID, resolve, coreType);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DataPackage.AUNIT__PARAMETER:
                                setParameter((IParameter)newValue);
                                return;
                        case DataPackage.AUNIT__SYMBOL:
                                setSymbol((String)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	public void eUnset(int featureID) {
                switch (featureID) {
                        case DataPackage.AUNIT__PARAMETER:
                                setParameter((IParameter)null);
                                return;
                        case DataPackage.AUNIT__SYMBOL:
                                setSymbol(SYMBOL_EDEFAULT);
                                return;
                }
                super.eUnset(featureID);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DataPackage.AUNIT__PARAMETER:
                                return parameter != null;
                        case DataPackage.AUNIT__SYMBOL:
                                return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
                }
                return super.eIsSet(featureID);
        }

	/**
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	@Override
	public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (symbol: ");
                result.append(symbol);
                result.append(')');
                return result.toString();
        }

} //AUnitImpl
