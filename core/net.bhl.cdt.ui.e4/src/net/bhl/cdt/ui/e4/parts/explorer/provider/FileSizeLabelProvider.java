/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.explorer.provider;

import java.io.File;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-03-07
 *
 */
public class FileSizeLabelProvider extends LabelProvider implements IStyledLabelProvider {
    @Override
    public StyledString getStyledText(Object element) {
        if (element instanceof File) {
            File file = (File) element;
            if (file.isDirectory()) {
                // a directory is just a container and has no size
                return new StyledString("0");
            }
            return new StyledString(String.valueOf(file.length()));
        }
        return null;
    }
}