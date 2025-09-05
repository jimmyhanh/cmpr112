//Hung Anh Ho
//11-7-2022
//Tempurature demo

public class TempuratureDemo 
{
	public static void main(String[] args) 
	{
		double fahrenheit;	// Holds temp in Fahrenheit
		fahrenheit = Input.getDouble("Enter a Fahrenheit temperature: ");
		
		//Create object and pass in input
		Temperature temp = new Temperature(fahrenheit);		
		temp.setFahrenheit(fahrenheit);
		
		//Display
		System.out.println(temp);
	}
}
