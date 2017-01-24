package net.bhl.cdt.util;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

public interface IXMLParser {
	public XMLEventReader getXmlFile(String filePath);
	public void readXMLFile(XMLEventReader xmlEventReader) throws XMLStreamException;	
	
}
