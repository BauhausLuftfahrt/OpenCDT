/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.generator.matlab.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Extended BufferedReader.
 * 
 * @author David Otter
 * 
 */
public class ConverterBufferedReader extends BufferedReader {

	private static final List<String> BLOCK_EXPRESSIONS = Arrays.asList("for",
			"while", "switch", "try", "if", "parfor");
	private static final List<String> MARKS = Arrays.asList("classdef",
			"properties", "methods");

	/**
	 * Default Constructor.
	 * 
	 * @param in
	 *            Writer
	 */
	public ConverterBufferedReader(Reader in) {
		super(in);
	}

	/**
	 * Reads line by line until it finds % Generated. The Generated part is not
	 * included in the result.
	 * 
	 * @return List of all non generated lines of the file.
	 */
	public List<String> readNonGenerated() {
		List<String> result = new LinkedList<String>();
		try {
			String line = this.readLine();
			while (line != null) {
				result = this.mark(line, result);
				if (line.contains("% Generated")
						&& !line.toUpperCase().contains("NOT")
						&& !line.contains("with Bauhaus Luftfahrt Matlab Generator")) {
					this.readUntilEnd();
				} else {
					result.add(line);
				}
				line = this.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// result.remove(null);
		result.add("MARK_END");
		return result;
	}

	/**
	 * Read until the current block is closed with "end".
	 */
	private void readUntilEnd() {
		int expectedEnd = 1;
		String line;
		try {
			do {
				line = this.readLine();
				if (line.toLowerCase().matches("\\s*end")
						|| line.toLowerCase().matches("\\s*end\\s+.*")) {
					expectedEnd--;
				} else {
					for (String expression : BLOCK_EXPRESSIONS) {
						if (line.matches("\\s*" + expression + "\\s+.*")
								|| line.matches("\\s*" + expression)) {
							expectedEnd++;
							break;
						}
					}
				}
			} while (expectedEnd != 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Mark classdef, properties and methods.
	 * 
	 * @param str
	 *            try to match the String
	 * @param lines
	 *            List with notGenerated String lines
	 * @return Marked List
	 */
	private List<String> mark(String str, List<String> lines) {
		for (String mark : MARKS) {
			if (str.matches("\\s*" + mark)
					|| str.matches("\\s*" + mark + "\\s+.*")) {
				lines.add("MARK_" + mark);
				return lines;
			}
		}
		return lines;
	}

}
