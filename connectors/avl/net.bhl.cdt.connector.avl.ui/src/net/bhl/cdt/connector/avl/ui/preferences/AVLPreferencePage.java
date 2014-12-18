/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.ui.preferences;

import net.bhl.cdt.ui.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This is the PreferencePage for the AVL engine connector.
 * 
 * @author martin.glas
 */
public class AVLPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * This is the constructor.
	 */
	public AVLPreferencePage() {
		super(GRID);

	}

	/**
	 * This methods creates the required input fields.
	 */
	public void createFieldEditors() {
		addField(new FileFieldEditor("AVLPATH", "&File preference:", getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Location of AVL executable");
		System.out.print(Activator.getDefault().getPreferenceStore());
	}
}
