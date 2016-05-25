package lifeform;
/**
 * JUnit test case for testing Human.
 * @author Prathyusha Akshintala
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestHuman 
{
	/**
	 * All new tests -  
	 */
	@Test
	public void testDefaultStrength()
	{
		Human harry;
		harry = new Human("Harry", 30, 5);
		assertEquals(5, harry.getAttackStrength());
		} 
	
	/**
	 * Test for checking if human got hurt and armorPoints take
	 * the hit.
	 */
	@Test
	public void testHumanTakeHit()
	{
		Human harry, ron;
		harry = new Human("Harry", 30, 10);
		ron = new Human("Ron", 40, 5);
		harry.attack(ron);
		
		//Case1: When damage < armor
		assertEquals(40, ron.getCurrentLifePoints());
		
		//Case2: When damage > armor >0
		Alien yoda = new Alien("Yoda", 50);
		yoda.attack(ron);
		assertEquals(35, ron.getCurrentLifePoints());
		
		//Case3: when armor = 0
		ron = new Human("Ron", 40, 0);
		yoda.attack(ron);
		assertEquals(30,ron.getCurrentLifePoints());
		
		//Case4: when damage = armor
		ron = new Human("Ron", 40, 10);
		yoda.attack(ron);
		assertEquals(40,ron.getCurrentLifePoints());
	}
	//TODO if strength for alien and human can be assigned
	
	/**
	 * Old tests - Testing for the initialization. In any of the below cases, no need to
	 * again check for Name and currentLifePoints as they are already done in
	 * LifeForm. And since Human is a subclass of LifeForm, the tests are true 
	 * here as well.
	 */
	@Test
	public void testInitialization() 
	{
		Human monica;
		monica = new Human ("monica", 35, 10);
		/**
		 * Case 1: When we give a positive value > 0 as the armorPoints parameter
		 * 		   it returns the same.
		 */
		assertEquals(10, monica.getArmorPoints());
		monica = new Human ("monica", 35, -10);
		/**
		 * Case 2: When we give negative value for the armorPoints, it returns 0.
		 */
		assertEquals(0, monica.getArmorPoints());
	}
	
	@Test
	public void testSetArmorPoints()
	{
		Human monica;
		monica = new Human ("monica", 35, 10);
		monica.setArmorPoints(-5);
		/**
		 * Case 1: We cannot set negative armorPoints, so when the same is given, 
		 * 		   this method returns 0.
		 */
		assertEquals(0, monica.getArmorPoints());
		monica.setArmorPoints(20);
		/**
		 * Case 2: Setting the positive points to armorPoints.
		 */
		assertEquals(20, monica.getArmorPoints());
	}
}
