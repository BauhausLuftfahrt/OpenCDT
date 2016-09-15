package net.bhl.cdt.client.ui;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class CDTUIManager {
	public static String MAINWINDOW = "net.bhl.cdt.client.e4.mainwindow";
	
	public static String ID_CDTPERSPECTIVE = "net.bhl.cdt.client.e4.perspective.cdt";
	public static String ID_PERSPECTIVESWITCHER = "net.bhl.cdt.client.e4.toolcontrol.perspectiveswitcher";

	private MApplication app;
	private EModelService service;
	
	public CDTUIManager(MApplication application, EModelService modelService) {
		app = application;
		service = modelService;
	}

	public MUIElement GetUIElement(String id) {
		return service.find(id, app);
	}
	
	public void CDTPerspectiveVisibility(boolean visible) {
		MUIElement perspective = service.find(ID_CDTPERSPECTIVE, app);
		perspective.setVisible(visible);
	}
	
	public void CDTPerspectiveSwitcherVisibility(boolean visible) {
		MUIElement switcher = service.find(ID_PERSPECTIVESWITCHER, app);
		switcher.setVisible(visible);
	}
	
	public void SetWindowTitle(String title) {
		MWindow window = (MWindow)service.find(MAINWINDOW, app);
		
		if (title.isEmpty())
			window.setLabel("OpenCDT");
		else
			window.setLabel(title);
	}
	
	public void SetWindowIcon(String iconURI) {
		MWindow window = (MWindow)service.find(MAINWINDOW, app);
		
		if (iconURI.isEmpty())
			window.setIconURI("platform:/plugin/net.bhl.cdt.client.e4/res/OpenCDT_Symbol_0016.png");
		else
			window.setIconURI(iconURI);
	}
}
