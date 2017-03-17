package net.bhl.cdt.methods.formula;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedReport;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;

import formula.FormulaPackage;

public class ControlSWTRendererService implements EMFFormsDIRendererService<VControl> {

	private EMFFormsDatabinding databindingService;
	private ReportService reportService;
	
	public ControlSWTRendererService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Called by the initializer to set the EMFFormsDatabinding.
	 *
	 * @param databindingService The EMFFormsDatabinding
	 */
	protected void setEMFFormsDatabinding(EMFFormsDatabinding databindingService) {
		this.databindingService = databindingService;
	}

	/**
	 * Called by the initializer to set the ReportService.
	 *
	 * @param reportService The ReportService
	 */
	protected void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}


	@Override
	public double isApplicable(VElement vElement, ViewModelContext viewModelContext) {
		
		if (!VControl.class.isInstance(vElement)) {
			return NOT_APPLICABLE;
		}
		final VControl control = (VControl) vElement;
		if (control.getDomainModelReference() == null) {
			return NOT_APPLICABLE;
		}
		@SuppressWarnings("rawtypes")
		IValueProperty valueProperty;
		try {
			valueProperty = databindingService.getValueProperty(control.getDomainModelReference(),
				viewModelContext.getDomainModel());
		} catch (final DatabindingFailedException ex) {
			reportService.report(new DatabindingFailedReport(ex));
			return NOT_APPLICABLE;
		}
		final EStructuralFeature eStructuralFeature = EStructuralFeature.class.cast(valueProperty.getValueType());
		if (FormulaPackage.eINSTANCE.getFormula_LatexString().equals(eStructuralFeature)) {
			return 10;
		}
		return NOT_APPLICABLE;
	}

	@Override
	public Class<? extends AbstractSWTRenderer<VControl>> getRendererClass() {
		return ControlRenderer.class;
	}

}
