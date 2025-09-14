//Hung Anh Ho
//10-31-2022;
//Word counter

import java.util.Scanner;
import java.io.*;
public class WordCounterFile
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		char Answer;
		do
		{
			System.out.println("Word count from a file\n======================");
			String input = Input.getString("\nEnter a file name to start(test.txt): ");
			int count = wordCount(input);
			System.out.printf("\nNumber of words: %d\n", count);
		
			do
			{
				System.out.print("\n	Continue (Y-yes or N-no)? \n");
				Answer = keyboard.nextLine().toUpperCase().charAt(0);
					
				if (Answer == 'Y')
				{
					break;
				}
					
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
			{
				continue;
			}
				
			else if (Answer == 'N')
				break;
				
			else
				continue;
			
		}while (true);
	}

	/**
	 * wordCOunt method get the input file, read, tokenize line by lines, count the words and return the word count-integer type
	 * @param input-String type
	 * @return word count-integer type
	 * @throws IOException 
	 */
	public static int wordCount(String input) throws IOException
	{
		//Open first file
		File File = new File(input);
		
		//Check for first file existence
		while (File.exists()== false) //Page 245
		{
			System.out.println("The file "+ input + " is not found.");		 
			input = Input.getString("Enter the correct file name: ");
	 
			File = new File(input);	 //Check file
		}
		
		Scanner text = new Scanner(File);
		
		//Read file					
		String line = text.nextLine();
		
		int count = 0;
		while (text.hasNext())
		{	
			String list[] = line.split(" ");
			count = count + list.length;
			line = text.nextLine();
		}
		
		text.close();
		
		return count;
	}
}


