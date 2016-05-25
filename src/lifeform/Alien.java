package lifeform;
import recovery.RecoveryBehavior;
/**
 * Class for alien to keep track of its name and lifepoints
 * @author Prathyusha Akshintala
 *
 */
public class Alien extends LifeForm 
{
	private int maxLifePoints;
	private RecoveryBehavior recoveryBehavior;
	/**
	 * Because Alien is a subclass of LifeForm it inherits the already existing 
	 * elements of LifeForm class
	 * @param name
	 * @param points
	 */
	public Alien(String name, int points) 
	{
		super(name, points);
		if(points >= 0)
		{
			maxLifePoints = points;
		}
		else
		{
			maxLifePoints = 0;
		}
		lifeStrength = 10;
	}
	
	public Alien(String name, int points, RecoveryBehavior rb)
	{
		this(name, points);
		recoveryBehavior = rb;
	}
	/**
	 * Creating a new method to set current lifepoints which is used for recovery
	 * behavior.
	 * @param lifepoints
	 */
	public void setCurrentLifePoints(int lifepoints)
	{
		if(lifepoints >= 0)
		{
			currentLifePoints = lifepoints;
		}
		else
		{
			currentLifePoints = 0;
		}
	}
	/**
	 * creating a method to calculate recovery when alien gets hit and then 
	 * setting the currentLifePoints.
	 */
	public void recover()
	{
		int lifePoints = recoveryBehavior.calculateRecovery(currentLifePoints, maxLifePoints);
		setCurrentLifePoints(lifePoints);
	}
}
