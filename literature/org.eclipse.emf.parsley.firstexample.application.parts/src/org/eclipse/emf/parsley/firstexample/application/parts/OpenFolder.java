package org.eclipse.emf.parsley.firstexample.application.parts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import partParsley.MyParts;

public class OpenFolder {
	
	
	@Inject
	private EPartService partService;
	//private DirectoryDialog dialog;
	private FileDialog dialog;

	@Execute
	public void execute() {
		
		MyParts parts =  (MyParts) partService.getActivePart().getObject();
		parts.openReference();
	
		
		/*dialog = new DirectoryDialog(Display.getCurrent().getActiveShell(), SWT.OPEN
			          | SWT.MULTI);
			  dialog.setText("Select the local file or directory to upload");
			  dialog.setFilterPath(System.getProperty("user.home") + "/workspace/reference");
			  String dirName = dialog.open();*/
			  /*final File dir = new File(dirName);
			  List<File> files = new ArrayList<File>();
			  files.add(dir);*/		
		
		
		  dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN
		          | SWT.MULTI);
		  dialog.setText("Select the local file or directory to upload");
		  dialog.setFilterPath(System.getProperty("user.home") + "/workspace/reference");
		  String dirName = dialog.open();

	}

}
