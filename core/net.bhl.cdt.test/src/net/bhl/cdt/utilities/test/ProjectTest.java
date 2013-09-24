package net.bhl.cdt.utilities.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import net.bhl.cdt.test.WorkspaceTest;
import net.bhl.cdt.utilities.util.UtilitiesHelper;

import org.eclipse.emf.emfstore.bowling.BowlingFactory;
import org.eclipse.emf.emfstore.bowling.League;
import org.eclipse.emf.emfstore.bowling.Player;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.junit.Test;

/**
 * @author David
 */
public class ProjectTest extends WorkspaceTest {

	/**
	 * 
	 */
	@Test
	public void testen() {
		UtilitiesHelper.getProjectId(null);
		ESLocalProject project = getLocalProject();

		League league = BowlingFactory.eINSTANCE.createLeague();
		league.setName("Suprbowling League");
		project.getModelElements().add(league);

		Player player1 = BowlingFactory.eINSTANCE.createPlayer();
		player1.setName("Maximilian");
		Player player2 = BowlingFactory.eINSTANCE.createPlayer();
		player2.setName("Ottgar");
		league.getPlayers().add(player1);
		league.getPlayers().add(player2);

		assertNotEquals(null, UtilitiesHelper.getParent(league.getClass(), player1));
		assertNotEquals(null, UtilitiesHelper.getChildrenByClassAndName(league, Player.class, "player1"));
		assertEquals(new ArrayList<Player>(),
			UtilitiesHelper.getChildrenByClassAndName(league, Player.class, "player3"));
		assertNotEquals(UtilitiesHelper.getChildrenOfType(player1, League.class), null);

		UtilitiesHelper.getFileURL("", "");
		UtilitiesHelper.getPluginFilePath("Test");
		// not commited
		assertEquals(null, UtilitiesHelper.getProjectId(league));
		assertNotEquals(null, project);
	}
}
