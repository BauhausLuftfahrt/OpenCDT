/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.bhl.cdt.model.modelview.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.ModelFactory;

import net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory;

import net.bhl.cdt.model.modelview.Filter;
import net.bhl.cdt.model.modelview.ModelviewPackage;

import net.bhl.cdt.model.provider.ElementItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.modelview.Filter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterItemProvider
	extends ElementItemProvider
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
	public FilterItemProvider(AdapterFactory adapterFactory) {
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

			addComponentPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addDisciplinePropertyDescriptor(object);
			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Filter_component_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Filter_component_feature", "_UI_Filter_type"),
				 ModelviewPackage.Literals.FILTER__COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Filter_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Filter_source_feature", "_UI_Filter_type"),
				 ModelviewPackage.Literals.FILTER__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discipline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisciplinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Filter_discipline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Filter_discipline_feature", "_UI_Filter_type"),
				 ModelviewPackage.Literals.FILTER__DISCIPLINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Filter_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Filter_text_feature", "_UI_Filter_type"),
				 ModelviewPackage.Literals.FILTER__TEXT,
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
			childrenFeatures.add(ModelviewPackage.Literals.FILTER__INTERFACE);
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
	 * This returns Filter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Filter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Filter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Filter_type") :
			getString("_UI_Filter_type") + " " + label;
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

		switch (notification.getFeatureID(Filter.class)) {
			case ModelviewPackage.FILTER__SOURCE:
			case ModelviewPackage.FILTER__DISCIPLINE:
			case ModelviewPackage.FILTER__TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelviewPackage.FILTER__INTERFACE:
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
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createPowerConsumer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createMassive()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createWettedAreaInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createReferenceAreaInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createAltitudeInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createRangeInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createSFCInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createDensityInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.FILTER__INTERFACE,
				 ArchitecturetoolsFactory.eINSTANCE.createVelocityInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelviewEditPlugin.INSTANCE;
	}

}
