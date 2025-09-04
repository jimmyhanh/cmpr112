//Hung Anh Ho
//9-26-2022
//Spare display with X

import java.util.Scanner;
public class SquareDisplay 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			int UserNumber = 0;
			do
			{
				System.out.print("Enter a positive number (1...15): ");
				
				if (!keyboard.hasNextInt())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else
				{
					UserNumber = keyboard.nextInt();
					if(UserNumber < 1 || UserNumber > 15)
					{
						System.out.println("Your number " + UserNumber + " is invalid.");
						continue;
					}
					
					else
					{
						keyboard.nextLine();
						break;
					}
				}
				
			} while(true);
			
			
			//Space between the input and the answers
			System.out.println();
			
			//Draw the rows
			String Draw = "X";
			for (int i = 0; i <= UserNumber; i++)
			{
				//Draw the columns
				for (int j = 0; j <= UserNumber; j++)
				{
					System.out.print(Draw);
				}
				System.out.println();
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
}
