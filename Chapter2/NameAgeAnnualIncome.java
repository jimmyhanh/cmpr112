// Hung Anh Ho
// 9-4-2022
// Name, age, and annual Income
import java.util.Scanner;
public class NameAgeAnnualIncome
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User input and store variables
		System.out.print("What is your name?");
		String name = keyboard.nextLine();
		
		System.out.print("What is your age?");
		int age = keyboard.nextInt();
		
		System.out.print("What is your desired annual pay?");
		double annualPay = keyboard.nextDouble();
		
		System.out.print("My name is " + name +
						", my age is " + age + " and \n"
						+ "I hope to earn $" + annualPay + " per year.");
	}
}
