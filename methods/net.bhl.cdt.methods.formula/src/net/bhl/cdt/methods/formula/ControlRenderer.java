package net.bhl.cdt.methods.formula;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;

import javax.inject.Inject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
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
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.impl.FormulaImpl;
import net.sourceforge.jeuclid.MathMLParserSupport;
import net.sourceforge.jeuclid.MutableLayoutContext;
import net.sourceforge.jeuclid.context.LayoutContextImpl;
import net.sourceforge.jeuclid.context.Parameter;
import net.sourceforge.jeuclid.converter.Converter;
import uk.ac.ed.ph.snuggletex.SerializationMethod;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;






public class ControlRenderer extends TextControlSWTRenderer {

	private ViewModelContext viewContext;
	private Label photoLabel;

	@Inject
	public ControlRenderer(VControl vElement, ViewModelContext viewContext,
		ReportService reportService,
		EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
		VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {
		
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider,
			emfFormsEditSupport);
		
		this.viewContext = viewContext;
		
	}
	
	
	@Override
	protected Control createSWTControl(Composite parent) {
		
		final Composite main = new Composite(parent, SWT.NONE);
	
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		
		GridDataFactory.fillDefaults().grab(true, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
				
		final Control control = super.createSWTControl(main);
        
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Show");
		
		//this.photoLabel = new Label(main, SWT.BORDER);
		this.photoLabel = new Label(main, SWT.NONE);
		//Image image = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/whiteboard.jpg");
		//Image image = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/snuggle tex error.jpg");
		Image image = new Image(Display.getCurrent(),300,30);
		this.photoLabel.setImage(image);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				try {
					createNewImage();
				} catch (IOException | ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				System.out.println("sanghun : "+ viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING));

			}
		});
		

		return control;
	}
	
	/*private void createNewImage() throws IOException, ParserConfigurationException, SAXException {
		
		String message = viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING).toString();
		System.out.println("message : " + message);

		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(message);
		session.getConfiguration().setFailingFast(true);
		
		session.parseInput(input);
				
		String xmlString = session.buildXMLString();
		System.out.println("xlmString : " + xmlString);
		
 			
		final Document doc = MathMLParserSupport.parseString(xmlString);
 	   
 		final File outFile = new File("test1.png");
 	      
 		final MutableLayoutContext params = new LayoutContextImpl(LayoutContextImpl.getDefaultLayoutContext());
 	     
 		params.setParameter(Parameter.MATHSIZE, 25f);
 	      
 	    Converter.getInstance().convert(doc, outFile, "image/" + "png", params);
 	    
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
	 	
	 		//Image newimage = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/snuggle tex error.jpg");
	 		Image newimage = new Image(Display.getCurrent(),imageData);
	 		this.photoLabel.setImage(newimage);
		
		
		
	}*/

	
	private void createNewImage() throws IOException, SAXException, ParserConfigurationException {
		
		String message = viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING).toString();
		System.out.println("message : " + message);
		
		
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(message);
		session.getConfiguration().setFailingFast(true);
 	   
 	   if (session.parseInput(input) == false){
			
			MessageBox messageBox = new MessageBox(new Shell(), SWT.ICON_WARNING | SWT.RETRY);
	        
	        messageBox.setText("Warning");
	        messageBox.setMessage(session.getErrors().toString());
	        messageBox.open();
	        
	        //setImageRemove();
			
			System.out.println("Error : " + session.getErrors().toString());
		}
		else{
			
 	    String xmlString = session.buildXMLString();
			
 	    
 	    
 	  System.out.println("xlmString : " + xmlString);

 	 final Document doc = MathMLParserSupport.parseString(xmlString);
 	   
 	 final File outFile = new File("test1.png");
 	      
 	 final MutableLayoutContext params = new LayoutContextImpl(LayoutContextImpl.getDefaultLayoutContext());
 	     
 	     params.setParameter(Parameter.MATHSIZE, 25f);
 	      
 	     Converter.getInstance().convert(doc, outFile, "image/" + "png", params);
 	    
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
	 	
	 		//Image newimage = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/snuggle tex error.jpg");
	 		Image newimage = new Image(Display.getCurrent(),imageData);
	 		this.photoLabel.setImage(newimage);
		
		}
		
	}
}



