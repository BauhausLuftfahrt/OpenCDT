/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import java.util.Collections;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.calculation.CalculationPackage;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.ui.editors.calculation.NameComparator;
import net.bhl.cdt.ui.editors.calculationset.ComboViewerLabelProvider;
import net.bhl.cdt.ui.editors.calculationset.CalculationSetEditorInput;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage;
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
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.emf.databinding.EMFObservables;
import net.bhl.cdt.utilities.exchangemodel.ExchangemodelPackage.Literals;

/**
 * Creates the calculation set editor. Name is persisted using Listeners for focusLost and Enter key. Function is
 * persisted upon drop-down selection. Function assignment can be removed (== null) by "x" button. A calculation set is
 * considered private iff it has a component assigned to it (!= null).
 * 
 * @author stephan.leutenmayr
 */
public class CalculationSetEditor extends EditorPart {
	public CalculationSetEditor() {
	}

	private DataBindingContext m_bindingContext;
	public static final String ID = "net.bhl.cdt.ui.editors.CalculationSetEditor"; //$NON-NLS-1$
	private CalculationSetEditorInput input;
	private CalculationSet calculationSet;
	private Text nameText;

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
		Collections.sort(componentList, new NameComparator());
		IObservableList comboInput = Properties.selfList(Parameter.class).observe(componentList);

		Group grpCalculationSet = new Group(parent, SWT.NONE);
		grpCalculationSet.setToolTipText("set component to null");
		grpCalculationSet.setText("Calculation Set");
		grpCalculationSet.setLayout(new GridLayout(3, false));

		Label lblName = new Label(grpCalculationSet, SWT.NONE);
		lblName.setText("Name");

		nameText = new Text(grpCalculationSet, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		nameText.addFocusListener(new NameListener());
		nameText.addKeyListener(new NameKeyListener());
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
				}.execute();
			}
		});
		final Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboViewer.setContentProvider(contentProvider);
		comboViewer.setLabelProvider(new ComboViewerLabelProvider());
		comboViewer.setInput(comboInput);

		// Button for removing component assignment
		Button deleteButton = new Button(grpCalculationSet, SWT.PUSH);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				(new CDTCommand() {
					@Override
					protected void doRun() {
						calculationSet.setComponent(null);
					}
				}).execute();
				combo.deselectAll();
			}
		});
		deleteButton.setText("X");

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

	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(IEditorSite site, IEditorInput i) throws PartInitException {
		input = (CalculationSetEditorInput) i;
		setSite(site);
		setInput(input);
		calculationSet = input.getCalculationSet();
		if (calculationSet.getName() == null) {
			(new CDTCommand() {
				@Override
				protected void doRun() {
					calculationSet.setName("New Set");
				}
			}).execute();
		}
		setPartName("Set " + calculationSet.getName());
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
		IObservableValue observeTextNameTextObserveWidget = WidgetProperties.text(
			new int[] { SWT.Modify, SWT.FocusOut }).observe(nameText);
		IObservableValue calculationSetNameObserveValue = EMFProperties.value(Literals.EXCHANGE_ELEMENT__NAME).observe(
			calculationSet);
		bindingContext.bindValue(observeTextNameTextObserveWidget, calculationSetNameObserveValue, null, null);
		//
		return bindingContext;
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
					calculationSet.setName(((Text) e.getSource()).getText());
				}
			}).execute();
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
						calculationSet.setName(((Text) e.getSource()).getText());
					}
				}).execute();
			}
		}
	}
}
