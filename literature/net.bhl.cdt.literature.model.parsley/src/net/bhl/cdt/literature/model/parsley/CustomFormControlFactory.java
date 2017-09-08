package net.bhl.cdt.literature.model.parsley;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import cdtliterature.ALiteratureBase;
import cdtliterature.Book;
import net.bhl.cdt.core.ui.UIHelper;

public class CustomFormControlFactory extends FormControlFactory {
	
	
	
	public Control control_ALiteratureBase_path(DataBindingContext dbc, IObservableValue featureObservable) {
		
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    /**
	     * this layout is set for text, three buttons.
	     * */
	    GridLayout _gridLayout = new GridLayout(4, false);
	    composite.setLayout(_gridLayout);
	    _gridLayout.marginLeft = -5;
	    
	    
	    /**
		 * text is filled in grid-layout*/
		Text pathText = getToolkit().createText(composite, " ", SWT.SINGLE);
		GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        pathText.setLayoutData(gridData);
		pathText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		
		/**
		 * custom buttons*/
		final Button openButton = _toolkit.createButton(composite, "open file", SWT.PUSH);
		final Button folderButton = _toolkit.createButton(composite, "open folder", SWT.PUSH);
	    final Button setButton = _toolkit.createButton(composite, "set", SWT.PUSH);
	   
		/**
		 * Binding the control to the feature observable.
		 * */
		dbc.bindValue(SWTObservables.observeText(pathText, SWT.Modify), featureObservable);
		
		/**
		 * each function of button is implemented.
		 * */
		parsleyCustomButton( openButton, folderButton, setButton, pathText, _parent);
		
	    return composite;
	}
	private void parsleyCustomButton(Button buttonOpen, Button buttonFolder, Button buttonSet, Text pathText, Composite _parent){

		/**
		 * the text of path is empty.*/
		if(pathText.getText().equals("")){
			
			pathText.setEditable(true);
    		pathText.setBackground(null);
    		pathText.setEnabled(true);
			
    	/**
    	 * the text of path is not empty, then at first it could not editable.*/	
		}else{

			pathText.setEditable(false);
    		Device device = Display.getCurrent ();
    		Color grey = new Color (device, 224, 224, 224);
    		pathText.setBackground(grey);
    		pathText.setEnabled(false);
    		
		}
		
		/**
		 * After click, it tries to open the file.*/
        buttonOpen.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	/**
            	 * the text of path is not empty.*/
            	if(!pathText.getText().equals("")){
            	
	            	File file = new File(pathText.getText());
	            	/**
	            	 * it checks whether the file exists really in the path.*/  
	            	if(file.exists()){
	            		
		            	try {
		            		/**
		            		 * the file is being open*/
		            		Desktop.getDesktop().open(new File(pathText.getText()));
		            		
		            	} catch (MalformedURLException e1) {
		            	    e1.printStackTrace();
		            	} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		            /**
		             * if the file is not exists, then it warns to the user*/	
            	    }else{
            	    	
            	    	MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(), "Error", null,
            	    		    "The File does't exist.",  MessageDialog.ERROR, new String[] { "OK" }, 0);
            	    	dialog.open();

            	    }

            	}
            }
        });
        
        /**
         * the user can make the path of file to set editable or not*/  
        buttonSet.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	String address = pathText.getText();
            	boolean notAddress =  address.equals("");
            	
            	if(!notAddress & pathText.getEditable()){
            		
            		pathText.setEditable(false);
            		Device device = Display.getCurrent ();
            		Color grey = new Color (device, 224, 224, 224);
            		pathText.setBackground(grey);
            		pathText.setEnabled(false);
	
            	}

            	else if(!pathText.getEditable()){
            		pathText.setEditable(true);

            		pathText.setBackground(null);
            		pathText.setEnabled(true);

            	}

            }
        });
        /**
         * the user can open the folder in system and choose the file, then the path of file is saved.*/
        buttonFolder.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
            	String filePath = UIHelper.showSelectFileDialog(Display.getCurrent().getActiveShell());
            
            	if(filePath != null){
            		pathText.setText(filePath);
            		Device device = Display.getCurrent ();
            		Color grey = new Color (device, 224, 224, 224);
            		pathText.setBackground(grey);
            		pathText.setEnabled(false);
            		pathText.setEditable(false);
            		
            	}
           
            }
        });

		
	}
	

}
