package org.eclipse.emf.parsley.examples.firstexample;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class AddButton extends FormControlFactory{
	
	//private Button button;
	private Browser browser;

	
	public AddButton(Button buttonOpen, Button buttonSet, final String path, final Text text){
		
		//this.button = bu;
		System.out.println("BEST AddButton ");
	
		if(text.getText().equals("")){
			
			
			text.setEditable(true);
    		Device device = Display.getCurrent();
    		text.setBackground(null);
    		text.setEnabled(true);
			
			
		}else{

			text.setEditable(false);
    		Device device = Display.getCurrent ();
    		Color grey = new Color (device, 224, 224, 224);
    		text.setBackground(grey);
    		text.setEnabled(false);
    		System.out.println("text" + text.getText());
		}
		
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
            		Device device = Display.getCurrent ();
            		Color grey = new Color (device, 224, 224, 224);
            		text.setBackground(grey);
            		text.setEnabled(false);
            		
            	}
            	else if(!text.getEditable()){
            		text.setEditable(true);
            		Device device = Display.getCurrent();
            		text.setBackground(null);
            		text.setEnabled(true);
            		

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
