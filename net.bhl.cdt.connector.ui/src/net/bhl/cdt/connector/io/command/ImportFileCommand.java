/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io.command;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.connector.exception.ImportException;
import net.bhl.cdt.connector.io.ImportStrategy;
import net.bhl.cdt.resources.Resources;
import net.bhl.cdt.resources.commands.InsertFileResourceCommand;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.DataType;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * Command class for importing a model file.
 * 
 * @author Michael Kagel
 */
public class ImportFileCommand extends CDTCommand {

	private static final String EXTENSION_POINT_ID = "net.bhl.cdt.connector.importstrategy";
	private static final String EXECUTABLE_EXTENSION = "class";

	private static final String MESSAGE_BOX_TITLE = "WARNING";
	private static final String MESSAGE_BOX_MESSAGE = "There is no import strategy for this file type!";

	private File file;
	private Resources selection;
	private Shell shell;

	/**
	 * Constructor.
	 * 
	 * @param file
	 *            The file which should be imported.
	 * @param selection
	 *            The selected resources object of the navigator tree.
	 * @param shell
	 *            The shell of the calling UI.
	 */
	public ImportFileCommand(File file, Resources selection, Shell shell) {
		super();
		this.file = file;
		this.selection = selection;
		this.shell = shell;
	}

	@Override
	protected void doRun() {
		List<ImportStrategy> possibleStrategies = getPossibleStrategies();

		ImportStrategy strategy = null;

		// If there is a (one or more) strategy that can import the file get it
		if (possibleStrategies.size() > 0) {
			strategy = getStrategy(possibleStrategies);
			if (strategy == null) {
				return;
			}
		}

		// if finally a strategy is selected import the file and call the model
		// command for inserting the
		// imported data.
		if (strategy != null) {

			// Import file with chosen Import Strategy
			// Old version
			EList<DataType> importedModelElements = strategy
					.importModelFromFile(file);
			// New version
			// EList<EObject> importedModelElements =
			// strategy.importModelFromFile(file);

			// Initializes command for Model insertion...
			InsertFileResourceCommand resourcesCommand = new InsertFileResourceCommand(
					selection, file.getName(), file.toURI(),
					importedModelElements);
			// ... and execute it
			resourcesCommand.execute();

		} else {
			MessageBox box = new MessageBox(shell, SWT.ICON_WARNING | SWT.OK);
			box.setText(MESSAGE_BOX_TITLE);
			box.setMessage(MESSAGE_BOX_MESSAGE);
			box.open();
		}

	}

	private List<ImportStrategy> getPossibleStrategies() {
		List<ImportStrategy> possibleStrategies = new ArrayList<ImportStrategy>();

		// Read in available import strategies from Extension Point
		IConfigurationElement[] configurationElements = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						EXTENSION_POINT_ID);

		// Initializes all strategies for this extension point in a for-each
		// loop, it means that all strategy
		// classes will be created
		for (IConfigurationElement element : configurationElements) {
			try {

				// Create the strategy class
				ImportStrategy tmpStrategy = (ImportStrategy) element
						.createExecutableExtension(EXECUTABLE_EXTENSION);

				// Check if the strategy can import the file, if true add to
				// possibleStrategies list
				if (tmpStrategy.canImport(file)) {
					possibleStrategies.add(tmpStrategy);
				}
			} catch (CoreException e) {
				throw new ImportException(
						"Exception during reading the extension point regestry",
						e);
			}
		}

		return possibleStrategies;
	}

	private ImportStrategy getStrategy(List<ImportStrategy> possibleStrategies) {

		// if there is only one strategy in the list return it
		if (possibleStrategies.size() == 1) {
			return possibleStrategies.get(0);
		}

		// if there are more strategies in the list show a selection dialog and
		// let the user select one strategy for
		// importing the file
		return strategySelectionDialog(possibleStrategies);
	}

	private ImportStrategy strategySelectionDialog(
			List<ImportStrategy> possibleStrategies) {

		ListDialog dialog = new ListDialog(shell);
		dialog.setTitle("Strategy Selection Dialog");
		dialog.setMessage("Select one strategy from the list below:");

		dialog.setContentProvider(new StrategySelectionDialogContentProvider());
		dialog.setLabelProvider(new StrategySelectionDialogLabelProvider());
		dialog.setInput(possibleStrategies);

		List<ImportStrategy> selectionList = new ArrayList<ImportStrategy>();
		selectionList.add(possibleStrategies.get(0));
		dialog.setInitialElementSelections(selectionList);

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			return (ImportStrategy) result[0];
		}

		// if the dialog is not ended by the OK button return null, the doRun
		// method will react on a null return value
		return null;
	}

	/**
	 * Standard LabelProvider where the getText method is overridden for
	 * delivering the class name as strategy name.
	 * 
	 * @author Michael Kagel
	 */
	private class StrategySelectionDialogLabelProvider extends LabelProvider
			implements ILabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof ImportStrategy) {
				return element.getClass().getSimpleName();
			}
			throw new ImportException(
					"One element of the strategy selection list is not a ImportStrategy");
		}
	}

	/**
	 * A Standard ContentProvider which delivers the strategy list
	 * (possiblestrategies) as array for showing in the dialog.
	 * 
	 * @author Michael Kagel
	 */
	private class StrategySelectionDialogContentProvider implements
			IStructuredContentProvider {

		@SuppressWarnings("rawtypes")
		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List) {
				return ((List) inputElement).toArray();
			}
			throw new ImportException(
					"There is no list in StrategySelectionDialogContentProvider.getElements(Objet)");
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

}
