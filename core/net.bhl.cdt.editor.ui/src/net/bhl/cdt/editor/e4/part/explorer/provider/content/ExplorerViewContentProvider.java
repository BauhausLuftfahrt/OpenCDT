/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.editor.e4.part.explorer.provider.content;

import java.io.File;
import java.util.Collections;

import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class ExplorerViewContentProvider implements ITreeContentProvider {
    @Override
    public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof File)
	    return filterFiles((File)parentElement);
	else
	    return Collections.EMPTY_LIST.toArray();
    }

    @Override
    public Object getParent(Object element) {
	if (element instanceof File)
	    return ((File)element).getParentFile();
	else
	    return null;
    }

    @Override
    public boolean hasChildren(Object element) {
	if (element instanceof File)
	    return ((File)element).isDirectory();
	else
	    return false;
    }

    private Object[] filterFiles(File file) {
//	FilenameFilter filter = new FilenameFilter() {
//	    @Override
//	    public boolean accept(File dir, String name) {
//		return true;
//	    }
//	};
//
//	return file.listFiles(filter);
	return file.listFiles();
    }
}
