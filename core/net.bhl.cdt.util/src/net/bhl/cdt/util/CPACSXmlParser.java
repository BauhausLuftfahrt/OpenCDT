/*
 * 
 * @author rushdi
 *
 */

package net.bhl.cdt.util;

import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.system.SystemFactory;

import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;

public class CPACSXmlParser implements IXMLParser {

	public final String startNode = "<vehicles>";

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
	//SystemFactory.eINSTANCE.createComponent()
	@Override
	public void readXMLFile(XMLEventReader eventReader) throws XMLStreamException {
		// TODO Auto-generated method stub
		while (eventReader.hasNext()) {
			XMLEvent event = eventReader.nextEvent();
	
			
			
			if (event.isStartElement()){
                StartElement startElement = event.asStartElement();
                
                if(startElement.getName().getLocalPart().equals(startNode)){
                	System.out.println("startElement : " + event);
                	
                	
                }
                
                
			}
			
			if(event.isEndElement()){
                EndElement endElement = event.asEndElement();
                if(endElement.getName().getLocalPart().equals(startNode)){
                	System.out.println("EndElement : " + event);
                }
            }
			

//			switch (event.getEventType()) {
//			case XMLStreamConstants.START_ELEMENT:
//				StartElement startElement = event.asStartElement();
//				String startElementName = startElement.getName().getLocalPart();
//				if (startElementName.equalsIgnoreCase(startNode)) {
//					// @SuppressWarnings("unchecked")
//					// Iterator<Attribute> attribute =
//					// startElement.getAttributes();
//
//					System.out.println("startElement : " + startElementName);
//				}
//
//				break;
//			case XMLStreamConstants.CHARACTERS:
//				Characters characters = event.asCharacters();
//				System.out.println("characters : " + characters);
//				break;
//			case XMLStreamConstants.END_ELEMENT:
//				EndElement endElement = event.asEndElement();
//				if (endElement.getName().getLocalPart().equalsIgnoreCase(startNode)) {
//					System.out.println("End Element :" + startNode);
//					System.out.println();
//				}
//				break;
//			}
		}

	}

}
