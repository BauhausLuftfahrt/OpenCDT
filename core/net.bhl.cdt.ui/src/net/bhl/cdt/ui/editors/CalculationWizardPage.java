package net.bhl.cdt.ui.editors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

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

public class CalculationWizardPage extends WizardPage {
	private Text text;
	private ComboViewer comboViewer;
	private Calculation calculation;

	/**
	 * Create the wizard.
	 */
	public CalculationWizardPage(Calculation c) {
		super("wizardPage");
		setTitle("Calculation Wizard");
		setDescription("Create a new Calculation");
		calculation = c;
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

		Label lblFunctionid = new Label(container, SWT.NONE);
		lblFunctionid.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFunctionid.setText("FunctionID");

		comboViewer = new ComboViewer(container, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		combo.setItems(getFunctionIDs());
	}

	public String getCalculationName() {
		return text.getText();
	}

	public String getFunctionID() {
		return comboViewer.getCombo().getText();
	}

	private String[] getFunctionIDs() {
		List<String> tmp = new ArrayList<String>();
		List<Function> functions = CalculationRepositoryManager.getInstance().getFunctions(
			UtilitiesHelper.getProjectId(calculation));
		// Collections.sort
		for (Function f : functions) {
			tmp.add(f.getFunctionID());
		}
		return tmp.toArray(new String[1]);
	}
}
