/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.strategies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface;
import net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator;
import net.bhl.cdt.connector.avl.avlmodel.AVLSection;
import net.bhl.cdt.connector.avl.avlmodel.AVLSurface;
import net.bhl.cdt.connector.avl.avlmodel.AvlmodelPackage;
import net.bhl.cdt.connector.avl.avlmodel.SymmetryType;
import net.bhl.cdt.model.geometry.SpaceVector;
import net.bhl.cdt.model.process.OperationStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.system.Counter;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.MeasuredValue;
import net.bhl.cdt.model.system.StringValue;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;

/**
 * @author martin.glas
 */
public class AVLModelGeneratorStrategy implements OperationStrategy {

	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof AVLModelGenerator) {
			AVLModelGenerator avlModelGenerator = (AVLModelGenerator) processElement;
			FileWriter fileWriter = null;
			try {
				File avlEngine = new File(Activator.getDefault().getPreferenceStore().getString("AVLPATH"));
				String avlModelPath = avlEngine.getParent() + File.separator + avlModelGenerator.getFileName();
				File file = new File(avlModelPath);
				fileWriter = new FileWriter(file);
				writeAVLModelHeader(avlModelGenerator, fileWriter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	private void writeAVLModelHeader(AVLModelGenerator avlModelGenerator, FileWriter fileWriter) throws IOException {
		// =((2/3*chord1*(1+taper1+taper1^2)/(1+taper1))*((span1/2)*chord1*(1+taper1))+(2/3*chord2*(1+taper2+taper2^2)/(1+taper2))*((span2/2)*chord2*(1+taper2)))/(((span1/2)*chord1*(1+taper1))+((F28/2)*span2*(1+taper2)))
		writeLine(avlModelGenerator.getName(), fileWriter);
		writeLine("#Mach", fileWriter);
		writeLine(avlModelGenerator.getMach().getValue().toString(), fileWriter);
		writeLine("#IYsym   IZsym   Zsym", fileWriter);
		writeLine(avlModelGenerator.getIYsym().getValue() + "      " + avlModelGenerator.getIZSym().getValue()
			+ "      " + "0.0", fileWriter);
		writeLine("#Sref    Cref    Bref", fileWriter);
		writeLine(avlModelGenerator.getSref().getValue().toString() + "     "
			+ avlModelGenerator.getCref().getValue().toString() + "     "
			+ avlModelGenerator.getBref().getValue().toString(), fileWriter);
		writeLine("#Xref    Yref    Zref", fileWriter);
		writeLine(avlModelGenerator.getXref().getValue().toString() + "     "
			+ avlModelGenerator.getYref().getValue().toString() + "     "
			+ avlModelGenerator.getZref().getValue().toString(), fileWriter);
		writeLine("#", fileWriter);
		writeLine("#", fileWriter);
		for (AVLSurface avlSurface : avlModelGenerator.getSurfaces()) {
			writeAVLSurface(avlSurface, fileWriter);
		}

	}

	private void writeAVLSurface(AVLSurface avlSurface, FileWriter fileWriter) throws IOException {
		writeLine("#====================================================================", fileWriter);
		writeLine("SURFACE", fileWriter);
		writeLine(avlSurface.getName().toString(), fileWriter);
		writeLine("#Nchordwise  Cspace   Nspanwise   Sspace", fileWriter);
		writeLine(
			avlSurface.getNchordwise() + "            " + avlSurface.getCspace() + "       "
				+ avlSurface.getNspanwise() + "       " + avlSurface.getSspace(), fileWriter);
		if (avlSurface.getYDuplicate() != null) {
			if (avlSurface.getYDuplicate().getYDupl() != null) {
				writeLine("#", fileWriter);
				writeLine("YDUPLICATE", fileWriter);
				writeLine(avlSurface.getYDuplicate().getYDupl().getValue().toString(), fileWriter);
			}
		}
		if (avlSurface.getAngle() != null) {
			writeLine("#", fileWriter);
			writeLine("ANGLE", fileWriter);
			writeLine(avlSurface.getAngle().getAngle().getValue().toString(), fileWriter);
		}

		for (AVLSection avlSection : avlSurface.getSections()) {
			writeAVLSection(avlSection, fileWriter);
		}
	}

	private void writeAVLSection(AVLSection avlSection, FileWriter fileWriter) throws IOException {
		writeLine("#-------------------------------------------------------------", fileWriter);
		writeLine("SECTION", fileWriter);
		writeLine("#Xle    Yle    Zle     Chord   Ainc  Nspanwise  Sspace", fileWriter);
		List<Value> values = new ArrayList<Value>();
		values.add(avlSection.getXle());
		values.add(avlSection.getYle());
		values.add(avlSection.getZle());
		values.add(avlSection.getChord());
		values.add(avlSection.getAinc());
		// values.add(avlSection.getNspanwise());
		// values.add(avlSection.getSspace());
		writeValuesToLine(values, fileWriter);
		fileWriter.write(String.valueOf(avlSection.getNspanwise()) + "     ");
		writeLine(String.valueOf(avlSection.getSspace()), fileWriter);
		for (AVLControlSurface avlControlSurface : avlSection.getControlSurfaces()) {
			writeControlSurface(avlControlSurface, fileWriter);
		}

	}

	private void writeControlSurface(AVLControlSurface avlControlSurface, FileWriter fileWriter) throws IOException {
		writeLine("", fileWriter);
		writeLine("#Cname   Cgain  Xhinge  HingeVec     SgnDup", fileWriter);
		writeLine("CONTROL", fileWriter);
		List<Value> values = new ArrayList<Value>();
		fileWriter.write(avlControlSurface.getName() + "  ");
		values.add(avlControlSurface.getCgain());
		values.add(avlControlSurface.getXhinge());
		values.add(avlControlSurface.getHingeVector());
		// values.add(avlControlSurface.getSgnDup());
		writeValuesToLine(values, fileWriter);
		writeLine(String.valueOf(avlControlSurface.getSgnDup().getValue()), fileWriter);
		writeLine("#", fileWriter);
	}

	private void writeValuesToLine(List<Value> values, FileWriter fileWriter) throws IOException {
		String valuesString = "";
		for (Value value : values) {
			String valueString = "";
			if (value instanceof DecimalNumber) {
				DecimalNumber decimalNumber = (DecimalNumber) value;

				valueString = decimalNumber.getValue().toString();

			} else if (value instanceof Counter) {
				Counter counter = (Counter) value;
				valueString = Integer.valueOf(counter.getValue()).toString();

			} else if (value instanceof SpaceVector) {
				SpaceVector spaceVector = (SpaceVector) value;
				valueString = spaceVector.getX().toString() + " " + spaceVector.getY().toString() + " "
					+ spaceVector.getZ().toString();

			} else if (value instanceof StringValue) {
				StringValue stringValue = (StringValue) value;
				valueString = stringValue.getValue();

			} else if (value instanceof MeasuredValue) {
				MeasuredValue measuredValue = (MeasuredValue) value;
				valueString = measuredValue.getValue().toString();

			}
			valuesString = valuesString + valueString + "     ";
		}
		fileWriter.write(valuesString);
	}

	private void writeLine(String string, FileWriter fileWriter) throws IOException {
		fileWriter.write(string);
		fileWriter.write(System.getProperty("line.separator"));

	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof AVLModelGenerator) {
			AVLModelGenerator avlModelGenerator = (AVLModelGenerator) processElement;
			return isValid(avlModelGenerator);
		}
		return false;
	}

	private boolean isValid(AVLModelGenerator avlModelGenerator) {
		if ((!avlModelGenerator.getFileName().isEmpty() && (FileUtils.exists(Activator.getDefault()
			.getPreferenceStore().getString("AVLPATH"))))) {

			if (!FileUtils.isValidFileName(avlModelGenerator.getFileName(), ".avl")) {
				return false;
			}
			if (avlModelGenerator.getMach() == null) {
				return false;
			}

			if (avlModelGenerator.getSref() == null) {
				return false;
			}

			if (avlModelGenerator.getCref() == null) {
				return false;
			}

			if (avlModelGenerator.getBref() == null) {
				return false;
			}

			if (avlModelGenerator.getXref() == null) {
				return false;
			}

			if (avlModelGenerator.getXref() == null) {
				return false;
			}

			if (avlModelGenerator.getZref() == null) {
				return false;
			}

			if (!(avlModelGenerator.getIZSym() == SymmetryType.NO_SYMMETRY) && (avlModelGenerator.getZsym() == null)) {
				return false;
			}
			for (AVLSurface avlSurface : avlModelGenerator.getSurfaces()) {
				if (!isReady(avlSurface)) {
					return false;
				}

			}

		}
		return true;
	}

	private boolean isReady(AVLSurface avlSurface) {
		for (AVLSection avlSection : avlSurface.getSections()) {
			if (!isReady(avlSection)) {
				return false;
			}
		}
		return true;
	}

	private boolean isReady(AVLSection avlSection) {
		if (avlSection.getXle() == null) {
			return false;
		}
		if (avlSection.getYle() == null) {
			return false;
		}
		if (avlSection.getZle() == null) {
			return false;
		}
		if (avlSection.getChord() == null) {
			return false;
		}
		if (avlSection.getAinc() == null) {
			return false;
		}
		for (AVLControlSurface avlControlSurface : avlSection.getControlSurfaces()) {
			if (!isReady(avlControlSurface)) {
				return false;
			}
		}

		return true;
	}

	private boolean isReady(AVLControlSurface avlControlSurface) {
		if (avlControlSurface.getCgain() == null) {
			return false;
		}
		if (avlControlSurface.getXhinge() == null) {
			return false;
		}
		if (avlControlSurface.getHingeVector() == null) {
			return false;
		}
		return true;
	}

	@Override
	public EClass getEClass() {
		return AvlmodelPackage.Literals.AVL_MODEL_GENERATOR;
	}

}
