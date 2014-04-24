/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io.strategyimpl;

import net.bhl.cdt.model.datatypes.CompositeValues;
import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.DatatypesFactory;
import net.bhl.cdt.model.datatypes.MeasuredValue;
import net.bhl.cdt.model.datatypes.StringValue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * This class is like a memory, where all stored items imported from CSV file,
 * after that they are controlled (if they exist already in this memory).
 * 
 * @author Sami Mkhazni
 * 
 */
public class CSVFileImportStack {
	/**
	 * @param CompositeList
	 *            is our Memory
	 */
	private EList<DataType> compositeList = new BasicEList<DataType>();


	/**
	 * Constructor.
	 * @param compositeList
	 */
	public CSVFileImportStack(EList<DataType> compositeList) {
		this.compositeList = compositeList;
	}

	/**
	 * this method check whether that the "first part" already stored in
	 * "Stack List" or not .. if not , it will be stored with the "second part"
	 * in memory
	 * 
	 * @param stackList
	 * @param ersteTeil
	 * @param zweiteTeil
	 */
	public void addCompositeValueToList(EList<DataType> stackList,
			EList<String> ersteTeil, EList<String> zweiteTeil) {

		String ersteVonErsteTeil = "";
		if (ersteTeil.size() > 0) {
			ersteVonErsteTeil = ersteTeil.get(0);

			if (getPosition(stackList, ersteVonErsteTeil) == -1) {

				CompositeValues ersteTeilalsCompositeValue = konstruiereCVvonList(
						0, ersteTeil, zweiteTeil);
				stackList.add(ersteTeilalsCompositeValue);
			} else {

				int position = getPosition(stackList, ersteVonErsteTeil);
				// ((CompositeValues) stackList.get(position)).getDatatypes();

				ersteTeil = ersteTeilMinusEins(ersteTeil);

				addCompositeValueToList(
						((CompositeValues) stackList.get(position))
								.getDatatypes(),
						ersteTeil, zweiteTeil);

				/*
				 * CompositeValues ersteUndZweiteTeilalsCompositeValue =
				 * konstruiereCVvonList( 1, ersteTeil, zweiteTeil);
				 * 
				 * ((CompositeValues)
				 * stackList.get(position)).getDatatypes().add(
				 * ersteUndZweiteTeilalsCompositeValue);
				 */
			}

		}
	}

	/**
	 * The first element is deleted from the first part.
	 * 
	 * @param ersteTeil
	 * @return
	 */
	private EList<String> ersteTeilMinusEins(EList<String> ersteTeil) {
		EList<String> minusEins = new BasicEList<String>();
		String[] tab = new String[ersteTeil.size() - 1];
		int k = 0;
		for (int i = 1; i < ersteTeil.size(); i++) {
			tab[k] = ersteTeil.get(i);
			k++;
		}

		for (int j = 0; j < tab.length; j++) {
			minusEins.add(tab[j]);
		}

		return minusEins;
	}

	/**
	 * position of the difference between "StackList" and "ersteVonErsteTeil" is
	 * returned.
	 * 
	 * @param stackList
	 * @param ersteVonErsteTeil
	 * @return
	 */
	private int getPosition(EList<DataType> stackList, String ersteVonErsteTeil) {
		//int res;
		for (int stacklistcounter = 0; stacklistcounter < stackList.size(); stacklistcounter++) {
			if (stackList.get(stacklistcounter) instanceof CompositeValues) {
				CompositeValues compositeValues = (CompositeValues) stackList
						.get(stacklistcounter);
				if (ersteVonErsteTeil.equals(compositeValues.getName())) {
					return stacklistcounter;
				}

			}

		}

		return -1;
	}

	/**
	 * here is a composite value of the "first part" generates a Measured value
	 * / StringValue is also generated by the second .. then the combined the
	 * two Values
	 * 
	 * @param pos
	 * @param ersteTeil
	 * @param zweiteTeil
	 * @return
	 */
	private CompositeValues konstruiereCVvonList(int pos,
			EList<String> ersteTeil, EList<String> zweiteTeil) {

		//int position = pos;

		EList<CompositeValues> compositeList = new BasicEList<CompositeValues>();

		CompositeValues compositeValues = DatatypesFactory.eINSTANCE
				.createCompositeValues();
		compositeValues.setName(ersteTeil.get(pos));
		for (int i = pos + 1; i < ersteTeil.size(); i++) {
			CompositeValues compositeValues2 = DatatypesFactory.eINSTANCE
					.createCompositeValues();
			compositeValues2.setName(ersteTeil.get(i));
			compositeList.add(compositeValues2);

		}

		// ///////////////////////////////////////
		DataType dataType = konstruktionVonMeasuredOderString(zweiteTeil);

		if (compositeList.size() == 0) {
			if (dataType instanceof MeasuredValue) {
				MeasuredValue measuredValue = (MeasuredValue) dataType;
				compositeValues.getDatatypes().add(measuredValue);
			} else if (dataType instanceof StringValue) {
				//StringValue stringValue = (StringValue) dataType;
			}

		}

		else if (compositeList.size() > 0) {
			if (dataType instanceof MeasuredValue) {
				MeasuredValue measuredValue = (MeasuredValue) dataType;
				compositeList.get(compositeList.size() - 1).getDatatypes()
						.add(measuredValue);
			} else if (dataType instanceof StringValue) {
				StringValue stringValue = (StringValue) dataType;
				compositeList.get(compositeList.size() - 1).getDatatypes()
						.add(stringValue);
			}

			compositeValues = compositeRekurisivKonstruktion2(compositeList,
					compositeValues);
		}
		return compositeValues;
	}

	/**
	 * the "second part" is either a string ==> StringValue or a Value ==>
	 * MeasuredValue.
	 * 
	 * @param zweiteTeil
	 * @return
	 */
	private DataType konstruktionVonMeasuredOderString(EList<String> zweiteTeil) {
		MeasuredValue measuredValue = DatatypesFactory.eINSTANCE
				.createMeasuredValue();
		StringValue stringValue = DatatypesFactory.eINSTANCE
				.createStringValue();
		double d;
		String s = "", s1 = "", s2 = "";

		try {
			d = Double.valueOf(zweiteTeil.get(0));
			measuredValue.setValue(d);
			if (zweiteTeil.size() > 1) {
				s1 = zweiteTeil.get(1);
			}
			if (zweiteTeil.size() > 2) {
				s2 = zweiteTeil.get(2);
			}

			measuredValue.setName(s1 + " : " + s2);

		} catch (RuntimeException e) {
			for (String s3 : zweiteTeil) {
				s = s + s3;
			}
			stringValue.setValue(s);

		}

		if (measuredValue.equals(null)) {
			return stringValue;
		}

		return measuredValue;
	}

	public EList<DataType> returnList()

	{
		return this.compositeList;
	}

	/**
	 * Recursive construction of composite value from a list.
	 * 
	 * @param list
	 * @param compositeValues
	 * @return
	 */
	private CompositeValues compositeRekurisivKonstruktion2(
			EList<CompositeValues> list, CompositeValues compositeValues) {

		if (list.size() > 0) {
			for (int i = list.size() - 1; i > 0; i--) {
				list.get(i - 1).getDatatypes().add(list.get(i));
			}
			compositeValues.getDatatypes().add(list.get(0));
		}
		return compositeValues;

	}

}
