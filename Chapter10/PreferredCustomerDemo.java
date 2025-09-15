//Hung Anh Ho
//11-20-2022
//PreferredCustomer demo

public class PreferredCustomerDemo 
{
	public void main(String[] args)
	{
		Customer customer = new Customer(Input.getString("\nPerson:\nEnter your name: "), 
				Input.getString("Enter your address: "),
				Input.getString("Enter your phone number: "),  
				Input.getInteger("Enter your customer's number: "), 
				Input.getString("Do you what to enlist on mailing? "));
		PreferredCustomer preferred = new PreferredCustomer(customer, 2500);
		
		System.out.println(preferred);
	}
}
