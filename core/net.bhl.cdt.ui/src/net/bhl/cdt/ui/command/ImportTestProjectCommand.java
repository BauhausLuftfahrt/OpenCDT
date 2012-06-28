/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.command;

import java.net.URL;

import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.emfstore.client.model.Workspace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.common.model.Project;

/**
 * This Command creates a specific test project.
 * 
 * @author Michael Kagel
 */
public class ImportTestProjectCommand extends CDTCommand {

	private static final String PROJECTNAME = "/resources/DemoProject.ucp";

	private String getPath() {
		URL resource = this.getClass().getResource(PROJECTNAME);

		return resource.toString();
	}

	@Override
	protected void doRun() {
		final String path = getPath();

		final Workspace currentWorkspace = WorkspaceManager.getInstance()
				.getCurrentWorkspace();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(path), true);

		EList<EObject> directContents = resource.getContents();

		Project project = (Project) directContents.get(0);

		currentWorkspace.importProject(project, "Testproject", "");
	}
}
