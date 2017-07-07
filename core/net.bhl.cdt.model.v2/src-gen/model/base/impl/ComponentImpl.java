/**
 */
package model.base.impl;

import java.util.Collection;

import model.base.ANamedItem;
import model.base.BasePackage;
import model.base.Component;

import model.data.IParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.base.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.base.impl.ComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link model.base.impl.ComponentImpl#getContainingComponent <em>Containing Component</em>}</li>
 *   <li>{@link model.base.impl.ComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends AIdentifiableItemImpl implements Component {
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
         * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParameters()
         * @generated
         * @ordered
         */
        protected EList<IParameter> parameters;

        /**
         * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSubComponents()
         * @generated
         * @ordered
         */
        protected EList<Component> subComponents;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ComponentImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BasePackage.Literals.COMPONENT;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.COMPONENT__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<IParameter> getParameters() {
                if (parameters == null) {
                        parameters = new EObjectContainmentEList<IParameter>(IParameter.class, this, BasePackage.COMPONENT__PARAMETERS);
                }
                return parameters;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Component getContainingComponent() {
                if (eContainerFeatureID() != BasePackage.COMPONENT__CONTAINING_COMPONENT) return null;
                return (Component)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetContainingComponent(Component newContainingComponent, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newContainingComponent, BasePackage.COMPONENT__CONTAINING_COMPONENT, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setContainingComponent(Component newContainingComponent) {
                if (newContainingComponent != eInternalContainer() || (eContainerFeatureID() != BasePackage.COMPONENT__CONTAINING_COMPONENT && newContainingComponent != null)) {
                        if (EcoreUtil.isAncestor(this, newContainingComponent))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newContainingComponent != null)
                                msgs = ((InternalEObject)newContainingComponent).eInverseAdd(this, BasePackage.COMPONENT__SUB_COMPONENTS, Component.class, msgs);
                        msgs = basicSetContainingComponent(newContainingComponent, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.COMPONENT__CONTAINING_COMPONENT, newContainingComponent, newContainingComponent));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Component> getSubComponents() {
                if (subComponents == null) {
                        subComponents = new EObjectContainmentWithInverseEList<Component>(Component.class, this, BasePackage.COMPONENT__SUB_COMPONENTS, BasePackage.COMPONENT__CONTAINING_COMPONENT);
                }
                return subComponents;
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
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetContainingComponent((Component)otherEnd, msgs);
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubComponents()).basicAdd(otherEnd, msgs);
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
                        case BasePackage.COMPONENT__PARAMETERS:
                                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                return basicSetContainingComponent(null, msgs);
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                return ((InternalEList<?>)getSubComponents()).basicRemove(otherEnd, msgs);
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
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                return eInternalContainer().eInverseRemove(this, BasePackage.COMPONENT__SUB_COMPONENTS, Component.class, msgs);
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
                        case BasePackage.COMPONENT__NAME:
                                return getName();
                        case BasePackage.COMPONENT__PARAMETERS:
                                return getParameters();
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                return getContainingComponent();
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                return getSubComponents();
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
                        case BasePackage.COMPONENT__NAME:
                                setName((String)newValue);
                                return;
                        case BasePackage.COMPONENT__PARAMETERS:
                                getParameters().clear();
                                getParameters().addAll((Collection<? extends IParameter>)newValue);
                                return;
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                setContainingComponent((Component)newValue);
                                return;
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                getSubComponents().clear();
                                getSubComponents().addAll((Collection<? extends Component>)newValue);
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
                        case BasePackage.COMPONENT__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case BasePackage.COMPONENT__PARAMETERS:
                                getParameters().clear();
                                return;
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                setContainingComponent((Component)null);
                                return;
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                getSubComponents().clear();
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
                        case BasePackage.COMPONENT__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case BasePackage.COMPONENT__PARAMETERS:
                                return parameters != null && !parameters.isEmpty();
                        case BasePackage.COMPONENT__CONTAINING_COMPONENT:
                                return getContainingComponent() != null;
                        case BasePackage.COMPONENT__SUB_COMPONENTS:
                                return subComponents != null && !subComponents.isEmpty();
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
                                case BasePackage.COMPONENT__NAME: return BasePackage.ANAMED_ITEM__NAME;
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
                                case BasePackage.ANAMED_ITEM__NAME: return BasePackage.COMPONENT__NAME;
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

} //ComponentImpl
