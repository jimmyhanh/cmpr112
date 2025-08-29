// Hung Anh Ho
// 9-4-2022
// Name and Initials
public class NameInitials 
{
	public static void main(String[] arg)
	{
		String firstName="Anh", middleName="Hung", lastName="Ho";
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.print("Hello my name is " + firstName + " " +
                          middleName + " " + lastName + "\n");
        System.out.print("and my initials are " + firstInitial + "." +
                          middleInitial + "." + lastInitial + ".\n");
	}
}
