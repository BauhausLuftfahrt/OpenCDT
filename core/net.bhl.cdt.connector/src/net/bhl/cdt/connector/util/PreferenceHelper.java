/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.util;

import net.bhl.cdt.connector.exception.ImportException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.osgi.service.prefs.BackingStoreException;

/**
 * The preference helper aids storing {key, value} pairs.
 * 
 * @author Michael Kagel
 */
public final class PreferenceHelper {

	private PreferenceHelper() {
		// nothing to do here
	}

	private static final String PREFERENCE_NODE = "cdt";

	/**
	 * Get a preference value for a specific key.
	 * 
	 * @param key
	 *            the
	 * @param defaultValue
	 *            the
	 * @return the value if it exists, otherwise the defaultValue
	 */
	public static String getPreference(String key, String defaultValue) {
		String value = Platform.getPreferencesService().getRootNode()
				.node(ConfigurationScope.SCOPE).node(PREFERENCE_NODE)
				.get(key, defaultValue);
		return value;
	}

	/**
	 * Set the preference value for a specific key. Key and value must not equal
	 * null.
	 * 
	 * @param key
	 *            the
	 * @param value
	 *            the
	 */
	public static void setPreference(String key, String value) {
		if (key != null && value != null) {
			Platform.getPreferencesService().getRootNode()
					.node(ConfigurationScope.SCOPE).node(PREFERENCE_NODE)
					.put(key, value);
			try {
				Platform.getPreferencesService().getRootNode()
						.node(ConfigurationScope.SCOPE).node(PREFERENCE_NODE)
						.flush();
			} catch (BackingStoreException e) {
				throw new ImportException(
						"Could not persist the preference change: {" + key
								+ ", " + value + "}", e);
			}
		}
	}
}
