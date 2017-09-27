/**
 */
package cdtliterature.provider;


import cdtliterature.CdtliteratureFactory;
import cdtliterature.CdtliteraturePackage;
import cdtliterature.Library;

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
 * This is the item provider adapter for a {@link cdtliterature.Library} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryItemProvider 
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
	public LibraryItemProvider(AdapterFactory adapterFactory) {
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
			addArticlePropertyDescriptor(object);
			addInbookPropertyDescriptor(object);
			addConferencePropertyDescriptor(object);
			addIncollectionPropertyDescriptor(object);
			addInproceedingsPropertyDescriptor(object);
			addProceedingsPropertyDescriptor(object);
			addTechreportPropertyDescriptor(object);
			addPhdthesisPropertyDescriptor(object);
			addMasterthesisPropertyDescriptor(object);
			addUnpublishedPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
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
				 getString("_UI_Library_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_name_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Article feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArticlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_article_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_article_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__ARTICLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbook feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInbookPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_inbook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_inbook_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__INBOOK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_conference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_conference_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__CONFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incollection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncollectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_incollection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_incollection_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__INCOLLECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inproceedings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInproceedingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_inproceedings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_inproceedings_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__INPROCEEDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proceedings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProceedingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_proceedings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_proceedings_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__PROCEEDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Techreport feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechreportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_techreport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_techreport_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__TECHREPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phdthesis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhdthesisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_phdthesis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_phdthesis_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__PHDTHESIS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Masterthesis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterthesisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_masterthesis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_masterthesis_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__MASTERTHESIS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unpublished feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnpublishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_unpublished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_unpublished_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__UNPUBLISHED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Library_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Library_title_feature", "_UI_Library_type"),
				 CdtliteraturePackage.Literals.LIBRARY__TITLE,
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
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__ARTICLE);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__BOOK);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__INBOOK);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__CONFERENCE);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__INCOLLECTION);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__INPROCEEDINGS);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__PROCEEDINGS);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__TECHREPORT);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__PHDTHESIS);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__MASTERTHESIS);
			childrenFeatures.add(CdtliteraturePackage.Literals.LIBRARY__UNPUBLISHED);
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
	 * This returns Library.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Library"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Library)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Library_type") :
			getString("_UI_Library_type") + " " + label;
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

		switch (notification.getFeatureID(Library.class)) {
			case CdtliteraturePackage.LIBRARY__NAME:
			case CdtliteraturePackage.LIBRARY__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CdtliteraturePackage.LIBRARY__ARTICLE:
			case CdtliteraturePackage.LIBRARY__BOOK:
			case CdtliteraturePackage.LIBRARY__INBOOK:
			case CdtliteraturePackage.LIBRARY__CONFERENCE:
			case CdtliteraturePackage.LIBRARY__INCOLLECTION:
			case CdtliteraturePackage.LIBRARY__INPROCEEDINGS:
			case CdtliteraturePackage.LIBRARY__PROCEEDINGS:
			case CdtliteraturePackage.LIBRARY__TECHREPORT:
			case CdtliteraturePackage.LIBRARY__PHDTHESIS:
			case CdtliteraturePackage.LIBRARY__MASTERTHESIS:
			case CdtliteraturePackage.LIBRARY__UNPUBLISHED:
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
				(CdtliteraturePackage.Literals.LIBRARY__ARTICLE,
				 CdtliteratureFactory.eINSTANCE.createArticle()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__BOOK,
				 CdtliteratureFactory.eINSTANCE.createBook()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__INBOOK,
				 CdtliteratureFactory.eINSTANCE.createInbook()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__CONFERENCE,
				 CdtliteratureFactory.eINSTANCE.createConference()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__INCOLLECTION,
				 CdtliteratureFactory.eINSTANCE.createIncollection()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__INPROCEEDINGS,
				 CdtliteratureFactory.eINSTANCE.createInproceedings()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__PROCEEDINGS,
				 CdtliteratureFactory.eINSTANCE.createProceedings()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__TECHREPORT,
				 CdtliteratureFactory.eINSTANCE.createTechreport()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__PHDTHESIS,
				 CdtliteratureFactory.eINSTANCE.createPhdthesis()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__MASTERTHESIS,
				 CdtliteratureFactory.eINSTANCE.createMasterthesis()));

		newChildDescriptors.add
			(createChildParameter
				(CdtliteraturePackage.Literals.LIBRARY__UNPUBLISHED,
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
		return CdtliteratureEditPlugin.INSTANCE;
	}

}
