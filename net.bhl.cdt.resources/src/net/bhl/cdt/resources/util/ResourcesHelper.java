/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.resources.util;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.resources.ResourceDescriptor;
import net.bhl.cdt.resources.Resources;
import net.bhl.cdt.utilities.exchangemodel.ExchangeElement;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/**
 * This is a helper class for the resources plug-in.
 * 
 * @author Martin Glas
 * 
 */
public final class ResourcesHelper {

	private ResourcesHelper() {

	}

	/**
	 * This method returns all child Objects of a given ResourceDescriptor
	 * object having a specific type and name.
	 * 
	 * @param <T>
	 *            The Type parameter which should match clazz
	 * @param parent
	 *            The methods goes through the child objects of this parent
	 *            ResourceDescriptor
	 * @param clazz
	 *            The type of Elements the method looks for
	 * @param name
	 *            The name of ExchangeElements the method looks for
	 * @return The list of ExchangeElement objects which are found among the
	 *         child objects of the given ResourceDescriptor
	 */
	@SuppressWarnings("unchecked")
	public static <T extends ExchangeElement> List<T> getExchangeElementsByClassAndName(
			ResourceDescriptor parent, Class<T> clazz, String name) {
		List<T> result = new ArrayList<T>();
		TreeIterator<EObject> iterator = parent.getStructrualData()
				.eAllContents();
		while (iterator.hasNext()) {
			ExchangeElement ob = (ExchangeElement) iterator.next();
			if ((clazz.isInstance(ob) && (ob.getName().equals(name)))) {
				result.add((T) ob);
			}
		}
		return result;
	}

	/**
	 * This method returns ResourceDescriptor Objects of an Resources Object
	 * having a given name.
	 * 
	 * @param resources
	 *            The Resources object in which the ResourceDesriptor Objects
	 *            are searched
	 * @param name
	 *            The name of the ResourceDescriptor
	 * @return A list of ResourceDescriptor objects which have the given name
	 */
	public static List<ResourceDescriptor> getResourceDescriptorsByName(
			Resources resources, String name) {
		List<ResourceDescriptor> result = new ArrayList<ResourceDescriptor>();
		for (ResourceDescriptor candidateDescriptor : resources.getResources()) {
			if (candidateDescriptor.getName().equals(name)) {
				result.add(candidateDescriptor);
			}

		}

		return result;
	}

}
