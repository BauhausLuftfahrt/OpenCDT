package net.bhl.cdt.ui.views.modeleditor.controls;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;

import model.science.IQuantifiedParameter;
import model.science.Unit;
import model.science.parameter.DateParameter;
import net.bhl.cdt.model.provider.MetaModelInstancesProvider;

/**
 * 
 * @author Michael.Shamiyeh
 * @since 2017-09-25
 *
 */
public class UnitEditingSupport extends EditingSupport {
    private final ColumnViewer viewer;
    private final ComboBoxViewerCellEditor editor;
    
    public UnitEditingSupport(TableViewer viewer) {
	super(viewer);
        this.viewer = viewer;
        this.editor = new ComboBoxViewerCellEditor(viewer.getTable());
        this.editor.setContentProvider(ArrayContentProvider.getInstance());
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
	if (element instanceof DateParameter)
	    editor.setInput(MetaModelInstancesProvider.getInstance().getDistanceQuantity().getUnits());
	return editor;
    }

    @Override
    protected boolean canEdit(Object element) {
	return true;
    }

    @Override
    protected Object getValue(Object element) {
	return ((IQuantifiedParameter<?>)element).getUnit();
    }

    @Override
    protected void setValue(Object element, Object value) {
	if (value != null && value instanceof Unit)
	    ((IQuantifiedParameter<?>)element).setUnit((Unit)value);
	
	viewer.update(element, null);
    }
}