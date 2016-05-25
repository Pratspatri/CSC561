package recovery;
/**
 * Class for when there is no recovery.
 * @author Prathyusha Akshintala
 *
 */
public class RecoveryNone implements RecoveryBehavior
{
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		return currentLife;
	}
}
