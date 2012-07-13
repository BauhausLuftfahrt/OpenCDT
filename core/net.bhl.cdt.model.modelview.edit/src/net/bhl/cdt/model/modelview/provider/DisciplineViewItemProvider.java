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
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.ModelviewFactory;
import net.bhl.cdt.model.modelview.ModelviewPackage;
import net.bhl.cdt.model.provider.ViewItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link net.bhl.cdt.model.modelview.DisciplineView} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DisciplineViewItemProvider extends ViewItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DisciplineViewItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInterfaceTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interface Types feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInterfaceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DisciplineView_interfaceTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DisciplineView_interfaceTypes_feature", "_UI_DisciplineView_type"),
				 ModelviewPackage.Literals.DISCIPLINE_VIEW__INTERFACE_TYPES,
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelviewPackage.Literals.DISCIPLINE_VIEW__SUBVIEWS);
			childrenFeatures.add(ModelviewPackage.Literals.DISCIPLINE_VIEW__ELEMENTS);
			childrenFeatures.add(ModelviewPackage.Literals.DISCIPLINE_VIEW__VIEW_LINKS);
			childrenFeatures.add(ModelviewPackage.Literals.DISCIPLINE_VIEW__FILTER);
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
	 * This returns DisciplineView.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DisciplineView"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DisciplineView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DisciplineView_type") :
			getString("_UI_DisciplineView_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DisciplineView.class)) {
			case ModelviewPackage.DISCIPLINE_VIEW__SUBVIEWS:
			case ModelviewPackage.DISCIPLINE_VIEW__ELEMENTS:
			case ModelviewPackage.DISCIPLINE_VIEW__VIEW_LINKS:
			case ModelviewPackage.DISCIPLINE_VIEW__FILTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__SUBVIEWS,
				 ModelviewFactory.eINSTANCE.createDisciplineView()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__SUBVIEWS,
				 ArchitecturetoolsFactory.eINSTANCE.createPowerDemandView()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__ELEMENTS,
				 ModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__ELEMENTS,
				 ModelFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__ELEMENTS,
				 ModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__VIEW_LINKS,
				 ModelviewFactory.eINSTANCE.createViewLink()));

		newChildDescriptors.add
			(createChildParameter
				(ModelviewPackage.Literals.DISCIPLINE_VIEW__FILTER,
				 ModelviewFactory.eINSTANCE.createFilter()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelviewEditPlugin.INSTANCE;
	}

}
