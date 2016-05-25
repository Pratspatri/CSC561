package environment;
import environment.Environment;
import lifeform.LifeForm;
import lifeform.MockLifeForm;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test for the class Environment
 * @author : Prathyusha Akshintala
 */
public class TestEnvironment 
{
	Environment envn;
		
	/**
	 * Trying to add just a single LifeForm to the cell
	 */
	@Test
	public void testAddSingleLifeForm() 
	{
		LifeForm bob = new MockLifeForm("Bob", 27);
		envn = new Environment(1,1);
		boolean sample = envn.addLifeForm(0, 0, bob);
		assertTrue(sample);
		assertEquals("Bob",envn.getLifeForm(0, 0).getName());
		assertEquals(null, envn.getLifeForm(1, 1));
		assertEquals(null, envn.getLifeForm(0, 2));
		assertEquals(null, envn.getLifeForm(2, 0));
	}

	/**
	 * Trying to add LifeForm to the cell and testing with various conditions: 
	 * When rows is within limit but columns exceed the grid range and vice versa.
	 * Also when the (row,col) is out of the grid range.
	 */

	@Test
	public void testAddLifeForm() 
	{
		// creating the environment as a grid consisting 
		// of 2 rows and 3 columns
		envn = new Environment(2,3);
		// Variable declaration and instantiation.
		LifeForm harry = new MockLifeForm("harry", 35); 	
		boolean case1 = envn.addLifeForm(1, 2, harry);  
		assertTrue(case1);                              
		// Case1: checking whether the contents of (1,2) is harry
		assertEquals("harry",envn.getLifeForm(1, 2).getName()); 
		// variable declaration and assigning details for dany
		LifeForm dany = new MockLifeForm("dany",50);
		// checking whether we can add dany to the existing details of harry in (1,2) 
		// and it returns false
		assertFalse(envn.addLifeForm(1, 2, dany)); 
		LifeForm arya = new MockLifeForm("arya",18 );
		boolean case2 = envn.addLifeForm(3, 2, arya);
		// Case2: it returns false as we can insert values only within the array range of the grid
		assertFalse(case2); 
		LifeForm jon = new MockLifeForm("jon", 25);
		assertFalse(envn.addLifeForm(1, 4, jon));	// either of the parameters is outside the range
		assertFalse(envn.addLifeForm(4, 2, jon));	// either of the parameters is outside the range
		
	}

	@Test
	public void testRemoveLifeForm()
	{
		//Environment envn = null;
		//Variable declaration and instantiation.
		envn = new Environment(2,3);
		LifeForm harry = new MockLifeForm("harry", 35); 	// assigning details for harry
		boolean case2 = envn.addLifeForm(1, 2, harry); 	
		assertTrue(case2);
		LifeForm case3 = envn.removeLifeForm(1, 2); 	
		assertEquals(harry,case3); 						// checking whether the removed entity is harry
		assertEquals(null, envn.removeLifeForm(4, 3));  // parameters out of the grid range (2,3)
		assertEquals(null, envn.removeLifeForm(1, 4));  // either of the parameters is outside the range
		assertEquals(null, envn.removeLifeForm(4, 2));	// either of the parameters is outside the range
	}
	
}