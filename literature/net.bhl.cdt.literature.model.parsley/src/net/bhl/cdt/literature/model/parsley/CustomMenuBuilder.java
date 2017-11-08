package net.bhl.cdt.literature.model.parsley;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.EmfCommandAction;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.edit.action.MenuActionContributionSpecification;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

import com.google.inject.Injector;

import cdtliterature.Book;
import cdtliterature.CdtliteratureFactory;
import cdtliterature.Library;

public class CustomMenuBuilder extends EditingMenuBuilder {

	private URI uri = URI.createFileURI(System.getProperty("user.home") 
			+ "/runtime-net.bhl.cdt.client.e4.product/reference" + "/MyLibrary.library");

		  public List<IMenuContributionSpecification> emfMenuContributions(final Library lib) {
		    /*EList<Book> _book = lib.getBook();
		    Book _createBook = CdtliteratureFactory.eINSTANCE.createBook();*/
			  
			/*Injector injector = ParsleyInjectorProvider.getInjector();

				
			EditingDomain editingDomain = injector.getInstance(EditingDomain.class);
			ResourceLoader resourceLoader = injector.getInstance(ResourceLoader.class);
						
			
			Resource resource = resourceLoader.getResource(editingDomain, uri).getResource();
			
		    IMenuContributionSpecification _actionDelete = actionDeleteLibrary("Delete this library", resource, lib);
		    
		    IMenuContributionSpecification _actionAdd = this.actionAdd("Delete this library", null, null);
		    */
		    
		    EList<Book> _book = lib.getBook();
		    Book _createBook = CdtliteratureFactory.eINSTANCE.createBook();
		    IMenuContributionSpecification _actionAdd = this.<Book>actionAdd("Add a new book", _book, _createBook);

		    
		    
		    
		    return Collections.<IMenuContributionSpecification>unmodifiableList
		    		(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionAdd));
	}
	private <T> IMenuContributionSpecification actionDeleteLibrary(String text, Resource resource, Library lib) {
		
				System.out.println("delete library1");
				return actionDelete(text, resource, lib);
	}
	private <T> IMenuContributionSpecification actionDelete(String text, Resource resource, Library lib) {
		
		//AddCommand addCommand = addCommand(list, value);
		DeleteCommand deleteCommand = deleteCommand(resource, lib);
		//addCommand.setDescription(text);
		deleteCommand.setDescription(text);
		System.out.println("delete library2");
		return new MenuActionContributionSpecification(
				new EmfCommandAction<T>(text, getEditingDomain(), deleteCommand, null));
	}
	private <T> DeleteCommand deleteCommand(Resource resource, Library lib) {
		System.out.println("delete library3");
		return new CustomDeleteCommand<T>(getEditingDomain(), lib.eContents() );
	}
	
	private static class CustomDeleteCommand<T> extends DeleteCommand {

		/*public CustomDeleteCommand(EditingDomain domain, EList<? super T> list, T value) {
			super(domain, list, value);
		}*/
		
		public CustomDeleteCommand(EditingDomain domain, Collection<?> collection) {
			
			super(domain, collection);
		}

		/*@Override
		public void doUndo() {
			// we must save the container, before undoing, since that
			// will remove the object from the container
			EObject eContainer = ((EObject) collection.iterator().next()).eContainer();
			super.doUndo();
			affectedObjects = Collections.singleton(eContainer);
		}*/
	}

		

}
