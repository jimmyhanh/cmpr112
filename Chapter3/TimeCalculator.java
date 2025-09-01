//Hung Anh Ho
//9-15-2022
//Time calculator
import java.util.Scanner;
public class TimeCalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Seconds input
		double seconds;
		System.out.print("Enter the number of seconds: ");
		seconds = keyboard.nextInt();
		keyboard.nextLine();
		
		//Variables
		double minutes;
		double hours;
		double days;
		
		//Seconds conversion
		if (seconds >= 60 && seconds < 3600)
			{
			minutes = seconds / 60;
			System.out.printf("%.1f seconds is equal to %.2f minute(s).", seconds, minutes);
			}
		else if (seconds >= 3600 && seconds < 86400)
			{
			hours = seconds / 3600;
			System.out.printf("%.1f seconds is equal to %.2f hour(s).", seconds, hours);
			}
		else if (seconds >= 86400)
			{
			days = seconds / 86400;
			System.out.printf("%.1f seconds is equal to %.2f day(s).", seconds, days);
			}
		else
			System.out.println("Error! Invalid input. Terminating the program.");
	}
}
