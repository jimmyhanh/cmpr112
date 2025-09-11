//Hung Anh Ho
//10-26-2022
//Charge account number

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class ChargeAccountValidation 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Integer> ChargeAccountNumbers = new ArrayList<Integer>();
		getAccountNumbers(ChargeAccountNumbers);
		
		char Answer;
		do
		{
			// get the number from the user
			int number = Input.getInteger("Enter account number (7 digits): ", true);
			
			// check to see if the number is valid
			if (ChargeAccountNumbers.contains(number)) 
			{
				System.out.println("Account detected.");
			}
			
			else 
			{
				System.out.println("That number is invalid.");
			}
			
			do
			{
				System.out.print("\nContinue (Y-yes or N-no)? ");
				Answer = keyboard.nextLine().toUpperCase().charAt(0);
					
				if (Answer == 'Y')
					break;
					
				else
				{
					if (Answer == 'N')
						break;
						
					else
						System.out.printf("\nERROR: invalid choice %s\n", Answer);
						continue;
				}
			 } while (Answer != 'Y' || Answer != 'N');
				
					
			if (Answer == 'Y') 
				continue;
				
			else if (Answer == 'N')
				break;
				
			else
				continue;
		
		} while(true);
	}
	
	/**
	 * getAccountNumbers method add the account numbers to the list and return the list-ArrayList Integer type
	 * @param ChargeAccountNumbers-ArrayList Integer type
	 * @return ChargeAccountNumbers-ArrayList Integer type
	 */
	public static ArrayList<Integer> getAccountNumbers(ArrayList<Integer> ChargeAccountNumbers)
	{
		ChargeAccountNumbers.add(5658845);
		ChargeAccountNumbers.add(4520125);
		ChargeAccountNumbers.add(7895122);
		ChargeAccountNumbers.add(8777541); 
		ChargeAccountNumbers.add(8451277); 
		ChargeAccountNumbers.add(1302850);
		ChargeAccountNumbers.add(8080152);
		ChargeAccountNumbers.add(4562555);
		ChargeAccountNumbers.add(5552012);
		ChargeAccountNumbers.add(5050552);
		ChargeAccountNumbers.add(7825877);
		ChargeAccountNumbers.add(1250255); 
		ChargeAccountNumbers.add(1005231);
		ChargeAccountNumbers.add(6545231);
		ChargeAccountNumbers.add(3852085);
		ChargeAccountNumbers.add(7576651);
		ChargeAccountNumbers.add(7881200);
		ChargeAccountNumbers.add(4581002);
		
		return ChargeAccountNumbers;
	}
}
