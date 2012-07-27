/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.model.modelview.disciplineview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.ComponentInterface;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;
import net.bhl.cdt.model.architecturetools.exceptions.NoParameterSetForInterfaceException;
import net.bhl.cdt.model.modelview.Filter;
import net.bhl.cdt.model.util.ComponentInterfaceUtil;
import net.bhl.cdt.utilities.exceptions.CDTRuntimeException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class SimpleFilter extends ViewerFilter {
	private Filter filter;
	private HashSet<EObject> allowed;
	private DisciplineContenProvider contentProvider;

	public SimpleFilter(IContentProvider iContentProvider, Filter filter, Configuration configuration) {
		this.filter = filter;
		allowed = new HashSet<EObject>();
		contentProvider = (DisciplineContenProvider) iContentProvider;
		List<MappableComponentInterface> filteredInterfaces = new ArrayList<MappableComponentInterface>();

		if (filter.getInterface().isEmpty()) {
			filteredInterfaces.addAll(ComponentInterfaceUtil.getComponentInterfaces(configuration,
				MappableComponentInterface.class));
		} else {
			for (ComponentInterface filterInterface : filter.getInterface()) {
				EClass eclazz = filterInterface.eClass();
				// filteredInterface: List for keeping all instances of an interface specified in a filter
				filteredInterfaces.addAll(ComponentInterfaceUtil.getComponentInterfaces(configuration, eclazz,
					MappableComponentInterface.class));
			}
		}

		for (MappableComponentInterface mappableInterface : filteredInterfaces) {
			// Check whether an instance of filtertedInterface matches the other filter criteria
			if (filtered(filter, mappableInterface)) {
				try {
					if (mappableInterface.getParameter() != null) {
						allowed.add(mappableInterface.getParameter());
						addParents(mappableInterface.eContainer(), allowed);
					}
				} catch (NoParameterSetForInterfaceException e) {
					// Do nothing
				} catch (Exception e) {
					throw new CDTRuntimeException(e.getMessage());
				}
			}
		}
	}

	private boolean filtered(Filter filter, MappableComponentInterface mappableInterface) {
		boolean result = true;

		if (filter.getComponent().isEmpty()) {
			// No Components are specified; allow all elements
		} else {
			boolean match = false ;
			for (Component component : filter.getComponent()) {
				if (mappableInterface.getParentComponent() == component ) {
					match = true ;
					break;
				}
			}
			if (!match) {
				return false ;
			} else {
				result = match ;
			}
			
		}

		if (filter.getDiscipline().isEmpty()) {
			// No Discipline is specified; allow all elements

		} else {
			if (mappableInterface.getDiscipline().isEmpty()) {
				return false;
			}
			boolean match = false;
			for (String filterDiscipline : filter.getDiscipline()) {
				if (mappableInterface.getDiscipline().contains(filterDiscipline)) {
					match = true;
				} else {
					match = false;
					return false;
				}
			}

			if (!match) {
				return false;
			} else {
				result = match ;
			}
			
		}

		if (filter.getSource() == null) {
			if (mappableInterface.getSource() != null && !mappableInterface.getSource().isEmpty()) {
				return false;
			}
		} else {
			if (!filter.getSource().isEmpty() || mappableInterface.getSource() != null) {

				if (!filter.getSource().equals(mappableInterface.getSource())) {
					return false;
				}
			}
		}

		// if ((filter.getText() != null) && (!filter.getText().equals(mappableInterface.getAnnotation()))) {
		// return false;
		// }

		return result;
	}

	private void addParents(EObject parent, HashSet<EObject> allowed) {

		if (parent == null || parent instanceof Model) {
			return;
		}
		allowed.add(parent);
		addParents(parent.eContainer(), allowed);
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		boolean result = false;

		if (element instanceof Component || element instanceof Configuration) {
			result = false;
			for (Object object : contentProvider.getChildren(element)) {
				if (this.select(viewer, element, object)) {
					result = true;
					break;
				}
			}
		} else if (element instanceof Parameter) {
			if (filter.getComplement() == null || !filter.getComplement()) {
				result = allowed.contains(element);
			} else {
				result = !allowed.contains(element);
			}
		} else if (element instanceof Value) {
			Parameter parameter;
			Component component;
			parameter = (Parameter) ((Value) element).eContainer();
			component = parameter.getParentComponent();
			result = this.select(viewer, component, parameter);
		}

		return result;
	}
}
