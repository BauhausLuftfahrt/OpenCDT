package net.bhl.cdt.ui.editors;

import java.util.List;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.ui.editors.calculation.CalculationEditorInput;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
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
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.jface.viewers.ComboViewer;

public class CalculationEditor extends EditorPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "net.bhl.cdt.ui.editors.CalculationEditor"; //$NON-NLS-1$
	private Text calculationName;
	private CalculationEditorInput input;
	
	private List<Function> functions;
	private Text functionID;

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
		lblFunction.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblFunction.setText("Function ID");

		Composite composite_1 = new Composite(container, SWT.NONE);
		FormData fd_composite_1 = new FormData();
		fd_composite_1.right = new FormAttachment(composite, 0, SWT.RIGHT);
		fd_composite_1.bottom = new FormAttachment(composite, 390, SWT.BOTTOM);
		fd_composite_1.top = new FormAttachment(composite, 6);
		
		functionID = new Text(composite, SWT.BORDER);
		functionID.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		fd_composite_1.left = new FormAttachment(0, 10);
		composite_1.setLayoutData(fd_composite_1);
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
		setPartName("Parameter mapping editor");
		functions = CalculationRepositoryManager.getInstance().getFunctions(UtilitiesHelper.getProjectId(input.getCalculation()));
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
		IObservableValue observeTextCalculationNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(calculationName);
		IObservableValue calculationnameInputObserveValue = PojoProperties.value("calculation.name").observe(input);
		bindingContext.bindValue(observeTextCalculationNameObserveWidget, calculationnameInputObserveValue, null, null);
		//
		IObservableValue observeTextFunctionIDObserveWidget = WidgetProperties.text(SWT.Modify).observe(functionID);
		IObservableValue calculationfunctionIDInputObserveValue = PojoProperties.value("calculation.functionID").observe(input);
		bindingContext.bindValue(observeTextFunctionIDObserveWidget, calculationfunctionIDInputObserveValue, null, null);
		//
		return bindingContext;
	}
}
