//Hung Anh Ho
//11-20-2022
//ProductionWorker class

public class ProductionWorker extends Employee 
{
	private int shift;
	private double hourlyPayRate;		

	/**
	 *No argument constructor
	 */
	public ProductionWorker()
	{
		super();				// must call the base/super class constructor
		shift = 0;
		hourlyPayRate = 0.0;
	}
	
	/**
	 * Constructor
	 * @param emp-employee object
	 * @param newShift-integer type
	 * @param newHourlyPayRate-double type
	 */
	public ProductionWorker(Employee emp, int newShift, double newHourlyPayRate)
	{
		// setting the new Employee
		this.setName(emp.getName());
		this.setNumber(emp.getNumber());
		this.setHireDate(emp.getHireDate());
		
		this.shift = newShift;
		this.hourlyPayRate = newHourlyPayRate;
	}
	
	/**
	 * setShift mutator
	 * @param newShift-integer type
	 */
	public void setShift(int newShift)
	{
		this.shift = newShift;
	}
	
	/**
	 * Shift getter
	 * @return shift-integer type
	 */
	public int getShift()
	{
		return shift;
	}
	
	/**
	 * setHourlyPayRate mutator
	 * @param newHourlyPayRate-integer type
	 */
	public void setHourlyPayRate(int newHourlyPayRate)
	{
		this.hourlyPayRate = newHourlyPayRate;
	}
	
	/**
	 * getHourlyPayRate return hourly pay-Double type
	 * @return hourlyPayRate
	 */
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	/**
	 * Return string format
	 */
	public String toString()
	{
		String temp = "";
		temp += super.toString();
		temp += String.format("Shift: %s\n", (getShift() == 1 ? "Day Shift" : "Night Shift"));
		temp += String.format("Hourly pay rate : %.2f\n", getHourlyPayRate());
		return temp;
	}
}
