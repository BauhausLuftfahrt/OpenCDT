/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
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
import net.bhl.cdt.utilities.datatypes.CompositeValues;
import net.bhl.cdt.utilities.datatypes.DataType;
import net.bhl.cdt.utilities.datatypes.DatatypesFactory;
import net.bhl.cdt.utilities.datatypes.StringValue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * This class imported CSV files, which have a specific structure .. For
 * example, CSV files, starting with a tree structure, such as
 * "Aircraft.Components.WingGroup.OverallSpan; 51.4880721593869, m, out" Here,
 * each element of the first part is stored in a CompositValue .. all others are
 * treated as values ​​(either in MeasuredValue or string value)
 * 
 * @author Sami Mkhazni
 * 
 * 
 */
public class CSVFileImport_2012_2 implements ImportStrategy {
	EList<DataType> stackList = new BasicEList<DataType>();
	CSVFileImportStack csvFileImportStack = new CSVFileImportStack(stackList);
	private int headerCount = 1;

	/**
	 * 
	 * 
	 * Here is checked whether the import file has a "CSV" extension or not.
	 * 
	 * @param file
	 */
	@Override
	public boolean canImport(File file) {
		return ImportFileUtil.getFileType(file).equals("csv");

	}

	/**
	 * Here is the mainMethod in which all other utility methods called. she use
	 * the class "CSVFileImportStack" to know whether it needs to store the line
	 * or not
	 */
	@Override
	public EList<DataType> importModelFromFile(File file) {
		EList<DataType> exchangeElements = new BasicEList<DataType>();
		CompositeValues headers = DatatypesFactory.eINSTANCE
				.createCompositeValues();
		headers.setName("Header ");
		try {
			CompositeValues all = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			all.setName(file.getName());
			BufferedReader bufReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line;
			while ((line = bufReader.readLine()) != null) {
				String c = "";
				if (line.length() > 0) {
					c = line.substring(0, 1);
				}
				if (c.equals("#")) {
					headers.getDatatypes().add(getHeadervonLine(line));
				} else {
					if (line.length() != 0) {
						EList<String> verteiltdurchsemicol = verteiltdurchsemicol(line);
						if (verteiltdurchsemicol.size() > 0) {
							EList<String> zweiteTeil = new BasicEList<String>();
							if (verteiltdurchsemicol.size() > 1) {
								for (int i = 1; i < verteiltdurchsemicol.size(); i++) {
									zweiteTeil.add(verteiltdurchsemicol.get(i));
								}
							}

							EList<String> ersteTeil = verteilendurchPunkt(verteiltdurchsemicol
									.get(0));
							ersteTeil = deleteSpace(ersteTeil);

							// ///////////////////////////////////////////////////////

							if (ersteTeil.size() == 1) {
								exchangeElements.add(onesizeline(ersteTeil,
										zweiteTeil));

							} else {
								csvFileImportStack.addCompositeValueToList(
										csvFileImportStack.returnList(),
										ersteTeil, zweiteTeil);

							}

						}

					} else {
						continue;
					}

				}

			}

		} catch (FileNotFoundException e) {
			throw new ImportException("File does not exist!", e);
		} catch (IOException e) {
			throw new ImportException(e);
		} catch (IllegalArgumentException e) {
			throw new ImportException(e);
		}
		exchangeElements.addAll(csvFileImportStack.returnList());
		exchangeElements.add(headers);
		return exchangeElements;
	}

	/**
	 * If our second part is not a double-value is stored in a StringValue.
	 * 
	 * @param ersteTeil
	 * @param zweiteTeil
	 * @return
	 */
	private DataType onesizeline(EList<String> ersteTeil,
			EList<String> zweiteTeil) {
		CompositeValues compositeValues = DatatypesFactory.eINSTANCE
				.createCompositeValues();
		compositeValues.setName(ersteTeil.get(0));
		String second = "";
		for (String s : zweiteTeil) {
			second = second + s;
		}
		StringValue stringValue = DatatypesFactory.eINSTANCE
				.createStringValue();
		stringValue.setValue(second);
		compositeValues.getDatatypes().add(stringValue);

		return compositeValues;
	}

