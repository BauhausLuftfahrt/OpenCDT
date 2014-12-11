/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.trace.ui.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This List makes sure that objects are unique on a list.
 * 
 * @author martin.glas
 * @param <E>
 */
public class SafeList<E> {

	private List<E> list = new LinkedList<E>();

	/**
	 * Returns true if the parameter e is not contained in the list.
	 * 
	 * @param e the object to be added
	 * @return true if it was not already existing in that list
	 */
	public Boolean safeAdd(E e) {
		if (!list.contains(e)) {
			list.add(e);
			return true;
		}
		return false;
	}

	/**
	 * This method returns the SafeList as list.
	 * 
	 * @return the List
	 */
	public List<E> toList() {
		return list;
	}

	/**
	 * Adds all elements of parameter c that are not already in the list.
	 * 
	 * @param c the Collection to be completely added to the SafeList
	 */
	public void safeAddAll(Collection<? extends E> c) {
		Iterator<? extends E> iterator = c.iterator();
		while (iterator.hasNext()) {
			this.safeAdd(iterator.next());
		}
	}

	/**
	 * Adds all elements of parameter c that are not already in the SafeList.
	 * 
	 * @param s the SafeList to be added
	 */
	public void safeAddAll(SafeList<? extends E> s) {
		this.safeAddAll(s.toList());
	}
}
