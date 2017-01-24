package net.bhl.cdt.util;

import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class CPACSXmlParser implements IXMLParser {
	public CPACSXmlParser(){
		
	}
	
	public CPACSXmlParser(String filePath) {
		// TODO Auto-generated constructor stub
		XMLEventReader eventReader = getXmlFile(filePath);
		if(eventReader != null)
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
	public void readXMLFile(XMLEventReader eventReader) throws XMLStreamException{
		// TODO Auto-generated method stub
		while (eventReader.hasNext()) {
			XMLEvent event = eventReader.nextEvent();
			System.out.println("event : " + event);
			
		}
		
	}
	
}
