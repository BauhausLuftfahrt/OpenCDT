package net.bhl.cdt.reconstruct.cdtmodel;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.inject.Inject;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.internal.ui.model.TreeContentProvider;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.jface.databinding.swt.SWTObservables;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.TwoPaneElementSelector;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.google.inject.Injector;

import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import formula.Formula;
import formula.FormulaPackage;
import net.bhl.cdt.core.ui.UIHelper;
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
	
	private Image image;
	private Image newimage;
	private ImageData imageData;
	private int newWidth;
	private int newHeight;
	private  Canvas canvas;
	private GridData gd;
	private static final String EMPTY = "";
	private static final int STANDARD_HEIGHT = 50;
	private static final int STANDARD_WIDTH = 300;
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	
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
				 * check,whether the textbox of the latexformel is empty.
				 */
				String latexFormel = latexString.getText();
				
				System.out.println("latexFormel : " + latexFormel);
				
				/**
				 * In case texbox of latexString is empty 
				 * */
				if(latexFormel == EMPTY){
					/**
					 * when the latexformel-string is empty, then the message-box pops up to warn.
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
       /* ImageData data = new ImageData("C://Users/sanghun.cho/Desktop/eclipse_image.png"); 
		image = new Image(Display.getCurrent(), data);*/
        canvas = new Canvas(composite, SWT.FILL);
        gd = new GridData();
        gd.widthHint = STANDARD_WIDTH;
        gd.heightHint = STANDARD_HEIGHT;
        canvas.setLayoutData(gd);
          
 
        FocusListener listener = new FocusListener() {
        	
            public void focusGained(FocusEvent event) {
                   	
            	//System.out.println("get Focus");      	
            }

			@Override
			public void focusLost(FocusEvent e) {
				
				String latexFormel = latexString.getText();		
				/**
				 * if the textbox of latex-formel is not empty, then it returns true value.
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
					 * the image is removed, if the textbox is of latex-formel empty.
					 */
					
				}
			}
		};
        latexString.addFocusListener(listener);

		return composite;
		
		
	
	}
	/*public Control control_Formula_reference(final Formula it) {
		//EList<EObject> _contents = re.getContents();
		//it.getReference().listIterator().toString()
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    Control [] control = _parent.getChildren();
	    
	    System.out.print("getReference : ");
	    System.out.print("control : " + control.length);
	    
	    
	    return null;
	  }*/
	public Control control_Formula_reference(DataBindingContext dbc, IObservableValue featureObservable) {
		
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    /**
	     * this layout is set for text, three buttons.
	     * */
	    GridLayout _gridLayout = new GridLayout(2, false);
	    composite.setLayout(_gridLayout);
	    //_gridLayout.marginLeft = -5;
	    
	    
	    /** 
		 * text is filled in grid-layout*/
		//Text pathText = getToolkit().createText(composite, "sanghun", SWT.SINGLE);
		FormText refText = _toolkit.createFormText(composite, true);
		//refText.setText("", false, false);
		//pathText.setText("Sanghun");
		GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        refText.setLayoutData(gridData);
		refText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
		final Button openButton = _toolkit.createButton(composite, "set", SWT.PUSH);
		//dbc.bindValue(SWTObservables.observeText(refText, SWT.Modify), featureObservable);
		
		 openButton.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	
	            	Shell shell = _parent.getShell();
	            	//String filePath = UIHelper.showSelectFileDialog(Display.getCurrent().getActiveShell());
	            	
	            	/*Injector injector = ParsleyInjectorProvider.getInjector();

	        		*//**
	        		 * The EditingDomain is needed for context menu and drag and drop.*//*
	        		ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
	        		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
	        		*//**
	        		 * load the resource*//*
	        		Resource resource = resourceLoader.getResource(editingDomain, uri).getResource();
	        		Library library = (Library) resource.getContents().get(0);*/
	        		//library.getArticle().stream()
	        		
	        		//library.getConference();
	            	/*ElementListSelectionDialog dialog = 
	            			new ElementListSelectionDialog(Display.getCurrent().getActiveShell(), new LabelProvider());
	            		
	            		dialog.setTitle("Which operating system are you using");
	            		
	            		dialog.setMessage("This is Element List Message");
	            		Object [] list =  { "Linux" };
	            		dialog.setMultipleSelection(true);
	            		dialog.setElements(list);
	            		//dialog.setInitialSelections(list);
	            		
	            		if (dialog.open() != Window.OK) {
	            		        //return false;
	            			System.out.print("Sanghun");
	            		}
	            		Object[] result = dialog.getResult();*/
	        		
	        		/*TwoPaneElementSelector elementSelector = new TwoPaneElementSelector(shell, new LabelProvider(), new LabelProvider());
	        	    elementSelector.setTitle("Two Pane Element Selector");
	        	    elementSelector.setElements(new String[] {"One", "Two", "Three"});
	        	    elementSelector.setLowerListLabel("Lower List");
	        	    elementSelector.setUpperListLabel("Upper List");
	        	    elementSelector.setMultipleSelection(true);
	        	    elementSelector.setInitialSelections(new String[] {"One", "Two", "Three"});
	        	    elementSelector.open();*/
	            	
	            	
	        		ReferenceDialog refDialog = new ReferenceDialog(shell); 
	        		
	        	    //refDialog.open();
	        	    if (refDialog.open() == Window.OK) {
	        	    	
	        	    	System.out.println("OK");
	        	    	refText.setText(refDialog.getSelectedItem(), false, false);
	        	    }
	        	    
	        	    
	        	    //refText.setText("Sanghun", false, false);
	        	    /*String[] strArray = new String[choice.length];

	        	    for(int i = 0 ; i < choice.length ; i ++){  
	        	    	   try {
	        	    	      strArray[i] = choice[i].toString();
	        	    	   } catch (NullPointerException ex) {
	        	    	       // do some default initialization
	        	    	   }
	        	    	} */	
	        	    //refText.setText(Arrays.toString(strArray), false, false); 
        		 	    
	           
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
