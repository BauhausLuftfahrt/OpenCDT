/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.datatypes.provider;

import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DatatypesFactory;
import net.bhl.cdt.model.datatypes.DatatypesPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.datatypes.CompositeValues} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompositeValuesItemProvider extends DataTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValuesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeValues.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeValues"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeValues)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeValues_type") :
			getString("_UI_CompositeValues_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeValues.class)) {
			case DatatypesPackage.COMPOSITE_VALUES__DATATYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createFloatPointValue()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createIntegerValue()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createFormula()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createCompositeValues()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createCells()));

		newChildDescriptors.add
			(createChildParameter
				(DatatypesPackage.Literals.COMPOSITE_VALUES__DATATYPES,
				 DatatypesFactory.eINSTANCE.createMeasuredValue()));
	}

}
