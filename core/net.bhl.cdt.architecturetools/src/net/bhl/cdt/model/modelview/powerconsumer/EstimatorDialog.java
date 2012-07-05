/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.powerconsumer;

import java.util.ArrayList;

import javax.units.Unit;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * Refactor and make use of new interface structure. This class should be more
 * generic.
 * 
 */
public class EstimatorDialog extends Dialog {
	private Text txtRefValue;
	private Text txtValue;
	private final Component component;
	private final ArrayList<Configuration> references;
	private Value value;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param references
	 * @param object
	 */
	public EstimatorDialog(Shell parentShell, Component component,
			ArrayList<Configuration> references) {
		super(parentShell);
		this.component = component;
		this.references = references;
		PowerConsumer consumer = component
				.getInterfaceByClass(PowerConsumer.class);
		this.value = consumer.getPowerConsumption();
		if (this.value == null) {
			this.value = ModelFactory.eINSTANCE.createValue();
			this.value.setUnit(Unit.valueOf("kW"));
		}
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, true));

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));

		Label ComponentName = new Label(composite, SWT.NONE);
		ComponentName.setText(component.getName());

		txtValue = new Text(composite, SWT.BORDER);
		txtValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		txtValue.setEnabled(true);

		txtValue.setText(value.getValue() + "");

		Group grpStrategy = new Group(composite, SWT.NONE);
		grpStrategy.setText("Strategy");
		grpStrategy.setLayout(new GridLayout(1, false));
		grpStrategy.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true,
				1, 1));

		Button btnReferenceAverage = new Button(grpStrategy, SWT.RADIO);
		GridData gd_btnReferenceAverage = new GridData(SWT.LEFT, SWT.CENTER,
				false, false, 1, 1);
		gd_btnReferenceAverage.widthHint = 156;
		btnReferenceAverage.setLayoutData(gd_btnReferenceAverage);
		btnReferenceAverage.setText("Reference Average");
		btnReferenceAverage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtValue.setEnabled(false);
				double average = EstimatorUtil
						.getAverage(component, references);
				txtValue.setText(average + "");
			}
		});

		Button btnManual = new Button(grpStrategy, SWT.RADIO);
		GridData gd_btnManual = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_btnManual.widthHint = 98;
		btnManual.setLayoutData(gd_btnManual);
		btnManual.setText("Manual");
		btnManual.setSelection(true);
		btnManual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtValue.setEnabled(true);
			}
		});

		Group grpReferenceValue = new Group(container, SWT.NONE);
		grpReferenceValue.setText("Reference Values");
		grpReferenceValue.setLayout(new GridLayout(1, false));
		grpReferenceValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		ScrolledComposite scrolledComposite = new ScrolledComposite(
				grpReferenceValue, SWT.BORDER | SWT.V_SCROLL);
		scrolledComposite.setAlwaysShowScrollBars(true);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		Composite scrollContainer = new Composite(scrolledComposite, SWT.NONE);
		scrollContainer.setLayout(new GridLayout(2, false));

		createReferences(scrollContainer);

		scrolledComposite.setContent(scrollContainer);
		scrolledComposite.setMinSize(scrollContainer.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));

		return container;
	}

	public Value getValue() {
		return value;
	}

	@Override
	protected void okPressed() {
		String text = txtValue.getText();
		try {
			final double result = Double.parseDouble(text);
			new CDTCommand() {
				@Override
				protected void doRun() {
					value.setValue(result);

				}
			}.run();
			super.okPressed();
		} catch (NumberFormatException e) {
			MessageDialog.openError(getShell(), "Invalid Value",
					"The inserted value is invalid. It has to be a Number.");
		}
	}

	private void createReferences(Composite composite_1) {
		for (Configuration config : references) {
			Value value = EstimatorUtil.getPowerValue(config,
					component.getName());

			Label refName = new Label(composite_1, SWT.NONE);
			refName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true,
					false, 1, 1));
			refName.setText(config.getName());

			txtRefValue = new Text(composite_1, SWT.BORDER);
			txtRefValue.setBackground(SWTResourceManager
					.getColor(SWT.COLOR_LIST_BACKGROUND));
			txtRefValue.setEditable(false);
			txtRefValue
					.setText(((value == null) ? "na" : value.getValue() + ""));
			GridData gd_txtBlaValue = new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1);
			gd_txtBlaValue.widthHint = 64;
			txtRefValue.setLayoutData(gd_txtBlaValue);
		}
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
