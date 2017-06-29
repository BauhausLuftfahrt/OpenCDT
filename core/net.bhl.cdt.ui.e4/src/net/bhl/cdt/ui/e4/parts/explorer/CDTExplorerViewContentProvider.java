package net.bhl.cdt.ui.e4.parts.explorer;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Vector;

import org.eclipse.jface.viewers.ITreeContentProvider;

import net.bhl.cdt.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTExplorerViewContentProvider implements ITreeContentProvider {
	private final Object[] EMPTY_ARRAY = new Vector<Object>().toArray();

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if ((parentElement instanceof File) == false)
			return EMPTY_ARRAY;

		return filterFiles((File) parentElement);
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof File) {
			File file = (File) element;
			return file.getParentFile();
		}

		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof File)
			return ((File) element).isDirectory();

		return false;
	}

	private Object[] filterFiles(File file) {
		if (file == null)
			return EMPTY_ARRAY;

		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.startsWith(StringConstants.DOT))
					return false;
				
				return true;
			}
		};

		return file.listFiles(filter);
	}
}
