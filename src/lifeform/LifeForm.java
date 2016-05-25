package lifeform;
import lifeform.LifeForm;
/**
 * Keeps track of the information associated with a simple life form.
 * Also provides the functionality related to the life form.
 * @author : Prathyusha Akshintala
 */
public abstract class LifeForm 
{
	private String myName ;
	/**
	 * Changed the access from private to protected so that Alien subclass can use it.
	 */
	protected int currentLifePoints ;
	/**
	 * Access is protected so that subclass can use it.
	 */
	protected int lifeStrength;
/**
 * Create an instance
 * @param name the name of the life form
 * @param points the current starting life points of the life form	
 */
	public LifeForm(String name, int points)
	{
		myName = name;
		if (points >= 0)
		{
			currentLifePoints = points;
		}
		else
		{
			currentLifePoints = 0;
		}
	}
	/**
	 * Create an instance
	 * @param name the name of the life form
	 * @param points the current starting life points of the life form
	 * @param lifestrength telling us about the strength of lifeform	
	 */
	public LifeForm(String name, int points, int lifestrength) 
	{
		this(name,points);
		if (lifestrength >= 0)
		{
			lifeStrength = lifestrength;
		}
		else
		{
			lifeStrength = 0;
		}
	}
/**
 * @return the name of the life form.	
 */
	public String getName()
	{
		return myName;
	}
/**
 * @return the amount of current life points the life form has.
 */
	public int getCurrentLifePoints()
	{
		return currentLifePoints;
	}
	/**
	 * 
	 * @param damage
	 */
	public void takeHit(int damage)
	{
		if(damage > 0)
		{
			if(currentLifePoints - damage >= 0)
			{
				currentLifePoints = currentLifePoints - damage;
			}
			else
			{
				currentLifePoints = 0;
			}
		}
	}
	
	/**
	 * 
	 */
	public int getAttackStrength()
	{
		return lifeStrength;
	}
	public void attack(LifeForm entity2) 
	{
		if(this.getCurrentLifePoints()>0)
		{
			entity2.takeHit(lifeStrength);
		}
	}
}