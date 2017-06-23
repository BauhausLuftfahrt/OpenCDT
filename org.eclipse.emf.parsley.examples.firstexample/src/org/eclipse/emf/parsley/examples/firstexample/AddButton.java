package org.eclipse.emf.parsley.examples.firstexample;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class AddButton extends FormControlFactory{
	
	//private Button button;
	private Browser browser;

	
	public AddButton(Button buttonOpen, Button buttonSet, final String path, final Text text){
		
		//this.button = bu;
		System.out.println("BEST AddButton ");
	
		
        buttonOpen.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	System.out.println(path);
            	
            	
            	File file = new File(path);
            	try {
            		Desktop.getDesktop().open(new File(path));
            	} catch (MalformedURLException e1) {
            	    e1.printStackTrace();
            	} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

            }
        });
        
        buttonSet.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	if(text.getEditable()){
            		text.setEditable(false);
            	}
            	else if(!text.getEditable()){
            		text.setEditable(true);
            		

            	}

            }
        });

		
	}
	public void addButton(Button b){
		
		System.out.println("BEST");
	}

	//@Inject
	//private Button button;
	 
	/*private MDirtyable dirty;
	private EPartService partService;
	private EModelService modelService;
	@Named("Name") String perspectiveId;*/

	/*@Execute
	public void execute() {
		
		//MyParts parts =  (MyParts) partService.getActivePart().getObject();
		//parts.addButton(text);

		//System.out.println("add library");
		

	}*/
	
	
}
