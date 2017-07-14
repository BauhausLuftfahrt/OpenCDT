/**
 */
package model.data.parameter.impl;

import model.base.AIdentifiableItem;
import model.base.BasePackage;
import model.base.impl.ANamedItemImpl;
import model.data.Unit;
import model.data.parameter.ParameterPackage;
import model.data.parameter.TimeParameter;

import model.data.quantities.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.data.parameter.impl.TimeParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.data.parameter.impl.TimeParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link model.data.parameter.impl.TimeParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link model.data.parameter.impl.TimeParameterImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeParameterImpl extends ANamedItemImpl implements TimeParameter {
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
        protected static final double VALUE_EDEFAULT = 0.0;
        /**
         * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected double value = VALUE_EDEFAULT;
        /**
         * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUnit()
         * @generated
         * @ordered
         */
        protected Unit<Time> unit;
        /**
         * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getQuantity()
         * @generated
         * @ordered
         */
        protected Time quantity;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TimeParameterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return ParameterPackage.Literals.TIME_PARAMETER;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.TIME_PARAMETER__ID, oldId, id));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public double getValue() {
                return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setValue(double newValue) {
                double oldValue = value;
                value = newValue;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.TIME_PARAMETER__VALUE, oldValue, value));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        public Unit<Time> getUnit() {
                if (unit != null && unit.eIsProxy()) {
                        InternalEObject oldUnit = (InternalEObject)unit;
                        unit = (Unit<Time>)eResolveProxy(oldUnit);
                        if (unit != oldUnit) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParameterPackage.TIME_PARAMETER__UNIT, oldUnit, unit));
                        }
                }
                return unit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Unit<Time> basicGetUnit() {
                return unit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setUnit(Unit<Time> newUnit) {
                Unit<Time> oldUnit = unit;
                unit = newUnit;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.TIME_PARAMETER__UNIT, oldUnit, unit));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Time getQuantity() {
                if (quantity != null && quantity.eIsProxy()) {
                        InternalEObject oldQuantity = (InternalEObject)quantity;
                        quantity = (Time)eResolveProxy(oldQuantity);
                        if (quantity != oldQuantity) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParameterPackage.TIME_PARAMETER__QUANTITY, oldQuantity, quantity));
                        }
                }
                return quantity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Time basicGetQuantity() {
                return quantity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setQuantity(Time newQuantity) {
                Time oldQuantity = quantity;
                quantity = newQuantity;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.TIME_PARAMETER__QUANTITY, oldQuantity, quantity));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case ParameterPackage.TIME_PARAMETER__ID:
                                return getId();
                        case ParameterPackage.TIME_PARAMETER__VALUE:
                                return getValue();
                        case ParameterPackage.TIME_PARAMETER__UNIT:
                                if (resolve) return getUnit();
                                return basicGetUnit();
                        case ParameterPackage.TIME_PARAMETER__QUANTITY:
                                if (resolve) return getQuantity();
                                return basicGetQuantity();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case ParameterPackage.TIME_PARAMETER__ID:
                                setId((String)newValue);
                                return;
                        case ParameterPackage.TIME_PARAMETER__VALUE:
                                setValue((Double)newValue);
                                return;
                        case ParameterPackage.TIME_PARAMETER__UNIT:
                                setUnit((Unit<Time>)newValue);
                                return;
                        case ParameterPackage.TIME_PARAMETER__QUANTITY:
                                setQuantity((Time)newValue);
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
                        case ParameterPackage.TIME_PARAMETER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case ParameterPackage.TIME_PARAMETER__VALUE:
                                setValue(VALUE_EDEFAULT);
                                return;
                        case ParameterPackage.TIME_PARAMETER__UNIT:
                                setUnit((Unit<Time>)null);
                                return;
                        case ParameterPackage.TIME_PARAMETER__QUANTITY:
                                setQuantity((Time)null);
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
                        case ParameterPackage.TIME_PARAMETER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case ParameterPackage.TIME_PARAMETER__VALUE:
                                return value != VALUE_EDEFAULT;
                        case ParameterPackage.TIME_PARAMETER__UNIT:
                                return unit != null;
                        case ParameterPackage.TIME_PARAMETER__QUANTITY:
                                return quantity != null;
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
                                case ParameterPackage.TIME_PARAMETER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
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
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return ParameterPackage.TIME_PARAMETER__ID;
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

} //TimeParameterImpl
