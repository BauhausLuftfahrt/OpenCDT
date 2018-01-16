/**
 */
package model.science.impl;

import java.util.Collection;

import model.base.ANamedItem;
import model.base.BasePackage;

import model.base.impl.AIdentifiableItemImpl;

import model.science.QuantityKind;
import model.science.QuantitySet;
import model.science.SciencePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.science.impl.QuantitySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.science.impl.QuantitySetImpl#getQuantityKinds <em>Quantity Kinds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantitySetImpl extends AIdentifiableItemImpl implements QuantitySet {
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
         * The cached value of the '{@link #getQuantityKinds() <em>Quantity Kinds</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getQuantityKinds()
         * @generated
         * @ordered
         */
        protected EList<QuantityKind> quantityKinds;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected QuantitySetImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return SciencePackage.Literals.QUANTITY_SET;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, SciencePackage.QUANTITY_SET__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<QuantityKind> getQuantityKinds() {
                if (quantityKinds == null) {
                        quantityKinds = new EObjectContainmentEList<QuantityKind>(QuantityKind.class, this, SciencePackage.QUANTITY_SET__QUANTITY_KINDS);
                }
                return quantityKinds;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case SciencePackage.QUANTITY_SET__QUANTITY_KINDS:
                                return ((InternalEList<?>)getQuantityKinds()).basicRemove(otherEnd, msgs);
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
                        case SciencePackage.QUANTITY_SET__NAME:
                                return getName();
                        case SciencePackage.QUANTITY_SET__QUANTITY_KINDS:
                                return getQuantityKinds();
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
                        case SciencePackage.QUANTITY_SET__NAME:
                                setName((String)newValue);
                                return;
                        case SciencePackage.QUANTITY_SET__QUANTITY_KINDS:
                                getQuantityKinds().clear();
                                getQuantityKinds().addAll((Collection<? extends QuantityKind>)newValue);
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
                        case SciencePackage.QUANTITY_SET__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case SciencePackage.QUANTITY_SET__QUANTITY_KINDS:
                                getQuantityKinds().clear();
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
                        case SciencePackage.QUANTITY_SET__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case SciencePackage.QUANTITY_SET__QUANTITY_KINDS:
                                return quantityKinds != null && !quantityKinds.isEmpty();
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
                                case SciencePackage.QUANTITY_SET__NAME: return BasePackage.ANAMED_ITEM__NAME;
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
                                case BasePackage.ANAMED_ITEM__NAME: return SciencePackage.QUANTITY_SET__NAME;
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

} //QuantitySetImpl
