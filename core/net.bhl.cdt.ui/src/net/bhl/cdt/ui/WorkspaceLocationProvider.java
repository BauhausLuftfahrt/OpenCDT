/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui;

import java.io.File;


/**
 * Do we really need this class?
 */
import org.eclipse.emf.emfstore.internal.client.model.util.DefaultWorkspaceLocationProvider;


@SuppressWarnings("restriction")
public class WorkspaceLocationProvider extends DefaultWorkspaceLocationProvider{

	public static final Object CDT_FOLDERNAME = ".cdt";

	@Override
	public String getWorkspaceDirectory() {
		StringBuffer sb = new StringBuffer();
		sb.append(System.getProperty("user.home"));
		sb.append(File.separatorChar);
		sb.append(CDT_FOLDERNAME);

		return sb.toString();
	}

}
