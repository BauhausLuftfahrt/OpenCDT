/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.dialogs;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.LayoutConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Dialog class for new project.
 * 
 * @author Martin Glas
 * @author Michael Kagel - The dialog doesn't create the project any longer. The
 *         dialog only determines the name and description for the new project.
 */
public class CreateProjectDialog extends TitleAreaDialog {

	private Text txtProjectName;
	private Text txtProjectDesc;

	private String projectName;
	private String projectDescription;

	/**
	 * Default constructor.
	 * 
	 * @param parent
	 *            the parent shell
	 * @param name
	 *            name of project
	 * @param description
	 *            description of project
	 */
	public CreateProjectDialog(Shell parent, String name, String description) {
		super(parent);

		this.projectName = name;
		this.projectDescription = description;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		setTitle("Create new project");
		setMessage("Enter the name and the description of the project");

		Label name = new Label(contents, SWT.NULL);
		name.setText("Name:");
		txtProjectName = new Text(contents, SWT.SINGLE | SWT.BORDER);
		txtProjectName.setSize(150, 20);
		if (projectName != null) {
			txtProjectName.setText(projectName);
		}

		Label desc = new Label(contents, SWT.NULL);
		desc.setText("Description:");
		txtProjectDesc = new Text(contents, SWT.MULTI | SWT.BORDER);
		txtProjectDesc.setSize(150, 60);
		if (projectDescription != null) {
			txtProjectDesc.setText(projectDescription);
		}

		Point defaultMargins = LayoutConstants.getMargins();
		GridLayoutFactory.fillDefaults().numColumns(2)
				.margins(defaultMargins.x, defaultMargins.y)
				.generateLayout(contents);

		return contents;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void okPressed() {
		this.projectName = txtProjectName.getText();
		this.projectDescription = txtProjectDesc.getText();
		close();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void cancelPressed() {
		close();
	}

	/**
	 * Returns the name of the new Project.
	 * 
	 * @return Project name
	 */
	public String getProjectName() {
		return this.projectName;
	}

	/**
	 * Returns the description of the new Project.
	 * 
	 * @return Project description
	 */
	public String getProjectDescription() {
		return this.projectDescription;
	}

}
