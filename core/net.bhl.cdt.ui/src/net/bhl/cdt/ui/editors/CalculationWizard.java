package net.bhl.cdt.ui.editors;

import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

public class CalculationWizard extends Wizard {

	protected CalculationWizardPage wizPage;
	private Calculation calculation;

	public CalculationWizard(Calculation c) {
		calculation = c;
		wizPage = new CalculationWizardPage(calculation);
		setWindowTitle("New Calculation Wizard");
	}

	@Override
	public void addPages() {
		addPage(wizPage);
	}

	@Override
	public boolean performFinish() {
		(new CDTCommand() {
			@Override
			protected void doRun() {
				calculation.setName(wizPage.getCalculationName());
				calculation.setFunctionID(wizPage.getFunctionID());
			}
		}).run();
		return true;
	}

}
