package net.bhl.cdt.core.ui.e4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

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
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
		fd.setText(title);
		fd.setFilterExtensions(filters);
		return fd.open();
	}
}
