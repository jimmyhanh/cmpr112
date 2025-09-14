//Hung Anh Ho
//11-4-2022
//Sum of numbers in a string

public class SumOfNumbersInAString 
{
	public static void main(String[] args) 
	{
		String input = Input.getString("Enter a string of numbers seperated by commas: ");
		
		System.out.printf("\nTotal sum of the numbers given: %d", sumStringNumbers(input));
	}
	
	/**
	 * sumStringNumbers method get string input and sum the total of numbers in 
	 * @param input - String type
	 * @return total - sum of numbers in the string - Integer type
	 */
	public static int sumStringNumbers(String input)
	{
		String array[] = input.split(",");
		
		int total = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (!array[i].trim().matches("^\\d+$"))
			{
				System.out.println("Error input" + array[i] + ". Try again.");
				break;
			}	
			
			else
			{
				total += Double.parseDouble(array[i].trim());
			}
					
		}
		
		return total;
	}
}
