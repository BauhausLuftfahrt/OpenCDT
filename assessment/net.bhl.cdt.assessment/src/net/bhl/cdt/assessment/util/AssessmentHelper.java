/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.assessment.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.bhl.cdt.assessment.Capability;
import net.bhl.cdt.assessment.Industry;
import net.bhl.cdt.assessment.ReadinessLevelAssessment;
import net.bhl.cdt.assessment.Technology;
import net.bhl.cdt.ui.Activator;

import org.eclipse.emf.common.util.EList;

/**
 * This is a helper class of the assessment plug-in.
 * 
 * @author martin.glas
 */
public final class AssessmentHelper {

	private AssessmentHelper() {

	}

	/**
	 * This method returns containing technologies of given readinessLevelAssessments.
	 * 
	 * @param readinessLevelAssessments the given readinessLevelAssessments
	 * @return the containing technologies
	 */
	public static List<Technology> getTechnologies(EList<ReadinessLevelAssessment> readinessLevelAssessments) {
		List<Technology> resultList = new ArrayList<Technology>();
		for (ReadinessLevelAssessment readinessLevelAssessment : readinessLevelAssessments) {
			if (readinessLevelAssessment.eContainer() != null) {
				resultList.add((Technology) readinessLevelAssessment.eContainer());
			}
		}
		return resultList;
	}

