/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.ui.editors.calculationset.ComboViewerLabelProvider;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;

public class CalculationSetWizardPage extends WizardPage {
	private Text text;
	private ComboViewer comboViewer;
	private CalculationSet calculationSet;

	/**
	 * Create the wizard.
	 */
	public CalculationSetWizardPage(CalculationSet c) {
		super("wizardPage");
		setTitle("Calculation Set Wizard");
		setDescription("Create a new Calculation Set");
		calculationSet = c;
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));

		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.setText(calculationSet.getName());

		Label lblFunctionid = new Label(container, SWT.NONE);
		lblFunctionid.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFunctionid.setText("Component");

		createComponentCombo(container);
	}

	public String getCalculationName() {
		return text.getText();
	}

	public Component getComponent() {
		return (Component) ((IStructuredSelection) comboViewer.getSelection()).getFirstElement();
	}

	// create data binding for comboViewer for retrieving available components
	private void createComponentCombo(Composite container) {
		comboViewer = new ComboViewer(container, SWT.READ_ONLY);
		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		comboViewer.setContentProvider(contentProvider);
		comboViewer.setLabelProvider(new ComboViewerLabelProvider());

		List<Component> componentList = UtilitiesHelper.getChildrenByClass(
			UtilitiesHelper.getParent(Configuration.class, calculationSet), Component.class);
		IObservableList input = Properties.selfList(Parameter.class).observe(componentList);
		comboViewer.setInput(input);

		if (calculationSet.getComponent() != null) {
			combo.setText(calculationSet.getComponent().getName());
		}
	}
}
