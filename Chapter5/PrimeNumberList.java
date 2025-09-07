//Hung Anh Ho
//10-11-2022
//Prime number list

import java.util.Scanner;
import java.io.*;
public class PrimeNumberList
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			
			int choice = getMenu();
			
			if (choice == 1)
			{
				int number = Input.getInteger("	Enter your number to check: ", true);
				
				if(isPrime(number) == true)
					System.out.printf("	Number %s is a prime number.", number);
				
				else
					System.out.printf("	Number %s is not a prime number.", number);
			}
			
			else if (choice == 2)
			{
				writeFilePrime100();
			}
			
			else
				continue;
			
			do
			{
				System.out.print("\n	Continue (Y-yes or N-no)? ");
				Answer = keyboard.nextLine().toUpperCase().charAt(0);
						
				if (Answer == 'Y')
					break;
						
				else
				{
					if (Answer == 'N')
						break;
							
					else
						System.out.printf("\n	ERROR: invalid choice %s\n", Answer);
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
	 * getMenu method display the menu for selection and return user's choice
	 * @return choice-integer type
	 */
	public static int getMenu()
	{
		System.out.println("	Choose an option: ");
		System.out.println("	1. Enter a number to check if the number is a prime number: ");
		System.out.println("	2. Get a file that store all the prime numbers from 1 to 100.");
		
		do
		{
			int choice = Input.getInteger("	Enter your choice: ", true);
			if (choice == 1)
			{
				return choice;
			}
			
			else if (choice == 2)
			{
				return choice;
			}		
			else
			{
				System.out.println("	Error input.");
				continue;
			}
		} while (true);
	}
	
	
	/**
	 * isPrime method validate the number if it is a prime number return true, return false
	 * @param testNumber- variable to test for prime numbers-integer type
	 * @return true or false to verify.
	 */
	public static boolean isPrime(int testNumber)
    {
        // A prime number cannot be divided by a number greater than its square root
        int max = (int)Math.ceil(Math.sqrt(testNumber));

        if(testNumber < 1)
        	return false;
        
        //Number 1, 2, 3 are prime
        else if(testNumber < 4)
        	return true;
        
        else if(testNumber % 2 == 0) 
        	return false;  // all even numbers > 2 are not primes

        // All even numbers have been eliminated in the previous statement
        for(int i = 3; i <= max; i += 2)
        {
            if(testNumber % i == 0)
                return false;
        }

        return true;
    }
	
	
	/**
	 * writeFilePrime100 method get a user file name then open and write the prime numbers avaliable from 1 to 100 to file
	 * @throws IOException
	 */
	public static void writeFilePrime100() throws IOException
	{
		String fileName = Input.getString("	Enter a file name: ");
		
		FileWriter fWriter = new FileWriter(fileName);
		PrintWriter outputFile = new PrintWriter(fWriter);
		
		//Write prime numbers avaliable from 1 to 100
		outputFile.println("The prime numbers from 1 to 100:");
		for (int testNumber = 1; testNumber <= 100; testNumber++)
	    {
			//If the number is prime write it to the output file
			if( isPrime( testNumber ) == true)
			{
				outputFile.println(testNumber);
			}
	    }
		
		System.out.println("	The file of prime numbers have been generated.");
		outputFile.close();
	}
}
