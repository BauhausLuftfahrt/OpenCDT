/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.explorer.provider;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-03-07
 *
 */
public class FileModifiedLabelProvider extends LabelProvider implements IStyledLabelProvider {

    private DateFormat dateLabelFormat;

    public FileModifiedLabelProvider(DateFormat dateFormat) {
        dateLabelFormat = dateFormat;
    }

    @Override
    public StyledString getStyledText(Object element) {
        if (element instanceof File) {
            File file = (File) element;
            long lastModified = file.lastModified();
            return new StyledString(dateLabelFormat.format(new Date(lastModified)));
        }
        
        return null;
    }
}