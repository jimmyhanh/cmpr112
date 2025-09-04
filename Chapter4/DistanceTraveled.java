//Hung Anh Ho
//9-26-2022
//Distance traveled

import java.util.Scanner;
public class DistanceTraveled 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			double Speed = 0;
			do
			{
				//User input for the speed of vehicle
				System.out.print("Enter a positive value for the speed of a vehicle (in miles-per-hour): ");
				
				if (!keyboard.hasNextDouble())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else
				{
					Speed = keyboard.nextDouble();
					if (Speed < 0)
					{
						System.out.println("ERROR: Invalid input, " + Speed + ". It must be a positive number.");
						keyboard.nextLine();
						continue;
					}
					
					else
					{
						keyboard.nextLine();
						break;
					}
				}
				
			} while (true);
			
		
		
			
			//User input for hours the vehicle operated
			int InputHours;
			do
			{
				System.out.print("Enter a positive nonzero value for the hours of the vehicle traveled: ");
				
				if (!keyboard.hasNextInt())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else //Validate for nonzero integer input
				{
					InputHours = keyboard.nextInt();
					
					if (InputHours < 1)
					{
						System.out.println("ERROR: Invalid input, " + InputHours +". It must be a positive nonzero integer.");
						System.out.print("Re-enter a positive nonzero integer: ");
						keyboard.next();
						continue;
					}
					
					else
					{
						keyboard.nextLine();
						break;// get out from the looping
					}
				}
				
			} while (true);
			
			
		
			//Display header of output
			System.out.println("\nHour		Distance traveled (Miles)");
			System.out.println("------------------------------------");
			
			//Display the hours and distance traveled
			double Distance;
			int hours;
			for (hours = 1; hours <= InputHours; hours++)
			{
				Distance = Speed * hours;
				System.out.printf("%3d		%11.3f\n", hours, Distance);
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
