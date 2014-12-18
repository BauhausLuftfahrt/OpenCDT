/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 */
package net.bhl.cdt.connector.matlab.tornado.provider;


import java.util.Collection;
import java.util.List;
import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoFactory;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryFactory;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.designoperations.provider.DisciplineToolServiceItemProvider;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.system.SystemFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.connector.matlab.tornado.Tornado} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TornadoItemProvider
	extends DisciplineToolServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TornadoItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS);
			childrenFeatures.add(TornadoPackage.Literals.TORNADO__TORNADO_GEOMETRY);
			childrenFeatures.add(TornadoPackage.Literals.TORNADO__TORNADO_STATE);
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
	 * This returns Tornado.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tornado"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tornado)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Tornado_type") :
			getString("_UI_Tornado_type") + " " + label;
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

		switch (notification.getFeatureID(Tornado.class)) {
			case TornadoPackage.TORNADO__GENERATED_ELEMENTS:
			case TornadoPackage.TORNADO__TORNADO_GEOMETRY:
			case TornadoPackage.TORNADO__TORNADO_STATE:
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
				(ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS,
				 TornadoFactory.eINSTANCE.createTornado()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 DesignoperationsFactory.eINSTANCE.createCalculatedDecimalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SelectionFactory.eINSTANCE.createSelectedValue()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SelectionFactory.eINSTANCE.createSelectedMeasuredValue()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createQuantityKind()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createDecimalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createMeasuredValue()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createMeasuredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 SystemFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS,
				 GeometryFactory.eINSTANCE.createSpaceVector()));

		newChildDescriptors.add
			(createChildParameter
				(TornadoPackage.Literals.TORNADO__TORNADO_GEOMETRY,
				 TornadoFactory.eINSTANCE.createTornadoGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(TornadoPackage.Literals.TORNADO__TORNADO_STATE,
				 TornadoFactory.eINSTANCE.createTornadoState()));
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
			childFeature == ProcessPackage.Literals.DESIGN_PROCESS__DESIGN_PROCESS_ELEMENTS ||
			childFeature == ModelPackage.Literals.OPERATION_WITH_OUTPUT__GENERATED_ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TornadoEditPlugin.INSTANCE;
	}

}
