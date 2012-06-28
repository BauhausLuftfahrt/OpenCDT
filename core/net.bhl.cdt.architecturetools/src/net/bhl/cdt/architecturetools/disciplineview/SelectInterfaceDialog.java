/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.disciplineview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.DisciplineView;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class SelectInterfaceDialog extends Dialog {
	private Table table;
	private final Configuration configuration;
	private final DisciplineView view;
	private HashSet<EClass> result;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param view
	 * @param configuration
	 */
	public SelectInterfaceDialog(Shell parentShell,
			Configuration configuration, DisciplineView view) {
		super(parentShell);
		this.configuration = configuration;
		this.view = view;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		GridData gd_composite = new GridData(SWT.FILL, SWT.TOP, true, false, 1,
				1);
		gd_composite.heightHint = 24;
		composite.setLayoutData(gd_composite);

		Label lblPleaseSelectThe = new Label(composite, SWT.NONE);
		lblPleaseSelectThe
				.setText("Please select the interfaces for this discipline view");
		getShell().setText("Interface Selection");

		table = new Table(container, SWT.BORDER | SWT.CHECK
				| SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		for (EClass clazz : getEClasses()) {
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(clazz.getName());
			item.setData(clazz);
			if (view.getInterfaceTypes().contains(clazz)) {
				item.setChecked(true);
			}
		}

		return container;
	}

	private Set<EClass> getEClasses() {
		HashSet<EClass> classes = new HashSet<EClass>();
		List<ComponentInterface> interfaces = ComponentInterfaceUtil
				.getComponentInterfaces(configuration, ComponentInterface.class);
		for (EObject obj : interfaces) {
			classes.add(obj.eClass());
		}
		return classes;
	}

	@Override
	protected void okPressed() {
		result = new HashSet<EClass>();
		for (TableItem item : table.getItems()) {
			if (item.getChecked()) {
				result.add((EClass) item.getData());
			}
		}
		super.okPressed();
	}

	public HashSet<EClass> getResult() {
		return result;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

}
