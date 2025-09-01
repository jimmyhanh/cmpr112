//Hung Anh Ho
//9-15-2022
//Sorting names
import java.util.Scanner;
public class SortedNames 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Variable input
		String Name1 = null;
		System.out.print("Enter the first name: ");
		Name1 = keyboard.nextLine();
		
		String Name2 = null;
		System.out.print("Enter the second name: ");
		Name2 = keyboard.nextLine();
		
		String Name3 = null;
		System.out.print("Enter the third name: ");
		Name3 = keyboard.nextLine();
		
		/*Comparing names using "compareTo" notes
		 *  If positive or > 0 --The current vatriable is greater than the other
		 *  If equal or = 0    --The two variables are equal
		 *  if negative or < 0 --The current vatriable is smaller than the other
		 *  Method "compareTo" turn strings in to unicode which have number,
		 *  the alphabet range from the smallest number to the largests. 
		 */
		
	    if((Name1.compareTo(Name2) < 0) && (Name1.compareTo(Name3) < 0))
        {
        System.out.println(Name1);
            if (Name2.compareTo(Name3) < 0)
            {
                System.out.println(Name2);
                System.out.println(Name3);
            }
            else
            {
                System.out.println(Name3);
                System.out.println(Name2);
            }
        }       
    else if((Name1.compareTo(Name2) > 0) && (Name2.compareTo(Name3) < 0))
        {
        System.out.println(Name2);
            if (Name1.compareTo(Name3) < 0)
            {
                System.out.println(Name1);
                System.out.println(Name3);
            }
            else
            {
                System.out.println(Name3);
                System.out.println(Name1);
            }
        }
    else 
        {
        System.out.println(Name3);
            if (Name1.compareTo(Name2) < 0)
            {
                System.out.println(Name1);
                System.out.println(Name2);
            }
            else
            {
                System.out.println(Name2);
                System.out.println(Name1);
            }
        }
	}
}
