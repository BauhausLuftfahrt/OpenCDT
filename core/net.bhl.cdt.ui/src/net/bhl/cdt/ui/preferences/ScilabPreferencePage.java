/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.preferences;

import java.util.LinkedList;
import java.util.List;

import net.bhl.cdt.ui.Activator;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @author Florian Penn
 */
public class ScilabPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private List<FieldEditor> localServerFieldEditors = new LinkedList<FieldEditor>();

	// private List<FieldEditor> remoteServerFieldEditors = new
	// LinkedList<FieldEditor>();

	@Override
	protected void createFieldEditors() {

		FileFieldEditor scilabexecuteable = new FileFieldEditor("SCIEXEC", "Scilab Console Executeable:",
			getFieldEditorParent());
		// scilabexecuteable.setFileExtensions(new String[]{"exe"});
		localServerFieldEditors.add(scilabexecuteable);
		localServerFieldEditors.add(new StringFieldEditor("SCIOPT", "Options", getFieldEditorParent()));

		for (FieldEditor e : localServerFieldEditors) {
			// e.setEnabled(false, null);
			addField(e);
		}
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		// setDescription("Scilab Preference Page");
	}
}
