/**
 */
package net.bhl.cdt.connector.avl.avlmodel.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;

import net.bhl.cdt.connector.avl.provider.AvlEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AVLSurfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLSurfaceItemProvider(AdapterFactory adapterFactory) {
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
			addNchordwisePropertyDescriptor(object);
			addNspanwisePropertyDescriptor(object);
			addSspacePropertyDescriptor(object);
			addCspacePropertyDescriptor(object);
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
				 getString("_UI_AVLSurface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLSurface_name_feature", "_UI_AVLSurface_type"),
				 AvlmodelPackage.Literals.AVL_SURFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nchordwise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNchordwisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLSurface_nchordwise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLSurface_nchordwise_feature", "_UI_AVLSurface_type"),
				 AvlmodelPackage.Literals.AVL_SURFACE__NCHORDWISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nspanwise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNspanwisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLSurface_nspanwise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLSurface_nspanwise_feature", "_UI_AVLSurface_type"),
				 AvlmodelPackage.Literals.AVL_SURFACE__NSPANWISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sspace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSspacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLSurface_sspace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLSurface_sspace_feature", "_UI_AVLSurface_type"),
				 AvlmodelPackage.Literals.AVL_SURFACE__SSPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cspace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCspacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLSurface_cspace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLSurface_cspace_feature", "_UI_AVLSurface_type"),
				 AvlmodelPackage.Literals.AVL_SURFACE__CSPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(AvlmodelPackage.Literals.AVL_SURFACE__YDUPLICATE);
			childrenFeatures.add(AvlmodelPackage.Literals.AVL_SURFACE__SECTIONS);
			childrenFeatures.add(AvlmodelPackage.Literals.AVL_SURFACE__ANGLE);
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
	 * This returns AVLSurface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AVLSurface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AVLSurface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AVLSurface_type") :
			getString("_UI_AVLSurface_type") + " " + label;
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

		switch (notification.getFeatureID(AVLSurface.class)) {
			case AvlmodelPackage.AVL_SURFACE__NAME:
			case AvlmodelPackage.AVL_SURFACE__NCHORDWISE:
			case AvlmodelPackage.AVL_SURFACE__NSPANWISE:
			case AvlmodelPackage.AVL_SURFACE__SSPACE:
			case AvlmodelPackage.AVL_SURFACE__CSPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AvlmodelPackage.AVL_SURFACE__YDUPLICATE:
			case AvlmodelPackage.AVL_SURFACE__SECTIONS:
			case AvlmodelPackage.AVL_SURFACE__ANGLE:
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
				(AvlmodelPackage.Literals.AVL_SURFACE__YDUPLICATE,
				 AvlmodelFactory.eINSTANCE.createYDuplicate()));

		newChildDescriptors.add
			(createChildParameter
				(AvlmodelPackage.Literals.AVL_SURFACE__SECTIONS,
				 AvlmodelFactory.eINSTANCE.createAVLSection()));

		newChildDescriptors.add
			(createChildParameter
				(AvlmodelPackage.Literals.AVL_SURFACE__ANGLE,
				 AvlmodelFactory.eINSTANCE.createSufaceAngle()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AvlEditPlugin.INSTANCE;
	}

}
