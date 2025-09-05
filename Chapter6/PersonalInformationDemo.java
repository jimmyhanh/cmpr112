//Hung Anh Ho
//11-7-2022
//Personal information demo

public class PersonalInformationDemo 
{
	public static void main(String[] args)
    {
		PersonalInformation self    = new PersonalInformation("Hung Anh Ho", "12691 Morningside", 23, "6574319415");
        PersonalInformation mom   = new PersonalInformation("Vu Anh Thi Tran", "12691 Morningside", 51, "6574338536");
        PersonalInformation sister = new PersonalInformation("Tue Truc Ho", "321 Dusty Road", 16, "0983753545");
        
        //Display
        System.out.println(self);
        System.out.println(mom);
        System.out.println(sister);
        
        //Display a new person
        PersonalInformation person = new PersonalInformation(Input.getString("\nEnter person's name: "),
        													Input.getString("\nEnter the person's address: "), 
        													Input.getInteger("\nEnter the person's age: ", true),
        													Input.getString("\nEnter the person's phone number: "));
        //Display
        System.out.println(person);
    }
}
