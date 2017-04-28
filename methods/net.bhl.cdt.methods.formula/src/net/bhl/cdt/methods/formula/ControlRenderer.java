package net.bhl.cdt.methods.formula;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.TextField;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

import javax.inject.Inject;
import javax.swing.JFrame;
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
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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

/**
 * 
 * @author sanghun.cho
 * @since January.2017
 *
 */
public class ControlRenderer extends TextControlSWTRenderer implements ComponentListener {

	private ViewModelContext viewContext;
	private Label imageLabel;
	private CLabel imageLabelC;
	private Boolean assignLatex;
	private int width;
	private int height;
	private int newWidth;
	private int newHeight;
	private Image newimage;
	private ImageData imageData;
	private Image image;
	static JFrame frame;
	private Composite main;

	
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
	
		main = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		GridDataFactory.fillDefaults().grab(false, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
				
		final Control control = super.createSWTControl(main);
		Control[] controlList = ((Composite) control).getChildren();
			
		//checkTextBoxEmpty();
	
		/**
		 * if user clicks on the show-button, then the latexformel-string is transformed into the image and this image is shown underneath the latexformel.
		 */
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Show");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * check,whether the textbox of the latexformel is empty.
				 */
				assignLatex = viewContext.getDomainModel().eIsSet(FormulaPackage.Literals.FORMULA__LATEX_STRING);
				
				if(assignLatex == false){
					
					/**
					 * when the latexformel-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();

				}
				
				/**
				 * the latex-formel string exists as input value in textbox.
				 */ 
				else{
					
					try {
						/**
						 * it starts that latex-formel is transformed into the image data.
						 */
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
	
		
		
		/**
		 * the size of the background image can be modified.
		 */	
		imageLabelC = new CLabel(main, SWT.NONE);
		image = new Image(Display.getCurrent(), 900, 100);	
		width = image.getBounds().width;
 		height = image.getBounds().height;
		imageLabelC.setImage(image);
		

 		/**
 		 * this focus-function works at first that if a user clicks the textbox of latex-formel, 
 		 * then textbox of latex-formel gets the focus. After that the focus gets lost,
 		 * if a user clicks other object out of the textbox of latex-formel.
 		 */
		FocusListener listener = new FocusListener() {
        	
            public void focusGained(FocusEvent event) {
                   	
            	//System.out.println("get Focus");      	
            }

			@Override
			public void focusLost(FocusEvent e) {
								
				/**
				 * if the textbox of latex-formel is not empty, then it returns true value.
				 */
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
					/**
					 * the image is removed, if the textbox is of latex-formel empty.
					 */
					//setImageRemove();
					
				}
			}
		};
		/**
		 * the textbox of latex-formel is referenced as controlList[0].
		 */
		controlList[0].addFocusListener(listener);
		

		/**
		 * this function is implemented for resizing.
		 */
		main.addListener(SWT.Resize,  new Listener () {
			
	        public void handleEvent (Event e) {
	        //System.out.println("resize");
	         
	    }});
		
		
		return control;
	}
	

	/**
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	private void createNewImage() throws IOException, SAXException, ParserConfigurationException {
		
		String latexFormel = viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING).toString();
		
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(latexFormel);
		session.getConfiguration().setFailingFast(true);
 	   
		/**
		 * the string of latex-formel hat error to converting.
		 */
 	   if (session.parseInput(input) == false){
			
			MessageBox messageBox = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
	        
	        messageBox.setText("Warning");
	        messageBox.setMessage(session.getErrors().toString());
	        messageBox.open();
	        
	        //setImageRemove();
			
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

	 		
	 		/**
	 		 * the size of the image gets scaled down.  
	 		 */
	 		if(( newWidth > 900 && newWidth < 1200 ) && ( newHeight <= 100  )){		
	 			
	 			imageLabelC.setBounds(0, 60, newWidth+10, newHeight+10);
	 			this.imageLabelC.setImage(newimage);
	 		}
	 		else if(( newWidth >= 1200 ) && ( newHeight <= 100  )){
	 			int scaledWidth = ( newWidth / width );
	 			final Image scaled = new Image(Display.getDefault(),imageData.scaledTo(1200,20/scaledWidth));
	 			imageLabelC.setBounds(0, 60, newWidth+10, newHeight+10);
	 			this.imageLabelC.setImage(scaled);
	 				
	 		}
	 		else if(( newWidth < 1200 ) && ( newHeight > 100  )){
	 			int scaleHeight = ( newHeight / height );
	 			final Image scaled = new Image(Display.getDefault(),imageData.scaledTo(newWidth/scaleHeight,100));
	 			imageLabelC.setBounds(0, 30, newWidth+10, newHeight+10);
	 			this.imageLabelC.setImage(scaled);
	 		}
	 		else{
	 			this.imageLabelC.setImage(newimage);
	 			
	 		}
		
		}
		
	}
	
	/**
	 * this function checks both textBox of name and latexformel, whether these are empty. If both or one of them is empty, warning message window pops up.
	 */
	private void checkTextBoxEmpty(){
		
		/**
		 * if a textbox is empty,then this variable is assighned as false.
		 */
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
	
	/**
	 * if the latex-formel is empty and the show-button is clicked, then dialog window is opened to warn.
	  */
	private void openLatexMessageBox(){
		
		MessageBox messageBox_empty = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
		messageBox_empty.setText("Warning");
		messageBox_empty.setMessage("Latex String is empty");
        messageBox_empty.open();
		
	}
	
	/**
	 * this function deletes the image of the latex-formel.
	 */
 	private void setImageRemove(){
 		
 		imageLabel.setImage(null);
 		
 	}


	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 	
 	

 
}



