/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecp.core.util.ECPFilterProvider;

/**
 * Filter all EPackages not in bhl.net.
 * 
 * @author David Otter
 *
 */
public class CDTDefaultFilterProvider implements ECPFilterProvider {

	@Override
	public Set<String> getHiddenPackages() {
		String temp = null;
		Set<String> hiddenElements = new HashSet<String>();
		//All URIs
		Set<String> relevantURIs = new HashSet<String>(Registry.INSTANCE.keySet());
		Iterator<String> iterator = relevantURIs.iterator();
		while (iterator.hasNext()){
			temp = iterator.next();
			if (!temp.contains("bhl.net")) {
				hiddenElements.add(temp);
			}
		}
		for (String key: hiddenElements){
			System.out.println(key);
		}
		return hiddenElements;
	}

}
