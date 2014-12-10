/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.commands;

import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyElement;
import net.bhl.cdt.assessment.util.AssessmentHelper;
import net.bhl.cdt.commands.CDTCommand;

/**
 * This command exports the technologies in the transitive closure of a technology of interest to a CSV file.
 * 
 * @author martin.glas
 */
public class ExportTechnologyGraphToCSVCommand extends CDTCommand {

	private TechnologyElement technologyElement;

	/**
	 * This is the default constructor of the command.
	 * 
	 * @param technologyElement the technology of interest
	 */
	public ExportTechnologyGraphToCSVCommand(TechnologyElement technologyElement) {
		this.technologyElement = technologyElement;

	}

	@Override
	protected void doRun() {
		if (technologyElement instanceof Technology) {
			Technology technology = (Technology) technologyElement;
			AssessmentHelper.exportToCSVFile(technology);

		}
	}

}
