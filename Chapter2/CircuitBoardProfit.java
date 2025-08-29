// Hung Anh Ho
// 9-5-2022
// Circuit board profits
import java.util.Scanner;
public class CircuitBoardProfit 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User's input
		System.out.print("Please enter your retail price: $");
		double RetailPrice = keyboard.nextDouble();
		
		//Profit calculation
		double ProfitPercentage = 0.4;
		double Profit = RetailPrice * ProfitPercentage;
		
		//display results
		System.out.println("From selling the product at $" +
							RetailPrice + ", you have earned $" + 
							Profit + " in profit per circuit board.");
		
	}
}
