/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.process.ui;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.calculation.exception.UnexpectedObjectTypeException;
import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.model.calculation.AbstractNode;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.ConditionalNode;
import net.bhl.cdt.model.calculation.ControlNode;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.server.model.ProjectId;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * UI for displaying the calculation graph.
 * 
 * @author Michael Kagel
 */
public class GraphViewer extends Dialog {

	private CalculationGraph graph;
	private ProjectId projectId;
	private ListViewer functionPool;
	private ListViewer graphNodes;

	private CalculationRepositoryManager calcRepManager;

	/**
	 * Constructor.
	 * 
	 * @param parent Shell
	 */
	public GraphViewer(Shell parent) {
		super(parent);
	}

	/**
	 * Constructor.
	 * 
	 * @param parent Shell
	 * @param style Style bits
	 */
	public GraphViewer(Shell parent, int style) {
		super(parent, style);
	}

	/**
	 * Opens the GraphViewer-Dialog with the given calculation graph instance.
	 * 
	 * @param graph The shown calculation graph
	 */
	public void open(CalculationGraph graph) {
		this.graph = graph;
		this.projectId = UtilitiesHelper.getProjectId(graph);

		this.calcRepManager = CalculationRepositoryManager.getInstance();

		Shell shell = createShell();
		createControls(shell);
		showGraph();

		openDialog(shell);

	}

	private Shell createShell() {
		final Shell shell = new Shell(getParent(), SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL | SWT.CLOSE);
		shell.setSize(550, 350);
		shell.setText("Calculation Graph");
		shell.setLayout(new GridLayout());
		return shell;
	}

	private void createControls(final Shell shell) {
		Composite mainComp = new Composite(shell, SWT.NONE);
		GridLayout gridLayoutContainer = new GridLayout(2, true);
		mainComp.setLayout(gridLayoutContainer);
		mainComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final Label headerFunctionPool = new Label(mainComp, SWT.NONE);
		headerFunctionPool.setText("CalculationSet - CalculationGraph");

		final Label headerGraphNodes = new Label(mainComp, SWT.NONE);
		headerGraphNodes.setText("CalculationGraph");

		functionPool = new ListViewer(mainComp, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		functionPool.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		functionPool.setContentProvider(new ArrayContentProvider());
		functionPool.setLabelProvider(new PoolLabelProvider());

		graphNodes = new ListViewer(mainComp, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		graphNodes.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		graphNodes.setContentProvider(new ArrayContentProvider());
		graphNodes.setLabelProvider(new GraphNodesLabelProvider());

		Button closeButton = new Button(shell, SWT.PUSH);
		closeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		closeButton.setText("Close");

	}

	private void showGraph() {

		// determine pool
		List<Calculation> pool = new ArrayList<Calculation>();
		pool.addAll(determinePool());
		// determine nodes
		List<AbstractNode> nodes = new ArrayList<AbstractNode>();
		nodes.addAll(graph.getNodes());
		// pool - nodes
		removeNodesFromPool(nodes, pool);
		// fillPool
		functionPool.setInput(pool);
		// fillNodes
		graphNodes.setInput(nodes);

	}

	private void removeNodesFromPool(List<AbstractNode> nodes, List<Calculation> pool) {
		for (AbstractNode node : nodes) {
			if (node instanceof Node) {
				Calculation calculation = ((Node) node).getCalculation();
				pool.remove(calculation);
			}
		}
	}

	private EList<Calculation> determinePool() {
		EObject containerModelElement = graph.eContainer();

		if (containerModelElement instanceof CalculationSet) {
			return ((CalculationSet) containerModelElement).getCalculations();
		}
		return null;
	}

	private Function getFunctionFromCalculation(Calculation calculation) {
		return calcRepManager.getFunction(projectId, calculation.getFunctionID());
	}

	private void openDialog(Shell shell) {
		// shell.pack();
		shell.open();

		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * LabelProvider class for the calculation objects of the pool side.
	 * 
	 * @author Michael Kagel
	 */
	private class PoolLabelProvider extends LabelProvider implements ILabelProvider {

		@Override
		public String getText(Object element) {
			if (element instanceof Calculation) {
				Calculation calc = (Calculation) element;
				return getFunctionFromCalculation(calc).getName();
			}
			throw new UnexpectedObjectTypeException("Element in PoolLabelProvider.getText() has a unknown type");
		}

	}

	/**
	 * LabelProvider class for the calculation objects of the used nodes side.
	 * 
	 * @author Michael Kagel
	 */
	private class GraphNodesLabelProvider extends LabelProvider implements ILabelProvider {

		@Override
		public String getText(Object element) {
			if (element instanceof Node) {
				Calculation calculation = ((Node) element).getCalculation();
				return getFunctionFromCalculation(calculation).getName();
			} else if (element instanceof IterationNode) {
				return "IterationNode";
			} else if (element instanceof ConditionalNode) {
				return "ConditionalNode";
			} else if (element instanceof ControlNode) {
				return "ControlNode";
			}
			throw new UnexpectedObjectTypeException("Element in GraphNodesLabelProvider.getText() has a unknown type");
		}

	}

}
