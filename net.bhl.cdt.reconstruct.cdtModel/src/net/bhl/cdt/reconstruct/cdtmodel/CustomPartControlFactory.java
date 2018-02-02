package net.bhl.cdt.reconstruct.cdtmodel;

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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class CustomPartControlFactory extends FormControlFactory {
	
	
	
public Control control_ALiteratureBase_path(DataBindingContext dbc, IObservableValue featureObservable) {
		
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    /**
	     * this layout is set for text, three buttons.
	     * */
	    GridLayout _gridLayout = new GridLayout(2, false);
	    composite.setLayout(_gridLayout);
	    _gridLayout.marginLeft = -5;
	    
	    
	    /**
		 * text is filled in grid-layout*/
		Text pathText = getToolkit().createText(composite, " ", SWT.READ_ONLY);
		GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        pathText.setLayoutData(gridData);
		pathText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		
		/**
		 * custom buttons*/
		final Button openButton = _toolkit.createButton(composite, "open file", SWT.PUSH);
		
		/**
		 * Binding the control to the feature observable.
		 * */
		dbc.bindValue(SWTObservables.observeText(pathText, SWT.Modify), featureObservable);
		
		/**
		 * each function of button is implemented.
		 * */
		
		parsleyCustomButton( openButton,pathText, _parent);
	    return composite;
	}
private void parsleyCustomButton(Button buttonOpen,Text pathText, Composite _parent){
	/**
	 * the text of path is empty.*/
	if(pathText.getText().equals("")){
		
		pathText.setEditable(true);
		pathText.setBackground(null);
		pathText.setEnabled(true);
		
	/**
	 * the text of path is not empty, then at first it could not editable.*/	
	}else{

		Device device = Display.getCurrent ();
		Color grey = new Color (device, 224, 224, 224);
		
		
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
    
   
	
}
private Composite setReadOnlyText(DataBindingContext dbc, IObservableValue featureObservable){
	
	FormToolkit _toolkit = this.getToolkit();
    Composite _parent = this.getParent();
    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
    
    GridLayout _gridLayout = new GridLayout(1, false);
    composite.setLayout(_gridLayout);
    _gridLayout.marginLeft = -5;
	Text pathText = getToolkit().createText(composite, " ", SWT.READ_ONLY);
	
	GridData gridData = new GridData();
    gridData.horizontalAlignment = GridData.FILL;
    gridData.grabExcessHorizontalSpace = true;
    pathText.setLayoutData(gridData);
    dbc.bindValue(SWTObservables.observeText(pathText, SWT.Modify), featureObservable);
	
	return composite;
	
}
public Control control_ALiteratureBase_title(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_author(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_year(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_journal(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_publisher(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_isbn(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_booktitle(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_school(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_institution(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}
public Control control_ALiteratureBase_note(DataBindingContext dbc, IObservableValue featureObservable) {
	return setReadOnlyText(dbc, featureObservable);
}

}
