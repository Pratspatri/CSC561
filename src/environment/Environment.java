package environment;
import environment.Environment;
import lifeform.LifeForm;
import environment.Cell;

/**
 * A class that keeps track of small world of cells in which
 * LifeForm exists. These cells are arranged in a simple grid.
 * @author : Prathyusha Akshintala
 */

public class Environment 
{
	private Cell[][] theCells;
	LifeForm entity;
	int rows,column;

	/**
	 * Constructor to create the grid of cells
	 * i - number of rows to be present in the grid
	 * j - number of columns to be present in the grid
	 */
	public Environment(int i, int j) 
	{
		rows = i;
		column = j;
		theCells = new Cell[i][j];
		for(i=0; i<rows; i++)
		{
			for(j=0; j<column; j++)
			{
				theCells[i][j] = new Cell();
			}
		}
	}
	
	public LifeForm getLifeForm(int row, int col)
	{
		if (row<this.rows && col<this.column)
		{
			return theCells[row][col].getLifeForm();
		}
		else
		{
			return null;
		}
	}
	/**
	 * Adds a LifeForm to the Cell theCells[row][col].
	 * Will not add the LifeForm if the row and col are invalid or
	 * if a LifeForm is already in that Cell. 
	 * row - Receives the location of the cell (row) in the grid to which value should be added.
	 * col - Receives the location of the cell (col) in the grid to which value should be added.
	 * entity - Receives the LifeForm object to be the content of the current cell(based on row and col)
	 * return - Returns true if successfully added, false otherwise
	 */
	public boolean addLifeForm(int row, int col, LifeForm lifeentity)
	{	
		boolean temp1 = false;
		if((row<rows)&&(col<column))
		{  // checking for whether the given row and col is within the array range else return false 
				temp1 = theCells[row][col].addLifeForm(lifeentity); // returns true if the entity were able to add
				return temp1;
		}
		else 
		{
			return false;
		}
	}

	/**
	 * Removes the LifeForm at theCells[row][col].
	 * row - Receives the location of the cell (row) in the grid to which value should be removed.
	 * col - Receives the location of the cell (row) in the grid to which value should be removed.
	 * return - Returns the LifeForm removed(null if no LifeForm in the Cell)
	 */
	public LifeForm removeLifeForm(int row, int col)
	{
		LifeForm temp2 = null;
		if((row<rows)&&(col<column))
		{  // checking for whether the given row and col is within the array range else return false 
				temp2 = theCells[row][col].removeLifeForm(); // returns true if the entity were able to add
				return temp2;
		}
		else 
		{
			return null;
		}
	}
}