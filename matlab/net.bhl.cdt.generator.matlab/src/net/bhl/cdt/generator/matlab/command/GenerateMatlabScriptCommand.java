/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.generator.matlab.command;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.ADDAM.AircraftModelElement;
import org.ADDAM.impl.AircraftModelImpl;
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

	/**
	 * Keep all Object names to avoid duplication and loops.
	 */
	private List<String> names;
	private HashMap<String, String> hashNames = new HashMap<String, String>();
	private Shell shell;
	// Selected Root Element
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
		} else {
			System.err.println("No AircraftModel element selected.");
		}
	}

	/**
	 * Create BufferedWriter and iterate over all AircraftModelElements.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param aircraftModelImpl
	 */
	private void write(String dir, AircraftModelImpl aircraftModelImpl) {
		try {
			bufferedWriter = new ConverterBufferedWriter(new FileWriter(new File(dir)));
			bufferedWriter.writeLine(WriteHelper.getComment());
			writeElement(aircraftModelImpl, 0);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * call writeElement with "isAnonymous = false" and "root = null".
	 */
	private void writeElement(EObject aircraftModelObject, int tab) {
		this.writeElementNameCheck(aircraftModelObject, tab, false, null);
	}

	/**
	 * Control Step to find name duplicates.
	 */
	private void writeElementNameCheck(EObject aircraftModelObject, int tab, Boolean isAnonymous,
			String root) {
		AircraftModelElement element = (AircraftModelElement) aircraftModelObject;
		String name = this.checkName(element.getName());
		// Check if name already exists
		if (name == null || name.isEmpty() || names.contains(name)) {
			System.err.println("No unique name choosen!");
			return;
		}
		names.add(name);
		this.writeElement(aircraftModelObject, tab, isAnonymous, root);
	}

	/**
	 * 
	 * @param aircraftModelObject
	 *            this EObject has to be an instance of aircraftModelElement!
	 * @param tab
	 *            the depth of the recursion used to format the script
	 * @param isAnonymous
	 *            Anonymous Flag
	 * @param root
	 *            Needed as Reference for Anonymous Objects
	 */
	protected void writeElement(EObject aircraftModelObject, int tab, Boolean isAnonymous,
			String root) {
		AircraftModelElement element = (AircraftModelElement) aircraftModelObject;
		EClass eClass = element.eClass();
		String name = this.checkName(element.getName());
		if (isAnonymous) {
			name = root;
		}

		EList<EAttribute> attributes = eClass.getEAllAttributes();
		EList<EReference> references = eClass.getEAllReferences();
		// Create Instance
		if (!isAnonymous) {
			bufferedWriter.writeLine(tab, name + " = " + eClass.getName() + "();");
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
				bufferedWriter.writeLine(tab + 1, name + "." + attribute.getName() + " = " + value
						+ ";");
			}
		}
		for (EReference reference : references) {
			Object value = element.eGet(reference);
			if (value != null && !value.toString().equals("[]")) {
				writeReference(reference, element, tab, name, isAnonymous);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void writeReference(EReference reference, AircraftModelElement element, int tab,
			String name, Boolean isAnonymous) {

		Object refObject = element.eGet(reference);
		/**
		 * check if root or reference it self is anonymous
		 */
		if (refObject instanceof EObjectContainmentEList || isAnonymous
				|| reference.isContainment()) {
			writeAnonymousReference(reference, element, tab, name);
			return;
		}

		String referenceName;
		AircraftModelElement refAircraftElement;
		String allReferences = "";

		if (refObject instanceof EObjectResolvingEList) {
			Iterator<EObject> iterator = ((EObjectResolvingEList<EObject>) refObject).iterator();
			while (iterator.hasNext()) {
				refAircraftElement = (AircraftModelElement) iterator.next();
				referenceName = this.checkName(refAircraftElement.getName());
				allReferences += referenceName;
				if (iterator.hasNext()) {
					allReferences += ", ";
				}
				if (!names.contains(referenceName)) {
					this.writeElement(refAircraftElement, tab + 2);
				}
			}
		} else {
			refAircraftElement = (AircraftModelElement) refObject;
			allReferences = this.checkName(refAircraftElement.getName());
			// for bidirectional references
			if (!names.contains(allReferences)) {
				this.writeElement(refAircraftElement, tab + 2);
			}
		}
		// set Reference
		bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = [" + allReferences
				+ "];");
	}

	/**
	 * Get all Reference Targets, match with namesHash, initialize reference,
	 * call writeElement for Reference Targets (if not happened before).
	 */
	@SuppressWarnings("unchecked")
	private void writeAnonymousReference(EReference reference, AircraftModelElement element,
			int tab, String name) {
		String referenceName;
		Object refObject = element.eGet(reference);
		AircraftModelElement refAircraftElement;
		List<AircraftModelElement> refAircraftElementList = new LinkedList<AircraftModelElement>();
		String allReferences = "";
		int count = 1;

		if (refObject instanceof EObjectContainmentEList) {
			Iterator<EObject> iterator = ((EObjectContainmentEList<EObject>) refObject).iterator();
			while (iterator.hasNext()) {
				refAircraftElement = (AircraftModelElement) iterator.next();
				refAircraftElementList.add(refAircraftElement);
				EClass refEClass = refAircraftElement.eClass();
				allReferences += refEClass.getName() + "()";
				if (iterator.hasNext()) {
					allReferences += ", ";
				}
			}
			bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
					+ allReferences + "];");
			
			List<WritingCommand> commands = new LinkedList<WritingCommand>();
			for (AircraftModelElement elem : refAircraftElementList) {
				if (!names.contains(this.checkName(elem.getName()))) {
					// add names as key and full path as values to hashName
					// this has to be done before writeElement is called for a reference
					String path = name + "." + reference.getName() + "(" + count++ + ")";
					hashNames.put(elem.getName(), path);
					commands.add(new WritingCommand(this, elem, tab + 1, true, path));
					names.add(this.checkName(elem.getName()));
				}
			}
			for (WritingCommand command : commands) {
				command.execute();
			}
		} else if (refObject instanceof EObjectResolvingEList) {
			Iterator<EObject> iterator = ((EObjectResolvingEList<EObject>) refObject).iterator();
			while (iterator.hasNext()) {
				refAircraftElement = (AircraftModelElement) iterator.next();
				refAircraftElementList.add(refAircraftElement);
				referenceName = this.getFullName(refAircraftElement);
				if (names.contains(this.checkName(refAircraftElement.getName()))) {
					allReferences += referenceName;
				} else {
					allReferences += refAircraftElement.eClass().getName() + "()";
				}
				if (iterator.hasNext()) {
					allReferences += ", ";
				}
			}
			bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
					+ allReferences + "];");
			for (AircraftModelElement elem : refAircraftElementList) {
				if (!names.contains(this.checkName(elem.getName()))) {
					// add names as key and full path as values to hashName
					// this has to be done before writeElement is called for a reference
					String path = name + "." + reference.getName() + "(" + count++ + ")";
					hashNames.put(elem.getName(), path);
					this.writeElementNameCheck(elem, tab + 1, true, path);
				}
			}
			// Reference
		} else {
			refAircraftElement = (AircraftModelElement) refObject;
			referenceName = this.getFullName(refAircraftElement);
			if (!names.contains(this.checkName(refAircraftElement.getName()))) {
				hashNames.put(refAircraftElement.getName(), name + "." + reference.getName());
				bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
						+ refAircraftElement.eClass().getName() + "()];");
				this.writeElementNameCheck(refAircraftElement, tab + 1, true, name + "."
						+ reference.getName());
			} else {
				bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
						+ referenceName + "];");
			}
		}
	}

	/**
	 * @param str
	 * @return valid Name without whitespace
	 */
	private String checkName(String str) {
		str = str.trim();
		str = str.replaceAll(" ", "_");
		if (!str.matches("\\p{Alpha}.*")) {
			str = "gen" + str;
		}
		return str;
	}
	
	private String getFullName(AircraftModelElement refAircraftElement) {
		String referenceName = this.checkName(refAircraftElement.getName());
		if (hashNames.containsKey(referenceName)) {
			return hashNames.get(referenceName);
		}
		return referenceName;
	}
}