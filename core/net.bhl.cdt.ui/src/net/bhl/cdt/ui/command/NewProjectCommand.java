/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.command;

import net.bhl.cdt.calculationrepository.functions.FunctionsFactory;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.resources.ResourcesFactory;
import net.bhl.cdt.ui.dialogs.CreateProjectDialog;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.ui.PlatformUI;

/**
 * Command for creating a new project.
 * 
 * @author Michael Kagel
 */
public class NewProjectCommand extends CDTCommand {

	private String projectName;
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
	 * @param projectName
	 *            The new project will have this name.
	 * @param projectDescription
	 *            The new project will have this description.
	 */
	public NewProjectCommand(String projectName, String projectDescription) {

		if (projectName == null || projectName == "" || projectName == " "
				|| projectDescription == null) {
			CreateProjectDialog dialog = new CreateProjectDialog(PlatformUI
					.getWorkbench().getDisplay().getActiveShell(), projectName,
					projectDescription);

			dialog.open();

			this.projectName = dialog.getProjectName();
			this.projectDescription = dialog.getProjectDescription();

		} else {
			this.projectName = projectName;
			this.projectDescription = projectDescription;
		}
	}

	private void initNewProject(ProjectSpace newProjectSpace) {
		final Project project = newProjectSpace.getProject();

		project.addModelElement(ModelFactory.eINSTANCE.createModel());
		project.addModelElement(ResourcesFactory.eINSTANCE.createResources());
		project.addModelElement(FunctionsFactory.eINSTANCE
				.createCalculationRepository());

	}

	private ProjectSpace createProjectSpace() {
		return WorkspaceManager.getInstance().getCurrentWorkspace()
				.createLocalProject(projectName, projectDescription);
	}

	@Override
	protected void doRun() {
		if (projectName != null) {
			ProjectSpace newProjectSpace = createProjectSpace();

			if (newProjectSpace != null) {
				initNewProject(newProjectSpace);
			}
		}
	}

}
