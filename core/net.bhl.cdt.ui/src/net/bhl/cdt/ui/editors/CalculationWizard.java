package net.bhl.cdt.ui.editors;

import org.eclipse.jface.wizard.Wizard;

public class CalculationWizard extends Wizard {

	public CalculationWizard() {
		setWindowTitle("New Calculation Wizard");
	}

	@Override
	public void addPages() {
		addPage(new CalculationWizardPage());
	}

	@Override
	public boolean performFinish() {
		return false;
	}

}
