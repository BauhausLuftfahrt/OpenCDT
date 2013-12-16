/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui.dialogs;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * A dialog for handling URL inputs including validation.
 * 
 * @author Michael Kagel
 */
public class URLInputDialog extends InputDialog {

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *            -- The parent shell
	 * @param initialValue
	 *            -- The initial value of the dialog
	 */
	public URLInputDialog(Shell parentShell, String initialValue) {
		super(parentShell, "Edit URL", "Please enter the URL", initialValue,
				new IInputValidator() {

					@Override
					public String isValid(String newText) {
						if (newText
								.matches("(((https?|ftp)://)?(www\\.)?(\\w+\\.){1,}+\\w+){1}(/.*)*")) {
							return null;
						} else {
							return "Invalid URL!";
						}

					}
				});
	}

}
