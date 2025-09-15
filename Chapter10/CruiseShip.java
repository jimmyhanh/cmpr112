//Hung Anh Ho
//11-22-2022
//CruiseShip class

public class CruiseShip extends Ship
{
	int maxPassengers;
	
	/**
	 * Constructor
	 * @param newName-String type
	 * @param newYear-String type
	 * @param newMaxPassengers-Integer type
	 */
    public CruiseShip(String newName, String newYear, int newMaxPassengers)
    {
        super(newName, newYear);
        maxPassengers = newMaxPassengers;
    }
    
    /**
     * Constructor
     * @param newShip-Ship object 
     * @param newMaxPassengers-Integer type
     */
    public CruiseShip(Ship newShip, int newMaxPassengers)
    {
        this.setShipName(newShip.getShipName());
        this.setYearBuilt(newShip.getYearBuilt());
        maxPassengers = newMaxPassengers;
    }
    
    /**
     * setNumPassengers mutator
     * @param newMaxPassengers-Integer type
     */
    public void setNumPassengers(int newMaxPassengers)
    {
        this.maxPassengers = newMaxPassengers;
    }
    
    /**
     * getNumPassengers getter
     * @return maxPassengers-integer type
     */
    public int getNumPassengers()
    {
        return this.maxPassengers;
    }
    
    /**
     * Return to string format
     */
    public String toString()
    {
        return super.toString()+ "\nNumber passengers: " + getNumPassengers();
    }
}
