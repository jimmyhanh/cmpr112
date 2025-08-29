// Hung Anh Ho
// 9-6-2022
// Ingredient adjuster
import java.util.Scanner;
public class IngredientAdjuster 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Ingredients variable declare
		double sugarCups = 1.5, butterCups = 1, flourCups = 2.75;
		double Number_of_cookies_regular = 48;
		
		double sugarCups_Measurement;
	    double butterCups_Measurement;
	    double flourCups_Measurement;
		
	    //User input
		System.out.print("Please enter the number of cookies you want to make: ");
		int UserCookiesNumber = keyboard.nextInt();
		
		//Calculating expecting amount of ingredients
		sugarCups_Measurement = ( UserCookiesNumber / Number_of_cookies_regular ) * sugarCups;
		butterCups_Measurement = ( UserCookiesNumber / Number_of_cookies_regular ) * butterCups;
		flourCups_Measurement = ( UserCookiesNumber / Number_of_cookies_regular ) * flourCups;
		
		//display print format to display only 2 floating decimals
		System.out.printf( "You will need %.2f cups of sugar, ", sugarCups_Measurement);
		System.out.printf("%.2f cups of butter, and ", butterCups_Measurement);
		System.out.printf( "%.2f cups of flour.", sugarCups_Measurement);
	}
}
