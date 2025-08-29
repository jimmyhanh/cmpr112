// Hung Anh Ho
// 9-5-2022
// String manipulator
import java.util.Scanner;
public class StringManipulator
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		//User input and variable declare for favorite city
		System.out.print("Please enter your favorite city name: ");
		String FavoriteCity = keyboard.nextLine();
		
		//String manipulate
		String CityUpper = FavoriteCity.toUpperCase();
		String CityLower = FavoriteCity.toLowerCase();
		char FirstLetter = FavoriteCity.charAt(0);
		
		//Display
		System.out.println(FavoriteCity);
		System.out.println(CityUpper);
		System.out.println(CityLower);
		System.out.println(FirstLetter);
	}
}
