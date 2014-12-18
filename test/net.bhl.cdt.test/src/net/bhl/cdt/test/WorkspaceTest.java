/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.test;

import java.io.IOException;

import net.bhl.cdt.commands.CDTCommand;

import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESServer;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.client.exceptions.ESServerNotFoundException;
import org.eclipse.emf.emfstore.client.exceptions.ESServerStartFailedException;
import org.eclipse.emf.emfstore.common.ESSystemOutProgressMonitor;
import org.eclipse.emf.emfstore.server.exceptions.ESException;
import org.junit.After;
import org.junit.Before;

/**
 * Abstract Superclass for Workspace Tests. Provides Setup and Tear-down.
 * 
 * @author Max Kögel
 */
public abstract class WorkspaceTest {

	// private Project project;
	private ESLocalProject localProject;

	/**
	 * Setup a dummy project for testing.
	 */
	@Before
	public void setupProjectSpace() {
		ESServer localServer = null;
		try {
			localServer = ESServer.FACTORY.createAndStartLocalServer();
		} catch (ESServerStartFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("Client starting...");
		System.err.println(localServer.toString());

		// The workspace is the core controller to access local and remote projects.
		// A project is a container for models and their elements (EObjects).
		// To get started, we obtain the current workspace of the client.
		final ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		System.err.println(workspace.toString());

		// The workspace stores all available servers that have been configured. We add the local server that has
		// already
		// been started on the workspace.
		workspace.addServer(localServer);
		System.err.println(workspace.toString());

		// Next, we remove all other existing servers
		for (ESServer existingServer : workspace.getServers()) {
			if (existingServer != localServer) {
				try {
					workspace.removeServer(existingServer);
				} catch (ESServerNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		System.err.println(workspace.toString());
		// Configuration.setTesting(true);
		// final Workspace workspace = WorkspaceManager.getInstance().getCurrentWorkspace();
		// final ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		System.err.println("Projekt anglegen");
		ESLocalProject demoProject = workspace.createLocalProject("DemoProject");
		System.err.println(demoProject.toString());
		setLocalProject(demoProject);
	}

	/**
	 * Delete Projects.
	 */

	@After
	public void cleanProjectSpace() {
		new CDTCommand() {
			@Override
			protected void doRun() {
				for (ESLocalProject existingLocalProject : ESWorkspaceProvider.INSTANCE.getWorkspace()
					.getLocalProjects()) {
					try {
						existingLocalProject.delete(new ESSystemOutProgressMonitor());
					} catch (IOException e) {
						e.printStackTrace();
						// fail();
					} catch (ESException e) {
						e.printStackTrace();
					}
				}
			}
		}.execute();
	}

	/**
	 * Delete all persisted data.
	 * 
	 * @AfterClass public static void deleteData() { cleanupWorkspace(); }
	 */

	/**
	 * Cleans workspace up. public static void cleanupWorkspace() { String workspacePath =
	 * Configuration.getWorkspaceDirectory(); File workspaceDirectory = new File(workspacePath); FileFilter
	 * workspaceFileFilter = new FileFilter() { public boolean accept(File pathname) { return
	 * pathname.getName().startsWith("ps-"); } }; File[] filesToDelete =
	 * workspaceDirectory.listFiles(workspaceFileFilter); for (int i = 0; i < filesToDelete.length; i++) { try {
	 * FileUtil.deleteFolder(filesToDelete[i]); } catch (IOException e) { e.printStackTrace(); } } new
	 * File(workspacePath + "workspace.ucw").delete(); }
	 */

	/**
	 * @param project the project to set private void setProject(Project project) { this.project = project; }
	 */

	/**
	 * @return the project public Project getProject() { return project; }
	 */

	/**
	 * @param projectSpace the projectSpace to set
	 */
	private void setLocalProject(ESLocalProject localProject) {
		this.localProject = localProject;
	}

	/**
	 * @return the projectSpace
	 */
	public ESLocalProject getLocalProject() {
		return localProject;
	}

	/**
	 * Clear all operations from project space. protected void clearOperations() {
	 * getLocalProject().getOperations().clear(); }
	 */

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
