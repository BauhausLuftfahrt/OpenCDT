/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io;

import java.io.File;
import java.util.ArrayList;

import net.bhl.cdt.calculation.handlers.AbstractCDTHandler;
import net.bhl.cdt.connector.exception.ImportException;
import net.bhl.cdt.connector.exception.ImportPartException;
import net.bhl.cdt.connector.io.command.ImportFileCommand;
import net.bhl.cdt.connector.util.PreferenceHelper;
import net.bhl.cdt.resources.Resources;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * If someone calls the import file function in the model popup, this handler
 * will be called by eclipse. For further steps see the implementation of
 * execute and the corresponding command.
 * 
 * @author Michael Kagel
 * @author Sven Ziemer
 * @author Martin Glas
 * @author Sebastian Höcht
 */
public class ImportFileHandler extends AbstractCDTHandler {

	private static final String IMPORT_FILE_PATH = "import.file.path";

	@Override
	public Object doExecute(ExecutionEvent event) throws ExecutionException {

		isSelectionAResource(event);

		Resources selection = (Resources) getSelection(event);

		String filePath = getFilePath();

		ImportReport.reset();
		// If a file is selected run the ImportFileCommand
		if (filePath != null) {
			new ImportFileCommand(new File(filePath), selection, getShell())
					.run();
			ArrayList<ImportPartException> exceptions = ImportReport
					.getInstance().getExceptions();
			if (exceptions.size() > 0) {
				Shell shell = PlatformUI.getWorkbench().getDisplay()
						.getActiveShell();

				ListDialog listDialog = new ListDialog(shell);
				listDialog.setTitle("File import report");
				listDialog
						.setMessage("The file has been imported, but the following errors occured:");
				listDialog.setContentProvider(ArrayContentProvider
						.getInstance());
				listDialog
						.setLabelProvider(new ImportPartExceptionLabelProvider());
				listDialog.setInput(exceptions);
				listDialog.open();
			}
		}

		return null;
	}

	private String getFilePath() {
		// Show a standard file dialog where the user can select the file for
		// importing
		FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN);

		// Set the former import Path as init Path for the dialog. (seems not to
		// be necessary for Win7?!?!)
		String filterPath = PreferenceHelper
				.getPreference(IMPORT_FILE_PATH, "");
		if (!filterPath.equals("")) {
			fileDialog.setFilterPath(filterPath);
		}

		// Create a File object from the selected file string of the dialog
		String filePath = fileDialog.open();

		// Save the import path of the file in the preference service, so it can
		// be loaded next time when the dialog
		// will be opened
		PreferenceHelper.setPreference(IMPORT_FILE_PATH,
				fileDialog.getFilterPath());
		return filePath;
	}

	private void isSelectionAResource(ExecutionEvent event) {
		if (!(getSelection(event) instanceof Resources)) {
			throw new ImportException("No Resources element selected.");
		}
	}

}
