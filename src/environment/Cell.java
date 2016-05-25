package environment;
import environment.Cell;
import lifeform.LifeForm;
/**
 * A Cell that can hold a LifeForm.
 * @author : Prathyusha Akshintala
 */
public class Cell 
{
	private LifeForm entity;
	
	public Cell()
	{
		entity = null;
	}
	/**
	 * @return the LifeForm in this Cell.
	 */
	public LifeForm getLifeForm()
	{
		return entity;
	}
	
	
	
	/**
	 * Tries to add the LifeForm to the Cell. Will not add if a
	 * LifeForm is already present.
	 * @return true if the LifeForm was added to the Cell, false otherwise.
	 */
	public boolean addLifeForm(LifeForm temp)
	{
		if(this.entity == null)
		{
			this.entity = temp;
			return true;
		}
		return false;
	}
	
	public LifeForm removeLifeForm()
	{
		if(entity != null)
		{
			LifeForm store = entity;
			entity = null;
			return store;
		}
		else 
		{
			return null;
		}
	}
}
