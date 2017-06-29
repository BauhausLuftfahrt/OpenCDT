package net.bhl.cdt.ui.e4.parts.explorer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.program.Program;
import org.osgi.framework.Bundle;

import com.google.common.io.Files;

public class CDTExplorerViewLabelProvider extends LabelProvider {

	private ImageDescriptor directoryImage;
	private ResourceManager resourceManager;

	public CDTExplorerViewLabelProvider(ImageDescriptor directoryImage) {
		this.directoryImage = directoryImage;
	}

	@Override
	public String getText(Object element) {		
		if((element instanceof File) == false)	
			return null;
		
		return ((File)element).getName();
	}

	@Override
	public Image getImage(Object element) {
		
		if(element instanceof File) {
			File file = (File) element;
			if(file.isDirectory()) {
				return getResourceManager().createImage(directoryImage);
			} else {
				String ext = Files.getFileExtension(file.getName());

				ImageData imageData = getFileIcon(ext);

				// get external program icons
				if (Program.findProgram(ext) != null)
					imageData = Program.findProgram(ext).getImageData();

				// if unknown use default
				if (imageData == null) {
					imageData = getDefaultFileIcon();
				}
				
				
				// render the icon on the correct device
				Device device = getResourceManager().getDevice();
				if ((imageData != null) && (device != null))
					return new Image(device, imageData);
			}			
		}

		return super.getImage(element);
	}

	@Override
	public void dispose() {
		// garbage collect system resources
		if(resourceManager != null) {
			resourceManager.dispose();
			resourceManager = null;
		}
	}

	protected ResourceManager getResourceManager() {
		if(resourceManager == null) {
			resourceManager = new LocalResourceManager(JFaceResources.getResources());
		}
		return resourceManager;
	}

	private ImageData getDefaultFileIcon() {
		ImageData imageData = null;
		
		try {
			Bundle bundle = Platform.getBundle("de.symo.projectbrowser.e4");
			URL url = bundle.getEntry("icons/16_File.png");
			InputStream inputStream = url.openConnection().getInputStream();
			imageData = new ImageData(inputStream);
		} catch (IOException e) {
		}
		
		return imageData;
	}
	
	private ImageData getFileIcon(final String ext) {
		
		ImageData imageData = null;

		URL url = null;
		Bundle bundle = Platform.getBundle("de.symo.projectbrowser.e4");
		
		try {		
			if (ext.equals("owl")) {
				url = bundle.getEntry("icons/Ontology.png");
			}
			if (ext.equals("registry")) {
				url = bundle.getEntry("icons/Registry.gif");
			}
			if (ext.equals("symo")) {
				url = bundle.getEntry("icons/SystemRepository.gif");
			}
			if (ext.equals("usecase")) {
				url = bundle.getEntry("icons/UseCaseRepository.gif");
			}

			if (url != null) {
				InputStream inputStream = url.openConnection().getInputStream();
				imageData = new ImageData(inputStream);
			}
		} catch (IOException e) {
		}
	
		return imageData;
	}
}
