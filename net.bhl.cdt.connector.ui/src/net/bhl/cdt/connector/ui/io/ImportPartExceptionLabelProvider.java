/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.ui.io;

import net.bhl.cdt.connector.exception.ImportLineException;
import net.bhl.cdt.connector.exception.ImportPartException;

import org.eclipse.jface.viewers.LabelProvider;

/**
 * A Label provider for the error dialog after a file has been imported. The
 * provider shows appropriate information for each type of error.
 * 
 * @author Sebastian Höcht
 */
public class ImportPartExceptionLabelProvider extends LabelProvider {

	/**
	 * Get an explanatory message for a specific exception object.
	 * 
	 * @TODO move those message strings to the exception objects, and therefore
	 *       create an interface for all exception classes
	 * @param element
	 *            the objects that holds information about the import exception.
	 * @return A message explaining the exception.
	 */
	public String getText(Object element) {
		if (element instanceof ImportLineException) {
			ImportLineException e = (ImportLineException) element;
			return e.getLineNumber() + ": " + e.getMessage();
		} else if (element instanceof ImportPartException) {
			return ((ImportPartException) element).getMessage();
		} else {
			return element.toString();
		}
	}
}
