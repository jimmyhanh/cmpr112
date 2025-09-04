//Hung Anh Ho
//9-26-2022
//Sum of numbers

import java.util.Scanner;
import java.util.Random;
public class SumOfNumbers 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			//User input for a positive InputNumber		
			int InputNumber;
			do
			{
				System.out.print("Enter a positive nonzero integer: ");
				
				if(!keyboard.hasNextInt())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else
				{
					InputNumber = keyboard.nextInt();
					if (InputNumber < 1)
					{
						System.out.println("ERROR: Invalid input, " + InputNumber + ". It must be a positive nonzero number.");
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

			
			
			//Sum of InputNumbers from 1 to InputNumber of user input			
			int number;
			int Sum = 0;
			for (number = 1; number <= InputNumber; number++)
			{
				Sum += number;
			}
		
			//Display
			System.out.printf("\nNumber: %d\n", InputNumber);
			System.out.print("The total of sum from 1..." + InputNumber + " is " + Sum +".");
		
			
			//Repeat?
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
			
		} while (true);
		
		keyboard.close();
	}
}
