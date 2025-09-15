//Hung Anh Ho
//11-15-2022
//Person class

public class Person 
{
    private String name;
    private String address;;
    private String telephoneNumber;

    /**
     * No argument constructor
     */
    public Person()
    {
        this.name = "";
        this.address = "";
        this.telephoneNumber = "";
    }
    
    /**
     * Constructor 
     * @param name-String type
     * @param address- String type
     * @param telephoneNumber- String type
     */
    public Person(String name, String address, String telephoneNumber)
	{
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}
    
    /**
     * Person Constructor
     * @param object2
     */
    public Person(Person object2)
    {
    	this.name = object2.getName();
    	this.address = object2.getAddress();
    	this.telephoneNumber = object2.getTelephoneNumber();
	}
    
    /**
     * setName mutator
     * @param name-String type
     */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * getName getter
	 * @return name - String type
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * setAddress mutator
	 * @param address-String type
	 */
	public void setAddress(String address) 	
	{
		this.address = address;
	}
	
	/**
	 * getAddress getter
	 * @return address- String type
	 */
	public String getAddress() 
	{
		return address;
	}
	
	/**
	 * setTelephoneNumber mutator
	 * @param telephoneNumber-String type
	 */
	public void setTelephoneNumber(String telephoneNumber) 
	{
		this.telephoneNumber = telephoneNumber;
	}
	
	/**
	 * getTelephoneNumber getter type
	 * @return telephoneNumber-String type
	 */
	public String getTelephoneNumber() 
	{
		return telephoneNumber;
	}
	
	/**
	 * Return String format
	 */
	public String toString()
	{
		String temp = String.format("\nPerson:\nName: %s", getName());
    	temp += String.format("\nAddress: %s", getAddress());
    	temp += String.format("\nTelephone: %s", getTelephoneNumber());
    	
    	return temp;
	}
}
