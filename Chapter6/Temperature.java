//Hung Anh Ho
//11-7-2022
//Tempurature

public class Temperature 
{
	private double fahrenheit;
	
	/**
	 * Constructor get the new Fahrenheit
	 * @param newFahrenheit-double type
	 */
	public Temperature(double newFahrenheit)
	{
		fahrenheit = newFahrenheit;
	}
	
	/**
	 * setFahrenheit fahrenheit mutator 
	 * @param newFahrenheit-double type
	 */
	public void setFahrenheit(double newFahrenheit)
	{
		fahrenheit = newFahrenheit;
	}
	
	/**
	 * getFahrenheit access the fahrenheit value
	 * @return fahrenheit-double type
	 */
	public double getFahrenheit()
	{
		return fahrenheit;
	}
	
	/**
	 * getClesius convert Fahrenheit to Celsius
	 * @return Celsius value- Double type
	 */
	public double getCelsius()
	{
		return ((double)5/9*(fahrenheit-32));
	}
	
	/**
	 * getKelvin convert Fahrenheit to Kelvin
	 * @return Kelvin value-Double type
	 */
	public double getKelvin()
	{
		return (((double) 5/9 * (fahrenheit - 32)) + 273);
	}
	
	/**
	 * toString method return String format-String type
	 * @return String format-String type
	 */
	public String toString()
	{
		String temp = String.format("\nThe temperature in Fahrenheit: %.2f\nThe temperature in Celsius: %.2f\nThe temperature in Kelvin: %.2f\n", getFahrenheit(), getCelsius(), getKelvin());
		return temp;
	}
}
