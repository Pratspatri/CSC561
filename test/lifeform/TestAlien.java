package lifeform;
/**
 * JUnit test case for testing Alien.
 * @author Prathyusha Akshintala
 */
import static org.junit.Assert.*;

import org.junit.Test;

import recovery.RecoveryBehavior;
import recovery.RecoveryFractional;

public class TestAlien 
{
	/**
	 * All new tests - 
	 */
	@Test
	public void testDefaultStrength()
	{
		Alien yoda;
		yoda = new Alien("Yoda", 40);
		assertEquals(10, yoda.getAttackStrength());
		}
	
	/**
	 * Old tests for Strategy Pattern - Test for Initialization.
	 */
	@Test
	public void testInitialization() 
	{
		Alien jadoo;
		jadoo = new Alien ("Jadoo", 8);
		/**
		 * Case 1: Checks if the normal initialization is running correctly.
		 */
		assertEquals("Jadoo", jadoo.getName());
		assertEquals(8, jadoo.getCurrentLifePoints());
		/**
		 * Case 2: When the lifepoints assigned is negative, the method need to 
		 * return 0
		 */
		jadoo = new Alien ("Jadoo", -2);
		assertEquals(0, jadoo.getCurrentLifePoints());
		
		RecoveryBehavior recovB = new RecoveryFractional(0.1);
		Alien j = new Alien ("Jadoo", 50, recovB);
		j.takeHit(30);
		/**
		 * Test for fractional recovery
		 */
		j.recover();
		assertEquals (22, j.getCurrentLifePoints());
	}

	@Test
	public void testSetCurrentLifePoints()
	{
		/**
		 * Variable Initialization
		 */
		Alien jadoo;
		jadoo = new Alien ("Jadoo", 8);
		/**
		 * Case 1: When we set the lifepoints to negative, it should return 0.
		 */
		jadoo.setCurrentLifePoints(-25);
		assertEquals(0, jadoo.getCurrentLifePoints());
		/**
		 * Case 2: Checks for the basic initialization of lifepoints.
		 */
		jadoo.setCurrentLifePoints(15);
		assertEquals(15, jadoo.getCurrentLifePoints());
		// TODO test for recovery behavior
	}
}