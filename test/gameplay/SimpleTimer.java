package gameplay;

import java.util.ArrayList;

/**
 * 
 * @author Prathyusha Akshintala
 *
 */
public class SimpleTimer implements Timer 
{
	private int round;
	private ArrayList<TimeObserver> theObservers;
	
	public SimpleTimer()
	{
		round = 0;
		theObservers = new ArrayList<TimeObserver>();
	}
	
	@Override
	public void addTimeObserver(TimeObserver observer) 
	{
		theObservers.add(observer);
	}
	
	@Override
	public void removeTimeObserver(TimeObserver observer) 
	{
		theObservers.remove(observer);
	}

	@Override
	public void timeChanged() 
	{
		
		
	}
	//
	public int getRound() 
	{
		return round;
	}
	//TODO 
	public ArrayList<TimeObserver> getTheObservers() 
	{
		return theObservers;
	}	
}
