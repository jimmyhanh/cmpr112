//Hung Anh Ho
//10-31-2022
//VowelsAndConsonants

public class VowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		
		String input = Input.getString("Enter a string input: ");
		
		do
		{
			System.out.println("\nVowels and Consonants");
			System.out.println("-----------------------------");
			System.out.println("A. Count the number of vowels");
			System.out.println("B. Count the number of consonants");
			System.out.println("C. Count the both number of vowels and consonants");
			System.out.println("D. Enter another string");
			System.out.println("X. exit");
	
			switch(Input.getChar("\nOption: ", "ABCDEFX"))
			{
				//Terminate program
				case 'X': 			
					System.exit(0);
					
				//Get vowels count
				case 'A': 	
					System.out.printf("\nVowels: %d\n", getNumberOfVowels(input)); 
					break;
					
				//Get consonants count
				case 'B': 					
					System.out.printf("\nConsonants: %d\n", getNumberOfConsonants(input)); 
					break;
					
				//Get both
				case 'C': 	
					System.out.printf("\nVowels and Consonants: %d\n", getNumberOfVowels(input)+ getNumberOfConsonants(input)); break;
					
				//Enter another string
				case 'D' : 
					input = Input.getString("\nEnter a string input: "); 
					break;
						
				default: 
					System.out.printf("\nERROR: Invalid option\n");
			}		
			
		} while (true);
		
	}
	
	/**
	 * getNumberOfVowels method count the number of vowels and return the count-Integer type
	 * get the number of vowels (A, E, I , O, or U) from the input string
	 * @param input-String type
	 * @return count-interger type
	 */
	public static int getNumberOfVowels(String input)
	{
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++)
		{
			switch(Character.toUpperCase(input.charAt(i)))
			{
				case 'A', 'E' , 'I', 'O',  'U':
					count++;
			}
		}
			
		return count;
	}
	
	/**
	 * getNumberOfConsonants method count the number of consonants and return the count-integer type
	 * @param input-string type
	 * @return count-integer type
	 */
	public static int getNumberOfConsonants(String input)
	{
		int count = 0;
		
		for (int i = 0; i < input.length(); i++)
		{
			char ch = Character.toUpperCase(input.charAt(i));
			
			if (Character.isAlphabetic(ch))
				switch(Character.toUpperCase(input.charAt(i)))
				{
					case 'A', 'E' , 'I', 'O',  'U': break;
					default: count++; 
				}
		}
			
		return count;
	}
}
