//Hung Anh Ho
//11-7-2022
//Room carpet

public class RoomCarpet 
{
	private RoomDimension size;
    private double carpetCost;
    
    /**
     * RoomCarpet constructor 
     * @param newRoom-object
     * @param newCost-double type
     */
    public RoomCarpet(RoomDimension newRoom, double newCost)
	{
    	this.size = newRoom;
    	this.carpetCost = newCost;
	}

    /**
     * getSize getter method
     * @return size-of the object in feet-double type
     */
	public RoomDimension getSize() 
	{
		return size;
	}
	
	/**
	 * setSize mutator method
	 * @param newSize
	 */
	public void setSize(RoomDimension newSize)
	{
		size = newSize;
	}
	
	/**
	 * getCarpetCost getter method
	 * @return carpet cost - double type
	 */
	public double getCarpetCost() 
	{
		return carpetCost;
	}
	
	/**
	 * setCarpetCost mutator for tcarpet cost
	 * @param newCost-double type
	 */
	public void setCarpetCost(double newCost) 
	{
		carpetCost = newCost;
	}
	
	/**
	 * getTotalCost return total cost in square foot of the carpet
	 * @return
	 */
	public double getTotalCost()
	{
		return (size.getArea()/100) * carpetCost;
	}
	
	/**
	 * Return string format
	 */
	public String toString() 
	{
		String temp = String.format("\nRoom Carpet: \nCarpet cost: $%.2f(per square foot)\nTotal cost: $%.2f", carpetCost, getTotalCost());
		return temp;
    }
}
