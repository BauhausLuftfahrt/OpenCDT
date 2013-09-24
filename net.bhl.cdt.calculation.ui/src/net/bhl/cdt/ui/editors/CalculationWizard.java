package net.bhl.cdt.ui.editors;

import java.util.Iterator;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.Wizard;

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
				// set name and function id
				calculation.setName(wizPage.getCalculationName());
				calculation.setFunctionID(wizPage.getFunctionID());
								
				// generate mapping and set null valued i/o mappables depending on the selected functionID
				Function selectedFunction = CalculationRepositoryManager.getInstance().getFunction(
					UtilitiesHelper.getProjectId(calculation), wizPage.getFunctionID());
				ParameterMapping mapping = CalculationFactory.eINSTANCE.createParameterMapping();

				EList<ParameterDescriptor> inputDescriptors = selectedFunction.getInputDescriptors();
				Iterator<ParameterDescriptor> inputIterator = inputDescriptors.iterator();
				while (inputIterator.hasNext()) {
					final ParameterDescriptor descriptor = inputIterator.next();
					mapping.getInputMappables().put(descriptor, null);
				}
				
				EList<ParameterDescriptor> outputDescriptors = selectedFunction.getOutputDescriptors();
				Iterator<ParameterDescriptor> outputIterator = outputDescriptors.iterator();
				while (outputIterator.hasNext()) {
					final ParameterDescriptor descriptor = outputIterator.next();
					mapping.getOutputMappables().put(descriptor, null);
				}
				calculation.setParameterMapping(mapping);
			}
		}).execute();
		return true;
	}

}
