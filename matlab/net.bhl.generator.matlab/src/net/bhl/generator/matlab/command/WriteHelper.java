/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.generator.matlab.command;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral;

/**
 * Help methods for the Converter.
 * 
 * @author David Otter
 * 
 */
final class WriteHelper {

	/**
	 * Write Helper provides only static methods.
	 */
	private WriteHelper() {
	}

	private static final String COMMENT = "%\n% Generated with Bauhaus Luftfahrt Matlab Converter\n%\n";

	/**
	 * Write revision section.
	 * 
	 * @param bufferedWriter
	 *            BufferedWriter
	 */
	public static void writeRevision(ConverterBufferedWriter bufferedWriter) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		bufferedWriter.writeLine("");
		bufferedWriter.writeLine("");
		bufferedWriter.writeLine("% Revision history:");
		bufferedWriter.writeLine("%{");
		bufferedWriter.writeLine("%\t\t" + dateFormat.format(new Date()));
		bufferedWriter.writeLine("\t\tv0.1 was created by BHLMG");
		bufferedWriter.writeLine("%}");
	}

	/**
	 * Write Header for TUM MAtlab file.
	 * 
	 * @param bufferedWriter
	 *            ConverterBufferedWriter
	 * @param name
	 *            Classname
	 */
	public static void writeTUMHead(ConverterBufferedWriter bufferedWriter, String name) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		bufferedWriter
				.writeLine("% -------------------------------------------------------------------------");
		bufferedWriter.writeLine("%\t\t\tGenerated with Bauhaus Luftfahrt Matlab Generator");
		bufferedWriter
				.writeLine("% -------------------------------------------------------------------------");
		bufferedWriter.writeLine("% \t\t\t\t\t\t\t" + name.toUpperCase());
		bufferedWriter.writeLine("%");
		bufferedWriter.writeLine("% This class defines the " + name + " class.");
		bufferedWriter.writeLine("% Enter:\t\t-");
		bufferedWriter.writeLine("% Module:\t\t-");
		bufferedWriter.writeLine("% Version:\t\t0.1");
		bufferedWriter.writeLine("% Inputs:\t\t-");
		bufferedWriter.writeLine("% Outputs:\t\t-");
		bufferedWriter.writeLine("% Functions:\t-");
		bufferedWriter.writeLine("% Description:\tThis class defines the " + name
				+ " class with all it`s");
		bufferedWriter.writeLine("% \t\t\t\tproperties, methods, attributes and events.");
		bufferedWriter.writeLine("% Limitations:\t-");
		bufferedWriter.writeLine("% Assumptions:\t-");
		bufferedWriter.writeLine("% Example:\t\t-");
		bufferedWriter.writeLine("% Author:\t\t" + System.getProperty("user.name"));
		bufferedWriter.writeLine("% Date:\t\t\t" + dateFormat.format(new Date()));
		bufferedWriter.writeLine("% Matlab:\t\tR2013a");
		bufferedWriter.writeLine("% Contact:");
		bufferedWriter
				.writeLine("% -------------------------------------------------------------------------");
		bufferedWriter.writeLine("");
	}

	/**
	 * Map to Convert Java Types to Matlab Types.
	 * 
	 * @return a HashMap<Java, Matlab>
	 */
	public static Map<String, String> getMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("java.lang.Integer", "integer");
		map.put("java.lang.Character", "char");
		map.put("java.lang.String", "char");
		map.put("java.lang.Float", "float");
		map.put("java.lang.Boolean", "logical");
		map.put("java.lang.Double", "double");
		map.put("org.eclipse.emf.common.util.EList<?>", "cell");
		return map;
	}

	/**
	 * @return the head comment of the .m file
	 */
	public static String getComment() {
		return COMMENT;
	}

	/**
	 * Get all SuperTypes of the object as a String. Separator: &
	 * 
	 * @param inheritances
	 *            List of SuperTypes
	 * @return default: handle
	 */
	public static String getInheritance(List<GenClass> inheritances) {
		if (inheritances.isEmpty()) {
			return " < handle";
		} else {
			String result = " < ";
			Iterator<GenClass> iterator = inheritances.iterator();
			while (iterator.hasNext()) {
				result += iterator.next().getName();
				if (iterator.hasNext()) {
					result += " & ";
				}
			}
			return result;
		}
	}

	/**
	 * Get all EnumLiterals of the object as a String. Separator: ,
	 * 
	 * @param genEnumLiterals
	 *            List of EnumLiterals
	 * @return default: empty String
	 */
	public static String getEnumLiterals(List<GenEnumLiteral> genEnumLiterals) {
		String result = "";
		if (genEnumLiterals.isEmpty()) {
			return result;
		} else {
			Iterator<GenEnumLiteral> iterator = genEnumLiterals.iterator();
			while (iterator.hasNext()) {
				result += iterator.next().getName();
				if (iterator.hasNext()) {
					result += ", ";
				}
			}
			return result;
		}
	}

	/**
	 * Write all Strings until mark in notGenerated is reached.
	 * 
	 * @param mark
	 *            The mark to match, for all marks see: ConverterBufferedReader
	 * @param bufferedWriter
	 *            ConverterBufferedWriter
	 * @param notGenerated
	 *            List with not generated lines
	 */
	public static void writeUntilMark(String mark, ConverterBufferedWriter bufferedWriter,
			List<String> notGenerated) {
		if (notGenerated.contains(mark)) {
			String line = notGenerated.remove(0);
			while (!line.equals(mark)) {
				bufferedWriter.writeLine(line);
				line = notGenerated.remove(0);
			}
		}
	}

	/**
	 * Removes the 2 end lines of the List, because they will be generated.
	 * 
	 * @param list
	 *            notGenerated List
	 */
	public static void removeEndTail(List<String> list) {
		int count = 0;
		int posEnd1 = 0;
		int posEnd2 = 0;
//		int posRev = -1;
		if (list.size() > 2) {
			for (String line : list) {
				if (line.matches("\\s*end\\s*")) {
					posEnd2 = posEnd1;
					posEnd1 = count;
				} 
//				else if (line.matches("% Revision history:")) {
//					posRev = count;
//				}
				count++;
			}
//			if (posRev != -1) {
//				list.remove(posRev - 1);
//			}
			list.remove(posEnd1);
			list.remove(posEnd2);
		}
	}

	/**
	 * Safe Method to remove the first item of the list. Does nothing if the
	 * list is empty.
	 * 
	 * @param list
	 *            notGenerated List
	 */
	public static void removeFirst(List<String> list) {
		if (!list.isEmpty()) {
			list.remove(0);
		}
	}

	/**
	 * Similar to list.contains but uses match.
	 * 
	 * @param list
	 *            notGenerated list
	 * @param match
	 *            the String to match
	 * @return if the String matches one item of the list.
	 */
	public static Boolean isMatch(List<String> list, String match) {
		for (String line : list) {
			if (line.matches("\\s*" + match + ".*")) {
				return true;
			}
		}
		return false;
	}
}
