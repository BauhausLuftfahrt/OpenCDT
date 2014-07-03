/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io;

import java.util.ArrayList;

import net.bhl.cdt.connector.exception.ImportPartException;

/**
 * Collects all information about an imported file. The report needs to be
 * accessed globally and only once, it is a Singleton. The ImportFileHandler
 * resets the contents of the report before a new file is imported.
 * 
 * @author Sebastian Höcht
 */
public final class ImportReport {

	private static ImportReport instance;
	private String fileName;
	private ArrayList<ImportPartException> exceptions;

	/**
	 * 
	 */
	private ImportReport() {
		this.exceptions = new ArrayList<ImportPartException>();
	}

	/**
	 * Function of the Singleton pattern which returns and in case creates the
	 * only instance.
	 * 
	 * @return the singleton instance.
	 */
	public static ImportReport getInstance() {
		if (instance == null) {
			instance = new ImportReport();
		}
		return instance;
	}

	/**
	 * Clear the list of ImportReport from all entries.
	 */
	public static void reset() {
		instance = new ImportReport();
	}

	/**
	 * Set the file name of the file imported.
	 * 
	 * @param fileName
	 *            the name of the file which is imported.
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Get the file name of the imported file.
	 * 
	 * @return the name of the imported file.
	 */
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * Add a new Exception that occurred during a file import.
	 * 
	 * @param e
	 *            the exception that occurred during a file import.
	 */
	public void addException(ImportPartException e) {
		exceptions.add(e);
	}

	/**
	 * Get all Exceptions that have been registered by now.
	 * 
	 * @return a list of registered exceptions
	 */
	public ArrayList<ImportPartException> getExceptions() {
		return exceptions;
	}
}
