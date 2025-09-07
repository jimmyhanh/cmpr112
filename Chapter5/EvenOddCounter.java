//Hung Anh Ho
//10-13-2022
//Even odd number counter

import java.util.Scanner;
import java.util.Random;
public class EvenOddCounter 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		 
		char Answer;
		do
		{	
			int countEven = 0;
			int countOdd = 0;
			
			//Generate random number 100 times and check for odd or even numbers
			for (int i = 1; i <= 100; i++)
			{
				int number = randomNumber();
	
				if (number == 0)
				{
					System.out.printf("%d is not an even or odd number\n", number);
				}
				
				else if (isEven(number) == true)
				{
					System.out.printf("%d is an even number\n", number);
					countEven += 1;
				}
				
				else if (isEven(number) == false)
				{
					System.out.printf("%d is an odd number\n", number);
					countOdd += 1;
				}
				
			}
			
			// Dipslay total numbers of even and odd number
			countEvenOrOdd(countEven, countOdd);
		
			
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
	 * randomNumber method generate random numbers-integer type
	 * @return number -random number, integer type
	 */
	public static int randomNumber()
	{
		Random rand = new Random();
		int number = rand.nextInt();
		return number;
	}
	
	/**
	 * isEven method check input number to be even (return true) or odd (return false)
	 * @param number-hold input number(integer type)
	 * @return true or false-boolean type
	 */
	public static boolean isEven(int number)
	{
		if ((number % 2) == 0)
			return true;
		
		else
			return false;
	}
	
	/**
	 * countEvenOrOdd void method display the total number accumulated of even and odd numbers
	 * @param countEven-hold total count of even numbers(integer type)
	 * @param countOdd-hold total count of even numbers(integer type)
	 */
	public static void countEvenOrOdd(int countEven, int countOdd)
	{
		System.out.println("\nThere are " + countEven + " even numbers.");
		System.out.println("There are " + countOdd + " odd numbers.");
	}
}
