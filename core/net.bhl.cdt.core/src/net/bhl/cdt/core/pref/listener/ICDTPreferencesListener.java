/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.core.pref.listener;

import net.bhl.cdt.core.pref.CDTPreferencesService;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-03-07
 *
 */
public interface ICDTPreferencesListener {
    void notifyPreferenceChanged(CDTPreferencesService sender, String preferenceKey);
}
