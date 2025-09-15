//Hung Anh Ho
//11-14-2022
//TeamLeader class

public class TeamLeader extends ProductionWorker 
{
	private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;
    
    /**
     * Non argumant constructor
     */
    public TeamLeader()
	{
    	super();
    	monthlyBonus = 0.0;
    	requiredTrainingHours = 0;
    	attendedTrainingHours = 0;
	}

    /**
     * Constructor
     * @param monthlyBonus-double type
     * @param requiredTrainingHours-integer type
     * @param attendedTrainingHours-integer type
     */
	public TeamLeader(double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours)
	{
		super();
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
	}

	/**
	 * Constructor
	 * @param Worker-ProductionWorker object
	 * @param shift-integer type
	 * @param hourlyPayRate-double type
	 * @param monthlyBonus-double type
	 * @param requiredTrainingHours-integer type
	 * @param attendedTrainingHours-integer type
	 */
    public TeamLeader(ProductionWorker Worker, int shift, double hourlyPayRate, double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours)
    {
    	this.setName(Worker.getName());
    	this.setNumber(Worker.getNumber());
    	this.setHireDate(Worker.getHireDate());
    	this.monthlyBonus = monthlyBonus;
    	this.requiredTrainingHours = requiredTrainingHours;
    	this.attendedTrainingHours = attendedTrainingHours;
    }
    
    /**
     * Constructer
     * @param leader
     * @param monthlyBonus
     * @param requiredTrainingHours
     * @param attendedTrainingHours
     */
    public TeamLeader(ProductionWorker leader, double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours)
    {
    	this.setName(leader.getName());
    	this.setNumber(leader.getNumber());
    	this.setHireDate(leader.getHireDate());
    	this.monthlyBonus = monthlyBonus;
    	this.requiredTrainingHours = requiredTrainingHours;
    	this.attendedTrainingHours = attendedTrainingHours;
    }
    
    /**
     * setMonthlyBonus mutator
     * @param monthlyBonus-double type
     */
    public void setMonthlyBonus(double monthlyBonus) 
    {
    	this.monthlyBonus = monthlyBonus;
    }
    
    /**
     * getMonthlyBonus getter
     * @return  monthlyBonus-double type
     */
    public double getMonthlyBonus() 
    {
    	return monthlyBonus;
    }
    
    /**
     * setRequiredTrainingHours mutator
     * @param requiredTrainingHours-integer type
     */
    public void setRequiredTrainingHours(int requiredTrainingHours) 
    {
    	this.requiredTrainingHours = requiredTrainingHours;
    }
    
    /**
     * getRequiredTrainingHours getter
     * @return requiredTrainingHours-integer type
     */
    public int getRequiredTrainingHours() 
    {
    	return requiredTrainingHours;
    }
    
    /**
     * setAttendedTrainingHours mutator
     * @param attendedTrainingHours-integer type
     */
    public void setAttendedTrainingHours(int attendedTrainingHours) 
    {
    	this.attendedTrainingHours = attendedTrainingHours;
    }
    
    /**
     * getAttendedTrainingHours getter
     * @return attendedTrainingHours-integer type
     */
    public int getAttendedTrainingHours() 
    {
    	return attendedTrainingHours;
    }
    
    /**
     * Return String format
     */
    public String toString()
    {
    	String temp = String.format("Employee\nName: %s", getName());
    	temp += String.format("\nEmployee Number: %s", getNumber());
    	temp += String.format("\n\nProduction Worker");
    	temp += String.format("\nShift: %s",(getShift() == 1 ? "Day Shift" : "Night Shift"));
    	temp += String.format("\nHourly Pay Rate: %.2f", getHourlyPayRate());
    	temp += String.format("\n\nTeam Leader");
    	temp += String.format("\nMonthly Bonus: %.2f", getMonthlyBonus());
    	temp += String.format("\nRequired Training Hours: %d", getRequiredTrainingHours());
    	temp += String.format("\nAttended Training Hours: %d", getAttendedTrainingHours());
    	return temp;
    }
}