	/**
	 * This method exports all attributes of the transitive closure of a given technology to a CSV file.
	 * 
	 * @param technology the technology of interest.
	 */
	public static void exportToCSVFile(Technology technology) {
		try {
			FileWriter writer = new FileWriter(Activator.getDefault().getPreferenceStore().getString("CDTPATH")
				+ File.separator + "criticalTechnologies.csv");

			// Create List of asssociated technologies
			List<Technology> associatedTechnologies = new ArrayList<Technology>();
			// Add the technology itself
			associatedTechnologies.add(technology);

			getAllAssociatedTechnologies(technology, associatedTechnologies);
			writer
				.append("Name;Critical TRL;Critical technologies;RequiredCapabilities; Provided capabilities;Driving industries\n");
			for (Technology associatedTechnology : associatedTechnologies) {

				writer.append(associatedTechnology.getName());
				writer.append(';');
				writer.append(associatedTechnology.getCriticalTechnologyReadynessLevel().toString());
				writer.append(';');

				Iterator<Technology> criticalTechnologiesIterator = AssessmentHelper.getTechnologies(
					associatedTechnology.getCriticalReadinessLevelAssessments()).iterator();
				while (criticalTechnologiesIterator.hasNext()) {
					Technology criticalTechnology = criticalTechnologiesIterator.next();
					writer.append(criticalTechnology.getName());
					if (criticalTechnologiesIterator.hasNext()) {
						writer.append(", ");
					}

				}

				writer.append(';');
				Iterator<Capability> requiredCapabilityIterator = associatedTechnology.getRequires().iterator();
				while (requiredCapabilityIterator.hasNext()) {
					Capability capability = requiredCapabilityIterator.next();
					writer.append(capability.getName());
					if (requiredCapabilityIterator.hasNext()) {
						writer.append(", ");
					}

				}
				writer.append(';');
				Iterator<Capability> providedCapabilityIterator = associatedTechnology.getProvides().iterator();
				while (providedCapabilityIterator.hasNext()) {
					Capability capability = providedCapabilityIterator.next();
					writer.append(capability.getName());
					if (providedCapabilityIterator.hasNext()) {
						writer.append(", ");
					}

				}

				writer.append(';');
				Iterator<Industry> drivingIndustriesIterator = associatedTechnology.getDrivenBy().iterator();
				while (drivingIndustriesIterator.hasNext()) {
					Industry industry = drivingIndustriesIterator.next();
					writer.append(industry.getName());
					if (drivingIndustriesIterator.hasNext()) {
						writer.append(", ");
					}

				}

				writer.append('\n');
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method returns all technologies which are in the transitive closure of a given technology.
	 * 
	 * @param technology the technology of interest
	 * @param associatedTechnologies the technologies related to the technology of interest via capabilities
	 */
	public static void getAllAssociatedTechnologies(Technology technology, List<Technology> associatedTechnologies) {
		for (Capability requiredCapability : technology.getRequires()) {
			for (Technology providingTechnology : requiredCapability.getProvidedBy()) {
				if (!associatedTechnologies.contains(providingTechnology)) {
					associatedTechnologies.add(providingTechnology);
					getAllAssociatedTechnologies(providingTechnology, associatedTechnologies);
				}
			}
		}

	}

	/**
	 * This method returns the critical readiness level assessments of a given capability.
	 * 
	 * @param capability the capability of interest
	 * @return the critical readiness level assessments of the given capability
	 */
	public static List<ReadinessLevelAssessment> getCriticalReadinessLevelAssessments(Capability capability) {
		List<ReadinessLevelAssessment> criticalReadinessLevelAssessments = new ArrayList<ReadinessLevelAssessment>();

		for (Technology providingTechnology : capability.getProvidedBy()) {
			List<ReadinessLevelAssessment> readinessLevelAssessments = getCriticalReadinessLevelAssessments(providingTechnology);
			if (criticalReadinessLevelAssessments.isEmpty()) {
				criticalReadinessLevelAssessments.addAll(readinessLevelAssessments);
			} else {
				if (!readinessLevelAssessments.isEmpty()) {
					if (readinessLevelAssessments.get(0).getReadinessLevel().getValue() > criticalReadinessLevelAssessments
						.get(0).getReadinessLevel().getValue()) {
						criticalReadinessLevelAssessments.clear();
						criticalReadinessLevelAssessments.addAll(readinessLevelAssessments);
					} else if (readinessLevelAssessments.get(0).getReadinessLevel().getValue() == criticalReadinessLevelAssessments
						.get(0).getReadinessLevel().getValue()) {
						criticalReadinessLevelAssessments.addAll(readinessLevelAssessments);
					}
				}
			}
		}

		return criticalReadinessLevelAssessments;
	}

	/**
	 * This method returns the critical readiness level assessments of a given technology of interest.
	 * 
	 * @param technology the technology of interest
	 * @return the critical readiness level assessments
	 */
	public static List<ReadinessLevelAssessment> getCriticalReadinessLevelAssessments(Technology technology) {
		List<ReadinessLevelAssessment> criticalReadinessLevelAssessments = new ArrayList<ReadinessLevelAssessment>();

		List<ReadinessLevelAssessment> highestSubstantiatedReadinessLevelAssessments = new ArrayList<ReadinessLevelAssessment>();

		for (ReadinessLevelAssessment readinessLevelAssessment : technology.getReadinessAssessments()) {
			if (highestSubstantiatedReadinessLevelAssessments.isEmpty()) {
				highestSubstantiatedReadinessLevelAssessments.add(readinessLevelAssessment);
			} else {
				if (readinessLevelAssessment.getReadinessLevel().getValue() > highestSubstantiatedReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {
					highestSubstantiatedReadinessLevelAssessments.clear();
					highestSubstantiatedReadinessLevelAssessments.add(readinessLevelAssessment);
				} else if (readinessLevelAssessment.getReadinessLevel().getValue() == highestSubstantiatedReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {
					highestSubstantiatedReadinessLevelAssessments.add(readinessLevelAssessment);
				}
			}

		}

		for (Capability requiredCapability : technology.getRequires()) {
			List<ReadinessLevelAssessment> capabilityReadinessLevelAssessments = getCriticalReadinessLevelAssessments(requiredCapability);
			if (criticalReadinessLevelAssessments.isEmpty()) {
				criticalReadinessLevelAssessments.addAll(capabilityReadinessLevelAssessments);
			} else if (!capabilityReadinessLevelAssessments.isEmpty()) {
				if (capabilityReadinessLevelAssessments.get(0).getReadinessLevel().getValue() < criticalReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {
					criticalReadinessLevelAssessments.clear();
					criticalReadinessLevelAssessments.addAll(capabilityReadinessLevelAssessments);
				} else if (capabilityReadinessLevelAssessments.get(0).getReadinessLevel().getValue() == criticalReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {

					criticalReadinessLevelAssessments.addAll(capabilityReadinessLevelAssessments);
				}

			}
		}

		if (criticalReadinessLevelAssessments.isEmpty()) {
			criticalReadinessLevelAssessments.addAll(highestSubstantiatedReadinessLevelAssessments);
		} else {
			if (!highestSubstantiatedReadinessLevelAssessments.isEmpty()) {
				if (highestSubstantiatedReadinessLevelAssessments.get(0).getReadinessLevel().getValue() > criticalReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {
					System.out.println("Assessment warning: The calculated TRL of " + technology.getName()
						+ " has a lower derived ("
						+ criticalReadinessLevelAssessments.get(0).getReadinessLevel().getValue()
						+ ") TRL than can be substatiated. You may need to refine the model");
					criticalReadinessLevelAssessments.clear();
					criticalReadinessLevelAssessments.addAll(highestSubstantiatedReadinessLevelAssessments);
				}

				if (highestSubstantiatedReadinessLevelAssessments.get(0).getReadinessLevel().getValue() == criticalReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {
					criticalReadinessLevelAssessments.addAll(highestSubstantiatedReadinessLevelAssessments);
				}

				if (highestSubstantiatedReadinessLevelAssessments.get(0).getReadinessLevel().getValue() < criticalReadinessLevelAssessments
					.get(0).getReadinessLevel().getValue()) {

					criticalReadinessLevelAssessments.clear();
					criticalReadinessLevelAssessments.addAll(highestSubstantiatedReadinessLevelAssessments);

				}
			}
		}

		return criticalReadinessLevelAssessments;
	}

}
