package net.bhl.cdt.reconstruct.cdtmodel;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.ui.e4.util.EPartServiceHelper;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import cdtliterature.ALiteratureBase;
import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaRepository;
import formula.Quantity;
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
	private static final int BASE_SIZE_HYPERLINK = 10;

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
		 * After click, it tries to open the file.
		 * */
        showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * Check,whether the textbox of the latexformula is empty.
				 */
				String latexformula = latexString.getText();
				
				//System.out.println("latexformula : " + latexformula);
				
				/**
				 * In case textbox of latexString is empty 
				 * */
				if(latexformula == EMPTY){
					
					/**
					 * When the Latex-formula-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
										
						try{
							
							/**
							 * The Latex-formula can be transformed to image.
							 * */
							createNewImage(latexformula, composite, latexString);
	
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
					
						/**
						 *Latex-formula can be transformed to image as well as to generate quantities automatically.
						 * */
						if(hasFormulaOneEqualSymbol(latexformula)){
						
							generateQuantities(latexformula);
						
						}else{
							
							/**
							 *Latex-formula can be transformed to only image and showed without generating quantities automatically.
							 * */
							generateQuantities(NOTHING_GENERATE_QUANTITY);
						}
						
						/**
						 * remove the focus on showButton.
						 * */
						_parent.getShell().setFocus();
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
				 * If the textbox of Latex-formula is not empty, then it returns true value.
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
					 * The image is removed, if the textbox is of Latex-formula empty.
					 */
					
				}
			}
		};
        latexString.addFocusListener(listener);
        
		return composite;
		
	}
	
	public Control control_Formula_reference(DataBindingContext dbc, IObservableValue featureObservable) {
		
		
		/**
		 * The base elements are set for customized reference.
		 * */
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	   
	    
	    /**
	     * The grid-layout consist of hyperlink, set-button, delete-button.
	     * */
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
	    
	    /**
	     * The action for click of this hyperlink and let open and show the model of hyperlink.
	     * */
	    hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
	    	
			public void linkActivated(HyperlinkEvent e) {
				
				
				Boolean partVisible = false;
				EPartService partService = EPartServiceHelper.getEPartService();
				Collection<MPart> parts = partService.getParts();
				
				/**
				 * If the part of model was already opened, then this part becomes active.
				 * */
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
				/**
				 * If the part of literature-model was not opened fast, then new part is created and showed using parsley.
				 * */
				if(!partVisible){
					
					part = MBasicFactory.INSTANCE.createPart();
					part.setLabel(((ALiteratureBase) featureObservable.getValue()).eClass().getName() + 
							" " + ((ALiteratureBase)featureObservable.getValue()).getTitle());
				    part.setElementId(featureObservable.getValue().toString());
					part.setObject(featureObservable.getValue());
					part.setCloseable(true);
					part.setContributionURI("bundleclass://net.bhl.cdt.reconstruct.cdtModel/net.bhl.cdt.reconsruct.parsley.e4.CDTLibraryRefernceModelViewer");

					partService.showPart(part, PartState.CREATE);
					partService.bringToTop(part);
					
				}
		
			}
		});

	    /**
	     * this grid-data makes the hyperlink to locate on the left of composite of customized reference.
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
	             * If the reference is empty, then the delete-action doesn't work.
	             * */	  
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
	/**
	 * This method generates the input-parameters automatically and the right side of formula used to generate them,
	 * if one equal symbol exists in formula.
	 * */
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
	        
	    /**
	     * There is no save of input-parameters or empty string was saved in featureObserable.
	     * */
	    if(input_featureObservable.getValue() == null || input_featureObservable.getValue().equals("")){	
	    	
	    	  for (int p = 0; p < BASE_SIZE_HYPERLINK; p++) {
				   
				   Hyperlink new_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
				   setPropertyHyperlinkInput(new_hyperlink_input, false, true);
			 	   
			  }
	    	  
	    }
	    else{
	    	
	    	String [] stringArray = input_featureObservable.getValue().toString().split(",");
	    	
	    	int sizeOfArray = stringArray.length;
	    	int number = 0;
	    	
	    	if(sizeOfArray < BASE_SIZE_HYPERLINK ){	
	    		number = BASE_SIZE_HYPERLINK;//10
	    	}else{	    		
	    		number = sizeOfArray;
	    	}
	    	
	    
	    	for (int p = 0; p < number ; p++) {
	    		
	    		if(p < stringArray.length){
	    			
		    		Hyperlink hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, stringArray[p], SWT.NONE);
		    		setPropertyHyperlinkInput(hyperlink_input, true, true);	
		    		
		    		/**
		    		 * If this hyperlink is clicked, then
		    		 * let open and show the model of hyperlink.
		    		 * */
		    	    hyperlink_input.addHyperlinkListener(new HyperlinkAdapter() {
		    	    	
		    	 			public void linkActivated(HyperlinkEvent e) {
		    	 		
		    	 				showInputPart(hyperlink_input, currentFormula);
		    	 			}
		    	 	});
		    	  
	    		}
	    		
	    		else{
	    			
	    			 Hyperlink new_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
	    			 setPropertyHyperlinkInput(new_hyperlink_input, false, true);
	    			
	    		}
	    	    	    	    
	        }
	    		    	
	    }
	    	  
	    return inputParameter_composite;
	}
	/**
	 * This method generates the output-parameter automatically and the left side of formula used to generate it,
	 * if ONE equal symbol exists in formula.
	 * */
	public Control control_Formula_outputParameter(DataBindingContext dbc, IObservableValue featureObservable) {
			
		FormToolkit _toolkit = this.getToolkit();
	    Composite _parent = this.getParent();
	    final Composite composite = _toolkit.createComposite(_parent, SWT.NONE);
	    GridLayout _gridLayout = new GridLayout(1, false);
	    composite.setLayout(_gridLayout);
	       
	    output_featureObservable = featureObservable;
	    
	    if(featureObservable.getValue() == null){
	    	hyperlink_output = _toolkit.createHyperlink(composite, EMPTY, SWT.NONE);
	    	setPropertyHyperlinkOutput(hyperlink_output, false, false);
	    }
	    else{
	    	hyperlink_output = _toolkit.createHyperlink(composite, ((Quantity)featureObservable.getValue()).getName() , SWT.NONE);
	    	setPropertyHyperlinkOutput(hyperlink_output, true, false);
	    }
	   
	    composite.forceFocus();
	    
	    Formula currentFormula = (Formula)getOwner();
	    
		/**
		 * If this hyperlink is clicked, then
		 * let open and show the model of hyperlink.
		 * */
	    hyperlink_output.addHyperlinkListener(new HyperlinkAdapter() {
	    	
	 			public void linkActivated(HyperlinkEvent e) {
	 		
	 				showOutputPart(hyperlink_output, currentFormula);
	 			}
	 	});
	
	    return composite;
	}
	
	/**
	 * set the basis property of hyperlink for input-parameter
	 * */
	private void setPropertyHyperlinkInput(Hyperlink hyperlink, Boolean enable, Boolean underline){
		
		RowData rowData = new RowData();
	    rowData.width = 50;
		
	    hyperlink.setLayoutData(rowData); 
		hyperlink.setEnabled(enable);
		hyperlink.setUnderlined(underline);
		hyperlink.setForeground(getColorBlack());
		   
		listOfHyperlink.add(hyperlink);
			
	}
	
	/**
	 * set the basis property of hyperlink for output-parameter
	 * */
	private void setPropertyHyperlinkOutput(Hyperlink hyperlink, Boolean enable, Boolean underline){
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;
	    gridData.grabExcessHorizontalSpace = true;
	    gridData.minimumWidth = 50;
	    
	    hyperlink.setLayoutData(gridData); 
	    hyperlink.setEnabled(enable);
	    hyperlink.setUnderlined(underline);
	    hyperlink.setForeground(getColorBlack());
		
	}
	
	/**
	 * If the hyperlink is clicked, then the part of model is showed.
	 * */
	private void showOutputPart(Hyperlink hyperlink, Formula currentFormula){
				
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
	private Boolean hasFormulaOneEqualSymbol(String latexformula){
		
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
				
		
		if(input.size() > BASE_SIZE_HYPERLINK){
			
			int rest = input.size() - BASE_SIZE_HYPERLINK;
			for(int p = 0; p < rest; p++) {
				
				Hyperlink rest_hyperlink_input = _toolkit.createHyperlink(inputParameter_composite, EMPTY ,SWT.NONE);
				setPropertyHyperlinkInput(rest_hyperlink_input, true, true);
				
			}
			
		}
		
		/**
		 * The whole input-parameter is arranged.
		 * */
		updateInputParameter(currentFormula, input);
		
		for (int t = 0; t < listOfHyperlink.size(); t++) {
				
	   	 	listOfHyperlink.get(t).setEnabled(false);
			listOfHyperlink.get(t).setText(EMPTY);
			
	    }
		
		if(input.size() != 0){
		
			for (int q = 0; q < input.size(); q++) {
				
		   	 	//System.out.println("quantitiesArray of Input:"+ input.get(q).toString());
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
		
		/**
		 * It makes to update the part per modifying the size of shell and let show directly the new generated hyperlink,
		 * but it should be improved with other way.
		 * */
		int x = inputParameter_composite.getShell().getSize().x;
		int y = inputParameter_composite.getShell().getSize().y;
		inputParameter_composite.getShell().setSize(x+1 , y);
		input_featureObservable.setValue(new_input_string);
		
		
	}
	
	/**
	 * whole input-parameter is arranged to creating new quantity or remove unnecessary quantity or remain like before.
	 * */
	private void updateInputParameter(Formula currentFormula, ArrayList<String> input){
		
		EList<Quantity> generatedQuantities = currentFormula.getRepository().getQuantities();
		ArrayList<String> generatedInputQuantities_array = new ArrayList<String>();
	
		/**
		 * Only input-parameter quantities are retrieved from generated whole quantities under current repository.
		 * */
		for(Quantity gQ : generatedQuantities){
			
			if(gQ.getDescription().equals("input")){
				
				generatedInputQuantities_array.add(gQ.getName());
			}
			
			
			
		}
		
		/**
		 * check, whether the quantity exists already under the current repository.
		 * */
		for(String input_quantity : input){
			
			/**
			 * If there is no quantity under the current repository, then new quantity is generated and attached under that.
			 * */
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
			
			
			/**
			 * The entire input-quantities are investigated and unnecessary quantities are removed.
			 * */
			if(!input.contains(generated_quantity) && !isCommunalQuantity(generated_quantity, currentFormulas, currentFormula)){
								
				deleting_InputQuantities_array.add(generated_quantity);
				
			}
			
		}
		
		
		removeOldQuantity(deleting_InputQuantities_array, currentFormula);
			
	}
	/**
	 * check, whether the generated_quantity is also used to hyperlink and input-parameter of other formula under current repository.
	 * */ 
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
		
		Boolean partVisible = false;
		EPartService partService = EPartServiceHelper.getEPartService();
		Collection<MPart> parts = partService.getParts();
		
		EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
		Quantity show_quantity = null;
		
		/**
		 * The quantity-object can be found by name of hyperlink.
		 * */ 
		for(Quantity q : quantities){
				
				if(q.getName().equals(hyperlink.getText())){
					show_quantity = q;
					
				}	
		 }
		 
		/**
		 * check, whether the part of found quantity already opened past and if so, then this part is being active.
		 * */ 
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
		
		
		/**
		 * If the part of quantity-model was not opened fast, then new part is created and showed using parsly.
		 * */
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
		
		Quantity q = (Quantity) output_featureObservable.getValue();
		
		if(!out.equals(EMPTY)){
			
			hyperlink_output.setText(out);
			hyperlink_output.setEnabled(true);
			
			Quantity quantity = FormulaFactory.eINSTANCE.createQuantity();	
			quantity.setName(out);
			quantity.setDescription("output");
			
			if(output_featureObservable.getValue() == null){
				
				/**
				 * Only output-parameter quantities are retrieved from generated whole quantities under current repository.
				 * */
				Formula currentFormula = (Formula)getOwner();
				EList<Quantity> quantities = currentFormula.getRepository().getQuantities();
				ArrayList<String> outQuantities_arrayList = new ArrayList<String>();
				for(Quantity qt : quantities){
					
					if(qt.getDescription().equals("output")){
						
						outQuantities_arrayList.add(qt.getName());
					}
					
				}
				
				/**
				 * If there is no quantity under the current repository, then new quantity is generated and attached under that.
				 * */
				if(!outQuantities_arrayList.contains(out)){
					
					currentFormula.getRepository().getQuantities().add(quantity);
					output_featureObservable.setValue(quantity);
					
				}else{
					
				}
					
			}else{
				
				/**
				 * There is already saved value of output-parameter under the current repository, 
				 * but the name of that is different to actual quantity, so it changes only the name
				 * */ 
				if(!q.getName().equals(out)){
					Formula currentFormula = (Formula)getOwner();
					modifyPreviousOutput(currentFormula.getRepository(), out, q);
													
				}
			}
			
		}
		
		/**
		 * The actual output-parameter is empty, so it removes the hyperlink and the quantity-model under the current formula.
		 * */
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
	 	   	 * the string of Latex-formula is converted into xml-string.
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
	 * if the Latex-formula is empty and the show-button is clicked, then dialog window is opened to warn.
	  */
	private void openLatexMessageBox(){
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		messageBox_empty.setMessage("Latex String is empty");
        messageBox_empty.open();
		
	}

}
