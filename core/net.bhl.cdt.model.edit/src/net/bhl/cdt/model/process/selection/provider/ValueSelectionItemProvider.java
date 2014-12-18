/**
 */
package net.bhl.cdt.model.process.selection.provider;


import java.util.Collection;
import java.util.List;
import net.bhl.cdt.model.process.provider.ProcessElementItemProvider;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.ValueSelection;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.process.selection.ValueSelection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueSelectionItemProvider extends ProcessElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSelectionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA);
			childrenFeatures.add(SelectionPackage.Literals.VALUE_SELECTION__SELECTED_VALUES);
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
	 * This returns ValueSelection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueSelection"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ValueSelection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ValueSelection_type") :
			getString("_UI_ValueSelection_type") + " " + label;
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

		switch (notification.getFeatureID(ValueSelection.class)) {
			case SelectionPackage.VALUE_SELECTION__CRITERIA:
			case SelectionPackage.VALUE_SELECTION__SELECTED_VALUES:
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
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createNameCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createPartOfCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createHighestValueCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createPreferLatestCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createPreferGeneratedCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__CRITERIA,
				 SelectionFactory.eINSTANCE.createPreferAuthorCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__SELECTED_VALUES,
				 SelectionFactory.eINSTANCE.createSelectedValue()));

		newChildDescriptors.add
			(createChildParameter
				(SelectionPackage.Literals.VALUE_SELECTION__SELECTED_VALUES,
				 SelectionFactory.eINSTANCE.createSelectedMeasuredValue()));
	}

}
