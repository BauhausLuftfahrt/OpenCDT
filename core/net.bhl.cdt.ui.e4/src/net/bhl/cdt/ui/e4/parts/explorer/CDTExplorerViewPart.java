/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.explorer;

import java.io.File;
import java.text.DateFormat;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import net.bhl.cdt.core.pref.CDTPreferencesService;
import net.bhl.cdt.core.pref.listener.ICDTPreferencesListener;
import net.bhl.cdt.ui.e4.parts.explorer.labelprovider.FileModifiedLabelProvider;
import net.bhl.cdt.ui.e4.parts.explorer.labelprovider.FileSizeLabelProvider;
import net.bhl.cdt.ui.e4.parts.explorer.labelprovider.ViewLabelProvider;
import net.bhl.cdt.util.CDTFileAndFolderUtil;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTExplorerViewPart implements ICDTPreferencesListener {
    private static final String[] COLUMN_NAMES = new String[] { "Name", "Modified", "Size" };
    private static final int[] COLUMN_WIDTHS = new int[] { 200, 80, 50 };

    public static final String PREF_KEY_WORKFOLDER = "workfolder";

    private TreeViewer viewer;

    @PostConstruct
    public void postConstruct(Composite parent, CDTPreferencesService preferencesService, ESelectionService selectionService) {
	preferencesService.registerListener(this, PREF_KEY_WORKFOLDER);

	viewer = new TreeViewer(parent, SWT.FILL | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	viewer.setContentProvider(new CDTExplorerViewContentProvider());
	viewer.setLabelProvider(new ViewLabelProvider());

	viewer.getTree().addListener(SWT.Resize, new Listener() {
	    @Override
	    public void handleEvent(Event event) {
		Tree tree = (Tree)event.widget;
		int columnCount = tree.getColumnCount();
		if (columnCount == 0)
		    return;
		
		Rectangle area = tree.getClientArea();
		int totalAreaWdith = area.width;
		int lineWidth = tree.getGridLineWidth();
		int totalGridLineWidth = (columnCount - 1) * lineWidth;
		int totalColumnWidth = 0;
		for (TreeColumn column : tree.getColumns())
		    totalColumnWidth = totalColumnWidth + column.getWidth();
		    
		int diff = totalAreaWdith - (totalColumnWidth + totalGridLineWidth);

		TreeColumn firstCol = tree.getColumns()[0];

		firstCol.setWidth(diff + firstCol.getWidth());
	    }
	});

	viewer.setComparator(new ViewerComparator() {
	    @Override
	    public int compare(Viewer viewer, Object e1, Object e2) {
		int cat1 = sortDirs(e1);
		int cat2 = sortDirs(e2);
		if (cat1 != cat2)
		    return cat1 - cat2;
		return 0;
	    }

	    private int sortDirs(Object element) {
		File file = (File)element;
		if (file.isDirectory())
		    return 1;
		return 2;
	    }
	});

	viewer.getTree().setHeaderVisible(true);

	createColumns();

	Optional<String> optWorkFolder = preferencesService.getPreference(PREF_KEY_WORKFOLDER);
	if (optWorkFolder.isPresent())
	    viewer.setInput(new File(optWorkFolder.get()));
	else
	    preferencesService.setPreference(PREF_KEY_WORKFOLDER, CDTFileAndFolderUtil.getUserDefaultWorkFolderPath());
    }

    private void createColumns() {
	TreeViewerColumn mainColumn = new TreeViewerColumn(viewer, SWT.NONE);
	mainColumn.getColumn().setText(COLUMN_NAMES[0]);
	mainColumn.getColumn().setWidth(COLUMN_WIDTHS[0]);
	mainColumn.getColumn().setResizable(true);
	mainColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new ViewLabelProvider()));

	TreeViewerColumn modifiedColumn = new TreeViewerColumn(viewer, SWT.NONE);
	modifiedColumn.getColumn().setText(COLUMN_NAMES[1]);
	modifiedColumn.getColumn().setWidth(COLUMN_WIDTHS[1]);
	modifiedColumn.getColumn().setAlignment(SWT.RIGHT);
	modifiedColumn.getColumn().setResizable(false);
	modifiedColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new FileModifiedLabelProvider(DateFormat.getDateInstance())));

	TreeViewerColumn fileSizeColumn = new TreeViewerColumn(viewer, SWT.NONE);
	fileSizeColumn.getColumn().setText(COLUMN_NAMES[2]);
	fileSizeColumn.getColumn().setWidth(COLUMN_WIDTHS[2]);
	fileSizeColumn.getColumn().setAlignment(SWT.RIGHT);
	fileSizeColumn.getColumn().setResizable(false);
	fileSizeColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new FileSizeLabelProvider()));
    }

    @PreDestroy
    public void preDestroy(CDTPreferencesService preferencesService) {
	preferencesService.deRegisterListener(this, PREF_KEY_WORKFOLDER);
    }

    public void notifyPreferenceChanged(CDTPreferencesService sender, String preferenceKey) {
	Optional<String> optWorkFolder = sender.getPreference(PREF_KEY_WORKFOLDER);
	if (optWorkFolder.isPresent())
	    viewer.setInput(new File(optWorkFolder.get()));
    }
}
