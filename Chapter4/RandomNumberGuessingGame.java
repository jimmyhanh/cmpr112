//Hung Anh Ho
//9-26-2022
//Random number guessing game

import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuessingGame 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		char Answer;
		do
		{
			int GuessCount = 0;
			int RandomNumber = rand.nextInt(100)-1;
			
			int UserNumber;
			do
			{
				//User input for guessed number
				System.out.print("Enter your guessed number (1..100): ");
				GuessCount++;
				
				if (!keyboard.hasNextInt())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else //Check guess number with conditions
				{
					UserNumber = keyboard.nextInt();
					if (UserNumber > RandomNumber)
					{
						System.out.println("Your guessed number is too high. Try again.");
						keyboard.nextLine();
						continue;
					}
					
					else if (UserNumber < RandomNumber )
					{
						System.out.println("Your guessed number is too low. Try again.");
						keyboard.nextLine();
						continue;
					}
					
					else if (UserNumber == RandomNumber )
					{
						System.out.println("Congratulations! Your guess for number " + UserNumber + " is correct.");
						keyboard.nextLine();
						break;
					}
					
					else
					{
						System.out.println("Your guessed number is invalid. Try again.");
						keyboard.nextLine();
						continue;
					}
				}
				
			} while (true);
			
			
			
			//Repeat prompt
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
