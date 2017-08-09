/*package net.bhl.cdt.literature.model.parsley;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;

import cdtliterature.CdtliteratureFactory;
import net.bhl.cdt.core.ui.UIHelper;

public class ParsleyCustomButton extends FormControlFactory{

//		private Browser browser;
		private Text text;
		//private String filePath;
	
		public ParsleyCustomButton(Button buttonOpen, Button buttonFolder, Button buttonSet, Text text, Composite _parent, String filePath){
			
			//this.filePath = filePath;
			this.text = text;
			
			if(text.getText().equals("")){
				
				
				text.setEditable(true);
//	    		Device device = Display.getCurrent();
	    		text.setBackground(null);
	    		text.setEnabled(true);
				
				
			}else{

				text.setEditable(false);
	    		Device device = Display.getCurrent ();
	    		Color grey = new Color (device, 224, 224, 224);
	    		text.setBackground(grey);
	    		text.setEnabled(false);
	    		
			}
			
	        buttonOpen.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	
	            	if(!text.getText().equals("")){
	            	
		            	File file = new File(text.getText());
		            	
		            	if(file.exists()){
		            		
			            	try {
			            		
			            		Desktop.getDesktop().open(new File(text.getText()));
			            		
			            	} catch (MalformedURLException e1) {
			            	    e1.printStackTrace();
			            	} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
	            	    }else{
	            	    	
	            	    	MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(), "Error", null,
	            	    		    "The File does't exist.",  MessageDialog.ERROR, new String[] { "OK" }, 0);
	            	    	dialog.open();

	            	    }

	            	}
	            }
	        });
        
	        buttonSet.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	
	            	String address = text.getText();
	            	boolean notAddress =  address.equals("");
	            	
	            	if(!notAddress & text.getEditable()){
	            		
	            		text.setEditable(false);
	            		Device device = Display.getCurrent ();
	            		Color grey = new Color (device, 224, 224, 224);
	            		text.setBackground(grey);
	            		text.setEnabled(false);
	            		System.out.println("A");	
		
	            	}
	            	//else if(!notAddress & !text.getEditable()){
	            	else if(!text.getEditable()){
	            		text.setEditable(true);
//	            		Device device = Display.getCurrent();
	            		text.setBackground(null);
	            		text.setEnabled(true);
	            		System.out.println("B");
	            	}

	            }
	        });
	        
	        buttonFolder.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	
	            	String filePath = UIHelper.showSelectFileDialog(Display.getCurrent().getActiveShell());
	            	if(filePath != null){
	            		text.setText(filePath);
	            		Device device = Display.getCurrent ();
	            		Color grey = new Color (device, 224, 224, 224);
	            		text.setBackground(grey);
	            		text.setEnabled(false);
	            		text.setEditable(false);
	            		
	            	}
	           
	            }
	        });

			
		}

}
*/