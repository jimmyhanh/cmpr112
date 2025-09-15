//Hung Anh Ho
//11-20-2022
//Customer demo

public class CustomerDemo 
{
	public static void main(String[] args)
	{
		Customer customer = new Customer(Input.getString("\nPerson:\nEnter your name: "), 
											Input.getString("Enter your address: "),
											Input.getString("Enter your phone number: "),  
											Input.getInteger("Enter your customer's number: "), 
											Input.getString("Do you what to enlist on mailing? "));
		System.out.println(customer);
	}
}
