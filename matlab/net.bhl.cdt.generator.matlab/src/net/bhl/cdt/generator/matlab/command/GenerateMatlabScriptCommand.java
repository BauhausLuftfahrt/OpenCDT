package net.bhl.cdt.generator.matlab.command;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.admf.AircraftModelElement;
import org.admf.impl.AircraftModelImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.utilities.commands.CDTCommand;

/**
 * GenModel to Matlab Converter.
 * 
 * @author David Otter
 * 
 */
public class GenerateMatlabScriptCommand extends CDTCommand {

	private List<String> names;
	private Shell shell;
	private Object firstElement;
	private ConverterBufferedWriter bufferedWriter;

	/**
	 * Constructor.
	 * 
	 * @param shell
	 *            Shell
	 * @param firstElement
	 *            Selected Element
	 */
	public GenerateMatlabScriptCommand(Shell shell, Object firstElement) {
		this.shell = shell;
		this.firstElement = firstElement;
	}

	/**
	 * Get directory and Class of firstElement. Select and create .m file.
	 * 
	 */
	public void doRun() {
		FileDialog fileDialog = new FileDialog(shell);
		String[] extensions = { "*.m" };
		fileDialog.setFilterExtensions(extensions);
		fileDialog.setText("Select File");
		String directory = fileDialog.open();
		if (directory == null) {
			return;
		}
		if (!directory.matches(".*\\.m")) {
			directory += ".m";
		}
		File file = new File(directory);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		names = new LinkedList<String>();
		if (firstElement instanceof AircraftModelImpl) {
			AircraftModelImpl aircraftModelImpl = (AircraftModelImpl) firstElement;
			write(directory, aircraftModelImpl);
		}
	}

	/**
	 * Iterate over all AircraftModelElements.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param aircraftModelImpl
	 */
	private void write(String dir, AircraftModelImpl aircraftModelImpl) {
		try {
			bufferedWriter = new ConverterBufferedWriter(new FileWriter(
					new File(dir)));
			bufferedWriter.writeLine(WriteHelper.getComment());
			// for (AircraftModelElement aircraftModelElement :
			// aircraftModelImpl
			// .getAircraftModelElements()) {
			writeElement(aircraftModelImpl, 0);
			// }
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * call writeElement with "isAnonymous = false" and "root = null".
	 */
	private void writeElement(EObject aircraftModelObject, int tab) {
		this.writeElement(aircraftModelObject, tab, false, null);
	}

	/**
	 * 
	 * @param aircraftModelObject
	 *            this EObject has to be an instance of aircraftModelElement!
	 * @param bufferedWriter
	 *            ConverterBufferedWriter
	 * @param tab
	 *            the depth of the recursion * 2
	 */
	private void writeElement(EObject aircraftModelObject, int tab,
			Boolean isAnonymous, String root) {
		AircraftModelElement element = (AircraftModelElement) aircraftModelObject;
		EClass eClass = element.eClass();
		String name;
		if (isAnonymous) {
			name = root;
		} else {
			name = this.checkName(element.getName());
			// Check if name already exists
			if (name == null || name.isEmpty() || names.contains(name)) {
				System.err.println("No unique name choosen!");
				return;
			}
			names.add(name);
		}

		EList<EAttribute> attributes = eClass.getEAllAttributes();
		EList<EReference> references = eClass.getEAllReferences();
		// Create Instance
		if (!isAnonymous) {
			bufferedWriter.writeLine(tab, name + " = " + eClass.getName()
					+ "();");
		}

		// Iterate through attributes and set them
		for (EAttribute attribute : attributes) {
			Object value = element.eGet(attribute);
			if (value != null && !value.equals('\0')) {
				if (value.getClass().equals(String.class)) {
					value = "'" + value + "'";
				}
				if (value.getClass().equals(Integer.class)) {
					value = "int32(" + value + ")";
				}
				bufferedWriter.writeLine(tab + 1,
						name + "." + attribute.getName() + " = " + value + ";");
			}
		}
		// Iterate through references and and call this function recursive with
		// the Object of the reference as argument.
		for (EReference reference : references) {
			writeReference(reference, element, tab, name);
		}
	}

	@SuppressWarnings("unchecked")
	private void writeReference(EReference reference,
			AircraftModelElement element, int tab, String name) {
		String referenceName;
		Object value = element.eGet(reference);
		if (value == null || value.toString().equals("[]")) {
			return;
		}
		// Check if the reference is Containment / List /
		// AircraftModelElement
		Object refObject = element.eGet(reference);
		AircraftModelElement refAircraftElement;
		List<AircraftModelElement> refAircraftElementList = new LinkedList<AircraftModelElement>();
		String allReferences = "";
		if (refObject instanceof EObjectContainmentEList) {
			EObjectContainmentEList<EObject> containment = (EObjectContainmentEList<EObject>) refObject;
			Iterator<EObject> iterator = containment.iterator();
			while (iterator.hasNext()) {
				refAircraftElement = (AircraftModelElement) iterator.next();
				refAircraftElementList.add(refAircraftElement);
				EClass refEClass = refAircraftElement.eClass();
				if (iterator.hasNext()) {
					allReferences += refEClass.getName() + "(), ";
				} else {
					allReferences += refEClass.getName() + "()";
				}
			}
			bufferedWriter.writeLine(tab + 1, name + "." + reference.getName()
					+ " = [" + allReferences + "];");
			int count = 1;
			for (AircraftModelElement elem : refAircraftElementList) {
				this.writeElement(elem, tab + 1, true,
						name + "." + reference.getName() + "(" + count++ + ")");
			}
			return;
		} else if (refObject instanceof EObjectResolvingEList) {
			EObjectResolvingEList<EObject> containment = (EObjectResolvingEList<EObject>) refObject;
			Iterator<EObject> iterator = containment.iterator();
			while (iterator.hasNext()) {
				refAircraftElement = (AircraftModelElement) iterator.next();
				referenceName = this.checkName(refAircraftElement.getName());
				if (iterator.hasNext()) {
					allReferences += referenceName + ", ";
				} else {
					allReferences += referenceName;
				}
				if (!names.contains(referenceName)) {
					this.writeElement(refAircraftElement, tab + 2);
				}
			}
		} else {
			refAircraftElement = (AircraftModelElement) refObject;
			if (reference.isContainment()) {
				EClass refEClass = refAircraftElement.eClass();
				bufferedWriter.writeLine(
						tab + 1,
						name + "." + reference.getName() + " = ["
								+ refEClass.getName() + "()];");
				this.writeElement(refAircraftElement, tab + 1, true, name + "."
						+ reference.getName() + "(1)");
				return;
			}
			allReferences = this.checkName(refAircraftElement.getName());
			// for bidirectional references
			if (!names.contains(allReferences)) {
				this.writeElement(refAircraftElement, tab + 2);
			}
		}
		// set Reference
		bufferedWriter.writeLine(tab + 1, name + "." + reference.getName()
				+ " = [" + allReferences + "];");
	}

	private String checkName(String str) {
		str = str.trim();
		str = str.replaceAll(" ", "_");
		if (!str.matches("\\p{Alpha}.*")) {
			str = "gen" + str;
		}
		return str;
	}
}
