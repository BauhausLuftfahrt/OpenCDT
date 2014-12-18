/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.listener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author David Otter
 *
 */
public class ArrayTextListener implements Listener {
	private TableItem item;
	private int column;
	private Text text;
	
	/**
	 * 
	 * @param item Item
	 * @param column Column
	 * @param text Text
	 */
	public ArrayTextListener(TableItem item, int column, Text text){
		this.item = item;
		this.column = column;
		this.text = text;
	}
	
	@Override
	public void handleEvent(final Event e) {
		switch (e.type) {
		case SWT.FocusOut:
			item.setText(column, text.getText());
			text.dispose();
			break;
		case SWT.Traverse:
			switch (e.detail) {
			case SWT.TRAVERSE_RETURN:
				item.setText(column, text.getText());
				text.dispose();
				e.doit = false;
				break;
			case SWT.TRAVERSE_ESCAPE:
				text.dispose();
				e.doit = false;
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}

}
