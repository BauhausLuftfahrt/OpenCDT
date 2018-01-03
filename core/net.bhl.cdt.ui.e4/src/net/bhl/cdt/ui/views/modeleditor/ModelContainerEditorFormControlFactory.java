package net.bhl.cdt.ui.views.modeleditor;

import org.eclipse.emf.parsley.composite.FormControlFactory;

public class ModelContainerEditorFormControlFactory extends FormControlFactory {
    
//    public Control control_IDataEntity_id(IObservableValue<?> source, EStructuralFeature f) {
//	Label valueLabel = new Label(getParent(), SWT.NONE);
//	bindValue(f, DatabindingUtil.observeText(valueLabel), source);
//	return valueLabel;
//    }
//    
//    public Control control_IDataEntity_parameters(final IDataEntity dataEntity) {
//	Injector injector = ViewInjectorProvider.getInjector();
//
//	ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
//	TableViewer tableViewer = viewerFactory.createTableViewer(getParent(), SWT.NONE, DataPackage.eINSTANCE.getIParameter());
//	tableViewer.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
//	
////	CDTParameterTableViewer viewer = new CDTParameterTableViewer(getParent());
////	
////	viewer.setInput(dataEntity.getParameters());
////
////	return viewer.getControl();
//	
//	viewerFactory.initialize(tableViewer, dataEntity.getParameters());
//	
//	return tableViewer.getControl();
//    }
//    
//    public Control control_DistanceParameter_value(IObservableValue<?> source, EStructuralFeature f) {
//	Composite c = new Composite(getParent(), SWT.NONE);
//	GridLayout layout = new GridLayout(2, false);
//	layout.horizontalSpacing = 1;
//	layout.marginWidth = 0;
//	
//	c.setLayout(layout);
//	
//	Text inputText = new Text(c, SWT.BORDER);
//	GridData gridData = new GridData();
//	gridData.horizontalAlignment = SWT.FILL;
//	gridData.grabExcessHorizontalSpace = true;
//	inputText.setLayoutData(gridData);
//	
//	ComboViewer combo = new ComboViewer(c, SWT.READ_ONLY);
//	gridData = new GridData();
//	gridData.widthHint = 40;
//	combo.getCombo().setLayoutData(gridData);
//	
//	combo.setContentProvider(ArrayContentProvider.getInstance());
//	combo.setLabelProvider(new LabelProvider() {
//	    @Override
//	    public String getText(Object element) {
//	        if (element instanceof Unit<?>) {
//	            Unit<?> unit = (Unit<?>)element;
//	            return unit.getSymbol();
//	        }
//	        
//	        return super.getText(element);
//	    }
//	});
//	
//	combo.setInput(MetaModelInstancesProvider.getInstance().getDistanceQuantity().getUnits());
//
//	return c;
//    }
}
