package net.bhl.cdt.reconstruct.cdtmodel;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.inject.Inject;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import formula.Formula;
import formula.FormulaPackage;
import net.sourceforge.jeuclid.MathMLParserSupport;
import net.sourceforge.jeuclid.MutableLayoutContext;
import net.sourceforge.jeuclid.context.LayoutContextImpl;
import net.sourceforge.jeuclid.context.Parameter;
import net.sourceforge.jeuclid.converter.Converter;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;

public class CustomFormControlFactory extends FormControlFactory {
	
	//private ViewModelContext viewContext;
	private Boolean assignLatex;
	private Image image;
	private Image newimage;
	private ImageData imageData;
	private CLabel imageLabelC;
	private int newWidth;
	private int newHeight;
	private int width;
	private int height;
	private  Canvas canvas;
	
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
				if(latexFormel == ""){
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
	
				/*ImageData data = new ImageData("C://Users/sanghun.cho/Desktop/eclipse_image.png"); 
				newimage = new Image(Display.getCurrent(), data);
				System.out.println("Sanghun: " + latexString.getText());
				imageLabelC.setImage(newimage);*/
			
		
					
			}
		}); 
		
		
		/*imageLabelC = new CLabel(composite, SWT.BORDER);
		image = new Image(Display.getCurrent(), 700, 50);
		width = image.getBounds().width;
 		height = image.getBounds().height;
 		
 		System.out.println("width : " + width);
 		System.out.println("height : " + height);
 		
		imageLabelC.setImage(image);*/

		/**
		 * each function of button is implemented.
		 * */
		
		//parsleyCustomButton(showButton, latexString, _parent);
        //image = new Image(Display.getCurrent(), 900, 100);	
        ImageData data = new ImageData("C://Users/sanghun.cho/Desktop/eclipse_image.png"); 
		image = new Image(Display.getCurrent(), data);
        canvas = new Canvas(composite, SWT.FILL);
        final GridData d = new GridData();
        d.widthHint = 700;
        d.heightHint = 50;
        canvas.setLayoutData(d);
        

		return composite;
		
		//ImageData data = new ImageData("C://Users/sanghun.cho/Desktop/eclipse_image.png"); 
	
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
				if(latexFormel == ""){
					/**
					 * when the latexformel-string is empty, then the message-box pops up to warn.
					 */
					openLatexMessageBox();
					
				}else{
					
				}
	
				/*ImageData data = new ImageData("C://Users/sanghun.cho/Desktop/eclipse_image.png"); 
				newimage = new Image(Display.getCurrent(), data);
				System.out.println("Sanghun: " + latexString.getText());
				imageLabelC.setImage(newimage);*/
			
		
					
			}
		});       
      	
	}
	private void createNewImage(String latexFormel, Composite composite) throws SAXException, ParserConfigurationException, IOException {
		
		System.out.println("createNewImage : " + latexFormel);
		
		SnuggleEngine engine  = new SnuggleEngine();		
		SnuggleSession session = engine.createSession();  
		SnuggleInput input = new SnuggleInput(latexFormel);
		session.getConfiguration().setFailingFast(true);
		
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
		 		
		 		//this.imageLabelC.setImage(newimage);
		 		
		 		newWidth = newimage.getBounds().width;
		 		newHeight = newimage.getBounds().height;
		 		
		 		System.out.println("newWidth : " + newWidth);
		 		System.out.println("newHeight : " + newHeight);
		 		
		 		/**
		 		 * the size of the image gets scaled down.  
		 		 */
		 		/*if(( newWidth > 900 && newWidth < 1200 ) && ( newHeight <= 100  )){		
		 			
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
		 			
		 		}*/
		 		
		 		
		 		/*imageLabelC.setImage(newimage);
		 		composite.redraw();
	 			composite.update();
	 			System.out.println("update");*/
		 		
		 		
		 		canvas.addPaintListener(new PaintListener() {
					  public void paintControl(PaintEvent e) {
						  
					    e.gc.drawImage(newimage, 0, 0);
					    image.dispose();
					    System.out.println(" canvas listner");
					    System.out.println(" canvas listner width " + newimage.getImageData().width);
					    System.out.println(" canvas listner height " + newimage.getImageData().height);
					  }
					});
		 		canvas.redraw();
		 		canvas.update();

			}
		 		 
		 		
				 /*canvas.addPaintListener(new PaintListener() {
					  public void paintControl(PaintEvent e) {
					    e.gc.drawImage(newimage, 0, 0, newimage.getImageData().width, newimage.getImageData().height, 0, 0, newimage.getImageData().width, newimage.getImageData().height);   
					    System.out.println(" canvas listner");
					    System.out.println(" canvas listner width " + newimage.getImageData().width);
					    System.out.println(" canvas listner height " + newimage.getImageData().height);
					  }
					});
				 
		}*/
		 	
		
		 
		
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
