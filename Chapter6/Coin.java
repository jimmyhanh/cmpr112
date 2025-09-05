//Hung Anh Ho
//11-8-2022
//Coin class

import java.util.Random;
public class Coin 
{
	private String sideUp;

    /**
     * No argument constructor
     */
    public Coin() 
    {
    	toss();
    }

    /**
     *toss method will simulate the tossing of a coin
     * assign sideUp field to either "heads" or "tails".
     */
    public void toss() 
    {

        Random rand = new Random();

        // Get a random value, 0 or 1.
        int value = rand.nextInt(2);

        if (value == 0) 
        {
        	this.sideUp = "heads";
        } 
        
        else 
        {
        	this.sideUp = "tails";
        }
    }

    /**
     *getSideUp return the side that is face up
     *@return The side of the coin facing up.
     */
    public String getSideUp() 
    {
    	return sideUp;
    }
}
