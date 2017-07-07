/**
 */
package model.data.impl;

import model.base.AIdentifiableItem;
import model.base.BasePackage;

import model.base.impl.ANamedItemImpl;

import model.data.DataPackage;
import model.data.IDimension;
import model.data.IDimensionParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDimension Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.data.impl.IDimensionParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.data.impl.IDimensionParameterImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDimensionParameterImpl extends ANamedItemImpl implements IDimensionParameter {
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
         * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDimension()
         * @generated
         * @ordered
         */
        protected IDimension dimension;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected IDimensionParameterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DataPackage.Literals.IDIMENSION_PARAMETER;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IDIMENSION_PARAMETER__ID, oldId, id));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public IDimension getDimension() {
                if (dimension != null && dimension.eIsProxy()) {
                        InternalEObject oldDimension = (InternalEObject)dimension;
                        dimension = (IDimension)eResolveProxy(oldDimension);
                        if (dimension != oldDimension) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.IDIMENSION_PARAMETER__DIMENSION, oldDimension, dimension));
                        }
                }
                return dimension;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public IDimension basicGetDimension() {
                return dimension;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDimension(IDimension newDimension) {
                IDimension oldDimension = dimension;
                dimension = newDimension;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IDIMENSION_PARAMETER__DIMENSION, oldDimension, dimension));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DataPackage.IDIMENSION_PARAMETER__ID:
                                return getId();
                        case DataPackage.IDIMENSION_PARAMETER__DIMENSION:
                                if (resolve) return getDimension();
                                return basicGetDimension();
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
                        case DataPackage.IDIMENSION_PARAMETER__ID:
                                setId((String)newValue);
                                return;
                        case DataPackage.IDIMENSION_PARAMETER__DIMENSION:
                                setDimension((IDimension)newValue);
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
                        case DataPackage.IDIMENSION_PARAMETER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case DataPackage.IDIMENSION_PARAMETER__DIMENSION:
                                setDimension((IDimension)null);
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
                        case DataPackage.IDIMENSION_PARAMETER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case DataPackage.IDIMENSION_PARAMETER__DIMENSION:
                                return dimension != null;
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
                                case DataPackage.IDIMENSION_PARAMETER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
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
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return DataPackage.IDIMENSION_PARAMETER__ID;
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

} //IDimensionParameterImpl
