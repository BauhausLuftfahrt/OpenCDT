/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
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
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
import swing2swt.layout.BorderLayout;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * Creates the parameter mapping editor.
 * Parameter mappings are persisted in EMFStore upon drop-down selection.
 * Name ist persisted by Listeners upon focusLost or Enter key.
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
	private Group grpInputParameters;
	private Group grpOutputParameters;

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent parent Composite
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new BorderLayout(0, 0));

		grpInputParameters = new Group(container, SWT.NONE);
		grpInputParameters.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpInputParameters.setLayoutData(BorderLayout.CENTER);
		grpInputParameters.setText("Input Parameters");
		grpInputParameters.setLayout(new GridLayout(2, false));

		grpOutputParameters = new Group(container, SWT.NONE);
		grpOutputParameters.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpOutputParameters.setLayoutData(BorderLayout.SOUTH);
		grpOutputParameters.setText("Output Parameters");
		grpOutputParameters.setLayout(new GridLayout(2, false));

		Group grpParameterMapping = new Group(container, SWT.NONE);
		grpParameterMapping.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpParameterMapping.setLayoutData(BorderLayout.NORTH);
		grpParameterMapping.setText("Parameter Mapping");
		grpParameterMapping.setLayout(new GridLayout(2, false));

		Label lblName = new Label(grpParameterMapping, SWT.NONE);
		lblName.setText("Name");

		calculationName = new Text(grpParameterMapping, SWT.BORDER);
		GridData gd_calculationName = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		gd_calculationName.widthHint = 461;
		calculationName.setLayoutData(gd_calculationName);

		calculationName.addFocusListener(new NameListener());
		calculationName.addKeyListener(new NameKeyListener());

		Label lblFunction = new Label(grpParameterMapping, SWT.NONE);
		lblFunction.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		lblFunction.setText("Function ID");

		lblNewLabel = new Label(grpParameterMapping, SWT.BORDER);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true, 1, 1));
		lblNewLabel.setText("");

		generateMappingGUI();
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
	 * Retrieves a list of parameter interfaces of the configuration. Removes parameters from the list.
	 * 
	 * @param configuration
	 * @param component
	 * @return list of parameter interfaces without parameters
	 */
	private List<MappableComponentInterface> getParameterInterfaces(Configuration configuration, Component component) {
		// Get list of all mappable interfaces of the current configuration
		List<MappableComponentInterface> parameterInterfaces = ComponentInterfaceUtil.getComponentInterfaces(
			configuration, MappableComponentInterface.class);

		// Remove instances of class Parameter from the list of interfaces, as parameters are considered private.
		Iterator<MappableComponentInterface> parameterInterfacesIterator = parameterInterfaces.iterator();
		while (parameterInterfacesIterator.hasNext()) {
			MappableComponentInterface pi = parameterInterfacesIterator.next();
			if (pi instanceof Parameter) {
				parameterInterfacesIterator.remove();
			}
		}

		// Sort mappable interfaces by their names
		Collections.sort(parameterInterfaces, new NameComparator());

		// If the calculationSet of the selected calculation is attached to a component, the calculationSet is
		// considered to be private. The parameters of such a component are intended to be directly accessible.
		List<Parameter> componentParameters = new ArrayList<Parameter>();
		if (component != null) {
			componentParameters.addAll(component.getParameters());
			// We sort them alphabetically..
			Collections.sort(componentParameters, new NameComparator());
			// We add the parameters to the overall parameterInterfaces list
			parameterInterfaces.addAll(componentParameters);
		}
		return parameterInterfaces;
	}

	private void generateMappingGUI(final EMap<ParameterDescriptor, MappableComponentInterface> mappables,
		List<MappableComponentInterface> parameterInterfaces, Composite composite) {
		Iterator<Entry<ParameterDescriptor, MappableComponentInterface>> mappablesIterator = mappables.iterator();

		// Iterate over mappables and generate GUI elements (label, comboViewer) for each item
		while (mappablesIterator.hasNext()) {
			Entry<ParameterDescriptor, MappableComponentInterface> entry = mappablesIterator.next();
			Label descriptorLabel = new Label(composite, SWT.NONE);
			ParameterDescriptor descriptor = entry.getKey();

			descriptorLabel.setText(descriptor.getLabel());

			ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
			comboViewer.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

			ObservableListContentProvider contentProvider = new ObservableListContentProvider();
			comboViewer.setContentProvider(contentProvider);
			comboViewer.setLabelProvider(new ComboViewerLabelProvider());

			// Generate a list of inputs that form the basis of the comboViewer. The list is filtered by the allowed
			// Quantity for the specific parameter. The wrapper is needed to have access to the mappable key from
			// inside the event listener.
			List<ComboViewerItem> comboViewerItemList = new ArrayList<ComboViewerItem>();
			Iterator<MappableComponentInterface> parameterInterfacesIterator = parameterInterfaces.iterator();
			while (parameterInterfacesIterator.hasNext()) {
				MappableComponentInterface mci = parameterInterfacesIterator.next();
				if (mci.getQuantity().equals(descriptor.getQuantity()))
					comboViewerItemList.add(new ComboViewerItem(mci, descriptor));
			}

			IObservableList input = Properties.selfList(Parameter.class).observe(comboViewerItemList);
			comboViewer.setInput(input);

			// if a mapping exists for a given item, set its parameter name in comboViever
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
							mappables.put(cvi.getParameterDescriptor(), cvi.getMappableComponentInterface());
						}
					}.run();
				}
			});
		}
	}

	/**
	 * Dynamically generates the mapping GUI elements depending on the parameter mapping of the selected calculation.
	 * 
	 * @param functionID
	 * @param composite
	 */
	private void generateMappingGUI() {
		// Get mapping of the current calculation
		ParameterMapping mapping = calculation.getParameterMapping();

		// Get mappable parameter interfaces
		List<MappableComponentInterface> parameterInterfaces = getParameterInterfaces(configuration, component);

		generateMappingGUI(mapping.getInputMappables(), parameterInterfaces, grpInputParameters);
		generateMappingGUI(mapping.getOutputMappables(), parameterInterfaces, grpOutputParameters);
	}

	/**
	 * Hack for persisting name change in EMFStore. This listener is necessary as changes to the EMF model are not
	 * automagically persisted to EMFStore.
	 * 
	 * @author stephan.leutenmayr
	 */
	class NameListener implements FocusListener {
		@Override
		public void focusGained(FocusEvent e) {
		}

		@Override
		public void focusLost(final FocusEvent e) {
			// Run CDTCommand for setting name
			(new CDTCommand() {
				@Override
				protected void doRun() {
					calculation.setName(((Text) e.getSource()).getText());
				}
			}).run();
		}
	}

	/**
	 * Implements the same as the NameListener, just for storing name upon hitting Enter
	 */
	class NameKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(final KeyEvent e) {
			if (e.keyCode == SWT.CR) {
				// Run CDTCommand for setting name
				(new CDTCommand() {
					@Override
					protected void doRun() {
						calculation.setName(((Text) e.getSource()).getText());
					}
				}).run();
			}
		}
	}
}
