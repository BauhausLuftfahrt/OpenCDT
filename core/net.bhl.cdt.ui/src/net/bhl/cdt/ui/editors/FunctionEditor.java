/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.units.Unit;

import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.ui.editors.function.DataBindingHelper;
import net.bhl.cdt.ui.editors.function.FunctionEditorControlsFactory;
import net.bhl.cdt.ui.editors.function.FunctionEditorControlsFactory.Page;
import net.bhl.cdt.ui.editors.function.FunctionEditorInput;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DatatypesPackage;
import net.bhl.cdt.utilities.units.Quantity;
import net.bhl.cdt.utilities.units.UnitsPackage;
import net.bhl.cdt.utilities.units.util.UnitsHelper;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ExpandEvent;
import org.eclipse.swt.events.ExpandListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

/**
 * An Editor that can edit the basic data and parameters of a function. The GUI
 * is extended based on the specific type of the Function. At least, every
 * function has a set of input and output parameters, a name, a synopsis and a
 * function ID.
 * 
 * @author Sebastian Höcht
 */
public class FunctionEditor extends MultiPageEditorPart implements
		IResourceChangeListener {

	/**
	 * The id of the editor.
	 */
	public static final String ID = "net.bhl.cdt.ui.editors.FunctionEditor";

	private Function function;
	private ScrolledComposite mainScrolledComposite;
	private ExpandBar bar;
	private ExpandItem parameterItem;

	/**
	 * Creates a multi-page editor example.
	 */
	public FunctionEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	/**
	 * Create the SWT controls for the first tab of the editor.
	 */
	void createFunctionDataPage() {
		mainScrolledComposite = new ScrolledComposite(getContainer(),
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);

		bar = new ExpandBar(mainScrolledComposite, SWT.NONE);

		ExpandItem item = new ExpandItem(bar, SWT.NONE, 0);
		item.setText("Function specification");
		Composite composite1 = new Composite(bar, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(composite1);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING)
				.applyTo(composite1);
		createBasicDataForm(composite1);
		composite1.setSize(400, 5000);

		item.setHeight(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		item.setControl(composite1);
		item.setExpanded(true);

		parameterItem = new ExpandItem(bar, SWT.NONE, 1);
		parameterItem.setText("Parameters");

		Composite parameters = new Composite(bar, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).margins(0, 0)
				.applyTo(parameters);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parameters);

		Group inputParameters = new Group(parameters, SWT.NONE);
		inputParameters.setText("Input Parameters");
		GridLayoutFactory.swtDefaults().applyTo(inputParameters);
		GridDataFactory.fillDefaults().grab(true, false)
				.align(SWT.FILL, SWT.FILL).applyTo(inputParameters);
		createParametersForm(inputParameters, function.getInputDescriptors());

		Group outputParameters = new Group(parameters, SWT.NONE);
		outputParameters.setText("Output Parameters");
		GridLayoutFactory.swtDefaults().applyTo(outputParameters);
		GridDataFactory.fillDefaults().grab(true, false)
				.applyTo(outputParameters);
		createParametersForm(outputParameters, function.getOutputDescriptors());

		parameterItem.setHeight(parameters
				.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		parameterItem.setControl(parameters);

		mainScrolledComposite.setContent(bar);
		mainScrolledComposite.setExpandVertical(true);
		mainScrolledComposite.setExpandHorizontal(true);
		Rectangle r = mainScrolledComposite.getClientArea();
		mainScrolledComposite.setMinSize(bar.computeSize(r.width, SWT.DEFAULT));

		int index = addPage(mainScrolledComposite);
		setPageText(index, "Function specification");
	}

	private void createBasicDataForm(Composite composite1) {
		Label nameLabel = new Label(composite1, SWT.NONE);
		nameLabel.setText("Name");
		final Text name = new Text(composite1, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(name);
		DataBindingHelper.bindValue(
				SWTObservables.observeText(name, SWT.FocusOut), this.function,
				"name");

		Label synopsisLabel = new Label(composite1, SWT.NONE);
		Text synopsis = new Text(composite1, SWT.BORDER | SWT.MULTI
				| SWT.V_SCROLL);
		synopsis.setSize(SWT.DEFAULT, 50);
		synopsisLabel.setText("Synopsis");
		GridDataFactory.fillDefaults().grab(true, false).applyTo(synopsis);
		DataBindingHelper.bindValue(
				SWTObservables.observeText(synopsis, SWT.FocusOut),
				this.function, "synopsis");

		Label idLabel = new Label(composite1, SWT.NONE);
		final Text id = new Text(composite1, SWT.BORDER);
		idLabel.setText("Function ID");
		GridDataFactory.fillDefaults().grab(true, false).applyTo(id);
		DataBindingHelper.bindValue(
				SWTObservables.observeText(id, SWT.FocusOut), this.function,
				"functionID");

		name.addFocusListener(new DefaultIdNameListener(name, id, this.function));
	}

	private void createParametersForm(Group group,
			final EList<ParameterDescriptor> descriptors) {
		buildParameters(group, descriptors);
	}

	/**
	 * Create the controls for a set of Parameter Descriptors.
	 * 
	 * @param group
	 *            the group containing the composite
	 * @param descriptors
	 *            the input or output Parameter Descriptors
	 */
	public void buildParameters(Group group,
			EList<ParameterDescriptor> descriptors) {
		for (Control child : group.getChildren()) {
			child.dispose();
		}

		Button create = new Button(group, SWT.PUSH);
		create.setText("add Parameter");
		create.addSelectionListener(DataBindingHelper
				.addParameterListener(descriptors));
		create.addSelectionListener(new RebuildSelectionListener(group,
				descriptors));

		Composite composite = new Composite(group, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(5).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(composite);
		new Label(composite, SWT.NONE).setText("");
		new Label(composite, SWT.NONE).setText("Name");
		new Label(composite, SWT.NONE).setText("Data Type");
		new Label(composite, SWT.NONE).setText("Unit");
		new Label(composite, SWT.NONE).setText("Quantity");

		Iterator<ParameterDescriptor> parameterIterator = descriptors
				.iterator();
		while (parameterIterator.hasNext()) {
			final ParameterDescriptor descriptor = parameterIterator.next();

			// delete button
			Button delete = new Button(composite, SWT.PUSH);
			delete.setText("x");
			delete.addSelectionListener(DataBindingHelper
					.removeParameterListener(descriptors, descriptor));
			delete.addSelectionListener(new RebuildSelectionListener(group,
					descriptors));

			// Function name
			Text name = new Text(composite, SWT.BORDER);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(name);
			DataBindingHelper.bindValue(SWTObservables.observeText(name),
					descriptor, "label");
			name.addFocusListener(new DescriptorLabelFocusLostListener(
					descriptor, name));

			// data type
			final Combo dataType = new Combo(composite, SWT.None);
			GridLayoutFactory.swtDefaults().applyTo(dataType);
			GridDataFactory.swtDefaults().hint(80, SWT.DEFAULT)
					.applyTo(dataType);
			EList<EClassifier> eClassifiers = DatatypesPackage.eINSTANCE
					.getEClassifiers();
			Iterator<EClassifier> iter = eClassifiers.iterator();
			while (iter.hasNext()) {
				EClassifier classifier = iter.next();
				if (classifier.eClass().isAbstract()) {
					continue;
				}
				dataType.add(classifier.getName());
			}
			DataBindingHelper.bindDataType(dataType, descriptor);

			// unit
			final Text unit = new Text(composite, SWT.BORDER);
			GridDataFactory.fillDefaults().applyTo(unit);
			DataBindingHelper.bindUnit(unit, descriptor);
			unit.addFocusListener(new DescriptorUnitFocusLostListener(unit,
					descriptor));

			// quantity
			final Combo quantity = new Combo(composite, SWT.None);
			GridLayoutFactory.swtDefaults().applyTo(quantity);
			GridDataFactory.swtDefaults().hint(80, SWT.DEFAULT)
					.applyTo(quantity);
			EList<EEnumLiteral> literals = UnitsPackage.Literals.QUANTITY
					.getELiterals();
			Iterator<EEnumLiteral> iterator = literals.iterator();
			while (iterator.hasNext()) {
				EEnumLiteral literal = iterator.next();
				quantity.add(literal.getLiteral());
			}
			DataBindingHelper.bindQuantity(quantity, descriptor);
			quantity.addSelectionListener(new DescriptorQuantityFocusLostListener(
					quantity, unit, descriptor));
		}

		composite.layout();
		group.layout();
		group.getParent().layout();
		parameterItem.setHeight(group.getParent().computeSize(SWT.DEFAULT,
				SWT.DEFAULT).y);
		group.getParent().getParent().layout();

		int height = 0;
		for (Control test : mainScrolledComposite.getChildren()) {
			height += test.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		}

		mainScrolledComposite.setMinHeight(height);
		mainScrolledComposite.layout();
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createFunctionDataPage();

		FunctionEditorControlsFactory factory = new FunctionEditorControlsFactory();
		ArrayList<Page> pages = factory.createControls(function, bar);
		for (Page page : pages) {
			if (page.getPosition() == Page.POSITION_TABITEM) {
				ExpandItem item = new ExpandItem(bar, SWT.NONE, 2);
				item.setText(page.getPageName());
				Control control = page.getControl();
				item.setHeight(control.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
				item.setControl(control);
			} else if (page.getPosition() == Page.POSITION_APPEND) {
				// this doesn't work correctly currently. The problem is, that
				// you need to
				// define a wrapper composite, and set it as the content of the
				// ScrolledComposite so the content height of the
				// ScrolledComposite can be computed
				// when a TabItem has been selected.
			}
		}

		// FunctionEditorControlsFactory factory = new
		// FunctionEditorControlsFactory();
		// ArrayList<Page> pages = factory.createControls(function,
		// getContainer());
		// for (Page page : pages) {
		// int index = addPage(page.getControl());
		// setPageText(index, page.getPageName());
		// }
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Saves the multi-page editor's document.
	 * 
	 * @param monitor
	 *            the monitor
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	/**
	 * {@inheritDoc}
	 */
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		if (!(input instanceof FunctionEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		FunctionEditorInput editorInput = (FunctionEditorInput) input;
		this.function = editorInput.getFunction();
		setSite(site);
		setInput(input);

		super.init(site, input);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isSaveAsAllowed() {
		// every change is saved automatically.
		return false;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// not used
	}

	// ============= Listeners ==========

	/**
	 * A Listener which rebuilds the parameter composite. This Listener is used
	 * for adding and removing parameters.
	 * 
	 * @author Sebastian Höcht
	 */
	private class RebuildSelectionListener implements SelectionListener {

		private Group group;
		private EList<ParameterDescriptor> descriptors;

		public RebuildSelectionListener(Group group,
				EList<ParameterDescriptor> descriptors) {
			this.group = group;
			this.descriptors = descriptors;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			buildParameters(group, descriptors);
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	/**
	 * A Listener which checks if the entered unit is a valid one.
	 * 
	 * @author Sebastian Höcht
	 */
	class DescriptorUnitFocusLostListener implements FocusListener {
		private Text unit;
		private ParameterDescriptor descriptor;

		/**
		 * @param unit
		 *            the SWT Control that holds the information for the unit to
		 *            set
		 * @param descriptor
		 *            the ParameterDescriptor of the parameter where the unit
		 *            should be set.
		 */
		public DescriptorUnitFocusLostListener(Text unit,
				ParameterDescriptor descriptor) {
			this.unit = unit;
			this.descriptor = descriptor;
		}

		@Override
		public void focusLost(FocusEvent e) {
			CDTCommand command = new CDTCommand() {

				@Override
				protected void doRun() {
					Unit unitValue = null;
					try {
						unitValue = Unit.valueOf(unit.getText());
						if (UnitsHelper.isCompatible(unitValue,
								descriptor.getQuantity())) {
							descriptor.setUnit(unitValue);
						} else {
							unit.setText(descriptor.getUnit().toString());
						}
					} catch (IllegalArgumentException e) {
						unit.setText(descriptor.getUnit().toString());
					}
				}
			};
			command.run();
		}

		@Override
		public void focusGained(FocusEvent e) {
		}
	}

	/**
	 * This Listener is triggered on focus lost of the Function's name SWT
	 * control. If there Function ID is yet empty, a default Function ID will be
	 * set based on the new Function name.
	 * 
	 * @author Sebastian Höcht
	 */
	class DefaultIdNameListener implements FocusListener {

		private Text name;
		private Text id;
		private Function function;

		/**
		 * @param name
		 *            the SWT Control for the Function's name
		 * @param id
		 *            the SWT Control for the Function's id
		 * @param function
		 *            the Function where the id shall be changed
		 */
		public DefaultIdNameListener(Text name, Text id, Function function) {
			this.name = name;
			this.id = id;
			this.function = function;
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (id.getText().length() == 0) {
				Pattern p = Pattern.compile("\\w+");
				Matcher m = p.matcher(name.getText());
				if (m.matches()) {
					final String newId = "net.bhl.cdt.calculationrepository."
							+ name.getText().substring(m.start(), m.end());
					id.setText(newId);
					CDTCommand command = new CDTCommand() {

						@Override
						protected void doRun() {
							function.setFunctionID(newId);
						}
					};
					command.run();
				}
			}
		}

		@Override
		public void focusGained(FocusEvent e) {
		}
	}

	/**
	 * Set the label of a ParameterDescriptor on focus lost of the SWT Text
	 * Control.
	 * 
	 * @author Sebastian Höcht
	 */
	public class DescriptorLabelFocusLostListener implements FocusListener {

		private ParameterDescriptor descriptor;
		private Text name;

		/**
		 * @param descriptor
		 *            the descriptor of the parameter
		 * @param name
		 *            the SWT Control for the label of the parameter
		 */
		public DescriptorLabelFocusLostListener(ParameterDescriptor descriptor,
				Text name) {
			this.descriptor = descriptor;
			this.name = name;
		}

		@Override
		public void focusLost(FocusEvent e) {
			CDTCommand command = new CDTCommand() {

				@Override
				protected void doRun() {
					descriptor.setLabel(name.getText());
				}
			};
			command.run();
		}

		@Override
		public void focusGained(FocusEvent e) {
		}
	}

	/**
	 * Set the Unit of a parameter to its default unit based on the Quantity, if
	 * a new Quantity has been chosen.
	 * 
	 * @author Sebastian Höcht
	 */
	public class DescriptorQuantityFocusLostListener implements
			SelectionListener {

		private Combo unit;
		private Text quantity;
		private ParameterDescriptor descriptor;

		/**
		 * @param unit
		 *            the SWT Text of the Paramenter's Unit
		 * @param quantity
		 *            the SWT Control of the Parameter's Quantity
		 * @param descriptor
		 *            the descriptor of the Parameter
		 */
		public DescriptorQuantityFocusLostListener(Combo unit, Text quantity,
				ParameterDescriptor descriptor) {
			this.unit = unit;
			this.quantity = quantity;
			this.descriptor = descriptor;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			Unit unitValue = Unit.searchSymbol(unit.getText());

			if (unitValue == null
					|| (!UnitsHelper.getQuantityByUnit(unitValue).equals(
							Quantity.get(quantity.getText())))) {
				CDTCommand command = new CDTCommand() {
					@Override
					protected void doRun() {
						descriptor.setUnit(UnitsHelper
								.getDefaultUnit(descriptor.getQuantity()));
					}
				};
				command.run();
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	/**
	 * The Scrolled Composite height needs to be updated whenever an item of the
	 * ExpandBar is expanded or collapsed. Unfortunately, the ExpandListener
	 * gets fired before the item is expanded. Therefore you have to compute the
	 * size of the ScrolledComposite and afterwards, you have to add/remove the
	 * height of the item which has been expanded/collapsed
	 * 
	 * @author Sebastian Höcht
	 */
	public class ExpandBarListener implements ExpandListener {

		@Override
		public void itemExpanded(ExpandEvent e) {
			int height = 0;
			for (Control composite : mainScrolledComposite.getChildren()) {
				height += composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
			}
			height += ((ExpandItem) e.item).getControl().computeSize(
					SWT.DEFAULT, SWT.DEFAULT).y;

			mainScrolledComposite.setMinHeight(height);
			mainScrolledComposite.layout();
		}

		@Override
		public void itemCollapsed(ExpandEvent e) {
			int height = 0;
			for (Control composite : mainScrolledComposite.getChildren()) {
				height += composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
			}
			height -= ((ExpandItem) e.item).getControl().computeSize(
					SWT.DEFAULT, SWT.DEFAULT).y;

			mainScrolledComposite.setMinHeight(height);
			mainScrolledComposite.layout();
		}
	}
}
