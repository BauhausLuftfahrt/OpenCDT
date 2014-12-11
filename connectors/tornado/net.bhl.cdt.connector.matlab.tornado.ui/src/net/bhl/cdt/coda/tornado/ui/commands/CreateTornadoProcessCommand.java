/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.coda.tornado.ui.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoFactory;
import net.bhl.cdt.model.process.DesignProcess;

/**
 * This command creates the Tornado model in an Tornado connector.
 * 
 * @author martin.glas
 */
public class CreateTornadoProcessCommand extends CDTCommand {

	private static String DEFAULT_TORNADO_SERVICE_URL = "http://wmuc0115.bauhaus-luftfahrt.net:8899";
	private DesignProcess designProcess;

	/**
	 * This is the constructor of the Command.
	 * 
	 * @param designProcess the design process which is supposed to contain the Tornado connector
	 * @param shell the current Shell
	 */
	public CreateTornadoProcessCommand(DesignProcess designProcess) {
		setDesignProcess(designProcess);
	}

	@Override
	protected void doRun() {

		Tornado newTorando = TornadoFactory.eINSTANCE.createTornado();
		newTorando.setName("New Tornado Service");
		newTorando.setServiceURL(DEFAULT_TORNADO_SERVICE_URL);

		newTorando.setTornadoGeometry(TornadoFactory.eINSTANCE.createTornadoGeometry());
		newTorando.setTornadoState(TornadoFactory.eINSTANCE.createTornadoState());

		designProcess.getDesignProcessElements().add(newTorando);

	}

	private void setDesignProcess(DesignProcess designProcess) {
		this.designProcess = designProcess;
	}

}
