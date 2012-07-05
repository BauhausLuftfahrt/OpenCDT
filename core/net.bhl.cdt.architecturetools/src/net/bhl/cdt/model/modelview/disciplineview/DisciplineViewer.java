/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.disciplineview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage;
import net.bhl.cdt.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.model.architecturetools.Massive;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.model.architecturetools.WettedAreaInterface;
import net.bhl.cdt.model.architecturetools.exceptions.NoValueFoundException;
import net.bhl.cdt.model.modelview.ConfigurationInput;
import net.bhl.cdt.model.modelview.DisciplineView;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;
import net.bhl.cdt.ui.menu.ContextMenuGenerator;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
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
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		Composite header = new Composite(container, SWT.NONE);
		header.setLayout(new GridLayout(3, false));
		GridData gd_header = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_header.heightHint = 31;
		header.setLayoutData(gd_header);

		Label lblFocusingOn = new Label(header, SWT.NONE);
		lblFocusingOn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblFocusingOn.setText("Focus:");

		interfaceText = new Text(header, SWT.BORDER);
		interfaceText.setEditable(false);
		interfaceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Button btnManageInterfaces = new Button(header, SWT.NONE);
		btnManageInterfaces.setText("Manage");
		btnManageInterfaces.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				SelectInterfaceDialog interfaceDialog = new SelectInterfaceDialog(
						getSite().getShell(), configuration, view);
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
		treeViewer.setLabelProvider(new DisciplineLabelProvider(treeViewer,
				view));
		treeViewer.setContentProvider(new DisciplineContenProvider(view));

		// getSite().addSelectionListener(this);

		getSite().setSelectionProvider(treeViewer);

		ContextMenuGenerator.generateContextMenu(getSite(), treeViewer);

		TreeViewer unsortedViewer = new TreeViewer(content, SWT.BORDER);
		Tree unsortedElements = unsortedViewer.getTree();
		unsortedElements.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		unsortedViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));
		unsortedViewer.setContentProvider(new AdapterFactoryContentProvider(
				new ComposedAdapterFactory(
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
		treeViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return (parentElement instanceof Configuration && element == mainComponent)
						|| !(parentElement instanceof Configuration);
			}
		});
		treeViewer.addFilter(new SimpleFilter());
		treeViewer.setInput(configuration);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
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
		mainComponent = configuration.getComponents().get(0);

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

	private final class SimpleFilter extends ViewerFilter {

		private HashSet<EObject> allowed;

		public SimpleFilter() {
			allowed = new HashSet<EObject>();
			for (EClass clazz : view.getInterfaceTypes()) {
				if (clazz.equals(ArchitecturetoolsPackage.eINSTANCE
						.getPowerConsumer())) {
					List<PowerConsumer> interfaces = ComponentInterfaceUtil
							.getComponentInterfaces(configuration, clazz,
									PowerConsumer.class);
					for (PowerConsumer consumer : interfaces) {
						addPowerConsumer(consumer, allowed);
					}
				}
				if (clazz.equals(ArchitecturetoolsPackage.eINSTANCE
						.getMassive())) {
					List<Massive> interfaces = ComponentInterfaceUtil
							.getComponentInterfaces(configuration, clazz,
									Massive.class);
					for (Massive mass : interfaces) {
						addMassive(mass, allowed);
					}
				}
				if (clazz.equals(ArchitecturetoolsPackage.eINSTANCE
						.getWettedAreaInterface())) {
					List<WettedAreaInterface> interfaces = ComponentInterfaceUtil
							.getComponentInterfaces(configuration, clazz,
									WettedAreaInterface.class);
					for (WettedAreaInterface wettedAreaInterface : interfaces) {
						addWettedAreaInterface(wettedAreaInterface, allowed);
					}
				}
				if (clazz.equals(ArchitecturetoolsPackage.eINSTANCE
						.getReferenceAreaInterface())) {
					List<ReferenceAreaInterface> interfaces = ComponentInterfaceUtil
							.getComponentInterfaces(configuration, clazz,
									ReferenceAreaInterface.class);
					for (ReferenceAreaInterface referenceAreaInterface : interfaces) {
						addReferenceAreaInterface(referenceAreaInterface,
								allowed);
					}
				}
				if (clazz.equals(ArchitecturetoolsPackage.eINSTANCE
						.getCoefficientInterface())) {
					List<CoefficientInterface> interfaces = ComponentInterfaceUtil
							.getComponentInterfaces(configuration, clazz,
									CoefficientInterface.class);
					for (CoefficientInterface coefficientInterface : interfaces) {
						addCoefficientInterface(coefficientInterface, allowed);
					}
				}
			}

		}

		private void addMassive(Massive mass, HashSet<EObject> allowed) {
			allowed.add(mass);
			addParents(mass.eContainer(), allowed);
			try {
				if (mass.getMass() != null) {

					allowed.add(mass.getMass());
				}
			} catch (NoValueFoundException e) {
				// Do nothing
			} catch (Exception e) {
				throw new CDTRuntimeException(e.getMessage());
			}

			if (mass.getMassParameter() != null)
				allowed.add(mass.getMassParameter());
		}

		private void addPowerConsumer(PowerConsumer consumer,
				HashSet<EObject> allowed) {
			allowed.add(consumer);
			addParents(consumer.eContainer(), allowed);
			try {
				if (consumer.getPowerParameter() != null)
					allowed.add(consumer.getPowerParameter());
				if (consumer.getPowerConsumption() != null)
					allowed.add(consumer.getPowerConsumption());
			} catch (NoValueFoundException e) {
				// Do nothing
			} catch (Exception e) {
				throw new CDTRuntimeException(e.getMessage());
			}
		}

		private void addParents(EObject parent, HashSet<EObject> allowed) {
			if (parent == null || parent instanceof Configuration) {
				return;
			}
			allowed.add(parent);
			addParents(parent.eContainer(), allowed);
		}

		public void addWettedAreaInterface(
				WettedAreaInterface wettedAreaInterface,
				HashSet<EObject> allowed) {

			allowed.add(wettedAreaInterface);
			addParents(wettedAreaInterface.eContainer(), allowed);
			try {
				if (wettedAreaInterface.getWettedArea() != null) {

					allowed.add(wettedAreaInterface.getWettedArea());
				}
			} catch (NoValueFoundException e) {
				// Do nothing
			} catch (Exception e) {
				throw new CDTRuntimeException(e.getMessage());
			}

			if (wettedAreaInterface.getWettedAreaParameter() != null)
				allowed.add(wettedAreaInterface.getWettedAreaParameter());
		}

		public void addReferenceAreaInterface(
				ReferenceAreaInterface referenceAreaInterface,
				HashSet<EObject> allowed) {

			allowed.add(referenceAreaInterface);
			addParents(referenceAreaInterface.eContainer(), allowed);
			try {
				if (referenceAreaInterface.getReferenceArea() != null) {

					allowed.add(referenceAreaInterface.getReferenceArea());
				}
			} catch (NoValueFoundException e) {
				// Do nothing
			} catch (Exception e) {
				throw new CDTRuntimeException(e.getMessage());
			}

			if (referenceAreaInterface.getReferenceAreaParameter() != null)
				allowed.add(referenceAreaInterface.getReferenceAreaParameter());
		}

		public void addCoefficientInterface(
				CoefficientInterface coeffecientInterface,
				HashSet<EObject> allowed) {

			allowed.add(coeffecientInterface);
			addParents(coeffecientInterface.eContainer(), allowed);
			try {
				if (coeffecientInterface.getCoefficient() != null) {

					allowed.add(coeffecientInterface.getCoefficient());
				}
			} catch (NoValueFoundException e) {
				// Do nothing
			} catch (Exception e) {
				throw new CDTRuntimeException(e.getMessage());
			}

			if (coeffecientInterface.getCoefficientParameter() != null)
				allowed.add(coeffecientInterface.getCoefficientParameter());
		}

		// public void addWettedAreaInterface(WettedAreaInterface
		// wettedAreaInterface,
		// HashSet<EObject> allowed) {
		//
		// allowed.add(wettedAreaInterface);
		// addParents (wettedAreaInterface.eContainer(), allowed);
		// try {
		// if (wettedAreaInterface.getWettedArea() != null) {
		//
		// allowed.add(wettedAreaInterface.getWettedArea());
		// }
		// } catch (NoValueFoundException e) {
		// //Do nothing
		// } catch (Exception e) {
		// throw new CDTRuntimeException(e.getMessage());
		// }
		//
		// if (wettedAreaInterface.getWettedAreaParameter() != null)
		// allowed.add(wettedAreaInterface.getWettedAreaParameter());
		// }
		//
		// public void addWettedAreaInterface(WettedAreaInterface
		// wettedAreaInterface,
		// HashSet<EObject> allowed) {
		//
		// allowed.add(wettedAreaInterface);
		// addParents (wettedAreaInterface.eContainer(), allowed);
		// try {
		// if (wettedAreaInterface.getWettedArea() != null) {
		//
		// allowed.add(wettedAreaInterface.getWettedArea());
		// }
		// } catch (NoValueFoundException e) {
		// //Do nothing
		// } catch (Exception e) {
		// throw new CDTRuntimeException(e.getMessage());
		// }
		//
		// if (wettedAreaInterface.getWettedAreaParameter() != null)
		// allowed.add(wettedAreaInterface.getWettedAreaParameter());
		// }

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			return allowed.contains(element);
		}
	}

}
