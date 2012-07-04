/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.architecturetools.powerconsumer.filter;

import java.util.HashSet;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.PowerConsumer;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;
import net.bhl.cdt.ui.views.ConfigurationViewFilter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;

public class PowerConsumptionFilter implements ConfigurationViewFilter {

	private String[] allowedTypes;

	public PowerConsumptionFilter() {
		allowedTypes = new String[0];
	}

	public boolean filter(EObject obj) {

		if (obj instanceof Component) {
			return filter(((Component) obj).getInterfaceByClass(PowerConsumer.class));
		}
		if (obj instanceof PowerConsumer) {
			return filter((PowerConsumer) obj);
		}
		if (obj instanceof Parameter) {
			return filter(obj.eContainer());
		}
		if (obj instanceof Value) {
			if (obj.eContainer() == null) {
				return true;
			}
			return filter(obj.eContainer().eContainer());
		}

		return true;
	}

	private boolean filter(PowerConsumer powerConsumer) {
		if (powerConsumer == null || powerConsumer.getType() == null) {
			return true;
		}
		String type = powerConsumer.getType().trim();
		for (String filtered : allowedTypes) {
			if (filtered.equals(type)) {
				return false;
			}
		}
		return true;
	}

	public boolean configureFilter(Configuration config) {
		HashSet<String> types = new HashSet<String>();
		List<PowerConsumer> interfaces = ComponentInterfaceUtil.getComponentInterfaces(config, PowerConsumer.class);
		for (PowerConsumer pc : interfaces) {
			if (pc.getType() != null && !pc.getType().isEmpty()) {
				types.add(pc.getType());
			}
		}
		FilterDialog filterDialog = new FilterDialog(Display.getCurrent().getActiveShell(),
			types.toArray(new String[types.size()]));
		filterDialog.setBlockOnOpen(true);
		if (filterDialog.open() == Dialog.OK) {
			String[] result = filterDialog.getResult();
			if (result != null) {
				allowedTypes = result;
				return true;
			}
		}
		return false;
	}
}
