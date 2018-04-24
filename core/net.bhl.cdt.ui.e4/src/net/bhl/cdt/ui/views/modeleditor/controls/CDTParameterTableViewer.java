/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.views.modeleditor.controls;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import model.science.IQuantifiedParameter;
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
	super(parent, SWT.FULL_SELECTION
		| SWT.H_SCROLL | SWT.V_SCROLL | SWT.HIDE_SELECTION | SWT.BORDER);
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
		IQuantifiedParameter<?> p = (IQuantifiedParameter<?>)element;
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
		if (element instanceof IQuantifiedParameter) {
		    return String.valueOf(((IQuantifiedParameter<?>)element).getValue());
		}
		return element.toString();
	    }
	});
	colValue.setEditingSupport(new ValueEditingSupport(this));

	TableViewerColumn colUnit = new TableViewerColumn(this, SWT.NONE);
	colUnit.getColumn().setWidth(200);
	colUnit.getColumn().setText(COLHEADER_UNIT);
	colUnit.setLabelProvider(new ColumnLabelProvider() {
	    @Override
	    public String getText(Object element) {
		if (element instanceof IQuantifiedParameter) {
		    if (((IQuantifiedParameter<?>)element).getUnit() == null)
			return StringConstants.EMPTY;
		    else
			return ((IQuantifiedParameter<?>)element).getUnit().toString();
		}
		return element.toString();
	    }
	});
	
	colUnit.setEditingSupport(new UnitEditingSupport(this));
    }
}
