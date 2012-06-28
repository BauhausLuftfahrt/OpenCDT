/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.powerconsumer.filter;

import java.util.ArrayList;

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
import org.eclipse.swt.widgets.Text;

public class FilterDialog extends Dialog {
	private Text interfaceType;
	private Table table;
	private final String[] types;
	private String[] resultTypes;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public FilterDialog(Shell parentShell, String[] types) {
		super(parentShell);
		this.types = types;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		Label label = new Label(container, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label.setText("Filtering:");

		interfaceType = new Text(container, SWT.BORDER);
		interfaceType.setText("PowerConsumer");
		interfaceType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		interfaceType.setEditable(false);

		table = new Table(container, SWT.BORDER | SWT.CHECK
				| SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(false);

		for (String type : types) {
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(type);
		}
		return container;
	}

	@Override
	protected void okPressed() {
		ArrayList<String> result = new ArrayList<String>();
		for (TableItem item : table.getItems()) {
			if (item.getChecked()) {
				result.add(item.getText());
			}
		}
		resultTypes = result.toArray(new String[result.size()]);
		super.okPressed();
	}

	public String[] getResult() {
		return resultTypes;
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
