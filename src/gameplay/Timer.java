package gameplay;
/**
 * Interface for Timer
 * @author Prathyusha Akshintala
 *
 */
public interface Timer 
{
	public void addTimeObserver(TimeObserver observer);
	public void removeTimeObserver(TimeObserver observer);
	public void timeChanged();
}
