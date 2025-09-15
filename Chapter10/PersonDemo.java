//Hung Anh Ho
//11-15-2022
//Person demo

public class PersonDemo 
{
	public static void main(String[] args)
	{
		Person person = new Person(Input.getString("\nPerson:\nEnter your name: "), 
				Input.getString("Enter your address: "),
				Input.getString("Enter your phone number: "));
		System.out.println(person);
	}
}
