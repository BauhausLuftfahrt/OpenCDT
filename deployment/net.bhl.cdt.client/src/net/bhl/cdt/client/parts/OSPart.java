package net.bhl.cdt.client.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("restriction")
public class OSPart {

	private Label label;
	private boolean disabled = true;
	
	public Logger logger;
	
	@Inject
	public OSPart(Logger logger) {
		this.logger = logger;
		logger.info("Pure 4.x part created");
	}
	
	@PostConstruct
	public void createUI(Composite parent) {
		label = new Label(parent, SWT.NONE);
		disabled = false;
		logger.info("Pure 4.x part UI created and enabled");
	}

	@PreDestroy
	public void destroy() {
		disabled = true;
		logger.info("Pure 4.x part disabled and destroyed");
	}
	
	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (disabled) {
			return;
		}
		if (selection == null) {
			label.setText("Selection changed to 'null'");
		} else {
			label.setText("Selection changed: " + selection.toString());
		}
	}
}