/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.tornado.client;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import net.bhl.cdt.connector.matlab.tornado.Tornado;
import net.bhl.cdt.model.system.util.SystemHelper;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

/**
 * This class is the client side of the tornado connector.
 * 
 * @author martin.glas
 */

public class TornadoClient {
	private XmlRpcClient tornadoServer;

	/**
	 * This is the constructor of the Client.
	 * 
	 * @param serviceURL the URL of the tornado server.
	 */
	public TornadoClient(URL serviceURL) {

		// create configuration
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(serviceURL);
		config.setEnabledForExtensions(true);
		config.setConnectionTimeout(60 * 1000);
		config.setReplyTimeout(60 * 1000);
		tornadoServer = new XmlRpcClient();
		tornadoServer.setConfig(config);

	}

	/**
	 * This method tests whether the Tornado server is up.
	 * 
	 * @return true if the Tornado server is up
	 */
	public boolean isUp() {
		try {
			return (boolean) tornadoServer.execute("matlab.isup", new Vector<Object>());

		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	/**
	 * This method sends the tornado model to the server and processes the result.
	 * 
	 * @param tornado the Tornado connector
	 */
	@SuppressWarnings("unchecked")
	public void execute(Tornado tornado) {
		Vector<Double> tornadoParams = new Vector<Double>();
		// Ma, alt, density, sweep,alpha
		// set state
		// set Mach number
		if ((tornado.getTornadoState().getAirSpeed().getUnit().isCompatible(Unit.ONE))
			&& (tornado.getTornadoState().getAltitude().getUnit().isCompatible(SI.METER))
			&& (tornado.getTornadoState().getRho().getUnit().isCompatible((SI.KILO(SI.GRAM)).divide(SI.METER.pow(3))))
			&& (tornado.getTornadoGeometry().getSweepAngle().getUnit().isCompatible(NonSI.DEGREE_ANGLE))
			&& (tornado.getTornadoState().getAlpha().getUnit().isCompatible(NonSI.DEGREE_ANGLE))) {

			tornadoParams.addElement(tornado.getTornadoState().getAirSpeed().getValue().doubleValue());

			tornadoParams.addElement(tornado.getTornadoState().getAltitude().getUnit().getConverterTo(SI.METER)
				.convert(tornado.getTornadoState().getAltitude().getValue().doubleValue()));

			tornadoParams.addElement(tornado.getTornadoState().getRho().getUnit()
				.getConverterTo((SI.KILO(SI.GRAM)).divide(SI.METER.pow(3)))
				.convert(tornado.getTornadoState().getRho().getValue().doubleValue()));

			tornadoParams.addElement(tornado.getTornadoGeometry().getSweepAngle().getUnit()
				.getConverterTo(NonSI.DEGREE_ANGLE)
				.convert(tornado.getTornadoGeometry().getSweepAngle().getValue().doubleValue()));

			tornadoParams.addElement(tornado.getTornadoState().getAlpha().getUnit().getConverterTo(NonSI.DEGREE_ANGLE)
				.convert(tornado.getTornadoState().getAlpha().getValue().doubleValue()));

			try {

				Object[] tornadoResult = (Object[]) tornadoServer.execute("matlab.tornado", tornadoParams);

				HashMap<String, double[]> resultMap = (HashMap<String, double[]>) tornadoResult[0];

				for (Map.Entry<String, double[]> resultEntry : resultMap.entrySet()) {
					if (resultEntry.getValue().length == 1) {
						SystemHelper.generateUniqueMeasuredValue(resultEntry.getKey(),
							new Double(resultEntry.getValue()[0]).toString(), Unit.ONE, tornado);

					}
				}

			} catch (XmlRpcException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
