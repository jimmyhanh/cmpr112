//Hung Anh Ho
//10-27-2022
//CHarge
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ChargeAccountModification 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Integer> ChargeAccountNumbers = new ArrayList<Integer>();
		getAccountNumbers(ChargeAccountNumbers);
		
		char Answer;
		do
		{
			// get the number from the user
			//System.out.println(ChargeAccountNumbers);//Check for added numbers
			int number = Input.getInteger("Enter account number (7 digits): ", true);
			
			// check to see if the number is valid
			if (ChargeAccountNumbers.contains(number)) 
			{
				System.out.println("Account detected.");
			}
			
			else 
			{
				System.out.println("That number is invalid.");
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
	
	/**
	 * getAccountNumbers method read a file, add the account numbers to the list and return the list-ArrayList Integer type
	 * @param ChargeAccountNumbers-ArrayList Integer type
	 * @return ChargeAccountNumbers-ArrayList Integer type
	 * @throws FileNotFoundException 
	 */
	public static ArrayList<Integer> getAccountNumbers(ArrayList<Integer> ChargeAccountNumbers) throws IOException
	{
		String fileName = Input.getString("Enter a file to read (AccountNumbers or Accounts): ");
		File File = new File(fileName + ".txt");
		
		//Check for first file existence
		while (!File.exists())
		{
			 System.out.println("The file " + fileName + " is not found.");		 
			 fileName = Input.getString("Enter the correct file name: ");
			 
			 File = new File(fileName);	 //Check file
		}
		
		//Read file for numbers using Scanner
		Scanner numbers = new Scanner(File);
		int line = numbers.nextInt();
		while(numbers.hasNext())
		{
			if(numbers.hasNextInt())
			{
				//Add numbers to array list
				ChargeAccountNumbers.add(line);
				line = numbers.nextInt();
			}
			else
				line = numbers.nextInt();
		}
		numbers.close();
		
		return ChargeAccountNumbers;
	}
}
