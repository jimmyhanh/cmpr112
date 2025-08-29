// Hung Anh Ho
// 9-4-2022
// Personal information
import java.util.Scanner;
public class PersonalInformation 
{
		public static void main(String[] arg)
		{
			try (Scanner keyboard = new Scanner(System.in)) 
			// experimenting "try" and {} to close and stop message error
			{
			//User's input
			System.out.print("What is your name?");
			String name = keyboard.nextLine();
			
			System.out.print("What is your address?");
			String address = keyboard.nextLine();
			
			System.out.print("What is your phone number?");
			String phone = keyboard.nextLine();
			
			System.out.print("What is your college major?");
			String major = keyboard.nextLine();
			
			//Display
			System.out.println("My name is " + name + "\n" +
                    			"My address is " + address + "\n" +
                    			"My telephone number: " + phone + "\n" +
                    			"My college major is " + major);
			}
		}
}
		
