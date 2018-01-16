/**
 */
package model.science.impl;

import java.util.Collection;

import model.base.ANamedItem;
import model.base.BasePackage;

import model.base.impl.AIdentifiableItemImpl;

import model.science.QuantityKind;
import model.science.SciencePackage;
import model.science.Unit;

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
 * An implementation of the model object '<em><b>Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.science.impl.QuantityKindImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.science.impl.QuantityKindImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantityKindImpl extends AIdentifiableItemImpl implements QuantityKind {
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
         * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUnits()
         * @generated
         * @ordered
         */
        protected EList<Unit<?>> units;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected QuantityKindImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return SciencePackage.Literals.QUANTITY_KIND;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, SciencePackage.QUANTITY_KIND__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Unit<?>> getUnits() {
                if (units == null) {
                        units = new EObjectContainmentEList<Unit<?>>(Unit.class, this, SciencePackage.QUANTITY_KIND__UNITS);
                }
                return units;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case SciencePackage.QUANTITY_KIND__UNITS:
                                return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
                        case SciencePackage.QUANTITY_KIND__NAME:
                                return getName();
                        case SciencePackage.QUANTITY_KIND__UNITS:
                                return getUnits();
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
                        case SciencePackage.QUANTITY_KIND__NAME:
                                setName((String)newValue);
                                return;
                        case SciencePackage.QUANTITY_KIND__UNITS:
                                getUnits().clear();
                                getUnits().addAll((Collection<? extends Unit<?>>)newValue);
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
                        case SciencePackage.QUANTITY_KIND__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case SciencePackage.QUANTITY_KIND__UNITS:
                                getUnits().clear();
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
                        case SciencePackage.QUANTITY_KIND__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case SciencePackage.QUANTITY_KIND__UNITS:
                                return units != null && !units.isEmpty();
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
                                case SciencePackage.QUANTITY_KIND__NAME: return BasePackage.ANAMED_ITEM__NAME;
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
                                case BasePackage.ANAMED_ITEM__NAME: return SciencePackage.QUANTITY_KIND__NAME;
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

} //QuantityKindImpl
