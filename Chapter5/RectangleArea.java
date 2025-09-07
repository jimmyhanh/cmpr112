//Hung Anh Ho
//10-7-2022
//Retangle area

import java.util.Scanner;
public class RectangleArea 
{
	
		public static void main(String[] args)
		{	
			Scanner keyboard = new Scanner(System.in);
						 
			char Answer;
			do
			{
				// Get the rectangle's length from the user.
				double length = getLength(0);
				
				// Get the rectangle's width from the user.
				double width = getWidth(0);
				
				// Get the rectangle's area.
				double area = getArea(length, width);
				
				// Display the rectangle data.
				displayData(length, width, area);
				
				
				
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
		 * This getLength method asks and gets input for the length of the retangle and use getDouble method to validates input for double type
		 * @param length - variable hold the number for the length of the rectangle
		 * @return valid double value for length
		 */
		public static double getLength(double length)
		{
			Scanner keyboard = new Scanner(System.in);
			length = Input.getDouble("\nEnter the rectangle's length: ", true);
			return length;
		}
		
		
		
		/**
		 * This getWidth method asks and gets input for the length of the retangle and use getDouble method to validates input for double type
		 * @param width - variable hold the number for the width of the rectangle
		 * @return valid double value for width
		 */
		public static double getWidth(double width)
		{
			Scanner keyboard = new Scanner(System.in);
			width = Input.getDouble("\nEnter the rectangle's width: ", true);
			return width;
		}
		
		
		
		/**
		 * This getArea method gets the length and width given from the validated input and calculates the retangle's area
		 * area = length * width
		 * @param length - variable hold the length's number with double type
		 * @param width - variable hold the width's number with double type
		 * @return area of rectangle with double type
		 */
		public static double getArea(double length, double width)
		{
			return length * width;
		}
		
		
		
		/**
		 * This displyData method display the validated data inputs of width and length and calculated area of the retangle
		 * @param length - variable hold the length's number with double type
		 * @param width - variable hold the width's number with double type
		 * @param area - variable hold calculated area of the rectangle with double type
		 * @return print the diplay show off the data collected with the calculated area of the rectangle
		 */
		public static void displayData(double length, double width, double area)
		{
			System.out.printf("\nWith the length of %.2f and the width of %.2f, the area of the rectangle is %.2f", length, width, area);
		}
		
}
