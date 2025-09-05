//Hung Anh Ho
//11-7-2022
//Employee class

public class Employee 
{

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	/**
	 * Employee no-arg constructor
	 */
	public Employee()
	{
		name = "unknown";
		idNumber = 0;
		department = "unknown";
		position = "unknown";
	}
	
	/**
	 * Employee constructor input the variables into the object and assign them to related variables
	 * @param newName-String type
	 * @param newIDNumber-Integer type
	 * @param newDepartment-String type
	 * @param newPosition-String type
	 */
	public Employee(String newName, int newIDNumber, String newDepartment, String newPosition)
	{
		name = newName;
		idNumber = newIDNumber;
		department = newDepartment;
		position = newPosition;
	}

	/**
	 * Employee constructor input the variables into the object and assign them to related variables
	 * @param newName-String type
	 * @param newIDNumber-Integer type
	 */
	public Employee(String newName, int newIDNumber)
	{
		name = newName;
		idNumber = newIDNumber;
		department = "unknown";
		position = "unknown";
	}
	
	/**
	 * setName mutator to change the name 
	 * @param newName-String type
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	
	/**
	 * setIDNumber mutator to change the id number
	 * @param newIDNumber-Integer type
	 */
	public void setIDNumber(int newIDNumber)
	{
		idNumber = newIDNumber;
	}
	
	/**
	 * setDepartment mutator to change department
	 * @param newDepartment
	 */
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	
	/**
	 * setPosition mutator to change position
	 * @param newPosition
	 */
	public void setPosition(String newPosition)
	{
		position = newPosition;
	}
	
	// accessor or getter
	/**
	 * getName accessor get the name-String type
	 * @return name-String type
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * getIDNumber accessor get the id number-Integer type
	 * @return
	 */
	public int getIDNumber()
	{
		return idNumber;
	}
	
	/**
	 * getDepartment accessor get the department-String type
	 * @return department-String type
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * getPosition accessor get the position-String type
	 * @return position-String type
	 */
	public String getPosition()
	{
		return position;
	}
	
	/**
	 * toString method return String format-String type
	 * @return String format-String type
	 */
	public String toString()
	{
		String temp = String.format("\nName: %s \nID Nubmer: %d \nDepartment: %s \nPosition: %s\n", getName(), getIDNumber(), getDepartment(), getPosition());
		return temp;
	}
}
