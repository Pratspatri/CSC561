package lifeform;
import lifeform.LifeForm;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * Tests the functionality provided by the LifeForm class  
 * @author : Prathyusha Akshintala 
 */  
public class TestLifeForm 
{
	/**
	 * All new tests - to test strength of the lifeform.
	 */
	
	@Test
	public void testStrength()
	{
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40, 5);
		assertEquals(5, entity.getAttackStrength());
		
		entity = new MockLifeForm("Bob", 40, -1);
		assertEquals(0, entity.getAttackStrength());
	}
	/**
	 * 
	 */
	@Test
	public void testAttackMethod()
	{
		LifeForm entity1,entity2;
		entity1 = new MockLifeForm("Monica", 35, 10);
		entity2 = new MockLifeForm("Chandler", 40, 5);
		
		entity1.attack(entity2);
		// Case1: Normal method when entity1 damages entity2
		assertEquals(30, entity2.getCurrentLifePoints());
		//Case 2: when entity1 currentLifePoints is 0 or it is dead
		//It can't damage the opponent.
		entity1 = new MockLifeForm("Monica", 0, 10);
		entity2 = new MockLifeForm("Chandler", 40, 5);
		entity1.attack(entity2);
		assertEquals(40, entity2.getCurrentLifePoints());
	}
	
	/**
	 * Old tests for Strategy Pattern - When a LifeForm is created, it should 
	 * know its name and how many life points it has.
	 */
	@Test
	public void testInitialization() 
	{
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());
	}
	/**
	 * Test for takeHit method. After creating LifeForm, it should 
	 * do subtract damage from currentLifePoints and test for various
	 * boundary conditions.
	 */
	@Test
	public void testTakeHit()
	{
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40);
		/**
		 * case 1: When currentLifePoints - damage is > 0
		 */
		entity.takeHit(20);
		assertEquals(20, entity.getCurrentLifePoints());
		/**
		 * case 2: Second hit
		 */
		entity.takeHit(10);
		assertEquals(10,entity.getCurrentLifePoints());
		/**
		 * Case 3: When damage is < 0  
		 */
		entity.takeHit(-10);
		assertEquals(10,entity.getCurrentLifePoints());
		/**
		 * Case 4: When currentLifePoints = 0
		 */
		entity.takeHit(20);
		assertEquals(0,entity.getCurrentLifePoints());
		/**
		 * Case 5: When currentLifePoints - damage is <0
		 */
		entity.takeHit(20);
		assertEquals(0,entity.getCurrentLifePoints());
		
		
	}
}
