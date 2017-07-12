package net.bhl.cdt.client;

import java.util.Locale;
import java.util.stream.Collectors;

import javax.measure.quantity.Length;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EGenericType;
import org.jscience.physics.amount.Amount;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import model.data.DataFactory;
import model.data.DataPackage;
import model.data.LengthParamenter;

public class Activator implements BundleActivator {
    private static BundleContext context;

    public static BundleContext getContext() {
	return context;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.
     * BundleContext)
     */
    public void start(BundleContext bundleContext) throws Exception {
	Activator.context = bundleContext;
	Locale.setDefault(Locale.US);
	
	LengthParamenter lVal = DataFactory.eINSTANCE.createLengthParamenter();

	lVal.setValue(Amount.valueOf(4, SI.METER));
	
	for (EGenericType t : DataPackage.eINSTANCE.getLengthParamenter().getEGenericSuperTypes()) {
	    if (t.getETypeArguments().get(0).getEClassifier().getInstanceClass() == Length.class) {
		for (Unit<?> u : SI.getInstance().getUnits().stream().filter(u -> u.getDimension().equals(Length.UNIT.getDimension())).collect(Collectors.toList())) {
		    System.out.println("SI: Unit: " + u.toString());
		}
		
		for (Unit<?> u : NonSI.getInstance().getUnits().stream().filter(u -> u.getDimension().equals(Length.UNIT.getDimension())).collect(Collectors.toList()))
		    System.out.println("Non-SI: Unit: " + u.toString());
	    }
	}
	    
//
//	for (Unit<?> unit : SI.getInstance().getUnits()) {
//	    if (unit.isCompatible(javax.measure.quantity.Length.UNIT)) {
//		System.out.println("Length Unit: " + unit.toString());
//	    } else {
//		System.out.println("No Length Unit: " + unit.toString());
//	    }
//	}

	// System.out.println(javax.measure.unit.NonSI.getInstance().getUnits().stream().collect(Collectors.toList()).toString());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext bundleContext) throws Exception {
	Activator.context = null;
    }
}