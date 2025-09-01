//Hung Anh Ho
//9-15-2022
//Software sales
import java.util.Scanner;
public class SoftwareSales 
{
	public static void main(String[] args)
	{
		java.util.Scanner keyboard = new Scanner(System.in);
		
		int RetailPrice = 99;
		
		//User's input
		int Quantity;
		System.out.print("Enter the number of packages purchase: ");
		Quantity = keyboard.nextInt();
		keyboard.nextLine();
		
		
		//Discounts
		double Discount = 0.0;
		if(Quantity >= 10 && Quantity <= 19)
			Discount = 0.2;
		else if(Quantity >= 20 && Quantity <= 49)
			Discount = 0.3;
		else if(Quantity >= 50 && Quantity <= 99)
			Discount = 0.4;
		else if(Quantity >= 100)
			Discount = 0.5;
		else
			System.out.println("Error! Invalid number. Terminating the program.");
		
		
		//Total amount of the purchase
		double Total;
		Total = RetailPrice * Quantity - (RetailPrice * Quantity * Discount);
		
		
		//Convert discount number to discount percentage
		int DiscountPercent = (int) (Discount * 100);
		System.out.println("You have ordered " + Quantity + " item(s) which give you a discount of " + DiscountPercent + "%.");
		System.out.printf("The total amount of the purchase cost after the discount is $%.2f.\n", Total);
	}
}
