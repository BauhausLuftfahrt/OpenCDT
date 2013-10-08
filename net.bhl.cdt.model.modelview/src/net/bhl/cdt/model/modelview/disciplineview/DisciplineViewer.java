/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.disciplineview;

import java.util.HashSet;
import java.util.Set;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.modelview.ConfigurationInput;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.modelview.Filter;
import net.bhl.cdt.model.modelview.SetOperator;
import net.bhl.cdt.model.modelview.SetOperators;
import net.bhl.cdt.model.modelview.disciplineview.exceptions.NoFilterDefinedException;
import net.bhl.cdt.ui.menu.ContextMenuGenerator;
import net.bhl.cdt.utilities.commands.CDTCommand;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class DisciplineViewer extends EditorPart {

	public static final String ID = "net.bhl.cdt.architecturetools.disciplineview.disciplineviewer"; //$NON-NLS-1$
	private Configuration configuration;
	private DisciplineView view;
	private Component mainComponent;
	private TreeViewer treeViewer;
	private Text interfaceText;
	private EContentAdapter eContentAdapter;

	public DisciplineViewer() {
	}

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.setPartName(view.getName());
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		Composite header = new Composite(container, SWT.NONE);
		header.setLayout(new GridLayout(3, false));
		GridData gd_header = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_header.heightHint = 31;
		header.setLayoutData(gd_header);

		Label lblFocusingOn = new Label(header, SWT.NONE);
		lblFocusingOn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFocusingOn.setText("Focus:");

		interfaceText = new Text(header, SWT.BORDER);
		interfaceText.setEditable(false);
		interfaceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnManageInterfaces = new Button(header, SWT.NONE);
		btnManageInterfaces.setText("Manage");
		btnManageInterfaces.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				SelectInterfaceDialog interfaceDialog = new SelectInterfaceDialog(getSite().getShell(), configuration,
					view);
				interfaceDialog.setBlockOnOpen(true);
				if (interfaceDialog.open() == Dialog.OK) {
					final HashSet<EClass> result = interfaceDialog.getResult();
					new CDTCommand() {
						protected void doRun() {
							view.getInterfaceTypes().clear();
							view.getInterfaceTypes().addAll(result);
						}
					}.run();
					filter(result);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Composite content = new Composite(container, SWT.NONE);
		content.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		content.setLayout(new GridLayout(2, true));

		treeViewer = new TreeViewer(content, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		treeViewer.setLabelProvider(new DisciplineLabelProvider(treeViewer, view));
		treeViewer.setContentProvider(new DisciplineContenProvider(view));

		// getSite().addSelectionListener(this);

		getSite().setSelectionProvider(treeViewer);

		ContextMenuGenerator.generateContextMenu(getSite(), treeViewer);

		TreeViewer unsortedViewer = new TreeViewer(content, SWT.BORDER);
		Tree unsortedElements = unsortedViewer.getTree();
		unsortedElements.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		unsortedViewer.setLabelProvider(new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));
		unsortedViewer.setContentProvider(new AdapterFactoryContentProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));
		unsortedViewer.setInput(view);

		refresh();
		refreshListener();
	}

	private void refreshListener() {
		eContentAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				if (notification.isTouch()) {
					return;
				}
				if (notification.getNotifier() == view) {
					refresh();
				}
			}
		};
		view.eAdapters().add(eContentAdapter);
	}

	private void filter(Set<EClass> classes) {
		refresh();
	}

	private void refresh() {
		refreshTree();
		refreshHeader();
	}

	private void refreshHeader() {
		String str = "";
		for (EClass clazz : view.getInterfaceTypes()) {
			str += clazz.getName() + ", ";
		}
		int lastIndexOf = str.lastIndexOf(",");
		if (lastIndexOf < 0)
			lastIndexOf = 0;
		str = str.substring(0, lastIndexOf);
		interfaceText.setText(str);
	}

	private void refreshTree() {
		treeViewer.resetFilters();

		// Check if a DisciplineView contains a SetExpression
		if (view.getFilter() == null) {
			throw new NoFilterDefinedException();
		}

		if (view.getFilter().get(0) instanceof Filter) {
			Filter filter = (Filter) view.getFilter().get(0);
			SimpleFilter simpleFilter = new SimpleFilter(treeViewer.getContentProvider(), filter, configuration);
			treeViewer.addFilter(simpleFilter);

		} else {
			SetOperator setOperator = (SetOperator) view.getFilter().get(0);
			ViewerFilter resultFilter = null;
			resultFilter = buildFilter(setOperator);
			if (resultFilter != null) {
				treeViewer.addFilter(resultFilter);
			}
		}
		treeViewer.setInput(configuration.eContainer());
	}

	private ViewerFilter buildFilter(SetOperator setOperator) {
		ViewerFilter result = null;
		ViewerFilter filter1 = null;
		ViewerFilter filter2 = null;

		if (setOperator.getOperands().size() > 2) {
			// something is wrong
		} else {
			if (setOperator.getOperands().get(0) instanceof Filter) {
				Filter filter = (Filter) setOperator.getOperands().get(0);
				filter1 = new SimpleFilter(treeViewer.getContentProvider(), filter, configuration);
			} else {
				SetOperator operator = (SetOperator) setOperator.getOperands().get(0);
				filter1 = buildFilter(operator);
			}

			if (setOperator.getOperands().get(1) instanceof Filter) {
				Filter filter = (Filter) setOperator.getOperands().get(1);
				filter2 = new SimpleFilter(treeViewer.getContentProvider(), filter, configuration);
			} else {
				SetOperator operator = (SetOperator) setOperator.getOperands().get(1);
				filter2 = buildFilter(operator);
			}
		}

		if (setOperator.getOperator() == null) {
			// something is wrong
		} else {
			SetOperators operator = setOperator.getOperator();
			if (operator.getName().equals("AND")) {
				result = new AndFilter(treeViewer.getContentProvider(), filter1, filter2);
			} else if (operator.getName().equals("OR")) {
				result = new OrFilter(treeViewer.getContentProvider(), filter1, filter2);
			} else if (operator.getName().equals("MINUS")) {
				result = new MinusFilter(treeViewer.getContentProvider(), filter1, filter2);
			} else if (operator.getName().equals("PLUS")) {
				result = new PlusFilter(treeViewer.getContentProvider(), filter1, filter2);
			}
		}
		return result;
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (!(input instanceof ConfigurationInput)) {
			throw new PartInitException("Wrong Input");
		}
		ConfigurationInput cInput = (ConfigurationInput) input;

		configuration = cInput.getConfiguration();
		view = (DisciplineView) cInput.getView();

		// think about auto initialization
		if (configuration.getComponents().size() == 0) {
			throw new PartInitException("No components in configuration");
		}
		// better aircraft component selection?
		// TODO: check this out
		// mainComponent = configuration.getComponents().get(0);
		mainComponent = null;

		// editor related
		setInput(input);
		setSite(site);
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void dispose() {
		super.dispose();
		view.eAdapters().remove(eContentAdapter);
	}

	// private final class SimpleFilter extends ViewerFilter {
	//
	// private HashSet<EObject> allowed;
	//
	// public SimpleFilter() {
	// allowed = new HashSet<EObject>();
	//
	// for (net.bhl.cdt.model.modelview.Filter filter : view.getFilter()) {
	//
	// // MappableComponentInterface mappableFilterInterface = (MappableComponentInterface)
	// // filter.getInterface()
	// // .get(0);
	// // EClass eclazz = mappableFilterInterface.eClass();
	// // // filteredInterface: List for keeping all instances of an interface specified in a filter
	// // List<MappableComponentInterface> filteredInterfaces = ComponentInterfaceUtil.getComponentInterfaces(
	// // configuration, eclazz, MappableComponentInterface.class);
	//
	// List<MappableComponentInterface> filteredInterfaces = new ArrayList<MappableComponentInterface>();
	//
	// if (filter.getInterface().isEmpty()) {
	// filteredInterfaces.addAll(ComponentInterfaceUtil.getComponentInterfaces(configuration,
	// MappableComponentInterface.class));
	// } else {
	//
	// for (ComponentInterface filterInterface : filter.getInterface()) {
	// EClass eclazz = filterInterface.eClass();
	// // filteredInterface: List for keeping all instances of an interface specified in a filter
	// filteredInterfaces.addAll(ComponentInterfaceUtil.getComponentInterfaces(configuration, eclazz,
	// MappableComponentInterface.class));
	// }
	// }
	//
	// for (MappableComponentInterface mappableInterface : filteredInterfaces) {
	// // Check whether an instance of filtertedInterface matches the other filter criteria
	// if (filtered(filter, mappableInterface)) {
	// try {
	// if (mappableInterface.getParameter() != null) {
	// allowed.add(mappableInterface.getParameter());
	// addParents(mappableInterface.eContainer(), allowed);
	// }
	// } catch (NoParameterSetForInterfaceException e) {
	// // Do nothing
	// } catch (Exception e) {
	// throw new CDTRuntimeException(e.getMessage());
	// }
	// }
	// }
	// }
	// }
	//
	// private boolean filtered(Filter filter, MappableComponentInterface mappableInterface) {
	// boolean result = true;
	//
	// if ((filter.getComponent() != null)
	// && !(filter.getComponent().equals(mappableInterface.getParentComponent()))) {
	// return false;
	// }
	//
	// if (filter.getDiscipline().isEmpty()) {
	// if (mappableInterface.getDiscipline() != null || !mappableInterface.getDiscipline().isEmpty()) {
	// return false;
	// }
	// } else {
	// if (mappableInterface.getDiscipline().isEmpty()) {
	// return false;
	// }
	// boolean match = false;
	// for (String filterDiscipline : filter.getDiscipline()) {
	// if (mappableInterface.getDiscipline().contains(filterDiscipline)) {
	// match = true;
	// } else {
	// match = false;
	// return false ;
	// }
	// }
	//
	// if (!match) {
	// return false;
	// }
	//
	// }
	//
	// if (filter.getSource() == null) {
	// if (mappableInterface.getSource() != null && !mappableInterface.getSource().isEmpty()) {
	// return false;
	// }
	// } else {
	// if (!filter.getSource().isEmpty() || mappableInterface.getSource() != null) {
	//
	// if (!filter.getSource().equals(mappableInterface.getSource())) {
	// return false;
	// }
	// }
	// }
	//
	// // if ((filter.getText() != null) && (!filter.getText().equals(mappableInterface.getAnnotation()))) {
	// // return false;
	// // }
	//
	// return result;
	// }
	//
	// private void addParents(EObject parent, HashSet<EObject> allowed) {
	// // if (parent == null || parent instanceof Configuration) {
	// // return;
	// // }
	// if (parent == null || parent instanceof Model) {
	// return;
	// }
	// allowed.add(parent);
	// addParents(parent.eContainer(), allowed);
	// }
	//
	// public boolean select(Viewer viewer, Object parentElement, Object element) {
	// boolean result = allowed.contains(element);
	// return result;
	// }
	// }

}
