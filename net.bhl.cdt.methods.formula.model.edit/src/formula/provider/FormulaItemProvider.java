/**
 */
package formula.provider;


import cdtliterature.CdtliteratureFactory;
import formula.Formula;
import formula.FormulaPackage;

import java.util.Collection;
import java.util.List;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link formula.Formula} object.
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

			addNamePropertyDescriptor(object);
			addLatexStringPropertyDescriptor(object);
			addInputParameterPropertyDescriptor(object);
			addOutputParameterPropertyDescriptor(object);
			addRepositoryPropertyDescriptor(object);
			addRefernceStrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Formula_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_name_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latex String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatexStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_latexString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_latexString_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__LATEX_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_inputParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_inputParameter_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__INPUT_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_outputParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_outputParameter_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__OUTPUT_PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_repository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_repository_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__REPOSITORY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refernce Str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefernceStrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formula_refernceStr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formula_refernceStr_feature", "_UI_Formula_type"),
				 FormulaPackage.Literals.FORMULA__REFERNCE_STR,
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
			childrenFeatures.add(FormulaPackage.Literals.FORMULA__REFERENCE);
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
			case FormulaPackage.FORMULA__NAME:
			case FormulaPackage.FORMULA__LATEX_STRING:
			case FormulaPackage.FORMULA__REFERNCE_STR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormulaPackage.FORMULA__REFERENCE:
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
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createArticle()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createBook()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createInbook()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createConference()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createIncollection()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createInproceedings()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createProceedings()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createTechreport()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createPhdthesis()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createMasterthesis()));

		newChildDescriptors.add
			(createChildParameter
				(FormulaPackage.Literals.FORMULA__REFERENCE,
				 CdtliteratureFactory.eINSTANCE.createUnpublished()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FormulaEditPlugin.INSTANCE;
	}

}
