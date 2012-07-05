/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview.powerconsumer;

import java.util.ArrayList;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is deprecated. When all changes have taken place, remove or
 * replace content.
 */
@Deprecated
public class EstimatorUtil {

	public static Value getValue(Component element) {
		Parameter param = getParam(element);
		if (param != null && param.getValues().size() > 0) {
			return param.getValues().get(0);
		}
		return null;
	}

	public static Parameter getParam(Component element) {
		for (Parameter param : element.getParameters()) {
			if ("power consumption".equals(param.getName())) {
				return param;
			}
		}
		return null;
	}

	public static Parameter getPowerParameter(EObject other, String name) {
		if (name == null)
			name = "";
		TreeIterator<EObject> iter = other.eAllContents();
		while (iter.hasNext()) {
			EObject next = iter.next();
			if (next instanceof Component
					&& name.equals(((Component) next).getName())) {
				Parameter param = getParam((Component) next);
				if (param != null) {
					return param;
				}
			}
		}
		return null;
	}

	public static Value getPowerValue(EObject hayStack, String name) {
		Parameter powerParameter = getPowerParameter(hayStack, name);
		if (powerParameter != null && powerParameter.getValues().size() > 0) {
			return powerParameter.getValues().get(0);
		}
		return null;
	}

	public static double getAverage(Component component,
			ArrayList<Configuration> references) {
		double result = 0;
		int count = 0;
		for (Configuration config : references) {
			Value value = getPowerValue(config, component.getName());
			if (value != null) {
				result += value.getValue();
				count++;
			}
		}
		return (count == 0) ? 0 : result / count;
	}
}
