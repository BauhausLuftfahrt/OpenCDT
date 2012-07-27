/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.provider;

import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.model.calculation.CalculationFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.Component} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends StructuralElementItemProvider implements IEditingDomainItemProvider,
	IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addConnectedComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connected Components feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addConnectedComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_connectedComponents_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_connectedComponents_feature", "_UI_Component_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.COMPONENT__CONNECTED_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(ModelPackage.Literals.COMPONENT__SUB_COMPONENTS);
			childrenFeatures.add(ModelPackage.Literals.COMPONENT__PARAMETERS);
			childrenFeatures.add(ModelPackage.Literals.COMPONENT__CALCULATION_SETS);
			childrenFeatures.add(ModelPackage.Literals.COMPONENT__INTERFACES);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") : //$NON-NLS-1$
			getString("_UI_Component_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Component.class)) {
			case ModelPackage.COMPONENT__SUB_COMPONENTS:
			case ModelPackage.COMPONENT__PARAMETERS:
			case ModelPackage.COMPONENT__CALCULATION_SETS:
			case ModelPackage.COMPONENT__INTERFACES:
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
				(ModelPackage.Literals.COMPONENT__SUB_COMPONENTS,
				 ModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__PARAMETERS,
				 ModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__CALCULATION_SETS,
				 CalculationFactory.eINSTANCE.createCalculationSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createPowerConsumer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createMassive()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createWettedAreaInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createReferenceAreaInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createAltitudeInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createRangeInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createSFCInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createDensityInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.COMPONENT__INTERFACES,
				 ArchitecturetoolsFactory.eINSTANCE.createVelocityInterface()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModelPackage.Literals.COMPONENT__PARAMETERS ||
			childFeature == ModelPackage.Literals.COMPONENT__INTERFACES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
