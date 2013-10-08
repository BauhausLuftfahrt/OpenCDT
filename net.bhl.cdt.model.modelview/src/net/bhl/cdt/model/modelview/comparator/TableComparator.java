/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.comparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.modelview.powerconsumer.EstimatorDialog;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;

import org.eclipse.emf.ecp.common.dialogs.ModelElementSelectionDialog;
import org.eclipse.emf.ecp.common.model.ECPWorkspaceManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

public class TableComparator<T extends ComponentInterface> extends Composite {
	private Table table;
	private Text txtElementname;
	private TableViewer tableViewer;
	private final Class<T> typeClass;
	private final Configuration targetConfig;
	private String targetName;
	private ArrayList<Configuration> references;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 * @param targetConfig
	 * @param typeClass
	 */
	public TableComparator(Composite parent, int style,
			Configuration targetConfig, Class<T> typeClass) {
		super(parent, style);
		this.targetConfig = targetConfig;
		this.targetName = targetConfig.getName() == null ? "" : targetConfig
				.getName();
		this.typeClass = typeClass;
		this.references = new ArrayList<Configuration>();

		setLayout(new GridLayout(1, false));

		Composite topBar = new Composite(this, SWT.NONE);
		topBar.setLayout(new GridLayout(3, false));
		GridData gd_topBar = new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1);
		gd_topBar.heightHint = 33;
		topBar.setLayoutData(gd_topBar);

		Label lblLabel = new Label(topBar, SWT.NONE);
		lblLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblLabel.setText("Target Configuration:");

