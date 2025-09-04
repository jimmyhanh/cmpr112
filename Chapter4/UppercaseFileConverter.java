//Hung Anh Ho
//10-1-2022
//Uppercase file converter

import java.util.Scanner;
import java.io.*;
public class UppercaseFileConverter 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			//User's input for first file's name
			System.out.print("Enter the input file's name: ");
			String FileName_1 = keyboard.nextLine();
			
			//Open first file
			File File_1 = new File(FileName_1);
			
			//Check for first file existence
			while (!File_1.exists()) //Page 245
			 {
				 System.out.println("The file " + FileName_1 + " is not found.");
				 System.out.print("Enter the correct file name: ");
				 FileName_1 = keyboard.nextLine();
				 File_1 = new File(FileName_1);	 //Check file
			 }
			
			
			
			//User's input for second file's name
			System.out.print("Enter the output file's name:");
			String FileName_2 = keyboard.nextLine();
			
			//Open file number 2 to write
			FileWriter File_2 = new FileWriter(FileName_2);
			PrintWriter OutputFile = new PrintWriter(File_2);
			
			//Open file number 1 to copy
			Scanner InputFile = new Scanner(File_1);
			String line = null;
			
			line = InputFile.nextLine();
			
			while (InputFile.hasNext())
			{	
				//Read line from file one at a time
				line = InputFile.nextLine();
				line = line.toUpperCase();
				OutputFile.println(line);
			}
			
			System.out.printf("The contents in %s has been written to %s with uppercase.", FileName_1, FileName_2);
			InputFile.close();
			OutputFile.close();
		
			char Answer;
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
			}
			while (Answer != 'Y' || Answer != 'N');
							
								
			if (Answer == 'Y') 
				continue;
							
			else if (Answer == 'N')
				break;
							
			else
				continue;
					
		} while(true);	
	}
}
