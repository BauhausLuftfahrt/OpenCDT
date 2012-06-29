/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.eclipse.emf.emfstore.client.model.Configuration;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.Workspace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.FileUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

/**
 * Abstract Superclass for Workspace Tests. Provides Setup and Tear-down.
 * 
 * @author Max Kögel
 * @author Stephan Leutenmayr
 */
public abstract class WorkspaceTest {
	private Project project;
	private ProjectSpace projectSpace;

	/**
	 * Setup a dummy project for testing.
	 */
	@Before
	public void setupProjectSpace() {
		// Configuration.setTesting(true);
		final Workspace workspace = WorkspaceManager.getInstance().getCurrentWorkspace();
		new EMFStoreCommand() {

			@Override
			protected void doRun() {

				ProjectSpace localProject = workspace.createLocalProject("testProject", "test Project");
				setProjectSpace(localProject);
				setProject(getProjectSpace().getProject());

			}
		}.run();

	}

	/**
	 * Clean workspace.
	 */
	@After
	public void cleanProjectSpace() {
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				try {
					WorkspaceManager.getInstance().getCurrentWorkspace().deleteProjectSpace(getProjectSpace());
				} catch (IOException e) {
					fail();
				}
			}
		}.run();
	}

	/**
	 * Delete all persisted data.
	 */
	@AfterClass
	public static void deleteData() {
		cleanupWorkspace();
	}

	/**
	 * Cleans workspace up.
	 */
	public static void cleanupWorkspace() {

		String workspacePath = Configuration.getWorkspaceDirectory();
		File workspaceDirectory = new File(workspacePath);
		FileFilter workspaceFileFilter = new FileFilter() {

			public boolean accept(File pathname) {
				return pathname.getName().startsWith("ps-");
			}

		};
		File[] filesToDelete = workspaceDirectory.listFiles(workspaceFileFilter);
		for (int i = 0; i < filesToDelete.length; i++) {
			try {
				FileUtil.deleteFolder(filesToDelete[i]);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		new File(workspacePath + "workspace.ucw").delete();
	}

	/**
	 * @param project the project to set
	 */
	private void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param projectSpace the projectSpace to set
	 */
	private void setProjectSpace(ProjectSpace projectSpace) {
		this.projectSpace = projectSpace;
	}

	/**
	 * @return the projectSpace
	 */
	public ProjectSpace getProjectSpace() {
		return projectSpace;
	}

	/**
	 * Clear all operations from project space.
	 */
	protected void clearOperations() {
		getProjectSpace().getOperations().clear();
	}

	// /**
	// * This method gets the URL of the current workspace.
	// *
	// * @return the URL of the current Workspace
	// * @throws MalformedURLException
	// * the exception thrown if the workspace has no valid URL
	// */
	// public URL getWorkspacePath() throws MalformedURLException {
	//
	// return FileLocator(PLUGIN_PATH);
	//
	// }

}
