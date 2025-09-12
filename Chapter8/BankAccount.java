//Hung Anh Ho
//11-15-2022
//Bank account

public class BankAccount 
{
	// account balance
	private double balance;
	private String name;

	/**
     * No argument constructor sets the starting balance
     */
    public BankAccount()
    {
    	name = "";
    	balance = 0.0;
    }
    
    /**
     * Copy Constructor
     * @param newAccount--The object to be copied
     */
    public BankAccount(BankAccount newAccount)
	{
    	this.name = newAccount.name;
    	this.balance = newAccount.balance;
	}

    
    /**
     * This constructor sets the account name and starting balance to the value passed as an argument.
     * @param startBalance-Double type
     */
	public BankAccount(String newName,double startBalance)
	{
		name = newName;
		balance = startBalance;
	}
	
	/**
     * The setBalance method sets the account balance.
     * @param b The value to store in the balance field
     */
    public void setBalance(double newBalance)
    {
        balance = newBalance;
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
     * The method getName returns the value in the name field
     * @return name field-String type
     */
    public String getName()
    {
    	return name;
    }
	
    /**
     * The deposit method mutate makes a deposit into the account
     * @param amount The amount to add to the balance field
     */
	public void deposit(double amount)
	{
    	balance += amount;
	}


    /**
     * The withdraw method mutate withdraws an amount from the account
     * @param amount The amount to add to withdraw from the account
     */
    public void withdraw(double amount)
    {
    	balance -= amount;
    }


    /**
     * getBalance return the balance
     * @return balance-double type
     */
    public double getBalance()
    {
    	return balance;
    }
    
    /**
	 * toString method return String format-String type
	 * @return String format-String type
	 */
	public String toString()
	{
		String temp = String.format("\nAccount name: %s\nThe account balance: %.2f\n", getName(), getBalance());
		return temp;
	}
}
