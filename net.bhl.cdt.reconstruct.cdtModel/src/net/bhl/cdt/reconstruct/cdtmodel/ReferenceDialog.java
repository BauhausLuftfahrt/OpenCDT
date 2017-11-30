package net.bhl.cdt.reconstruct.cdtmodel;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.emf.parsley.edit.ui.dnd.ViewerDragAndDropHelper;
import org.eclipse.emf.parsley.menus.ViewerContextMenuHelper;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.emf.parsley.views.OnSelectionTableView;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cdtliterature.ALiteratureBase;
import cdtliterature.Article;
import cdtliterature.Book;
import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableInjectorProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;

public class ReferenceDialog extends Dialog {

	
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	//private TableViewer viewer;
	//private ViewerFactory viewerFactory;
	private EObject result;
	//private String selectedItemString;
	//private TreeItem item;
	private Library library;
	private FormToolkit toolkit;
	private ALiteratureBase literatureObj;
	private Resource resourceLibrary;
	private Object object;
	private IStructuredSelection selection;
	
	public ReferenceDialog(Shell parent, FormToolkit _toolkit) {
		super(parent);
		toolkit = _toolkit;
	}
	/**
	 * the custom dialog is created*/
	protected Control createDialogArea(Composite parent) {
		
		/**
		 * title of dialog is set as references*/
		Shell shell = parent.getShell();
		shell.setText("References");
		
		Injector injector = CdtliteraturetableInjectorProvider.getInjector();
		ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
		 
		Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
		resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
		
		
		ViewerContextMenuHelper contextMenuHelper = injector.getInstance(ViewerContextMenuHelper.class);
		
		library = (Library) resourceLibrary.getContents().get(0);
		
		Composite container = (Composite) super.createDialogArea(parent);
		

		TreeViewer treeViewer = viewerFactory.createTreeViewerWithColumns(container,
				CdtliteratureFactory.eINSTANCE.getCdtliteraturePackage().getALiteratureBase(), resourceLibrary);
		
		treeViewer.expandAll();

		contextMenuHelper.addViewerContextMenu(treeViewer, editingDomain);
		treeViewer.getTree().setHeaderVisible(true);
        treeViewer.getTree().setLinesVisible(true);
      
        for(int i= 0; i<6; i++){
        	
        	treeViewer.getTree().getColumn(i).setWidth(150);	
        }
	
        
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			   public void selectionChanged(SelectionChangedEvent event) {
			       // if the selection is empty clear the label
			       if(event.getSelection().isEmpty()) {			           
			           return;
			       }
			       if(event.getSelection() instanceof IStructuredSelection) {
			    	   
			           selection = (IStructuredSelection)event.getSelection();
			           
			           try{
			       			literatureObj = (ALiteratureBase) selection.getFirstElement();
			       			
			        	    object = selection.getFirstElement();
			        	    
			        	    //System.out.println(object.toString());
			        	    
			        	   
			        	    
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
		        
		        result = (EObject) object;
		        //result.eClass().getName()
		        
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
	      return new Point(940, 300);
	}
	
	public EObject getResult() {
		return result;
	}
	public Object getObject(){
		return object;
	}
	@Override
    protected void okPressed() {
        super.okPressed();
    }
	public String getLiteratureObjName(){
		return literatureObj.eClass().getName();
	}
	public  ALiteratureBase getLiterature(){
		return literatureObj;
	}
	public String getLiteratureTitle(){
		
		if(literatureObj != null)
		{
			
			return literatureObj.getTitle();
			
		}
		else{
			return "";
		}
	}
	public String getLiteratureAuthor(){
		
		if(literatureObj != null)
		{
			
			return literatureObj.getAuthor();
			
		}
		else{
			return "";
		}
	}
	public Library getLibrary(){
		return library;
		
	}
	
	protected boolean isResizable() {
	    return true;
	}
}
