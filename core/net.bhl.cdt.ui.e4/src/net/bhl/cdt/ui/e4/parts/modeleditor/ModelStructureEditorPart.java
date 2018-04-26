/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.modeleditor;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ui.e4.E4ResourceIds;
import net.bhl.cdt.ui.view.modelstructuretreeview.ModelstructuretreeviewInjectorProvider;
import net.bhl.cdt.util.constants.StringConstants;
import oida.bridge.service.OIDABridge;
import oida.bridge.service.OIDABridgeException;
import oida.bridge.ui.e4.part.PrimaryRecommendationsViewPart;
import oida.bridge.ui.e4.part.RecommendationDetailsPart;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class ModelStructureEditorPart {
    private final String OIDA_SUBDIRECTORY = "\\ont\\";

    public static final String MODEL_RESOURCE_KEY = "modelResource";
    public static final String FILE_RESOURCE_KEY = "fileResource";

    private Resource modelResource;

    private TreeViewer treeViewer;

    @Inject
    private CDTLogService logService;

    @Inject
    MApplication app;

    @Inject
    EModelService modelService;

    @Inject
    EPartService partService;

    @Inject
    @Optional
    private OIDABridge oidaBridge;

    @PostConstruct
    public void postConstruct(Composite parent, MPart part, ESelectionService selectionService) {
	if (part.getTransientData().containsKey(MODEL_RESOURCE_KEY)) {
	    File file = null;
	    if (part.getTransientData().containsKey(FILE_RESOURCE_KEY))
		file = (File)part.getTransientData().get(FILE_RESOURCE_KEY);

	    Object modelObject = part.getTransientData().get(MODEL_RESOURCE_KEY);
	    if (modelObject instanceof Resource) {
		modelResource = (Resource)part.getTransientData().get(MODEL_RESOURCE_KEY);

		modelResource.getContents().get(0).eAdapters().add(new EContentAdapter() {
		    public void notifyChanged(Notification notification) {
			part.setDirty(true);
		    }
		});

		Injector injector = ModelstructuretreeviewInjectorProvider.getInjector();
		ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);

		treeViewer = new TreeViewer(parent, SWT.BORDER);

		EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		ViewerDragAndDropHelper dragAndDropHelper = injector.getInstance(ViewerDragAndDropHelper.class);

		contextMenuHelper.addViewerContextMenu(treeViewer, editingDomain);
		dragAndDropHelper.addDragAndDrop(treeViewer, editingDomain);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
		    @Override
		    public void selectionChanged(SelectionChangedEvent event) {
			selectionService.setSelection(((TreeSelection)event.getSelection()).getFirstElement());
		    }
		});

		viewerFactory.initialize(treeViewer, modelResource);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
		    @Override
		    public void selectionChanged(SelectionChangedEvent event) {
			selectionService.setSelection(event.getSelection());

			if (oidaBridge != null) {
			    oidaBridge.reportModelSelectionChanged(modelResource.getContents().get(0), (EObject)((StructuredSelection)event.getSelection()).getFirstElement());
			}
		    }
		});

		try {
		    if (oidaBridge != null) {
			oidaBridge.invokeModelObservation(modelResource.getContents().get(0), new File(file.getParent() + OIDA_SUBDIRECTORY),
				file.getName().replace(StringConstants.DOT, StringConstants.EMPTY).replace(StringConstants.SPACE, StringConstants.EMPTY));

			MPart oidaPrimaryRecommendationPart = partService.findPart(PrimaryRecommendationsViewPart.PART_ID);
			if (oidaPrimaryRecommendationPart == null) {
			    oidaPrimaryRecommendationPart = partService.createPart(PrimaryRecommendationsViewPart.PART_ID);

			    MPartStack topPartStack = (MPartStack)modelService.find(E4ResourceIds.PARTSTACK_MODEL_ADDITIONS_TOP, app);
			    if (topPartStack != null && oidaPrimaryRecommendationPart != null) {
				topPartStack.getChildren().add(oidaPrimaryRecommendationPart);
				partService.showPart(oidaPrimaryRecommendationPart, PartState.ACTIVATE);
			    }
			} else {
			    partService.bringToTop(oidaPrimaryRecommendationPart);
			}
			
			MPart recommendationDetailsPart = partService.findPart(RecommendationDetailsPart.PART_ID);
			if (recommendationDetailsPart == null) {
			    recommendationDetailsPart = partService.createPart(RecommendationDetailsPart.PART_ID);
			    
			    MPartStack bottomPartStack = (MPartStack)modelService.find(E4ResourceIds.PARTSTACK_MODEL_ADDITIONS_BOTTOM, app);
			    if (bottomPartStack != null && recommendationDetailsPart != null) {
				bottomPartStack.getChildren().add(recommendationDetailsPart);
				partService.showPart(recommendationDetailsPart, PartState.ACTIVATE);
			    }
			} else {
			    partService.bringToTop(recommendationDetailsPart);
			}
		    }
		} catch (OIDABridgeException e) {
		    e.printStackTrace();
		}
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