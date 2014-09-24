/**
 */
package net.bhl.cdt.model.process.designoperations.provider;


import java.util.Collection;
import java.util.List;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.geometry.GeometryFactory;
import net.bhl.cdt.model.process.ProcessPackage;
import net.bhl.cdt.model.process.designoperations.DesignoperationsFactory;
import net.bhl.cdt.model.process.designoperations.DesignoperationsPackage;
import net.bhl.cdt.model.process.designoperations.Formula;
import net.bhl.cdt.model.process.selection.SelectionFactory;
import net.bhl.cdt.model.system.SystemFactory;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.process.designoperations.Formula} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaItemProvider 
	extends ItemProviderAdapter
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
	public FormulaItemProvider(AdapterFactory adapterFactory) {
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

			addProcessedElementsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addBusyPropertyDescriptor(object);
			addTimeStampPropertyDescriptor(object);
			addSuperprocessPropertyDescriptor(object);
			addFormulaPropertyDescriptor(object);
			addParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Processed Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessedElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationWithInput_processedElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationWithInput_processedElements_feature", "_UI_OperationWithInput_type"),
				 ModelPackage.Literals.OPERATION_WITH_INPUT__PROCESSED_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 ModelPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Busy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessElement_busy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessElement_busy_feature", "_UI_ProcessElement_type"),
				 ProcessPackage.Literals.PROCESS_ELEMENT__BUSY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessElement_timeStamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessElement_timeStamp_feature", "_UI_ProcessElement_type"),
				 ProcessPackage.Literals.PROCESS_ELEMENT__TIME_STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Superprocess feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperprocessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DesignOperation_superprocess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DesignOperation_superprocess_feature", "_UI_DesignOperation_type"),
				 ProcessPackage.Literals.DESIGN_OPERATION__SUPERPROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formula feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormulaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_formula_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_formula_feature", "_UI_Formula_type"),
				 DesignoperationsPackage.Literals.FORMULA__FORMULA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_parameter_feature", "_UI_Formula_type"),
				 DesignoperationsPackage.Literals.FORMULA__PARAMETER,
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
	 * This returns Formula.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Formula"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Formula)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Formula_type") :
			getString("_UI_Formula_type") + " " + label;
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

		switch (notification.getFeatureID(Formula.class)) {
			case DesignoperationsPackage.FORMULA__NAME:
			case DesignoperationsPackage.FORMULA__BUSY:
			case DesignoperationsPackage.FORMULA__TIME_STAMP:
			case DesignoperationsPackage.FORMULA__FORMULA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DesignoperationsPackage.FORMULA__GENERATED_ELEMENTS:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
