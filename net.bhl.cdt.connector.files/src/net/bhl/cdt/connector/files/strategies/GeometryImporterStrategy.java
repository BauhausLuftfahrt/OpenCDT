/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.files.strategies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;
import javax.measure.unit.UnitFormat;

import net.bhl.cdt.connector.files.FilesPackage;
import net.bhl.cdt.connector.files.GeometryImporter;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.Value;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This strategy imports a Geometry.ini file.
 * 
 * @author martin.glas
 */
public class GeometryImporterStrategy extends FileParserStrategy {

	@Override
	public void start(ProcessElement processElement) {

		if (processElement instanceof GeometryImporter) {
			GeometryImporter geometryImporter = (GeometryImporter) processElement;

			importGeometryFile(geometryImporter);

		}

	}

	private void importGeometryFile(GeometryImporter geometryImporter) {
		ESLocalProject project = ModelHelper.getContainingProject(geometryImporter);
		BufferedReader bufferedReader = null;
		try {

			UnitFormat.getInstance().alias(NonSI.DEGREE_ANGLE, "deg");
			UnitFormat.getInstance().alias(NonSI.FOOT, "feet");
			UnitFormat.getInstance().alias(NonSI.INCH, "inches");
			String CDTPATH = Activator.getDefault().getPreferenceStore().getString("CDTPATH") + File.separator;
			bufferedReader = new BufferedReader(new FileReader(CDTPATH + geometryImporter.getFileName()));

			String line = bufferedReader.readLine();

			if (line.startsWith("[Geometry_General]")) {
				line = bufferedReader.readLine();
				Parameter newParameter = null;
				Component containerComponent = SystemHelper.getProjectMainComponent(project);

				Unit<?> newUnit = null;
				while (line != null) {
					// Check if a Parameter is declared
					if (line.startsWith(";")) {
						int unitindex = line.indexOf("[");
						String unitName = "";
						String parameterName = "";
						if (unitindex == -1) {
							newUnit = null;
							parameterName = line.substring(1).trim();
						} else {
							unitName = line.substring(unitindex + 1, line.length() - 1);
							parameterName = line.substring(1, unitindex - 1).trim();
						}
						newParameter = SystemHelper.generateParameter(parameterName, geometryImporter,
							containerComponent);

						if (unitName != "") {
							newUnit = Unit.valueOf(unitName);
						}

					} else if (line.startsWith("[")) {

						String componentName = line.replace("[", "").replace("]", "");

						containerComponent = SystemHelper.generateComponent(componentName, geometryImporter,
							SystemHelper.getProjectMainComponent(project));

					}

					else {
						int equalsIndex = line.indexOf("=");

						String valueName = line.substring(0, equalsIndex).trim();
						String valueString = line.substring(equalsIndex + 1);
						Value newValue;
						if (newUnit != null) {
							newValue = SystemHelper.generateUniqueMeasuredValue(valueName, valueString, newUnit,
								geometryImporter);

						} else {
							newValue = SystemHelper.generateValue(valueName, valueString, geometryImporter, project);
						}
						if (newParameter != null) {
							newValue.setParameter(newParameter);
							SystemHelper.wireParameterAndValue(newParameter, newValue);
						}
					}

					line = bufferedReader.readLine();

				}
			}
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean isStartable(ProcessElement processElement) {

		if (processElement instanceof GeometryImporter) {
			GeometryImporter geometryImporter = (GeometryImporter) processElement;
			String CDTPATH = Activator.getDefault().getPreferenceStore().getString("CDTPATH");

			if ((geometryImporter.getFileName() != null) && (geometryImporter.getFileName().equals("Geometry.ini"))
				&& (CDTPATH != "")) {

				return FileUtils.exists(CDTPATH + File.separator + geometryImporter.getFileName().toString());

			}
		}
		return false;
	}

	@Override
	public EClass getEClass() {
		return FilesPackage.Literals.GEOMETRY_IMPORTER;
	}

}
