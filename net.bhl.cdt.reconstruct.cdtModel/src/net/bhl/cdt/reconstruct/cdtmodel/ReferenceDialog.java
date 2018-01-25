package net.bhl.cdt.reconstruct.cdtmodel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Injector;

import cdtliterature.CdtliteratureFactory;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableInjectorProvider;

/**
 * Customized dialog using parsley and represent the list of literature-model.
 * */
public class ReferenceDialog extends Dialog {

	
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");	
	private Resource resourceLibrary;
	private Object object;
	private IStructuredSelection selection;
	private String uriFrag;
	private static final int COLUMN  = 6;
	private static final int WIDTH  = 940;
	private static final int HEIGHT  = 300;
	
	public ReferenceDialog(Shell parent, FormToolkit _toolkit) {
		super(parent);
	}
	
	protected Control createDialogArea(Composite parent) {
		
		Shell shell = parent.getShell();
		shell.setText("References");
		
		/**dsl modul of parsley is called.
		 * */
		Injector injector = CdtliteraturetableInjectorProvider.getInjector();
		ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
		 
		Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
		resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
			
		
		
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
				
		Composite container = (Composite) super.createDialogArea(parent);
		
		TreeViewer treeViewer = viewerFactory.createTreeViewerWithColumns(container,
				CdtliteratureFactory.eINSTANCE.getCdtliteraturePackage().getALiteratureBase(), resourceLibrary);
		
		treeViewer.expandAll();

		contextMenuHelper.addViewerContextMenu(treeViewer, editingDomain);
		treeViewer.getTree().setHeaderVisible(true);
        treeViewer.getTree().setLinesVisible(true);
      
        for(int i= 0; i< COLUMN; i++){
        	
        	treeViewer.getTree().getColumn(i).setWidth(150);	
        }
	
        
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			   public void selectionChanged(SelectionChangedEvent event) {
				   
			       if(event.getSelection().isEmpty()) {			           
			           return;
			       }
			       if(event.getSelection() instanceof IStructuredSelection) {
			    	   
			           selection = (IStructuredSelection)event.getSelection();
			           
			           try{
			       			
			        	    object = selection.getFirstElement();
			        	    
			        	    EObject eobj = (EObject) object; 
					        uriFrag = resourceLibrary.getURIFragment(eobj);
			   		   }catch(ClassCastException exc) {
			   		   }
        
	
			       }
			   }
			});
		
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
		    @Override
		    public void doubleClick(DoubleClickEvent event) {
		    	
		        TreeViewer viewer = (TreeViewer) event.getViewer();
		        IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
		        object  = thisSelection.getFirstElement();
		        
		        EObject eobj = (EObject) object; 
		        uriFrag = resourceLibrary.getURIFragment(eobj);
		        
		        viewer.setExpandedState(object,
		                !viewer.getExpandedState(object));
		        
		        handleShellCloseEvent();
		        
		    }
		});

	      return container;
			
	}
	public void handleShellCloseEvent() {
		close();
	}
	public Point getInitialSize() {
	      return new Point(WIDTH, HEIGHT);
	}
	public Object getObject(){
		return object;
	}
	@Override
    protected void okPressed() {
        super.okPressed();
    }	
	protected boolean isResizable() {
		return true;
	}
	public String getUriEOB(){
		
		return uriFrag;
	}
	
}
