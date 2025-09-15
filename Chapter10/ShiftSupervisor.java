//Hung Anh Ho
//11-15-2022
//ShiftSupervisor

public class ShiftSupervisor extends Employee 
{
	private double annualSalary;
    private double annualProductionBonus;
    
    /**
     * No argument constructor
     */
    public ShiftSupervisor()
    {
        super();
        annualSalary = 0.0;
        annualProductionBonus = 0.0;
    }

    /**
     * Constructor
     * @param annualSalary - double type
     * @param annualProductionBonus - double type
     */
    public ShiftSupervisor(double annualSalary, double annualProductionBonus)
    {
        super();
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    /**
     * Constructor 
     * @param supervisor - Employee object
     * @param annualSalary - double type
     * @param annualProductionBonus - double type
     */
    public ShiftSupervisor(Employee supervisor, double annualSalary, double annualProductionBonus)
    {
    	this.setName(supervisor.getName());
		this.setNumber(supervisor.getNumber());
		this.setHireDate(supervisor.getHireDate());
		
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }
    
    /**
     * setAnnualSalary mutator
     * @param annualSalary-Double type
     */
    public void setAnnualSalary(double annualSalary) 
    {
        this.annualSalary = annualSalary;
    }
    
    /**
     * getAnnualSalary getter
     * @return annualSalary
     */
    public double getAnnualSalary() 
    {
        return annualSalary;
    }
    
    /**
     * setAnnualProductionBonus mutator
     * @param annualProductionBonus-double type
     */
    public void setAnnualProductionBonus(double annualProductionBonus) 
    {
        this.annualProductionBonus = annualProductionBonus;
    }
    
    /**
     * getAnnualProductionBonus getter
     * @return annualProductionBonus-double type
     */
    public double getAnnualProductionBonus() 
    {
        return annualProductionBonus;
    }
    
    /**
     * return String format
     */
    public String toString()
    {
    	String temp =  String.format("\nShift Supervisor: \nName     : %s\nNumber   : %s\nHire Date: %s\nAnnual Salary: $%.2f\nAnnnual Production Bonus: $%.2f", getName(), getNumber(), getHireDate(), getAnnualSalary(), getAnnualProductionBonus());
		return temp;
    }
}
