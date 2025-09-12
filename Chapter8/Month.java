//Hung Anh Ho
//11-14-2022
//Month class

public class Month 
{
	private int monthNumber;
    private String[] monthNames = {"Unknown", "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    /**
     * No argument constructor set month number to one
     */
    public Month() 
    {
        monthNumber = 1;
    }
    
    /**
     * Month constructor for validate month range
     * @param monthNumber-Integer type
     */
    public Month(int monthNumber)
    {
        if(monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else
            this.monthNumber = monthNumber;
    }
    
    /**
     * Month constructor accept string to get the value
     * @param monthName-String type
     */
    public Month(String monthName) 
    {
    	if(monthName.matches("\\d+"))
    	{
    		int Number = Integer.parseInt(monthName);
    		
    		if(Number < 1 || Number > 12)
                this.monthNumber = 1;
            else
                this.monthNumber = Number;
    	}
    	
    	else
    	{
	        for (int i = 0; i < monthNames.length; i++) 
	        {
	            if (monthName.equals(monthNames[i])) 
	            {
	                monthNumber = i;
	                return;
	            }
	        }
	        
	        // If the name has been entered incorrectly use the default value
	        monthNumber = 1;
    	}
    }
    
    /**
     * setMonthNumber mutator for month number
     * @param monthNumber
     */
    public void setMonthNumber(int monthNumber) 
    {
        if( monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else
            this.monthNumber = monthNumber;
    }
    
    /**
     * getMonthNumber getter method
     * @return monthNumber-Integer type
     */
    public int getMonthNumber() 
    {
        return monthNumber;
    }
    
    /**
     * getNonthName getter method 
     * @return
     */
    public String getMonthName()
    {
        return monthNames[monthNumber];
    }
    
    /**
     * equals method check the month object return true or false
     * @param object2
     * @return true or false
     */
    public boolean equals(Month object2)
    {
        if(monthNumber == object2.monthNumber)
        	return true;
        else
        	return false;
    }
    
    /**
     * greaterThan method check the month object return true or false 
     * @param object2
     * @return 
     */
    public boolean greaterThan(Month object2)
    {
    	if(monthNumber > object2.monthNumber)
        	return true;
        else
        	return false;
    }
    
    /**
     * lessThan method check the month object return true or false
     * @param object2
     * @return true or false
     */
    public boolean lessThan(Month object2)
    {
    	if(monthNumber < object2.monthNumber)
        	return true;
        else
        	return false;
    }
    
    /**
     * toString return string format
     */
    public String toString()
    {
    	String temp = String.format("\nMonth name: %s", getMonthName());
		return temp;
    }
}
