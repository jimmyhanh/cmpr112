//Hung Anh Ho
//11-15-2022
//Employee demo

public class Employee 
{
	private String name;
	private String number;
	private String hireDate;
	
	/**
	 * No argument constructor
	 */
	public Employee()
	{
		name = "Unknown";
		number = "Unknown";
		hireDate = "Unknown";
	}
	
	/**
	 * Constructor
	 * @param newName-String type
	 * @param newNumber-String type
	 * @param newHireDate-String type
	 */
	public Employee(String newName, String newNumber, String newHireDate)
	{
		this.name = newName;
		this.number = newNumber;
		this.hireDate = newHireDate;
	}
	
	/**
	 * setName mutator
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * getName getter
	 * @return name-String type
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * setNumber mutator
	 * @param newNumber-String type
	 */
	public void setNumber(String newNumber)
	{
		this.number = newNumber;
	}
	
	/**
	 * getNumber mutator
	 * @return number-String type
	 */
	public String getNumber()
	{
		return number;
	}
	
	/**
	 * setHireDate mutator
	 * @param newHireDate-String type
	 */
	public void setHireDate(String newHireDate)
	{
		this.hireDate = newHireDate;
	}
	
	/**
	 * getHireDate mutator
	 * @return hireDate-String type
	 */
	public String getHireDate()
	{
		return hireDate;
	}
	
	/**
	 * Return String format
	 */
	public String toString()
	{
		String temp =  String.format("Name     : %s\nNumber   : %s\nHire Date: %s\n", getName(), getNumber(), getHireDate());
		return temp;
	}	
}
