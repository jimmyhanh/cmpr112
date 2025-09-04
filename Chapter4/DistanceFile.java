//Hung Anh Ho
//9-30-2022
//Distance traveled write to file

import java.util.Scanner;
import java.io.*;
public class DistanceFile 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			//User input for the speed of vehicle
			double speed;			
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
					speed = keyboard.nextDouble();
					if (speed < 0)
					{
						System.out.println("ERROR: Invalid input, " + speed + ". It must be a positive number.");
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
			int inputHours;
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
					inputHours = keyboard.nextInt();
					
					if (inputHours < 1)
					{
						System.out.println("ERROR: Invalid input, " + inputHours +". It must be a positive nonzero integer.");
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
			
			
			
			//Get a file name
			String FileName;
			System.out.print("Enter the file name: ");
			FileName = keyboard.nextLine();
			
			//Open a file
			FileWriter File = new FileWriter(FileName, true);		
			PrintWriter outputFile = new PrintWriter(File);
			
			
			//Write to file
			//Display header of output
			outputFile.println("Your speed is " + speed + "(mph) and have been traveled for " + inputHours);
			outputFile.println("The table of distance traveled base on your speed and hours traveled.");
			outputFile.println("\nHour		Distance traveled (Miles)");
			outputFile.println("------------------------------------");
			
			
			//Display the hours and distance traveled
			double distance;
			int hours;
			for (hours = 1; hours <= inputHours; hours++)
			{
				distance = speed * hours;
				outputFile.printf("%3d		%11.3f\n", hours, distance);
			}
		
				//Close file
				outputFile.close();
				System.out.print("Data have been written to file");
				
				
				
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
