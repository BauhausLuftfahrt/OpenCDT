package net.bhl.cdt.util.ui;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;

import net.bhl.cdt.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-03
 *
 */
public class UIHelper {
	public static String SHOWFILE_TITLE = "Open...";
	public static String SHOWFILE_FILTER_DEFAULT = "*.*";

	public static String showSelectFileDialog(Shell shell) {
		return showSelectFileDialog(shell, SHOWFILE_TITLE);
	}

	public static String showSelectFileDialog(Shell shell, String title) {
		return showSelectFileDialog(shell, title, new String[] { SHOWFILE_FILTER_DEFAULT });
	}

	public static String showSelectFileDialog(Shell shell, String title, String[] filters) {
		return showFileDialog(shell, title, filters, StringConstants.EMPTY, SWT.OPEN);
	}
	
	public static String showSaveFileDialog(Shell shell) {
		return showSaveFileDialog(shell, SHOWFILE_TITLE);
	}

	public static String showSaveFileDialog(Shell shell, String title) {
		return showSaveFileDialog(shell, title, new String[] { SHOWFILE_FILTER_DEFAULT }, StringConstants.EMPTY);
	}
	
	public static String showSaveFileDialog(Shell shell, String title, String[] filters, String initialFolder) {
		return showFileDialog(shell, title, filters, initialFolder, SWT.SAVE);
	}
	
	private static String showFileDialog(Shell shell, String title, String[] filters, String initialFolder, int openSelect) {
		FileDialog fd = new FileDialog(shell, openSelect);
		
		if (!initialFolder.isEmpty())
		    fd.setFileName(initialFolder);
		
		fd.setText(title);
		fd.setFilterExtensions(filters);
		return fd.open();
	}
	
	public static String showDirectoryDialog(Shell shell, String title) {
		DirectoryDialog dd = new DirectoryDialog(shell);
		dd.setText(title);
		return dd.open();
	}
	
	public static ImageDescriptor getImageDescriptor(Bundle bundle, String relativeFileString) {
	    URL url = FileLocator.find(bundle, new Path(relativeFileString), null);
	    return ImageDescriptor.createFromURL(url);
	}
}
