//Hung Anh Ho
//9-14-2022
//Magic dates
import java.util.Scanner;
public class MagicDates 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Month input
		int month = 0;
		System.out.print("Enter the month(1..12): ");
		month = keyboard.nextInt();
		keyboard.nextLine();
		if(month < 1 || month > 12)
		{
			System.out.println("ERROR: The month entered is out of range(1..12). Terminate the program");
			return;
		}
		
		
		//Day input
		int day = 0;
		System.out.print("Enter the day(1..31): ");
		day = keyboard.nextInt();
		keyboard.nextLine();
		if(day < 1 || month > 31)
		{
			System.out.println("ERROR: The day entered is out of range(1..31). Terminate the program");
			return;
		}
		
		
		//Year input
		int year = 0;
		System.out.print("Enter the year(2 digits): ");
		year = keyboard.nextInt();
		keyboard.nextLine();
		if (year < 1 || year > 99)
		{
			System.out.println("ERROR: The year is out of range of 2 digits or invalid. Terminate the program");
			return;	
		}
		
		
		//Magic or not magic
		if(month * day == year)
		{
			System.out.printf("It is a magic day (%02d/%02d/%02d).\n", month, day, year);
		}
		else
			System.out.printf("It is not a magic day (%02d/%02d/%02d).\n", month, day, year);
		
	}
}
