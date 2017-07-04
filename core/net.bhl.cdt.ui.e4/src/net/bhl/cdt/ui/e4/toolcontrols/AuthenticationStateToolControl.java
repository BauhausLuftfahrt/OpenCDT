/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.toolcontrols;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;

import net.bhl.cdt.core.auth.CDTAuthService;

/**
 * Simple authentication state tool control. Shows login name and login time.
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class AuthenticationStateToolControl {
    @PostConstruct
    public void createGui(Composite parent, CDTAuthService authService) {
	CLabel l = new CLabel(parent, SWT.NONE);

	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	l.setText("User: " + authService.getUsername() + " | Login-Time: " + sdf.format(authService.getLoginDate()));
	l.setTopMargin(3);
	l.setBottomMargin(3);
    }
}