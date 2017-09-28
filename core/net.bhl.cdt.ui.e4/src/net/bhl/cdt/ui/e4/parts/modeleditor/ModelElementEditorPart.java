package net.bhl.cdt.ui.e4.parts.modeleditor;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-09-26
 * 
 */
public class ModelElementEditorPart {
    @PostConstruct
    public void postConstruct(Composite parent, MPart part, ESelectionService selectionService) {
//	Injector injector = ViewInjectorProvider.getInjector();
//
//	ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
//	TableViewer tableViewer = viewerFactory.createTableViewer(parent, SWT.NONE, DataPackage.eINSTANCE.getIParameter());
//	tableViewer.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
//	
//	selectionService.addSelectionListener(new ISelectionListener() { // E4ResourceIds.PARTDESCRIPTOR_MODELEDITOR_ID, 
//	    @Override
//	    public void selectionChanged(MPart part, Object selection) {
//		if (selection instanceof IDataEntity) {
//		    viewerFactory.initialize(tableViewer, selection);
//		}
//	    }
//	});
    }
}
