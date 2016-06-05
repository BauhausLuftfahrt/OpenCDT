package net.bhl.cdt.report.chart;

import java.util.ArrayList;

import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.GradientImpl;

public class ColorPaletteFactory {
	public static ArrayList<Fill> createBHLPalette() {
		ArrayList<Fill> paletteEntries = new ArrayList<Fill>();
		
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(10,  58,  90), ColorDefinitionImpl.create(10, 58, 90), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(215, 128, 28), ColorDefinitionImpl.create(215, 128, 28), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(106, 185, 236), ColorDefinitionImpl.create(106, 185, 236), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(40,  130, 187), ColorDefinitionImpl.create(40, 130, 187), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(101, 136, 62), ColorDefinitionImpl.create(101, 136, 62), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(158, 179, 55), ColorDefinitionImpl.create(158, 179, 55), 0, false));
		paletteEntries.add(GradientImpl.create(ColorDefinitionImpl.create(245, 212, 14), ColorDefinitionImpl.create(245, 212, 14), 0, false));
		
		return paletteEntries;
	}
}
