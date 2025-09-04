//Hung Anh Ho
//10-1-2022
//Personal webpage generator

import java.util.Scanner;
import java.io.*;
public class PersonalWebPageGenerator 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{		
			//User's input file name
			String HTML_File;
			System.out.print("Enter a HTML file name: ");
			HTML_File = keyboard.nextLine();
			
			//Check for blank
			while (HTML_File == null || HTML_File.length()== 0)
			{
				System.out.println("Error! You cannot leave your file name blank.");
				System.out.print("Re-enter a HTML file name: ");
				HTML_File = keyboard.nextLine();
			}
			
			
			//User's input name
			String UserName;
			do
			{
				//User input
				System.out.print("Enter your name: ");
				
				if (!keyboard.hasNextLine())
				{
					System.out.println("ERROR: invalid input. Please re-enter.");
					keyboard.next();
					continue;
				}
				
				else
				{
					UserName = keyboard.nextLine();
					if (UserName == null || UserName.length()== 0) //Check for blank
					{
						System.out.println("Error! You cannot leave your name blank.");
						System.out.println("ERROR: Invalid input, " + UserName + ". It must be a positive number.");
						continue;
					}
					
					else
					{
						break;
					}
				}
				
			} while (true);
			
			
			
			//User input description
			String UserDescription;
			System.out.print("Enter your description: ");
			UserDescription = keyboard.nextLine();
			
			//Check for blank
			while (UserDescription == null || UserDescription.length()== 0)
			{
				System.out.println("Error! You cannot leave your description blank.");
				System.out.print("Enter your description again: ");
				UserDescription = keyboard.nextLine();
			}
			
			
			
			//Open file to write
			FileWriter File = new FileWriter(HTML_File);
			PrintWriter OutputFile = new PrintWriter(File);
			
			//Write HTML codes and contents to file
			OutputFile.printf("<html>\n<head>\n</head>\n<body>\n	<center>\n");
			OutputFile.printf("	   <h1>%s</h1>\n",UserName);
			OutputFile.printf("	</center>\n	<hr />\n	%s\n	<hr /> \n </body>%n</html>\n", UserDescription);
			
			//Close file to save
			OutputFile.close();
			System.out.println("Your web page HTML has been created. Use a text editor to view the file content.");
			
			
			
			//Repeat?
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
