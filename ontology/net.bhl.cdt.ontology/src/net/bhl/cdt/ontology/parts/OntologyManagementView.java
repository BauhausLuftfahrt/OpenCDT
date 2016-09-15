package net.bhl.cdt.ontology.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import net.bhl.cdt.core.ui.UIHelper;
import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.ontology.management.OntologyManager;

public class OntologyManagementView {
	private CDTLogService log;

	@PostConstruct
	public void createPartControl(Composite parent, Shell shell, CDTLogService log) {
		this.log = log;

		Button b = new Button(parent, SWT.NONE);
		b.setText("Load Ontology...");
		b.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String file = UIHelper.showSelectFileDialog(shell, UIHelper.SHOWFILE_TITLE, new String[]{"*.owl", "*.*"});
				
				if (file != null && !file.isEmpty())
					OntologyManager.getInstance().loadOntologyFromFile(file, log);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}

	/**
	 * This method manages the selection of your current object. In this example
	 * we listen to a single Object (even the ISelection already captured in E3
	 * mode). <br/>
	 * You should change the parameter type of your received Object to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;

		// Test if label exists (inject methods are called before PostConstruct)
//		if (myLabelInView != null)
//			myLabelInView.setText("Current single selection class is : " + o.getClass());
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current array of objects received in case of multiple selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {

		// Test if label exists (inject methods are called before PostConstruct)
//		if (myLabelInView != null)
//			myLabelInView.setText("This is a multiple selection of " + selectedObjects.length + " objects");
	}
}
