/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository.functions.provider;

import java.util.Collection;
import java.util.List;

import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.calculationrepository.functions.ScilabFunction} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ScilabFunctionItemProvider extends CalculationScriptItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScilabFunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFunctionDefinitionPropertyDescriptor(object);
			addFunctionBodyPropertyDescriptor(object);
			addFunctionCallPropertyDescriptor(object);
			addFunctionReturnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function Definition feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addFunctionDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ScilabFunction_functionDefinition_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ScilabFunction_functionDefinition_feature",
				"_UI_ScilabFunction_type"), FunctionsPackage.Literals.SCILAB_FUNCTION__FUNCTION_DEFINITION, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Function Body feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFunctionBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ScilabFunction_functionBody_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ScilabFunction_functionBody_feature",
				"_UI_ScilabFunction_type"), FunctionsPackage.Literals.SCILAB_FUNCTION__FUNCTION_BODY, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Function Call feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFunctionCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ScilabFunction_functionCall_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ScilabFunction_functionCall_feature",
				"_UI_ScilabFunction_type"), FunctionsPackage.Literals.SCILAB_FUNCTION__FUNCTION_CALL, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Function Return feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFunctionReturnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ScilabFunction_functionReturn_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ScilabFunction_functionReturn_feature",
				"_UI_ScilabFunction_type"), FunctionsPackage.Literals.SCILAB_FUNCTION__FUNCTION_RETURN, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ScilabFunction.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScilabFunction"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScilabFunction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ScilabFunction_type")
			: getString("_UI_ScilabFunction_type") + " " + label;
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

		switch (notification.getFeatureID(ScilabFunction.class)) {
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_DEFINITION:
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_BODY:
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_CALL:
		case FunctionsPackage.SCILAB_FUNCTION__FUNCTION_RETURN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == FunctionsPackage.Literals.FUNCTION__INPUT_DESCRIPTORS
			|| childFeature == FunctionsPackage.Literals.FUNCTION__OUTPUT_DESCRIPTORS;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
				getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
