package net.bhl.cdt.methods.formula;

import java.awt.Desktop;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import formula.Formula;
import formula.FormulaFactory;
import formula.FormulaPackage;
import formula.FormulaRepository;
import formula.impl.FormulaImpl;

public class ControlRenderer extends TextControlSWTRenderer {

	ViewModelContext viewContext;
	VControl vElement;
	EMFFormsDatabinding databinding;
	DataBindingContext dataBindingContext;
	IObservableValue modelValue;
	
	private Text latexString;


	@Inject
	public ControlRenderer(VControl vElement, ViewModelContext viewContext,
		ReportService reportService,
		EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
		VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {
		
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider,
			emfFormsEditSupport);
		
		this.viewContext = viewContext;
		this.vElement = vElement;
		
	}
	
	
	@Override
	protected Control createSWTControl(Composite parent) {
		
		final FormulaRepository formulaRepository = createFormulaRepository();
		
		final Composite main = new Composite(parent, SWT.NONE);
		
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		
		GridDataFactory.fillDefaults().grab(true, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
		
		latexString = new Text(parent, SWT.NONE);

		
		final Control control = super.createSWTControl(main);

		
		/*DataBindingContext bindingContext = new DataBindingContext();
        bindingContext.bindValue(
                        WidgetProperties.text(SWT.Modify).observe(latexString),
                        EMFProperties.value(FormulaPackage.Literals.FORMULA__LATEX_STRING).observe(formulaRepository));
*/
        
		final Button button = new Button(main, SWT.PUSH);
		button.setText("Show"); 
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				/*FormulaPackage.eINSTANCE.eClass();
				FormulaFactory factory = FormulaFactory.eINSTANCE;
				FormulaRepository repo = factory.createFormulaRepository();
				repo.setName("sanghun");*/
				
				/*VDomainModelReference dmr=vElement.getDomainModelReference();
				//Text textControl = new Text(parent, SWT.SINGLE);
				final IObservableValue value = SWTObservables.observeText(control, SWT.FocusOut);
				
				try {
					modelValue = databinding.getObservableValue(dmr,viewContext.getDomainModel());
				} catch (DatabindingFailedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				final Binding binding = dataBindingContext.bindValue(value, modelValue, null, null);*/
				
				
				
				//final Formula formula = factory.eGet(feature);
				
				
				//System.out.println("sanghun : "+ repo.getName()  );
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.getNsPrefix());
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.toString());
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.getFormula_Name());
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.getFormulaFactory());
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.getFormulaRepository_Formulas());
				System.out.println("sanghun : "+ FormulaPackage.eINSTANCE.getFormulaRepository_Name());
				System.out.println("sanghun : "+ viewContext.getDomainModel());
				System.out.println("sanghun : "+ viewContext.getDomainModel().eGet(FormulaPackage.Literals.FORMULA__LATEX_STRING));

				//System.out.println("sanghun : "+ viewContext.getDomainModel());
				





				//FormulaPackage.eINSTANCE.getFormula_LatexString().toString()
			/*	try {
					Desktop.getDesktop().mail(
						URI.create("mailto:" //$NON-NLS-1$
							+ getModelValue().getValue()));
					
					//System.out.println("sanghun");
				} catch (final IOException e1) {
					// ignore failure to open mailto
				} catch (final DatabindingFailedException ex) {
					getReportService().report(new DatabindingFailedReport(ex));
					// ignore failure to open mailto
				}*/
			}
		});
		return control;
	}
	
	private FormulaRepository createFormulaRepository(){
		
		FormulaPackage.eINSTANCE.eClass();
		
		FormulaFactory factory = FormulaFactory.eINSTANCE;

        final FormulaRepository formulaRepository = factory.createFormulaRepository();

		return formulaRepository;
		
	}
	

}
