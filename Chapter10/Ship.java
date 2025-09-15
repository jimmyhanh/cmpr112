//Hung Anh Ho
//11-20-2022
//Ship class

public class Ship 
{
	private String name;
	private String year;
	
	/**
	 * No argument constructor
	 */
	public Ship()
	{
		name = "Unknown";
		year = "Unknown";
	}
	
	/**
	 * Constructor
	 * @param newName-String type
	 * @param newYear-String type
	 */
	public Ship(String newName, String newYear)
	{
		this.name = newName;
		this.year = newYear;
	}
	
	/**
	 * setShipName mutator
	 * @param newName-String type
	 */
	public void setShipName(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * setYearBuilt getter
	 * @param newYear-String type
	 */
	public void setYearBuilt(String newYear)
	{
		this.year = newYear;
	}
	
	/**
	 * getShipName() getter
	 * @return name-String type
	 */
	public String getShipName()
	{
		return name;
	}
	
	/**
	 * getYearBuilt getter
	 * @return year-String type
	 */
	public String getYearBuilt()
	{
		return year;
	}
	
	/**
     * Return to string format
     */
	public String toString()
	{
		return String.format("Ship: " + getShipName() + "\nBuilt: " + getYearBuilt());
	}
}
