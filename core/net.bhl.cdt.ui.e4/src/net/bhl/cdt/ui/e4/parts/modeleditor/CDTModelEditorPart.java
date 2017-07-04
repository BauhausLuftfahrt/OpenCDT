/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.e4.parts.modeleditor;

import java.io.File;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.parsley.composite.TreeFormComposite;
import org.eclipse.emf.parsley.composite.TreeFormFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.google.inject.Injector;

import net.bhl.cdt.ui.e4.parts.explorer.CDTExplorerViewPart;
import net.bhl.cdt.ui.view.ViewInjectorProvider;
import net.bhl.cdt.util.constants.FileConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-04
 *
 */
public class CDTModelEditorPart {
    
    private ResourceSet modelResourceSet = new ResourceSetImpl();
    private Resource modelResource;
    
    private File modelFile;
    
    private TreeFormComposite treeFormComposite;

    @PostConstruct
    public void postConstruct(Composite parent, ESelectionService selectionService) {
	Object selectedElement = ((IStructuredSelection)selectionService.getSelection(CDTExplorerViewPart.PART_ID)).getFirstElement();
	if (selectedElement instanceof File && ((File)selectedElement).getName().endsWith(FileConstants.CDT_MODELFILE_EXTENSION)) {
	    modelFile = (File)selectedElement;
	    modelResource = modelResourceSet.getResource(URI.createFileURI(modelFile.getPath()), true);
	    
	    Injector injector = ViewInjectorProvider.getInjector();
	    
	    TreeFormFactory treeFormFactory = injector.getInstance(TreeFormFactory.class);
	    
	    treeFormComposite = treeFormFactory.createTreeFormComposite(parent, SWT.BORDER);
	    treeFormComposite.update(modelResource);
	}
    }
}
