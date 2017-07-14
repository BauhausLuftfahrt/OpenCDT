/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.process.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This is a helper class for design process control.
 * 
 * @author martin.glas
 */
public final class ProcessHelper {

	private ProcessHelper() {

	}

	/**
	 * This class sets the references of any EObject by matching reference name with names of EObjects in a certain
	 * Project.
	 * 
	 * @param eObject the EObject which needs to be wired
	 * @param project the project where the methods searches for matching EObjects
	 * @param <T> returned Elements must be NamedElements
	 */
	@SuppressWarnings("unchecked")
	public static <T extends ENamedElement> void wireReferences(EObject eObject, ESLocalProject project) {
		for (EReference reference : eObject.eClass().getEAllReferences()) {
			List<T> result = new ArrayList<T>();
			if (!reference.isContainment() && !reference.isMany()) {
				if (EcorePackage.Literals.ENAMED_ELEMENT.isSuperTypeOf(reference.getEReferenceType())) {
					for (EObject containedEObject : project.getAllModelElements()) {
						if (containedEObject instanceof ENamedElement) {
							ENamedElement namedElement = (ENamedElement) containedEObject;
							result.addAll((List<? extends T>) matchENamedElementWithReference(namedElement, reference));
						}

					}

					if (!result.isEmpty()) {

						eObject.eSet(reference, result.get(0));
					} else {
						System.out.println(reference.getName());
					}
				}
			}
		}

	}

	@SuppressWarnings("unchecked")
	private static <T extends ENamedElement> List<T> matchENamedElementWithReference(ENamedElement namedElement,
		EReference reference) {
		List<T> resultNamedElements = new ArrayList<T>();
		if ((namedElement.getName() != null) && (reference.getEType().isInstance(namedElement))) {
			if (namedElement.getName().equals(reference.getName())) {
				resultNamedElements.add((T) namedElement);
			}
		}
		return resultNamedElements;
	}
}
