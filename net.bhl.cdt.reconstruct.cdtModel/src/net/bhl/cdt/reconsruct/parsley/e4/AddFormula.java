package net.bhl.cdt.reconsruct.parsley.e4;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.swt.widgets.Shell;


public class AddFormula {
	
	
	
	
	/*@Execute
	public void execute(Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) @Optional ECPProject ecpProject) {
		if (ecpProject == null) {
			return;
		}
		ECPHandlerHelper.addModelElement(ecpProject, shell, true);
		
	}

	*//**
	 * Checks if the current selection is an {@link ECPProject}.
	 *
	 * @param ecpProject the current selection, if it is an {@link ECPProject} or null otherwise.
	 * @return if the current selection is an {@link ECPProject}
	 *//*
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional ECPProject ecpProject) {
		return ecpProject != null;
	}*/
}
