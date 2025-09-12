//Hung Anh HO
//11-14-2022
//Month demo

public class MonthDemo 
{
	public static void main(String[] args)
    {

        //Test month 1
		Month month_1 = new Month(Input.getString("Enter the name of the first month: "));
        
        //Test month 2
		Month month_2 = new Month(Input.getString("Enter the name of the second month: "));
        
        //Testmonth 3
		Month month_3 = new Month(Input.getInteger("Enter the number of the third month: "));

		System.out.println("The names of the months:");
		System.out.println(month_1);
		System.out.println(month_2);
		System.out.println(month_3);
        
        //Test cases
		if(month_1.equals(month_2))
			System.out.println("\nMonth 1 is the same as month 2");
		else
			System.out.println("\nMonth 1 is not the same as month 2");

		if(month_2.greaterThan(month_3))
        	System.out.println("\nMonth 2 is after month 3");
        else
        	System.out.println("\nMonth 2 is not after month 3");

		if(month_3.lessThan(month_1))
            System.out.println("\nMonth 3 is before month 1");
		else
			System.out.println("\nMonth 3 is not before month 1");

    }
}
