package net.bhl.cdt.ui.e4.parts.explorer;

import java.net.URL;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTExplorerPart {
	private static final String ICONS_FOLDER = "icons/16_Folder.png";
	
	private TreeViewer viewer;
	
	@Inject
	private ESelectionService selectionService;
	
	@PostConstruct
	public void postConstruct(Composite parent, ESelectionService selectionService) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new CDTExplorerViewContentProvider());
		viewer.setLabelProvider(new CDTExplorerViewLabelProvider(createImageDescriptor()));
		//viewer.setInput(projectRoot);
		//viewer.setComparator(new ProjectComperator());

		Tree tree = (Tree)viewer.getControl();
	}
	
	private ImageDescriptor createImageDescriptor() {
		Bundle bundle = FrameworkUtil.getBundle(CDTExplorerViewLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path(ICONS_FOLDER), null);
		return ImageDescriptor.createFromURL(url);
	}
}
