/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import net.bhl.cdt.model.datatypes.Array;
import net.bhl.cdt.model.datatypes.DataType;
import net.bhl.cdt.model.datatypes.FloatPointValue;
import net.bhl.cdt.model.datatypes.IntegerValue;
import net.bhl.cdt.model.datatypes.MeasuredValue;
import net.bhl.cdt.model.datatypes.StringValue;
import net.bhl.cdt.ui.editors.arrays.ArrayEditorInput;
import net.bhl.cdt.ui.editors.arrays.ArrayEditorOpener;
import net.bhl.cdt.ui.listener.ArrayMouseDownListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

/**
 * @author Sami Mkhazni
 */

public class ArrayEditor extends EditorPart {

	/**
	 * ID (path) of the ArrayEditor.
	 */
	public static final String ID = "net.bhl.cdt.ui.editors.ArrayEditor"; //$NON-NLS-1$
	private Table table;
	// private Composite parent;
	private Array array;
	private ECPProject ecpProject;

	/**
	 * Calls super Constructor.
	 */
	public ArrayEditor() {

		super();

	}

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent a composite control which will be the parent of the new instance (cannot be null)
	 */
	@Override
	public void createPartControl(Composite parent) {
		if (array.getDatatypes().isEmpty()) {
			return;
		}
		table = new Table(parent, SWT.BORDER);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		createColumns(array, table);
		createData(array, table);
		tableEdit(array);

	}
	
	/**
	 * Refresh the table with the new array.
	 * 
	 * @param array the new Array data to refresh
	 */
	public void refresh(Array array) {
		this.array = array;
		table.removeAll();
		createData(array, table);
	}

	/**
	 * @param array Array that contains the data
	 * @param table Table Control
	 */
	public void createData(Array array, Table table) {
		int clmn = 0;
		// int k = 0;
		if (array.getDatatypes().get(0) instanceof Array) {

			int f = 0;
			for (int x = 0; x < ((Array) array.getDatatypes().get(0)).getDatatypes().size(); x++)// 1-->2
			{

				TableItem item = new TableItem(table, SWT.NONE);

				for (int z = 0; z < array.getDatatypes().size(); z++)// 1-->3
				{
					final DataType data = ((Array) array.getDatatypes().get(z)).getDatatypes().get(f);

					if (data instanceof FloatPointValue) {
						item.setText(z, String.valueOf(((FloatPointValue) data).getValue()));
					} else if (data instanceof IntegerValue) {
						item.setText(z, String.valueOf(((IntegerValue) data).getValue()));
					} else if (data instanceof MeasuredValue) {
						item.setText(z, String.valueOf(((MeasuredValue) data).getValue()));
					} else if (data instanceof StringValue) {
						item.setText(z, (((StringValue) data).getValue()));
					}

					else {
						if (data instanceof Array) {

							// DataType data2 = ((Array) data).getDatatypes().get(
							// 0);

							// k++;
							item.setText(z, ((Array) data).getName());
							TableEditor[] buttonEditors = new TableEditor[1];

							Button[] button = new Button[1];
							buttonEditors[0] = new TableEditor(table);
							button[0] = new Button(table, SWT.PUSH);

							button[0].setText(this.array.getName() + "." + ((Array) data).getName());
							button[0].computeSize(SWT.DEFAULT, table.getItemHeight());
							buttonEditors[0].grabHorizontal = true;
							buttonEditors[0].minimumHeight = button[0].getSize().y;
							buttonEditors[0].minimumWidth = button[0].getSize().x;

							if (clmn < this.array.getDatatypes().size())

							{
								buttonEditors[0].setEditor(button[0], item, clmn);

								clmn++;
							} else {
								clmn = 0;
								buttonEditors[0].setEditor(button[0], item, clmn);
								clmn++;
							}

							button[0].addSelectionListener(new SelectionAdapter() {
								public void widgetSelected(SelectionEvent event) {

									ArrayEditorOpener arrayEditorOpener = new ArrayEditorOpener();

									arrayEditorOpener.openModelElement((Array) data, ecpProject);
								}
							});

						}

					}

				}

				f++;

			}

		} else {
			for (int i = 0; i < array.getDatatypes().size(); i++) {
				TableItem item = new TableItem(table, SWT.NONE);
				DataType data = array.getDatatypes().get(i);
				if (data instanceof FloatPointValue) {
					item.setText(0, String.valueOf(((FloatPointValue) data).getValue()));
				} else if (data instanceof IntegerValue) {
					item.setText(0, String.valueOf(((IntegerValue) data).getValue()));
				} else if (data instanceof MeasuredValue) {
					item.setText(0, String.valueOf(((MeasuredValue) data).getValue()));
				} else if (data instanceof StringValue) {
					item.setText(0, String.valueOf(((StringValue) data).getValue()));
				}
			}

		}

	}

	/**
	 * @param array Array that contains the data
	 * @param table Table Control
	 */
	public void createColumns(Array array, Table table) {

		String s = "NO NAME";
		if (array.getDatatypes().get(0) instanceof Array) {

			for (DataType dataType : array.getDatatypes()) {
				TableColumn tblclmnTest = new TableColumn(table, SWT.NONE);
				tblclmnTest.setWidth(110);

				try {
					s = dataType.getName();
					if (s == null) {
						s = "NO NAME";
					}
				} catch (Exception e) {

					// TODO: handle exception
					//s = "NO NAME";
				}

				tblclmnTest.setText(s);
				// tblclmnTest.setText(dataType.getName());
			}
		}

		else {
			TableColumn tblclmnTest = new TableColumn(table, SWT.NONE);
			tblclmnTest.setWidth(110);
			try {
				s = array.getName();
				if (s == null) {
					s = "NO NAME";
				}
			} catch (Exception e) {
				// TODO: handle exception
				//s = "NO NAME";
			}
			tblclmnTest.setText(s);
			// tblclmnTest.setText(array.getName());
		}

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (!(input instanceof ArrayEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		ArrayEditorInput editorInput = (ArrayEditorInput) input;
		this.array = editorInput.getArray();
		this.ecpProject = editorInput.getECPProject();
		setSite(site);
		setInput(input);

	}

	/**
	 * @param array Array that contains the data
	 */
	public void tableEdit(final Array array) {

		final TableEditor editor = new TableEditor(table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		table.addListener(SWT.MouseDown, new ArrayMouseDownListener(array, table, editor));
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

}
