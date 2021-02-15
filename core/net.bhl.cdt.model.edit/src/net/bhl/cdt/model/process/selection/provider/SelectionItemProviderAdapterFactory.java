/**
 */
package net.bhl.cdt.model.process.selection.provider;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import net.bhl.cdt.model.process.selection.SelectionPackage;
import net.bhl.cdt.model.process.selection.util.SelectionAdapterFactory;

import net.bhl.cdt.model.provider.ModelEditPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionItemProviderAdapterFactory extends SelectionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ModelEditPlugin.INSTANCE, SelectionPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.ValueSelectionArgument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSelectionArgumentItemProvider valueSelectionArgumentItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.ValueSelectionArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSelectionArgumentAdapter() {
		if (valueSelectionArgumentItemProvider == null) {
			valueSelectionArgumentItemProvider = new ValueSelectionArgumentItemProvider(this);
		}

		return valueSelectionArgumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.ValueSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSelectionItemProvider valueSelectionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.ValueSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSelectionAdapter() {
		if (valueSelectionItemProvider == null) {
			valueSelectionItemProvider = new ValueSelectionItemProvider(this);
		}

		return valueSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.SelectedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedValueItemProvider selectedValueItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.SelectedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectedValueAdapter() {
		if (selectedValueItemProvider == null) {
			selectedValueItemProvider = new SelectedValueItemProvider(this);
		}

		return selectedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.SelectedMeasuredValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedMeasuredValueItemProvider selectedMeasuredValueItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.SelectedMeasuredValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectedMeasuredValueAdapter() {
		if (selectedMeasuredValueItemProvider == null) {
			selectedMeasuredValueItemProvider = new SelectedMeasuredValueItemProvider(this);
		}

		return selectedMeasuredValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.NameCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameCriterionItemProvider nameCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.NameCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameCriterionAdapter() {
		if (nameCriterionItemProvider == null) {
			nameCriterionItemProvider = new NameCriterionItemProvider(this);
		}

		return nameCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.PartOfCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartOfCriterionItemProvider partOfCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.PartOfCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartOfCriterionAdapter() {
		if (partOfCriterionItemProvider == null) {
			partOfCriterionItemProvider = new PartOfCriterionItemProvider(this);
		}

		return partOfCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.HighestValueCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighestValueCriterionItemProvider highestValueCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.HighestValueCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHighestValueCriterionAdapter() {
		if (highestValueCriterionItemProvider == null) {
			highestValueCriterionItemProvider = new HighestValueCriterionItemProvider(this);
		}

		return highestValueCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.PreferLatestCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferLatestCriterionItemProvider preferLatestCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.PreferLatestCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreferLatestCriterionAdapter() {
		if (preferLatestCriterionItemProvider == null) {
			preferLatestCriterionItemProvider = new PreferLatestCriterionItemProvider(this);
		}

		return preferLatestCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.PreferGeneratedCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferGeneratedCriterionItemProvider preferGeneratedCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.PreferGeneratedCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreferGeneratedCriterionAdapter() {
		if (preferGeneratedCriterionItemProvider == null) {
			preferGeneratedCriterionItemProvider = new PreferGeneratedCriterionItemProvider(this);
		}

		return preferGeneratedCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.model.process.selection.PreferAuthorCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferAuthorCriterionItemProvider preferAuthorCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.model.process.selection.PreferAuthorCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreferAuthorCriterionAdapter() {
		if (preferAuthorCriterionItemProvider == null) {
			preferAuthorCriterionItemProvider = new PreferAuthorCriterionItemProvider(this);
		}

		return preferAuthorCriterionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (valueSelectionArgumentItemProvider != null) valueSelectionArgumentItemProvider.dispose();
		if (valueSelectionItemProvider != null) valueSelectionItemProvider.dispose();
		if (selectedValueItemProvider != null) selectedValueItemProvider.dispose();
		if (selectedMeasuredValueItemProvider != null) selectedMeasuredValueItemProvider.dispose();
		if (nameCriterionItemProvider != null) nameCriterionItemProvider.dispose();
		if (partOfCriterionItemProvider != null) partOfCriterionItemProvider.dispose();
		if (highestValueCriterionItemProvider != null) highestValueCriterionItemProvider.dispose();
		if (preferLatestCriterionItemProvider != null) preferLatestCriterionItemProvider.dispose();
		if (preferGeneratedCriterionItemProvider != null) preferGeneratedCriterionItemProvider.dispose();
		if (preferAuthorCriterionItemProvider != null) preferAuthorCriterionItemProvider.dispose();
	}

}