package recovery;
/**
 * When the recovery is linear and that is added to currentLife every time Alien
 * gets hurt.
 * @author Prathyusha Akshintala
 *
 */
public class RecoveryLinear implements RecoveryBehavior
{
	private int recoveryStep;
	
	
	public RecoveryLinear(int step)
	{
		recoveryStep=step;
	}
	
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		int currentLifeTemp =0;
		if(currentLife>0 && (currentLife<maxLife) )
		{
			currentLifeTemp = currentLife+recoveryStep;
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
