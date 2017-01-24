package net.bhl.cdt.connector.cpacs.ui.handler;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.util.CPACSXmlParser;
import ui.CenteredFileDialog;

public class ImportCPACSFileHandler {
	@Execute
	public void execute(Shell shell) {

		CenteredFileDialog saveDialog = new CenteredFileDialog(shell, SWT.SAVE);
		saveDialog.dialog.setFilterExtensions(new String[] { "*.xml" });
		saveDialog.dialog.setFilterNames(new String[] { "Text (*.xml)" });
		String fileLocation = (String) saveDialog.open();

		if (fileLocation != null) {
			CPACSXmlParser xmlParser = new CPACSXmlParser();
			XMLEventReader xmlEventReader = xmlParser.getXmlFile(fileLocation);
			try {
				xmlParser.readXMLFile(xmlEventReader);
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// String filePath = saveDialog.dialog.getFilterPath();
			// System.out.println("Name : " + fileLocation );
		}

		// FloatPointValue fpValue =
		// DatatypesFactory.eINSTANCE.createFloatPointValue();
		// fpValue.setValue(40.0);
	}
}