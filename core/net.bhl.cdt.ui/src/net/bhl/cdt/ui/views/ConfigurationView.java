/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.views;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.ui.menu.ContextMenuGenerator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * ConfigurationView class.
 * 
 * @author Michael Kagel
 */
public class ConfigurationView extends ViewPart implements ISelectionListener {

	/**
	 * ID.
	 */
	public static final String ID = "net.bhl.cdt.ui.views.ConfigurationView";
	private static TreeViewer viewer;
	private ESWorkspace currentWorkspace;

	private List<ConfigurationViewFilter> filters;
	private boolean filterActive;

	/**
	 * Constructor.
	 */
	public ConfigurationView() {
		currentWorkspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		addOperationListener(currentWorkspace);
		initFilters();
	}

	private void initFilters() {
		filters = new ArrayList<ConfigurationViewFilter>();
		for (IConfigurationElement element : Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						"net.bhl.cdt.gui.configurationview.filter")) {
			try {
				Object object = element.createExecutableExtension("class");
				if (object instanceof ConfigurationViewFilter) {
					filters.add((ConfigurationViewFilter) object);
				}
			} catch (CoreException e) {
			}
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		// PatternFilter filter = new PatternFilter();
		// FilteredTree filteredTree = new FilteredTree(parent, SWT.V_SCROLL |
		// SWT.H_SCROLL, filter, true);
		viewer = new TreeViewer(parent);
		IDecoratorManager decoratorManager = PlatformUI.getWorkbench()
				.getDecoratorManager();
		viewer.setLabelProvider(new DecoratingLabelProvider(
				new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE)),
				decoratorManager.getLabelDecorator()));
		viewer.setContentProvider(new AdapterFactoryContentProvider(
				new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));

		getViewSite().getPage().addSelectionListener(this);

		getSite().setSelectionProvider(viewer);

		ContextMenuGenerator.generateContextMenu(getSite(), viewer);

		createActions();
	}

	private void createActions() {
		Action action = new Action("Filter View", Action.AS_CHECK_BOX) {
			public void run() {
				filterActive = false;
				Configuration configuration = (Configuration) viewer.getInput();
				if (configuration == null) {
					return;
				}
				// uncheck
				if (!isChecked()) {
					refreshFiltering(configuration);
					return;
				}
				boolean successfulFilterConfig = false;
				for (ConfigurationViewFilter filter : filters) {
					successfulFilterConfig |= filter
							.configureFilter(configuration);
				}
				if (successfulFilterConfig) {
					filterActive = true;
					refreshFiltering(configuration);
				}
			}
		};

		action.setEnabled(filters.size() > 0);
		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();
		toolBarManager.add(action);
	}

	private void refreshFiltering(Configuration configuration) {
		addFilters(configuration);
		viewer.refresh();
	}

	private void addFilters(Configuration config) {
		viewer.resetFilters();
		if (!filterActive) {
			return;
		}
		TreeIterator<EObject> iterator = config.eAllContents();
		final HashSet<EObject> passedFilter = new HashSet<EObject>();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			boolean passes = true;
			for (ConfigurationViewFilter filter : filters) {
				passes = passes && !filter.filter(next);
			}
			if (passes) {
				passedFilter.add(next);
			}
		}

		final HashSet<EObject> originalList = new HashSet<EObject>(passedFilter);
		for (EObject element : originalList) {
			addParents(passedFilter, config, element);
		}

		viewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return passedFilter.contains(element);
			}
		});
	}

	// private void addFilters(Configuration config) {
	// viewer.resetFilters();
	// if (!isFiltered) {
	// return;
	// }
	// TreeIterator<EObject> iterator = config.eAllContents();
	// final HashSet<EObject> components = new HashSet<EObject>();
	// while (iterator.hasNext()) {
	// EObject next = iterator.next();
	// if (next instanceof Component) {
	// PowerConsumer powerConsumer = ((Component)
	// next).getInterfaceByClass(PowerConsumer.class);
	// if (powerConsumer == null || isFiltered(powerConsumer))
	// continue;
	// components.add(next);
	// components.add(powerConsumer);
	// components.add(powerConsumer.getPowerParameter());
	// components.add(powerConsumer.getPowerConsumption());
	// }
	// }
	// final HashSet<EObject> iComs = new HashSet<EObject>(components);
	// for (EObject com : iComs) {
	// addParents(components, config, com);
	// }
	//
	// viewer.addFilter(new ViewerFilter() {
	// @Override
	// public boolean select(Viewer viewer, Object parentElement, Object
	// element) {
	// return components.contains(element) || iComs.contains(parentElement);
	// }
	// });
	// }

	private void addParents(HashSet<EObject> elements, Configuration config,
			EObject element) {
		if (config == element || element == null) {
			return;
		}
		elements.add(element);
		addParents(elements, config, element.eContainer());
	}

	/**
	 * Is necessary for refreshing the viewer on every operation. Furthermore it
	 * handles specific operations on which the view has to react.
	 * 
	 * @param currentWorkspace
	 */
	private void addOperationListener(ESWorkspace currentWorkspace) {

		EContentAdapter contentRefreshAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature().equals(
						ModelPackage.Literals.MODEL__CONFIGURATIONS)
						&& msg.getEventType() == Notification.REMOVE) {
					resetConfigurationView();
				}
			}
		};

		for (ESLocalProject localProject : currentWorkspace.getLocalProjects()) {
			Set<EObject> list = localProject.getAllModelElements();
			for (EObject obj : list){
				obj.eAdapters().add(contentRefreshAdapter);
			}
		}
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (part instanceof ViewPart) {
			if (selection instanceof ITreeSelection) {
				ITreeSelection treeSel = (ITreeSelection) selection;
				if (treeSel.getFirstElement() instanceof Configuration) {
					setConfigurationViewWithConfiguration((Configuration) treeSel
							.getFirstElement());
				} else if (treeSel.getFirstElement() instanceof Element) {
					determineParentConfiguration((Element) treeSel
							.getFirstElement());
				}
			}
		}
	}

	private void determineParentConfiguration(Element element) {
		Configuration configuration = getConfiguration(element);
		if (configuration != null) {
			setConfigurationViewWithConfiguration(configuration);
		}
	}

	/**
	 * @param element
	 *            The selected element of the CDTNavigator View
	 * @return The Configuration of the selected element or null, if the
	 *         selection was not a child element of Configuration (e.g.
	 *         Resources)
	 */
	private Configuration getConfiguration(Element element) {
		EObject eContainer = element.eContainer();

		if (!(eContainer instanceof Element)) {
			return null;
		}

		if (eContainer instanceof Configuration) {
			return (Configuration) eContainer;
		} else if (eContainer instanceof ESLocalProject) {
			return null;
		} else {
			return getConfiguration((Element) eContainer);
		}

	}

	private void setConfigurationViewWithConfiguration(
			Configuration configuration) {
		addFilters(configuration);
		setConfigurationViewPartName(configuration);
		viewer.setInput(configuration);
	}

	private void setConfigurationViewPartName(Configuration config) {
		if (config != null && config.getName() != null) {
			setConfigurationViewPartName(config.getName());
		} else {
			setConfigurationViewPartName("");
		}
	}

	private void setConfigurationViewPartName(String name) {
		if (!name.equals("")) {
			this.setPartName(name);
		} else {
			this.setPartName("ConfigurationView");
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		getSite().setSelectionProvider(null);
		getViewSite().getPage().removeSelectionListener(ID, this);
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	private void resetConfigurationView() {
		viewer.setInput(null);
		setConfigurationViewPartName("");
	}

}
