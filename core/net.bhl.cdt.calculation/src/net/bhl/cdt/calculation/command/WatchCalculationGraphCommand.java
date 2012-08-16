/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.command;

import net.bhl.cdt.calculation.process.ui.GraphViewer;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.ui.PlatformUI;

/**
 * This command contains the logic for watching a calculation graph.
 * 
 * @author Michael Kagel
 */
public class WatchCalculationGraphCommand extends CDTCommand {

	private CalculationGraph calculationGraph;

	/**
	 * Constructor.
	 * 
	 * @param calculationGraph Calculation graph object which the viewer will show
	 */
	public WatchCalculationGraphCommand(CalculationGraph calculationGraph) {
		this.calculationGraph = calculationGraph;
	}

	@Override
	protected void doRun() {
		GraphViewer graphViewer = new GraphViewer(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		graphViewer.open(calculationGraph);
	}

}
