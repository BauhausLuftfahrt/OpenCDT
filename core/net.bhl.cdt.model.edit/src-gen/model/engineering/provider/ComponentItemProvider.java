/**
 */
package model.engineering.provider;


import java.util.Collection;
import java.util.List;

import model.base.BasePackage;

import model.base.provider.AIdentifiableItemItemProvider;
import model.base.provider.CDTEditPlugin;

import model.engineering.Component;
import model.engineering.EngineeringFactory;
import model.engineering.EngineeringPackage;

import model.science.SciencePackage;

import model.science.parameter.ParameterFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.engineering.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends AIdentifiableItemItemProvider {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ComponentItemProvider(AdapterFactory adapterFactory) {
                super(adapterFactory);
        }

        /**
         * This returns the property descriptors for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
                if (itemPropertyDescriptors == null) {
                        super.getPropertyDescriptors(object);

                        addNamePropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Name feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addNamePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_ANamedItem_name_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_ANamedItem_name_feature", "_UI_ANamedItem_type"),
                                 BasePackage.Literals.ANAMED_ITEM__NAME,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
         * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
         * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
                if (childrenFeatures == null) {
                        super.getChildrenFeatures(object);
                        childrenFeatures.add(SciencePackage.Literals.IDATA_ENTITY__PARAMETERS);
                        childrenFeatures.add(EngineeringPackage.Literals.COMPONENT__SUB_COMPONENTS);
                }
                return childrenFeatures;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EStructuralFeature getChildFeature(Object object, Object child) {
                // Check the type of the specified child object and return the proper feature to use for
                // adding (see {@link AddCommand}) it as a child.

                return super.getChildFeature(object, child);
        }

        /**
         * This returns Component.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                return ((StyledString)getStyledText(object)).getString();
        }
        
        /**
         * This returns the label styled text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getStyledText(Object object) {
                String label = ((Component)object).getName();
    	StyledString styledLabel = new StyledString();
                if (label == null || label.length() == 0) {
                        styledLabel.append(getString("_UI_Component_type"), StyledString.Style.QUALIFIER_STYLER); 
                } else {
                        styledLabel.append(getString("_UI_Component_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
                }
                return styledLabel;
        }	

        /**
         * This handles model notifications by calling {@link #updateChildren} to update any cached
         * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void notifyChanged(Notification notification) {
                updateChildren(notification);

                switch (notification.getFeatureID(Component.class)) {
                        case EngineeringPackage.COMPONENT__NAME:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case EngineeringPackage.COMPONENT__PARAMETERS:
                        case EngineeringPackage.COMPONENT__SUB_COMPONENTS:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                                return;
                }
                super.notifyChanged(notification);
        }

        /**
         * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
         * that can be created under this object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
                super.collectNewChildDescriptors(newChildDescriptors, object);

                newChildDescriptors.add
                        (createChildParameter
                                (SciencePackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createStringParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (SciencePackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createDateParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (SciencePackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createDistanceParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (SciencePackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createTimeParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (EngineeringPackage.Literals.COMPONENT__SUB_COMPONENTS,
                                 EngineeringFactory.eINSTANCE.createComponent()));
        }

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
                return CDTEditPlugin.INSTANCE;
        }

}
