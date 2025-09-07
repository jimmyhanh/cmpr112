//Hung Anh Ho
//10-11-2022
//Conversion program

import java.util.Scanner;
public class ConversionProgram 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
        double distanceMeters = Input.getDouble("Enter the distance in meters: ", true);
        
        do
	    {
        	char Answer;
			do
			{
	    		int choice = 0;
		        choice = userMenu();
		
		        if (choice == 1)
		            showKilometers(distanceMeters);
		        
		        else if(choice == 2)
		            showInches(distanceMeters);
		        
		        else if (choice == 3)
		            showFeet(distanceMeters);
		        
		        else if(choice == 4)
		        {
		            System.out.println("Program terminated.");
		        	return;
		        }
		        else
		            System.out.println("\nERROR - Invalid option.\nPlease try again!");
		        
		        
		        
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
	
	    } while (true);

	}
	
	
	/**
	 * userMenu method let the user choose what conversion path the program will take as a number-integer type
	 * @return choice-value integer type
	 */
	public static int userMenu()
	{
		int choice = 0;
		System.out.println("\nSelect convert path: "
							+ "\n========================"
							+ "+\n1. Convert to kilometers"
							+ "\n2. Convert to inches"
							+"\n3. Convert to feet"
							+"\n4. Quit the program");
		choice = Input.getInteger("Enter your choice: ", true);
		return choice;
	}


	/**
	 * showKilometers method convert meters input to kilometers-double type. Then, it display the results.
	 * @param distanceMeters-value double type
	 * @param kilometers-value double type
	 * Display the results meteres converted to kilometers
	 */
	public static void showKilometers(double distanceMeters)
	{
	    double kilometers = distanceMeters * 0.001;
	    System.out.printf("%.2f meters is %.2f kilometers.", distanceMeters, kilometers);
	}

	/**
	 * showInches method convert meters input to inches-double type. Then, it display the results.
	 * @param distanceMeters-value double type
	 * @param inches-value double type
	 * Display the results meteres converted to inches
	 */
	public static void showInches(double distanceMeters)
	{
	    double inches = distanceMeters * 39.37;
	    System.out.printf("%.2f meters is %.2f inches.", distanceMeters, inches);
	}

	/**
	 * showInches method convert meters input to feet-double type. Then, it display the results.
	 * @param distanceMeters-value double type
	 * @param feet-value double type
	 * Display the results meteres converted to feet
	 */
	public static void showFeet(double distanceMeters)
	{
	    double feet = distanceMeters * 3.281;
	    System.out.printf("%.2f meters is %.2f inches.", distanceMeters, feet);
	}
}
