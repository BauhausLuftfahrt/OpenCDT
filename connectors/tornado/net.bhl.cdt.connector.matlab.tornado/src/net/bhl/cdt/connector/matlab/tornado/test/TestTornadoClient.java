/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.matlab.tornado.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * This unit test evaluates the tornado client server functionality.
 * 
 * @author martin.glas
 */
public class TestTornadoClient {

	/**
	 * This method tests the Matlab server.
	 */
	@Test
	public void testMatlabServer() {

		// create configuration
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://10.25.50.167:8899"));
			config.setEnabledForExtensions(true);
			config.setConnectionTimeout(60 * 1000);
			config.setReplyTimeout(60 * 1000);

			XmlRpcClient server = new XmlRpcClient();
			server.setConfig(config);
			Vector<Integer> params = new Vector<Integer>();
			params.addElement(new Integer(17));
			params.addElement(new Integer(13));

			Object result = server.execute("sample.sum", params);

			int sum = ((Integer) result).intValue();
			Assert.assertEquals(30, sum);

			Vector<Double> areaParams = new Vector<Double>();
			areaParams.addElement(new Double(4.0));

			Object resultArea = server.execute("area.circleArea", areaParams);
			double area = ((Double) resultArea).doubleValue();
			Assert.assertEquals(50.26548245743669, area, Double.MIN_VALUE);

			Vector<Double> sqrtParams = new Vector<Double>();
			sqrtParams.addElement(new Double(40));

			Object resultSqrt = server.execute("matlab.sqrt", sqrtParams);
			double sqrt = ((Double) resultSqrt).doubleValue();
			Assert.assertEquals(6.324555320336759, sqrt, Double.MIN_VALUE);

			Assert.assertTrue((boolean) server.execute("matlab.isup", new Vector<Double>()));

			Vector<Double> tornadoParams = new Vector<Double>();

			tornadoParams.addElement(new Double(0.3));
			tornadoParams.addElement(new Double(2000));
			tornadoParams.addElement(new Double(0.3));
			tornadoParams.addElement(new Double(2 * Math.PI * 180));
			tornadoParams.addElement(2.0);

			Object resultObject = server.execute("matlab.tornado", tornadoParams);
			Object[] tornadoResult = (Object[]) resultObject;

			Assert.assertEquals(0.003181636705479344, (double) tornadoResult[0], Double.MIN_VALUE);
			Assert.assertEquals(0.3009833208459542, (double) tornadoResult[1], Double.MIN_VALUE);
			Assert.assertEquals(-0.5633691224658364, (double) tornadoResult[2], Double.MIN_VALUE);
		} catch (MalformedURLException | XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
