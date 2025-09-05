//Hung Anh Ho
//11-5-2022
//Coin demo

public class CoinDemo 
{

	public static void main(String[] args) 
	{
		// Create an instance of the Coin class.
		Coin coin = new Coin();
		
		// Display initial toss
		System.out.println("The side initially facing up: " + coin.getSideUp());
		
		// Toss the coin 20 times.
		int tossesNumber = 20;
		System.out.println("Now I will toss the coin " + tossesNumber + " times.");
		
		//Tosses the coin 20 times, keep track of number of heads and tails
		int headCount = 0;
		int tailsCount = 0;
		for (int i = 0; i < tossesNumber; i++) 
		{		
			// Toss the coin.
			coin.toss();
			
			// Display the side facing up.
			System.out.println("Toss:   " + coin.getSideUp());
			
			if (coin.getSideUp().equals("heads"))
				headCount++;
			
			else
				tailsCount++;
		}
		
		//Display
		System.out.println("Heads facing up: " + headCount);
		System.out.println("Tails facing up: " + tailsCount);
	}
}
