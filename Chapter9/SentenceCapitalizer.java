//Hung Anh HO
//11-1-2022
//Sentence capitalizer

public class SentenceCapitalizer 
{
	public static void main(String[] args) 
	{
		//Ask user for input
		String input = Input.getString("Enter a string here: ");
		String result = getStringCapitalize(input);
		System.out.println(result);
	}
	
	/**
	 * getStringCapitalize method check string input for punctuation marks, 
	 * capitalize the first letter of the next sentence and return the string-String type
	 * @param input-String type
	 * @return result-String type-Capitalized
	 */
	public static String getStringCapitalize(String input)
	{
		boolean capitalize = true;
		StringBuilder result = new StringBuilder(input);
		for (int i = 0; i < result.length(); i++) 
		{
			//If the letter is after a punctuation marks
			if (result.charAt(i) == '.' || result.charAt(i) == '!' 
				|| result.charAt(i) == '?' || result.charAt(i) == ';' 
				|| result.charAt(i) == '.'+'.'+'.')//Took me awhile to figured out for the ...
			{
				capitalize = true;
			}
			
			//Capitalize the first letter of the first sentence because there is no white space
			else if (capitalize && !Character.isWhitespace(result.charAt(i))) 
			{
				result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
				capitalize = false;
			}
		}
		
		//Convert result to string
		return result.toString();
	}
}
