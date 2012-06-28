/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculationrepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.calculationrepository.functions.FunctionsPackage;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.server.model.ProjectId;

/**
 * This class registers all available Calculation Methods in the Workspace.
 * 
 * @author martin.glas
 */
public final class CalculationRepositoryManager {

	private static CalculationRepositoryManager instance;

	private HashMap<String, HashMap<String, Function>> functionMap;

	private CalculationRepositoryManager() {
		reloadRepository();
	}

	private void loadFunctions() {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
			"net.bhl.cdt.calculationrepository.functions");

		// get all providers from the extension points
		for (IConfigurationElement e : config) {
			try {
				Object o = e.createExecutableExtension("class");

				String s = e.getAttribute("projectID");
				if (o instanceof Function) {
					addFunction(s, (Function) o);
				}
			} catch (CoreException e1) {
				e1.printStackTrace();
			}

		}
		// get all Functions from projects
		for (ProjectSpace projectSpace : WorkspaceManager.getInstance().getCurrentWorkspace().getProjectSpaces()) {
			EList<Function> functionList = projectSpace.getProject().getAllModelElementsbyClass(
				FunctionsPackage.eINSTANCE.getFunction(), new BasicEList<Function>());

			for (Function function : functionList) {
				addFunction(projectSpace.getIdentifier(), function);
			}
		}

	}

	private void addFunction(String projectId, Function method) {
		if (method != null && method.getFunctionID() != null && projectId != null) {

			if (!functionMap.containsKey(projectId)) {
				functionMap.put(projectId, new HashMap<String, Function>());
			}
			HashMap<String, Function> hashMap = functionMap.get(projectId);
			if (hashMap != null) {
				Function function = hashMap.get(method.getFunctionID());
				if (function == null) {

					hashMap.put(method.getFunctionID(), method);
				} else {
					System.out.println("function already existed");
				}
			} else {
				System.out.println("hashMap null");
			}
		}
	}

	/**
	 * This class returns an Instance of the CalculationManager object and creates it if it is not yet there (singleton
	 * pattern).
	 * 
	 * @return the singleton instance
	 */
	public static CalculationRepositoryManager getInstance() {
		if (instance == null) {
			instance = new CalculationRepositoryManager();
		}
		return instance;
	}

	/**
	 * This is a convenience method for reinitializing the CalculationManager.
	 */
	public void reloadRepository() {
		// TODO smarter update of function cache
		functionMap = new HashMap<String, HashMap<String, Function>>();
		loadFunctions();
	}

	/**
	 * This method returns a Function specified by its identifier and a ProjectId.
	 * 
	 * @param projectId the ID of the Project
	 * @param identifier the identifier of the Function
	 * @return if its available the Function
	 */
	public Function getFunction(ProjectId projectId, String identifier) {
		Function result = null;
		if (functionMap.containsKey("*")) {
			if (functionMap.get("*").containsKey(identifier)) {
				result = functionMap.get("*").get(identifier);
			}
		}

		if (functionMap.containsKey(projectId.getId())) {
			if (functionMap.get(projectId.getId()).containsKey(identifier)) {
				result = functionMap.get(projectId.getId()).get(identifier);
			}
		}

		return result;
	}

	/**
	 * This method returns a list of all Functions which are available for a specified Project.
	 * 
	 * @param projectId the ID of the Project
	 * @return a list of all Functions available in the specified project
	 */
	public List<Function> getFunctions(ProjectId projectId) {
		List<Function> result = new ArrayList<Function>();
		if (functionMap.containsKey("*")) {
			result.addAll(functionMap.get("*").values());

		}

		if (functionMap.containsKey(projectId.getId())) {
			result.addAll(functionMap.get(projectId.getId()).values());

		}
		return result;
	}
}