		txtElementname = new Text(topBar, SWT.BORDER);
		txtElementname.setText(targetName);
		txtElementname.setEditable(false);
		txtElementname.setBackground(new Color(Display.getCurrent(), 200, 222,
				255));
		GridData gd_txtElementname = new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1);
		gd_txtElementname.widthHint = 174;
		txtElementname.setLayoutData(gd_txtElementname);

		Composite buttonContainer = new Composite(topBar, SWT.NONE);

		createButtons(buttonContainer);

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());

		createInitialColumns(tableViewer);

		refresh();

		tableViewer.getTable().setFocus();
	}

	private void createButtons(Composite buttonContainer) {
		Button btnAddReference = new Button(buttonContainer, SWT.NONE);
		btnAddReference.setSize(89, 25);
		btnAddReference.setText("Add Reference");
		btnAddReference.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelElementSelectionDialog dialog = new ModelElementSelectionDialog(
						ECPWorkspaceManager.getECPProject(targetConfig),
						ModelPackage.eINSTANCE.getConfiguration(), false) {
				};
				dialog.setBlockOnOpen(true);
				if (dialog.open() == Dialog.OK) {
					Object[] result = dialog.getResult();
					if (result != null && result.length == 1) {
						Configuration newReference = (Configuration) result[0];
						addReference(newReference);
					}
				}
			}
		});
		// Button refreshButton = new Button(buttonContainer, SWT.NONE);
		// refreshButton.setSize(25, 25);
		// refreshButton.setText("R");
		// refreshButton.addSelectionListener(new SelectionAdapter() {
		// @Override
		// public void widgetSelected(SelectionEvent e) {
		// refresh();
		// }
		// });
	}

	/**
	 * TODO REFACTOR REFERENCE MAPPING
	 */
	public void addReference(Configuration reference) {
		if (references.contains(reference)) {
			return;
		}
		references.add(reference);
		List<T> componentInterfaces = ComponentInterfaceUtil
				.getComponentInterfaces(reference, typeClass);
		final HashMap<String, Component> values = new HashMap<String, Component>();
		// better mapping then string
		for (T comp : componentInterfaces) {
			values.put(comp.getParentComponent().getName(),
					comp.getParentComponent());
		}
		TableViewerColumn column = createColumn(tableViewer,
				reference.getName(), 120, new ColumnLabelProvider() {
					@SuppressWarnings("unchecked")
					@Override
					public String getText(Object element) {
						if (element instanceof Component) {
							Component comp = values.get(((Component) element)
									.getName());
							if (comp != null) {
								return getCellValue(comp);
							}
						} else if (element instanceof TableComparator.Group) {
							ArrayList<Component> group = new ArrayList<Component>();
							for (Component children : ((Group) element).children) {
								Component comp = values.get(children.getName());
								if (comp != null) {
									group.add(comp);
								}
							}
							return getGroupCellValue(group);
						}
						return "na";
					}

					@Override
					public Color getBackground(Object element) {
						if (element instanceof TableComparator.Group) {
							return Display.getCurrent().getSystemColor(
									SWT.COLOR_DARK_BLUE);
						}
						return super.getBackground(element);
					}

					@Override
					public Color getForeground(Object element) {
						if (element instanceof TableComparator.Group) {
							return Display.getCurrent().getSystemColor(
									SWT.COLOR_WHITE);
						}
						return super.getForeground(element);
					}
				});
		column.getColumn().setMoveable(true);
		referenceAdded(reference);
		refresh();
	}

	/**
	 * Hook to listen on added references
	 * 
	 * @param reference
	 */
	protected void referenceAdded(Configuration reference) {
	}

	private void refresh() {
		tableViewer.setInput(getInput());
		tableViewer.refresh();
	}

	protected Object getInput() {
		// List<T> componentInterfaces = ComponentInterfaceUtil
		// .getComponentInterfaces(targetConfig, typeClass);
		// ArrayList<Object> result = new ArrayList<Object>();
		// if (componentInterfaces.size() == 0)
		// return result;
		// Group lastGroup = new Group((Component) componentInterfaces.get(0)
		// .getParentComponent().eContainer());
		// for (T comp : componentInterfaces) {
		// if (comp.getParentComponent().eContainer() != lastGroup.name) {
		// result.add(lastGroup);
		// lastGroup = new Group((Component) comp.getParentComponent()
		// .eContainer());
		// }
		// lastGroup.children.add(comp.getParentComponent());
		// result.add(comp.getParentComponent());
		// }
		// result.add(lastGroup);
		return null;
	}

	private void createInitialColumns(TableViewer tableViewer) {
		createColumn(tableViewer, "System", 150, new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Component) {
					return ((Component) element).getName();
				} else if (element instanceof TableComparator.Group) {
					String name = ((TableComparator.Group) element).name;
					return name == null ? "" : "Total of " + name;
				}
				return super.getText(element);
			}

			@Override
			public Color getBackground(Object element) {
				if (element instanceof TableComparator.Group) {
					return Display.getCurrent().getSystemColor(
							SWT.COLOR_DARK_BLUE);
				}
				return super.getBackground(element);
			}

			@Override
			public Color getForeground(Object element) {
				if (element instanceof TableComparator.Group) {
					return Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
				}
				return super.getForeground(element);
			}
		});

		TableViewerColumn viewerColumn = createColumn(tableViewer, targetName,
				120, new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
						if (element instanceof Component) {
							return getCellValue((Component) element);
						} else if (element instanceof TableComparator.Group) {
							return getGroupCellValue(((TableComparator.Group) element).children);
						}
						return super.getText(element);
					}

					@Override
					public Color getBackground(Object element) {
						if (element instanceof TableComparator.Group) {
							return Display.getCurrent().getSystemColor(
									SWT.COLOR_DARK_BLUE);
						}
						return new Color(Display.getCurrent(), 200, 222, 255);
					}

					@Override
					public Color getForeground(Object element) {
						if (element instanceof TableComparator.Group) {
							return Display.getCurrent().getSystemColor(
									SWT.COLOR_WHITE);
						}
						return super.getForeground(element);
					}
				});

		viewerColumn.setEditingSupport(new TargetEditingSupport());
	}

	protected String getCellValue(Component c) {
		return "";
	}

	protected String getGroupCellValue(List<Component> cs) {
		return "";
	}

	private TableViewerColumn createColumn(TableViewer tableViewer,
			String name, int width, ColumnLabelProvider provider) {
		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		tableViewerColumn.setLabelProvider(provider);
		TableColumn tblclmnSystem = tableViewerColumn.getColumn();
		tblclmnSystem.setWidth(width);
		tblclmnSystem.setText(name == null ? "" : name);
		return tableViewerColumn;
	}

	protected class Group {
		public String name;
		public ArrayList<Component> children;

		public Group(String name) {
			this.name = name;
			children = new ArrayList<Component>();
		}
	}

	public class TargetEditingSupport extends EditingSupport {

		public TargetEditingSupport() {
			super(tableViewer);
		}

		@Override
		protected boolean canEdit(Object element) {
			return element instanceof Component;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return new DialogCellEditor(tableViewer.getTable()) {
				@Override
				protected Object openDialogBox(Control cellEditorWindow) {
					EstimatorDialog estimatorDialog = new EstimatorDialog(
							cellEditorWindow.getShell(),
							(Component) getValue(), references);

					if (estimatorDialog.open() == Dialog.OK) {
						return estimatorDialog.getValue();
					}
					return null;
				}
			};
		}

		@Override
		protected Object getValue(Object element) {
			return (Component) element;
		}

		@Override
		protected void setValue(Object element, Object val) {
			// if (!(val instanceof Value))
			// return;
			refresh();
		}
	}
}
