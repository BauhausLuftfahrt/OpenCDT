/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.utilities.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.server.model.ESGlobalProjectId;

/**
 * This is a helper class for the utilities package.
 * 
 * @author Martin Glas
 */
public final class UtilitiesHelper {

	private UtilitiesHelper() {

	}

	/**
	 * Get the EContainer that contains the given model element and whose EContainer is null.
	 * 
	 * @param parent the Class of the parent
	 * @param child the model element whose container should get returned
	 * @param <T> the type parameter of the generic method
	 * @return the container
	 */
	public static <T extends EObject> T getParent(Class<T> parent, EObject child) {
		Set<EObject> seenModelElements = new HashSet<EObject>();
		seenModelElements.add(child);
		return getParent(parent, child, seenModelElements);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T getParent(Class<T> parent, EObject child, Set<EObject> seenModelElements) {
		if (child == null) {
			return null;
		}

		if (seenModelElements.contains(child.eContainer())) {
			throw new IllegalStateException("ModelElement is in a containment cycle");
		}

		if (parent.isInstance(child)) {
			return (T) child;
		} else {
			seenModelElements.add(child);
			return getParent(parent, child.eContainer(), seenModelElements);
		}
	}

	/**
	 * This is a method which returns the ProjectID of the ModelElement.
	 * 
	 * @param modelElement the ModelElement
	 * @return the ProjectID of the specified ModelElement
	 */
	public static ESLocalProject getContainingProject(EObject modelElement) {
		ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		return workspace.getLocalProject(modelElement);

	}

	/**
	 * This is a method which returns the ProjectID of the ModelElement.
	 * 
	 * @param modelElement the ModelElement
	 * @return the ProjectID of the specified ModelElement
	 */
	public static ESGlobalProjectId getProjectId(EObject modelElement) {

		ESLocalProject project = getContainingProject(modelElement);
		if (project == null) {
			return null;
		}
		if (project.isShared()) {
			ESGlobalProjectId projectId = project.getGlobalProjectId();
			return projectId;
		}
		return null;
	}

	/**
	 * This method returns all child Objects of a given Element having a specific type.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param clazz The type of Element the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */

	@SuppressWarnings("unchecked")
	public static <T extends ExchangeElement> List<T> getChildrenByClass(ExchangeElement parent, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}
		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject ob = iterator.next();
			if (clazz.isInstance(ob)) {
				result.add((T) ob);
			}
		}
		return result;
	}

	/**
	 * This method returns all child Objects of a given Element having a specific type and name.
	 * 
	 * @param <T> The Type parameter which should match clazz
	 * @param parent The methods looks in the child objects of this parent Element
	 * @param clazz The type of Elements the method looks for
	 * @param name The name of Elements the method looks for
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getChildrenByClassAndName(EObject parent, Class<T> clazz, String name) {
		List<T> result = new ArrayList<T>();
		if (parent == null) {
			return result;
		}
		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof ExchangeElement) {
				ExchangeElement ob = (ExchangeElement) eObject;
				if ((clazz.isInstance(ob) && (ob.getName().equals(name)))) {
					result.add((T) ob);
				}
			}
		}
		return result;
	}

	/**
	 * Returns all Children of type.
	 * 
	 * @param parent root element of subtree which is searched
	 * @param type needle class
	 * @param <T> The Type parameter which should match class
	 * @return The list of Elements which are found among the child objects of the parent Element
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<EObject> getChildrenOfType(EObject parent, Class<T> type) {
		ArrayList<EObject> result = new ArrayList<EObject>();
		if (parent == null) {
			return result;
		}

		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (type.isInstance(next)) {
				result.add((T) next);
			}
		}

		return result;
	}

	/**
	 * This method returns the path of the current workspace as string.
	 * 
	 * @param pluginID the ID of the plug-in
	 * @return the file path to the current workspace as string
	 */
	public static String getPluginFilePath(String pluginID) {
		String result = "";
		if (getPluginFileURL(pluginID) != null) {
			result = getPluginFileURL(pluginID).toString();
		}
		return result;
	}

	/**
	 * This method returns the path of the current workspace as string.
	 * 
	 * @param pluginID the ID of the plug-in
	 * @return the file path to the current workspace as string
	 */
	public static URL getPluginFileURL(String pluginID) {

		try {
			return FileLocator.resolve(new URL("platform:/plugin/" + pluginID + "/"));
		} catch (MalformedURLException e) {
			System.out.println("Could not form a valid URL from " + pluginID);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not locate a file folder at " + pluginID);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * getFileURL.
	 * 
	 * @param filePath path of the file
	 * @param fileName name of the file
	 * @return new URL
	 */
	public static URL getFileURL(String filePath, String fileName) {
		try {
			return new URL(filePath + fileName);
		} catch (MalformedURLException e) {
			System.out.println("Could not form a valid URL from " + filePath + fileName);
			e.printStackTrace();
		}
		return null;
	}

}