	/**
	 * here the first part of our line is distributed: by points.
	 * 
	 * @param firstline
	 * @return
	 */
	private EList<String> verteilendurchPunkt(String firstline) {
		EList<Integer> positionen = new BasicEList<Integer>();
		EList<String> res = new BasicEList<String>();
		char c;
		positionen.add(0);
		for (int s = 0; s < firstline.length(); s++) {
			c = firstline.charAt(s);
			if (c == '.') {
				positionen.add(s);
			}

		}
		positionen.add(firstline.length());
		for (int i = 0; i < (positionen.size() - 1); i++) {
			String s = firstline.substring(positionen.get(i),
					positionen.get(i + 1));

			res.add(s);
		}
		res = deletePunkt(res);
		return res;
	}

	/**
	 * The line is first divided by a semicolon.
	 * 
	 * @param line
	 * @return
	 */
	private EList<String> verteiltdurchsemicol(String line) {

		EList<Integer> positionen = new BasicEList<Integer>();
		EList<String> res = new BasicEList<String>();
		char c;
		positionen.add(0);
		for (int s = 0; s < line.length(); s++) {
			c = line.charAt(s);
			if (c == ';') {
				positionen.add(s);
			}

		}
		positionen.add(line.length());
		for (int i = 0; i < (positionen.size() - 1); i++) {
			String s = line.substring(positionen.get(i), positionen.get(i + 1));

			res.add(s);
		}
		res = deleteSemi(res);
		return res;
	}

	/**
	 * Here the header of the CSV file is removed and stored in a separate.
	 * composite value
	 * 
	 * @param line
	 * @return
	 */
	private DataType getHeadervonLine(String line) {

		StringValue stringValue = DatatypesFactory.eINSTANCE
				.createStringValue();
		stringValue.setName("header Line N° " + headerCount);
		headerCount++;
		stringValue.setValue(line.substring(1));
		return stringValue;
	}

	/**
	 * Semicolons are removed from @res.
	 * 
	 * @param res
	 * @return
	 */
	private EList<String> deleteSemi(EList<String> res) {
		EList<String> res2 = new BasicEList<String>();
		for (int i = 0; i < res.size(); i++) {
			String s = res.get(i);
			String s2 = "";
			char[] chars = s.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				char c = chars[j];
				if (c == ';') {
					chars[j] = ' ';
				}
				s2 = s2 + chars[j];
			}

			res2.add(s2);
		}
		return res2;
	}

	/**
	 * Punkts are removed from the @res.
	 * 
	 * @param res
	 * @return
	 */
	private EList<String> deletePunkt(EList<String> res) {
		EList<String> res2 = new BasicEList<String>();
		for (int i = 0; i < res.size(); i++) {
			String s = res.get(i);
			String s2 = "";
			char[] chars = s.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				char c = chars[j];
				if (c == '.') {
					chars[j] = ' ';
				}
				s2 = s2 + chars[j];
			}

			res2.add(s2);
		}
		return res2;
	}

	/**
	 * Spaces are removed from the @firstDistributed.
	 * 
	 * @param firstDistributed
	 * @return
	 */
	private EList<String> deleteSpace(EList<String> firstDistributed) {
		EList<String> result = new BasicEList<String>();
		for (int i = 0; i < firstDistributed.size(); i++) {
			String s = firstDistributed.get(i);
			String s2 = "";
			char[] chars = s.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				char c = chars[j];
				if (c == ' ') {
					for (int f = j; f < (chars.length - 1); f++) {
						chars[f] = chars[f + 1];
					}

				}
				s2 = s2 + chars[j];
			}

			result.add(s2);
		}
		return result;
	}

}
