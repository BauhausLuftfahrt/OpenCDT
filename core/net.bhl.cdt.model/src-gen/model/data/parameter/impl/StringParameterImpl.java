/**
 */
package model.data.parameter.impl;

import model.base.AIdentifiableItem;
import model.base.BasePackage;

import model.base.impl.ANamedItemImpl;

import model.data.parameter.ParameterPackage;
import model.data.parameter.StringParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.data.parameter.impl.StringParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.data.parameter.impl.StringParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringParameterImpl extends ANamedItemImpl implements StringParameter {
        /**
         * The default value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected static final String ID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected String id = ID_EDEFAULT;

        /**
         * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected static final String VALUE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected String value = VALUE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StringParameterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return ParameterPackage.Literals.STRING_PARAMETER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getId() {
                return id;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setId(String newId) {
                String oldId = id;
                id = newId;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.STRING_PARAMETER__ID, oldId, id));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getValue() {
                return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setValue(String newValue) {
                String oldValue = value;
                value = newValue;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.STRING_PARAMETER__VALUE, oldValue, value));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case ParameterPackage.STRING_PARAMETER__ID:
                                return getId();
                        case ParameterPackage.STRING_PARAMETER__VALUE:
                                return getValue();
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
                        case ParameterPackage.STRING_PARAMETER__ID:
                                setId((String)newValue);
                                return;
                        case ParameterPackage.STRING_PARAMETER__VALUE:
                                setValue((String)newValue);
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
                        case ParameterPackage.STRING_PARAMETER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case ParameterPackage.STRING_PARAMETER__VALUE:
                                setValue(VALUE_EDEFAULT);
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
                        case ParameterPackage.STRING_PARAMETER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case ParameterPackage.STRING_PARAMETER__VALUE:
                                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
                if (baseClass == AIdentifiableItem.class) {
                        switch (derivedFeatureID) {
                                case ParameterPackage.STRING_PARAMETER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
                                default: return -1;
                        }
                }
                return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
                if (baseClass == AIdentifiableItem.class) {
                        switch (baseFeatureID) {
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return ParameterPackage.STRING_PARAMETER__ID;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
                result.append(" (id: ");
                result.append(id);
                result.append(", value: ");
                result.append(value);
                result.append(')');
                return result.toString();
        }

} //StringParameterImpl