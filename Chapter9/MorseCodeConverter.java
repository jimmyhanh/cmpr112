//Hung Anh Ho
//11-4-2022
//Morse code converter

import java.util.Scanner;
public class MorseCodeConverter 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//English letters and punctuations
		char[] English = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                 			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                 			'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                 			',', '.', '?', ' '};
		//Morse code
		String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
        		 			".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
        		 			"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        		 			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        		 			"-----", "--..--", ".-.-.-", "..--..", "space"};
         
        //Get user input
		System.out.println("Welcome to Morse code converter: ");
		
		char Answer;
		do
		{
			String input = Input.getString("Enter a string to convert to Morse code: ");
	         
			//Convert to Morse code
			System.out.println("Traslated: " + toMorseCode(input, English, Morse));
		
	        do
			{
				System.out.print("\nContinue (Y-yes or N-no)? ");
				Answer = keyboard.nextLine().toUpperCase().charAt(0);
					
				if (Answer == 'Y')
					break;
					
				else
				{
					if (Answer == 'N')
						break;
						
					else
						System.out.printf("\nERROR: invalid choice %s\n", Answer);
						continue;
				}
			 } while (Answer != 'Y' || Answer != 'N');
				
					
			if (Answer == 'Y') 
				continue;
				
			else if (Answer == 'N')
				break;
				
			else
				continue;
		
		} while(true);
		
		keyboard.close();
	}
	
	/**
	 * toMorseCode method get the input String convert it into Morse code and return the code-String type
	 * @param input-String type
	 * @param English-char type array
	 * @param Morse-String type array
	 * @return answer-String converted to Morse code-String type
	 */
	public static String toMorseCode(String input, char[] English, String[] Morse)
	{
		char[] characters = input.toLowerCase().toCharArray();
		
		String answer = "";
        for(int i = 0; i < characters.length; i++)
        {
            for(int j = 0; j < English.length; j++) 
            {
            	//Check if the character exist and equal to Morse code
                if(English[j] == characters[i])
                {
                    answer = answer + Morse[j] + " ";
                }
            }
        }
        
		return answer;
	}
}
