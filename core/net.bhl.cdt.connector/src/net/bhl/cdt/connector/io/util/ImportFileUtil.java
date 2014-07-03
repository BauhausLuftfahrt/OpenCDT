/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.connector.io.util;

import java.io.File;

import javax.measure.unit.Unit;

import net.bhl.cdt.model.units.UnitsFactory;
import net.bhl.cdt.model.units.UnitsPackage;

/**
 * Helper methods for the FileImport.
 * 
 * @author mck
 */
public final class ImportFileUtil {

	private ImportFileUtil() {
	}

	/**
	 * Finds out the file extension format of a given file.
	 * 
	 * @param file
	 *            which should be analyzed for its extension format
	 * @return The extension format. For file "example.txt" the returned
	 *         extension format is "txt".
	 */
	public static String getFileType(File file) {
		String fileName = file.getName();
		String dot = ".";
		String fileType = fileName.substring(fileName.lastIndexOf(dot) + 1);

		return fileType;
	}

	/**
	 * Finds out the Unit of a given string.
	 * 
	 * @param s
	 *            The string format of a unit e.g. kg, m, kg/J and so on
	 * @return The Unit object which represents the given unit string type
	 */
	public static Unit getUnitFromString(String s) {
		return (Unit) UnitsFactory.eINSTANCE.createFromString(
				UnitsPackage.eINSTANCE.getUnit(), s);
	}

	// /**
	// * Finds out the Qunatity of a given string.
	// *
	// * @param s The string format of a unit e.g. kg, m, kg/J and so on
	// * @return The Quantity object which represents the quantity of the given
	// unit string type
	// */
	// public static Quantity getQuantityFromString(String s) {
	// return (Quantity)
	// UnitsFactory.eINSTANCE.createFromString(UnitsPackage.eINSTANCE.getQuantity(),
	// UnitsHelper.getQuantityByUnit(Unit.valueOf(s)));
	// }

	// private static String getQuantityByUnit(String string) {
	// if (string.equals("kg")) {
	// return Quantity.MASS.getName();
	// } else if (string.equals("m")) {
	// return Quantity.LENGTH.getName();
	// } else if (string.equals("m/s")) {
	// return Quantity.VELOCITY.getName();
	// } else if (string.equals("m/s²") || string.equals("m/s2") ||
	// string.equals("m/s^2")) {
	// return Quantity.ACCELERATION.getName();
	// } else if (string.equals("kg/J")) {
	// return Quantity.SPECIFICFUELCONSUMPTION.getName();
	// } else if (string.equals("K")) {
	// return Quantity.TEMPERATURE.getName();
	// } else if (string.equals("kg/m³") || string.equals("kg/m3") ||
	// string.equals("kg/m^3")) {
	// return Quantity.DENSITY.getName();
	// } else if (string.equals("m²") || string.equals("m2") ||
	// string.equals("m^2")) {
	// return Quantity.AREA.getName();
	// }
	//
	// return Quantity.COEFFICIENT.getName();
	// }
}
