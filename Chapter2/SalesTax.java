// Hung Anh Ho
// 9-4-2022
// Sales tax
import java.util.Scanner;
public class SalesTax 
{
    public static void main(String[] args) 
    {
    	Scanner keyboard = new Scanner(System.in);
    	
    	//Variable declare
        double countySalesTaxValue = 0.02;
        double stateSalesTaxValue = 0.04;
        
        double purchasePrice, total;

        System.out.print("Please enter the amount of the purchase: $");
        purchasePrice = keyboard.nextDouble();
        
        //Calculation to find the total, taxes of the state and from the county
        total = purchasePrice + (purchasePrice*countySalesTaxValue) + (purchasePrice*stateSalesTaxValue);
        double StateTax = purchasePrice*stateSalesTaxValue;
        double CountyTax = purchasePrice*countySalesTaxValue;
        double TotalTax = StateTax + CountyTax;
        
        //Convert back to percentage
        double countySalesTax = countySalesTaxValue * 100;
        double stateSalesTax = stateSalesTaxValue * 100;
        //Display
        System.out.println("Price of purchase: $" + purchasePrice);
        System.out.println("State sales tax (" + stateSalesTax + "%) due:  $" + StateTax);
        System.out.println("County sales tax (" + countySalesTax +"%) due: $" + CountyTax);
        System.out.println("Total of sales tax: $" + TotalTax);
        System.out.println("Total amount due: $" + total);
        
    }
}