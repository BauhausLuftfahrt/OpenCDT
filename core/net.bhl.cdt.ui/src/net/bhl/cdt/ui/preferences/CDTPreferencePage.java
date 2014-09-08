/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.ui.preferences;

import net.bhl.cdt.ui.Activator;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This is the PreferencePage of the OpenCDT file folder.
 * 
 * @author martin.glas
 */
public class CDTPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * The constructor of the PreferencePage.
	 */
	public CDTPreferencePage() {
		super(GRID);

	}

	/**
	 * This method creates the editor fields for the OpenCDT file path.
	 */
	public void createFieldEditors() {
		addField(new DirectoryFieldEditor("CODAPATH", "&URL:", getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("CODA file repository");
	}
}
