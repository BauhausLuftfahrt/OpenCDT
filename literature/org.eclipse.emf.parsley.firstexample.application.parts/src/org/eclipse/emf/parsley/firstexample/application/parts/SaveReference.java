package org.eclipse.emf.parsley.firstexample.application.parts;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;

import partParsley.MyParts;

public class SaveReference {
	
	@Inject
	private EPartService partService;
	
	@Execute
	public void execute() {
	
		MyParts parts =  (MyParts) partService.getActivePart().getObject();
		parts.saveReference();
	}
	
	

}
