//Hung Anh Ho
//11-20-2022
//Customer class

public class Customer extends Person 
{
	private int customerNumber;
	private boolean onMailingList;

	/**
	 * Non argument constructor
	 */
	public Customer()
	{
		super();
		customerNumber = 0;
		onMailingList = false;
	}
	
	/**
	 * Constructor
	 * @param object2-Customer object
	 */
	public Customer(Customer object2)
	{
		super(object2.getName(), object2.getAddress(), object2.getTelephoneNumber());
		this.customerNumber = object2.getCustomerNumber();
		this.onMailingList = object2.getOnMailingList();
    }
	
	/**
	 * Constructor
	 * @param person-Person object
	 * @param customerNumber-integer type
	 * @param onMailingList-boolean type
	 */
	public Customer(Person person, int customerNumber, String answer)
	{
		super(person.getName(), person.getAddress(), person.getTelephoneNumber());
		this.customerNumber = customerNumber;
		this.onMailingList = getAnswer(answer);
	}

	/**
	 * COnstructor
	 * @param name-String type
	 * @param address-String type
	 * @param telephoneNumber-String type
	 * @param customerNumber-integer type
	 * @param onMailingList-boolean type
	 */
	public Customer(String name, String address, String telephoneNumber, int customerNumber, String answer)
    {
		super(name, address, telephoneNumber);
		this.customerNumber = customerNumber;
		this.onMailingList = getAnswer(answer);
	}
	
	/**
	 * setCustomerNumber mutator
	 * @param customerNumber-integer type
	 */
	public void setCustomerNumber(int customerNumber) 
	{
		this.customerNumber = customerNumber;
	}
	
	/**
	 * getCustomerNumber getter
	 * @return customerNumber
	 */
	public int getCustomerNumber() 
	{
		return customerNumber;
	}
	
	/**
	 * setOnMailingList mutator
	 * @param onMailingList
	 */
	public void setOnMailingList(String answer) 
	{
		this.onMailingList = getAnswer(answer);
	}

	/**
	 * getOnMailingList getter
	 * @return onMailingList-boolean type
	 */
	public boolean getOnMailingList()
	{
		return onMailingList;
	}
	
	public boolean getAnswer(String answer)
	{
		if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y"))
		{
			this.onMailingList = true;
		}
		else
			this.onMailingList = false;
		
		return onMailingList;
	}
	
	/**
	 * Return String format
	 */
	public String toString() 
	{
		String temp = String.format("\nCustomer Number: %s", getName());
    	temp += String.format("\nOn Mailing List: %s", getOnMailingList());
    	temp += String.format("\nName: %s", getName());
    	temp += String.format("\nAddress: %s", getAddress());
    	temp += String.format("\nTelephone: %s", getTelephoneNumber());
    	
		return temp;
	}
}
