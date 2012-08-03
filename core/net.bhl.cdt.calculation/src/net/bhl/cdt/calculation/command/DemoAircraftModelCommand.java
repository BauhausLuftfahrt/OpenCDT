/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.calculation.command;

import net.bhl.cdt.calculationrepository.CalculationRepositoryManager;
import net.bhl.cdt.calculationrepository.functions.CalculationRepository;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.calculationrepository.functions.FunctionsFactory;
import net.bhl.cdt.model.Component;
import net.bhl.cdt.model.Configuration;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.architecturetools.AltitudeInterface;
import net.bhl.cdt.model.architecturetools.ArchitecturetoolsFactory;
import net.bhl.cdt.model.architecturetools.CoefficientInterface;
import net.bhl.cdt.model.architecturetools.DensityInterface;
import net.bhl.cdt.model.architecturetools.Massive;
import net.bhl.cdt.model.architecturetools.RangeInterface;
import net.bhl.cdt.model.architecturetools.ReferenceAreaInterface;
import net.bhl.cdt.model.architecturetools.SFCInterface;
import net.bhl.cdt.model.architecturetools.VelocityInterface;
import net.bhl.cdt.model.architecturetools.WettedAreaInterface;
import net.bhl.cdt.model.calculation.Calculation;
import net.bhl.cdt.model.calculation.CalculationFactory;
import net.bhl.cdt.model.calculation.CalculationGraph;
import net.bhl.cdt.model.calculation.CalculationSet;
import net.bhl.cdt.model.calculation.CalculationSetNode;
import net.bhl.cdt.model.calculation.Condition;
import net.bhl.cdt.model.calculation.IterationNode;
import net.bhl.cdt.model.calculation.Node;
import net.bhl.cdt.model.calculation.ParameterMapping;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.units.Quantity;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.common.model.Project;

/**
 * Generates demo aircraft model.
 * 
 * @author Sven Ziemer
 * @author Stephan Leutenmayr
 */
public class DemoAircraftModelCommand extends CDTCommand {

	private Model model;
	private Project project;
	private CalculationRepositoryManager manager;

	static String AERODYNAMICS = "Aerodynamic";
	static String PERFORMANCE = "Performance";
	static String WEIGHTS_AND_BALANCES = "Weight&Balances";

	/**
	 * Constructor for the DemoAircraftModelCommand class. The demo model is generated inside the model element.
	 * 
	 * @param model the model element that is to contain the generated demo model
	 */
	public DemoAircraftModelCommand(Model model) {
		this.model = model;
		project = (Project) model.eContainer();
		manager = CalculationRepositoryManager.getInstance();

	}

	/**
	 * Constructor for the DemoAircraftModelCommand class. The demo model is generated inside the project element.
	 * 
	 * @param project the project element that is to contain the generated demo model
	 */
	public DemoAircraftModelCommand(Project project) {
		this.project = project;
		manager = CalculationRepositoryManager.getInstance();
	}

	@Override
	protected void doRun() {
		// Reload CalculationRepositoryManager
		manager.reloadRepository();

		// Create TestModel
		if (model == null) {
			createModel();
			createConfiguration();
		} else {
			createConfiguration();
		}

		// Check existence of calculation repository in project
		// TODO: CalculationRepository must be present in order to create configuration; refactor code.
		EList<EObject> projectContent = project.eContents();
		boolean calcRepositoryPresent = false;
		for (EObject eObject : projectContent) {
			if (eObject instanceof CalculationRepository) {
				calcRepositoryPresent = true;
			}
		}
		if (!calcRepositoryPresent) {
			createCalculationRepository();
		}
	}

