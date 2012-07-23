/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.ui.editors.calculationset.ComboViewerLabelProvider;
import net.bhl.cdt.ui.editors.calculationset.CalculationSetEditorInput;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * Creates the parameter mapping editor.
 * 
 * @author stephan.leutenmayr
 */
public class CalculationSetEditor extends EditorPart {
	public CalculationSetEditor() {
	}

	private DataBindingContext m_bindingContext;

	public static final String ID = "net.bhl.cdt.ui.editors.CalculationSetEditor"; //$NON-NLS-1$
	private CalculationSet calculationSet;
	private Component component;
	private Text text;

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent parent Composite
	 */
	@Override
	public void createPartControl(Composite parent) {

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();

		List<Component> componentList = UtilitiesHelper.getChildrenByClass(
			UtilitiesHelper.getParent(Configuration.class, calculationSet), Component.class);
		IObservableList input = Properties.selfList(Parameter.class).observe(componentList);

		Group grpCalculationSet = new Group(parent, SWT.NONE);
		grpCalculationSet.setToolTipText("set component to null");
		grpCalculationSet.setText("Calculation Set");
		grpCalculationSet.setLayout(new GridLayout(3, false));

		Label lblName = new Label(grpCalculationSet, SWT.NONE);
		lblName.setText("Name");

		text = new Text(grpCalculationSet, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpCalculationSet, SWT.NONE);

		Label lblComponent = new Label(grpCalculationSet, SWT.NONE);
		lblComponent.setText("Component");

		final ComboViewer comboViewer = new ComboViewer(grpCalculationSet, SWT.READ_ONLY);
		// Persist selection on change
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				final Component selectedComponent = (Component) ((IStructuredSelection) event.getSelection())
					.getFirstElement();
				new CDTCommand() {
					@Override
					protected void doRun() {
						calculationSet.setComponent(selectedComponent);
					}
				}.run();
			}
		});
		final Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboViewer.setContentProvider(contentProvider);
		comboViewer.setLabelProvider(new ComboViewerLabelProvider());
		comboViewer.setInput(input);

		Button btnNewButton = new Button(grpCalculationSet, SWT.PUSH);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				(new CDTCommand() {
					@Override
					protected void doRun() {
						calculationSet.setComponent(null);
					}
				}).run();
				// TODO: different data binding for comboViewer selection?
			comboViewer.refresh();
			}
		});
		btnNewButton.setText("X");

		if (calculationSet.getComponent() != null) {
			combo.setText(calculationSet.getComponent().getName());
		}

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
		CalculationSetEditorInput input = (CalculationSetEditorInput) i;
		setSite(site);
		setInput(input);
		calculationSet = input.getCalculationSet();
		component = calculationSet.getComponent();
		if (calculationSet.getName() == null) {
			(new CDTCommand() {

				@Override
				protected void doRun() {
					// TODO Auto-generated method stub
					calculationSet.setName("New Set");
				}
			}).run();
		}
		setPartName(calculationSet.getName() + (component != null ? " (private)" : ""));
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
		IObservableValue observeTextTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(text);
		IObservableValue nameCalculationSetObserveValue = PojoProperties.value("name").observe(calculationSet);
		bindingContext.bindValue(observeTextTextObserveWidget, nameCalculationSetObserveValue, null, null);
		//
		return bindingContext;
	}
}
