/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io;

import java.io.File;

import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * The interface for the different importstrategies for different file formats.
 * The interface has to be implemented by a strategy class. Than the plugin.xml
 * of the plugin which contains the new strategy implementation has to implement
 * the extension point "net.bhl.cdt.controller.importstrategy". Therefore you
 * have to add the extension point as extension in the plugin.xml of the
 * containing plugin and set the implementation class as class for the
 * extension.
 * 
 * @author mck
 */
public interface ImportStrategy {

	/**
	 * Takes the given file, read it in and creates a List of ExElements objects
	 * from the content.
	 * 
	 * @param file
	 *            The selected file for importing
	 * @return A EList of ExElements which represents the content of the file in
	 *         this way
	 */
	EList<DataType> importModelFromFile(File file);

	/**
	 * Checks if the implemented strategy is valid and able to import the given
	 * file.
	 * 
	 * @param file
	 *            The selected file, comes from a FileSelectionDialog
	 * @return If the implemented strategy can import the given file, than this
	 *         method returns true otherwise it returns false
	 */
	boolean canImport(File file);
}
