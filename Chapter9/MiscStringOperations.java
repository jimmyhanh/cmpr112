//Hung Anh Ho
//11-2-2022
//Miscellaneous string operations

public class MiscStringOperations 
{
	public static void main(String[] args)
	{
		//String to count
		String toCount = Input.getString("Enter a string to count (Example : the dog jumped over the fence): ");
		
		//String to convert
		String input = Input.getString("Enter your name to turn into array: ");
        char[] toConvert = input.toCharArray();
        
        //Display word count from string
        System.out.println("\nThere are " + WordCount(toCount) + " words in the first string.");
        
        //Diplay array
        System.out.print("Array reads: ");
        
        for (int i = 0; i < toConvert.length; i++)
        {   	
        	if(i == (toConvert.length - 1))
        	{
        		System.out.print(toConvert[i] + ".");
        	}
        	
        	else
        	{
        		System.out.print(toConvert[i] + ", ");
        	}
        }
        
        //Display array to string, most frequent character from string and replace string method
        System.out.println("\nThe converted back to string reads: " + arrayToString(toConvert));
        System.out.println("The most frequent character: " + "'"+ mostFrequent(toCount) + "'" );
        System.out.println("The replaced string reads: " + replaceSubstring(toCount, "the", "that"));

	}

	
	/**
     * The method wordCount returns the number of words that appear in the string passed-String type
     * @param input-String type
     * @return The count of words that appear in the string
     */
    public static int WordCount(String input) 
    {
    	//initialize
        int count = 0;

        //First replace all other word delimiters that appear in
        //the string with spaces and then split it into words
        input = input.replaceAll("[!?,]", " "); // first replace all other word delimiters
        String[] tokens = input.trim().split(" ");

        for(String token : tokens) 
        {
            if(token.length() > 0)
                count++;
        }

        return count;
    }


    /**
     * arrayToString method use String builder to rebuild string using characters in an array and return the string-String type
     * @param toConvert
     * @return
     */
    public static String arrayToString(char[] toConvert)
    {
        StringBuffer result = new StringBuffer("");

        for(char c : toConvert)
            result.append(c);

        return result.toString();
    }


    /**
     * The method mostFrequent returns the character that appears most frequently
     * @param input-String type
     * @return the character appear most-char type
     */
    public static char mostFrequent(String input)
    {
    	//COnvert to array of characters
        char[] array = input.toCharArray();
        
        char mostFrequent = array[0];
        int max = 0;
        int count = 0;

        for(int i=0; i < array.length; i++)
        {
            count++;
            
            for(int j=0; j < array.length; j++)
            {
                if(i!=j) 
                {
                    if(array[i] == array[j])
                        count++;
                }

                if(count > max) 
                {
                    max = count;
                    mostFrequent = array[i];
                }
            }
        }

        return mostFrequent;
    }


    /**
     * replaceSubstring method replaces occurrences of string2 in string1 with string3 return the string-String type
     * @param string1-The starting string-String type
     * @param string2-The substring to replace-String type
     * @param string3-The substring to replace with-String type
     * @return result-String type
     */
    public static String replaceSubstring(String string1, String string2, String string3)
    {
        StringBuffer result = new StringBuffer(string1);

        int str2_len = string2.length();
        int str3_len = string3.length();

        // look for the first instance of string2 in string1
        int indexOf3 = string1.indexOf(string2);

        for(int i = 0;indexOf3 > -1 && i < result.length(); i++)
        {
            // replace string2 with string3
            result.replace(indexOf3, indexOf3 + str2_len, string3);

            // look for another occurrence of string2 after the added substring
            i += str3_len;
            
            if(i < result.length())
                indexOf3 = result.indexOf(string2, i);
        }

        return result.toString();
    }
}
