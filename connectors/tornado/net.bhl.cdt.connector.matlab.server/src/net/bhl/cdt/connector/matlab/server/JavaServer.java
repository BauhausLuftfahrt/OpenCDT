package net.bhl.cdt.connector.matlab.server;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class JavaServer {

	public Integer sum(int x, int y) {
		return new Integer(x + y);
	}

	public static void main(String[] args) {
		try {

			System.out.println("Attempting to start XML-RPC Server...");
			WebServer server = new WebServer(8899);

			PropertyHandlerMapping propertyHandlerMapping = new PropertyHandlerMapping();
			propertyHandlerMapping.setVoidMethodEnabled(false);
			propertyHandlerMapping.addHandler("matlab", Matlab.class);
			server.getXmlRpcServer().setHandlerMapping(propertyHandlerMapping);
			XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) server.getXmlRpcServer().getConfig();
			serverConfig.setEnabledForExtensions(true);
			serverConfig.setContentLengthOptional(false);
			server.start();
			System.out.println("Started successfully.");
			System.out.println("Accepting requests. (Halt program to stop.)");
		} catch (Exception exception) {
			System.err.println("JavaServer: " + exception);
		}
	}
}