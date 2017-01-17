package net.bhl.cdt.util;

import javax.xml.stream.XMLEventReader;

public interface IXMLParser {
	public XMLEventReader getXmlFile(String filePath);
}
