package org.eclipse.emf.parsley.firstexample.application.parts;


import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import partParsley.MyParts;




public class AddLibrary {
	
	
	@Inject
	private EPartService partService;

	@Execute
	public void execute() {
		
		MyParts parts =  (MyParts) partService.getActivePart().getObject();
		parts.addLibrary();

		//System.out.println("add library");
		

	}

// NOT REQUIRED IN THIS EXAMPLE
// just to demonstrates the usage of
// the annotation
	/*@CanExecute
	public boolean canExecute() {
	
		
	    return true;
	}*/
	
}