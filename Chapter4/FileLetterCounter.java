//Hung Anh Ho
//9-26-2022
//File letter counter

import java.util.Scanner;
import java.io.*;
public class FileLetterCounter 
{
	public static void main(String[] args) throws IOException 
	{
		 Scanner keyboard = new Scanner(System.in);
		 
		 char Answer;
		 do
		 {
			 //User's input for filename
			 String FileName;
			 System.out.print("Enter the file's name: ");
			 FileName = keyboard.nextLine();
			 
			 //Open the file
			 File File = new File(FileName);
			 
			 while (!File.exists()) //Page 245
			 {
				 System.out.println("The file " + FileName + " is not found.");
				 System.out.print("Enter the correct file name: ");
				 FileName = keyboard.nextLine();
				 File = new File(FileName);		//Check file	 
			 }
			 
			 
			 
			 do //Check if user want to enter a diffrent character to count in the same file
			 {
				 //Scanner object to open file
				 Scanner InputFile = new Scanner(File);
			 
				 //User's input the character to count
				 System.out.print("Enter a single character to count: ");
				 String InputCharacter = keyboard.nextLine();
				 char UserCharacter = InputCharacter.charAt(0);
				 
				 
				 //Variable that store lines of the text
				 String line;
				 //Variable to store the number the character repeats
				 int Count = 0;
				 
				 
				 //Loop to check and calculate the number of times the character appears
				 while (InputFile.hasNext())
				 {	
					//Read line from file one at a time
					line  = InputFile.nextLine();
							
					for (int i = 0; i < line.length(); i++)
					{					
						if (line.charAt(i) == UserCharacter)
						{
							Count++;
						}
					}
				 }
		
				 
				 //Print out the result
				 System.out.println("The character '" + UserCharacter + "' appears " + Count + " times in " + FileName + ".");
				 
				 //Close file
				 InputFile.close();
				 
				 
				 //Continue to count another character with same file
				 do
				 {
					 System.out.print("\nContinue to count another character with the same file (Y-yes or N-no)? ");
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
				 

			 
			 do
			 {
				System.out.print("\nContinue to open another file (Y-yes or N-no)? ");
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
