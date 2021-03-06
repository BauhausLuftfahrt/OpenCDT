/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.part.IntroPart;

// import net.bhl.cdt.ui.command.NewProjectCommand;

/**
 * CDTWelcome page which will be shown at the first start.
 * 
 * @author Michael Kagel
 */
public class CDTWelcomePage extends IntroPart implements IIntroPart {

	@Override
	public void createPartControl(Composite parent) {
		Composite outerContainer = new Composite(parent, SWT.NONE);
		outerContainer.setLayout(new GridLayout());

		Composite buttonContainer = new Composite(outerContainer, SWT.NONE);
		buttonContainer.setLayout(new GridLayout(2, true));
		buttonContainer.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));

		Button newProjectButton = new Button(buttonContainer, SWT.CENTER);
		newProjectButton.setText("New Project");
		newProjectButton.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));
		newProjectButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		newProjectButton.addSelectionListener(new SelectionListener() {

			/**
			 * NewProjectCommand does no longer work - ECPHandlerHelper.createProject does the same job due it has
			 * discouraged access it maybe has to be replaced in future versions
			 */
			@SuppressWarnings("restriction")
			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();
				// new NewProjectCommand().execute();

				ECPHandlerHelper.createProject(PlatformUI.getWorkbench().getDisplay().getActiveShell());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// do nothing
			}
		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void standbyStateChanged(boolean standby) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		super.dispose();
		this.getIntroSite().getWorkbenchWindow().getWorkbench().getIntroManager().closeIntro(this);
	}

}
