package net.bhl.cdt.client.e4.editor;

import java.net.URL;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emfforms.spi.common.locale.EMFFormsLocaleProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * E4 model editor part. opens a 
 *
 * @author Michael Shamiyeh
 *
 */
public class E4ModelEditor {
	/**
	 * Key to set the input of the editor into the {@link org.eclipse.e4.core.contexts.IEclipseContext}.
	 */
	public static final java.lang.String INPUT = "ecpEditorInput"; //$NON-NLS-1$
	private MPart part;
	private EObject modelElement;
	private Adapter adapter;
	private final ScrolledComposite parent;
	
	/**
	 * Default constructor.
	 *
	 * @param composite the parent composite.
	 * @param shell to retrieve the display from. Used to retrieve the system colors.
	 */
	@Inject
	public E4ModelEditor(Composite composite, Shell shell) {
		parent = new ScrolledComposite(composite, SWT.V_SCROLL
			| SWT.H_SCROLL);
		parent.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		parent.setBackgroundMode(SWT.INHERIT_FORCE);
	}

	/**
	 * Sets the input of the editor part.
	 *
	 * @param modelElement the {@link EObject} to be opened
	 * @param ecpProject the {@link ECPProject} in which the {@link EObject} is contained
	 * @param part the corresponding {@link MPart}
	 */
	@Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, @Optional EMFFormsLocaleProvider localeProvider, MPart part) {
		if (modelElement == null) {
			return;
		}
		this.part = part;
		this.modelElement = modelElement;
		ECPSWTView render = null;
		try {
			final ViewModelContext vmc = ViewModelContextFactory.INSTANCE.createViewModelContext(
					ViewProviderHelper.getView(modelElement, null), modelElement, new DefaultReferenceService());
			
			render = ECPSWTViewRenderer.INSTANCE.render(parent, vmc);

			parent.setExpandHorizontal(true);
			parent.setExpandVertical(true);
			parent.setContent(render.getSWTControl());
			parent.setMinSize(render.getSWTControl().computeSize(SWT.DEFAULT, SWT.DEFAULT));
		} catch (final ECPRendererException ex) {
			ex.printStackTrace();
		}

		updateImageAndText();
		adapter = new AdapterImpl() {

			/*
			 * (non-Javadoc)
			 * @see
			 * org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			@Override
			public void notifyChanged(Notification msg) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						updateImageAndText();
					}
				});
			}
		};
		modelElement.eAdapters().add(adapter);
	}
	
	/**
	 * removes listener.
	 */
	@PreDestroy
	void dispose() {
		modelElement.eAdapters().remove(adapter);
	}

	private void updateImageAndText() {

		final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) InternalProvider.EMF_ADAPTER_FACTORY.adapt(
			modelElement, IItemLabelProvider.class);

		part.setLabel(itemLabelProvider.getText(modelElement));
		part.setTooltip(itemLabelProvider.getText(modelElement));

		Object image = itemLabelProvider.getImage(modelElement);
		String iconUri = null;
		if (ComposedImage.class.isInstance(image)) {
			final ComposedImage composedImage = (ComposedImage) image;
			image = composedImage.getImages().get(0);
		}
		if (URI.class.isInstance(image)) {
			final URI uri = (URI) image;
			iconUri = uri.toString();
		}
		if (URL.class.isInstance(image)) {
			final URL uri = (URL) image;
			iconUri = uri.toString();
		}

		part.setIconURI(iconUri);
	}
}
