/**
 */
package model.base.provider;


import java.util.Collection;
import java.util.List;

import model.base.BaseFactory;
import model.base.BasePackage;
import model.data.DataPackage;

import model.data.parameter.ParameterFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.base.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends AModelContainerItemItemProvider {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SystemItemProvider(AdapterFactory adapterFactory) {
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

                }
                return itemPropertyDescriptors;
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
                        childrenFeatures.add(DataPackage.Literals.IDATA_ENTITY__PARAMETERS);
                        childrenFeatures.add(BasePackage.Literals.SYSTEM__COMPONENTS);
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
         * This returns System.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
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
                String label = ((model.base.System)object).getName();
    	StyledString styledLabel = new StyledString();
                if (label == null || label.length() == 0) {
                        styledLabel.append(getString("_UI_System_type"), StyledString.Style.QUALIFIER_STYLER); 
                } else {
                        styledLabel.append(getString("_UI_System_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
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

                switch (notification.getFeatureID(model.base.System.class)) {
                        case BasePackage.SYSTEM__PARAMETERS:
                        case BasePackage.SYSTEM__COMPONENTS:
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
                                (DataPackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createStringParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (DataPackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createDateParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (DataPackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createDistanceParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (DataPackage.Literals.IDATA_ENTITY__PARAMETERS,
                                 ParameterFactory.eINSTANCE.createTimeParameter()));

                newChildDescriptors.add
                        (createChildParameter
                                (BasePackage.Literals.SYSTEM__COMPONENTS,
                                 BaseFactory.eINSTANCE.createComponent()));
        }

}