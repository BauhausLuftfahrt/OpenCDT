/*
 * 
 * @author rushdi
 *
 */

package net.bhl.cdt.util;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public interface IXMLParser {
	public XMLEventReader getXmlFile(String filePath);

	public void readXMLFile(XMLEventReader xmlEventReader) throws XMLStreamException;

	public void readXMLByNode(String filePath)
			throws SAXException, IOException, ParseException, ParserConfigurationException, TransformerException;
}
