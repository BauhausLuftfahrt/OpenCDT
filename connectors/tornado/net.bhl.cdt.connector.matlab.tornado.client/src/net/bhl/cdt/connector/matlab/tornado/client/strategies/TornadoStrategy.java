/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.matlab.tornado.client.strategies;

import java.net.MalformedURLException;
import java.net.URL;

import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.connector.matlab.tornado.TornadoPackage;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.tornado.client.TornadoClient;

import org.eclipse.emf.ecore.EClass;

/**
 * This is the strategy of the Tornado connector.
 * 
 * @author martin.glas
 */
public class TornadoStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {
		if (processElement instanceof Tornado) {
			Tornado tornado = (Tornado) processElement;

			TornadoClient tornadoService;
			try {
				tornadoService = new TornadoClient(new URL(tornado.getServiceURL()));
				tornadoService.execute(tornado);

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		if (processElement instanceof Tornado) {
			Tornado tornado = (Tornado) processElement;
			if (tornado.getServiceURL() != null) {
				try {
					TornadoClient tornadoService = new TornadoClient(new URL(tornado.getServiceURL()));

					return tornadoService.isUp();
				} catch (MalformedURLException e) {
					System.out.println("Tornado Server URL is malformed");
					e.printStackTrace();
				}

			}

		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return TornadoPackage.Literals.TORNADO;
	}

}
