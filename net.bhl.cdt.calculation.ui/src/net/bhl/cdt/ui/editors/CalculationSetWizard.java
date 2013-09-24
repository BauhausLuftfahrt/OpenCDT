/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.utilities.commands.CDTCommand;
import org.eclipse.jface.wizard.Wizard;

public class CalculationSetWizard extends Wizard {

	protected CalculationSetWizardPage wizPage;
	private CalculationSet calculationSet;

	public CalculationSetWizard(CalculationSet c) {
		calculationSet = c;
		wizPage = new CalculationSetWizardPage(calculationSet);
		setWindowTitle("New Calculation Set Wizard");
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
				calculationSet.setName(wizPage.getCalculationName());
				calculationSet.setComponent(wizPage.getComponent());
			}
		}).execute();
		return true;
	}

}
