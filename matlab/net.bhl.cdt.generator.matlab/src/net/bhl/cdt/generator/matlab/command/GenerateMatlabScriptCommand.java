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
	/**
	 * Keep the full path of all objects associated with their name as key.
	 */
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
	 * Get directory and Class of firstElement. Select .m file directory.
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
		names = new LinkedList<String>();
		if (firstElement instanceof EObject) {
			EObject eObject = (EObject) firstElement;
			write(directory, eObject);
		} else {
			System.err.println("No EObject selected.");
		}
	}

	/**
	 * Create BufferedWriter, File and iterate over all EOBjects.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param eObject
	 */
	private void write(String dir, EObject eObject) {
		try {
			File file = new File(dir);
			if (!file.exists()) {
				file.createNewFile();
			}
			bufferedWriter = new ConverterBufferedWriter(new FileWriter(file));
			bufferedWriter.writeLine(WriteHelper.getComment());
			writeElement(eObject, 0);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * call writeElement with "isAnonymous = false" and "root = null".
	 */
	private void writeElement(EObject eObject, int tab) {
		this.writeElementNameCheck(eObject, tab, false, null);
	}

	/**
	 * Control Step to find name duplicates.
	 */
	private void writeElementNameCheck(EObject eObject, int tab, Boolean isAnonymous, String root) {
		EObject element = (EObject) eObject;
		String name = this.checkName(this.getName(element));
		// Check if name already exists
		if (name == null || name.isEmpty() || names.contains(name)) {
			System.err.println("No unique name choosen!");
			return;
		}
		names.add(name);
		this.writeElement(eObject, tab, isAnonymous, root);
	}

	/**
	 * 
	 * @param eObject
	 *            EObject!
	 * @param tab
	 *            the depth of the recursion used to format the script
	 * @param isAnonymous
	 *            Anonymous Flag
	 * @param root
	 *            Needed as Reference for Anonymous Objects
	 */
	protected void writeElement(EObject eObject, int tab, Boolean isAnonymous, String root) {
		EObject element = (EObject) eObject;
		EClass eClass = element.eClass();
		String name = this.checkName(this.getName(element));
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
		// Iterate through and write References
		for (EReference reference : references) {
			Object value = element.eGet(reference);
			/**
			 * check if root or reference it self is anonymous
			 */
			if (value != null && !value.toString().equals("[]")) {
				if (value instanceof EObjectContainmentEList || isAnonymous
						|| reference.isContainment()) {
					this.writeAnonymousReference(reference, element, tab, name);
				} else {
					this.writeReference(reference, value, tab, name);
				}
			}
		}
	}

	/**
	 * Write References if they are not anonymous.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void writeReference(EReference reference, Object refObject, int tab, String name) {
		String referenceName;
		EObject eObject;
		String allReferences = "";
		// For Cell Array Check
		List<Class> classes = new LinkedList<Class>();

		if (refObject instanceof EObjectResolvingEList) {
			Iterator<EObject> iterator = ((EObjectResolvingEList<EObject>) refObject).iterator();
			while (iterator.hasNext()) {
				eObject = (EObject) iterator.next();
				classes.add(eObject.getClass());
				referenceName = this.getFullName(eObject);
				allReferences += referenceName;
				if (iterator.hasNext()) {
					allReferences += ", ";
				}
				if (!names.contains(this.checkName(this.getName(eObject)))) {
					this.writeElement(eObject, tab + 2);
				}
			}
		} else {
			eObject = (EObject) refObject;
			allReferences = this.getFullName(eObject);
			// for bidirectional references
			if (!names.contains(allReferences)) {
				this.writeElement(eObject, tab + 2);
			}
		}
		if (isCellArray(classes)) {
			bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = {"
					+ allReferences + "};");
		} else {
			bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
					+ allReferences + "];");
		}
	}

	/**
	 * Get all Reference Targets, match with namesHash, initialize reference,
	 * call writeElement for Reference Targets (if not happened before).
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void writeAnonymousReference(EReference reference, EObject element, int tab, String name) {
		String referenceName;
		Object referenceObject = element.eGet(reference);
		EObject referenceElement;
		// For Cell Array Check
		List<Class> classes = new LinkedList<Class>();
		Iterator<EObject> iterator = null;

		if (referenceObject instanceof EObjectContainmentEList) {
			iterator = ((EObjectContainmentEList<EObject>) referenceObject).iterator();
		} else if (referenceObject instanceof EObjectResolvingEList) {
			iterator = ((EObjectResolvingEList<EObject>) referenceObject).iterator();
		}

		if (iterator != null) {
			List<EObject> referenceElements = new LinkedList<EObject>();
			String allReferences = "";
			int count = 0;

			while (iterator.hasNext()) {
				referenceElement = (EObject) iterator.next();
				classes.add(referenceElement.getClass());
				referenceElements.add(referenceElement);
				referenceName = this.getFullName(referenceElement);
				/**
				 * Look up the name. If the object doesn't exist create it.
				 */
				if (names.contains(this.checkName(this.getName(referenceElement)))) {
					allReferences += referenceName;
				} else {
					allReferences += referenceElement.eClass().getName() + "()";
				}
				if (iterator.hasNext()) {
					allReferences += ", ";
				}
			}
			if (isCellArray(classes)) {
				bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = {"
						+ allReferences + "};");
			} else {
				bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
						+ allReferences + "];");
			}

			/**
			 * Why all Objects have to be collected before calling #writeElement
			 * [command.execute()]? To ensure that no object writes an object
			 * that is also part of #referenceElements (!) all Objects have to
			 * be marked as been created before the first call of #writeElement.
			 * But therefore all Classes that should be written must be
			 * collected, because otherwise you don't know anymore which objects
			 * were already been created and which not.
			 */
			List<WritingCommand> commands = new LinkedList<WritingCommand>();
			for (EObject elem : referenceElements) {
				count++;
				if (!names.contains(this.checkName(this.getName(elem)))) {
					String path;
					if (isCellArray(classes)) {
						path = name + "." + reference.getName() + "{" + count + "}";
					} else {
						path = name + "." + reference.getName() + "(" + count + ")";
					}
					// add names as key and full path as values to hashName
					hashNames.put(this.getName(elem), path);
					commands.add(new WritingCommand(this, elem, tab + 1, true, path));
					names.add(this.checkName(this.getName(elem)));
				}
			}
			// Execute all collected Class writing jobs
			for (WritingCommand command : commands) {
				command.execute();
			}
		} else {
			referenceElement = (EObject) referenceObject;
			referenceName = this.getFullName(referenceElement);
			if (!names.contains(this.checkName(this.getName(referenceElement)))) {
				hashNames.put(this.getName(referenceElement), name + "." + reference.getName());
				bufferedWriter.writeLine(tab + 1, name + "." + reference.getName() + " = ["
						+ referenceElement.eClass().getName() + "()];");
				this.writeElementNameCheck(referenceElement, tab + 1, true,
						name + "." + reference.getName());
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

	/**
	 * Search hashNames.
	 * 
	 * @param referenceElement
	 * @return the full path or the name if no path exists
	 */
	private String getFullName(EObject referenceElement) {
		String referenceName = this.checkName(this.getName(referenceElement));
		if (hashNames.containsKey(referenceName)) {
			return hashNames.get(referenceName);
		}
		return referenceName;
	}

	/**
	 * Search classes for not equal entries.
	 * 
	 * @param classes
	 * @return True if not equal entries were found.
	 */
	@SuppressWarnings("rawtypes")
	private Boolean isCellArray(List<Class> classes) {
		for (Class clazz : classes) {
			if (!classes.get(0).equals(clazz)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Get the value of the name Attribute or otherwise the toString ID of the
	 * EObject.
	 * 
	 * @param eObject
	 * @return
	 */
	private String getName(EObject eObject) {
		Object nameObject = null;
		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			if (attribute.getName().toLowerCase().equals("name")) {
				nameObject = eObject.eGet(attribute);
			}
		}
		String name;
		if (nameObject == null || ((String) nameObject).isEmpty()) {
			name = (String) eObject.toString().subSequence(0,
					(eObject.toString() + ' ').indexOf(' '));
		} else {
			name = (String) nameObject;
		}
		return name;
	}
}