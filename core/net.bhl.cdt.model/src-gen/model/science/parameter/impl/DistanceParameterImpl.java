/**
 */
package model.science.parameter.impl;

import model.base.AIdentifiableItem;
import model.base.BasePackage;

import model.base.impl.ANamedItemImpl;

import model.science.Unit;

import model.science.parameter.DistanceParameter;
import model.science.parameter.ParameterPackage;

import model.science.quantities.Distance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.science.parameter.impl.DistanceParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.science.parameter.impl.DistanceParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link model.science.parameter.impl.DistanceParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link model.science.parameter.impl.DistanceParameterImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceParameterImpl extends ANamedItemImpl implements DistanceParameter {
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
        protected Unit<Distance> unit;

        /**
         * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getQuantity()
         * @generated
         * @ordered
         */
        protected Distance quantity;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DistanceParameterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return ParameterPackage.Literals.DISTANCE_PARAMETER;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.DISTANCE_PARAMETER__ID, oldId, id));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.DISTANCE_PARAMETER__VALUE, oldValue, value));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        public Unit<Distance> getUnit() {
                if (unit != null && unit.eIsProxy()) {
                        InternalEObject oldUnit = (InternalEObject)unit;
                        unit = (Unit<Distance>)eResolveProxy(oldUnit);
                        if (unit != oldUnit) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParameterPackage.DISTANCE_PARAMETER__UNIT, oldUnit, unit));
                        }
                }
                return unit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Unit<Distance> basicGetUnit() {
                return unit;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setUnit(Unit<Distance> newUnit) {
                Unit<Distance> oldUnit = unit;
                unit = newUnit;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.DISTANCE_PARAMETER__UNIT, oldUnit, unit));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Distance getQuantity() {
                if (quantity != null && quantity.eIsProxy()) {
                        InternalEObject oldQuantity = (InternalEObject)quantity;
                        quantity = (Distance)eResolveProxy(oldQuantity);
                        if (quantity != oldQuantity) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParameterPackage.DISTANCE_PARAMETER__QUANTITY, oldQuantity, quantity));
                        }
                }
                return quantity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Distance basicGetQuantity() {
                return quantity;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setQuantity(Distance newQuantity) {
                Distance oldQuantity = quantity;
                quantity = newQuantity;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ParameterPackage.DISTANCE_PARAMETER__QUANTITY, oldQuantity, quantity));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case ParameterPackage.DISTANCE_PARAMETER__ID:
                                return getId();
                        case ParameterPackage.DISTANCE_PARAMETER__VALUE:
                                return getValue();
                        case ParameterPackage.DISTANCE_PARAMETER__UNIT:
                                if (resolve) return getUnit();
                                return basicGetUnit();
                        case ParameterPackage.DISTANCE_PARAMETER__QUANTITY:
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
                        case ParameterPackage.DISTANCE_PARAMETER__ID:
                                setId((String)newValue);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__VALUE:
                                setValue((Double)newValue);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__UNIT:
                                setUnit((Unit<Distance>)newValue);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__QUANTITY:
                                setQuantity((Distance)newValue);
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
                        case ParameterPackage.DISTANCE_PARAMETER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__VALUE:
                                setValue(VALUE_EDEFAULT);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__UNIT:
                                setUnit((Unit<Distance>)null);
                                return;
                        case ParameterPackage.DISTANCE_PARAMETER__QUANTITY:
                                setQuantity((Distance)null);
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
                        case ParameterPackage.DISTANCE_PARAMETER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case ParameterPackage.DISTANCE_PARAMETER__VALUE:
                                return value != VALUE_EDEFAULT;
                        case ParameterPackage.DISTANCE_PARAMETER__UNIT:
                                return unit != null;
                        case ParameterPackage.DISTANCE_PARAMETER__QUANTITY:
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
                                case ParameterPackage.DISTANCE_PARAMETER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
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
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return ParameterPackage.DISTANCE_PARAMETER__ID;
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

} //DistanceParameterImpl
