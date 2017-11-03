package net.bhl.cdt.reconstruct.cdtmodel;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MCompositePart;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.application.e4.editor.E4ModelElementOpener;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.ui.model.TreeContentProvider;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.ui.e4.util.EPartServiceHelper;
import org.eclipse.emf.ecp.ui.e4.view.ECPModelView;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.parsley.composite.EObjectTextObservable;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.TwoPaneElementSelector;
import org.eclipse.ui.forms.HyperlinkGroup;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.internal.Model;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.google.inject.Guice;
import com.google.inject.Injector;

import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import formula.Formula;
import formula.FormulaPackage;
import net.bhl.cdt.core.ui.UIHelper;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconsruct.parsley.e4.CDTLibraryModelEditor;
import net.bhl.cdt.reconstruct.cdtliteratureeditor.CdtliteratureeditorInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableInjectorProvider;
import net.sourceforge.jeuclid.MathMLParserSupport;
import net.sourceforge.jeuclid.MutableLayoutContext;
import net.sourceforge.jeuclid.context.LayoutContextImpl;
import net.sourceforge.jeuclid.context.Parameter;
import net.sourceforge.jeuclid.converter.Converter;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;

public class CustomFormControlFactory extends FormControlFactory {
	
	//private Image image;
	private Image newimage;
	private ImageData imageData;
	private int newWidth;
	private int newHeight;
	private  Canvas canvas;
	private GridData gd;
	private static final String EMPTY = "";
	private static final int STANDARD_HEIGHT = 50;
	private static final int STANDARD_WIDTH = 300;
	//private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	private ReferenceDialog treeColumnDialog;
	private Hyperlink hyperlink;
	private MPart part; 
	
