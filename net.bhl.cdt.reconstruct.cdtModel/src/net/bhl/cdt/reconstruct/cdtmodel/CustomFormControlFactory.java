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
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.application.e4.editor.E4ModelElementOpener;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPUtil;
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
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionProvider;
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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
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
import cdtliterature.ALiteratureBase;
import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.Quantity;
import net.bhl.cdt.core.ui.UIHelper;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconsruct.parsley.e4.CDTLibraryModelEditor;
import net.bhl.cdt.reconsruct.parsley.e4.CDTModelEditor;
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
	
	private int newWidth;
	private int newHeight;
	private int startHeight;
	private Image newimage;
	private ImageData imageData;
	private Canvas canvas;
	private GridData gd;
	private Hyperlink hyperlink;
	private MPart part; 
	private String hyperLinkStr;
	private Hyperlink hyperlink_output;
	private IObservableValue output_featureObservable;
	private IObservableValue input_featureObservable;
	private Composite inputParameter_composite;
	private ArrayList<Hyperlink> listOfHyperlink = new ArrayList<Hyperlink>();; 
	private ReferenceDialog treeColumnDialog;
	private static final String EMPTY = "";
	private static final String NOTHING_GENERATE_QUANTITY = "=";
	private static final int STANDARD_WIDTH = 300;

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
				 * Check,whether the textbox of the latexformula is empty.
				 */
				String latexformula = latexString.getText();
				
				System.out.println("latexformula : " + latexformula);
				
				/**
				 * In case textbox of latexString is empty 
				 * */
				if(latexformula == EMPTY){
					/**
					 * When the latexformula-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
										
						try {
							
							createNewImage(latexformula, composite, latexString);
							
							if(admittanceOfgenerating(latexformula)){
							
								generateQuantities(latexformula);
								
							}else{
								
								generateQuantities(NOTHING_GENERATE_QUANTITY);
							}
							/**
							 * remove the focus on showButton*/
							_parent.getShell().setFocus();
							
							
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
        /**
         * the initial size of formula-image is set in 60
         * */ 
        startHeight = 60;
        gd.heightHint = startHeight;
        
        canvas.setLayoutData(gd);
          
 
        FocusListener listener = new FocusListener() {
        	
            public void focusGained(FocusEvent event) {
                   	
            }

			@Override
			public void focusLost(FocusEvent e) {
				
				String latexformula = latexString.getText();		
				/**
				 * If the textbox of latex-formula is not empty, then it returns true value.
				 */
				
				if(latexformula != EMPTY){
					try {				
						createNewImage(latexformula, composite, latexString);
						
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
					 * The image is removed, if the textbox is of latex-formula empty.
					 */
					
				}
			}
		};
        latexString.addFocusListener(listener);
        
		return composite;
		
	}
	
	public Control control_Formula_reference(DataBindingContext dbc, IObservableValue featureObservable) {
		
		
		/**The base elements are set for customized reference.*/
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	   
	    
	    /**
	     * The gridlayout consist of hyperlink, set-button, delete-button.*/
	    GridLayout _gridLayout = new GridLayout(3, false);
	    composite.setLayout(_gridLayout);
	    hyperLinkStr = "";
	    
	    if (featureObservable.getValue() != null)
	    	hyperLinkStr = (((ALiteratureBase) featureObservable.getValue()).eClass().getName() +
	    			" " + ((ALiteratureBase)featureObservable.getValue()).getTitle());
	    
	    	
	    hyperlink = _toolkit.createHyperlink(composite, hyperLinkStr, SWT.NONE);
	    
	    hyperlink.setUnderlined(false);
	    
	    if (featureObservable.getValue() == null)
	    	hyperlink.setEnabled(false);	
	    
	    /**The action for click of this hyperlink und let open and show the model of hyperlink.*/
	    hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
	    	
			public void linkActivated(HyperlinkEvent e) {
				
				
				Boolean partVisible = false;
				EPartService partService = EPartServiceHelper.getEPartService();
				Collection<MPart> parts = partService.getParts();
				
				
				for ( Iterator<MPart> i = parts.iterator(); i.hasNext(); )
				{
					MPart partSearch = i.next();
					if (partSearch.isVisible()) {
						if(partSearch.getElementId().equals(featureObservable.getValue().toString())){
							partVisible = true;
		                	partService.activate(partSearch);
		                	break;
							 
		                 }
		    
		             }
		        }
				
				if(!partVisible){
					
					part = MBasicFactory.INSTANCE.createPart();
					part.setLabel(((ALiteratureBase) featureObservable.getValue()).eClass().getName() + 
							" " + ((ALiteratureBase)featureObservable.getValue()).getTitle());
				    part.setElementId(featureObservable.getValue().toString());
					part.setObject(featureObservable.getValue());
					part.setCloseable(true);
					part.setContributionURI("bundleclass://net.bhl.cdt.reconstruct.cdtModel/net.bhl.cdt.reconsruct.parsley.e4.CDTLibraryModelEditor");
					
					partService.showPart(part, PartState.CREATE);
					partService.bringToTop(part);
					
				}
				
				
		
			}//end linkActivated-clause
		});

	    /**
	     * this griddata makes the hyperlink to locate on the left of composite of customized reference.
	     * */
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;
        gridData.grabExcessHorizontalSpace = true;
        gridData.minimumWidth = 150;
	    hyperlink.setLayoutData(gridData);
        
	    /**
	     * If user clicks the set-button, then the tree-columns-dialog can be opened.
	     * */ 
        final Button setButton = _toolkit.createButton(composite, "set", SWT.PUSH); 
 
		setButton.addSelectionListener(new SelectionAdapter() {
			
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            	            
	            	Shell shell = new Shell(_parent.getShell(), SWT.DIALOG_TRIM
	            	        | SWT.APPLICATION_MODAL);
	            	
	            	treeColumnDialog = new ReferenceDialog(shell, _toolkit);
	            	treeColumnDialog.isResizable();
	            
	        		 		
	        	    if (treeColumnDialog.open() == Window.OK) {
	        	    	
	        	    	if(treeColumnDialog.getObject() != null){
	
	    	        		hyperlink.setEnabled(true);
	    	        		
	    	        		try{
	    	        			ALiteratureBase literatureObj = (ALiteratureBase)treeColumnDialog.getObject();
	    	        			EObject result = literatureObj;
			        	    	hyperlink.setText(result.eClass().getName() + " " + literatureObj.getTitle());
			        	    	featureObservable.setValue(treeColumnDialog.getObject());
		        	    		hyperlink.setEnabled(true);
		        	    		
	    	        		}catch(ClassCastException e1){
	    	        			System.err.println( "The library-model can not be chosen as the reference" );
	    	        			
	    	        		}
	        	    	}
	        	    }
	        	    composite.forceFocus();        	    
	            }
	           
	        });
		   
		/**
		 * If user clicks the delete-button, then the hyperlink of model is deleted.
		 * */ 
        final Button deleteButton = _toolkit.createButton(composite, "delete", SWT.PUSH);  
		deleteButton.addSelectionListener(new SelectionAdapter() {
			
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	            
	            /**
	             * If the reference is empty, then the delete-action doesn't work.*/	  
	            	if(!hyperlink.getText().isEmpty()){
	            	
	            	Shell shell = new Shell(_parent.getShell(), SWT.DIALOG_TRIM
	            	        | SWT.APPLICATION_MODAL);
	            	/**
	            	 * Before this is deleted,the dialog is opened and it asks about the deletion.
	            	 * */ 
	            	MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
	            		dialog.setText("Question");
	            		dialog.setMessage("Do you really want to delete this?");
	            		
	            		if(dialog.open() == SWT.OK){
	            			hyperlink.setText(EMPTY);
	    	            	hyperlink.setEnabled(false);
	    	            	featureObservable.setValue(EMPTY);
	            		}
	            		
	            	}
	            }
	            
	    });

		return composite;
		
	}
	public Control control_Formula_inputParameter(DataBindingContext dbc, IObservableValue featureObservable) {
		
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    inputParameter_composite = _toolkit.createComposite(_parent, SWT.NONE);
	 
	    RowLayout rowLayout = new RowLayout();
	    rowLayout.wrap = true;
	    rowLayout.justify = false;
	    rowLayout.marginLeft = 5;
	    
	    inputParameter_composite.setLayout(rowLayout);
	    
	    input_featureObservable = featureObservable;
	 
	    Formula currentFormula = (Formula)getOwner();
	        
	    if(input_featureObservable.getValue() == null || input_featureObservable.getValue().equals("")){	
	    	
	    	  for (int p = 0; p < 10; p++) {
				   
				   Hyperlink new_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
				   controlHyperlinkInput(new_hyperlink_input, false, true);
			 	   
			  }
	    	  
	    }else{
	    	
	    	String [] stringArray = input_featureObservable.getValue().toString().split(",");
	    	
	    	for (int p = 0; p < 10; p++) {
	    		
	    		if(p < stringArray.length){
	    			
		    		Hyperlink hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, stringArray[p], SWT.NONE);
		    		controlHyperlinkInput(hyperlink_input, true, true);		
		    	    hyperlink_input.addHyperlinkListener(new HyperlinkAdapter() {
		    	    	
		    	 			public void linkActivated(HyperlinkEvent e) {
		    	 		
		    	 				showInputPart(hyperlink_input, currentFormula);
		    	 			}
		    	 	});
		    	  
	    		}
	    		
	    		else{
	    			
	    			 Hyperlink new_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
	    			 controlHyperlinkInput(new_hyperlink_input, false, true);
			    	
	    		}
	    	    	    	    
	        }
	    		    	
	    }
	    	  
	    return inputParameter_composite;
	}
	public Control control_Formula_outputParameter(DataBindingContext dbc, IObservableValue featureObservable) {
			
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    GridLayout _gridLayout = new GridLayout(1, false);
	    composite.setLayout(_gridLayout);
	       
	    output_featureObservable = featureObservable;
	    
	    if(featureObservable.getValue() == null){
	    	hyperlink_output = _toolkit.createHyperlink(composite, EMPTY, SWT.NONE);
	    	controlHyperlinkOutput(hyperlink_output, false, false);
	    }
	    else{
	    	hyperlink_output = _toolkit.createHyperlink(composite, ((Quantity)featureObservable.getValue()).getName() , SWT.NONE);
	    	controlHyperlinkOutput(hyperlink_output, true, false);
	    }
	   
	    composite.forceFocus();
	    
	    Formula currentFormula = (Formula)getOwner();
	    
		/**The action for click of this hyperlink und let open and show the model of hyperlink.*/
	    hyperlink_output.addHyperlinkListener(new HyperlinkAdapter() {
	    	
	 			public void linkActivated(HyperlinkEvent e) {
	 		
	 				showOutputPart(hyperlink_output, currentFormula);
	 			}
	 	});
	
	    return composite;
	}
	private void controlHyperlinkInput(Hyperlink hyperlink, Boolean enable, Boolean underline){
		
		RowData rowData = new RowData();
	    rowData.width = 50;
		
	    hyperlink.setLayoutData(rowData); 
		hyperlink.setEnabled(enable);
		hyperlink.setUnderlined(underline);
		hyperlink.setForeground(getColorBlack());
		   
		listOfHyperlink.add(hyperlink);
		
		
	}
	private void controlHyperlinkOutput(Hyperlink hyperlink, Boolean enable, Boolean underline){
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;
	    gridData.grabExcessHorizontalSpace = true;
	    gridData.minimumWidth = 50;
	    
	    hyperlink.setLayoutData(gridData); 
	    hyperlink.setEnabled(enable);
	    hyperlink.setUnderlined(underline);
	    hyperlink.setForeground(getColorBlack());
		
	}
	private void showOutputPart(Hyperlink hyperlink, Formula currentFormula){
		
		System.out.println("show part for input");
		
		Boolean partVisible = false;
		EPartService partService = EPartServiceHelper.getEPartService();
		Collection<MPart> parts = partService.getParts();
		
		EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
		Quantity show_quantity = null;
		
		for(Quantity q : quantities){
				
				if(q.getName().equals(hyperlink.getText())){
					show_quantity = q;
					
				}	
		 }
		 
		 
		for ( Iterator<MPart> i = parts.iterator(); i.hasNext(); )
		{
			MPart partSearch = i.next();
			if (partSearch.isVisible()) {
				
				if(partSearch.getElementId().equals(show_quantity.toString())){
					partVisible = true;
                	partService.activate(partSearch);
                	break;
					 
                 }
    
             }
        }
			
		if(!partVisible){
			
			part = MBasicFactory.INSTANCE.createPart();
			part.setLabel("output  " + hyperlink.getText());		   
			part.setElementId(show_quantity.toString());		   
		    part.setObject(show_quantity);	    
			part.setCloseable(true);
			part.setContributionURI("bundleclass://net.bhl.cdt.reconstruct.cdtModel/net.bhl.cdt.reconsruct.parsley.e4.CDTQuantityModelViewer");

			partService.showPart(part, PartState.CREATE);
			partService.bringToTop(part);
			
		}
		
	}
	private Boolean admittanceOfgenerating(String latexformula){
		
		Boolean admit = false;
		
		if(latexformula.contains("=") && isOneEqualSymbol(latexformula)){
			admit = true;
		}

		return admit;
	}
	private Boolean isOneEqualSymbol(String latexformula){
		
		int equal = 0;
		for(int i = 0; i < latexformula.length(); i++) {
		    if(latexformula.charAt(i) == '=') equal++;
		}

		return equal == 1;
		
	}
	
	private void generateQuantities(String latexFormula){
		
		createOutputQuantity(latexFormula);
				
		createInputQuantity(latexFormula);
	}
	private void createInputQuantity(String latexFormula){
		
		ArrayList<String> input = ExtractQuantitiesFromFormula.filtering_inputParameter(latexFormula);
		String new_input_string = String.join(",", input);
		
		Formula currentFormula = (Formula)getOwner();	
		FormToolkit _toolkit = this.getToolkit();
				
		
		if(input.size() > 10){
			
			int rest = input.size() - 10;
			for(int p = 0; p < rest; p++) {
				
				Hyperlink rest_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
				controlHyperlinkInput(rest_hyperlink_input, true, true);
				
			}
			
		}
		updateInputParameter(currentFormula, input);
		
		for (int t = 0; t < listOfHyperlink.size(); t++) {
				
	   	 	listOfHyperlink.get(t).setEnabled(false);
			listOfHyperlink.get(t).setText("");
			
	    }
		
		if(input.size() != 0){
		
			for (int q = 0; q < input.size(); q++) {
				
		   	 	System.out.println("quantitiesArray of Input:"+ input.get(q).toString());
		   	 	Hyperlink presentLink = listOfHyperlink.get(q);
		   	 	listOfHyperlink.get(q).setEnabled(true);
				listOfHyperlink.get(q).setText(input.get(q).toString());
				listOfHyperlink.get(q).setForeground(getColorBlack());
				listOfHyperlink.get(q).addHyperlinkListener(new HyperlinkAdapter() {
	    	    	
		 			public void linkActivated(HyperlinkEvent e) {
		 		
		 				showInputPart(presentLink, currentFormula);
		 			}
		 	});
				
		    }
			
		}
		
		int x = inputParameter_composite.getShell().getSize().x;
		int y = inputParameter_composite.getShell().getSize().y;
		inputParameter_composite.getShell().setSize(x+1 , y);
		input_featureObservable.setValue(new_input_string);
		
		
	}
	private void updateInputParameter(Formula currentFormula, ArrayList<String> input){
		
		EList<Quantity> generatedQuantities = currentFormula.getRepository().getQuantities();
		ArrayList<String> generatedInputQuantities_array = new ArrayList<String>();
	
		
		for(Quantity gQ : generatedQuantities){
			
			if(gQ.getDescription().equals("input")){
				
				generatedInputQuantities_array.add(gQ.getName());
			}
			
			
		}
		
		for(String input_quantity : input){
			
			if(!generatedInputQuantities_array.contains(input_quantity)){
				
				Quantity quantity = FormulaFactory.eINSTANCE.createQuantity();	
			   	quantity.setName(input_quantity);
			   	quantity.setDescription("input");
				currentFormula.getRepository().getQuantities().add(quantity);
				generatedInputQuantities_array.add(input_quantity);
								
			}
		}
		
		
		ArrayList<String> deleting_InputQuantities_array = new ArrayList<String>();
		EList<Formula> currentFormulas = currentFormula.getRepository().getFormulas();
		
		for(String generated_quantity : generatedInputQuantities_array){
			
			if(!input.contains(generated_quantity) && !isCommunalQuantity(generated_quantity, currentFormulas, currentFormula)){
								
				deleting_InputQuantities_array.add(generated_quantity);
				
			}
			
		}
		
		removeOldQuantity(deleting_InputQuantities_array, currentFormula);
			
	}
	private Boolean isCommunalQuantity(String generated_quantity, EList<Formula> formulas, Formula currentFormula){
		
		Boolean common=false;
		for(int i=0; i<formulas.size(); i++){
			
			 
			if(!formulas.get(i).equals(currentFormula)){
				
				String [] inputParameter_stringArray = formulas.get(i).getInputParameter().split(","); 
				ArrayList<String> inputParameter_arrayList = new ArrayList<>(Arrays.asList(inputParameter_stringArray));
				
				if(inputParameter_arrayList.contains(generated_quantity)){
					
					common = true;
				}
			}
		}
		
		
		return common;
	}
	private void removeOldQuantity(ArrayList<String> deleting_InputQuantities_array, Formula currentFormula){
		
		EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
		
		final ECPProjectManager ecpProjectManager = ECPUtil.getECPProjectManager();
		ArrayList<Object> toBeDeleted = new ArrayList<Object>();
	
		for(int i=0; i< quantities.size(); i++){
			
			if(deleting_InputQuantities_array.contains(quantities.get(i).getName())){
				
				Quantity q = quantities.get(i);
				toBeDeleted.add(q);
					
			}
			
		}
		for(Iterator i = toBeDeleted.iterator();i.hasNext();){
			
			EObject eObject = (EObject) i.next();
			ECPHandlerHelper.deleteModelElement(
					ecpProjectManager.getProject(eObject),
					toBeDeleted);	
		}
	}
	private void showInputPart(Hyperlink hyperlink, Formula currentFormula){
		
		System.out.println("show part for input");
		
		Boolean partVisible = false;
		EPartService partService = EPartServiceHelper.getEPartService();
		Collection<MPart> parts = partService.getParts();
		
		EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
		Quantity show_quantity = null;
		
		for(Quantity q : quantities){
				
				if(q.getName().equals(hyperlink.getText())){
					show_quantity = q;
					
				}	
		 }
		 
		 
		for ( Iterator<MPart> i = parts.iterator(); i.hasNext(); )
		{
			MPart partSearch = i.next();
			if (partSearch.isVisible()) {
				if(partSearch.getElementId().equals(show_quantity.toString())){
					partVisible = true;
                	partService.activate(partSearch);
                	break;
					 
                 }
    
             }
        }
		
		
		
		if(!partVisible){
			
			part = MBasicFactory.INSTANCE.createPart();
			part.setLabel("input  " + hyperlink.getText());
			part.setElementId(show_quantity.toString()); 
		    part.setObject(show_quantity);    
			part.setCloseable(true);
			part.setContributionURI("bundleclass://net.bhl.cdt.reconstruct.cdtModel/net.bhl.cdt.reconsruct.parsley.e4.CDTQuantityModelViewer");

			partService.showPart(part, PartState.CREATE);
			partService.bringToTop(part);
			
		}
		
	}
	
	private void createOutputQuantity(String latexFormula){
		
		String out = ExtractQuantitiesFromFormula.filtering_OutputParameter(latexFormula);
		System.out.println("out : " + out);
		
		Quantity q = (Quantity) output_featureObservable.getValue();
		
		if(!out.equals(EMPTY)){
			
			hyperlink_output.setText(out);
			hyperlink_output.setEnabled(true);
			
			Quantity quantity = FormulaFactory.eINSTANCE.createQuantity();	
			quantity.setName(out);
			quantity.setDescription("output");
			
			if(output_featureObservable.getValue() == null){
				
				
				Formula currentFormula = (Formula)getOwner();
				EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
				ArrayList<String> outQuantities_arrayList = new ArrayList<String>();
				for(Quantity qt : quantities){
					
					if(qt.getDescription().equals("output")){
						
						outQuantities_arrayList.add(qt.getName());
					}
					
				}
				
				if(!outQuantities_arrayList.contains(out)){
					
					currentFormula.getRepository().getQuantities().add(quantity);
					output_featureObservable.setValue(quantity);
					
				}else{
					
				}
					
			}else{
								
				if(!q.getName().equals(out)){
					Formula currentFormula = (Formula)getOwner();
					modifyPreviousOutput(currentFormula.getRepository(), out, q);
													
				}
			}
			
		}
		else{
			
			hyperlink_output.setText(out);
			hyperlink_output.setEnabled(false);

			final ECPProjectManager ecpProjectManager = ECPUtil.getECPProjectManager();
			ArrayList<Object> toBeDeleted = new ArrayList<Object>();
		
			toBeDeleted.add(q);
			EObject eObject = q;
			ECPHandlerHelper.deleteModelElement(
					ecpProjectManager.getProject(eObject),
					toBeDeleted);		
			
		}
	}
	private void modifyPreviousOutput(FormulaRepository repository, String output, Quantity q ){
		
		EList<Quantity> quantities = repository.getQuantities();
		
		for ( Iterator i = quantities.iterator(); i.hasNext();){
					
			Quantity quantity = (Quantity) i.next();
						
			if(quantity.getName().equals(q.getName())){
				
				quantity.setName(output);
				
			}
		}
		
	}
	private Color getColorBlack(){
		
		 Device device = Display.getCurrent ();
		 Color black = new Color (device, 0, 0, 0);
		
		 return black;
	}
	
	private void parsleyCustomButton(Button buttonShow, Text latexString, Composite _parent){

	
		/**
		 * After click, it tries to open the file.
		 * */
        buttonShow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * check,whether the textbox of the latexformula is empty.
				 */
				String latexformula = latexString.getText();
				/**
				 * In case texbox of latexString is empty 
				 * */
				if(latexformula == EMPTY){
					/**
					 * when the latexformula-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
					
				}
		
			}
		});       
      	
	}
	private void createNewImage(String latexformula, Composite composite, Text latexString) throws SAXException, ParserConfigurationException, IOException {
	    
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(latexformula);
		session.getConfiguration().setFailingFast(true);
		
		 if (session.parseInput(input) == false){
				
				MessageBox messageBox = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		        
		        messageBox.setText("Warning");
		        messageBox.setMessage(session.getErrors().toString());
		        messageBox.open();
		        
				System.out.println("Error : " + session.getErrors().toString());
			}
		   	/**
	 	   	 * the string of latex-formula is converted into xml-string.
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
				 		gd.heightHint = startHeight;
				        canvas.setLayoutData(gd);
				        
				        if(newHeight <= startHeight){
				        	canvas.setSize(newWidth, startHeight);
				        	
				        }else{
				        					        	
				        	canvas.setSize(newWidth, newHeight);
				        	startHeight = newHeight;
				        	String newString = latexformula.concat(" ");
				        	latexString.setText(newString);
				        	
				        }
				      
					    e.gc.drawImage(newimage, 0, 0);		
				 		canvas.update();
					
					  }
				});
				
		 		
		 		canvas.redraw();
		 		

			}
	}
	/**
	 * if the latex-formula is empty and the show-button is clicked, then dialog window is opened to warn.
	  */
	private void openLatexMessageBox(){
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		messageBox_empty.setMessage("Latex String is empty");
        messageBox_empty.open();
		
	}

}
