/**
 */
package net.bhl.cdt.connector.avl.avlmodel.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;

import net.bhl.cdt.connector.avl.provider.AvlEditPlugin;

import net.bhl.cdt.connector.files.provider.FileGeneratorItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AVLModelGeneratorItemProvider extends FileGeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLModelGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addMachPropertyDescriptor(object);
			addZsymPropertyDescriptor(object);
			addSrefPropertyDescriptor(object);
			addCrefPropertyDescriptor(object);
			addBrefPropertyDescriptor(object);
			addXrefPropertyDescriptor(object);
			addYrefPropertyDescriptor(object);
			addZrefPropertyDescriptor(object);
			addIYsymPropertyDescriptor(object);
			addIZSymPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mach feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMachPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_mach_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_mach_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__MACH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zsym feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZsymPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_zsym_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_zsym_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__ZSYM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_sref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_sref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__SREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_cref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_cref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__CREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_bref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_bref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__BREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_xref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_xref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__XREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_yref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_yref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__YREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_zref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_zref_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__ZREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IYsym feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIYsymPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_iYsym_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_iYsym_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__IYSYM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IZ Sym feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIZSymPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AVLModelGenerator_iZSym_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AVLModelGenerator_iZSym_feature", "_UI_AVLModelGenerator_type"),
				 AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__IZ_SYM,
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
			childrenFeatures.add(AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__SURFACES);
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
	 * This returns AVLModelGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AVLModelGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AVLModelGenerator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AVLModelGenerator_type") :
			getString("_UI_AVLModelGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(AVLModelGenerator.class)) {
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IYSYM:
			case AvlmodelPackage.AVL_MODEL_GENERATOR__IZ_SYM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AvlmodelPackage.AVL_MODEL_GENERATOR__SURFACES:
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
				(AvlmodelPackage.Literals.AVL_MODEL_GENERATOR__SURFACES,
				 AvlmodelFactory.eINSTANCE.createAVLSurface()));
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
