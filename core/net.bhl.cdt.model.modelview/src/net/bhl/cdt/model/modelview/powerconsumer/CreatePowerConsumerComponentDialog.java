/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.powerconsumer;

import javax.units.Unit;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.modelview.PowerConsumerHelper;

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
import org.eclipse.swt.widgets.Text;

public class CreatePowerConsumerComponentDialog extends Dialog {
	private Text nameText;
	private Text consumptionText;
	private Text typeText;
	private Component powerConsumer;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public CreatePowerConsumerComponentDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		parent.getShell().setText("Create PowerConsumer Component");
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name:");

		nameText = new Text(container, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblConsumption = new Label(container, SWT.NONE);
		lblConsumption.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblConsumption.setText("Consumption:");

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		GridData gd_composite = new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1);
		gd_composite.widthHint = 231;
		composite.setLayoutData(gd_composite);

		consumptionText = new Text(composite, SWT.BORDER);
		consumptionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblKw = new Label(composite, SWT.NONE);
		GridData gd_lblKw = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1,
				1);
		gd_lblKw.widthHint = 35;
		lblKw.setLayoutData(gd_lblKw);
		lblKw.setText("kW");

		Label lblType = new Label(container, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type:");

		typeText = new Text(container, SWT.BORDER);
		typeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		return container;
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

	@Override
	protected void okPressed() {
		String name = nameText.getText() == null ? "" : nameText.getText();
		double value = 0;
		try {
			value = consumptionText.getText() == null ? 0 : Double
					.parseDouble(consumptionText.getText());
		} catch (NumberFormatException e) {
		}
		String type = typeText.getText() == null ? "" : typeText.getText();
		powerConsumer = PowerConsumerHelper.createPowerConsumerComponent(null,
				type, name, Unit.valueOf("kW"), value);
		super.okPressed();
	}

	public Component getPowerConsumerComponent() {
		return powerConsumer;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(389, 181);
	}

}
