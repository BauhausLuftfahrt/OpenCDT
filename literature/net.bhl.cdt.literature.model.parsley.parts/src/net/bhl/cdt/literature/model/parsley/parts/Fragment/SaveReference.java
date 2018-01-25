package net.bhl.cdt.literature.model.parsley.parts.Fragment;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import net.bhl.cdt.literature.model.parsley.parts.MyParts.MyParts;

/**
 * it is called by saving library button in the toolbar*/
public class SaveReference {
	
	@Inject
	private EPartService partService;
	
	@Execute
	public void execute() {
	
		MyParts parts =  (MyParts) partService.getActivePart().getObject();
		parts.saveReference();
		
	}
}
