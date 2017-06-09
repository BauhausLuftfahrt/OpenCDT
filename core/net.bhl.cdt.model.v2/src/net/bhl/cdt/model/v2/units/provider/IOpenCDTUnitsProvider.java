package net.bhl.cdt.model.v2.units.provider;

import javax.measure.quantity.Length;
import javax.measure.unit.Unit;

public interface IOpenCDTUnitsProvider {
	Iterable<Unit<Length>> getLengthUnits();
	
	Iterable<Unit<Length>> getDistanceUnits();
}
