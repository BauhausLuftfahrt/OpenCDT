package net.bhl.cdt.reconstruct.cdtmodel;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
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
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.emf.parsley.viewers.ViewerFactory;
import org.eclipse.emf.parsley.views.OnSelectionTableView;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cdtliterature.ALiteratureBase;
import cdtliterature.Article;
import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;
import net.bhl.cdt.literature.model.parsley.ParsleyInjectorProvider;
import net.bhl.cdt.reconstruct.cdtliteraturetable.CdtliteraturetableInjectorProvider;
import net.bhl.cdt.reconstruct.cdtmodel.CdtmodelInjectorProvider;

public class ReferenceDialog extends Dialog {

	
	private URI uri = URI.createFileURI(System.getProperty("user.home") + "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");
	private TableViewer viewer;
	private ViewerFactory viewerFactory;
	
	
	
	public ReferenceDialog(Shell parent) {
		super(parent);
	}

	protected Control createDialogArea(Composite parent) {
		//FormToolkit toolkit = new FormToolkit(parent.getDisplay());

		 Injector injector = CdtliteraturetableInjectorProvider.getInjector();
		 ViewerFactory viewerFactory = injector.getInstance(ViewerFactory.class);
		 
		  //OnSelectionTableView tableView = injector.getInstance(OnSelectionTableView.class);
		  
		  //Table t = toolkit.createTable(container, SWT.NONE);
		  /*GridData gd = new GridData(GridData.FILL_BOTH);
	        gd.heightHint = 20;
	        gd.widthHint = 100;
	        t.setLayoutData(gd);
	        viewer = new TableViewer(t);
	        TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);*/
		Injector injectorLib = ParsleyInjectorProvider.getInjector();
		ResourceLoader resourceLoader = injectorLib.getInstance(ResourceLoader.class);
		EditingDomain editingDomain = injectorLib.getInstance(EditingDomain.class);
		Resource resourceLibrary = resourceLoader.getResource(editingDomain, uri).getResource();
		
		Library library = (Library) resourceLibrary.getContents().get(0);
		
		Article article = library.getArticle().get(0);
		Composite container = (Composite) super.createDialogArea(parent);
		/*TableFormFactory tableFactory = injector.getInstance(TableFormFactory.class);
		TableFormComposite tableComposite = tableFactory.createTableFormMasterDetailComposite(parent, SWT.BORDER,library.eClass());
		TableViewer table = viewerFactory.createTableViewer(tableComposite, SWT.BORDER | SWT.NO_SCROLL, library.eClass());
		tableComposite.getViewerFactory().initialize(table, article);*/
		
		
		TableViewer table = viewerFactory.createTableViewer(container, SWT.BORDER | SWT.NO_SCROLL, library.eClass());
		//TableViewer table = viewerFactory.createTableViewer(container, SWT.BORDER | SWT.NO_SCROLL, article.eClass());
		viewerFactory.initialize(table, library.getName());
		table.getTable().getColumn(0).setWidth(100);
		table.getTable().getColumn(1).setWidth(100);
		/*table.getTable().getColumn(2).setWidth(100);*/
		//table.getTable().getColumn(1).setWidth(100);
		//viewerFactory.initialize(treeView,library);
		
		//.getTable().getColumn(0).setWidth(100);
		
	/*	TreeViewer treeViewer = viewerFactory.createTreeViewerWithColumns(container, library.eClass(), library);
		treeViewer.getTree().getColumn(0).setWidth(100);
		treeViewer.getTree().getColumn(1).setWidth(100);*/
		//viewerFactory.buildColumns(table,);
		//viewerFactory.buildColumns(table,article.eClass());		
		/*Library library = (Library) resourceLibrary.getContents().get(0);
		ViewerFactory viewerFactory = new ViewerFactory();
		TableViewer table = viewerFactory.createTableViewer(container, SWT.BORDER | SWT.FULL_SELECTION, library.eClass());
		viewerFactory.initialize(table, uri);
		*/
	    
	    
	      /*Button button = new Button(container, SWT.PUSH);
	        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
	                false));
	        button.setText("Press me");
	        button.addSelectionListener(new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                System.out.println("Pressed");
	            }
	        });*/
	      
	
		  
	      return container;
			
	    }

	    // overriding this methods allows you to set the
	    // title of the custom dialog
	    /*protected void configureShell(Shell newShell) {
	        super.configureShell(newShell);
	        newShell.setText("Selection dialog");
	    }*/

	protected Point getInitialSize() {
	      return new Point(450, 300);
	}

	    
	    

}
