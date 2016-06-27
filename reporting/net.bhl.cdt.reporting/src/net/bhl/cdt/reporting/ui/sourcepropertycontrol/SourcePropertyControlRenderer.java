package net.bhl.cdt.reporting.ui.sourcepropertycontrol;

import java.util.ArrayList;

import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.SimpleControlSWTControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import reporting.DataSource;

public class SourcePropertyControlRenderer extends SimpleControlSWTControlSWTRenderer {

	/**
	 * Default constructor.
	 *
	 * @param vElement
	 *            the view model element to be rendered
	 * @param viewContext
	 *            the view context
	 * @param reportService
	 *            The {@link ReportService}
	 * @param emfFormsDatabinding
	 *            The {@link EMFFormsDatabinding}
	 * @param emfFormsLabelProvider
	 *            The {@link EMFFormsLabelProvider}
	 * @param vtViewTemplateProvider
	 *            The {@link VTViewTemplateProvider}
	 * @param emfFormsEditSupport
	 *            The {@link EMFFormsEditSupport}
	 */
	@Inject
	public SourcePropertyControlRenderer(VControl vElement, ViewModelContext viewContext, ReportService reportService,
			EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
			VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider);
	}

	@Override
	protected Binding[] createBindings(Control control) throws DatabindingFailedException {
		//final EStructuralFeature structuralFeature = (EStructuralFeature)getModelValue().getValueType();
		final Binding binding = bindValue(control, getModelValue(), getDataBindingContext());
		final Binding tooltipBinding = createTooltipBinding(control, getModelValue(), getDataBindingContext());
		return new Binding[] { binding, tooltipBinding };
	}

	@Override
	protected Control createSWTControl(Composite parent) throws DatabindingFailedException {
		Combo c = new Combo(parent, SWT.NONE);
		
		DataSource sourceObject = (DataSource)getViewModelContext().getDomainModel();

		if (sourceObject.getSourceObject() == null)
			return c;
		
		EList<EReference> containments = sourceObject.getSourceObject().eClass().getEAllContainments();
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for (EReference r : containments) {
			if (r.getUpperBound() > 1 || r.getUpperBound() == -1)
				strings.add(r.getName());
		}
		
		String[] stringArray = new String[strings.size()];
		stringArray = strings.toArray(stringArray);
		
		c.setItems(stringArray);
		
		return c;
	}

	@Override
	protected String getUnsetText() {
		return "Unset";
	}

	protected Binding bindValue(Control combo, IObservableValue modelValue, DataBindingContext dataBindingContext) {
		final IObservableValue value = WidgetProperties.singleSelectionIndex().observe(combo);
		final Binding binding = dataBindingContext.bindValue(value, modelValue);
		return binding;
	}

	protected Binding createTooltipBinding(Control combo, IObservableValue modelValue, DataBindingContext dataBindingContext) {
		final IObservableValue toolTip = WidgetProperties.tooltipText().observe(combo);
		return dataBindingContext.bindValue(toolTip, modelValue);
	}
}
