/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model.modelview;

import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.View;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.internal.part.NullEditorInput;

/**
 * Editor input
 * 
 * @author wesendon
 */
@SuppressWarnings("restriction")
public class ConfigurationInput extends NullEditorInput implements IEditorInput {
	private final Configuration configuration;
	private final View view;

	public ConfigurationInput(Configuration conf, View view) {
		super();
		this.configuration = conf;
		this.view = view;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public View getView() {
		return view;
	}
}