	/**
	 * Creates an demo configuration of an aircraft model and populates it with (sub-) components, parameters,
	 * interfaces and calculations.
	 */
	protected void createConfiguration() {
		// Create configuration and add it to model
		Configuration configuration = ModelFactory.eINSTANCE.createConfiguration();
		configuration.setName("Demo aircraft model");
		model.getConfigurations().add(configuration);

		// Create Aircraft components

		Component aircraft = ModelFactory.eINSTANCE.createComponent();
		aircraft.setName("Aircraft");
		configuration.getComponents().add(aircraft);

		Component fuselage = ModelFactory.eINSTANCE.createComponent();
		fuselage.setName("Fuselage");
		aircraft.getSubComponents().add(fuselage);

		Component wing = ModelFactory.eINSTANCE.createComponent();
		wing.setName("Wing");
		aircraft.getSubComponents().add(wing);

		Component empennage = ModelFactory.eINSTANCE.createComponent();
		empennage.setName("Empennage");
		aircraft.getSubComponents().add(empennage);

		Component engine = ModelFactory.eINSTANCE.createComponent();
		engine.setName("Engine");
		aircraft.getSubComponents().add(engine);

		Component landingGear = ModelFactory.eINSTANCE.createComponent();
		landingGear.setName("Landing Gear");
		aircraft.getSubComponents().add(landingGear);

		Component systems = ModelFactory.eINSTANCE.createComponent();
		systems.setName("Systems");
		aircraft.getSubComponents().add(systems);

		Component fuelSystem = ModelFactory.eINSTANCE.createComponent();
		fuelSystem.setName("Fuel system");
		aircraft.getSubComponents().add(fuelSystem);

		Component stabilizer = ModelFactory.eINSTANCE.createComponent();
		stabilizer.setName("Stabilizer");
		empennage.getSubComponents().add(stabilizer);

		Component fin = ModelFactory.eINSTANCE.createComponent();
		fin.setName("Fin");
		empennage.getSubComponents().add(fin);

		// Create atmosphere component
		Component atmosphere = ModelFactory.eINSTANCE.createComponent();
		atmosphere.setName("Atmosphere");
		configuration.getComponents().add(atmosphere);

		// Create mission component
		Component mission = ModelFactory.eINSTANCE.createComponent();
		mission.setName("Mission");
		configuration.getComponents().add(mission);

		// Create Parameters
		Parameter m_to = ModelFactory.eINSTANCE.createParameter();
		m_to.setName("m_to");
		m_to.setQuantity(Quantity.MASS);
		aircraft.getParameters().add(m_to);

		// Parameter m_to_real = ModelFactory.eINSTANCE.createParameter();
		// m_to_real.setName("m_to_real");
		// m_to_real.setQuantity(Quantity.MASS);
		// m_to_real.setParentComponent(aircraft);

		Parameter m_oe = ModelFactory.eINSTANCE.createParameter();
		m_oe.setName("m_oe");
		m_oe.setQuantity(Quantity.MASS);
		aircraft.getParameters().add(m_oe);

		Parameter m_payload = ModelFactory.eINSTANCE.createParameter();
		m_payload.setName("m_payload");
		m_payload.setQuantity(Quantity.MASS);
		aircraft.getParameters().add(m_payload);

		Parameter s_wet = ModelFactory.eINSTANCE.createParameter();
		aircraft.getParameters().add(s_wet);
		s_wet.setName("s_wet");
		s_wet.setQuantity(Quantity.AREA);

		Parameter cd_0 = ModelFactory.eINSTANCE.createParameter();
		aircraft.getParameters().add(cd_0);
		cd_0.setName("CD_0");
		cd_0.setQuantity(Quantity.COEFFICIENT);

		Parameter cd = ModelFactory.eINSTANCE.createParameter();
		aircraft.getParameters().add(cd);
		cd.setName("CD_dragcoefficient");
		cd.setQuantity(Quantity.COEFFICIENT);

		Parameter s_wet_fus = ModelFactory.eINSTANCE.createParameter();
		s_wet_fus.setName("s_wet_fus");
		s_wet_fus.setQuantity(Quantity.AREA);
		fuselage.getParameters().add(s_wet_fus);

		Parameter sfc = ModelFactory.eINSTANCE.createParameter();
		sfc.setName("SFC");
		sfc.setQuantity(Quantity.SPECIFICFUELCONSUMPTION);
		aircraft.getParameters().add(sfc);

		Parameter r = ModelFactory.eINSTANCE.createParameter();
		r.setName("R");
		r.setQuantity(Quantity.LENGTH);
		aircraft.getParameters().add(r);

		Parameter m_fus = ModelFactory.eINSTANCE.createParameter();
		fuselage.getParameters().add(m_fus);
		m_fus.setName("m_fus");
		m_fus.setQuantity(Quantity.MASS);

		Parameter s_ref = ModelFactory.eINSTANCE.createParameter();
		s_ref.setName("s_ref");
		s_ref.setQuantity(Quantity.AREA);
		wing.getParameters().add(s_ref);

		Parameter k_factor = ModelFactory.eINSTANCE.createParameter();
		wing.getParameters().add(k_factor);
		k_factor.setName("k_factor");
		k_factor.setQuantity(Quantity.COEFFICIENT);

		Parameter aspect_ratio = ModelFactory.eINSTANCE.createParameter();
		wing.getParameters().add(aspect_ratio);
		aspect_ratio.setName("aspect ratio");
		aspect_ratio.setQuantity(Quantity.COEFFICIENT);

		Parameter m_wing = ModelFactory.eINSTANCE.createParameter();
		wing.getParameters().add(m_wing);
		m_wing.setName("m_wing");
		m_wing.setQuantity(Quantity.MASS);

		Parameter lift_coefficient = ModelFactory.eINSTANCE.createParameter();
		wing.getParameters().add(lift_coefficient);
		lift_coefficient.setName("Lift Coefficient");
		lift_coefficient.setQuantity(Quantity.COEFFICIENT);

		Parameter oswald_efficiency = ModelFactory.eINSTANCE.createParameter();
		wing.getParameters().add(oswald_efficiency);
		oswald_efficiency.setName("Oswald efficieny");
		oswald_efficiency.setQuantity(Quantity.COEFFICIENT);

		Parameter m_vt = ModelFactory.eINSTANCE.createParameter();
		m_vt.setName("m_vt");
		m_vt.setQuantity(Quantity.MASS);
		stabilizer.getParameters().add(m_vt);

		Parameter s_ref_vt = ModelFactory.eINSTANCE.createParameter();
		s_ref_vt.setName("S_ref_vt");
		s_ref_vt.setQuantity(Quantity.AREA);
		stabilizer.getParameters().add(s_ref_vt);

		Parameter m_ht = ModelFactory.eINSTANCE.createParameter();
		m_ht.setName("m_ht");
		m_ht.setQuantity(Quantity.MASS);
		fin.getParameters().add(m_ht);

		Parameter s_ref_ht = ModelFactory.eINSTANCE.createParameter();
		s_ref_ht.setName("s_ref_ht");
		s_ref_ht.setQuantity(Quantity.AREA);
		fin.getParameters().add(s_ref_ht);

		Parameter m_propulsion = ModelFactory.eINSTANCE.createParameter();
		m_propulsion.setName("m_Propulsion");
		m_propulsion.setQuantity(Quantity.MASS);
		engine.getParameters().add(m_propulsion);

		Parameter m_lg = ModelFactory.eINSTANCE.createParameter();
		m_lg.setName("m_LG");
		m_lg.setQuantity(Quantity.MASS);
		landingGear.getParameters().add(m_lg);

		Parameter m_systems = ModelFactory.eINSTANCE.createParameter();
		m_systems.setName("m_Systems");
		m_systems.setQuantity(Quantity.MASS);
		systems.getParameters().add(m_systems);

		Parameter m_fuel = ModelFactory.eINSTANCE.createParameter();
		m_fuel.setName("m_Fuel");
		m_fuel.setQuantity(Quantity.MASS);
		fuelSystem.getParameters().add(m_fuel);

		// Temporary?
		Parameter ff_ref = ModelFactory.eINSTANCE.createParameter();
		ff_ref.setName("ff_ref");
		ff_ref.setQuantity(Quantity.COEFFICIENT);
		fuelSystem.getParameters().add(ff_ref);

		Parameter a = ModelFactory.eINSTANCE.createParameter();
		a.setName("a");
		a.setQuantity(Quantity.VELOCITY);
		atmosphere.getParameters().add(a);

		Parameter t = ModelFactory.eINSTANCE.createParameter();
		t.setName("T");
		t.setQuantity(Quantity.TEMPERATURE);
		atmosphere.getParameters().add(t);

		Parameter rho = ModelFactory.eINSTANCE.createParameter();
		rho.setName("rho");
		rho.setQuantity(Quantity.DENSITY);
		atmosphere.getParameters().add(rho);

		Parameter g = ModelFactory.eINSTANCE.createParameter();
		g.setName("g");
		g.setQuantity(Quantity.ACCELERATION);
		atmosphere.getParameters().add(g);

		Parameter alt = ModelFactory.eINSTANCE.createParameter();
		alt.setName("Altitude");
		alt.setQuantity(Quantity.LENGTH);
		mission.getParameters().add(alt);

		Parameter ma = ModelFactory.eINSTANCE.createParameter();
		ma.setName("Mach Number");
		ma.setQuantity(Quantity.COEFFICIENT);
		mission.getParameters().add(ma);

		Parameter r_mission = ModelFactory.eINSTANCE.createParameter();
		r_mission.setName("R");
		r_mission.setQuantity(Quantity.LENGTH);
		mission.getParameters().add(r_mission);

		Parameter v_cr = ModelFactory.eINSTANCE.createParameter();
		v_cr.setName("v_cr");
		v_cr.setQuantity(Quantity.VELOCITY);
		mission.getParameters().add(v_cr);

		// create interfaces
		RangeInterface i_r = ArchitecturetoolsFactory.eINSTANCE.createRangeInterface();
		i_r.setParentComponent(aircraft);
		i_r.setName("Interface Range");
		i_r.setRangeParameter(r);

		CoefficientInterface i_cd0 = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_cd0.setParentComponent(aircraft);
		i_cd0.setName("Interface CD0");
		i_cd0.setCoefficientParameter(cd_0);
		i_cd0.getDiscipline().add(AERODYNAMICS);
		i_cd0.getDiscipline().add(PERFORMANCE);

		CoefficientInterface i_cd = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_cd.setParentComponent(aircraft);
		i_cd.setName("Interface C_D (Drag coefficient)");
		i_cd.setCoefficientParameter(cd);
		i_cd.getDiscipline().add(AERODYNAMICS);
		i_cd.getDiscipline().add(WEIGHTS_AND_BALANCES);
		
		CoefficientInterface i_cd_0 = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_cd_0.setParentComponent(aircraft);
		i_cd_0.setName("Interface C_D 0)");
		i_cd_0.setCoefficientParameter(cd);		

		SFCInterface i_sfc = ArchitecturetoolsFactory.eINSTANCE.createSFCInterface();
		i_sfc.setParentComponent(aircraft);
		i_sfc.setName("Interface SFC");
		i_sfc.setSfcParameter(sfc);
		i_sfc.getDiscipline().add(PERFORMANCE);

		WettedAreaInterface i_s_wet_fus = ArchitecturetoolsFactory.eINSTANCE.createWettedAreaInterface();
		i_s_wet_fus.setParentComponent(fuselage);
		i_s_wet_fus.setName("Interface fuselage s_wet_fus");
		i_s_wet_fus.setWettedAreaParameter(s_wet_fus);
		i_s_wet_fus.getDiscipline().add(AERODYNAMICS);

		ReferenceAreaInterface i_s_ref = ArchitecturetoolsFactory.eINSTANCE.createReferenceAreaInterface();
		i_s_ref.setParentComponent(wing);
		i_s_ref.setName("Interface wing s_ref");
		i_s_ref.setReferenceAreaParameter(s_ref);
		i_s_ref.getDiscipline().add(AERODYNAMICS);

		CoefficientInterface i_cl_liftcoefficient = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_cl_liftcoefficient.setParentComponent(wing);
		i_cl_liftcoefficient.setName("Interface wing cl_liftcoefficient");
		i_cl_liftcoefficient.setCoefficientParameter(lift_coefficient);
		i_cl_liftcoefficient.getDiscipline().add(AERODYNAMICS);
		i_cl_liftcoefficient.getDiscipline().add(WEIGHTS_AND_BALANCES);

		CoefficientInterface i_kfactor = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_kfactor.setParentComponent(wing);
		i_kfactor.setName("Interface wing k_factor");
		i_kfactor.setCoefficientParameter(k_factor);

		ReferenceAreaInterface i_s_ref_vt = ArchitecturetoolsFactory.eINSTANCE.createReferenceAreaInterface();
		i_s_ref_vt.setParentComponent(stabilizer);
		i_s_ref_vt.setName("Interface stabilizer s_ref_vt");
		i_s_ref_vt.setReferenceAreaParameter(s_ref_vt);

		ReferenceAreaInterface i_s_ref_ht = ArchitecturetoolsFactory.eINSTANCE.createReferenceAreaInterface();
		i_s_ref_ht.setParentComponent(fin);
		i_s_ref_ht.setName("Interface fin s_ref_ht");
		i_s_ref_ht.setReferenceAreaParameter(s_ref_ht);

		Massive i_m_fuel = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_fuel.setParentComponent(fuelSystem);
		i_m_fuel.setName("Interface fuel system m_fuel");
		i_m_fuel.setMassParameter(m_fuel);

		Massive i_m_systems = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_systems.setParentComponent(systems);
		i_m_systems.setName("Interface systems m_systems");
		i_m_systems.setMassParameter(m_systems);

		Massive i_m_lg = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_lg.setParentComponent(landingGear);
		i_m_lg.setName("Interface landing gear m_lg");
		i_m_lg.setMassParameter(m_lg);

		Massive i_m_propulsion = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_propulsion.setParentComponent(engine);
		i_m_propulsion.setName("Interface engine m_propulsion");
		i_m_propulsion.setMassParameter(m_propulsion);
		i_m_propulsion.getDiscipline().add(WEIGHTS_AND_BALANCES);

		Massive i_m_ht = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_ht.setParentComponent(fin);
		i_m_ht.setName("Interface fin m_ht");
		i_m_ht.setMassParameter(m_ht);

		Massive i_m_vt = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_vt.setParentComponent(stabilizer);
		i_m_vt.setName("Interface stabilizer m_vt");
		i_m_vt.setMassParameter(m_vt);

		Massive i_m_wing = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_wing.setParentComponent(wing);
		i_m_wing.setName("Interface wing m_wing");
		i_m_wing.setMassParameter(m_wing);
		i_m_wing.getDiscipline().add(WEIGHTS_AND_BALANCES);

		Massive i_m_fus = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_fus.setParentComponent(fuselage);
		i_m_fus.setName("Interface fuselage m_fus");
		i_m_fus.setMassParameter(m_fus);
		i_m_fus.getDiscipline().add(WEIGHTS_AND_BALANCES);

		Massive i_m_to = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_to.setParentComponent(aircraft);
		i_m_to.setName("Interface aircraft m_to");
		i_m_to.setMassParameter(m_to);
		i_m_to.getDiscipline().add(AERODYNAMICS);
		i_m_to.getDiscipline().add(WEIGHTS_AND_BALANCES);

		AltitudeInterface i_alt = ArchitecturetoolsFactory.eINSTANCE.createAltitudeInterface();
		i_alt.setParentComponent(mission);
		i_alt.setName("Interface Altitude");
		i_alt.setAltitudeParameter(alt);

		CoefficientInterface i_ma = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_ma.setParentComponent(mission);
		i_ma.setName("Interface mach number");
		i_ma.setCoefficientParameter(ma);

		CoefficientInterface i_ff_ref = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_ff_ref.setParentComponent(fuelSystem);
		i_ff_ref.setName("Interface ff_ref");
		i_ff_ref.setCoefficientParameter(ff_ref);

		CoefficientInterface i_aspect_ratio = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_aspect_ratio.setParentComponent(wing);
		i_aspect_ratio.setName("Interface Aspect Ratio");
		i_aspect_ratio.setCoefficientParameter(aspect_ratio);
		i_aspect_ratio.getDiscipline().add(AERODYNAMICS);
		i_aspect_ratio.getDiscipline().add(PERFORMANCE);

		DensityInterface i_rho = ArchitecturetoolsFactory.eINSTANCE.createDensityInterface();
		i_rho.setParentComponent(atmosphere);
		i_rho.setName("Interface Air density (rho)");
		i_rho.setDensityParameter(rho);
		i_rho.getDiscipline().add(AERODYNAMICS);

		WettedAreaInterface i_s_wet = ArchitecturetoolsFactory.eINSTANCE.createWettedAreaInterface();
		i_s_wet.setParentComponent(aircraft);
		i_s_wet.setName("Interface Aircraft wetted area (S_wet)");
		i_s_wet.setWettedAreaParameter(s_wet);
		i_s_wet.getDiscipline().add(AERODYNAMICS);

		CoefficientInterface i_oswald_efficiency = ArchitecturetoolsFactory.eINSTANCE.createCoefficientInterface();
		i_oswald_efficiency.setParentComponent(wing);
		i_oswald_efficiency.setName("Interface Oswald Efficiency");
		i_oswald_efficiency.setCoefficientParameter(oswald_efficiency);
		i_oswald_efficiency.getDiscipline().add(AERODYNAMICS);
		i_oswald_efficiency.getDiscipline().add(PERFORMANCE);

		Massive i_m_oe = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_oe.setParentComponent(aircraft);
		i_m_oe.setName("Interface Operating Empty Mass");
		i_m_oe.setMassParameter(m_oe);
		i_m_oe.getDiscipline().add(WEIGHTS_AND_BALANCES);

		Massive i_m_payload = ArchitecturetoolsFactory.eINSTANCE.createMassive();
		i_m_payload.setParentComponent(aircraft);
		i_m_payload.setName("Interface Payload Mass");
		i_m_payload.setMassParameter(m_payload);
		i_m_payload.getDiscipline().add(WEIGHTS_AND_BALANCES);

		VelocityInterface i_v_cr = ArchitecturetoolsFactory.eINSTANCE.createVelocityInterface();
		i_v_cr.setParentComponent(mission);
		i_v_cr.setName("Interface Cruise speed (v_cr)");
		i_v_cr.setVelocityParameter(v_cr);
		i_v_cr.getDiscipline().add(AERODYNAMICS);
		i_v_cr.getDiscipline().add(PERFORMANCE);

		/*
		 * Begin Calculations, Sets and Nodes
		 */

		// CalculationSet MassPerformanceLoop
		Function function;
		ParameterDescriptor parameterDescriptor;

		CalculationSet csMassPerformanceLoop = CalculationFactory.eINSTANCE.createCalculationSet();
		csMassPerformanceLoop.setName("CS_Mass Performance Loop");
		configuration.getCalculationSets().add(csMassPerformanceLoop);

		Calculation cWettedArea = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cWettedArea);
		cWettedArea.setName("Wetted area");
		cWettedArea.setFunctionID("net.bhl.cdt.calculationrepository.scilab.wettedareafunction");
		ParameterMapping cWettedAreaMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cWettedArea.setParameterMapping(cWettedAreaMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cWettedArea),
			"net.bhl.cdt.calculationrepository.scilab.wettedareafunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cWettedAreaMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cWettedAreaMapping.getInputMappables().put(parameterDescriptor, i_s_ref_vt);
		parameterDescriptor = function.getInputDescriptors().get(2);
		cWettedAreaMapping.getInputMappables().put(parameterDescriptor, i_s_ref_ht);
		parameterDescriptor = function.getInputDescriptors().get(3);
		cWettedAreaMapping.getInputMappables().put(parameterDescriptor, i_s_wet_fus);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cWettedAreaMapping.getOutputMappables().put(parameterDescriptor, i_s_wet);

