/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.views.modeleditor.controls;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import model.science.IQuantifiedParameter;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-11
 *
 */
public class ValueEditingSupport extends EditingSupport {
    private final TableViewer viewer;
    private final CellEditor editor;

    public ValueEditingSupport(TableViewer viewer) {
        super(viewer);
        this.viewer = viewer;
        
        TextCellEditor cellEditor =  new TextCellEditor(viewer.getTable());
        cellEditor.setValidator(new ICellEditorValidator() {
	    @Override
	    public String isValid(Object value) {
		try {
		    Double.parseDouble((String)value);
		    return null;
		} catch (NumberFormatException ex) {
		    return ex.getMessage();
		}
	    }
	});
        
        this.editor = cellEditor;
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
        return editor;
    }

    @Override
    protected boolean canEdit(Object element) {
        return true;
    }

    @Override
    protected Object getValue(Object element) {
        return String.valueOf(((IQuantifiedParameter<?>)element).getValue());
    }

    @Override
    protected void setValue(Object element, Object userInputValue) {
        ((IQuantifiedParameter<?>)element).setValue(Double.parseDouble((String)userInputValue));
        viewer.update(element, null);
    }
}
