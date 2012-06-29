package net.bhl.cdt.calculation.test;

import java.util.HashMap;
import java.util.Map.Entry;

import net.bhl.cdt.calculation.command.CalculationCommand;
import net.bhl.cdt.calculation.command.DemoAircraftModelCommand;
import net.bhl.cdt.calculation.command.DetermineInitialValuesForCalculationSetCommand;
import net.bhl.cdt.model.Model;
import net.bhl.cdt.model.ModelFactory;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.test.WorkspaceTest;
import net.bhl.cdt.utilities.commands.CDTCommand;
import net.bhl.cdt.utilities.datatypes.MeasuredValue;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IExportedPreferences;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.osgi.service.prefs.Preferences;

/**
 * Tests the DemoAircraft. Utilizes the DemoAircraftModelCommand. Wenn dieser
 * Test nicht mehr läuft, liegt es eventuell daran, dass die String-Namen der
 * initialParameters im DemoAircraftModelCommand geändert wurden.
 * 
 * @author stephan.leutenmayr
 * 
 */
public class DemoAircraftTest extends WorkspaceTest {
	private static final String TESTMODEL_PATH = "testdata/";
	public static String TESTPLUGIN_ID = "net.bhl.cdt.calculation.test";
	private static String SCIEXEC = "C:\\Program Files\\scilab-5.3.3\\bin\\Scilex.exe";

	private Model model;

	@Test
	public void testDemoAircraft() {

		Preferences preferences = ConfigurationScope.INSTANCE
				.getNode("net.bhl.cdt.ui");
		preferences.put("SCIEXEC", SCIEXEC);

		try {
			preferences.flush();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		System.out.println(Platform.getPreferencesService().getString(
				"net.bhl.cdt.ui", "SCIEXEC", "", null));

		new CDTCommand() {
			@Override
			protected void doRun() {
				// Create Model and add to project
				model = ModelFactory.eINSTANCE.createModel();
				getProject().addModelElement(model);
				// Load Calculation Repository and add to project
				getProject().addModelElement(
						loadTestEObjectsFromFile(
								"SampleCalculationRepository.ecm").get(0));
			}
		}.run();
		new DemoAircraftModelCommand((Model) model).run();

		// Determine initial parameters of NUSAM model
		new DetermineInitialValuesForCalculationSetCommand(model
				.getConfigurations().get(0).getCalculationSets().get(0)).run();

		// Set initial values
		new CDTCommand() {
			@Override
			protected void doRun() {

				HashMap<String, Double> initialParameters = new HashMap<String, Double>();
				initialParameters.put("s_wet_fus", 200.0);
				initialParameters.put("s_ref", 50.0);
				initialParameters.put("aspect ratio", 9.0);
				initialParameters.put("Oswald efficieny", 0.85);
				initialParameters.put("ff_ref", 0.9);
				initialParameters.put("m_to", 23000.0);
				initialParameters.put("m_payload", 6250.0);
				initialParameters.put("R", 2000000.0);
				initialParameters.put("Altitude", 10668.0);
				initialParameters.put("Mach Number", 0.75);

				for (Entry<String, Double> entry : initialParameters.entrySet()) {
					String paramName = (String) entry.getKey();
					Double initialValue = (Double) entry.getValue();

					((MeasuredValue) UtilitiesHelper
							.getChildrenByClassAndName(
									model.getConfigurations().get(0),
									Parameter.class, paramName).get(0)
							.getValues().get(0).getDatatypes().get(0))
							.setValue(initialValue);
				}
			}
		}.run();

		// Execute calculation
		new CalculationCommand(model.getConfigurations().get(0)
				.getCalculationSets().get(0).getGraphs().get(0)).run();

	}

	@After
	public void cleanProjectSpace() {
	}

	@AfterClass
	public static void deleteData() {
	}

	/**
	 * This method returns EObjects loaded from an XML file.
	 * 
	 * @param filename
	 *            The name of the file from which the Elements are loaded
	 * @return a list of Objects which was loaded from a file with the given
	 *         filename
	 */

	// TODO Move this method to net.bhl.cdt.test
	public static EList<EObject> loadTestEObjectsFromFile(String filename) {

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.getResource(
				URI.createURI(UtilitiesHelper.getPluginFilePath(TESTPLUGIN_ID)
						+ TESTMODEL_PATH + filename), true);

		EList<EObject> result = new BasicEList<EObject>();

		for (EObject obj : resource.getContents()) {
			result.add(EcoreUtil.copy(obj));
		}

		return result;
	}

}
