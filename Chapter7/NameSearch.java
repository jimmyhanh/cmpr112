//Hung Anh Ho
//10-28-2022
//Name search

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class NameSearch 
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> boyNames = new ArrayList<String>();
		ArrayList<String> girlNames = new ArrayList<String>();
		
		//Add names from text to the list
		boyNames = getBoyNames(boyNames);
		girlNames = getGirlNames(girlNames);
		
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		char Answer;
		do
		{
			int choice = getMenu();
			if (choice == 1)
			{
				name = Input.getString("Enter the boy's name to check: ");
				nameSearch(name, boyNames, girlNames);
			}
			
			else if (choice == 2)
			{
				name = Input.getString("Enter the girl's name to check: ");
				nameSearch(name, boyNames, girlNames);
			}
			
			else if (choice == 3)
			{
				name = Input.getString("Enter the name to check: ");
				nameSearch(name, boyNames, girlNames);
			}
			else if (choice == 0)
				return;
			
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
	 * getMenu method ask user to choose one of the options and return the chosen choice-int type
	 * @return choice- integer type
	 */
	public static int getMenu()
	{
		System.out.println("\nUser's menu:\n"
				+ "1. Check a boy's first name if it is most popular during 2000-2009.\n"
				+ "2. Check a girls's first name if it is most popular during 2000-2009.\n"
				+ "3. Check a first name if it is popular among girl and boys during 2000-2009.\n"
				+ "0. Exit the program.\n");
		
		int choice = Input.getInteger("Enter your choice: ", 0,3);
		return choice;
	}
	
	/**
	 * getBoyNames method read the text file for boy names, add names to the list and return the list-String type
	 * @param boyNames-String array list type
	 * @return boyNames-String array list type
	 * @throws IOException
	 */
	public static ArrayList<String> getBoyNames(ArrayList<String> boyNames) throws IOException
	{
		String fileName = Input.getString("Enter file for boy names(BoyNames.txt): ");
		File file = new File(fileName);
		
		while(!file.exists())
		{
			System.out.println("Error input. Try again.");
			fileName = Input.getString("Enter file for boy names(BoyNames.txt): ");
			file = new File(fileName);
		}
		
		Scanner text = new Scanner(file);
		
		String line = text.nextLine();
		
		while(text.hasNext())
		{
			boyNames.add(line);
			line = text.nextLine();
		}
		text.close();
		
		return boyNames;		
	}
	
	/**
	 * getGirlNames method read the text file for girl names, add names to the list and return the list-String type
	 * @param boyNames-String array list type
	 * @return boyNames-String array list type
	 * @throws IOException
	 */
	public static ArrayList<String> getGirlNames(ArrayList<String> girlNames) throws IOException
	{
		String fileName = Input.getString("Enter file for girl names(GirlNames.txt): ");
		File file = new File(fileName);
		
		while(!file.exists())
		{
			System.out.println("Error input. Try again.");
			fileName = Input.getString("Enter file for boy names(GirlNames.txt): ");
			file = new File(fileName);
		}
		
		Scanner text = new Scanner(file);
		
		String line = text.nextLine();
		
		while(text.hasNext())
		{
			girlNames.add(line);
			line = text.nextLine();
		}
		text.close();
		
		return girlNames;		
	}
	
	/**
	 * nameSearch void method check name input in the arrays and display depend if is true(popular) or false(not popular)
	 * @param name-String type
	 * @param boyNames-String type
	 * @param girlNames-String type
	 */
	public static void nameSearch(String name, ArrayList<String> boyNames, ArrayList<String> girlNames)
	{
		if(boyNames.contains(name))
		{
			System.out.println("The name " + name + " was popular among the boys(2000-2009).");
		}
		else if(girlNames.contains(name))
		{
			System.out.println("The name " + name + " was popular among the girls(2000-2009).");
		}
		else
			System.out.println("The name " + name + " was not popular during 2000-2009.");
	}
}
