import java.util.ArrayList;
import java.util.List;

import javax.measure.quantity.Length;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import net.bhl.cdt.model.v2.units.provider.IOpenCDTUnitsProvider;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-05-29
 *
 */
public class CDTStandardUnitProvider implements IOpenCDTUnitsProvider {
	@Override
	public Iterable<Unit<Length>> getLengthUnits() {
		List<Unit<Length>> list = new ArrayList<Unit<Length>>();
		list.add(SI.MILLIMETER);
		list.add(SI.METER);
		list.add(NonSI.INCH);
		return list;
	}

	@Override
	public Iterable<Unit<Length>> getDistanceUnits() {
		List<Unit<Length>> list = new ArrayList<Unit<Length>>();
		list.add(SI.KILOMETER);
		list.add(NonSI.FOOT);
		list.add(NonSI.NAUTICAL_MILE);
		return list;
	}
}
