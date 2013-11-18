/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.listener;

import net.bhl.cdt.utilities.datatypes.Array;
import net.bhl.cdt.utilities.datatypes.DataType;
import net.bhl.cdt.utilities.datatypes.FloatPointValue;
import net.bhl.cdt.utilities.datatypes.IntegerValue;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.datatypes.StringValue;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author David Otter
 *
 */
public class ArrayTextListener2 implements Listener {
	private String s2;
	private Text text;
	private Array array;
	private int i2, k;
	
	/**
	 * Constructor.
	 * 
	 * @param s2 String	
	 * @param text Text	
	 * @param array Array
	 * @param i2 Integer	
	 * @param k Integer
	 */
	public ArrayTextListener2(String s2, Text text, Array array, int i2, int k){
		this.s2 = s2;
		this.text = text;
		this.array = array;
		this.i2 = i2;
		this.k = k;
	}
	
	@Override
	public void handleEvent(Event event) {

		if (!(s2.equals(text.getText()))) {
//			System.out.println("Schon geändert!!!!!");
//			System.out.println("*********" + array.getName() + "*******");

			double d = 0;
			try {
				d = Double.valueOf(text.getText());

			} catch (NumberFormatException nfe) {
				System.out.println("NumberFormatException: " + nfe.getMessage());
			}
			if (array.getDatatypes().get(0) instanceof Array) {

				DataType data = ((Array) array.getDatatypes().get(i2)).getDatatypes()
					.get(k);

				if (data instanceof FloatPointValue) {
					((FloatPointValue) ((Array) array.getDatatypes().get(i2))
						.getDatatypes().get(k)).setValue(d);
				} else if (data instanceof IntegerValue)

				{
					((IntegerValue) ((Array) array.getDatatypes().get(i2)).getDatatypes()
						.get(k)).setValue((int) d);
				} else if (data instanceof MeasuredValue)

				{
					((MeasuredValue) ((Array) array.getDatatypes().get(i2)).getDatatypes()
						.get(k)).setValue(d);
				} else if (data instanceof StringValue) {
					((StringValue) ((Array) array.getDatatypes().get(i2)).getDatatypes()
						.get(k)).setValue(text.getText());
				}

			} else {
				DataType data = array.getDatatypes().get(k);

				if (data instanceof FloatPointValue) {
					((FloatPointValue) array.getDatatypes().get(k)).setValue(d);
				} else if (data instanceof IntegerValue) {
					((IntegerValue) array.getDatatypes().get(k)).setValue((int) d);
				} else if (data instanceof MeasuredValue) {
					((MeasuredValue) array.getDatatypes().get(k)).setValue(d);
				}

				else if (data instanceof MeasuredValue) {
					((StringValue) array.getDatatypes().get(k)).setValue(text.getText());
				}

			}

		}

	}

}
