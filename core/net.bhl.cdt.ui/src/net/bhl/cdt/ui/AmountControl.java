/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.ui;

import org.eclipse.emf.ecp.edit.internal.swt.controls.StringControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * This control class allows editing Unit attributes in ECP.
 * 
 * @author martin.glas
 */
@SuppressWarnings("restriction")
public class AmountControl extends StringControl {
	@Override
	protected int getTextWidgetStyle() {
		return super.getTextWidgetStyle() | SWT.RIGHT;

	}

	@Override
	protected void customizeText(Text text) {
		super.customizeText(text);
		text.setMessage("Measured quantity such as 1 m/s");
	}
}