/**
 */
package model.base.impl;

import java.util.Collection;

import model.base.BasePackage;
import model.base.Component;

import model.data.DataPackage;
import model.data.IDataEntity;
import model.data.IParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.base.impl.SystemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link model.base.impl.SystemImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends AModelContainerItemImpl implements model.base.System {
        /**
         * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParameters()
         * @generated
         * @ordered
         */
        protected EList<IParameter> parameters;

        /**
         * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getComponents()
         * @generated
         * @ordered
         */
        protected EList<Component> components;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SystemImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BasePackage.Literals.SYSTEM;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<IParameter> getParameters() {
                if (parameters == null) {
                        parameters = new EObjectContainmentEList<IParameter>(IParameter.class, this, BasePackage.SYSTEM__PARAMETERS);
                }
                return parameters;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Component> getComponents() {
                if (components == null) {
                        components = new EObjectContainmentEList<Component>(Component.class, this, BasePackage.SYSTEM__COMPONENTS);
                }
                return components;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BasePackage.SYSTEM__PARAMETERS:
                                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
                        case BasePackage.SYSTEM__COMPONENTS:
                                return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
                        case BasePackage.SYSTEM__PARAMETERS:
                                return getParameters();
                        case BasePackage.SYSTEM__COMPONENTS:
                                return getComponents();
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
                        case BasePackage.SYSTEM__PARAMETERS:
                                getParameters().clear();
                                getParameters().addAll((Collection<? extends IParameter>)newValue);
                                return;
                        case BasePackage.SYSTEM__COMPONENTS:
                                getComponents().clear();
                                getComponents().addAll((Collection<? extends Component>)newValue);
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
                        case BasePackage.SYSTEM__PARAMETERS:
                                getParameters().clear();
                                return;
                        case BasePackage.SYSTEM__COMPONENTS:
                                getComponents().clear();
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
                        case BasePackage.SYSTEM__PARAMETERS:
                                return parameters != null && !parameters.isEmpty();
                        case BasePackage.SYSTEM__COMPONENTS:
                                return components != null && !components.isEmpty();
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
                if (baseClass == IDataEntity.class) {
                        switch (derivedFeatureID) {
                                case BasePackage.SYSTEM__PARAMETERS: return DataPackage.IDATA_ENTITY__PARAMETERS;
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
                if (baseClass == IDataEntity.class) {
                        switch (baseFeatureID) {
                                case DataPackage.IDATA_ENTITY__PARAMETERS: return BasePackage.SYSTEM__PARAMETERS;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

} //SystemImpl
