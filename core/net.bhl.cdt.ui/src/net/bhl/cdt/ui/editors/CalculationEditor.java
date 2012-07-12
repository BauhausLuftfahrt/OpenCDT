package net.bhl.cdt.ui.editors;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.ui.editors.calculation.CalculationEditorInput;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;

public class CalculationEditor extends EditorPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "net.bhl.cdt.ui.editors.CalculationEditor"; //$NON-NLS-1$
	private Text calculationName;
	private Calculation calculation;
	private CalculationEditorInput input;
	private List<Parameter> parameterList;
	private Component component;
	private Combo functionIDCombo;

	public CalculationEditor() {
		super();
	}

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FormLayout());

		Composite composite = new Composite(container, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 74);
		fd_composite.right = new FormAttachment(0, 584);
		fd_composite.top = new FormAttachment(0, 10);
		fd_composite.left = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new GridLayout(2, false));

		Label lblName = new Label(composite, SWT.NONE);
		GridData gd_lblName = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblName.widthHint = 59;
		lblName.setLayoutData(gd_lblName);
		lblName.setText("Name");

		calculationName = new Text(composite, SWT.BORDER);
		GridData gd_calculationName = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_calculationName.widthHint = 439;
		calculationName.setLayoutData(gd_calculationName);

		Label lblFunction = new Label(composite, SWT.NONE);
		lblFunction.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFunction.setText("Function ID");

		final Composite parameterComposite = new Composite(container, SWT.NONE);
		parameterComposite.setLayout(new GridLayout(2, false));
		FormData fd_parameterComposite = new FormData();
		fd_parameterComposite.bottom = new FormAttachment(100, -10);
		fd_parameterComposite.right = new FormAttachment(composite, 0, SWT.RIGHT);
		fd_parameterComposite.top = new FormAttachment(composite, 6);
		fd_parameterComposite.left = new FormAttachment(composite, 0, SWT.LEFT);
		parameterComposite.setLayoutData(fd_parameterComposite);

		functionIDCombo = new Combo(composite, SWT.NONE);
		functionIDCombo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				createMappingGUI(((Combo) e.getSource()).getText(), parameterComposite);
			}
		});
		functionIDCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		m_bindingContext = initDataBindings();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// Do the Save operation
	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(IEditorSite site, IEditorInput i) throws PartInitException {
		input = (CalculationEditorInput) i;
		setSite(site);
		setInput(input);
		calculation = input.getCalculation();
		component = ((CalculationSet) calculation.eContainer()).getComponent();
		setPartName(input.getCalculation().getName() + (component != null ? " (private)" : ""));
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextCalculationNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(
			calculationName);
		IObservableValue calculationnameInputObserveValue = PojoProperties.value("calculation.name").observe(input);
		bindingContext.bindValue(observeTextCalculationNameObserveWidget, calculationnameInputObserveValue, null, null);
		//
		IObservableList itemsFunctionIDObserveWidget = WidgetProperties.items().observe(functionIDCombo);
		IObservableList functionIDsInputObserveList = PojoProperties.list("functionIDs").observe(input);
		bindingContext.bindList(itemsFunctionIDObserveWidget, functionIDsInputObserveList, null, null);
		//
		IObservableValue observeSelectionFunctionIDObserveWidget = WidgetProperties.selection()
			.observe(functionIDCombo);
		IObservableValue calculationfunctionIDInputObserveValue = PojoProperties.value("calculation.functionID")
			.observe(input);
		bindingContext.bindValue(observeSelectionFunctionIDObserveWidget, calculationfunctionIDInputObserveValue, null,
			null);
		//
		return bindingContext;
	}

	private void createMappingGUI(String functionID, Composite composite) {
		Function selectedFunction = CalculationRepositoryManager.getInstance().getFunction(
			UtilitiesHelper.getProjectId(calculation), functionID);

		if (selectedFunction != null) {
			// remove previous descriptors from UI
			for (Control tmp : composite.getChildren()) {
				tmp.dispose();
			}

			// generate parameter list of corresponding component
			if (component != null) {
				parameterList = component.getParameters();
			}

			ParameterMapping mapping = calculation.getParameterMapping();
			if (mapping != null) {
				EMap<ParameterDescriptor, MappableComponentInterface> iMappables = mapping.getInputMappables();
				Iterator<Entry<ParameterDescriptor, MappableComponentInterface>> iMappablesIterator = iMappables
					.iterator();

				while (iMappablesIterator.hasNext()) {
					Entry<ParameterDescriptor, MappableComponentInterface> entry = iMappablesIterator.next();
					Label descriptorLabel = new Label(composite, SWT.NONE);
					descriptorLabel.setText(entry.getKey().getLabel());

					ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
					// parameterCombo.setText(mapping.getInputMappables().get(descriptor).getName());
				}
			} else {
				// generate new Mapping and fill with descriptors
				// get current descriptors
				EList<ParameterDescriptor> inputDescriptors = selectedFunction.getInputDescriptors();

				Iterator<ParameterDescriptor> inputIterator = inputDescriptors.iterator();
				while (inputIterator.hasNext()) {
					// final ParameterDescriptor descriptor = inputIterator.next();
					//
					// Combo parameterCombo = new Combo(composite, SWT.READ_ONLY);
					//
					// GridDataFactory.fillDefaults().applyTo(parameterCombo);

				}

				EList<ParameterDescriptor> outputDescriptors = selectedFunction.getOutputDescriptors();
				// generate ParameterMapping Table here
			}
			composite.layout();
		}
	}
}
