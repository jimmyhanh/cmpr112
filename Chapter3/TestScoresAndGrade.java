	//Hung Anh Ho
//9-14-2022
//Test scores and grade 
import java.util.Scanner;
public class TestScoresAndGrade 
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//User's input for 3 test scores
		System.out.print("Please enter your first test score (1...100): ");
		float FirstTest = keyboard.nextFloat();
		keyboard.nextLine();
		
		System.out.print("Please enter your second test score (1...100): ");
		float SecondTest = keyboard.nextFloat();
		keyboard.nextLine();
		
		System.out.print("Please enter your third test score (1...100): ");
		float ThirdTest = keyboard.nextFloat();
		keyboard.nextLine();
		
		
		//Calculating average score
		float AverageScore = (FirstTest + SecondTest + ThirdTest)/ 3;
		AverageScore = Math.round(AverageScore);
		
		
		//Grade sorting
		String LetterGrade = null;
		if(AverageScore >= 90)
			LetterGrade = "A";
		else if(AverageScore >= 80 && AverageScore < 90)
			LetterGrade = "B";
		else if(AverageScore >= 70 && AverageScore < 80)
			LetterGrade = "C";
		else if(AverageScore >= 60 && AverageScore < 70)
			LetterGrade = "D";
		else if(AverageScore < 60)
			LetterGrade = "F";
		else
		{
		System.out.println("Error! Invalid score. Terminate the program.");
		return;
		}
		
		
		//Display
		System.out.println("Your test scores are: \n" +
							"1. " + FirstTest + "\n" +
							"2. " + SecondTest + "\n" +
							"3. " + ThirdTest + "\n");
		System.out.println("Your average test score is " + AverageScore + " and you get a grade " + LetterGrade + ".");
	}
}
