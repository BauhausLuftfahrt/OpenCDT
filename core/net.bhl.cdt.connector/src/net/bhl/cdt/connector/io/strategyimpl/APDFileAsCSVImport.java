/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
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
 * Implementation of ImportStrategy for importing a specific given APD file The
 * file inputstream reads in UTF-8 encoding.
 * 
 * @author Sami Mkhazni
 */
public class APDFileAsCSVImport implements ImportStrategy {

	CompositeValues test = DatatypesFactory.eINSTANCE.createCompositeValues();

	// declare file extension for importStrategy
	@Override
	public boolean canImport(File file) {
		return ImportFileUtil.getFileType(file).equals("apd");
	}

	@Override
	public EList<DataType> importModelFromFile(File file) {
		EList<DataType> exchangeElements = new BasicEList<DataType>();

		try {

			BufferedReader bufReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line;

			boolean header = true;

			int count = 1;
			int head = 1;
			CompositeValues all = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			all.setName(file.getName());
			CompositeValues headers = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			headers.setName("Header ");
			while ((line = bufReader.readLine()) != null) {
				if (header) {
					header = false;
					continue;
				}

				String c = line.substring(0, 1);
				if (c.equals("#")) {
					StringValue stringValue = DatatypesFactory.eINSTANCE
							.createStringValue();
					stringValue.setName("header Line N° " + head);
					head++;
					stringValue.setValue(line.substring(1));
					headers.getDatatypes().add(stringValue);

				}

				else {
					EList<String> distributed = verteilen(line);
					if (distributed.size() > 0) {
						EList<String> firstDistributed = verteilen2(distributed
								.get(0));

						String s = "";
						for (String s2 : firstDistributed) {
							s = s + s2;
						}

						String secondline = line.substring(s.length() - 1,
								line.length() - 1);
						firstDistributed = deleteSpace(firstDistributed);
						EList<CompositeValues> cv = new BasicEList<CompositeValues>();
						CompositeValues compositeValues2 = CompositeRekurisivKonstruktion(
								firstDistributed, line);

						exchangeElements.add(compositeValues2);
						/*
						 * for (int x = 0; x < firstDistributed.size(); x++) {
						 * String firstString = firstDistributed.get(x);
						 * 
						 * CompositeValues compositeValues =
						 * DatatypesFactory.eINSTANCE .createCompositeValues();
						 * compositeValues.setName(firstString);
						 * 
						 * cv.add(compositeValues);
						 * 
						 * //
						 * ///////////////////////////////////////////////////
						 * //// ////////////////////////////////////////
						 * 
						 * 
						 * 
						 * boolean b = exist(firstString, alles);
						 * 
						 * if (b) {
						 * 
						 * for (DataType data : all.getDatatypes()) { /* if
						 * (data.getName().equals(firstString)) {
						 * CompositeValues compositeValues = (CompositeValues)
						 * data; compositeValues.setName(firstString);
						 * 
						 * all.getDatatypes().add(compositeValues); }
						 */
					} else {
						continue;
					}
				}
				// } else {
				/*
				 * CompositeValues compositeValues = DatatypesFactory.eINSTANCE
				 * .createCompositeValues();
				 * compositeValues.setName(firstString);
				 * 
				 * alles.getDatatypes().add(compositeValues); alles =
				 * compositeValues;
				 */
				// }

				// }*/

				// }
			}
			exchangeElements.add(headers);
			// exchangeElements.add(all);
		} catch (FileNotFoundException e) {
			throw new ImportException("File does not exist!", e);
		} catch (IOException e) {
			throw new ImportException(e);
		} catch (IllegalArgumentException e) {
			throw new ImportException(e);
		}

		return exchangeElements;
	}

	/*
	 * private EList<String> minus(EList<String> distributed, EList<String>
	 * firstDistributed) { EList<String> minus = new BasicEList<String>(); if
	 * (distributed.size() > firstDistributed.size()) { for (int i =
	 * firstDistributed.size(); i < distributed.size(); i++) {
	 * minus.add(distributed.get(i)); }
	 * 
	 * }
	 * 
	 * return minus; }
	 */

	private CompositeValues CompositeRekurisivKonstruktion(EList<String> list,
			String secondline) {
		EList<CompositeValues> compositeList = new BasicEList<CompositeValues>();
		CompositeValues compositeValues = DatatypesFactory.eINSTANCE
				.createCompositeValues();
		compositeValues.setName(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			CompositeValues compositeValues2 = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			compositeValues2.setName(list.get(i));
			compositeList.add(compositeValues2);

		}

		StringValue stringValue = DatatypesFactory.eINSTANCE
				.createStringValue();

		stringValue.setValue(secondline);

		if (compositeList.size() > 0)
			compositeList.get(compositeList.size() - 1).getDatatypes()
					.add(stringValue);
		compositeValues = CompositeRekurisivKonstruktion2(compositeList,
				compositeValues);

		return compositeValues;
	}

	private CompositeValues CompositeRekurisivKonstruktion2(
			EList<CompositeValues> list, CompositeValues compositeValues) {

		if (list.size() > 0) {
			for (int i = list.size() - 1; i > 0; i--) {
				list.get(i - 1).getDatatypes().add(list.get(i));
			}
			compositeValues.getDatatypes().add(list.get(0));
		}
		return compositeValues;

		/*
		 * if (list.size() == 0)
		 * 
		 * return test;
		 * 
		 * else {
		 * 
		 * compositeValues.getDatatypes().add(list.get(0));
		 * test.getDatatypes().add(compositeValues); list.remove(0); return
		 * CompositeRekurisivKonstruktion2(list, (CompositeValues)
		 * compositeValues.getDatatypes().get(0));
		 * 
		 * }
		 */

	}

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

	private boolean exist(String firstString, CompositeValues all) {
		boolean b = false;
		int count = 0;
		while (!b && count < all.getDatatypes().size()) {
			DataType d = all.getDatatypes().get(count);
			count++;
			String s = d.getName();
			b = s.equals(firstString);
		}

		return b;
	}

	private EList<String> verteilen2(String firstline) {

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

	private EList<String> verteilen(String line) {
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

}
