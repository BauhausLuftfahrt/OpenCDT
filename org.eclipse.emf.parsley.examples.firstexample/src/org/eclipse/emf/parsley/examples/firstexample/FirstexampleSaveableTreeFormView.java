package org.eclipse.emf.parsley.examples.firstexample;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Button;

public class FirstexampleSaveableTreeFormView extends org.eclipse.emf.parsley.views.SaveableTreeFormView {
	
	private Button button;
	
	public FirstexampleSaveableTreeFormView(Button b){
		button = b;	
	}
	
	@Execute
	public void addButton(Button b){
		
		System.out.println("Best");
		
		
	}
}
