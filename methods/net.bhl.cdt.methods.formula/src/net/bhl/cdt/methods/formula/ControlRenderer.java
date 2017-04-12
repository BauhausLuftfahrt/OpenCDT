package net.bhl.cdt.methods.formula;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.TextField;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.renderer.TextControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedReport;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.emfforms.spi.core.services.label.NoLabelFoundException;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.impl.FormulaImpl;
import formula.util.FormulaValidator;
import net.sourceforge.jeuclid.MathMLParserSupport;
import net.sourceforge.jeuclid.MutableLayoutContext;
import net.sourceforge.jeuclid.context.LayoutContextImpl;
import net.sourceforge.jeuclid.context.Parameter;
import net.sourceforge.jeuclid.converter.Converter;
import uk.ac.ed.ph.snuggletex.SerializationMethod;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;


public class ControlRenderer extends TextControlSWTRenderer{

	private ViewModelContext viewContext;
	
	private Label imageLabel;
	private Boolean assignName;
	private Boolean assignLatex;
	private int width;
	private int height;
	
	@Inject
	public ControlRenderer(VControl vElement, ViewModelContext viewContext,
		ReportService reportService,
		EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
		VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {	
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider,
			emfFormsEditSupport);	
		this.viewContext = viewContext;
		
	}
	
	protected Control createSWTControl(Composite parent) {
		
		final Composite main = new Composite(parent, SWT.NONE);
	
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
				
		final Control control = super.createSWTControl(main);
		
		Control[] controlList = ((Composite) control).getChildren();
		
		//checkTextBoxEmpty();
	
		/*if user clicks on the show-button, then the latexformel-string is transformed 
		 * into the image and this image is shown underneath the latexformel*/
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Show");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/*check,whether the textbox of the latexformel is empty*/
				assignLatex = viewContext.getDomainModel().eIsSet(FormulaPackage.Literals.FORMULA__LATEX_STRING);
				
				if(assignLatex == false){
					
					/*when the latexformel-string is empty, 
					 * then the message-box pops up to warn*/
					openLatexMessageBox();

				}
				/*the latex-formel string exists as input value in textbox*/ 
				else{
					
					try {
						/*it starts that latex-formel is 
						 * transformed into the image data*/
						createNewImage();
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
					
				}
		
					
			}
		});
	
		//this.iamgeLabel = new Label(main, SWT.NONE);
		this.imageLabel = new Label(main, SWT.BORDER);

		/*the size of the image can be modified*/
		Image image = new Image(Display.getCurrent(), 600, 100);		
		this.imageLabel.setImage(image);
		
		width = image.getBounds().width;
 		height = image.getBounds().height;
		
 		/*this focus-function works at frst that if a user clicks the textbox of latex-formel,
 		 * then textbox of latex-formel gets the focus. After that the focus gets lost,
 		 * if a user clicks other object out of the textbox of latex-formel*/
		FocusListener listener = new FocusListener() {
        	
            public void focusGained(FocusEvent event) {
                   	
            	System.out.println("get Focus");      	
            }

			@Override
			public void focusLost(FocusEvent e) {

				assignLatex = viewContext.getDomainModel().eIsSet(FormulaPackage.Literals.FORMULA__LATEX_STRING);
				
				if(assignLatex == true){
					try {				
						
						createNewImage();
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
					/*the image is removed, 
					 * if the textbox is of latex-formelempty*/ 
					setImageRemove();
					
				}
			}
		};
		/*the textbox of latex-formel is pointed out as controlList[0]*/ 
		controlList[0].addFocusListener(listener);
		
		return control;
	}

	private void createNewImage() throws IOException, SAXException, ParserConfigurationException {
		
		String latexFormel = viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING).toString();
		
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(latexFormel);
		session.getConfiguration().setFailingFast(true);
 	   
 	   if (session.parseInput(input) == false){
			
			MessageBox messageBox = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
	        
	        messageBox.setText("Warning");
	        messageBox.setMessage(session.getErrors().toString());
	        messageBox.open();
	        
	        setImageRemove();
			
			System.out.println("Error : " + session.getErrors().toString());
		}
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
	 		
	 		BufferedInputStream inputStreamReader = new BufferedInputStream(new ByteArrayInputStream(uploadedImg));
	 		ImageData imageData = new ImageData(inputStreamReader);
	 		Image newimage = new Image(Display.getCurrent(),imageData);
	 		
	 		int newWidth = newimage.getBounds().width;
	 		int newHeight = newimage.getBounds().height;
	 		
	 		/*the size of the image gets scaled down  */
	 		if(( newimage.getBounds().width >= 600 ) || ( newimage.getBounds().height >= 100 )){
	 			
	 			int scale = ( newWidth / width );
	 			
	 			final Image scaled = new Image(Display.getCurrent(),imageData.scaledTo(600,20/scale));
	 			this.imageLabel.setImage(scaled);
	 		
	 		}
	 		else{
	 			
	 			this.imageLabel.setImage(newimage);
	 			
	 		}
	 		
		
		}
		
	}
	
	/*this method checks both textBox of name and latexformel, whether these are empty
	 * if both or one of them is empty, warning message window pops up*/
	private void checkTextBoxEmpty(){
		
		/*if a textbox is empty,then this variable is assighned as false*/
		Boolean isName = viewContext.getDomainModel().eIsSet(FormulaPackage.Literals.FORMULA__NAME);
		Boolean isFormel = viewContext.getDomainModel().eIsSet(FormulaPackage.Literals.FORMULA__LATEX_STRING);
		
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		
		if( (isFormel == false) && (isName == false)){
			
	        messageBox_empty.setMessage("Name & Latex String are empty");
	        messageBox_empty.open();
	        

		}
		else if( isName == false ){
			
	        messageBox_empty.setMessage("Name is empty");
	        messageBox_empty.open();
	       
			
		}
		else if( isFormel == false ){
			
	        messageBox_empty.setMessage("Latex String is empty");
	        messageBox_empty.open();
	       
		}
		else{
					
		}
		
		
	}
	
	private void openLatexMessageBox(){
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		messageBox_empty.setMessage("Latex String is empty");
        messageBox_empty.open();
		
	}
	
	/*this method deletes the image of the latexformel*/
 	private void setImageRemove(){
 		
 		imageLabel.setImage(null);
 		
 	}
 
}



