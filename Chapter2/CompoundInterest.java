// Hung Anh Ho
// 9-6-2022
// Compound interest
import java.util.Scanner;
public class CompoundInterest 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Variable declare
		double A; // A is the amount of money in account after a specified number of years.
		int P; 	  // P is the principal amount that originally deposited into account.
		double r; // r is the annual interest rate.
		int n;    // n is the number of times per year that the interest is compound.
		int t;    // t is specified number of years.
		
		//User input
		System.out.print("Please enter the amount of principal was originally deposited to account: $");
        P = keyboard.nextInt();
        keyboard.nextLine();
        
        //Raw input for r or annual interest rate to covert later
        System.out.print("Please enter the annual interest (percent) paid by the account: ");
        double rRaw = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("(For example monthly is 12, and quarterly is 4.) \n" + 
        				 "Please enter the number of times per year the interest is compounded: ");
        n = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Please enter the amount of years, account will be left to earn interest: ");
        t = keyboard.nextInt();
        keyboard.nextLine();
        
        //Convert percent
        r = rRaw / 100;
		//Calculate with formula
        A = P * Math.pow(1 + (r / n), n * t);
        
        //Display
        System.out.println("The amount of money will be in the account after " + t + " years is $"+ A);
	}
}
