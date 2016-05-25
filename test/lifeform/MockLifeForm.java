package lifeform;
/**
 * Because Lifeform is an abstract class we need to create MockLifeForm which
 * extends Lifeform class and is used in testing. 
 * @author Prathyusha Akshintala
 *
 */

public class MockLifeForm extends LifeForm 
{

	public MockLifeForm(String name, int points) 
	{
		super(name, points);
	}
	/**
	 * We create another constructor including the 
	 * lifestrength parameter so that this wont affect the
	 * previous existing tested code.
	 */
	public MockLifeForm(String name, int points, int lifestrength) 
	{
		super(name, points, lifestrength);
	}
}
