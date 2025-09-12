//Hung Anh Ho
//11-15-2022
//Bank account demo

public class BankAccountDemo 
{

	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount("Hung Anh Ho", 2000.0);
		BankAccount accountCopy = new BankAccount(account);
		//Account copy
		System.out.println("This is a copy: \n" + accountCopy);
		
		//Copy account changes
		accountCopy.deposit(Input.getDouble("Enter the amount to deposit: ", true));

		//Copy account changes
		accountCopy.withdraw(Input.getDouble("Enter the amount to withdraw: ", true));
		
		//Original account
		System.out.println("\nThis is the original without the changes: \n"+ account);
		System.out.println("This is a copy with the changes: \n" + accountCopy);
	}

}