	public Control control_Formula_latexString(DataBindingContext dbc, IObservableValue featureObservable) {
	
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    
	    GridLayout _gridLayout = new GridLayout(2, false);
	    composite.setLayout(_gridLayout);
	    _gridLayout.marginLeft = -5;
	    
	    Text latexString = getToolkit().createText(composite, " ", SWT.BORDER);
		GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        latexString.setLayoutData(gridData);
		latexString.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		dbc.bindValue(SWTObservables.observeText(latexString, SWT.Modify), featureObservable);
		
		final Button showButton = _toolkit.createButton(composite, "show", SWT.PUSH);
		/**
		 * After click, it tries to open the file.*/
        showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * Check,whether the textbox of the latexformel is empty.
				 */
				String latexFormel = latexString.getText();
				
				System.out.println("latexFormel : " + latexFormel);
				
				/**
				 * In case texbox of latexString is empty 
				 * */
				if(latexFormel == EMPTY){
					/**
					 * When the latexformel-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
										
						try {
							createNewImage(latexFormel, composite);
						} catch (SAXException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ParserConfigurationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}					
				}	
					
			}
		}); 
		

		/**
		 * each function of button is implemented.
		 * */
        canvas = new Canvas(composite, SWT.FILL);
        gd = new GridData();
        gd.widthHint = STANDARD_WIDTH;
        gd.heightHint = STANDARD_HEIGHT;
        canvas.setLayoutData(gd);
          
 
        FocusListener listener = new FocusListener() {
        	
            public void focusGained(FocusEvent event) {
                   	
            }

			@Override
			public void focusLost(FocusEvent e) {
				
				String latexFormel = latexString.getText();		
				/**
				 * If the textbox of latex-formel is not empty, then it returns true value.
				 */
				
				if(latexFormel != EMPTY){
					try {				
						
						createNewImage(latexFormel, composite);
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SAXException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParserConfigurationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					/**
					 * The image is removed, if the textbox is of latex-formel empty.
					 */
					
				}
			}
		};
        latexString.addFocusListener(listener);

		return composite;
		
	}
	public Control control_Formula_reference(DataBindingContext dbc, IObservableValue featureObservable) {
		
		//Injector injector = CdtliteratureeditorInjectorProvider.getInjector();
		
		/**The base elements are set for customized reference.*/
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    
	    /**
	     * The gridlayout consist of hyperlink, set-button, delete-button.*/
	    GridLayout _gridLayout = new GridLayout(3, false);
	    composite.setLayout(_gridLayout);
	       
	    hyperlink = _toolkit.createHyperlink(composite, featureObservable.getValue().toString(), SWT.NONE);
	    
	    /**The action for click of this hyperlink und let open and show the model of hyperlink.*/
	    hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
	    	
			public void linkActivated(HyperlinkEvent e) {
				
				String featureObsString;
				EPartService partService = EPartServiceHelper.getEPartService();
				
				/**This checks whether the parameter-featureObservale has the certain reference*/ 
				if(featureObservable.getValue().toString() == ""){
					/**featureObservable didn't save the reference.*/
					featureObsString = "";

				}else{
					/**The featureObservable has the certain reference of library.*/
					featureObsString = featureObservable.getValue().toString();
				}
				
				/**It is regarded at first that the part of model is not opened and not visible.*/
				Boolean partVisible = false;
				
				/**Before opening the part for model let check whether this part already is opened by click of hyperlink.*/
				if(!featureObsString.isEmpty()){
						
					/**Let gather all parts*/
					Collection<MPart> collPart = partService.getParts();
					
					for( Iterator<MPart> iterator = collPart.iterator(); iterator.hasNext();){
				        /**the label of already opened part is compared with the saved featureObsString-value*/ 
						if(iterator.next().getLabel().equals(featureObsString)){
								
							    /**the part of model is already opened*/
								partVisible = true;							
								break;
							
							}
					}
					
					/**the part of model is not yet opened*/
					if(!partVisible){
						
						/**the new part is created*/
						part = MBasicFactory.INSTANCE.createPart();
						part.setElementId(featureObsString);
						part.setLabel(featureObsString);
						part.setCloseable(true);
						/**the new part is depicted as this linked class*/
						part.setContributionURI("bundleclass://net.bhl.cdt.reconstruct.cdtModel/net.bhl.cdt.reconsruct.parsley.e4.CDTLibraryModelEditor");
						
						partService.showPart(part, PartState.CREATE);
						partService.bringToTop(part);
					}
			  }
			}//end linkActivated-clause
		});

	    /**this griddata makes the hyperlink to locate on the left of composite of customized reference*/
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;
        gridData.grabExcessHorizontalSpace = true;
        gridData.minimumWidth = 150;
	    hyperlink.setLayoutData(gridData);
        
	    /**If user clicks the set-button, then the tree-columns-dialog can be opened*/ 
        final Button setButton = _toolkit.createButton(composite, "set", SWT.PUSH); 
		setButton.addSelectionListener(new SelectionAdapter() {
			
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	            
	            	Shell shell = new Shell(_parent.getShell(), SWT.DIALOG_TRIM
	            	        | SWT.APPLICATION_MODAL);
	            	
	            	treeColumnDialog = new ReferenceDialog(shell, _toolkit);
	            	treeColumnDialog.isResizable();
	            
	        		 		
	        	    if (treeColumnDialog.open() == Window.OK) {
	        	    
	        	    	if(!treeColumnDialog.getLiteratureTitle().equals("")){
	        	    		
	        	    		String categoryOfLiteratre = treeColumnDialog.getLiteratureObjName();
	    	        		String titleOfLiteratue = treeColumnDialog.getLiteratureTitle();
	    	        		
	        	    		hyperlink.setEnabled(true);
	        	    		hyperlink.setText(categoryOfLiteratre + " " + titleOfLiteratue);
		        	    	
	        	    		/**the category and title of selected model can be saved*/
		        	    	featureObservable.setValue(categoryOfLiteratre + " " + titleOfLiteratue);
		        	    	        	    	
	        	    	}
	        	    	
	        	    }        	    
	        	    composite.forceFocus();        	    
	            }
	           
	        });
		   
