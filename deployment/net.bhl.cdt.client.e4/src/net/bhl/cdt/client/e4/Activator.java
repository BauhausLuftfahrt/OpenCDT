package net.bhl.cdt.client.e4;

import java.util.Locale;

import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import model.quantities.LengthValue;
import model.quantities.QuantitiesFactory;

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
		
		LengthValue lVal = QuantitiesFactory.eINSTANCE.createLengthValue();
		
		lVal.setUnit(SI.METER);
	
		for (Unit<?> unit : SI.getInstance().getUnits()) {
			if (unit.isCompatible(javax.measure.quantity.Length.UNIT)) {
				System.out.println("Length Unit: " + unit.toString());
			} else {
				System.out.println("No Length Unit: " + unit.toString());
			}
		}
		
		//System.out.println(javax.measure.unit.NonSI.getInstance().getUnits().stream().collect(Collectors.toList()).toString());
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