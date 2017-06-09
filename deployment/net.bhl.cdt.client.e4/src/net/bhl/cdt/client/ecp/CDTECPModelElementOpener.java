package net.bhl.cdt.client.ecp;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;

public class CDTECPModelElementOpener implements ECPModelElementOpener {

	public CDTECPModelElementOpener() {
	}

	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		System.out.println("Hello, its me: " + element.toString() + "of project " + ecpProject.getName());
	}
}