		Calculation cZeroLiftDrag = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cZeroLiftDrag);
		cZeroLiftDrag.setName("Zero Lift Drag Coefficient Function");
		cZeroLiftDrag.setFunctionID("net.bhl.cdt.calculationrepository.scilab.zeroliftdragcoefficientfunction");
		ParameterMapping cZeroLiftDragMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cZeroLiftDrag.setParameterMapping(cZeroLiftDragMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cZeroLiftDrag),
			"net.bhl.cdt.calculationrepository.scilab.zeroliftdragcoefficientfunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cZeroLiftDragMapping.getInputMappables().put(parameterDescriptor, i_s_wet);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cZeroLiftDragMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cZeroLiftDragMapping.getOutputMappables().put(parameterDescriptor, i_cd_0);

		Calculation cDragCoefficient = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cDragCoefficient);
		cDragCoefficient.setName("C_DragCoefficient");
		cDragCoefficient.setFunctionID("net.bhl.cdt.calculationrepository.scilab.dragcoefficientfunction");
		ParameterMapping cDragCoefficientMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cDragCoefficient.setParameterMapping(cDragCoefficientMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cDragCoefficient),
			"net.bhl.cdt.calculationrepository.scilab.dragcoefficientfunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cDragCoefficientMapping.getInputMappables().put(parameterDescriptor, i_cd_0);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cDragCoefficientMapping.getInputMappables().put(parameterDescriptor, i_kfactor);
		parameterDescriptor = function.getInputDescriptors().get(2);
		cDragCoefficientMapping.getInputMappables().put(parameterDescriptor, i_cl_liftcoefficient);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cDragCoefficientMapping.getOutputMappables().put(parameterDescriptor, i_cd);

		Calculation cMassOE = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cMassOE);
		cMassOE.setName("C_MassOperatingEmpty");
		cMassOE.setFunctionID("net.bhl.cdt.calculationrepository.scilab.massoperatingemptyfunction");
		ParameterMapping cMassOEMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassOE.setParameterMapping(cMassOEMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassOE),
			"net.bhl.cdt.calculationrepository.scilab.massoperatingemptyfunction");
		// m_oe = MassOperatingEmpty(m_Propulsion,m_Fuselage,m_Wing,m_VT,m_HT,m_LG,m_Sys)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_propulsion);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_fus);
		parameterDescriptor = function.getInputDescriptors().get(2);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_wing);
		parameterDescriptor = function.getInputDescriptors().get(3);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_vt);
		parameterDescriptor = function.getInputDescriptors().get(4);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_ht);
		parameterDescriptor = function.getInputDescriptors().get(5);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_lg);
		parameterDescriptor = function.getInputDescriptors().get(6);
		cMassOEMapping.getInputMappables().put(parameterDescriptor, i_m_systems);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassOEMapping.getOutputMappables().put(parameterDescriptor, i_m_oe);

		Calculation cMassTO = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cMassTO);
		cMassTO.setName("cMassTakeOffReal");
		cMassTO.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masstakeofffunction");
		ParameterMapping cMassTOMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassTO.setParameterMapping(cMassTOMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassOE),
			"net.bhl.cdt.calculationrepository.scilab.masstakeofffunction");
		// m_TO = MassTakeOffReal(m_Fuel,m_OE,m_Payload)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassTOMapping.getInputMappables().put(parameterDescriptor, i_m_fuel); // fuelsystem
		parameterDescriptor = function.getInputDescriptors().get(1);
		cMassTOMapping.getInputMappables().put(parameterDescriptor, i_m_oe); // aircraft
		parameterDescriptor = function.getInputDescriptors().get(2);
		cMassTOMapping.getInputMappables().put(parameterDescriptor, i_m_payload);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassTOMapping.getOutputMappables().put(parameterDescriptor, i_m_to);

		Calculation cSFC = CalculationFactory.eINSTANCE.createCalculation();
		csMassPerformanceLoop.getCalculations().add(cSFC);
		cSFC.setName("cSFC");
		cSFC.setFunctionID("net.bhl.cdt.calculationrepository.sfc");
		ParameterMapping cSFCMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cSFC.setParameterMapping(cSFCMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cSFC), "net.bhl.cdt.calculationrepository.sfc");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cSFCMapping.getInputMappables().put(parameterDescriptor, i_alt);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cSFCMapping.getInputMappables().put(parameterDescriptor, i_ma);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cSFCMapping.getOutputMappables().put(parameterDescriptor, i_sfc);

		// Create CalculationSet Fuselage
		CalculationSet csFuselage = CalculationFactory.eINSTANCE.createCalculationSet();
		csFuselage.setName("CS_Fuselage");
		csMassPerformanceLoop.getSubCalculationSet().add(csFuselage);
		// TODO: for all private calculation sets: set their corresponding components
		csFuselage.setComponent(fuselage);

		Calculation cMassFuselage = CalculationFactory.eINSTANCE.createCalculation();
		csFuselage.getCalculations().add(cMassFuselage);
		cMassFuselage.setName("C_Mass_Fuselage");
		cMassFuselage.setFunctionID("net.bhl.cdt.calculationrepository.scilab.massfuselagefunction");
		ParameterMapping cMassFuselageMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassFuselage.setParameterMapping(cMassFuselageMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassFuselage),
			"net.bhl.cdt.calculationrepository.scilab.massfuselagefunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassFuselageMapping.getInputMappables().put(parameterDescriptor, s_wet_fus);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassFuselageMapping.getOutputMappables().put(parameterDescriptor, m_fus);

		/*
		 * Create Calculationgraph for csFuselage Node sequence: MassFuselage
		 */
		CalculationGraph cgFuselage = CalculationFactory.eINSTANCE.createCalculationGraph();
		csFuselage.getGraphs().add(cgFuselage);
		cgFuselage.setName("CalculationGraph for csFuselage");

		Node ncMassFuselage = CalculationFactory.eINSTANCE.createNode();
		cgFuselage.setFirstNode(ncMassFuselage);
		cgFuselage.getNodes().add(ncMassFuselage);
		ncMassFuselage.setCalculation(cMassFuselage);
		ncMassFuselage.setName("C Fuselage");

		// Create CalculationSet Wing
		CalculationSet csWing = CalculationFactory.eINSTANCE.createCalculationSet();
		csMassPerformanceLoop.getSubCalculationSet().add(csWing);
		csWing.setName("CS_Wing");
		csWing.setComponent(wing);

		Calculation ck_factor = CalculationFactory.eINSTANCE.createCalculation();
		csWing.getCalculations().add(ck_factor);
		ck_factor.setName("cK_factor");
		ck_factor.setFunctionID("net.bhl.cdt.calculationrepository.scilab.kfactorfunction");
		ParameterMapping ck_factorMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		ck_factor.setParameterMapping(ck_factorMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(ck_factor),
			"net.bhl.cdt.calculationrepository.scilab.kfactorfunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		ck_factorMapping.getInputMappables().put(parameterDescriptor, aspect_ratio);
		parameterDescriptor = function.getInputDescriptors().get(1);
		ck_factorMapping.getInputMappables().put(parameterDescriptor, oswald_efficiency);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		ck_factorMapping.getOutputMappables().put(parameterDescriptor, k_factor);

		Calculation cMassWing = CalculationFactory.eINSTANCE.createCalculation();
		csWing.getCalculations().add(cMassWing);
		cMassWing.setName("cMassWing");
		cMassWing.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masswingfunction");
		ParameterMapping cMassWingMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassWing.setParameterMapping(cMassWingMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassWing),
			"net.bhl.cdt.calculationrepository.scilab.masswingfunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassWingMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassWingMapping.getOutputMappables().put(parameterDescriptor, m_wing);

		Calculation cLiftCoefficient = CalculationFactory.eINSTANCE.createCalculation();
		csWing.getCalculations().add(cLiftCoefficient);
		cLiftCoefficient.setName("cLiftCoefficient");
		cLiftCoefficient.setFunctionID("net.bhl.cdt.calculationrepository.scilab.liftcoefficient");
		ParameterMapping cLiftCoefficientMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cLiftCoefficient.setParameterMapping(cLiftCoefficientMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cLiftCoefficient),
			"net.bhl.cdt.calculationrepository.scilab.liftcoefficient");
		// CL = LiftCoefficient(M_to, FF_ref, S_ref, Alt, Ma)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cLiftCoefficientMapping.getInputMappables().put(parameterDescriptor, i_m_to);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cLiftCoefficientMapping.getInputMappables().put(parameterDescriptor, i_ff_ref);
		parameterDescriptor = function.getInputDescriptors().get(2);
		cLiftCoefficientMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getInputDescriptors().get(3);
		cLiftCoefficientMapping.getInputMappables().put(parameterDescriptor, i_alt);
		parameterDescriptor = function.getInputDescriptors().get(4);
		cLiftCoefficientMapping.getInputMappables().put(parameterDescriptor, i_ma);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cLiftCoefficientMapping.getOutputMappables().put(parameterDescriptor, i_cl_liftcoefficient);

		/*
		 * Create CalculationGraph for csWing Node sequence: k_factor, MassWing, LiftCoefficient
		 */
		CalculationGraph cgWing = CalculationFactory.eINSTANCE.createCalculationGraph();
		csWing.getGraphs().add(cgWing);
		cgWing.setName("Calculationgraph for csWing");

		Node nck_factor = CalculationFactory.eINSTANCE.createNode();
		cgWing.setFirstNode(nck_factor);
		cgWing.getNodes().add(nck_factor);
		nck_factor.setName("Node k_factor");
		nck_factor.setCalculation(ck_factor);
		nck_factor.setName("C k-Faktor");

		Node ncMassWing = CalculationFactory.eINSTANCE.createNode();
		cgWing.getNodes().add(ncMassWing);
		nck_factor.setNextNode(ncMassWing);
		ncMassWing.setName("Node MassWing");
		ncMassWing.setCalculation(cMassWing);
		ncMassWing.setName("C Mass Wing");

		Node ncLiftCoefficient = CalculationFactory.eINSTANCE.createNode();
		cgWing.getNodes().add(ncLiftCoefficient);
		ncMassWing.setNextNode(ncLiftCoefficient);
		ncLiftCoefficient.setCalculation(cLiftCoefficient);
		ncLiftCoefficient.setName("C Lift Coefficient");

		// Create CalculationSet Stabilizer
		CalculationSet csStabilizer = CalculationFactory.eINSTANCE.createCalculationSet();
		csStabilizer.setName("CS_Stabilizer");
		csMassPerformanceLoop.getSubCalculationSet().add(csStabilizer);
		csStabilizer.setComponent(stabilizer);

		Calculation cRefAreaVerticalTail = CalculationFactory.eINSTANCE.createCalculation();
		cRefAreaVerticalTail.setName("Reference Area Vertical Tail");
		cRefAreaVerticalTail.setFunctionID("net.bhl.cdt.calculationrepository.scilab.refareaverticaltailfunction");
		csStabilizer.getCalculations().add(cRefAreaVerticalTail);
		ParameterMapping cRefAreVerticalTailMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cRefAreaVerticalTail.setParameterMapping(cRefAreVerticalTailMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cRefAreaVerticalTail),
			"net.bhl.cdt.calculationrepository.scilab.refareaverticaltailfunction");
		parameterDescriptor = function.getInputDescriptors().get(0); // S_ref
		cRefAreVerticalTailMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getOutputDescriptors().get(0); // S_rev_vt
		cRefAreVerticalTailMapping.getOutputMappables().put(parameterDescriptor, s_ref_vt);

		Calculation cMassVerticalTail = CalculationFactory.eINSTANCE.createCalculation();
		csStabilizer.getCalculations().add(cMassVerticalTail);
		cMassVerticalTail.setName("Mass Vertical Tail");
		cMassVerticalTail.setFunctionID("net.bhl.cdt.calculationrepository.scilab.massverticaltailfunction");
		ParameterMapping cMassVerticalTailMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassVerticalTail.setParameterMapping(cMassVerticalTailMapping);
		parameterDescriptor = manager
			.getFunction(UtilitiesHelper.getProjectId(cMassVerticalTail),
				"net.bhl.cdt.calculationrepository.scilab.massverticaltailfunction").getInputDescriptors().get(0);
		cMassVerticalTailMapping.getInputMappables().put(parameterDescriptor, s_ref_vt); // s_ref_vt
		parameterDescriptor = manager
			.getFunction(UtilitiesHelper.getProjectId(cMassVerticalTail),
				"net.bhl.cdt.calculationrepository.scilab.massverticaltailfunction").getOutputDescriptors().get(0);
		cMassVerticalTailMapping.getOutputMappables().put(parameterDescriptor, m_vt); // m_vt

		/*
		 * Create CalculationGraph for CalculationSet cs Stabilizer Node sequence: RefAreaVerticalTail, MassVerticalTail
		 */
		CalculationGraph cgStabilizer = CalculationFactory.eINSTANCE.createCalculationGraph();
		csStabilizer.getGraphs().add(cgStabilizer);
		cgStabilizer.setName("CalculationGraph for csStabilizer");

		Node ncRefAreaVerticalTail = CalculationFactory.eINSTANCE.createNode();
		cgStabilizer.setFirstNode(ncRefAreaVerticalTail);
		cgStabilizer.getNodes().add(ncRefAreaVerticalTail);
		ncRefAreaVerticalTail.setCalculation(cRefAreaVerticalTail);
		ncRefAreaVerticalTail.setName("C Ref. Area Vertical Tail");

		Node ncMassVerticalTail = CalculationFactory.eINSTANCE.createNode();
		ncRefAreaVerticalTail.setNextNode(ncMassVerticalTail);
		cgStabilizer.getNodes().add(ncMassVerticalTail);
		ncMassVerticalTail.setCalculation(cMassVerticalTail);
		ncMassVerticalTail.setName("C Mass Vertical Tail");

		// Create CalculationSet Fin
		CalculationSet csFin = CalculationFactory.eINSTANCE.createCalculationSet();
		csFin.setName("CS_Fin");
		csMassPerformanceLoop.getSubCalculationSet().add(csFin);
		csFin.setComponent(fin);

		Calculation cRefAreaHorizontalTail = CalculationFactory.eINSTANCE.createCalculation();
		cRefAreaHorizontalTail.setName("Reference Area Horizontal Tail");
		cRefAreaHorizontalTail.setFunctionID("net.bhl.cdt.calculationrepository.scilab.refareahorizontaltailfunction");
		csFin.getCalculations().add(cRefAreaHorizontalTail);
		ParameterMapping cRefAreHorizontalTailMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cRefAreaHorizontalTail.setParameterMapping(cRefAreHorizontalTailMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cRefAreaHorizontalTail),
			"net.bhl.cdt.calculationrepository.scilab.refareahorizontaltailfunction");
		parameterDescriptor = function.getInputDescriptors().get(0); // S_ref
		cRefAreHorizontalTailMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cRefAreHorizontalTailMapping.getOutputMappables().put(parameterDescriptor, s_ref_ht);

		Calculation cMassHorizontalTail = CalculationFactory.eINSTANCE.createCalculation();
		csFin.getCalculations().add(cMassHorizontalTail);
		cMassHorizontalTail.setName("Mass Horizontal Tail");
		cMassHorizontalTail.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masshorizontaltailfunction");
		ParameterMapping cMassHorizontalTailMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		cMassHorizontalTail.setParameterMapping(cMassHorizontalTailMapping);
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassHorizontalTail),
			"net.bhl.cdt.calculationrepository.scilab.masshorizontaltailfunction");
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassHorizontalTailMapping.getInputMappables().put(parameterDescriptor, s_ref_ht);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassHorizontalTailMapping.getOutputMappables().put(parameterDescriptor, m_ht);

		/*
		 * Create CalculationGraph for CalculationSet Fin Node sequence: RefAreaHorizontalTail, MassHorizontalTail
		 */
		CalculationGraph cgFin = CalculationFactory.eINSTANCE.createCalculationGraph();
		csFin.getGraphs().add(cgFin);
		cgFin.setName("CalculationGraph for csFin");

		Node ncRefAreaHorizontalTail = CalculationFactory.eINSTANCE.createNode();
		cgFin.setFirstNode(ncRefAreaHorizontalTail);
		cgFin.getNodes().add(ncRefAreaHorizontalTail);
		ncRefAreaHorizontalTail.setCalculation(cRefAreaHorizontalTail);
		ncRefAreaHorizontalTail.setName("C Ref. Area Horizontal Tail");

		Node ncMassHorizontalTail = CalculationFactory.eINSTANCE.createNode();
		ncRefAreaHorizontalTail.setNextNode(ncMassHorizontalTail);
		cgFin.getNodes().add(ncMassHorizontalTail);
		ncMassHorizontalTail.setCalculation(cMassHorizontalTail);
		ncMassHorizontalTail.setName("C Mass Horizontal Tail");

		// Create CalculationSet Engine
		CalculationSet csEngine = CalculationFactory.eINSTANCE.createCalculationSet();
		csEngine.setName("CS_Engine");
		csMassPerformanceLoop.getSubCalculationSet().add(csEngine);
		csEngine.setComponent(engine);

		Calculation cMassPropulsion = CalculationFactory.eINSTANCE.createCalculation();
		csEngine.getCalculations().add(cMassPropulsion);
		cMassPropulsion.setName("Mass Propulsion");
		cMassPropulsion.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masspropulsionfunction");
		ParameterMapping cMassPropulsionMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassPropulsion),
			"net.bhl.cdt.calculationrepository.scilab.masspropulsionfunction");
		cMassPropulsion.setParameterMapping(cMassPropulsionMapping);
		// m_Propulsion = MassPropulsion(m_TO)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassPropulsionMapping.getInputMappables().put(parameterDescriptor, i_m_to);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassPropulsionMapping.getOutputMappables().put(parameterDescriptor, m_propulsion);

		/*
		 * CalculationGraph Engine Node sequence: MassPropulsion
		 */
		CalculationGraph cgEngine = CalculationFactory.eINSTANCE.createCalculationGraph();
		csEngine.getGraphs().add(cgEngine);
		cgEngine.setName("CalculationGraph for csEngine");

		Node ncMassPropulsion = CalculationFactory.eINSTANCE.createNode();
		cgEngine.getNodes().add(ncMassPropulsion);
		cgEngine.setFirstNode(ncMassPropulsion);
		ncMassPropulsion.setCalculation(cMassPropulsion);
		ncMassPropulsion.setName("C Mass Propulsion");

		// Create CalculationSet LandingGear
		CalculationSet csLandingGear = CalculationFactory.eINSTANCE.createCalculationSet();
		csLandingGear.setName("CS_LandingGear");
		csMassPerformanceLoop.getSubCalculationSet().add(csLandingGear);
		csLandingGear.setComponent(landingGear);

		Calculation cMassLandingGear = CalculationFactory.eINSTANCE.createCalculation();
		csLandingGear.getCalculations().add(cMassLandingGear);
		cMassLandingGear.setName("Mass Landing Gear");
		cMassLandingGear.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masslandinggearfunction");
		ParameterMapping cMassLandingGearMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassLandingGear),
			"net.bhl.cdt.calculationrepository.scilab.masslandinggearfunction");
		cMassLandingGear.setParameterMapping(cMassLandingGearMapping);
		// m_LG = MassLandingGear(m_TO)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassLandingGearMapping.getInputMappables().put(parameterDescriptor, i_m_to);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassLandingGearMapping.getOutputMappables().put(parameterDescriptor, m_lg);

		/*
		 * CalculationGraph Landing Gear Node sequence: MassLandingGear
		 */
		CalculationGraph cgLandingGear = CalculationFactory.eINSTANCE.createCalculationGraph();
		csLandingGear.getGraphs().add(cgLandingGear);
		cgLandingGear.setName("CalculationGraph for csLandingGear");

		Node ncMassLandingGear = CalculationFactory.eINSTANCE.createNode();
		cgLandingGear.setFirstNode(ncMassLandingGear);
		cgLandingGear.getNodes().add(ncMassLandingGear);
		ncMassLandingGear.setCalculation(cMassLandingGear);
		ncMassLandingGear.setName("C Mass Landing Gear");

		// Create CalculationSet Systems
		CalculationSet csSystems = CalculationFactory.eINSTANCE.createCalculationSet();
		csSystems.setName("CS_Systems");
		csMassPerformanceLoop.getSubCalculationSet().add(csSystems);
		csSystems.setComponent(systems);

		Calculation cMassSystems = CalculationFactory.eINSTANCE.createCalculation();
		csSystems.getCalculations().add(cMassSystems);
		cMassSystems.setName("Mass Systems");
		cMassSystems.setFunctionID("net.bhl.cdt.calculationrepository.scilab.masssystemsfunction");
		ParameterMapping cMassSystemsMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassSystems),
			"net.bhl.cdt.calculationrepository.scilab.masssystemsfunction");
		cMassSystems.setParameterMapping(cMassSystemsMapping);
		// m_Sys = MassSystems(m_TO)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassSystemsMapping.getInputMappables().put(parameterDescriptor, i_m_to);
		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassSystemsMapping.getOutputMappables().put(parameterDescriptor, m_systems);

		/*
		 * Calculation Graph Systems Node sequence: MassSystems
		 */
		CalculationGraph cgSystems = CalculationFactory.eINSTANCE.createCalculationGraph();
		csSystems.getGraphs().add(cgSystems);
		cgSystems.setName("CalculationGraph for csFuelSystem");

		Node ncMassSystems = CalculationFactory.eINSTANCE.createNode();
		cgSystems.setFirstNode(ncMassSystems);
		cgSystems.getNodes().add(ncMassSystems);
		ncMassSystems.setCalculation(cMassSystems);
		ncMassSystems.setName("C Mass Systems");

		// Create CalculationSet Fuel System
		CalculationSet csFuelSystem = CalculationFactory.eINSTANCE.createCalculationSet();
		csFuelSystem.setName("CS_FuelSystem");
		csMassPerformanceLoop.getSubCalculationSet().add(csFuelSystem);
		csFuelSystem.setComponent(fuelSystem);

		Calculation cMassFuelSystem = CalculationFactory.eINSTANCE.createCalculation();
		csFuelSystem.getCalculations().add(cMassFuelSystem);
		cMassFuelSystem.setName("Mass Fuel System");
		cMassFuelSystem.setFunctionID("net.bhl.cdt.calculationrepository.scilab.fuelburnfunction");
		ParameterMapping cMassFuelSystemMapping = CalculationFactory.eINSTANCE.createParameterMapping();
		function = manager.getFunction(UtilitiesHelper.getProjectId(cMassFuelSystem),
			"net.bhl.cdt.calculationrepository.scilab.fuelburnfunction");
		cMassFuelSystem.setParameterMapping(cMassFuelSystemMapping);
		// m_fuel = FuelBurn_function(R, MA, ALT, M_to, FF_ref, S_REF, CD0, k, SFC)
		parameterDescriptor = function.getInputDescriptors().get(0);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_r);
		parameterDescriptor = function.getInputDescriptors().get(1);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_ma);
		parameterDescriptor = function.getInputDescriptors().get(2);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_alt);
		parameterDescriptor = function.getInputDescriptors().get(3);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_m_to);
		parameterDescriptor = function.getInputDescriptors().get(4);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_ff_ref);
		parameterDescriptor = function.getInputDescriptors().get(5);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_s_ref);
		parameterDescriptor = function.getInputDescriptors().get(6);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_cd0);
		parameterDescriptor = function.getInputDescriptors().get(7);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_kfactor);
		parameterDescriptor = function.getInputDescriptors().get(8);
		cMassFuelSystemMapping.getInputMappables().put(parameterDescriptor, i_sfc);

		parameterDescriptor = function.getOutputDescriptors().get(0);
		cMassFuelSystemMapping.getOutputMappables().put(parameterDescriptor, m_fuel);

		/*
		 * CalculationGraph Fuel System Node sequence: MassFuelSystem
		 */
		CalculationGraph cgFuelSystem = CalculationFactory.eINSTANCE.createCalculationGraph();
		csFuelSystem.getGraphs().add(cgFuelSystem);
		cgFuelSystem.setName("CalculationGraph for csFuelSystem");

		Node ncMassFuelSystem = CalculationFactory.eINSTANCE.createNode();
		cgFuelSystem.setFirstNode(ncMassFuelSystem);
		cgFuelSystem.getNodes().add(ncMassFuelSystem);
		ncMassFuelSystem.setCalculation(cMassFuelSystem);
		ncMassFuelSystem.setName("C Mass Fuel System");

		/*
		 * Create CalculationGraph for CalculationSet csMassPerformanceLoop Node sequence: Stabilizer, Fin, Fuselage,
		 * Engine, LandingGear, Systems, Wing, WettedArea, ZeroLiftDrag, DragCoefficient, MassOE, SFC, FuelSystem,
		 * MassTO
		 */
		CalculationGraph cgMassPerformanceLoop = CalculationFactory.eINSTANCE.createCalculationGraph();
		csMassPerformanceLoop.getGraphs().add(cgMassPerformanceLoop);
		cgMassPerformanceLoop.setName("CalculationGraph for csMassPerformanceLoop");

		CalculationSetNode ncsStabilizer = CalculationFactory.eINSTANCE.createCalculationSetNode();
		cgMassPerformanceLoop.setFirstNode(ncsStabilizer);
		cgMassPerformanceLoop.getNodes().add(ncsStabilizer);
		ncsStabilizer.setCalculationSet(csStabilizer);
		ncsStabilizer.setName("CS Stabilizer");

		CalculationSetNode ncsFin = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncsStabilizer.setNextNode(ncsFin);
		cgMassPerformanceLoop.getNodes().add(ncsFin);
		ncsFin.setCalculationSet(csFin);
		ncsFin.setName("CS Fin");

		CalculationSetNode ncsFuselage = CalculationFactory.eINSTANCE.createCalculationSetNode();
		cgMassPerformanceLoop.getNodes().add(ncsFuselage);
		ncsFin.setNextNode(ncsFuselage);
		ncsFuselage.setCalculationSet(csFuselage);
		ncsFuselage.setName("CS Fuselage");

		CalculationSetNode ncsEngine = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncsFuselage.setNextNode(ncsEngine);
		cgMassPerformanceLoop.getNodes().add(ncsEngine);
		ncsEngine.setCalculationSet(csEngine);
		ncsEngine.setName("CS Engine");

		CalculationSetNode ncsLandingGear = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncsEngine.setNextNode(ncsLandingGear);
		cgMassPerformanceLoop.getNodes().add(ncsLandingGear);
		ncsLandingGear.setCalculationSet(csLandingGear);
		ncsLandingGear.setName("CS Landing Gear");

		CalculationSetNode ncsSystems = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncsLandingGear.setNextNode(ncsSystems);
		cgMassPerformanceLoop.getNodes().add(ncsSystems);
		ncsSystems.setCalculationSet(csSystems);
		ncsSystems.setName("CS Systems");

		CalculationSetNode ncsWing = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncsSystems.setNextNode(ncsWing);
		cgMassPerformanceLoop.getNodes().add(ncsWing);
		ncsWing.setCalculationSet(csWing);
		ncsWing.setName("CS Wing");

		Node ncWettedArea = CalculationFactory.eINSTANCE.createNode();
		ncsWing.setNextNode(ncWettedArea);
		cgMassPerformanceLoop.getNodes().add(ncWettedArea);
		ncWettedArea.setCalculation(cWettedArea);
		ncWettedArea.setName("C Wetted Area");

		Node ncZeroLiftDrag = CalculationFactory.eINSTANCE.createNode();
		ncWettedArea.setNextNode(ncZeroLiftDrag);
		cgMassPerformanceLoop.getNodes().add(ncZeroLiftDrag);
		ncZeroLiftDrag.setCalculation(cZeroLiftDrag);
		ncZeroLiftDrag.setName("C Zero Lift Drag");

		Node ncDragCoefficient = CalculationFactory.eINSTANCE.createNode();
		ncZeroLiftDrag.setNextNode(ncDragCoefficient);
		cgMassPerformanceLoop.getNodes().add(ncDragCoefficient);
		ncDragCoefficient.setCalculation(cDragCoefficient);
		ncDragCoefficient.setName("C Drag Coefficient");

		Node ncMassOE = CalculationFactory.eINSTANCE.createNode();
		ncDragCoefficient.setNextNode(ncMassOE);
		cgMassPerformanceLoop.getNodes().add(ncMassOE);
		ncMassOE.setCalculation(cMassOE);
		ncMassOE.setName("C Mass OE");

		Node ncSFC = CalculationFactory.eINSTANCE.createNode();
		ncMassOE.setNextNode(ncSFC);
		cgMassPerformanceLoop.getNodes().add(ncSFC);
		ncSFC.setCalculation(cSFC);
		ncSFC.setName("C SFC");

		CalculationSetNode ncsFuelSystem = CalculationFactory.eINSTANCE.createCalculationSetNode();
		ncSFC.setNextNode(ncsFuelSystem);
		cgMassPerformanceLoop.getNodes().add(ncsFuelSystem);
		ncsFuelSystem.setCalculationSet(csFuelSystem);
		ncsFuelSystem.setName("C Fuel System");

		Node ncMassTO = CalculationFactory.eINSTANCE.createNode();
		ncsFuelSystem.setNextNode(ncMassTO);
		cgMassPerformanceLoop.getNodes().add(ncMassTO);
		ncMassTO.setCalculation(cMassTO);
		ncMassTO.setName("C Mass TO");

		// Create iteration node

		IterationNode niMassPerformanceLoop = CalculationFactory.eINSTANCE.createIterationNode();
		ncMassTO.setNextNode(niMassPerformanceLoop);
		cgMassPerformanceLoop.getNodes().add(niMassPerformanceLoop);
		niMassPerformanceLoop.setName("Iteration node for Mass performance loop");
		niMassPerformanceLoop.setMaxIteration(1000);
		niMassPerformanceLoop.setNextFalse(ncsWing);
		Condition condition = CalculationFactory.eINSTANCE.createCondition();
		condition.setMappableComponentOfInterest(m_to);
		condition.setValue(0.001);
		niMassPerformanceLoop.getCondition().add(condition);
		niMassPerformanceLoop.setName("Mass Performance Loop");
	}

	/**
	 * Creates an empty calculation repository and adds it to the containing project.
	 */
	protected void createCalculationRepository() {
		CalculationRepository calculationRepository = FunctionsFactory.eINSTANCE.createCalculationRepository();
		this.project.addModelElement(calculationRepository);

	}

	/**
	 * Creates an empty model.
	 */
	protected void createModel() {
		Model model = ModelFactory.eINSTANCE.createModel();
		this.project.addModelElement(model);
	}

}
