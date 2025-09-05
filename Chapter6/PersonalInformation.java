//Hung Anh Ho
//11-4-2022
//Personal information

public class PersonalInformation 
{
	private String name;
    private String address;
    private int age;
    private String phoneNumber;


    /**
     * No-arg constructor
     */
    public PersonalInformation()
    {
        name = "Unknown";
        address = "Unknown";
        age = 0;
        phoneNumber = "Unknown";
    }


    /**
     * Overloaded constructor
     * @param newName-The person's name-String type
     * @param newAddress-The person's address-String type
     * @param newAge-The person's age-Integer type
     * @param newPhoneNumber-The person's phone number-String type
     */
    public PersonalInformation(String newName, String newAddress, int newAge, String newPhoneNumber)
    {
    	name = newName;
        address = newAddress;
        age = newAge;
        phoneNumber = newPhoneNumber;
    }


    /**
     * The method setName sets the value of the name field
     * @param newName-The person's name-String type
     */
    public void setName(String newName)
    {
    	name = newName;
    }


    /**
     * The method setAddress sets the value of the address field
     * @param addr The person's address-String type
     */
    public void setAddress(String newAddress)
    {
    	address = newAddress;
    }


    /**
     * The metho0d setAge sets the value of the age field
     * @param newAge The person's age-Integer type
     */
    public void setAge(int newAge)
    {
    	age = newAge;
    }


    /**
     * The method setPhoneNumber sets the value of the phoneNumber field
     * @param newPhoneNumber The person's phone number-String type
     */
    public void setPhoneNumber(String newPhoneNumber)
    {
    	phoneNumber = newPhoneNumber;
    }


    /**
     * The method getName returns the value in the name field
     * @return name field-String type
     */
    public String getName()
    {
    	return name;
    }


    /**
     * The method getAddress returns the value in the address field
     * @return The value in the address field-String type
     */
    public String getAddress()
    {
    	return address;
    }


    /**
     * The method getAge returns the value in the age field
     * @return The value in the age field-Integer type
     */
    public int getAge()
    {
        return age;
    }


    /**
     * The method getPhoneNumber returns the value in the phoneNumber field
     * @return The value in the phoneNumber field-String type
     */
    public String getPhoneNumber()
    {
    	return phoneNumber;
    }
    
    /**
	 * toString method return String format-String type
	 * @return String format-String type
	 */
	public String toString()
	{
		String temp = String.format("\nName: %s \nAddress: %s \nAge: %d \nPhone number: %s\n", getName(), getAddress(), getAge(), getPhoneNumber().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
		return temp;
	}
    
}
