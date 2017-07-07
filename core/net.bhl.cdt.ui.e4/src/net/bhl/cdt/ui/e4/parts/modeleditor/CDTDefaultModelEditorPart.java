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

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.view.ViewInjectorProvider;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class CDTDefaultModelEditorPart {
    public static final String MODEL_RESOURCE_KEY = "modelResource";

    private Resource modelResource;

    private TreeFormComposite treeFormComposite;

    @Inject
    private CDTLogService logService;

    @PostConstruct
    public void postConstruct(Composite parent, MPart part) {
	if (part.getTransientData().containsKey(MODEL_RESOURCE_KEY)) {
	    Object modelObject = part.getTransientData().get(MODEL_RESOURCE_KEY);
	    if (modelObject instanceof Resource) {
		modelResource = (Resource)part.getTransientData().get(MODEL_RESOURCE_KEY);
		
		modelResource.getContents().get(0).eAdapters().add(new EContentAdapter() {
		    public void notifyChanged(Notification notification) {
	                part.setDirty(true);
	            }
		});

		Injector injector = ViewInjectorProvider.getInjector();

		TreeFormFactory treeFormFactory = injector.getInstance(TreeFormFactory.class);
		treeFormComposite = treeFormFactory.createTreeFormComposite(parent, SWT.BORDER);

		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);

		contextMenuHelper.addViewerContextMenu(treeFormComposite.getViewer(), editingDomain);
		dragAndDropHelper.addDragAndDrop(treeFormComposite.getViewer(), editingDomain);

		treeFormComposite.update(modelResource);
	    } else
		logService.error("CDT Default Modeleditor can not be opened: Passed object is not an EMF Resource.");
	} else
	    logService.error("CDT Default Modeleditor can not be opened: No model object passed.");
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