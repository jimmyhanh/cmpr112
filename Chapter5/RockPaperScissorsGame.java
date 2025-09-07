//Hung Anh Ho
//10-14-2022
//Rock paper scissor game

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGame 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		char Answer;
		do
		{
			do
			{
				//Get computer random hand
				int computerHand = randomNumber();
				
				//Get user's hand
				int userHand = getUserHand();
				
				//Display computer's hand before validate
				System.out.println("The computer chooses " + RockPaperScissor(computerHand)+ ".");
				
				//Validate
				//If both input chose the same replay
				if (userHand == computerHand)
		        {
		            System.out.println("Both make the same choice. It is a draw. Play again.\n");
		            continue;
		        }
				
				//When input are diffrent
				else
					getWinner(userHand, computerHand);
				
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
				
		} while (true);
	}

	/**
	 * randomNumber method generate random number from 1 to 3 and return the number-integer type
	 * @return number-integer type
	 */
	public static int randomNumber()
	{
		Random rand = new Random();
		int number = rand.nextInt(4)+1;
		return number;
	}

	
	/**
	 * RockPaperScissor method get the input number from 1-3 and return the string according to 1 (rock), 2 (paper), 3 (scissors)
	 * @param computerHand- hold variable input of random number-integer type
	 * @return the string according to the number-string type
	 */
	public static String RockPaperScissor(int computerHand)
	{
		String hand = null;
		
		if (computerHand == 1)
		{
			hand = "rock";
		}
		
		else if (computerHand == 2)
		{
			hand = "paper";
		}
		
		else if (computerHand == 3)
		{
			hand = "scissors";
		}
		
		return hand;		
		
	}
	
	
	/**
	 * getUserHand method displays the menu choices for the user to type in the right string or the according number and return the userHand-interger type
	 * @return userHand-integer type
	 */
	public static int getUserHand()
	{
		int userHand;
		String userInput;
		do
		{
			userInput = Input.getString("User menu:\n"
											+ "1. For rock\n"
											+ "2. For paper\n"
											+ "3. For scissors\n"
											+ "Enter your choice: ");
			userInput = userInput.toLowerCase();
			

			if (userInput.equals("1") || userInput.equals("rock"))
			{
				return userHand = 1;
			}
			
			else if (userInput.equals("2") || userInput.equals("paper"))
			{
				return userHand = 2;
			}
			
			else if (userInput.equals("3") ||userInput.equals("scissors"))
			{
				return userHand = 3;
			}
			
			else
			{
				System.out.println("Error input. Try again.");
				continue;
			}
			
		} while(true);
	}

	
	/**
	 * getWinner method validate the user's hand and computer hand to find out and display the winner
	 * @param userHand-integer type
	 * @param computerHand-integer type
	 * Display the winner
	 */
	public static void getWinner( int userHand, int computerHand) 
    {
	        if ( userHand == 1 && computerHand == 2) 
	        {
	            System.out.println("Paper wraps rock. The computer wins!\n");
	        }
	        
	        else if ( userHand == 1 && computerHand == 3) 
	        {
	            System.out.println("Rock smashes scissors. The user wins!\n");
	        }
	        
	        else if ( userHand == 2 && computerHand == 1) 
	        {
	            System.out.println("Paper wraps rock. The user wins!\n");
	        }
	        
	        else if ( userHand == 2 && computerHand == 3) 
	        {
	            System.out.println("Scissors cuts paper. The computer wins!\n");
	        }
	        
	        else if (userHand == 3 && computerHand == 1) 
	        {
	            System.out.println("Rock smashes scissors. The computer wins!\n");
	        }
	        
	        else if (userHand == 3 && computerHand == 2) 
	        {
	            System.out.println("Scissors cuts paper. The user wins!\n");
	        }
    }
}
