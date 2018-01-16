/**
 */
package model.base.impl;

import java.util.Collection;

import model.base.AIdentifiableItem;
import model.base.AModelContainerItem;
import model.base.BasePackage;
import model.base.ModelContainer;

import model.science.QuantitySet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.base.impl.ModelContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.base.impl.ModelContainerImpl#getContainedItems <em>Contained Items</em>}</li>
 *   <li>{@link model.base.impl.ModelContainerImpl#getQuantitySet <em>Quantity Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelContainerImpl extends ANamedItemImpl implements ModelContainer {
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
         * The cached value of the '{@link #getContainedItems() <em>Contained Items</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getContainedItems()
         * @generated
         * @ordered
         */
        protected EList<AModelContainerItem> containedItems;

        /**
         * The cached value of the '{@link #getQuantitySet() <em>Quantity Set</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getQuantitySet()
         * @generated
         * @ordered
         */
        protected QuantitySet quantitySet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ModelContainerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BasePackage.Literals.MODEL_CONTAINER;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MODEL_CONTAINER__ID, oldId, id));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<AModelContainerItem> getContainedItems() {
                if (containedItems == null) {
                        containedItems = new EObjectContainmentWithInverseEList<AModelContainerItem>(AModelContainerItem.class, this, BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS, BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER);
                }
                return containedItems;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitySet getQuantitySet() {
                if (quantitySet != null && quantitySet.eIsProxy()) {
                        InternalEObject oldQuantitySet = (InternalEObject)quantitySet;
                        quantitySet = (QuantitySet)eResolveProxy(oldQuantitySet);
                        if (quantitySet != oldQuantitySet) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MODEL_CONTAINER__QUANTITY_SET, oldQuantitySet, quantitySet));
                        }
                }
                return quantitySet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QuantitySet basicGetQuantitySet() {
                return quantitySet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setQuantitySet(QuantitySet newQuantitySet) {
                QuantitySet oldQuantitySet = quantitySet;
                quantitySet = newQuantitySet;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MODEL_CONTAINER__QUANTITY_SET, oldQuantitySet, quantitySet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedItems()).basicAdd(otherEnd, msgs);
                }
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                return ((InternalEList<?>)getContainedItems()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BasePackage.MODEL_CONTAINER__ID:
                                return getId();
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                return getContainedItems();
                        case BasePackage.MODEL_CONTAINER__QUANTITY_SET:
                                if (resolve) return getQuantitySet();
                                return basicGetQuantitySet();
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
                        case BasePackage.MODEL_CONTAINER__ID:
                                setId((String)newValue);
                                return;
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                getContainedItems().clear();
                                getContainedItems().addAll((Collection<? extends AModelContainerItem>)newValue);
                                return;
                        case BasePackage.MODEL_CONTAINER__QUANTITY_SET:
                                setQuantitySet((QuantitySet)newValue);
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
                        case BasePackage.MODEL_CONTAINER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                getContainedItems().clear();
                                return;
                        case BasePackage.MODEL_CONTAINER__QUANTITY_SET:
                                setQuantitySet((QuantitySet)null);
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
                        case BasePackage.MODEL_CONTAINER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS:
                                return containedItems != null && !containedItems.isEmpty();
                        case BasePackage.MODEL_CONTAINER__QUANTITY_SET:
                                return quantitySet != null;
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
                                case BasePackage.MODEL_CONTAINER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
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
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return BasePackage.MODEL_CONTAINER__ID;
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
                result.append(')');
                return result.toString();
        }

} //ModelContainerImpl
