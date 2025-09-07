//Hung Anh Ho
//10-12-2022
//Paint job estimator

import java.util.Scanner;
public class PaintJobEstimator 
{
	public static void main(String[] args)
	{
		int spaceFilled_perGallon = 115;
		double laborCost_perHour = 18.00;
		int hours_perGallon = 8;
		
		Scanner keyboard = new Scanner(System.in);
		 
		char Answer;
		do
		{
			//Get user input for the number of rooms
			int rooms = getRoomNumber();
			
			//Get the user input for the space of each room and return the total wall space
			double totalWallSpace = 0;
			for(int i = 1; i <= rooms; i++)
			{
				totalWallSpace += getWallSpace(i);
			}
			
			//Get the user's input for paint price per gallon
			double paintPrice_A_Gallon = getPaintPriceAGallon();
			
			//Assign calculated variables
			
			//Total gallons needed for required rooms
			double totalGallons = getTotalGallons(spaceFilled_perGallon, totalWallSpace);
			
			//Total hours to paint all required rooms
			double totalHours = getTotalHours(totalGallons, hours_perGallon);
			
			//Total of paint cost for all of gallons consumed
			double totalPaintCost = getTotalPaintCost(totalGallons, paintPrice_A_Gallon);
			
			//Total of labor cost for required hours to finish the paint job
			double totalLaborCost = getTotalLaborCost(totalHours, laborCost_perHour);
			
			//Total cost of paint cost and labor cost
			double totalCost = getTotalCost(totalPaintCost, totalLaborCost);
			
			//Display the calculations of each total costs for toatl gallons of paint, hours, labor, and overall cost
			displayData(rooms, totalWallSpace, paintPrice_A_Gallon, totalGallons, totalHours, totalPaintCost, totalLaborCost, totalCost);
			
			
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
	 * getRoomNumber method get user's input the number of room needed to paint-integer type
	 * @return rooms-integer type
	 */
	public static int getRoomNumber()
	{
		do
		{
			int rooms = Input.getInteger("Enter the the number of rooms to be painted: ", true);
			
			if(rooms < 1)
			{
				System.out.println("Error input. The number of room can not be less than 1.");
			}
			
			else 
				return rooms;
			
		} while(true);
	}
	
	/**
	 * getWallSpace method get user's input for square feet of wall space of each room-double type
	 * @param roomNumber-integer type- room numbering
	 * @return wallSpace-double type-for each room
	 */
	public static double getWallSpace(int roomNumber)
	{
		do
		{
			System.out.println("Room " + roomNumber);
			double wallSpace = Input.getDouble("Enter the square feet of wall space the room: ", true);
			
			if(wallSpace < 1.0)
			{
				System.out.println("Error input. The number of room can not be less than 1.");
				continue;
			}
			
			else 
				return wallSpace;
			
			
		} while(true);
	}

	/**
	 * getPaintPriceAGallon method get user's input for price of paint a gallon-double type
	 * @return paintPrice_A_Gallon-double type
	 */
	public static double getPaintPriceAGallon()
	{
		do
		{
			double paintPrice_A_Gallon = Input.getDouble("\nEnter the price of the paint per gallon: ", true);
			
			if(paintPrice_A_Gallon < 1.0)
			{
				System.out.println("Error input. The number of room can not be less than 1.");
			}
			
			else 
				return paintPrice_A_Gallon;
			
		} while(true);
	}
	
	/**
	 * getTotalGallons method calculate the total of gallons needed to fill the total wall space
	 * @param spaceFilled_perGallon-double type;
	 * @param totalWallSpace-double type
	 * @return totalGallons-double type
	 */
	public static double getTotalGallons(int spaceFilled_perGallon, double totalWallSpace)
	{
	
		double totalGallons = totalWallSpace / spaceFilled_perGallon;
		return totalGallons;
	}
		
	/**
	 * getTotalHours method calculate the total hours to paint all the wall space
	 * @param totalGallons-double type
	 * @param hours_perGallon-integer type
	 * @return totalHours-double type
	 */
	public static double getTotalHours(double totalGallons, int hours_perGallon)
	{
		double totalHours = totalGallons * hours_perGallon;
		return totalHours;
	}
	
	/**
	 * getTotalPaintCost method calculate the total cost of paint to fill all the rooms
	 * @param totalGallons-double type
	 * @param paintPrice_A_Gallon-double type
	 * @return totalPaintCost-double type
	 */
	public static double getTotalPaintCost(double totalGallons, double paintPrice_A_Gallon)
	{
		double totalPaintCost = totalGallons * paintPrice_A_Gallon;
		return totalPaintCost;
	}
	
	/**
	 * getTotalLaborCost calculate the total labor cost to finish the paint job
	 * @param totalHours-double type
	 * @param laborCost_perHour-double type
	 * @return totalLaborCost-double type
	 */
	public static double getTotalLaborCost(double totalHours, double laborCost_perHour)
	{
		double totalLaborCost = totalHours * laborCost_perHour;
		return totalLaborCost;
	}
	
	/**
	 * getTotalCost method combine all the cost of labor and paint
	 * @param totalPaintCost-double type
	 * @param totalLaborCost-double type
	 * @return totalCost-double type
	 */
	public static double getTotalCost(double totalPaintCost, double totalLaborCost)
	{
		double totalCost = totalPaintCost + totalLaborCost;
		return totalCost;
	}

	/**
	 * displayData void method display the input of user for number of rooms, total wall space, paint price per gallon, 
	 * and output for total of gallons, labor cost, hours, paint cost, and overall cost required to finish the job
	 * @param rooms-integer type
	 * @param wallSpace-double type
	 * @param paintPrice_A_Gallon-double type
	 * @param totalGallons-double type
	 * @param totalHours-double type
	 * @param totalPaintCost-double type
	 * @param totalLaborCost-double type
	 * @param totalCost-double type
	 */
	public static void displayData(int rooms, double wallSpace, double paintPrice_A_Gallon, double totalGallons, double totalHours, double totalPaintCost, double totalLaborCost, double totalCost)
	{
		System.out.printf("\nTo paint %d of rooms and a total of %.2f spare feet of wall space with a gallon of paint costs $%.2f:\n", rooms, wallSpace, paintPrice_A_Gallon);
		System.out.printf("\nThe number of gallons of paint required:		%.2f (gallons)\n", totalGallons);
		System.out.printf("The hours of labor required:				%.2f (hours)\n", totalHours);
		System.out.printf("The total cost of paint:				$%.2f\n", totalPaintCost);
		System.out.printf("the total cost for labor:				$%.2f\n", totalLaborCost);
		System.out.printf("\nThe total cost of the paint job:			$%.2f\n", totalCost);
	}
}
