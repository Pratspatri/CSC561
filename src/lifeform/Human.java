package lifeform;
/**
 * Class for Human to keep track of name, lifepoints and armorPoints.
 * Here also, same as Alien, Human inherits all the elements of LifeForm class.
 * @author Prathyuusha Akshintala
 */

public class Human extends LifeForm 
{
	private int armorPoints;
	
	public Human(String name, int points, int armor) 
	{
		super(name, points);
		if(armor >= 0)
		{
			armorPoints = armor;
		}
		else
		{
			armorPoints = 0;
		}
		lifeStrength = 5;
	}
	/**
	 * Create a new method to return armorPoints.
	 * @return armorPoints
	 */
	public int getArmorPoints() 
	{
		return armorPoints;
	}
	/**
	 * Sets the armorPoints according to the parameter if it is >=0 or =0.
	 * @param armorPoints
	 */
	public void setArmorPoints(int armorPoints) 
	{
		if( armorPoints >= 0)
		{
			this.armorPoints = armorPoints;
		}
		else
		{
			this.armorPoints = 0;
		}
	}
	/**
	 * 
	 * @param damage
	 */
	@Override
	public void takeHit(int damage)
	{
		if(damage > 0)
		{
			damage = damage - armorPoints;
			if(damage>0)
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
	}
}
