package recovery;
/**
 * When the recovery is fractional and that is added to currentLife every time Alien
 * gets hurt.
 * @author Prathyusha Akshintala
 */
public class RecoveryFractional implements RecoveryBehavior
{
	
	private double percentRecovery;
	
	/**
	 * Constructor having parameter percent/fraction
	 * @param percent
	 */
	public RecoveryFractional(double percent)
	{
		
		percentRecovery=percent;
	}
	
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		
		int currentLifeTemp =0;
		if(currentLife>0 && (currentLife<maxLife) )
		{
			int roundPercent = (int) Math.round((percentRecovery*currentLife));
			currentLifeTemp = currentLife+roundPercent;
			if(currentLifeTemp>maxLife)
			{
				return maxLife;
			}
			else if(currentLifeTemp<=maxLife)
			{
				return currentLifeTemp;
			}
		}
		else if(currentLife>0 && (currentLife==maxLife))
		{
			return maxLife;
		}
		else if(currentLife==0)
		{
			return currentLife;
		}
		return maxLife;
	}
}
