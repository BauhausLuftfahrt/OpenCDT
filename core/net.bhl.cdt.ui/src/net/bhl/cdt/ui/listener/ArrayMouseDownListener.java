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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * @author David Otter
 */
public class ArrayMouseDownListener implements Listener {

	private Table table;
	private Array array;
	private TableEditor editor;

	/**
	 * Constructor.
	 * 
	 * @param array Array
	 * @param table Table
	 * @param editor TableEditor
	 */
	public ArrayMouseDownListener(Array array, Table table, TableEditor editor) {
		this.array = array;
		this.table = table;
		this.editor = editor;
	}

	@Override
	public void handleEvent(Event event) {
		Rectangle clientArea = table.getClientArea();
		Point pt = new Point(event.x, event.y);

		int index = table.getTopIndex();
		while (index <= table.getItemCount() + 1) {
			boolean visible = false;
			final TableItem item = table.getItem(index);
			for (int i = 0; i <= table.getColumnCount() + 1; i++) {
				Rectangle rect = item.getBounds(i);
				if (rect.contains(pt)) {
					final int column = i;
					final Text text = new Text(table, SWT.NONE);
					Listener textListener = new ArrayTextListener(item, column, text);

					text.addListener(SWT.FocusOut, textListener);
					text.addListener(SWT.Traverse, textListener);
					editor.setEditor(text, item, i);
					text.setText(item.getText(i));
					text.selectAll();
					text.setFocus();
//					System.out.println(text.getText());
//					System.out.println("[" + index + "," + i + "]");
//					System.out.println(array.getName());

					final DataType data = array.getDatatypes().get(index);

					String s = "";
					if (data instanceof FloatPointValue) {
						s = String.valueOf(((FloatPointValue) data).getValue());
					} else if (data instanceof MeasuredValue) {
						s = String.valueOf(((MeasuredValue) data).getValue());
					} else if (data instanceof IntegerValue) {
						s = String.valueOf(((IntegerValue) data).getValue());
					} else if (data instanceof StringValue) {
						s = String.valueOf(((StringValue) data).getValue());
					}
					text.addListener(SWT.MouseExit, new ArrayTextListener2(s, text, array, i, index));

					return;
				}
				if (!visible && rect.intersects(clientArea)) {
					visible = true;
				}
			}
			if (!visible) {
				return;
			}
			index++;
		}
	}

}
