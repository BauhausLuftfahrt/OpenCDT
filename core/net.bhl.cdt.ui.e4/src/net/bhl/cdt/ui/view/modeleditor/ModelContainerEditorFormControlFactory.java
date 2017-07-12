package net.bhl.cdt.ui.view.modeleditor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import model.data.IDataEntity;
import net.bhl.cdt.ui.view.modeleditor.controls.CDTParameterTableViewer;

public class ModelContainerEditorFormControlFactory extends FormControlFactory {
    
    public Control control_IDataEntity_id(IObservableValue<?> source, EStructuralFeature f) {
	Label valueLabel = new Label(getParent(), SWT.NONE);
	bindValue(f, DatabindingUtil.observeText(valueLabel), source);
	return valueLabel;
    }
    
    public Control control_IDataEntity_parameters(final IDataEntity dataEntity) {
	//Composite c = new Composite(getParent(), SWT.NONE);
	
	CDTParameterTableViewer viewer = new CDTParameterTableViewer(getParent());
	
	viewer.setInput(dataEntity.getParameters());

	return viewer.getControl();
    }
}
