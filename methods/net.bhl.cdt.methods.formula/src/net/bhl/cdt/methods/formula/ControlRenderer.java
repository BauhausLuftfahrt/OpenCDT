package net.bhl.cdt.methods.formula;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;

import javax.inject.Inject;

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
import org.eclipse.swt.widgets.Text;

import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.impl.FormulaImpl;


public class ControlRenderer extends TextControlSWTRenderer {

	private ViewModelContext viewContext;
	private Label photoLabel;
	//private Image image;

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
		
		/*this.photoLabel = new Label(main, SWT.DOWN);
		
		Image image = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/stackoverflow.jpg");
		photoLabel.setImage(image);*/
		
		//photoLabel.setLocation(500, 500);
		//Display display = new Display();

		
		
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		
		GridDataFactory.fillDefaults().grab(true, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
				
		final Control control = super.createSWTControl(main);
        
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Show"); 
		this.photoLabel = new Label(main, SWT.DOWN);
		
		Image image = new Image(Display.getCurrent(),"C://Users/sanghun.cho/Desktop/stackoverflow.jpg");
		photoLabel.setImage(image);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				 /*final File outFile = new File("stackoverflow.jpg");
				
				 final MutableLayoutContext params = new LayoutContextImpl(
		 	    		  LayoutContextImpl.getDefaultLayoutContext());
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
			 		Image image = new Image(Display.getCurrent(), imageData);*/
		 		
			 		
			 		//photoLabel.setImage(image);
				
				
			
				System.out.println("sanghun : "+ viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING));

			}
		});
		
		
		
		
		
		return control;
	}


}
