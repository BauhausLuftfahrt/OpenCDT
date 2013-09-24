/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.command;


import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.resources.ResourcesFactory;
import net.bhl.cdt.ui.dialogs.CreateProjectDialog;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.ui.PlatformUI;

/**
 * Command for creating a new project.
 * 
 * @author Michael Kagel
 */
public class NewProjectCommand extends CDTCommand {

	private String projectName;
	/**
	 * projectDescription can not be set for ESLocalProject with EMFStore 1.0.
	 */
	@SuppressWarnings("unused")
	private String projectDescription;

	/**
	 * Constructor.
	 */
	public NewProjectCommand() {
		this(null, null);
	}

	/**
	 * Constructor.
	 * 
	 * @param projectName The new project will have this name.
	 * @param projectDescription The new project will have this description.
	 */
	public NewProjectCommand(String projectName, String projectDescription) {

		if (projectName == null || projectName == "" || projectName == " " || projectDescription == null) {
			CreateProjectDialog dialog = new CreateProjectDialog(PlatformUI.getWorkbench().getDisplay()
				.getActiveShell(), projectName, projectDescription);

			dialog.open();

			this.projectName = dialog.getProjectName();
			this.projectDescription = dialog.getProjectDescription();

		} else {
			this.projectName = projectName;
			this.projectDescription = projectDescription;
		}
	}

	private void initNewProject(ESLocalProject localProject) {
		localProject.getModelElements().add(ModelFactory.eINSTANCE.createModel());
		localProject.getModelElements().add(ResourcesFactory.eINSTANCE.createResources());

	}

	private ESLocalProject createLocalProject() {
		return ESWorkspaceProvider.INSTANCE.getWorkspace().createLocalProject(projectName);
	}

	@Override
	protected void doRun() {
		if (projectName != null) {
			ESLocalProject localProject = createLocalProject();

			if (localProject != null) {
				initNewProject(localProject);
			}
		}
	}

}
