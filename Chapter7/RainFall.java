//Hung Anh Ho
//10-26-2022
//Rain fall

import java.util.Scanner;
import java.util.ArrayList;
public class RainFall 
{
	//Array for months of the year
	static String monthName[] = {"Unknown", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		 
		char Answer;
		do
		{
		    // Array representing rainfall figures
		    // position correlates to the month
			ArrayList<Double> thisYear = new ArrayList<Double>();
			//Get input for rain each month
			thisYear = getMonthlyRainFall(monthName, thisYear);
		
			//Get total, average, least rain month, and most rain month
			double total = getTotalRain(thisYear);
			double average = getAverageRain(total);
			String mostRain = monthName[getMostRain(thisYear)];
			String leastRain = monthName[getLeastRain(thisYear)];
			
			//Display
			System.out.printf("\nThe total rain this year is %.2f", total);
			System.out.printf("\nThe average rain this year is %.2f", average);
			System.out.printf("\nThe month with most rain this year is %s", mostRain);
			System.out.printf("\nThe month with least rain this year is %s\n", leastRain);
		
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
	 * getAverageRain method get total divide for the months number of year and get the average rain-double type
	 * @param total-double type
	 * @return average-double type
	 */	
	public static double getAverageRain(double total)
	{
		double average = total / 12;
		return average;
	}
	
	/**
	 * getTotalRain method take the items from the input list and sum the total from the item list 
	 * and return the total-double type
	 * @param thisYear-double type
	 * @return total-double type
	 */
	public static double getTotalRain(ArrayList<Double> thisYear)
	{
		double total = 0;
		for(double i : thisYear)
		{
			total = total + i;
		}
		
		return total;
	}
	
	/**
	 * getMonthlyRainFall method ask the user to input and put the rain number in inches of each month
	 * and save it in to the array list and return it-ArrayList Double type
	 * @param monthName-array string type
	 * @param thisYear-ArrayList Double-type
	 * @return thisYear-ArrayList Double-type
	 */
	public static ArrayList<Double> getMonthlyRainFall(String[] monthName, ArrayList<Double> thisYear)
	{
		
		for(int i = 1; i < monthName.length; i++)
		{
			double input = Input.getDouble("Enter the amount of rain for " + monthName[i] + " this year: ", true);
			thisYear.add(input);
		}
		
		return thisYear;
	}

	/**
	 * getMostRain method get the month with the least rain and return the month number-integer type
	 * @param thisYear-double type
	 * @return month number- integer type
	 */
	public static int getMostRain(ArrayList<Double> thisYear)
	{
		double highest = thisYear.get(0);
		
	    // Find the element with the highest value.		

			int m = 0;
		    for (int i = 1; i < thisYear.size(); i++)
		    {
		        if (thisYear.get(i) > highest)
		        {
		            highest = thisYear.get(i);
		            m = i;
		        }
		    }
		    
		    return m + 1;

	}
	
	/**
	 * getLeastRain method get the month with the least rain and return the month number-integer type
	 * @param thisYear-double type
	 * @return month number- integer type
	 */
	public static int getLeastRain(ArrayList<Double> thisYear)
	{
		double least = thisYear.get(0);
		
	    // Find the element with the lowest value.

			int m = 0;
		    for (int i = 1; i < thisYear.size(); i++)
		    {
		        if (thisYear.get(i) < least)
		        {
		            least = thisYear.get(i);
		        	m = i;
		        }
		    }
		    
	    	return m + 1;
	}
}
