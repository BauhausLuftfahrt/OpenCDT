package net.bhl.cdt.ui.e4.parts.modeleditor;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import model.science.IDataEntity;
import model.science.IParameter;
import model.science.SciencePackage;
import net.bhl.cdt.ui.e4.E4ResourceIds;
import net.bhl.cdt.ui.view.modelelementeditorview.ModelelementeditorviewInjectorProvider;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-09-26
 * 
 */
public class ModelElementEditorPart {
    @PostConstruct
    public void postConstruct(Composite parent, MPart elementEditorPart, ESelectionService selectionService) {
	Injector injector = ModelelementeditorviewInjectorProvider.getInjector();

	ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
	TableViewer tableViewer = viewerFactory.createTableViewer(parent, SWT.NONE, SciencePackage.eINSTANCE.getIQuantifiedParameter());
	tableViewer.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
	
	selectionService.addSelectionListener(E4ResourceIds.PARTDESCRIPTOR_MODELEDITOR_ID, new ISelectionListener() {
	    @Override
	    public void selectionChanged(MPart part, Object selection) {
		tableViewer.setInput(null);
		
		if (selection instanceof IDataEntity) {
		    elementEditorPart.setLabel(((IDataEntity)selection).getName() + " (" + selection.getClass().getSimpleName() + ")");
		    for (IParameter p : ((IDataEntity)selection).getParameters())
			tableViewer.add(p);
		}
	    }
	});
    }
}
