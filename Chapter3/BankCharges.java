//Hung Anh Ho
//9-12-2022
//Bank Charges
import java.util.Scanner;
public class BankCharges 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Number of checks input
		int ChecksNumber;
		System.out.print("Enter the number of checks written for the month: ");
		ChecksNumber = keyboard.nextInt();
		keyboard.nextLine();
		
		//Number sort
		double FeePerCheck;
		if (ChecksNumber < 20)
			FeePerCheck = 0.1;
		else if (ChecksNumber >= 20 && ChecksNumber <= 39)
			FeePerCheck = 0.08;
		else if (ChecksNumber >= 40 && ChecksNumber <= 59)
			FeePerCheck = 0.06;	
		else if (ChecksNumber >= 60)
			FeePerCheck = 0.04;
		else
		{
			System.out.println("Error! Invalid input " + ChecksNumber);
			return;
		}
		
		//Calculating fees
		int BaseFee = 10;
		double TotalFee;
		TotalFee = BaseFee + (ChecksNumber * FeePerCheck);
		
		//Display
		System.out.println("The bank's service fees for the month for " + ChecksNumber + " check(s) is $" + TotalFee);
	}
}
