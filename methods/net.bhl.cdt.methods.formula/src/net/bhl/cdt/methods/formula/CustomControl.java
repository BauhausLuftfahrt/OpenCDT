/*package net.bhl.cdt.methods.formula;

import org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl;
import org.eclipse.emf.ecp.view.spi.custom.swt.ECPAbstractCustomControlSWT;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.renderer.NoPropertyDescriptorFoundExeption;
import org.eclipse.emf.ecp.view.spi.renderer.NoRendererFoundException;
import org.eclipse.emfforms.spi.swt.core.layout.GridDescriptionFactory;
import org.eclipse.emfforms.spi.swt.core.layout.SWTGridCell;
import org.eclipse.emfforms.spi.swt.core.layout.SWTGridDescription;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import formula.FormulaPackage;

public class CustomControl extends ECPAbstractCustomControlSWT {

	public CustomControl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void disposeCustomControl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void handleContentValidation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SWTGridDescription getGridDescription() {
		return GridDescriptionFactory.INSTANCE.createSimpleGrid(1, 1, null);

	}

	@Override
	public Control renderControl(SWTGridCell cell, Composite composite)
			throws NoRendererFoundException, NoPropertyDescriptorFoundExeption {
		
		Composite parent = new Composite(composite, SWT.NONE);
        //parent.setLayout(new FillLayout(SWT.VERTICAL));
        
        Label userAttributes=new Label(parent, SWT.NONE);
        userAttributes.setText("User Attributes");
        userAttributes.setAlignment(SWT.None);
		
		System.out.println("run render control");  
        
        VDomainModelReference domainModelRefLatexString = getResolvedDomainModelReference(FormulaPackage.eINSTANCE.getFormula_LatexString()); 

        getControl(SWTControl.class,domainModelRefLatexString).createControl(parent);
        
        return parent;

	}

}
*/