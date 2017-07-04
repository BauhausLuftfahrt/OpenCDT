/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.explorer.labelprovider;

import java.io.File;
import java.util.Optional;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.program.Program;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import net.bhl.cdt.ui.PluginResources;
import net.bhl.cdt.util.constants.StringConstants;
import net.bhl.cdt.util.ui.UIHelper;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-03-07
 *
 */
public class ViewLabelProvider extends LabelProvider implements IStyledLabelProvider {
    private Bundle bundle = FrameworkUtil.getBundle(this.getClass());
    private ResourceManager resourceManager = new LocalResourceManager(JFaceResources.getResources());

    @Override
    public StyledString getStyledText(Object element) {
	if (element instanceof File) {
	    File file = (File)element;
	    StyledString styledString = new StyledString(getFileName(file));
	    String[] files = file.list();
	    if (files != null)
		styledString.append(" ( " + files.length + " ) ", StyledString.COUNTER_STYLER);
	    
	    return styledString;
	}
	
	return null;
    }
    
    @Override
    public Image getImage(Object element) {
	if (element instanceof File) {
	    File file = (File)element;
	    if (file.isDirectory()) {
		return resourceManager.createImage(UIHelper.getImageDescriptor(bundle, PluginResources.EXPLORER_FOLDERICON));
	    } else {
		String fileExtension = file.getName().substring(file.getName().lastIndexOf(StringConstants.DOT));

		if (Program.findProgram(fileExtension) != null) {
		    ImageData imageData = Program.findProgram(fileExtension).getImageData();

		    Device device = resourceManager.getDevice();
		    if ((imageData != null) && (device != null))
			return new Image(device, imageData);
		} else {
		    Optional<String> optIconFileString = getSpecifiedIconFile(fileExtension);
		    if (optIconFileString.isPresent())
			return resourceManager.createImage(UIHelper.getImageDescriptor(bundle, optIconFileString.get()));
		    else
			return resourceManager.createImage(UIHelper.getImageDescriptor(bundle, PluginResources.EXPLORER_FILEICON));
		}
	    }
	}

	return super.getImage(element);
    }

    private Optional<String> getSpecifiedIconFile(final String ext) {
	return Optional.empty();
    }

    @Override
    public void dispose() {
	resourceManager.dispose();
	super.dispose();
    }

    private String getFileName(File file) {
	String name = file.getName();
	return name.isEmpty() ? file.getPath() : name;
    }
}
