/*
 * 
 * @author rushdi
 *
 */

package net.bhl.cdt.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.StringValue;
import net.bhl.cdt.model.system.SystemFactory;

public class CPACSXmlParser implements IXMLParser {

	private Component vehiclesComponent, missionsComponent, airportsComponent, fleetsComponent, toolspecificComponent;

	/**
	 * @return The component representing the vehicles node of the CPACS-File.
	 */
	public Component getVehiclesComponent() {
		return vehiclesComponent;
	}

	public CPACSXmlParser() {

	}

	public CPACSXmlParser(String filePath) {
		// TODO Auto-generated constructor stub

		XMLEventReader eventReader = getXmlFile(filePath);
		if (eventReader != null)
			try {
				readXMLFile(eventReader);
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public XMLEventReader getXmlFile(String filePath) {
		// TODO Auto-generated method stub
		try {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(filePath));
			return eventReader;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Xml file Exception : " + e.getStackTrace());
		}

		return null;
	}

	@Override
	public void readXMLFile(XMLEventReader eventReader) throws XMLStreamException {
		// TODO Auto-generated method stub
		;

	}

	@Override
	public void readXMLByNode(String filePath)
			throws SAXException, IOException, ParseException, ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document document = (Document) docBuilder.parse(new File(filePath));

		NodeList nodeList = document.getDocumentElement().getChildNodes();
		// System.out.println("nole : " + nodeList.getLength());

		for (int k = 0; k < nodeList.getLength(); k++) {
			// Node node = (Node) nodeList.item(k);

			if (nodeList.item(k).getNodeName().equalsIgnoreCase("vehicles")) {
				vehiclesComponent = SystemFactory.eINSTANCE.createComponent();
				vehiclesComponent.setName("Vehicles");

				printTags((Node) nodeList.item(k), vehiclesComponent);
			}

			if (nodeList.item(k).getNodeName().equalsIgnoreCase("missions")) {
				missionsComponent = SystemFactory.eINSTANCE.createComponent();
				missionsComponent.setName("missions");

				printTags((Node) nodeList.item(k), missionsComponent);

			}

			if (nodeList.item(k).getNodeName().equalsIgnoreCase("airports")) {
				airportsComponent = SystemFactory.eINSTANCE.createComponent();
				airportsComponent.setName("airports");

				printTags((Node) nodeList.item(k), airportsComponent);

			}

			if (nodeList.item(k).getNodeName().equalsIgnoreCase("fleets")) {
				fleetsComponent = SystemFactory.eINSTANCE.createComponent();
				fleetsComponent.setName("fleets");

				printTags((Node) nodeList.item(k), fleetsComponent);

			}

			if (nodeList.item(k).getNodeName().equalsIgnoreCase("toolspecific")) {
				toolspecificComponent = SystemFactory.eINSTANCE.createComponent();
				toolspecificComponent.setName("toolspecific");

				printTags((Node) nodeList.item(k), toolspecificComponent);

			}
		}
	}

	public static void printTags(Node nodes, Component rootNode) {
		if (nodes.hasChildNodes()) {
			NodeList childNodeList = nodes.getChildNodes();
			// System.out.println("nole : " + childNodeList.getLength());
			
			for (int j = 0; j < childNodeList.getLength(); j++) {
				// if the node has just one child, and this is #text 
				// Then create a parameter:
				
				if (!childNodeList.item(j).getNodeName().equalsIgnoreCase("#text")) {
					
					if (childNodeList.item(j).getChildNodes().getLength() == 1
							&& childNodeList.item(j).getFirstChild().getNodeName().equalsIgnoreCase("#text")) {
						Parameter p = SystemFactory.eINSTANCE.createParameter();
						p.setName(childNodeList.item(j).getNodeName());

						if (childNodeList.item(j).getTextContent().isEmpty()
								|| childNodeList.item(j).getTextContent() != null) {
							if (isNumeric(childNodeList.item(j).getTextContent())) {
								DecimalNumber numberValue = SystemFactory.eINSTANCE.createDecimalNumber();
								numberValue.setValue(
										new BigDecimal(Double.parseDouble(childNodeList.item(j).getTextContent())));
								p.getValues().add(numberValue);
							} else {
								StringValue stringValue = SystemFactory.eINSTANCE.createStringValue();
								stringValue.setValue(childNodeList.item(j).getTextContent());
								p.getValues().add(stringValue);
							}
						}

						rootNode.getParameters().add(p);
						// if you don't create a parameter, you create a
						// subcomponent:
					} else {
						Component c = SystemFactory.eINSTANCE.createComponent();
						c.setName(childNodeList.item(j).getNodeName());

						rootNode.getSubcomponents().add(c);
						printTags(childNodeList.item(j), c);
					}

					// System.out.println(childNodeList.item(j).getNodeName() +
					// " : " + childNodeList.item(j).getTextContent());
				}
			}
		}
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
