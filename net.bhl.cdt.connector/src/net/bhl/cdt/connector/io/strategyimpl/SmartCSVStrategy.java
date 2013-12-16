/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io.strategyimpl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bhl.cdt.connector.io.ImportStrategy;
import net.bhl.cdt.connector.io.util.ImportFileUtil;
import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * A import strategy for various csv files. It read every type of csv file,
 * opens a dialog where the user can connect columns with model types.
 * 
 * @author Michael Kagel
 */
public class SmartCSVStrategy implements ImportStrategy {

	@Override
	public boolean canImport(File file) {
		return ImportFileUtil.getFileType(file).equals("csv");
	}

	@Override
	public EList<DataType> importModelFromFile(File file) {
		EList<DataType> resultList;

		// TODO Hierarchy of components has to be set

		// 1. Determine the number of columns in the csv file
		List<String> columnNames = determineNumberOfColumns(file);

		// 2. Open linking dialog for column types and model types linking
		Map<String, DataType> linkMap = linkColumns(columnNames);

		// 3. Read in the file and create the input tree.
		// It is possible that there is no component information but a lot of
		// parameters only
		resultList = readInTree(file, linkMap); // TODO the component hierarchy
												// has to be a parameter too

		return resultList;
	}

	private EList<DataType> readInTree(File file, Map<String, DataType> linkMap) {
		EList<DataType> resultList = new BasicEList<DataType>();

		// TODO read file and parse into tree

		return resultList;
	}

	private Map<String, DataType> linkColumns(List<String> columnNames) {
		Map<String, DataType> linkResult = new HashMap<String, DataType>();

		// TODO open Dialog an link the columns with their corresponding
		// ExElements

		return linkResult;
	}

	private List<String> determineNumberOfColumns(File file) {
		List<String> columnNames = new ArrayList<String>();

		// TODO read in the header names

		return columnNames;
	}

}
