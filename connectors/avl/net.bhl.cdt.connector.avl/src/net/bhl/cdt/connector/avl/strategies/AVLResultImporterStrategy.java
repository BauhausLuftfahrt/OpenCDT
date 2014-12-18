/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.connector.avl.strategies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;

import net.bhl.cdt.connector.avl.avlprocess.AVLResultImporter;
import net.bhl.cdt.connector.avl.avlprocess.AvlprocessPackage;
import net.bhl.cdt.connector.files.strategies.FileParserStrategy;
import net.bhl.cdt.model.process.ProcessElement;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.Parameter;
import net.bhl.cdt.model.system.State;
import net.bhl.cdt.model.system.util.SystemHelper;
import net.bhl.cdt.model.util.FileUtils;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.emfstore.client.ESLocalProject;

/**
 * This strategy imports an AVL result file.
 * 
 * @author martin.glas
 */
public class AVLResultImporterStrategy extends FileParserStrategy {

	@Override
	public void start(ProcessElement processElement) {
		ESLocalProject project = ModelHelper.getContainingProject(processElement);
		if (processElement instanceof AVLResultImporter) {
			AVLResultImporter avlResultImporter = (AVLResultImporter) processElement;
			BufferedReader bufferedReader = null;
			try {
				File avlEngine = new File(Activator.getDefault().getPreferenceStore().getString("AVLPATH"));
				String avlResultPath = avlEngine.getParent() + File.separator + avlResultImporter.getFileName();
				bufferedReader = new BufferedReader(new FileReader(avlResultPath));
				String stateName = "";
				State state = null;

				// alpha
				Parameter alphaParameter = SystemHelper.generateParameter("alpha", avlResultImporter,
					SystemHelper.getProjectMainComponent(project));
				DecimalNumber alphaStateValue = null;

				// beta
				Parameter betaParameter = SystemHelper.generateParameter("beta", avlResultImporter,
					SystemHelper.getProjectMainComponent(project));
				DecimalNumber betaStateValue = null;

				// CLtot
				Parameter cLtotParameter = SystemHelper.generateParameter("CLtot", avlResultImporter,
					SystemHelper.getProjectMainComponent(project));
				DecimalNumber cLtotStateValue = null;

				// CDtot
				Parameter cDtotParameter = SystemHelper.generateParameter("CDtot", avlResultImporter,
					SystemHelper.getProjectMainComponent(project));
				DecimalNumber cDtotStateValue = null;
				// aileron
				Parameter aileronDeflectionParameter = SystemHelper.generateParameter("aileronDeflection1",
					avlResultImporter, SystemHelper.getProjectMainComponent(project));
				DecimalNumber aileronDeflection = null;

				String line = bufferedReader.readLine();
				line = bufferedReader.readLine();
				while (line != null) {
					// Check if a Parameter is declared
					if (line.startsWith(" Run case: ")) {
						stateName = line.substring(11);
						state = SystemHelper.generateState(stateName, avlResultImporter,
							SystemHelper.getProjectMainComponent(project));
					}

					else if (line.startsWith("  Alpha =")) {
						String valueString = line.substring(10, 20).trim();
						alphaStateValue = SystemHelper.generateUniqueMeasuredValue("alpha", valueString,
							NonSI.DEGREE_ANGLE, avlResultImporter);
						if (!alphaParameter.getValues().contains(alphaStateValue)) {
							alphaParameter.getValues().add(alphaStateValue);
						}

					}

					else if (line.startsWith("  Beta  =")) {
						String valueString = line.substring(10, 20).trim();
						betaStateValue = SystemHelper.generateUniqueMeasuredValue("beta", valueString,
							NonSI.DEGREE_ANGLE, avlResultImporter);
						if (!betaParameter.getValues().contains(betaStateValue)) {
							betaParameter.getValues().add(betaStateValue);
						}
					}

					else if (line.startsWith("  CLtot =")) {
						String valueString = line.substring(10).trim();
						cLtotStateValue = SystemHelper.generateUniqueMeasuredValue("CLtot", valueString, Unit.ONE,
							avlResultImporter);
						if (!cLtotParameter.getValues().contains(cLtotStateValue)) {
							cLtotParameter.getValues().add(cLtotStateValue);
						}

					}

					else if (line.startsWith("  CDtot =")) {
						String valueString = line.substring(10).trim();
						cDtotStateValue = SystemHelper.generateUniqueMeasuredValue("CDtot", valueString, Unit.ONE,
							avlResultImporter);
						if (!cDtotParameter.getValues().contains(cDtotStateValue)) {
							cLtotParameter.getValues().add(cDtotStateValue);
						}

					}

					else if (line.startsWith("   aileron")) {
						String valueString = line.substring(20).trim();
						aileronDeflection = SystemHelper.generateUniqueMeasuredValue("Deflection of Aileron",
							valueString, Unit.valueOf("°"), avlResultImporter);
						if (!aileronDeflectionParameter.getValues().contains(aileronDeflection)) {
							aileronDeflectionParameter.getValues().add(aileronDeflection);
						}

					}

					line = bufferedReader.readLine();
				}
				SystemHelper.connect(state, alphaStateValue);
				SystemHelper.connect(state, betaStateValue);
				SystemHelper.connect(state, cLtotStateValue);
				SystemHelper.connect(state, cDtotStateValue);
				SystemHelper.connect(state, aileronDeflection);

			}

			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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

	}

	@Override
	public boolean isStartable(ProcessElement processElement) {
		if (processElement instanceof AVLResultImporter) {
			AVLResultImporter avlResultImporter = (AVLResultImporter) processElement;
			String avlEnginePath = Activator.getDefault().getPreferenceStore().getString("AVLPATH");

			if ((avlResultImporter.getFileName() != null) && (avlEnginePath != "")) {
				File avlEngine = new File(Activator.getDefault().getPreferenceStore().getString("AVLPATH"));
				String avlResultPath = avlEngine.getParent() + File.separator + avlResultImporter.getFileName();
				return FileUtils.exists(avlResultPath);

			}
		}
		return false;

	}

	@Override
	public EClass getEClass() {
		return AvlprocessPackage.Literals.AVL_RESULT_IMPORTER;
	}
}
