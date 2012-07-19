package net.bhl.cdt.ui.editors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Element;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;
import net.bhl.cdt.ui.editors.calculation.CalculationEditorInput;
import net.bhl.cdt.ui.editors.calculation.ComboViewerItem;
import net.bhl.cdt.ui.editors.calculation.ComboViewerLabelProvider;
import net.bhl.cdt.ui.editors.calculation.NameComparator;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
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
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.internal.ole.win32.COMObject;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.wb.swt.layout.grouplayout.GroupLayout;

/**
 * This class is responsible for creating the parameter mapping editor.
 * 
 * @author stephan.leutenmayr
 */
public class CalculationEditor extends EditorPart {
	public CalculationEditor() {
	}

	private DataBindingContext m_bindingContext;

	public static final String ID = "net.bhl.cdt.ui.editors.CalculationEditor"; //$NON-NLS-1$
	private Text calculationName;
	private Calculation calculation;
	private CalculationEditorInput input;
	private Component component;
	private Label lblNewLabel;
	private Configuration configuration;

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent parent Composite
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FormLayout());

		Composite composite = new Composite(container, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.top = new FormAttachment(0, 10);
		fd_composite.left = new FormAttachment(0, 10);
		fd_composite.bottom = new FormAttachment(0, 83);
		fd_composite.right = new FormAttachment(100, -10);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new GridLayout(2, false));
		new Label(composite, SWT.NONE);

		Label lblParameterMapping = new Label(composite, SWT.NONE);
		lblParameterMapping.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblParameterMapping.setText("Parameter Mapping");

		Label lblName = new Label(composite, SWT.NONE);
		GridData gd_lblName = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblName.widthHint = 59;
		lblName.setLayoutData(gd_lblName);
		lblName.setText("Name");

		calculationName = new Text(composite, SWT.BORDER);
		GridData gd_calculationName = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_calculationName.widthHint = 452;
		calculationName.setLayoutData(gd_calculationName);

		Label lblFunction = new Label(composite, SWT.NONE);
		lblFunction.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFunction.setText("Function ID");

		lblNewLabel = new Label(composite, SWT.BORDER);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("");

		Composite paramComposite = new Composite(container, SWT.NONE);
		FormData fd_paramComposite = new FormData();
		fd_paramComposite.top = new FormAttachment(composite, 6);
		fd_paramComposite.left = new FormAttachment(0, 10);
		fd_paramComposite.bottom = new FormAttachment(100, -10);
		fd_paramComposite.right = new FormAttachment(100, -10);
		paramComposite.setLayoutData(fd_paramComposite);
		paramComposite.setLayout(new GridLayout(2, false));

		createMappingGUI(calculation.getFunctionID(), paramComposite);
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
		configuration = UtilitiesHelper.getParent(Configuration.class, calculation);
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
		IObservableValue observeTextLblNewLabelObserveWidget = WidgetProperties.text().observe(lblNewLabel);
		IObservableValue calculationfunctionIDInputObserveValue = PojoProperties.value("calculation.functionID")
			.observe(input);
		bindingContext.bindValue(observeTextLblNewLabelObserveWidget, calculationfunctionIDInputObserveValue, null,
			null);
		//
		return bindingContext;
	}

	/**
	 * Dynamically generates the mapping GUI elements.
	 * 
	 * @param functionID
	 * @param composite
	 */
	private void createMappingGUI(String functionID, Composite composite) {
		Function selectedFunction = CalculationRepositoryManager.getInstance().getFunction(
			UtilitiesHelper.getProjectId(calculation), functionID);

		// Get list of mappable interfaces from the configuration
		List<MappableComponentInterface> parameterInterfaces = ComponentInterfaceUtil.getComponentInterfaces(
			configuration, MappableComponentInterface.class);

		// Remove instances of Parameter from the list of interfaces
		Iterator<MappableComponentInterface> parameterInterfacesIterator = parameterInterfaces.iterator();
		while (parameterInterfacesIterator.hasNext()) {
			MappableComponentInterface pi = parameterInterfacesIterator.next();
			if (pi instanceof Parameter)
				parameterInterfacesIterator.remove();
		}

		// Sort mappable interfaces by their names
		Collections.sort(parameterInterfaces, new NameComparator());

		// If the calculationSet of the selected calculation is attached to a component, the calculationSet is
		// considered to be private. The parameter of such a component are intended to be directly accessible.
		List<Parameter> parameterList = new ArrayList<Parameter>();
		if (component != null) {
			parameterList.addAll(component.getParameters()) ;
			//parameterList = UtilitiesHelper.getChildrenByClass(component, Parameter.class) ;//= component.getParameters();
			// Sort..
			Collections.sort(parameterList, new NameComparator());
			parameterInterfaces.addAll(parameterList);
		}

		ParameterMapping mapping = calculation.getParameterMapping();

		final EMap<ParameterDescriptor, MappableComponentInterface> iMappables = mapping.getInputMappables();
		Iterator<Entry<ParameterDescriptor, MappableComponentInterface>> iMappablesIterator = iMappables.iterator();

		// Iterate over mappables and generate GUI elements (label, comboViewer) for each item
		while (iMappablesIterator.hasNext()) {
			Entry<ParameterDescriptor, MappableComponentInterface> entry = iMappablesIterator.next();
			Label descriptorLabel = new Label(composite, SWT.NONE);
			ParameterDescriptor descriptor = entry.getKey();

			descriptorLabel.setText("Input: " + descriptor.getLabel());

			ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
			comboViewer.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

			ObservableListContentProvider contentProvider = new ObservableListContentProvider();
			comboViewer.setContentProvider(contentProvider);
			comboViewer.setLabelProvider(new ComboViewerLabelProvider());

			// Generate a list of inputs that form the basis of the comboViewer. The list is filtered by the allowed
			// Quantity for the specific parameter. The wrapper is neeeded to have access to the mappable key from
			// inside the event listener.
			List<ComboViewerItem> comboViewerItemList = new ArrayList<ComboViewerItem>();
			parameterInterfacesIterator = parameterInterfaces.iterator();
			while (parameterInterfacesIterator.hasNext()) {
				MappableComponentInterface mci = parameterInterfacesIterator.next();
				if (mci.getQuantity().equals(descriptor.getQuantity()))
					comboViewerItemList.add(new ComboViewerItem(mci, descriptor));
			}

			IObservableList input = Properties.selfList(Parameter.class).observe(comboViewerItemList);
			comboViewer.setInput(input);

			// if a mapping exists for a given item, set parameter name in comboViever
			if (entry.getValue() != null)
				comboViewer.getCombo().setText(entry.getValue().getName());

			// Persist selection on change
			comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					final ComboViewerItem cvi = (ComboViewerItem) ((IStructuredSelection) event.getSelection())
						.getFirstElement();
					new CDTCommand() {
						@Override
						protected void doRun() {
							iMappables.put(cvi.getParameterDescriptor(), cvi.getMappableComponentInterface());
						}
					}.run();
				}
			});
		}

		// TODO: refactor code for oMappables
		EMap<ParameterDescriptor, MappableComponentInterface> oMappables = mapping.getOutputMappables();
		Iterator<Entry<ParameterDescriptor, MappableComponentInterface>> oMappablesIterator = oMappables.iterator();

		while (oMappablesIterator.hasNext()) {
			Entry<ParameterDescriptor, MappableComponentInterface> entry = oMappablesIterator.next();
			Label descriptorLabel = new Label(composite, SWT.NONE);
			descriptorLabel.setText("Output: " + entry.getKey().getLabel());

			ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
		}

		composite.layout();
	}
}
