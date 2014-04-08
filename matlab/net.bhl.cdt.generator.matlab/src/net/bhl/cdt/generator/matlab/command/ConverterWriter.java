package net.bhl.cdt.generator.matlab.command;

import java.io.IOException;


/**
 * This interface specifies methods of a writer which can used to write to files or to remote co.soles.
 * @author martin.glas
 *
 */
public interface ConverterWriter {
	
	
	/**
	 * This method writes a string with a specified number of tab stops.
	 * @param tabulator number of tab stops
	 * @param str the string which should be written.
	 */
	void writeLine(Integer tabulator, String str);

	/**
	 * This method writes a string.
	 * @param str the string which should be written.
	 */
	void writeLine(String str);
	
	/**
	 * This method closes the writer.
	 * @throws IOException exception which my thrown by this method.
	 */
	void close() throws IOException;

}
