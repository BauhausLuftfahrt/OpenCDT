/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.view.modeleditor.controls;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import model.data.IParameter;
import model.quantities.LengthParamenter;
import net.bhl.cdt.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-11
 *
 */
public class CDTParameterTableViewer extends TableViewer {
    private static final String COLHEADER_NAME = "Parameter";
    private static final String COLHEADER_VALUE = "Value";
    private static final String COLHEADER_UNIT = "Unit";

    public CDTParameterTableViewer(Composite parent) {
	super(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.HIDE_SELECTION | SWT.BORDER);
	createColumns();

	setContentProvider(ArrayContentProvider.getInstance());

	getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));

	final Table table = getTable();
	table.setHeaderVisible(true);
	table.setLinesVisible(true);
    }

    private void createColumns() {
	TableViewerColumn colName = new TableViewerColumn(this, SWT.NONE);
	colName.getColumn().setWidth(200);
	colName.getColumn().setText(COLHEADER_NAME);
	colName.setLabelProvider(new ColumnLabelProvider() {
	    @Override
	    public String getText(Object element) {
		IParameter p = (IParameter)element;
		return p.getName();
	    }
	});
	colName.setEditingSupport(new NameEditingSupport(this));

	TableViewerColumn colValue = new TableViewerColumn(this, SWT.NONE);
	colValue.getColumn().setWidth(200);
	colValue.getColumn().setText(COLHEADER_VALUE);
	colValue.setLabelProvider(new ColumnLabelProvider() {
	    @Override
	    public String getText(Object element) {
		if (element instanceof LengthParamenter) {
		    if (((LengthParamenter)element).getValue() == null)
			return StringConstants.EMPTY;
		    else
			return ((LengthParamenter)element).getValue().toString();
		}
		return element.toString();
	    }
	});

	TableViewerColumn colUnit = new TableViewerColumn(this, SWT.NONE);
	colUnit.getColumn().setWidth(200);
	colUnit.getColumn().setText(COLHEADER_UNIT);
	colUnit.setLabelProvider(new ColumnLabelProvider() {
	    @Override
	    public String getText(Object element) {
		if (element instanceof LengthParamenter) {
		    if (((LengthParamenter)element).getUnit() == null)
			return StringConstants.EMPTY;
		    else
			return ((LengthParamenter)element).getUnit().toString();
		}
		return element.toString();
	    }
	});
    }
}
