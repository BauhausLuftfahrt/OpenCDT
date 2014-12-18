/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.commands;

import java.util.Date;

import net.bhl.cdt.model.process.ProcessElement;

import org.eclipse.swt.widgets.Shell;

/**
 * This Command executes the strategy of a given ProcessElement.
 * 
 * @author martin.glas
 */
public class ExecuteProcessElementCommand extends CDTCommand {

	private ProcessElement processElement;

	/**
	 * This is the constructor of the command.
	 * 
	 * @param processElement the ProcessElement to be executed
	 * @param shell the current Shell
	 */
	public ExecuteProcessElementCommand(ProcessElement processElement, Shell shell) {
		setProcessElement(processElement);
	}

	@Override
	protected void doRun() {

		if (getProcessElement().isStartable() && !getProcessElement().isBusy()) {
			getProcessElement().start();
			getProcessElement().setTimeStamp((new Date()).toString());
		} else {
			System.out.println("Process" + getProcessElement().getName() + " was not ready");
		}
	}

	private ProcessElement getProcessElement() {
		return processElement;
	}

	private void setProcessElement(ProcessElement processElement) {
		this.processElement = processElement;
	}

}
