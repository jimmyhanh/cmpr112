// Hung Anh Ho
// 9-4-2022
// Male and female percentages
import java.util.Scanner;
public class MaleFemalePercentages 
{
	public static void main(String[] args) 
	{
        Scanner keyboard = new Scanner(System.in);
        
        //User input and store variables
        System.out.print("Please eneter number of males in the class: ");
        int males = keyboard.nextInt();
        
        System.out.print("Please enter number of females int the class: ");
        int females = keyboard.nextInt();
        
        //Calculating total and percentage of each gender
        double total = (double) males + females;
        double malesPercentage = males / total * 100;
        double femalesPercentage = females / total * 100;
        
        //Display
        System.out.printf("\nThe percentage of males in class is: %.2f", malesPercentage);
        System.out.print("%");
        System.out.printf("\nThe percentage of females in class is: %.2f", femalesPercentage);
        System.out.print("%");
	}
}
