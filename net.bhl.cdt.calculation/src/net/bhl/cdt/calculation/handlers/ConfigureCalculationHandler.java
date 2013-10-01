/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.handlers;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.StructuralElement;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.utilities.commands.CDTCommandWithResult;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.utilities.ActionHelper;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Handler which manages the configuration of calculation sets.
 * 
 * @author Michael Kagel
 * @author Otto von Wesendonk
 * @author Sven Ziemer
 */
public class ConfigureCalculationHandler extends AbstractCDTHandler {

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {
		CalculationRepositoryManager manager = CalculationRepositoryManager.getInstance();
		manager.reloadRepository();

		EObject selection = getSelection(event);

		CalculationSet set = null;

		if (selection instanceof CalculationSet) {
			set = (CalculationSet) selection;
		} else if (selection instanceof StructuralElement) {
			set = selectCalculationSet((StructuralElement) selection);
		}
		if (set != null) {
			ActionHelper.openModelElement(set, "");
		}

		return null;
	}

	private CalculationSet selectCalculationSet(final StructuralElement strucElement) {

		EList<CalculationSet> calculationSets = getCalculationSetsOfStructuralElement(strucElement);

		if (calculationSets.isEmpty()) {
			return new CDTCommandWithResult<CalculationSet>() {

				@Override
				protected CalculationSet doRun() {
					CalculationSet calculationSet = CalculationFactory.eINSTANCE.createCalculationSet();
					if (strucElement instanceof Component) {
						((Component) strucElement).getCalculationSets().add(calculationSet);
					} else if (strucElement instanceof Configuration) {
						((Configuration) strucElement).getCalculationSets().add(calculationSet);
					}
					return calculationSet;
				}
			}.run(false);
		}

		SetSelectorDialog dialog = new SetSelectorDialog(getShell(), calculationSets);

		if (dialog.open() == Window.OK) {
			return dialog.getCalculationSet();
		}

		return null;
	}

	/**
	 * @param strucElement
	 * @return
	 */
	private EList<CalculationSet> getCalculationSetsOfStructuralElement(StructuralElement strucElement) {
		EList<CalculationSet> calculationSets = null;
		if (strucElement instanceof Component) {
			calculationSets = ((Component) strucElement).getCalculationSets();
		} else if (strucElement instanceof Configuration) {
			calculationSets = ((Configuration) strucElement).getCalculationSets();
		}

		return calculationSets;
	}

	/**
	 * A dialog for selecting a calculation set from all sets of a given component.
	 * 
	 * @author Michael Kagel
	 */
	private class SetSelectorDialog extends Dialog {

		private CalculationSet selectedSet;

		private EList<CalculationSet> calculationSets;

		public SetSelectorDialog(Shell parentShell, EList<CalculationSet> calculationSets) {
			super(parentShell);

			this.calculationSets = calculationSets;
		}

		public CalculationSet getCalculationSet() {
			return selectedSet;
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			container.setLayout(new GridLayout(2, false));

			Label label = new Label(container, SWT.NONE);
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true));
			label.setText("Select set:");

			final Combo combo = new Combo(container, SWT.READ_ONLY);
			GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.widthHint = 80;
			combo.setLayoutData(gridData);
			for (CalculationSet set : calculationSets) {
				combo.add(set.getName() != null ? set.getName() : "N/A");
			}

			combo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					selectedSet = calculationSets.get(combo.getSelectionIndex());
				}
			});

			return container;
		}
	}

}
