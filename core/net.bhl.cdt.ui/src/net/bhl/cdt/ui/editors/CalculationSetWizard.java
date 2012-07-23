/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import java.util.Iterator;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

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
		}).run();
		return true;
	}

}
