/**
 */
package model.base.impl;

import model.base.AModelContainerItem;
import model.base.ANamedItem;
import model.base.BasePackage;
import model.base.ModelContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AModel Container Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.base.impl.AModelContainerItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.base.impl.AModelContainerItemImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AModelContainerItemImpl extends AIdentifiableItemImpl implements AModelContainerItem {
        /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected static final String NAME_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected String name = NAME_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected AModelContainerItemImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BasePackage.Literals.AMODEL_CONTAINER_ITEM;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
                return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(String newName) {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.AMODEL_CONTAINER_ITEM__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ModelContainer getContainer() {
                if (eContainerFeatureID() != BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER) return null;
                return (ModelContainer)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetContainer(ModelContainer newContainer, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newContainer, BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setContainer(ModelContainer newContainer) {
                if (newContainer != eInternalContainer() || (eContainerFeatureID() != BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER && newContainer != null)) {
                        if (EcoreUtil.isAncestor(this, newContainer))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newContainer != null)
                                msgs = ((InternalEObject)newContainer).eInverseAdd(this, BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS, ModelContainer.class, msgs);
                        msgs = basicSetContainer(newContainer, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER, newContainer, newContainer));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetContainer((ModelContainer)otherEnd, msgs);
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
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                return basicSetContainer(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
                switch (eContainerFeatureID()) {
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                return eInternalContainer().eInverseRemove(this, BasePackage.MODEL_CONTAINER__CONTAINED_ITEMS, ModelContainer.class, msgs);
                }
                return super.eBasicRemoveFromContainerFeature(msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BasePackage.AMODEL_CONTAINER_ITEM__NAME:
                                return getName();
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                return getContainer();
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
                        case BasePackage.AMODEL_CONTAINER_ITEM__NAME:
                                setName((String)newValue);
                                return;
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                setContainer((ModelContainer)newValue);
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
                        case BasePackage.AMODEL_CONTAINER_ITEM__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                setContainer((ModelContainer)null);
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
                        case BasePackage.AMODEL_CONTAINER_ITEM__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case BasePackage.AMODEL_CONTAINER_ITEM__CONTAINER:
                                return getContainer() != null;
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
                if (baseClass == ANamedItem.class) {
                        switch (derivedFeatureID) {
                                case BasePackage.AMODEL_CONTAINER_ITEM__NAME: return BasePackage.ANAMED_ITEM__NAME;
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
                if (baseClass == ANamedItem.class) {
                        switch (baseFeatureID) {
                                case BasePackage.ANAMED_ITEM__NAME: return BasePackage.AMODEL_CONTAINER_ITEM__NAME;
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
                result.append(" (name: ");
                result.append(name);
                result.append(')');
                return result.toString();
        }

} //AModelContainerItemImpl
