/*package org.eclipse.emf.parsley.firstexample.application.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import partParsley.MyParts;

public class AddButton extends FormControlFactory{
	
	private AddButton bu;
	
	
	public AddButton(){
		bu = new AddButton();
		
	}
	public void addButton(Button b){
		
		
	}

	//@Inject
	//private Button button;
	 
	private MDirtyable dirty;
	private EPartService partService;
	private EModelService modelService;
	@Named("Name") String perspectiveId;

	@Execute
	public void execute() {
		
		//MyParts parts =  (MyParts) partService.getActivePart().getObject();
		//parts.addButton(text);

		//System.out.println("add library");
		

	}
	
	public AddButton getAddButton(){
		
		return bu;
	}
	


}
*/