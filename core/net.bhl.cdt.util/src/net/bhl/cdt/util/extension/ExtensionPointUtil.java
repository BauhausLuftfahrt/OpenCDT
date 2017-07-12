/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.util.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-03-15
 *
 */
public class ExtensionPointUtil {
	
	/**
	 * 
	 * @param extensionRegistry
	 * @param type
	 * @param extensionPointId
	 * @return
	 * @throws CoreException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T loadSingleExtension(IExtensionRegistry extensionRegistry, Class<T> type, String extensionPointId) throws CoreException {
		if (extensionRegistry != null) {
			IConfigurationElement[] config = extensionRegistry.getConfigurationElementsFor(extensionPointId);
			for (IConfigurationElement e : config) {
					final Object o = e.createExecutableExtension("class");
					if (type.isAssignableFrom(o.getClass()))
						return (T)o;
			}
		}

		return null;
	}
	
	/**
	 * 
	 * @param extensionRegistry
	 * @param type
	 * @param extensionPointId
	 * @return
	 * @throws CoreException
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> loadExtensions(IExtensionRegistry extensionRegistry, Class<T> type, String extensionPointId) throws CoreException {
		List<T> extensionList = new ArrayList<T>();
		
		if (extensionRegistry != null) {
			IConfigurationElement[] config = extensionRegistry.getConfigurationElementsFor(extensionPointId);
			for (IConfigurationElement e : config) {
				try {
					final Object o = e.createExecutableExtension("class");
					if (type.isAssignableFrom(o.getClass()))
						extensionList.add((T)o);
				}
				catch(CoreException coreEx) {
					coreEx.printStackTrace();
				}
			}
		}

		return extensionList;
	}
}
