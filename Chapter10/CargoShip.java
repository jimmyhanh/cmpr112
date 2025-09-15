//Hung Anh Ho
//11-22-2022
//CargoShip class

public class CargoShip extends Ship 
{
	private int tonnage;
	
	/**
	 * Constructor
	 * @param newName-String type
	 * @param newYear-String type
	 * @param newTonnage-integer type
	 */
    public CargoShip(String newName, String newYear, int newTonnage)
    {
        super(newName, newYear);
        this.tonnage = newTonnage;
    }
    
    /**
     * setCargoCapacity mutator
     * @param newTonnage-
     */
    public void setCargoCapacity(int newTonnage)
    {
        this.tonnage = newTonnage;
    }
    
    /**
     * getCargoCapacity getter
     * @return tonnage
     */
    public int getCargoCapacity()
    {
        return tonnage;
    }
    
    /**
     * Return to string format
     */
    public String toString()
    {
        return super.toString() + String.format("\nTonnage: " + getCargoCapacity());
    }
}
