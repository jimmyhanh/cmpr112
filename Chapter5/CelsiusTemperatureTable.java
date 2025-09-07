//Hung Anh Ho
//10-10-2022
//Celsius temperature table

import java.util.Scanner;
public class CelsiusTemperatureTable 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			System.out.println("Fahrenheit to Celsius table");
			System.out.println("==================================");
			System.out.println("Fahrenheit(F)		Clesius(C)");
			
			for (double f = 0; f <= 20; f++)
				System.out.printf("%.2f\t\t\t%.2f\n", f, getCelsius(f));
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
	 * getCelsius method calculates the celsius by using the F input-double type
	 * @param F - double value
	 * @return converted celsius-double type
	 */
	public static double getCelsius(double F)
	{
		return 5.0 / 9 * (F - 32);
	}
}