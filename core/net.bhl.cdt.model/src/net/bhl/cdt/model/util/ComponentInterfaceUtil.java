/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.util;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.View;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * This class has a collection of helper methods for the {@link ComponentInterface} usage.
 * 
 * @author wesendon
 */
public class ComponentInterfaceUtil {

	/**
	 * Returns all {@link ComponentInterface} below the give object.
	 * 
	 * @param obj highest parent object.
	 * @param clazz class of {@link ComponentInterface}
	 * @return list of {@link ComponentInterface}
	 */
	@SuppressWarnings("unchecked")
	public static <T extends ComponentInterface> List<T> getComponentInterfaces(EObject obj, Class<T> clazz) {
		// TODO: Compare functionality to UtilitiesHelper.getChildrenByClass
		ArrayList<T> result = new ArrayList<T>();

		TreeIterator<EObject> iterator = obj.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (clazz.isInstance(next)) {
				result.add((T) next);
			}
		}

		return result;
	}

	public static <T extends ComponentInterface> List<T> getComponentInterfaces(EObject parent, EClass clazz,
		Class<T> returntype) {
		ArrayList<T> result = new ArrayList<T>();

		TreeIterator<EObject> iterator = parent.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if ((clazz.equals(next.eClass())) && !(next.eContainer().eContainer() instanceof View)) {
				result.add((T) next);
			}
		}

		return result;
	}
}
