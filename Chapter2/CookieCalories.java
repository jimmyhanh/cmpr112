// Hung Anh Ho
// 9-4-2022
// Calories of cookies
import java.util.Scanner;
public class CookieCalories 
{
	public static void main(String[] args) 
	{
        int CookiesNumber = 40, BagServing = 10;
		double CaloriesperServing = 300, CaloriesPerCookie, TotalCalories;
		int CookiesConsumed;
        Scanner keyboard = new Scanner(System.in);
        
        //Find Calories of a cookie
        int CookiesPerServing = CookiesNumber / BagServing;
        CaloriesPerCookie = CaloriesperServing / CookiesPerServing;    

        //User input for cookies eaten
        System.out.print("Please enter the number of cookies you have eaten: ");
        CookiesConsumed = keyboard.nextInt();
        
        //Total calories consumed
        TotalCalories = CookiesConsumed * CookiesConsumed;
        //Use print format to display only 2 floating decimals
        System.out.printf("Total calories you have consumed: %.2f Calories \n", TotalCalories);
	}
}
