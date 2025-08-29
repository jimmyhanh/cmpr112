// Hung Anh Ho
// 9-6-2022
// Word game
import java.util.Scanner;
public class WordGame 
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		//User's input
		System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        
        System.out.print("Please enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Please enter your city: ");
        city = keyboard.nextLine();
        
        System.out.print("Please enter your college: ");
        college = keyboard.nextLine();
        
        System.out.print("Please enter a profession: ");
        profession = keyboard.nextLine();
        
        System.out.print("Please enter a type of animal: ");
        animal = keyboard.nextLine();
        
        System.out.print("Please enter a pet's name: ");
        petName = keyboard.nextLine();
        
        //Display
        System.out.println("There once was a person named " + name + " who lived in " + city +
        					".\nAt the age of " + age + ", " + name + " went to college at " + college + ". " +
        					name + " graduated and went to work as a " + profession + ". \nThen, " +
        					name + " adopted a(n) " + animal + " named " + petName + 
        					". They both lived happily ever after!");
	}
}
