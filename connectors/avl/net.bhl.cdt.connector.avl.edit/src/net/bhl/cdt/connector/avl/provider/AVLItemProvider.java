/**
 */
package net.bhl.cdt.connector.avl.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.connector.avl.AVL;
import net.bhl.cdt.connector.avl.AvlFactory;

import net.bhl.cdt.connector.avl.avlmodel.AvlmodelFactory;

import net.bhl.cdt.connector.avl.avlprocess.AvlprocessFactory;

import net.bhl.cdt.connector.files.FilesFactory;

import net.bhl.cdt.model.process.ProcessPackage;

import net.bhl.cdt.model.process.designoperations.provider.LocalDisciplineToolItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.connector.avl.AVL} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AVLItemProvider extends LocalDisciplineToolItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVLItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns AVL.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AVL"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AVL)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AVL_type") :
			getString("_UI_AVL_type") + " " + label;
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
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 AvlFactory.eINSTANCE.createAVL()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 AvlmodelFactory.eINSTANCE.createAVLModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 AvlprocessFactory.eINSTANCE.createAVLProcessGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 AvlprocessFactory.eINSTANCE.createAVLResultImporter()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 FilesFactory.eINSTANCE.createRequirementsImporter()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 FilesFactory.eINSTANCE.createGeometryImporter()));
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
