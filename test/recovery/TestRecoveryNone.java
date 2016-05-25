package recovery;
/**
 * Test for recovery behavior when the recovery is none.
 * @author Prathyusha Akshintala
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryNone
{

	@Test
	public void testRecoveryNone() 
	{
		/**
		 * We use the interface here. 
		 */
		RecoveryBehavior recovB = new RecoveryNone();
		/**
		 * Case 1: When after recovery also, at maxLifePoints the alien stays at 
		 * maxLifePoints
		 */
		assertEquals (50, recovB.calculateRecovery(50, 50));
		/**
		 * Case 2: When the alien is hurt, RecoveryNone only returns the
		 * currentLifePoints indicating that there is no recovery.
		 */
		assertEquals (20, recovB.calculateRecovery(20, 50));
	}
}