		/**If user clicks the delete-button, then the hyperlink of model is deleted*/ 
        final Button deleteButton = _toolkit.createButton(composite, "delete", SWT.PUSH);  
		deleteButton.addSelectionListener(new SelectionAdapter() {
			
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	            
	            	Shell shell = new Shell(_parent.getShell(), SWT.DIALOG_TRIM
	            	        | SWT.APPLICATION_MODAL);
	            	/**Before this is deleted,the dialog is opened and it asks about the deletion.*/ 
	            	MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
	            		dialog.setText("Question");
	            		dialog.setMessage("Do you really want to delete this?");
	            		
	            		if(dialog.open() == SWT.OK){
	            			hyperlink.setText(EMPTY);
	    	            	hyperlink.setEnabled(false);
	    	            	featureObservable.setValue(EMPTY);
	            		}
	            		
	            }
	    });

		return composite;
		
	  }
	
	private void parsleyCustomButton(Button buttonShow, Text latexString, Composite _parent){

	
		/**
		 * After click, it tries to open the file.
		 * */
        buttonShow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * check,whether the textbox of the latexformel is empty.
				 */
				String latexFormel = latexString.getText();
				/**
				 * In case texbox of latexString is empty 
				 * */
				if(latexFormel == EMPTY){
					/**
					 * when the latexformel-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
					
				}
		
			}
		});       
      	
	}
	private void createNewImage(String latexFormel, Composite composite) throws SAXException, ParserConfigurationException, IOException {
		
	    
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(latexFormel);
		session.getConfiguration().setFailingFast(true);
		
		 if (session.parseInput(input) == false){
				
				MessageBox messageBox = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		        
		        messageBox.setText("Warning");
		        messageBox.setMessage(session.getErrors().toString());
		        messageBox.open();
		        
				System.out.println("Error : " + session.getErrors().toString());
			}
		   	/**
	 	   	 * the string of latex-formel is converted into xml-string.
	 	   	 */
			else{
					
		 	    String xmlString = session.buildXMLString();
						
		 	    final Document document = MathMLParserSupport.parseString(xmlString);
		 	   
		 	    final File outFile = new File("test.png");
		 	    
		 	    final MutableLayoutContext params = new LayoutContextImpl(LayoutContextImpl.getDefaultLayoutContext());
		 	     
		 	    params.setParameter(Parameter.MATHSIZE, 25f);
		 	   
		 	    Converter.getInstance().convert(document, outFile, "image/" + "png", params);
		 	    
		 		byte[] uploadedImg = null;
	 		 
		 		try {
		 			
		
		 			double fileLen = outFile.length();
		 		    uploadedImg = new byte[(int) fileLen];
		 		    FileInputStream inputStream = new FileInputStream(outFile);

		 		    int nRead = 0;
		 		    
		 		    while ((nRead = inputStream.read(uploadedImg)) != -1) {
		 		    }
		 		    
		 		    inputStream.close();

		 		} catch (Exception e2) {
		 		    // TODO: handle exception
		 		}
		 		/**
		 		 * the xml-string is converted into the image file.
		 		 */
		 		BufferedInputStream inputStreamReader = new BufferedInputStream(new ByteArrayInputStream(uploadedImg));
		 		
		 		imageData = new ImageData(inputStreamReader);	
		 		newimage = new Image(Display.getCurrent(), imageData);
	 		
		 		newWidth = newimage.getBounds().width;
		 		newHeight = newimage.getBounds().height;
	 		
		 		canvas.addPaintListener(new PaintListener() {
					  public void paintControl(PaintEvent e) {
						
				 		gd.widthHint = newWidth;
					    gd.heightHint = STANDARD_HEIGHT;
				        canvas.setLayoutData(gd);
				        
				        if(newHeight <= STANDARD_HEIGHT){
				        	canvas.setSize(newWidth, STANDARD_HEIGHT);
				        }else{
				        	canvas.setSize(newWidth, newHeight);
				        }
				      
					    e.gc.drawImage(newimage, 0, 0);		
				 		canvas.update();
					
					  }
				});
		 		canvas.redraw();
		 		canvas.update();
		 		

			}
	}
	/**
	 * if the latex-formel is empty and the show-button is clicked, then dialog window is opened to warn.
	  */
	private void openLatexMessageBox(){
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		messageBox_empty.setMessage("Latex String is empty");
        messageBox_empty.open();
		
	}
}
