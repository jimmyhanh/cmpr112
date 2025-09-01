//Hung Anh Ho
//9-15-2022
//Mobile service provider part 2
import java.util.Scanner;
public class MobileServiceProviderP2 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User's input for package letter
		String Package;
		System.out.print("Enter the key letter of your package(A, B, or C): ");
		Package = keyboard.nextLine();
		
		//Input for minutes used	
		int Minutes;
		System.out.print("Enter the number of minutes were used: ");
		Minutes = keyboard.nextInt();
		keyboard.nextLine();

			
		//Costs for package A
		double PackageCostA = 39.99;
		int PackageA_Minutes = 450;
		double AdditionalMinuteCostA = 0.45;
		double AdditionalCostA = 0;
		double TotalCostA;
		
		if(Minutes > PackageA_Minutes)
		{
		AdditionalCostA = (Minutes - PackageA_Minutes) * AdditionalMinuteCostA;						
		}
		
		TotalCostA = PackageCostA + AdditionalCostA;
		
		
		//Costs for package B
		double PackageCostB = 59.99;
		int PackageB_Minutes = 900;
		double AdditionalMinuteCostB = 0.4;
		double AdditionalCostB = 0;
		double TotalCostB;
		
		if(Minutes > PackageB_Minutes)
		{
		AdditionalCostB = (Minutes - PackageB_Minutes) * AdditionalMinuteCostB;
		}
		TotalCostB = PackageCostB + AdditionalCostB;
		
			
		//Costs for package C
		double PackageCostC = 69.99;	
		double TotalCostC;
		
		TotalCostC = PackageCostC;
		
			
		//Package sort
		double PackageSavingsA = 0;
		double PackageSavingsB = 0;
		double PackageSavingsC = 0;
		
		switch(Package)
		{
			case "A":
			{
			PackageSavingsA = TotalCostA;
			PackageSavingsB = TotalCostB - TotalCostA;
			PackageSavingsC = TotalCostC - TotalCostA;
			break;
			}
			
			case "B":
			{
			PackageSavingsA = TotalCostA - TotalCostB;
			PackageSavingsB = TotalCostB;
			PackageSavingsC = TotalCostC - TotalCostB;
			break;
			}
				
			case "C":
			{
			PackageSavingsA = TotalCostA - TotalCostC;
			PackageSavingsB = TotalCostB - TotalCostC;
			PackageSavingsC = TotalCostC;
			break;
			}
				
			default:
			{
			System.out.println("Error! Invalid input. Terminating the program.");
			return;
			}
		}
			
			
		//Display
		System.out.printf("%-11s %-11s %-14s\n", "Package A", "Package B", "Package C");
		System.out.printf("$%-10.2f $%-10.2f $%-10.2f\n", TotalCostA, TotalCostB, TotalCostC);
		System.out.printf("$%-10.2f $%-10.2f $%-10.2f  with saving.\n", PackageSavingsA, PackageSavingsB, PackageSavingsC);
	}		
}

