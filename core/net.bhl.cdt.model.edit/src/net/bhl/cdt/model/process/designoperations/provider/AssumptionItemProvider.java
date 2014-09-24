/**
 */
package net.bhl.cdt.model.process.designoperations.provider;


import java.util.Collection;
import java.util.List;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryFactory;
import net.bhl.cdt.model.process.designoperations.Assumption;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.provider.DesignOperationItemProvider;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.system.SystemFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.process.designoperations.Assumption} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssumptionItemProvider extends DesignOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssumptionItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns Assumption.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Assumption"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Assumption)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Assumption_type") :
			getString("_UI_Assumption_type") + " " + label;
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

		switch (notification.getFeatureID(Assumption.class)) {
			case DesignoperationsPackage.ASSUMPTION__GENERATED_ELEMENTS:
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
	}

}
