//Hung Anh Ho
//9-26-2022
//Celsius to Fahrenheit table

import java.util.Scanner;
public class CelsiusToFahrenheitTable 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			System.out.println("Celsius to Fahrenheit table");
			System.out.println("==================================");
			System.out.println("Clesius(C)	Fahrenheit(F)");
			int Fahrenheit;
			int Celsius; 
			for(Celsius = 0; Celsius <= 20; Celsius++)
			{
				Fahrenheit = (9/5)*Celsius + 32;
				System.out.printf("%2d		%2d\n",Celsius ,Fahrenheit);
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
