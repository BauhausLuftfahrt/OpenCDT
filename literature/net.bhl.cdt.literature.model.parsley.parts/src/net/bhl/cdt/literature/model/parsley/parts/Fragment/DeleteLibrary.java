package net.bhl.cdt.literature.model.parsley.parts.Fragment;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.internal.ui.model.ModelContentProvider;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.ui.common.ECPViewerFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import net.bhl.cdt.literature.model.parsley.parts.MyParts.MyParts;

public class DeleteLibrary {
	
	
	
	@Inject
	private EPartService partService;
	private ESelectionService selectionService;

	@Execute
	public void execute() {
		
		MyParts parts =  (MyParts) partService.getActivePart().getObject();
		parts.deleteLibrary(selectionService);
		

	}

}
