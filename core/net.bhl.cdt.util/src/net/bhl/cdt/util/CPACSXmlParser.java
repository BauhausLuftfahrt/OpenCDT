package net.bhl.cdt.util;

import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;

public class CPACSXmlParser implements IXMLParser {
	public CPACSXmlParser() {
		// TODO Auto-generated constructor stub
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

}
