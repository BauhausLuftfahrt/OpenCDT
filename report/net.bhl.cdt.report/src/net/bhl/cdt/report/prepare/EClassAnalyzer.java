package net.bhl.cdt.report.prepare;

import org.eclipse.emf.ecore.EClass;

public class EClassAnalyzer {
	private EClass clazz;

	public EClassAnalyzer(EClass clazz) {
		setEClass(clazz);
	}
	
	public void analzeClass() {
	}
	
	public EClass getEClass() {
		return clazz;
	}

	public void setEClass(EClass clazz) {
		this.clazz = clazz;
	}
}
