/*******************************************************************************
 * <copyright> Copyright (c) 2009-2017 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.core.science;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.measure.quantity.Length;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-07-13
 *
 */
public class UnitProvider {
    private static HashMap<Quantity, Unit<?>[]> unitLists = new HashMap<Quantity, Unit<?>[]>();
    
    public static Unit<?>[] provide(Quantity q) {
	if (!unitLists.containsKey(q)) {
	    List<Unit<?>> units = new ArrayList<Unit<?>>();

	    if (q instanceof Length) {
		units.addAll(SI.getInstance().getUnits().stream().filter(u -> u.getDimension().equals(Length.UNIT.getDimension())).collect(Collectors.toList()));
		units.addAll(NonSI.getInstance().getUnits().stream().filter(u -> u.getDimension().equals(Length.UNIT.getDimension())).collect(Collectors.toList()));
	    }
	    
	    unitLists.put(q, units.toArray(new Unit[units.size()]));
	}
	
	return unitLists.get(q);
    }
}
