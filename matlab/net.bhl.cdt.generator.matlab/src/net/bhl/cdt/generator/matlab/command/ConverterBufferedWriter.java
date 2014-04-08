/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.generator.matlab.command;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Extended BufferedWriter.
 * 
 * @author David Otter
 * 
 */
public class ConverterBufferedWriter extends BufferedWriter  implements ConverterWriter{

	/**
	 * Default Constructor.
	 * 
	 * @param out
	 *            Writer
	 */
	public ConverterBufferedWriter(Writer out) {
		super(out);
	}

	/**
	 * Extends the standard {@link #write(String)} function.
	 * 
	 * @param tabulator
	 *            Number of tabulators for the format.
	 * @param str
	 *            write String
	 */
	public void writeLine(Integer tabulator, String str) {
		try {
			String tabulatorOutput = "";
			for (int i = 0; i < tabulator; i++) {
				tabulatorOutput += "\t";
			}
			this.write(tabulatorOutput + str);
			this.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Calls {@link #writeLine(Integer, String)} with the tabulator value 0.
	 * 
	 * @param str
	 *            write String
	 */
	public void writeLine(String str) {
		this.writeLine(0, str);
	}
	
	

}
