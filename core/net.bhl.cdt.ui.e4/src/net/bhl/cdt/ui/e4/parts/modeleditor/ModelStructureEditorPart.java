/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.modeleditor;

import java.io.IOException;
import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import net.bhl.cdt.log.service.CDTLogService;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class ModelStructureEditorPart {
    public static final String MODEL_RESOURCE_KEY = "modelResource";

    private Resource modelResource;

    private TreeViewer treeViewer;

    @Inject
    private CDTLogService logService;

    @PostConstruct
    public void postConstruct(Composite parent, MPart part, ESelectionService selectionService, EPartService partService, ECommandService commandService, EHandlerService handlerService) {
//	if (part.getTransientData().containsKey(MODEL_RESOURCE_KEY)) {
//	    Object modelObject = part.getTransientData().get(MODEL_RESOURCE_KEY);
//	    if (modelObject instanceof Resource) {
//		modelResource = (Resource)part.getTransientData().get(MODEL_RESOURCE_KEY);
//
//		modelResource.getContents().get(0).eAdapters().add(new EContentAdapter() {
//		    public void notifyChanged(Notification notification) {
//			part.setDirty(true);
//		    }
//		});
//
//		Injector injector = ViewInjectorProvider.getInjector();
//		ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
//
//		treeViewer = new TreeViewer(parent, SWT.BORDER);
//
//		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
//		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
//		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);
//
//		contextMenuHelper.addViewerContextMenu(treeViewer, editingDomain);
//		dragAndDropHelper.addDragAndDrop(treeViewer, editingDomain);
//
//		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
//		    @Override
//		    public void doubleClick(DoubleClickEvent event) {
//			selectionService.setSelection(event.getSelection());
//		    }
//		});
//
//		viewerFactory.initialize(treeViewer, modelResource);
//	    } else
//		logService.error("CDT Default Modeleditor can not be opened: Passed object is not an EMF Resource.");
//	} else
//	    logService.error("CDT Default Modeleditor can not be opened: No model object passed.");
    }

    @Persist
    public void persist(MPart part) {
	try {
	    modelResource.save(Collections.EMPTY_MAP);
	    part.setDirty(false);
	    logService.info("Model saved: " + modelResource.getURI().toString());
	} catch (IOException e) {
	    logService.error("Error while saving model " + modelResource.getURI().toString() + ": '" + e.getMessage() + "'", e);
	}
    }
}