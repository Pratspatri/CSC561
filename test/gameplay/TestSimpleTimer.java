package gameplay;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Prathyusha Akshintala
 *
 */
public class TestSimpleTimer 
{

	@Test
	public void testInitialization() 
	{
		SimpleTimer timer = new SimpleTimer();
		assertTrue(timer instanceof Timer);
		assertEquals(0,timer.getRound());
		assertEquals(0,timer.getTheObservers().size());
	}
	
	@Test
	public void testAddObserver()
	{
		SimpleTimer timer = new SimpleTimer();
		TimeObserver peter = new MockSimpleTimerObserver();
		timer.addTimeObserver(peter);
		assertEquals(1,timer.getTheObservers().size());
	}
	
	@Test
	public void testRemoveObserver()
	{
		SimpleTimer timer = new SimpleTimer();
		TimeObserver walter = new MockSimpleTimerObserver();
		timer.addTimeObserver(walter);
		assertEquals(1,timer.getTheObservers().size());
		timer.removeTimeObserver(walter);
		assertEquals(0,timer.getTheObservers().size());
	}
}
/**
 * 
 *
 */
class MockSimpleTimerObserver implements TimeObserver
{
	public int myTime = 0;
	public void updateTime(int time)
	{
		myTime = time;
	}
}
