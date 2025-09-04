//Hung Anh Ho
//9-26-2022
//Pennies for pay

import java.util.Scanner;
public class PenniesForPay 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			int InputDays;
			do
			{
				//User input for the speed of vehicle
				System.out.print("Enter a positive nonzero value for the number of days: ");
				
				//Validate input
				if (!keyboard.hasNextDouble())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else
				{
					InputDays = keyboard.nextInt();
					if (InputDays <= 0)
					{
						System.out.println("ERROR: Invalid input, " + InputDays + ". It must be a positive nonzero number.");
						keyboard.nextLine();
						continue;
					}
					
					else
					{
						keyboard.nextLine();
						break;
					}
				}
				
			} while(true);
			
			
			
			// Display header
	        System.out.println();
			System.out.println("Day		Salary");
	        System.out.println("-----------------------");
	        
	        
	        //Display days and income in dollars
			int Days;
			double DailyPay = 0.01; //start of pennies earned in the first day
			double TotalPay = 0; // Total accumulator
			for(Days = 1; Days <= InputDays; Days++)
			{
				System.out.printf("%3d		$%.2f\n", Days, DailyPay);
				DailyPay += DailyPay;
				TotalPay += DailyPay;
			}
			
			TotalPay = TotalPay / 2;
			
			
			
			//Total pay over the number of days inputed
			System.out.println("-----------------------");
			System.out.printf("The total pay at the end of %s days:  $%.2f\n", InputDays, TotalPay);
			
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
		
		keyboard.close();
	}
}
