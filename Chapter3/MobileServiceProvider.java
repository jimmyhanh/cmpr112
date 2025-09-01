//Hung Anh Ho
//9-15-2022
//Mobile service provider
import java.util.Scanner;
public class MobileServiceProvider 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User's input for package letter
		String Package;
		System.out.print("Enter the key letter of your package(A, B, or C): ");
		Package = keyboard.nextLine();
		
		
		//User's input for minutes used
		int Minutes;
		System.out.print("Enter the number of minutes were used: ");
		Minutes = keyboard.nextInt();
		keyboard.nextLine();
		
		
		//Package sort
		double PackageCost;
		int Package_Minutes = 0;
		double AdditionalCost = 0;
		double AdditionalMinuteCostA = 0.45;
		double AdditionalMinuteCostB = 0.40;
		
		
		switch(Package)
		{
			case "A":
			{
				PackageCost = 39.99;
				Package_Minutes = 450;
					if(Minutes > Package_Minutes)
					{
						AdditionalCost = (Minutes - Package_Minutes) * AdditionalMinuteCostA;
					}
				break;
			}
			
			case "B":
			{
				PackageCost = 59.99;
				Package_Minutes = 900;
					if(Minutes > Package_Minutes)
					{
						AdditionalCost = (Minutes - Package_Minutes) * AdditionalMinuteCostB;
					}
				break;
			}
			
			case "C":
			{
				PackageCost = 69.99;
				AdditionalCost = 0;
				break;
			}
			
			default:
			{
				System.out.println("Error! Invalid input. Terminating the program.");
				return;
			}
		}
		
		//Total cost
		double TotalCost;
		TotalCost = PackageCost + AdditionalCost;
		
		//Display
		System.out.println("You are using package " + Package + " and used " + Minutes + " minute(s).");
		System.out.printf("Your total charge is $%.2f.\n", TotalCost);
	}
}
