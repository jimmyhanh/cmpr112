import java.util.ArrayList;
import java.util.Scanner;
public class ArrayOperations {

	public static void main(String[] args) 
	{
		ArrayList<Double> array = new ArrayList<Double>();
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			//Build the list by user
			System.out.println("Let's built your own list of numbers before get your options.");
			do
			{
				//Build the list by user
				array.add(Input.getDouble("Enter the number you want to add: "));
				
				do
				{
					System.out.print("\nContinue adding numbers (Y-yes or N-no(to proceed to the menu)? ");
					
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
			
			//Display menu
			do
			{
			int choice = getMenu();
			
			//Get variables
			double total = getTotal(array);
			double average = getAverage(array, total);
			double highest = getHighest(array);
			double lowest = getLowest(array);
			

				if (choice == 1)
				{
					System.out.printf("The total of your numbers: %.2f\n", total);
				}
				
				else if (choice == 2)
				{
					System.out.printf("The average of your numbers: %.2f\n", average);
				}
				
				else if (choice == 3)
				{
					System.out.printf("The highest among your numbers: %.2f\n", highest);
				}
				
				else if (choice == 4)
				{
					System.out.printf("The lowest among your numbers: %.2f\\n", lowest);
				}
				
				else if (choice == 5)
				{
					System.out.printf("\nThe total of your numbers: %.2f\n", total);
					System.out.printf("The average of your numbers: %.2f\n", average);
					System.out.printf("The highest among your numbers: %.2f\n", highest);
					System.out.printf("The lowest among your numbers: %.2f\n", lowest);
				}
				
				else if (choice == 0)
					return;
				
				else if (choice == 6)
					break;
				
				do
				{
					System.out.print("\nContinue with another option(Y-yes or N-no)? ");
					
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
				System.out.print("\nContinue adding numbers (Y-yes or N-no)? ");
				
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
	 * getMenu method display the options for the user and return the input-integer type
	 * @return choice - integer type
	 */
	public static int getMenu()
	{
		System.out.println("\nUser's menu:\n"
				+ "1. Get the total sum of the numbers you have put into the array.\n"
				+ "2. Get the average of the numbers you have put into the array.\n"
				+ "3. Get the highest number you have put into the array.\n"
				+ "4. Get the lowest number you have put into the array.\n"
				+ "5. Display all options above.\n"
				+ "6. Go back to add more numbers.\n"
				+ "0. Exit the program.\n");
		
		int choice = Input.getInteger("Enter your choice: ", 0,6);
		return choice;
	}
	
	/**
	 * getTotal method sum up all the numbers in the array list and return the total-double type
	 * @param array-double array list type
	 * @return total - double type
	 */
	public static double getTotal(ArrayList<Double> array)
	{
		double total = 0;
		for(double i : array)
		{
			total += i;
		}
		
		return total;
	}
	
	/**
	 * getAverage methodget the total and divide it by the number of items in the array list and return the average-double type
	 * @param array - double array list type
	 * @param total - double type
	 * @return average - double type
	 */
	public static double getAverage(ArrayList<Double> array, double total)
	{
		double average = total / (array.size());
		return average;
	}
	
	/**
	 * getHighest method check array numbers and return the highest number-double type
	 * @param array-double array list
	 * @return lowest number- double type
	 */
	public static double getHighest(ArrayList<Double> array)
	{
		double highest = array.get(0);
		for(int i = 1; i < array.size(); i++)
		{
			if(array.get(i) > highest)
				highest = array.get(i);
		}
		return highest;
	}
	
	/**
	 * getLowest method check array numbers and return the lowest number-double type
	 * @param array - double array list
	 * @return lowest number - double type
	 */
	public static double getLowest(ArrayList<Double> array)
	{
		double lowest = array.get(0);
		for(int i = 1; i < array.size(); i++)
		{
			if(array.get(i) < lowest)
				lowest = array.get(i);
		}
		return lowest;
	}
}
