/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io.strategyimpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import net.bhl.cdt.connector.exception.ImportException;
import net.bhl.cdt.connector.io.ImportStrategy;
import net.bhl.cdt.connector.io.util.ImportFileUtil;
import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.DatatypesFactory;
import net.bhl.cdt.model.datatypes.MeasuredValue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * Implementation of ImportStrategy for importing a specific given CSV file
 * named Aircraftparameters.csv in the resources directory of SVN. The file
 * inputstream reads in UTF-8 encoding.
 * 
 * @author Michael Kagel
 * @author Sven Ziemer
 */
public class SimpleCSVImportStrategy implements ImportStrategy {

	private static final int COLUMNS = 4;

	@Override
	public EList<DataType> importModelFromFile(File file) {
		EList<DataType> exchangeElements = new BasicEList<DataType>();

		try {
			// BufferedReader bufReader = new BufferedReader(new
			// FileReader(file));
			// Problem with file encoding; InpusStreamReader allows for
			// specifying encoding charset UTF-8; 29.06.2010 SZ
			BufferedReader bufReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line;

			boolean header = true;
			CompositeValues compositeElement = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			compositeElement.setName("Aircaft");
			while ((line = bufReader.readLine()) != null) {
				if (header) {
					header = false;
					continue;
				}

				String[] split = line.split(";", 4);
				MeasuredValue exchangeValue = DatatypesFactory.eINSTANCE
						.createMeasuredValue();

				for (int i = 1; i < split.length; i++) {

					if (i % COLUMNS == 1) {

						exchangeValue.setName(split[i]);

					} else if (i % COLUMNS == 2) {
						exchangeValue.setUnit(ImportFileUtil
								.getUnitFromString(split[i]));

					} else if (i % COLUMNS == 3) {
						String clearValue = getClearString(split[i]);

						if (clearValue.equals("")) {
							exchangeValue.setValue(Double.NaN);
							continue;
						}

						exchangeValue.setValue(new Double(clearValue));

					}

				}
				compositeElement.getDatatypes().add(exchangeValue);
			}
			exchangeElements.add(compositeElement);
			bufReader.close();
		} catch (FileNotFoundException e) {
			throw new ImportException("File does not exist!", e);
		} catch (IOException e) {
			throw new ImportException(e);
		} catch (IllegalArgumentException e) {
			throw new ImportException(e);
		}

		return exchangeElements;
	}

	private String getClearString(String input) {
		input.trim();
		if (input.equals("-") || input.equals(" ")) {
			return "";
		}

		if (input.contains(",")) {
			input = input.replaceAll(",", "");
		}

		return input;

	}

	@Override
	public boolean canImport(File file) {
		return ImportFileUtil.getFileType(file).equals("csv");
	}

}
