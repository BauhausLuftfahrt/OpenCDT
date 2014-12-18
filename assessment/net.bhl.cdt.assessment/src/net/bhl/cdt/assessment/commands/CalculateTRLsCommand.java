/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.commands;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.assessment.TechnologyElement;
import net.bhl.cdt.assessment.util.AssessmentHelper;
import net.bhl.cdt.commands.CDTCommand;

/**
 * This command initiates a re-calculation of all critical readiness levels in the transitive closure of the technology
 * of interest.
 * 
 * @author martin.glas
 */
public class CalculateTRLsCommand extends CDTCommand {

	private TechnologyElement technologyElement;

	/**
	 * This is the constructor of the command.
	 * 
	 * @param technologyElement the root technology element of interest.
	 */
	public CalculateTRLsCommand(TechnologyElement technologyElement) {
		this.technologyElement = technologyElement;

	}

	@Override
	protected void doRun() {
		if (technologyElement instanceof Technology) {
			Technology technology = (Technology) technologyElement;
			technology.updateRequiredTechnologies();

			List<Technology> criticalTechnologies = new ArrayList<Technology>();
			criticalTechnologies.addAll(AssessmentHelper.getTechnologies(technology
				.getCriticalReadinessLevelAssessments()));

		}

	}

}
