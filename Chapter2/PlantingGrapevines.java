// Hung Anh Ho
// 9-6-2022
// Planting grapevines
import java.util.Scanner;
public class PlantingGrapevines 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please eneter of the length of the row (in feet): ");
		// R is length of the row in feet
		double R = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("Please eneter the amount of space used by end-post assembly (in feet): ");
        // E is the amount of space used by end-post assembly in feet
        double E = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("Please eneter the amount of space between the vines (in feet): ");
        // S is the amount of space between the vines in feet
        double S = keyboard.nextDouble();
        keyboard.nextLine();
        
        //Formula for V as the number of grapevines can fit in a row
        int V = (int)((R - 2*E) / S); //Convert to integer as we don't plant half to be a tree 
        
        //Display
        System.out.print("The number of grapevines will fit in the row is " + V);
	}
}
