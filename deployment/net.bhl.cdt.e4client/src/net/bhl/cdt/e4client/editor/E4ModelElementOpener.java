package net.bhl.cdt.e4client.editor;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.e4.editor.ECPE4Editor;
import org.eclipse.emf.ecp.ui.e4.util.EPartServiceHelper;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;

/**
 * Opens a model element in {@link ECPE4Editor}.
 *
 * @author Jonas Helming (Eclipse Source)
 *
 */
@SuppressWarnings("restriction")
public class E4ModelElementOpener implements ECPModelElementOpener {

	private final String partId = "net.bhl.cdt.client.partdescriptor.editor"; //$NON-NLS-1$

	/**
	 * Opens a model element in {@link ECPE4Editor}. {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.ui.util.ECPModelElementOpener#openModelElement(java.lang.Object,
	 *      org.eclipse.emf.ecp.core.ECPProject)
	 */
	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		final EPartService partService = EPartServiceHelper.getEPartService();
		for (final MPart existingPart : partService.getParts()) {
			if (!partId.equals(existingPart.getElementId())) {
				continue;
			}

			if (existingPart.getContext() == null) {
				continue;
			}

			if (existingPart.getContext().get(ECPE4Editor.INPUT) == element) {
				if (!existingPart.isVisible() || !existingPart.isOnTop()) {
					partService.showPart(existingPart, PartState.ACTIVATE);
				}
				
				return;
			}
		}

		final MPart part = partService.createPart(partId);
		partService.showPart(part, PartState.ACTIVATE);
		part.getContext().set(ECPProject.class, ecpProject);
		part.getContext().set(ECPE4Editor.INPUT, element);
	}
}