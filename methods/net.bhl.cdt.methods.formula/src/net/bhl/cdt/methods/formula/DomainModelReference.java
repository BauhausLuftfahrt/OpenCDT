/*package net.bhl.cdt.methods.formula;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecp.view.spi.custom.model.ECPHardcodedReferences;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.model.VFeaturePathDomainModelReference;
import org.eclipse.emf.ecp.view.spi.model.VViewFactory;

import formula.FormulaPackage;

public class DomainModelReference implements ECPHardcodedReferences {

	public DomainModelReference() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<VDomainModelReference> getNeededDomainModelReferences() {
		
		Set<VDomainModelReference> features = new LinkedHashSet<VDomainModelReference>();
        VFeaturePathDomainModelReference latex = VViewFactory.eINSTANCE.createFeaturePathDomainModelReference();
        latex.setDomainModelEFeature(FormulaPackage.eINSTANCE.getFormula_LatexString());
        features.add(latex);

        return features;

	}

}
*/