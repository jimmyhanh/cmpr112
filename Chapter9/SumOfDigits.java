//Hung Anh Ho
//10-31-2022
//Sum of digits

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		String input = Input.getString("\nEnter" + " a series of single digits: ");
		int sum = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if ( Character.isDigit(input.charAt(i)))
			{
				sum += Character.getNumericValue(input.charAt(i));
			}
		}
		
		//Display 
		System.out.printf("\nSum of the numbers given: %d", sum);
	}

}
