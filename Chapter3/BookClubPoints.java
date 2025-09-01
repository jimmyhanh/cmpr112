//Hung Anh Ho
//9-16-2022
//Book club points
import java.util.Scanner;
public class BookClubPoints 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Number of books input
		int BooksPurchase;
		System.out.print("Enter the number of books purchased: ");
		BooksPurchase = keyboard.nextInt();
		keyboard.nextLine();
		
		
		//Point sort by the number of books purchased
		int PointsEarned = 0;
		if(BooksPurchase == 0)
			PointsEarned = 0;
		else if(BooksPurchase == 1)
			PointsEarned = 5;
		else if(BooksPurchase == 2)
			PointsEarned = 15;
		else if(BooksPurchase == 3)
			PointsEarned = 30;
		else if(BooksPurchase >= 4)
			PointsEarned = 60;
		else
		{
			System.out.println("Error! Invalid input " + BooksPurchase);
			return;
		}
		
		//Display
		System.out.println("You have earned " + PointsEarned + " point(s) with the purchase of " + BooksPurchase + " book(s) this month.");
		
	}
}
