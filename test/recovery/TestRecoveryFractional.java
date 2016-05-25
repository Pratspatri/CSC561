package recovery;
/**
 * Test for recovery behavior when the recovery is fractional.
 * @author - Prathyusha Akshintala
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryFractional 
{

	@Test
	public void testRecoveryFractional() 
	{
		/**
		 * We use the interface here. 
		 */
		RecoveryBehavior recovB = new RecoveryFractional(0.1);
		/**
		 * Case 1: When maxLife = currentLife
		 */
		assertEquals (50, recovB.calculateRecovery(50, 50));
		/**
		 * Case 2: When Alien is hurt and we need to check
		 * if the currentLife after recovery is < =  maxLife - normal case
		 */
		assertEquals (50, recovB.calculateRecovery(45, 50));
		/**
		 * Case 3: When Alien is hurt and we need to check if currentLife
		 *  after recovery is > maxLife
		 */
		RecoveryBehavior recovC = new RecoveryFractional(0.1);
		assertEquals (50, recovC.calculateRecovery(49, 50));
		/**
		 * Case 4: When Alien is dead and we need to check the
		 * currentLife
		 */
		assertEquals (0, recovC.calculateRecovery(0, 50));
		/**
		 * Case 5: When currentLife is > maxLife
		 */
		assertEquals (50, recovC.calculateRecovery(60, 50));
		/**
		 * Case 6: When currentLife is < 0
		 */
		assertEquals (50, recovC.calculateRecovery(-10, 50));
	}

}
