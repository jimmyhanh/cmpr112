// Hung Anh Ho
// 9-4-2022
// Miles per gallon
import java.util.Scanner;
public class MilesPerGallon 
{
	public static void main(String[] args) 
	{
        double milesDriven, gallonsUsed, MPG;
        try(Scanner keyboard = new Scanner(System.in))//"try" was suggested by the program to close the scanner
        {
        System.out.print("Please enter the number of miles driven: ");
        milesDriven = keyboard.nextDouble();

        System.out.print("Please enter the amount of gallons of gas used: ");
        gallonsUsed = keyboard.nextDouble();
        //Experimenting math class rounding floating point at 2 decimals
        MPG = (double) Math.round((((milesDriven) / gallonsUsed)*100)/100);

        System.out.print("Your car runs at " + MPG + " Miles per Gallon");
        }
	}
}
