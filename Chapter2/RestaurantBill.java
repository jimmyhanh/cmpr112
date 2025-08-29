// Hung Anh Ho
// 9-5-2022
// Restaurant bill
import java.util.Scanner;
public class RestaurantBill 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		//User input
		System.out.print("Please enter your charge for the meal: $");
		double charge = keyboard.nextDouble();
		keyboard.nextLine();
		
		//Variables declare
		double tax = 0.0675;
		double tips = 0.2;
		
		//Calculating amount of tax, tips and total bill
		double taxAmount = charge*tax;
		double totalNoTips = charge + taxAmount;
		double tipsAmount = totalNoTips * tips;
		
		double totalBill = totalNoTips + tipsAmount;
		
		//Display
		System.out.printf("Your meal charge is:    $%.2f\n", charge);
		System.out.printf("Your tax charge is:     $%.2f\n", taxAmount);
		System.out.printf("Your tips charge is:    $%.2f\n", tipsAmount);
		System.out.printf("Total for your bill is: $%.2f\n", totalBill);
	}
}