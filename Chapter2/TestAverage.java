// Hung Anh Ho
// 9-5-2022
// Test score average
import java.util.Scanner;
public class TestAverage 
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User's input for 3 test scores
		System.out.println("Please enter your first test score:");
		float FirstTest = keyboard.nextFloat();
		
		System.out.println("Please enter your second test score:");
		float SecondTest = keyboard.nextFloat();
		
		System.out.println("Please enter your third test score:");
		float ThirdTest = keyboard.nextFloat();
		
		//Calculating average score
		float AverageScore = (FirstTest + SecondTest + ThirdTest)/ 3;
		
		//Display
		System.out.println("Your test score are: \n" +
							"1. " + FirstTest + "\n" +
							"2. " + SecondTest + "\n" +
							"3. " + ThirdTest + "\n");
		System.out.printf("Your average test score is %.1f", AverageScore);
		
	}
}
