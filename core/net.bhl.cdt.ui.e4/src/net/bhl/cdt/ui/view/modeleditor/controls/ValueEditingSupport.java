/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.view.modeleditor.controls;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import model.data.IParameter;

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
        this.editor = new TextCellEditor(viewer.getTable());
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
        return ((IParameter)element).getName();
    }

    @Override
    protected void setValue(Object element, Object userInputValue) {
        ((IParameter)element).setName(String.valueOf(userInputValue));
        viewer.update(element, null);
    }
}
