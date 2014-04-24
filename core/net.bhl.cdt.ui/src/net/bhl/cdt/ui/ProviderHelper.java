/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * Helper class for provider.
 * 
 * @author Michael Kagel
 */
public final class ProviderHelper {

	private ProviderHelper() {
	}

	/**
	 * Collects all possible values for a feature.
	 * 
	 * @param object The object which contains the feature and the value
	 * @param parentReferences The parent references of the object
	 * @param feature The feature which should be shown
	 * @return A collection of values which the feature can have
	 */
	// BEGIN COMPLEX CODE //
	public static Collection<?> getChoiceOfValues(Object object, EReference[] parentReferences,
		EStructuralFeature feature) {
		if (object instanceof EObject) {
			if (parentReferences != null) {
				Collection<Object> result = new UniqueEList<Object>();
				for (int i = 0; i < parentReferences.length; ++i) {
					result.addAll(getProjectModelElements((EObject) object, parentReferences[i].getEType()));
				}
				return result;
			} else if (feature != null) {
				if (feature instanceof EReference) {
					Collection<EObject> result = getProjectModelElements((EObject) object, feature.getEType());
					if (!feature.isMany() && !result.contains(null)) {
						result.add(null);
					}
					return result;
				} else if (feature.getEType() instanceof EEnum) {
					EEnum eEnum = (EEnum) feature.getEType();
					List<Enumerator> enumerators = new ArrayList<Enumerator>();
					for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
						enumerators.add(eEnumLiteral.getInstance());
					}
					return enumerators;
				} else {
					EDataType eDataType = (EDataType) feature.getEType();
					List<String> enumeration = ExtendedMetaData.INSTANCE.getEnumerationFacet(eDataType);
					if (!enumeration.isEmpty()) {
						List<Object> enumerators = new ArrayList<Object>();
						for (String enumerator : enumeration) {
							enumerators.add(EcoreUtil.createFromString(eDataType, enumerator));
						}
						return enumerators;
					}
				}
			}
		}

		return null;
	}

	// END COMPLEX CODE //

	private static Collection<EObject> getProjectModelElements(EObject object, EClassifier type) {

		Collection<EObject> result = new ArrayList<EObject>();

		EObject tmpObject = object;
		while (!(tmpObject instanceof ESLocalProject)) {
			if (tmpObject.eContainer() != null) {
				tmpObject = tmpObject.eContainer();
			} else {
				return null;
			}
		}

		ESLocalProject project = (ESLocalProject) tmpObject;
		ArrayList<EObject> list = new ArrayList<EObject>();
		list = new ArrayList<EObject>(project.getAllModelElementsByClass(type.getClass()));

		// project.getAllModelElementsbyClass((EClass) type, list);
		result.addAll(list);

		return result;
	}
}
