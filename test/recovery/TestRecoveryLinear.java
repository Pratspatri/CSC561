package recovery;
/**
 * Test for recovery behavior when the recovery is linear.
 * @author - Prathyusha Akshintala
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecoveryLinear 
{

	@Test
	public void testRecoveryLinear() 
	{
		/**
		 * We use the interface here. 
		 */
		RecoveryBehavior recovB = new RecoveryLinear(5);
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
		RecoveryBehavior recovC = new RecoveryLinear(10);
		assertEquals (50, recovC.calculateRecovery(45, 50));
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
